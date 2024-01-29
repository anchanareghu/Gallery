package com.example.myapplication;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
    public class MainActivity extends Activity {
        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            LinearLayout linearLayout = new LinearLayout(getBaseContext());
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
            linearLayout.setLayoutParams(layoutParams);

            linearLayout.setOrientation(LinearLayout.VERTICAL);
            linearLayout.setWeightSum(4);

            View view01 = new View(getBaseContext());
            LinearLayout.LayoutParams layoutParams1 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 0, 2);
            view01.setLayoutParams(layoutParams1);
            view01.setBackgroundColor(Color.parseColor("#a6767c"));

            View view02 = new View(getBaseContext());
            LinearLayout.LayoutParams layoutParams2 = new  LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 0, 1);
            view02.setLayoutParams(layoutParams2);
            view02.setBackgroundColor(Color.parseColor("#a576a5"));

            View view03 = new View(getBaseContext());
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 0, 1);
            view03.setLayoutParams(layoutParams3);
            view03.setBackgroundColor(Color.parseColor("#70a29c"));

            linearLayout.addView(view01);
            linearLayout.addView(view02);
            linearLayout.addView(view03);
            setContentView(linearLayout);
        }
}
