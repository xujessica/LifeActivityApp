package com.example.lifeactivityapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class EntertainmentFiltersActivity extends AppCompatActivity {

    public static final String MY_ENTERTAINMENT_CHOICES = "entertainmentChoices";
    String str, detailedChoice;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entertainment_filters);

        ConstraintLayout layoutEF = (ConstraintLayout) findViewById(R.id.layoutEF);
        layoutEF.setBackgroundResource(R.drawable.red_gradient);

        intent = getIntent();
        detailedChoice = intent.getStringExtra(MY_ENTERTAINMENT_CHOICES);

        defineOptions();
    }

    public void defineOptions(){

        RadioButton b1 = (RadioButton) findViewById(R.id.radioButton);
        RadioButton b2 = (RadioButton) findViewById(R.id.radioButton2);
        RadioButton b3 = (RadioButton) findViewById(R.id.radioButton3);
        RadioButton b4 = (RadioButton) findViewById(R.id.radioButton4);
        RadioButton b5 = (RadioButton) findViewById(R.id.radioButton5);

        RadioButton b6 = (RadioButton) findViewById(R.id.radioButton6);
        RadioButton b7 = (RadioButton) findViewById(R.id.radioButton7);
        RadioButton b8 = (RadioButton) findViewById(R.id.radioButton8);
        RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup2);

        if(detailedChoice.equalsIgnoreCase("movies")){
            b1.setText("Action");
            b2.setText("Comedy");
            b3.setText("Romance");
            b4.setText("Kids");
            b5.setVisibility(View.INVISIBLE);
            rg.setVisibility(View.GONE);
        }
        if(detailedChoice.equalsIgnoreCase("concerts")){
            b1.setText("Rap");
            b2.setText("Pop");
            b3.setText("Country");
            b4.setVisibility(View.INVISIBLE);
            b5.setVisibility(View.INVISIBLE);
            rg.setVisibility(View.GONE);
        }
        if(detailedChoice.equalsIgnoreCase("activities")){
            b1.setText("Spring");
            b2.setText("Summer");
            b3.setText("Fall");
            b4.setText("Winter");
            b5.setVisibility(View.INVISIBLE);
            rg.setVisibility(View.GONE);
        }
    }

    public void onRadioButtonClicked(View view){
        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()){
            case R.id.radioButton:
                if(checked)
                    str = "first";
                break;
            case R.id.radioButton2:
                if(checked)
                    str = "second";
                break;
            case R.id.radioButton3:
                if(checked)
                    str = "third";
                break;
            case R.id.radioButton4:
                if(checked)
                    str = "fourth";
                break;
            case R.id.radioButton5:
                if(checked)
                    str = "fifth";
                break;
        }


    }

    public void onClickApply(View view){
        Button apply = (Button) findViewById(R.id.apply);

        Intent intent = new Intent(this, EntertainmentDisplayActivity.class);
        intent.putExtra(EntertainmentDisplayActivity.BUTTON, str);
        intent.putExtra(EntertainmentDisplayActivity.CATEGORY, detailedChoice);
        startActivity(intent);
    }



}
