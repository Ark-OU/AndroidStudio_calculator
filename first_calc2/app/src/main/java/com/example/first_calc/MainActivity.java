package com.example.first_calc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    //vars.
    double input = 0, Ans = 0;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView texAns = findViewById(R.id.texAns);
        final TextView sign = findViewById(R.id.sign);

        //ボタン定義.
        final Button num00, num0, num1, num2, num3, num4, num5, num6, num7, num8, num9,
                ac, div, add, sub, mul, equal;
        num00 = findViewById(R.id.num00);
        num0 = findViewById(R.id.num0);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        num3 = findViewById(R.id.num3);
        num4 = findViewById(R.id.num4);
        num5 = findViewById(R.id.num5);
        num6 = findViewById(R.id.num6);
        num7 = findViewById(R.id.num7);
        num8 = findViewById(R.id.num8);
        num9 = findViewById(R.id.num9);
        ac = findViewById(R.id.ac);
        div = findViewById(R.id.div);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        equal = findViewById(R.id.equal);


        /**
         * num0とnum00の関数はまとめたいなー
         * "文字数が超過しています."←こういったワードは変数にして使いまわしたほうがいい（理由：文章変更の際に漏れがなくなる、翻訳つくるときとかも楽等）
         * 入力時のチェックは1~9でも使ってるから工夫したほうがいいなー
         * 1000000000って判断基準でいっぱい使われてるから、クラスの一番最初で　const で定義したほうがいいな。　作ってる最中に桁が1つ減ったら全部かえなあかん。
         * あと今回の場合やとtmp使わんほうがスムーズかな
         * 例）if (input + 3 > 1000000000) 
         * tmpは二つを入れ替えるときに効果的やったはず
         */

        //クリックの挙動.
        num00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double tmp = input;
                tmp *= 100;
                if (tmp > 1000000000) {
                    Toast toast = Toast.makeText(MainActivity.this, "文字数が超過しています.", Toast.LENGTH_SHORT);
                    toast.show();
                } else {
                    input = tmp;
                    texAns.setText(String.valueOf(input));
                }
            }
        });

        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double tmp = input;
                tmp *= 10;
                if (tmp > 1000000000) {
                    Toast toast = Toast.makeText(MainActivity.this, "文字数が超過しています.", Toast.LENGTH_SHORT);
                    toast.show();
                } else {
                    input = tmp;
                    texAns.setText(String.valueOf(input));
                }
            }
        });

        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double tmp = input;
                tmp *= 10;
                tmp += 1;
                if (tmp > 1000000000) {
                    Toast toast = Toast.makeText(MainActivity.this, "文字数が超過しています.", Toast.LENGTH_SHORT);
                    toast.show();
                } else {
                    input = tmp;
                    texAns.setText(String.valueOf(input));
                }
            }
        });

        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double tmp = input;
                tmp *= 10;
                tmp += 2;
                if (tmp > 1000000000) {
                    Toast toast = Toast.makeText(MainActivity.this, "文字数が超過しています.", Toast.LENGTH_SHORT);
                    toast.show();
                } else {
                    input = tmp;
                    texAns.setText(String.valueOf(input));
                }
            }
        });

        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double tmp = input;
                tmp *= 10;
                tmp += 3;
                if (tmp > 1000000000) {
                    Toast toast = Toast.makeText(MainActivity.this, "文字数が超過しています.", Toast.LENGTH_SHORT);
                    toast.show();
                } else {
                    input = tmp;
                    texAns.setText(String.valueOf(input));
                }
            }
        });

        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double tmp = input;
                tmp *= 10;
                tmp += 4;
                if (tmp > 1000000000) {
                    Toast toast = Toast.makeText(MainActivity.this, "文字数が超過しています.", Toast.LENGTH_SHORT);
                    toast.show();
                } else {
                    input = tmp;
                    texAns.setText(String.valueOf(input));
                }
            }
        });

        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double tmp = input;
                tmp *= 10;
                tmp += 5;
                if (tmp > 1000000000) {
                    Toast toast = Toast.makeText(MainActivity.this, "文字数が超過しています.", Toast.LENGTH_SHORT);
                    toast.show();
                } else {
                    input = tmp;
                    texAns.setText(String.valueOf(input));
                }
            }
        });

        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double tmp = input;
                tmp *= 10;
                tmp += 6;
                if (tmp > 1000000000) {
                    Toast toast = Toast.makeText(MainActivity.this, "文字数が超過しています.", Toast.LENGTH_SHORT);
                    toast.show();
                } else {
                    input = tmp;
                    texAns.setText(String.valueOf(input));
                }
            }
        });

        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double tmp = input;
                tmp *= 10;
                tmp += 7;
                if (tmp > 1000000000) {
                    Toast toast = Toast.makeText(MainActivity.this, "文字数が超過しています.", Toast.LENGTH_SHORT);
                    toast.show();
                } else {
                    input = tmp;
                    texAns.setText(String.valueOf(input));
                }
            }
        });

        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double tmp = input;
                tmp *= 10;
                tmp += 8;
                if (tmp > 1000000000) {
                    Toast toast = Toast.makeText(MainActivity.this, "文字数が超過しています.", Toast.LENGTH_SHORT);
                    toast.show();
                } else {
                    input = tmp;
                    texAns.setText(String.valueOf(input));
                }
            }
        });

        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double tmp = input;
                tmp *= 10;
                tmp += 9;
                if (tmp > 1000000000) {
                    Toast toast = Toast.makeText(MainActivity.this, "文字数が超過しています.", Toast.LENGTH_SHORT);
                    toast.show();
                } else {
                    input = tmp;
                    texAns.setText(String.valueOf(input));
                }
            }
        });

        /**
         * '+'とかも変数のほうがいいなー　配列でもいいかも　0 == addとかで
         * 同じこと書きすぎやから、アルゴリズム変えたほうがいいな、
         * 例えば
         * 1　何か記号が押されたときに計算する
         * 2　計算結果が妥当かどうかを判断する
         * 3　押された記号を登録する
         * 
         * 1～3の関数をつくってそれぞれのボタン処理で呼び出す感じ
         */
        add.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (input != 0) {
                    if (sign.getText().toString() == "+") {
                        Ans = Ans + input;
                        texAns.setText(String.valueOf(Ans));
                        sign.setText("+");
                    }
                    if (sign.getText().toString() == "-") {
                        Ans = Ans - input;
                        texAns.setText(String.valueOf(Ans));
                        sign.setText("+");
                    } else if (sign.getText().toString() == "×") {
                        Ans = Ans * input;
                        texAns.setText(String.valueOf(Ans));
                        sign.setText("+");
                    } else if (sign.getText().toString() == "÷") {
                        if (texAns.getText().toString() != "0") {
                            Ans = Ans / input;
                            texAns.setText(String.valueOf(Ans));
                            sign.setText("+");
                        } else {
                            Toast toast = Toast.makeText(MainActivity.this, "定義されていません.ACを押してやり直してください.", Toast.LENGTH_SHORT);
                            toast.show();
                        }
                    } else {
                        Ans = input;
                        texAns.setText(String.valueOf(Ans));
                        sign.setText("+");
                    }
                    input = 0;
                } else {
                    sign.setText("+");
                }
                if (Ans > 1e9) {
                    Ans = 0;
                    input = 0;
                    texAns.setText("0");
                    sign.setText("");
                    Toast toast = Toast.makeText(MainActivity.this, "Error: Over Flow.", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (input != 0) {
                    if (sign.getText().toString() == "+") {
                        Ans = Ans + input;
                        texAns.setText(String.valueOf(Ans));
                        sign.setText("-");
                    }
                    if (sign.getText().toString() == "-") {
                        Ans = Ans - input;
                        texAns.setText(String.valueOf(Ans));
                        sign.setText("-");
                    } else if (sign.getText().toString() == "×") {
                        Ans = Ans * input;
                        texAns.setText(String.valueOf(Ans));
                        sign.setText("-");
                    } else if (sign.getText().toString() == "÷") {
                        if (texAns.getText().toString() != "0") {
                            Ans = Ans / input;
                            texAns.setText(String.valueOf(Ans));
                            sign.setText("-");
                        } else {
                            Toast toast = Toast.makeText(MainActivity.this, "定義されていません", Toast.LENGTH_SHORT);
                            toast.show();
                        }
                    } else {
                        Ans = input;
                        texAns.setText(String.valueOf(Ans));
                        sign.setText("-");
                    }
                    input = 0;
                } else {
                    sign.setText("-");
                }
                if (Ans > 1e9) {
                    Ans = 0;
                    input = 0;
                    texAns.setText("0");
                    sign.setText("");
                    Toast toast = Toast.makeText(MainActivity.this, "Error: Over Flow.", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (input != 0) {
                    if (sign.getText().toString() == "+") {
                        Ans = Ans + input;
                        texAns.setText(String.valueOf(Ans));
                        sign.setText("×");
                    }
                    if (sign.getText().toString() == "-") {
                        Ans = Ans - input;
                        texAns.setText(String.valueOf(Ans));
                        sign.setText("×");
                    } else if (sign.getText().toString() == "×") {
                        Ans = Ans * input;
                        texAns.setText(String.valueOf(Ans));
                        sign.setText("×");
                    } else if (sign.getText().toString() == "÷") {
                        if (texAns.getText().toString() != "0") {
                            Ans = Ans / input;
                            texAns.setText(String.valueOf(Ans));
                            sign.setText("×");
                        } else {
                            Toast toast = Toast.makeText(MainActivity.this, "定義されていません", Toast.LENGTH_SHORT);
                            toast.show();
                        }
                    } else {
                        Ans = input;
                        texAns.setText(String.valueOf(Ans));
                        sign.setText("×");
                    }
                    input = 0;
                } else {
                    sign.setText("×");
                }
                if (Ans > 1e9) {
                    Ans = 0;
                    input = 0;
                    texAns.setText("0");
                    sign.setText("");
                    Toast toast = Toast.makeText(MainActivity.this, "Error: Over Flow.", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (input != 0) {
                    if (sign.getText().toString() == "+") {
                        Ans = Ans + input;
                        texAns.setText(String.valueOf(Ans));
                        sign.setText("÷");
                    }
                    if (sign.getText().toString() == "-") {
                        Ans = Ans - input;
                        texAns.setText(String.valueOf(Ans));
                        sign.setText("÷");
                    } else if (sign.getText().toString() == "×") {
                        Ans = Ans * input;
                        texAns.setText(String.valueOf(Ans));
                        sign.setText("÷");
                    } else if (sign.getText().toString() == "÷") {
                        if (texAns.getText().toString() != "0") {
                            Ans = Ans / input;
                            texAns.setText(String.valueOf(Ans));
                            sign.setText("÷");
                        } else {
                            Toast toast = Toast.makeText(MainActivity.this, "定義されていません", Toast.LENGTH_SHORT);
                            toast.show();
                        }
                    } else {
                        Ans = input;
                        texAns.setText(String.valueOf(Ans));
                        sign.setText("÷");
                    }
                    input = 0;
                } else {
                    sign.setText("÷");
                }
                if (Ans > 1e9) {
                    Ans = 0;
                    input = 0;
                    texAns.setText("0");
                    sign.setText("");
                    Toast toast = Toast.makeText(MainActivity.this, "Error: Over Flow.", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (sign.getText().toString() == "+") {
                    Ans = Ans + input;
                    texAns.setText(String.valueOf(Ans));
                } else if (sign.getText().toString() == "-") {
                    Ans = Ans - input;
                    texAns.setText(String.valueOf(Ans));
                } else if (sign.getText().toString() == "×") {
                    Ans = Ans * input;
                    texAns.setText(String.valueOf(Ans));
                } else if (sign.getText().toString() == "÷") {
                    if (input == 0) {
                        Toast toast = Toast.makeText(MainActivity.this, "定義されていません", Toast.LENGTH_SHORT);
                        toast.show();
                    }
                    Ans = Ans / input;
                    texAns.setText(String.valueOf(Ans));
                } else {
                    texAns.setText(String.valueOf(Ans));
                }
                if(Ans>1e9){
                    Ans=0;
                    input = 0;
                    texAns.setText("0");
                    sign.setText("");
                    Toast toast = Toast.makeText(MainActivity.this, "Error: Over Flow.", Toast.LENGTH_SHORT);
                    toast.show();
                }
                sign.setText("");
                input = 0;
            }
        });

        ac.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Ans = 0;
                input = 0;
                texAns.setText("0");
                sign.setText("");
            }
        });
    }
}
