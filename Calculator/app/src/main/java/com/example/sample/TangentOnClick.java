package com.example.sample;

import android.view.View;
import android.widget.TextView;

public class TangentOnClick implements View.OnClickListener {
    TextView textView;

    public TangentOnClick(TextView textView) {
        this.textView = textView;
    }

    @Override
    public void onClick(View v) {
        String existingString = textView.getText().toString();
        String newString = existingString.concat("tan(");
        textView.setText(newString);
    }
}
