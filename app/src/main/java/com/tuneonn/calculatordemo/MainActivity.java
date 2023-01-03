package com.tuneonn.calculatordemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView ansdisp, solutiondisp;
    int i, j;
    double n, m, ans;
    String number;
    char symbol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ansdisp = findViewById(R.id.ansdisp);
        solutiondisp = findViewById(R.id.solutiondisp);
        i = 1;
        j = 1;
    }

    public void click(View view) {

        int tapped = Integer.parseInt(view.getTag().toString());


        if (tapped == 0 || tapped == 1 || tapped == 2 || tapped == 3 || tapped == 4 || tapped == 5 || tapped == 6 || tapped == 7 || tapped == 8 || tapped == 9) {
            if (i == 1) {
                number = String.valueOf(tapped);
                solutiondisp.setText(number);
                i++;
                m = tapped;
            } else {
                number = solutiondisp.getText().toString() + tapped;
                solutiondisp.setText(number);
                m = (m * 10) + tapped;
            }
        }

        switch (tapped){
            case 10:
                if (symbol == '+') {
                    ans = n + m;
                } else if (symbol == '-') {
                    ans = n - m;
                } else if (symbol == '×') {
                    ans = n * m;
                } else {
                    ans = n / m;
                }

                if (ans - (int) ans == 0) {
                    ansdisp.setText(String.valueOf(Math.round(ans)));
                } else {
                    ansdisp.setText(String.valueOf(ans));
                }
                break;

            case 11:
                if (j == 1) {
                    n = Double.parseDouble(solutiondisp.getText().toString());
                    j++;
                } else {
                    if (symbol == '+') {
                        n = n + m;
                    } else if (symbol == '-') {
                        n = n - m;
                    } else if (symbol == '×') {
                        n = n * m;
                    } else {
                        n = n / m;
                    }
                }
                symbol = '+';
                number = solutiondisp.getText().toString() + symbol;
                solutiondisp.setText(number);
                m = 0;
                break;

            case 12:
                if (j == 1) {
                    n = Double.parseDouble(solutiondisp.getText().toString());
                    j++;
                } else {
                    if (symbol == '+') {
                        n = n + m;
                    } else if (symbol == '-') {
                        n = n - m;
                    } else if (symbol == '×') {
                        n = n * m;
                    } else {
                        n = n / m;
                    }
                }
                symbol = '-';
                number = solutiondisp.getText().toString() + symbol;
                solutiondisp.setText(number);
                m = 0;
                break;

            case 13:
                if (j == 1) {
                    n = Double.parseDouble(solutiondisp.getText().toString());
                    j++;
                } else {
                    if (symbol == '+') {
                        n = n + m;
                    } else if (symbol == '-') {
                        n = n - m;
                    } else if (symbol == '×') {
                        n = n * m;
                    } else {
                        n = n / m;
                    }
                }
                symbol = '×';
                number = solutiondisp.getText().toString() + symbol;
                solutiondisp.setText(number);
                m = 0;
                break;

            case 14:
                if (j == 1) {
                    n = Double.parseDouble(solutiondisp.getText().toString());
                    j++;
                } else {
                    if (symbol == '+') {
                        n = n + m;
                    } else if (symbol == '-') {
                        n = n - m;
                    } else if (symbol == '×') {
                        n = n * m;
                    } else {
                        n = n / m;
                    }
                }
                symbol = '÷';
                number = solutiondisp.getText().toString() + symbol;
                solutiondisp.setText(number);
                m = 0;
                break;

            case 15:
                number = "";
                m = 0;
                i = 1;
                j = 1;
                solutiondisp.setText(number);
                ansdisp.setText(number);
                break;

            case 16:
                if (m != 0){
                    m = (int)m / 10;
                    number = number.substring(0,number.length()-1);
                    solutiondisp.setText(number);
                } else {
                    n = (int)n / 10;
                    number = number.substring(0,number.length()-1);
                    solutiondisp.setText(number);
                }
                break;

            case 17:
                number = solutiondisp.getText().toString() + ".";
                solutiondisp.setText(number);
                break;
        }

    }
}