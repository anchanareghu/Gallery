package com.example.sample;

import android.view.View;
import android.widget.TextView;

public class TwoOnClick implements View.OnClickListener {
    TextView textView;

    public TwoOnClick(TextView textView) {
        this.textView = textView;
    }

    @Override
    public void onClick(View v) {
        String existingString = textView.getText().toString();
        String newString = existingString.concat("2");
        textView.setText(newString);
    }
}
