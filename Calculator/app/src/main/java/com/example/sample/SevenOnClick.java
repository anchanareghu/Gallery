package com.example.sample;

import android.view.View;
import android.widget.TextView;

public class SevenOnClick implements View.OnClickListener {
    TextView textView;

    public SevenOnClick(TextView textView) {
        this.textView = textView;
    }

    @Override
    public void onClick(View v) {
        String existingString = textView.getText().toString();
        String newString = existingString.concat("7");
        textView.setText(newString);
    }
}
