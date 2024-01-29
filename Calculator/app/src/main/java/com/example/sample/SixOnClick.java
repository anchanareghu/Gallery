package com.example.sample;

import android.view.View;
import android.widget.TextView;

public class SixOnClick implements View.OnClickListener {
    TextView textView;

    public SixOnClick(TextView textView) {
        this.textView = textView;
    }

    @Override
    public void onClick(View v) {
        String existingString = textView.getText().toString();
        String newString = existingString.concat("6");
        textView.setText(newString);
    }
}
