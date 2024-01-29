package com.example.sample;

import android.view.View;
import android.widget.TextView;

public class NineOnClick implements View.OnClickListener {
    TextView textView;

    public NineOnClick(TextView textView) {
        this.textView = textView;
    }

    @Override
    public void onClick(View v) {
        String existingString = textView.getText().toString();
        String newString = existingString.concat("9");
        textView.setText(newString);
    }
}
