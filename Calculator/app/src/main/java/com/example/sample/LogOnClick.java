package com.example.sample;

import android.view.View;
import android.widget.TextView;

public class LogOnClick implements View.OnClickListener {
    TextView textView;

    public LogOnClick(TextView textView) {
        this.textView = textView;
    }

    @Override
    public void onClick(View v) {
        String existingString = textView.getText().toString();
        String newString = existingString.concat("log(");
        textView.setText(newString);
    }

}
