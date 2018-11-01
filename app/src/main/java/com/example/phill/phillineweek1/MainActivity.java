package com.example.phill.phillineweek1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.CheckBox;



public class MainActivity extends AppCompatActivity {

    ImageView imageViewArms;
    ImageView imageViewEars;
    ImageView imageViewEyes;
    ImageView imageViewEyebrows;
    ImageView imageViewGlasses;
    ImageView imageViewNose;
    ImageView imageViewshoes;
    ImageView imageViewMustage;
    ImageView imageViewBody;
    ImageView imageViewMouth;
    ImageView imageViewHed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

//    public void checkClicked (View v) {
//        Log.d( "potato",  "checkClicked: ");
//
//    }

    public void checkClicked(View view) {
        // Is the view now checked?
//        Boolean checked = ((CheckBox) view).isChecked();
        switch(view.getId()) {
            case R.id.checkBoxArms:
                imageViewArms = (ImageView) findViewById(R.id.imageViewArms);
                imageViewArms.setVisibility(imageViewArms.getVisibility() == View.VISIBLE ? View.INVISIBLE : View.VISIBLE);
                break;
            case R.id.checkBoxEars:
                imageViewEars = (ImageView) findViewById(R.id.imageViewEars);
                imageViewEars.setVisibility(imageViewEars.getVisibility() == View.VISIBLE ? View.INVISIBLE : View.VISIBLE);
                break;
            case R.id.checkBoxEyes:
                imageViewEyes = (ImageView) findViewById(R.id.imageViewEyes);
                imageViewEyes.setVisibility(imageViewEyes.getVisibility() == View.VISIBLE ? View.INVISIBLE : View.VISIBLE);
                break;
            case R.id.checkBoxEyebrows:
                imageViewEyebrows = (ImageView) findViewById(R.id.imageViewEyebrows);
                imageViewEyebrows.setVisibility(imageViewEyebrows.getVisibility() == View.VISIBLE ? View.INVISIBLE : View.VISIBLE);
                break;
            case R.id.checkBoxGlasses:
                imageViewGlasses = (ImageView) findViewById(R.id.imageViewGlasses);
                imageViewGlasses.setVisibility(imageViewGlasses.getVisibility() == View.VISIBLE ? View.INVISIBLE : View.VISIBLE);
                break;
            case R.id.checkBoxNose:
                imageViewNose = (ImageView) findViewById(R.id.imageViewNose);
                imageViewNose.setVisibility(imageViewNose.getVisibility() == View.VISIBLE ? View.INVISIBLE : View.VISIBLE);
                break;

            case R.id.checkBoxShoes:
                imageViewshoes = (ImageView) findViewById(R.id.imageViewshoes);
                imageViewshoes.setVisibility(imageViewshoes.getVisibility() == View.VISIBLE ? View.INVISIBLE : View.VISIBLE);
                break;

            case R.id.checkBoxMustage:
                imageViewMustage = (ImageView) findViewById(R.id.imageViewMustage);
                imageViewMustage.setVisibility(imageViewMustage.getVisibility() == View.VISIBLE ? View.INVISIBLE : View.VISIBLE);
                break;

            case R.id.checkBoxMouth:
                imageViewMouth = (ImageView) findViewById(R.id.imageViewMouth);
                imageViewMouth.setVisibility(imageViewMouth.getVisibility() == View.VISIBLE ? View.INVISIBLE : View.VISIBLE);
                break;
            case R.id.checkBoxHed:
                imageViewHed = (ImageView) findViewById(R.id.imageViewHed);
                imageViewHed.setVisibility(imageViewHed.getVisibility() == View.VISIBLE ? View.INVISIBLE : View.VISIBLE);
                break;

        }
    }
}
