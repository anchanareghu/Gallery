package com.example.sample;

import android.view.View;
import android.widget.TextView;

public class CosineOnClick implements View.OnClickListener {
    TextView textView;

    public CosineOnClick(TextView textView) {
        this.textView = textView;
    }

    @Override
    public void onClick(View v) {
        String existingString = textView.getText().toString();
        String newString = existingString.concat("cos(");
        textView.setText(newString);
    }
}
