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
//                if (checked) {
//                    imageViewArms.setVisibility(View.VISIBLE);
//                }
//            case R.id.imageViewEars:
//                imageViewEars = (ImageView) findViewById(R.id.imageViewEars);
//                if (checked) {
//                    imageViewEars.setVisibility(View.VISIBLE);
//                }
//            case R.id.imageViewEyes:
//                imageViewEyes = (ImageView) findViewById(R.id.imageViewEyes);
//                if (checked) {
//                    imageViewEyes.setVisibility(View.VISIBLE);
//                }
//            case R.id.imageViewEyebrows:
//                imageViewEyebrows = (ImageView) findViewById(R.id.imageViewEyebrows);
//                if (checked) {
//                    imageViewEyebrows.setVisibility(View.VISIBLE);
//                }
//            case R.id.imageViewGlasses:
//                imageViewGlasses = (ImageView) findViewById(R.id.imageViewGlasses);
//                if (checked) {
//                    imageViewGlasses.setVisibility(View.VISIBLE);
//                }
//            case R.id.imageViewNose:
//                imageViewNose = (ImageView) findViewById(R.id.imageViewNose);
//                if (checked) {
//                    imageViewNose.setVisibility(View.VISIBLE);
//                }
//            case R.id.imageViewshoes:
//                imageViewshoes = (ImageView) findViewById(R.id.imageViewshoes);
//                if (checked) {
//                    imageViewshoes.setVisibility(View.VISIBLE);
//                }
//            case R.id.imageViewMustage:
//                imageViewMustage = (ImageView) findViewById(R.id.imageViewMustage);
//                if (checked) {
//                    imageViewMustage.setVisibility(View.VISIBLE);
//                }
//            case R.id.imageViewBody:
//                imageViewBody = (ImageView) findViewById(R.id.imageViewBody);
//                if (checked) {
//                    imageViewBody.setVisibility(View.VISIBLE);
//                }
//            case R.id.imageViewMouth:
//                imageViewMouth = (ImageView) findViewById(R.id.imageViewMouth);
//                if (checked) {
//                    imageViewMouth.setVisibility(View.VISIBLE);
//                }
//
//
//
        }
    }
}
