package com.example.sample;

import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EqualOnClick implements View.OnClickListener {
    TextView textView;

    public EqualOnClick(TextView textView) {
        this.textView = textView;
    }

    @Override
    public void onClick(View v) {

        String string = textView.getText().toString();

        if (string.contains("+")) {
            int i = string.indexOf("+");
            double num1 = Double.parseDouble(string.substring(0, i));
            double num2 = Double.parseDouble(string.substring(i + 1));
            double result = num1 + num2;
            textView.setText(result + "");
        }

        if (string.contains("-")) {
            int i = string.indexOf("-");
            double num1 = Double.parseDouble(string.substring(0, i));
            double num2 = Double.parseDouble(string.substring(i + 1));
            double result = num1 - num2;
            textView.setText(result + "");
        }

        if (string.contains("*")) {
            int i = string.indexOf("*");
            double num1 = Double.parseDouble(string.substring(0, i));
            double num2 = Double.parseDouble(string.substring(i + 1));
            double result = num1 * num2;
            textView.setText(result + "");
        }

        if (string.contains("/")) {
            int i = string.indexOf("/");
            double num1 = Double.parseDouble(string.substring(0, i));
            double num2 = Double.parseDouble(string.substring(i + 1));
            double result = num1 / num2;
            textView.setText(result + "");
        }
        if (string.contains("π")) {
            int i = string.indexOf("π");
            double num = Double.parseDouble(string.substring(0, i));
            double result = num * 3.14;
            textView.setText(result + "");
        }
        if (string.contains("sin")) {
            int i = string.indexOf("(");
            int j = string.indexOf(")");
            double num = Double.parseDouble(string.substring(i + 1, j));
            double result = Math.sin(num);
            textView.setText(result + "");
        }

        if (string.contains("cos")) {
            int i = string.indexOf("(");
            int j = string.indexOf(")");
            double num = Double.parseDouble(string.substring(i + 1, j));
            double result = Math.cos(num);
            textView.setText(result + "");
        }
        if (string.contains("tan")) {
            int i = string.indexOf("(");
            int j = string.indexOf(")");
            double num = Double.parseDouble(string.substring(i + 1, j));
            double result = Math.tan(num);
            textView.setText(result + "");
        }

        if (string.contains("log")) {
            int i = string.indexOf("(");
            int j = string.indexOf(")");
            double num = Double.parseDouble(string.substring(i + 1, j));
            double result = Math.log10(num);
            textView.setText(result + "");
        }
        if (string.contains("√")) {
            int i = string.indexOf("√");
            double num = Double.parseDouble(string.substring(i + 1));
            double result = Math.sqrt(num);
            textView.setText(result + "");
        }
        if (string.contains("!")) {
            int i = string.indexOf("!");
            double num = Double.parseDouble(string.substring(0, i));
            double factorial = 1;
            for (int j = 1; j <= num; j++) {
                factorial *= j;
            }
            textView.setText(factorial + "");
        }
        if (string.contains("1/")) {
            int i = string.indexOf("/");
            double num = Double.parseDouble(string.substring(i + 1));
            double result = 1 / num;
            textView.setText(result + "");
        }
        if (string.contains("^")) {
            int i = string.indexOf("^");
            double num = Double.parseDouble(string.substring(0,i));
            double result = num * num;
            textView.setText(result + "");
        }
    }
}
