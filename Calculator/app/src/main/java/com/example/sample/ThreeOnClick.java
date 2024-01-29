package com.example.sample;

import android.view.View;
import android.widget.TextView;

public class ThreeOnClick implements View.OnClickListener {
    TextView textView;

    public ThreeOnClick(TextView textView) {
        this.textView = textView;
    }

    @Override
    public void onClick(View v) {
        String existingString = textView.getText().toString();
        String newString = existingString.concat("3");
        textView.setText(newString);
    }
}
