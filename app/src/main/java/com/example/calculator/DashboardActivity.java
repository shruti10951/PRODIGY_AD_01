package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class DashboardActivity extends AppCompatActivity {

    String currentSymbol;
    Double firstIp, secondIp, answer;
    ImageButton back_btn, divide_btn, multiply_btn, minus_btn, add_btn, percent_btn, equal_btn;
    TextView answer_txt, one_txt, two_txt, three_txt, four_txt, five_txt, six_txt, seven_txt, eight_txt, nine_txt, zero_txt, ac_txt, decimal_point_txt, prev_txt, sign_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        back_btn = findViewById(R.id.back);
        divide_btn = findViewById(R.id.divide);
        multiply_btn = findViewById(R.id.multiply);
        minus_btn = findViewById(R.id.minus);
        add_btn = findViewById(R.id.add);
        percent_btn = findViewById(R.id.percent);
        equal_btn = findViewById(R.id.equal);

        answer_txt = findViewById(R.id.ans_tv);
        one_txt = findViewById(R.id.one_txt);
        two_txt = findViewById(R.id.two_txt);
        three_txt = findViewById(R.id.three_txt);
        four_txt = findViewById(R.id.four_txt);
        five_txt = findViewById(R.id.five_txt);
        six_txt = findViewById(R.id.six_txt);
        seven_txt = findViewById(R.id.seven_txt);
        eight_txt = findViewById(R.id.eight_txt);
        nine_txt = findViewById(R.id.nine_txt);
        zero_txt = findViewById(R.id.zero_txt);
        prev_txt = findViewById(R.id.prev_tv);

        ac_txt = findViewById(R.id.ac);
        decimal_point_txt = findViewById(R.id.point_txt);
        sign_txt = findViewById(R.id.sign_tv);

        one_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer_txt.setText(answer_txt.getText() + "1");
            }
        });

        two_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer_txt.setText(answer_txt.getText() + "2");
            }
        });

        three_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer_txt.setText(answer_txt.getText() + "3");
            }
        });

        four_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer_txt.setText(answer_txt.getText() + "4");
            }
        });

        five_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer_txt.setText(answer_txt.getText() + "5");
            }
        });

        six_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer_txt.setText(answer_txt.getText() + "6");
            }
        });

        seven_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer_txt.setText(answer_txt.getText() + "7");
            }
        });

        eight_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer_txt.setText(answer_txt.getText() + "8");
            }
        });

        nine_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer_txt.setText(answer_txt.getText() + "9");
            }
        });

        zero_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer_txt.setText(answer_txt.getText() + "0");
            }
        });

        decimal_point_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer_txt.setText(answer_txt.getText() + ".");
            }
        });

        ac_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer_txt.setText("");
                prev_txt.setText("");
                sign_txt.setText("");
            }
        });

        add_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer_txt.getText().toString().equals("")) {
                    return;
                }
                currentSymbol = "ADDITION";
                firstIp = Double.parseDouble(answer_txt.getText() + "");
                prev_txt.setText(answer_txt.getText());
                sign_txt.setText("+");
                answer_txt.setText("");
            }
        });

        minus_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer_txt.getText().toString().equals("")) {
                    return;
                }
                currentSymbol = "SUBTRACTION";
                firstIp = Double.parseDouble(answer_txt.getText() + "");
                prev_txt.setText(answer_txt.getText());
                sign_txt.setText("-");
                answer_txt.setText("");
            }
        });

        multiply_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer_txt.getText().toString().equals("")) {
                    return;
                }
                currentSymbol = "MULTIPLICATION";
                firstIp = Double.parseDouble(answer_txt.getText() + "");
                prev_txt.setText(answer_txt.getText());
                sign_txt.setText("*");
                answer_txt.setText("");
            }
        });

        divide_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer_txt.getText().toString().equals("")) {
                    return;
                }
                currentSymbol = "DIVISION";
                firstIp = Double.parseDouble(answer_txt.getText() + "");
                prev_txt.setText(answer_txt.getText());
                sign_txt.setText("/");
                answer_txt.setText("");
            }
        });

        percent_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer_txt.getText().toString().equals("")) {
                    return;
                }
                firstIp = Double.parseDouble(answer_txt.getText() + "");
                answer = firstIp / 100;
                answer_txt.setText(answer + "");
            }
        });

        equal_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer_txt.getText().toString().equals("") || sign_txt.getText().toString().equals("")) {
                    return;
                }
                calculate();
            }
        });

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = answer_txt.getText() + "";
                if (str.length() > 1) {
                    str = str.substring(0, str.length() - 1);
                    answer_txt.setText(str);
                } else if (str.length() <= 1) {
                    answer_txt.setText("");
                }
            }
        });

    }

    private void calculate() {

        secondIp = Double.parseDouble(answer_txt.getText() + "");
        switch (currentSymbol) {
            case "ADDITION":
                answer = firstIp + secondIp;
                break;
            case "SUBTRACTION":
                answer = firstIp - secondIp;
                break;
            case "MULTIPLICATION":
                answer = firstIp * secondIp;
                break;
            case "DIVISION":
                answer = firstIp / secondIp;
                break;
        }

        answer_txt.setText(answer + "");
        prev_txt.setText("");
        sign_txt.setText("");

    }

}