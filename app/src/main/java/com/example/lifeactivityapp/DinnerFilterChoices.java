package com.example.lifeactivityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class DinnerFilterChoices extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinner_filter_choices);
    }

    public void onApplyDinnerFilterClick (View v) {
        Intent intent = new Intent(this, DinnerFilterDisplayActivity.class);
        onServiceTypeRadioButtonClick(v, intent);
        startActivity(intent);
    }


    public void onServiceTypeRadioButtonClick(View v, Intent intent) {
        RadioGroup radioGroup = (RadioGroup)findViewById(R.id.serviceTypeChoices);
        int radioButtonID = radioGroup.getCheckedRadioButtonId();
        RadioButton radioButton = (RadioButton) radioGroup.findViewById(radioButtonID);
        String serviceType = radioButton.getText().toString();
        intent.putExtra(BreakfastFilterDisplayActivity.MY_SERVICE_TYPE, serviceType);
    }

}
