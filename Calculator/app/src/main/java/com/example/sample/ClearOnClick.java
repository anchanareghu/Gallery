package com.example.sample;

import android.view.View;
import android.widget.TextView;

public class ClearOnClick implements View.OnClickListener {
    TextView textView;

    public ClearOnClick(TextView textView) {
        this.textView = textView;
    }

    @Override
    public void onClick(View v) {
        textView.setText("");
    }
}
