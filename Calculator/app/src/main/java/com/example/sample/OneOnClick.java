package com.example.sample;

import android.view.View;
import android.widget.TextView;

public class OneOnClick implements View.OnClickListener {
    TextView textView;

    public OneOnClick(TextView one) {
        this.textView = (TextView) one;
    }

    @Override
    public void onClick(View v) {
        String existingString = textView.getText().toString();
        String newString = existingString.concat("1");
        textView.setText(newString);
    }
}
