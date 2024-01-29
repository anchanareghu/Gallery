package com.example.sample;

import android.view.View;
import android.widget.TextView;

public class InverseOnClick implements View.OnClickListener {
    TextView textView;
    public InverseOnClick(TextView textView) {
        this.textView = textView;
    }

    @Override
    public void onClick(View v) {

        String existingString = textView.getText().toString();
        String reciprocal = "1/";
        String newString = reciprocal.concat(existingString);
        textView.setText(newString);
    }
}

