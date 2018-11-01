package com.example.phill.phillineweek1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.util.Log;
import android.view.View;
import android.widget.ImageView;
//import android.widget.CheckBox;


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

    public void checkClicked(View view) {

        // check all checkboxes if they are clicked, if so then change the view of it
        switch(view.getId()) {
            case R.id.checkBoxArms:
                imageViewArms = (ImageView) findViewById(R.id.imageViewArms);

                // if the image is not visible make if visible
                if( imageViewArms.getVisibility() == View.INVISIBLE)
                    imageViewArms.setVisibility(View.VISIBLE);

                // if the image is visible make it not visible
                else
                    imageViewArms.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBoxEars:
                imageViewEars = (ImageView) findViewById(R.id.imageViewEars);

                // if the image is not visible make if visible
                if( imageViewEars.getVisibility() == View.INVISIBLE)
                    imageViewEars.setVisibility(View.VISIBLE);

                // if the image is visible make it not visible
                else
                    imageViewEars.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBoxEyes:
                imageViewEyes = (ImageView) findViewById(R.id.imageViewEyes);

                // if the image is not visible make if visible
                if( imageViewEyes.getVisibility() == View.INVISIBLE)
                    imageViewEyes.setVisibility(View.VISIBLE);

                // if the image is visible make it not visible
                else
                    imageViewEyes.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBoxEyebrows:
                imageViewEyebrows = (ImageView) findViewById(R.id.imageViewEyebrows);

                // if the image is not visible make if visible
                if( imageViewEyebrows.getVisibility() == View.INVISIBLE)
                    imageViewEyebrows.setVisibility(View.VISIBLE);

                // if the image is visible make it not visible
                else
                    imageViewEyebrows.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBoxGlasses:
                imageViewGlasses = (ImageView) findViewById(R.id.imageViewGlasses);

                // if the image is not visible make if visible
                if( imageViewGlasses.getVisibility() == View.INVISIBLE)
                    imageViewGlasses.setVisibility(View.VISIBLE);

                // if the image is visible make it not visible
                else
                    imageViewGlasses.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBoxNose:
                imageViewNose = (ImageView) findViewById(R.id.imageViewNose);

                // if the image is not visible make if visible
                if( imageViewNose.getVisibility() == View.INVISIBLE)
                    imageViewNose.setVisibility(View.VISIBLE);

                // if the image is visible make it not visible
                else
                    imageViewNose.setVisibility(View.INVISIBLE);
                break;

            case R.id.checkBoxShoes:
                imageViewshoes = (ImageView) findViewById(R.id.imageViewshoes);

                // if the image is not visible make if visible
                if( imageViewshoes.getVisibility() == View.INVISIBLE)
                    imageViewshoes.setVisibility(View.VISIBLE);

                // if the image is visible make it not visible
                else
                    imageViewshoes.setVisibility(View.INVISIBLE);
                break;

            case R.id.checkBoxMustage:
                imageViewMustage = (ImageView) findViewById(R.id.imageViewMustage);

                // if the image is not visible make if visible
                if( imageViewMustage.getVisibility() == View.INVISIBLE)
                    imageViewMustage.setVisibility(View.VISIBLE);

                // if the image is visible make it not visible
                else
                    imageViewMustage.setVisibility(View.INVISIBLE);
                break;

            case R.id.checkBoxMouth:
                imageViewMouth = (ImageView) findViewById(R.id.imageViewMouth);

                // if the image is not visible make if visible
                if( imageViewMouth.getVisibility() == View.INVISIBLE)
                    imageViewMouth.setVisibility(View.VISIBLE);

                // if the image is visible make it not visible
                else
                    imageViewMouth.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBoxHed:
                imageViewHed = (ImageView) findViewById(R.id.imageViewHed);

                // if the image is not visible make if visible
                if( imageViewHed.getVisibility() == View.INVISIBLE)
                    imageViewHed.setVisibility(View.VISIBLE);

                // if the image is visible make it not visible
                else
                    imageViewHed.setVisibility(View.INVISIBLE);
                break;

        }
    }
}
