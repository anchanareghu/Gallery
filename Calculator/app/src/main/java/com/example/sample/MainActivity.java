package com.example.sample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.Nullable;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.layout_calculator);
        TextView view = findViewById(R.id.view);

        View clear_button = findViewById(R.id.clear);
        ClearOnClick clearOnClick = new ClearOnClick(view);
        clear_button.setOnClickListener(clearOnClick);

        View one_button = findViewById(R.id.one);
        OneOnClick oneOnClick = new OneOnClick(view);
        one_button.setOnClickListener(oneOnClick);

        View two_button = findViewById(R.id.two);
        TwoOnClick twoOnClick = new TwoOnClick(view);
        two_button.setOnClickListener(twoOnClick);

        View three_button = findViewById(R.id.three);
        ThreeOnClick threeOnClick = new ThreeOnClick(view);
        three_button.setOnClickListener(threeOnClick);

        View four_button = findViewById(R.id.four);
        FourOnClick fourOnClick = new FourOnClick(view);
        four_button.setOnClickListener(fourOnClick);

        View five_button = findViewById(R.id.five);
        FiveOnClick fiveOnClick = new FiveOnClick(view);
        five_button.setOnClickListener(fiveOnClick);

        View six_button = findViewById(R.id.six);
        SixOnClick sixOnClick = new SixOnClick(view);
        six_button.setOnClickListener(sixOnClick);

        View seven_button = findViewById(R.id.seven);
        SevenOnClick sevenOnClick = new SevenOnClick(view);
        seven_button.setOnClickListener(sevenOnClick);

        View eight_button = findViewById(R.id.eight);
        EightOnClick eightOnClick = new EightOnClick(view);
        eight_button.setOnClickListener(eightOnClick);

        View nine_button = findViewById(R.id.nine);
        NineOnClick nineOnClick = new NineOnClick(view);
        nine_button.setOnClickListener(nineOnClick);

        View zero_button = findViewById(R.id.zero);
        ZeroOnClick zeroOnClick = new ZeroOnClick(view);
        zero_button.setOnClickListener(zeroOnClick);

        View zeros_button = findViewById(R.id.zeros);
        ZerosOnClick zerosOnClick = new ZerosOnClick(view);
        zeros_button.setOnClickListener(zerosOnClick);

        View point_button = findViewById(R.id.point);
        PointOnClick pointOnClick = new PointOnClick(view);
        point_button.setOnClickListener(pointOnClick);

        View backspace_button = findViewById(R.id.backspace);
        BackSpaceOnClick backspaceOnClick = new BackSpaceOnClick(view);
        backspace_button.setOnClickListener(backspaceOnClick);

        View percent_button = findViewById(R.id.percent);
        PercentOnClick percentOnClick = new PercentOnClick(view);
        percent_button.setOnClickListener(percentOnClick);

        View add_button = findViewById(R.id.add);
        AddOnClick addOnClick = new AddOnClick(view);
        add_button.setOnClickListener(addOnClick);

        View subtract_button = findViewById(R.id.subtract);
        SubtractOnClick subtractOnClick = new SubtractOnClick(view);
        subtract_button.setOnClickListener(subtractOnClick);

        View multiply_button = findViewById(R.id.multiply);
        MultiplyOnClick multiplyOnClick = new MultiplyOnClick(view);
        multiply_button.setOnClickListener(multiplyOnClick);

        View divide_button = findViewById(R.id.divide);
        DivideOnClick divideOnClick = new DivideOnClick(view);
        divide_button.setOnClickListener(divideOnClick);

        View equals_button = findViewById(R.id.equals);
        EqualOnClick equalOnClick = new EqualOnClick(view);
        equals_button.setOnClickListener(equalOnClick);

        View sin_button = findViewById(R.id.sine);
        SineOnClick sineOnClick = new SineOnClick(view);
        sin_button.setOnClickListener(sineOnClick);

        View cos_button = findViewById(R.id.cosine);
        CosineOnClick cosineOnClick = new CosineOnClick(view);
        cos_button.setOnClickListener(cosineOnClick);

        View tan_button = findViewById(R.id.tangent);
        TangentOnClick tangentOnClick = new TangentOnClick(view);
        tan_button.setOnClickListener(tangentOnClick);

        View pi_button = findViewById(R.id.pi);
        PiOnClick piOnClick = new PiOnClick(view);
        pi_button.setOnClickListener(piOnClick);

        View open_Bracket_Button = findViewById(R.id.open_bracket);
        OpenBracketOnClick openBracketOnClick = new OpenBracketOnClick(view);
        open_Bracket_Button.setOnClickListener(openBracketOnClick);

        View close_Bracket_Button = findViewById(R.id.close_bracket);
        CloseBracketOnClick closeBracketOnClick = new CloseBracketOnClick(view);
        close_Bracket_Button.setOnClickListener(closeBracketOnClick);

        View log_button = findViewById(R.id.log);
        LogOnClick logOnClick = new LogOnClick(view);
        log_button.setOnClickListener(logOnClick);

        View root_button = findViewById(R.id.root);
        RootOnClick rootOnClick = new RootOnClick(view);
        root_button.setOnClickListener(rootOnClick);

        View factorial_button = findViewById(R.id.factorial);
        FactorialOnClick factorialOnClick = new FactorialOnClick(view);
        factorial_button.setOnClickListener(factorialOnClick);

        View square_button = findViewById(R.id.square);
        SquareOnClick squareOnClick = new SquareOnClick(view);
        square_button.setOnClickListener(squareOnClick);

        View inverse_button = findViewById(R.id.inverse);
        InverseOnClick inverseOnClick = new InverseOnClick(view);
        inverse_button.setOnClickListener(inverseOnClick);


    }
}
