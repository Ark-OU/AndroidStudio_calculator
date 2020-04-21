package com.example.first_calc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

public class MainActivity extends AppCompatActivity {
    //vars.
    double input = 0, Ans = 0;
    int PreSignText = 4;
    Boolean flag_error = false;

    final double overflow = 1e9;
    int[] n_ids = new int[] {R.id.num0, R.id.num1, R.id.num2, R.id.num3, R.id.num4, R.id.num5,
                        R.id.num6, R.id.num7, R.id.num8, R.id.num9, R.id.num00};
    int[] s_ids = new int[] {R.id.add, R.id.sub, R.id.mul, R.id.div, R.id.equal};
    Button[] num,sign;

    //Initialize
    void Initialize(TextView anstext, TextView signtext){
        input = 0;
        Ans = 0;
        PreSignText = 4;
        flag_error = false;
        anstext.setText("0.0");
        signtext.setText("=");
    }
    //error
    void error(){
        Toast toast = Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT);
        toast.show();
    }
    //NumFunc
    double PushButton(int x, TextView anstext, TextView signtext){
        double tmp = input;
        tmp *= 10;
        //x=10の時は"00"のボタンが押されたとき.
        if(x==10)
            tmp *= 10;
        else
            tmp += x;
        if (tmp > overflow) {
            tmp = 0;
            error();
            Initialize(anstext, signtext);
        }else
            input = tmp;
        return input;
    }
    //SignTextFunc
    void SignTextAns(int preSignText, TextView anstext, TextView signtext, int x){
        if(input==0 && preSignText==3){
            error();
            flag_error = true;
        }
        if (input != 0) {
            if (preSignText==0) {
                Ans = Ans + input;
            } else if (preSignText==1) {
                Ans = Ans - input;
            } else if (preSignText==2) {
                Ans = Ans * input;
            } else if (preSignText==3) {
                    Ans = Ans / input;
            } else {
                Ans = input;
            }
            anstext.setText(String.valueOf(Ans));
            input = 0;
        }
        if (Ans > overflow) {
            error();
            Initialize(anstext,signtext);
        }
        if(x == 0)signtext.setText("+");
        else if(x == 1)signtext.setText("-");
        else if(x == 2)signtext.setText("×");
        else if(x == 3)signtext.setText("÷");
        else signtext.setText("=");
        if(flag_error)Initialize(anstext,signtext);
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //const vars
        final TextView AnsText = findViewById(R.id.AnsText);
        final TextView SignText = findViewById(R.id.SignText);
        //Button settings.
        num = new Button[11];
        sign = new Button[5];
        for(int i=0; i<11; i++)
            num[i] = findViewById(n_ids[i]);
        for(int i=0; i<5; i++)
            sign[i] = findViewById(s_ids[i]);
        Button ac = findViewById(R.id.ac);

        //クリックの挙動.
        for(int i=0; i<11; i++){
            final int x = i;
            num[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    input = PushButton(x,AnsText,SignText);
                    AnsText.setText(String.valueOf(input));
                }
            });
        }
        for(int i=0; i<5; i++) {
            final int x = i;
            sign[i].setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    SignTextAns(PreSignText, AnsText, SignText, x);
                    PreSignText = x;
                }
            });
        }
        ac.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Initialize(AnsText,SignText);
                AnsText.setText("0.0");
                SignText.setText("=");
            }
        });
    }
}
