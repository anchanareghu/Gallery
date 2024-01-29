package com.example.sample;

import android.view.View;
import android.widget.TextView;

public class EightOnClick implements View.OnClickListener {
    TextView textView;

    public EightOnClick(TextView textView) {
        this.textView = (TextView) textView;
    }

    @Override
    public void onClick(View v) {
        String existingString = textView.getText().toString();
        String newString = existingString.concat("8");
        textView.setText(newString);
    }
}
