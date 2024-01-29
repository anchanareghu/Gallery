package com.example.sample;

import android.view.View;
import android.widget.TextView;

public class BackSpaceOnClick implements View.OnClickListener {
    TextView textView;

    public BackSpaceOnClick(TextView textView) {
        this.textView = textView;
    }

    @Override
    public void onClick(View v) {
        String existingString = textView.getText().toString();
        String newString = existingString.substring(0, existingString.length() - 1);
        textView.setText(newString);
    }
}
