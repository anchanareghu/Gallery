package com.example.sample;

import android.view.View;
import android.widget.TextView;

public class ZerosOnClick implements View.OnClickListener {

    TextView textView;

    public ZerosOnClick(TextView textView) {
        this.textView = textView;
    }

    @Override
    public void onClick(View v) {
        String existingString = textView.getText().toString();
        String newString = existingString.concat("00");
        textView.setText(newString);

    }
}
