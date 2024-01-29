package com.example.sample;

import android.view.View;
import android.widget.TextView;

public class FiveOnClick implements View.OnClickListener {
    TextView textView;

    public FiveOnClick(TextView textView) {
        this.textView = textView;
    }

    @Override
    public void onClick(View v) {
        String existingString = textView.getText().toString();
        String newString = existingString.concat("5");
        textView.setText(newString);
    }
}
