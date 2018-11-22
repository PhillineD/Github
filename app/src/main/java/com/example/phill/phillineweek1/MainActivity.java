// Mr PotatoHead
// Week 1 native app studio
// Philline Dikker
// 12317608


package com.example.phill.phillineweek1;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;



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
    protected void onCreate(Bundle outState) {
        super.onCreate(outState);
        setContentView(R.layout.activity_main);

        // a reference to the image view
        imageViewHed = (ImageView) findViewById(R.id.imageViewHed);
        imageViewEars = (ImageView) findViewById(R.id.imageViewEars);
        imageViewArms = (ImageView) findViewById(R.id.imageViewArms);
        imageViewNose = (ImageView) findViewById(R.id.imageViewNose);
        imageViewGlasses = (ImageView) findViewById(R.id.imageViewGlasses);
        imageViewshoes = (ImageView) findViewById(R.id.imageViewshoes);
        imageViewMouth = (ImageView) findViewById(R.id.imageViewMouth);
        imageViewMustage = (ImageView) findViewById(R.id.imageViewMustage);
        imageViewEyes = (ImageView) findViewById(R.id.imageViewEyes);
        imageViewEyebrows = (ImageView) findViewById(R.id.imageViewEyebrows);

        // if there is something saved in saved InstanceState
        // since visibility is 0,1 or 2, check 0
        if (outState != null) {

            imageViewEars.setVisibility(outState.getInt("Arms"));
            imageViewEyebrows.setVisibility(outState.getInt("Ears"));
            imageViewEyes.setVisibility(outState.getInt("Eyes"));
            imageViewGlasses.setVisibility(outState.getInt("Glasses"));
            imageViewHed.setVisibility(outState.getInt("Hat"));
            imageViewMouth.setVisibility(outState.getInt("Mouth"));
            imageViewMustage.setVisibility(outState.getInt("Mustache"));
            imageViewNose.setVisibility(outState.getInt("Nose"));
            imageViewshoes.setVisibility(outState.getInt("Shoes"));
        }
    }

    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        // put int, visibility of the exta's
        outState.putInt("Hat", imageViewHed.getVisibility());
        outState.putInt("Ears", imageViewEars.getVisibility());
        outState.putInt("Arms", imageViewArms.getVisibility());
        outState.putInt("Nose", imageViewNose.getVisibility());
        outState.putInt("Glasses", imageViewGlasses.getVisibility());
        outState.putInt("Shoes", imageViewshoes.getVisibility());
        outState.putInt("Mouth", imageViewMouth.getVisibility());
        outState.putInt("Mustache", imageViewMustage.getVisibility());
        outState.putInt("Eyes", imageViewEyes.getVisibility());
        outState.putInt("Eyebrows", imageViewEyebrows.getVisibility());
    }

    public void checkClicked(View view) {

        // check all checkboxes if they are clicked, if so then change the view of it
        switch(view.getId()) {
            case R.id.checkBoxArms:

                // a reference to the image view
                imageViewArms = (ImageView) findViewById(R.id.imageViewArms);

                // if the image is not visible make if visible
                if (imageViewArms.getVisibility() == View.INVISIBLE)
                    imageViewArms.setVisibility(View.VISIBLE);

                // if the image is visible make it not visible
                else
                    imageViewArms.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBoxEars:

                // a reference to the image view
                imageViewEars = (ImageView) findViewById(R.id.imageViewEars);

                // if the image is not visible make if visible
                if (imageViewEars.getVisibility() == View.INVISIBLE)
                    imageViewEars.setVisibility(View.VISIBLE);

                // if the image is visible make it not visible
                else
                    imageViewEars.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBoxEyes:

                // a reference to the image view
                imageViewEyes = (ImageView) findViewById(R.id.imageViewEyes);

                // if the image is not visible make if visible
                if (imageViewEyes.getVisibility() == View.INVISIBLE)
                    imageViewEyes.setVisibility(View.VISIBLE);

                // if the image is visible make it not visible
                else
                    imageViewEyes.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBoxEyebrows:

                // a reference to the image view
                imageViewEyebrows = (ImageView) findViewById(R.id.imageViewEyebrows);

                // if the image is not visible make if visible
                if (imageViewEyebrows.getVisibility() == View.INVISIBLE)
                    imageViewEyebrows.setVisibility(View.VISIBLE);

                // if the image is visible make it not visible
                else
                    imageViewEyebrows.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBoxGlasses:

                // a reference to the image view
                imageViewGlasses = (ImageView) findViewById(R.id.imageViewGlasses);

                // if the image is not visible make if visible
                if (imageViewGlasses.getVisibility() == View.INVISIBLE)
                    imageViewGlasses.setVisibility(View.VISIBLE);

                // if the image is visible make it not visible
                else
                    imageViewGlasses.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBoxNose:

                // a reference to the image view
                imageViewNose = (ImageView) findViewById(R.id.imageViewNose);

                // if the image is not visible make if visible
                if (imageViewNose.getVisibility() == View.INVISIBLE)
                    imageViewNose.setVisibility(View.VISIBLE);

                // if the image is visible make it not visible
                else
                    imageViewNose.setVisibility(View.INVISIBLE);
                break;

            case R.id.checkBoxShoes:

                // a reference to the image view
                imageViewshoes = (ImageView) findViewById(R.id.imageViewshoes);

                // if the image is not visible make if visible
                if (imageViewshoes.getVisibility() == View.INVISIBLE)
                    imageViewshoes.setVisibility(View.VISIBLE);

                // if the image is visible make it not visible
                else
                    imageViewshoes.setVisibility(View.INVISIBLE);
                break;

            case R.id.checkBoxMustage:

                // a reference to the image view
                imageViewMustage = (ImageView) findViewById(R.id.imageViewMustage);

                // if the image is not visible make if visible
                if (imageViewMustage.getVisibility() == View.INVISIBLE)
                    imageViewMustage.setVisibility(View.VISIBLE);

                // if the image is visible make it not visible
                else
                    imageViewMustage.setVisibility(View.INVISIBLE);
                break;

            case R.id.checkBoxMouth:

                // a reference to the image view
                imageViewMouth = (ImageView) findViewById(R.id.imageViewMouth);

                // if the image is not visible make if visible
                if (imageViewMouth.getVisibility() == View.INVISIBLE)
                    imageViewMouth.setVisibility(View.VISIBLE);

                // if the image is visible make it not visible
                else
                    imageViewMouth.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBoxHed:

                // a reference to the image view
                imageViewHed = (ImageView) findViewById(R.id.imageViewHed);

                // if the image is not visible make if visible
                if (imageViewHed.getVisibility() == View.INVISIBLE)
                    imageViewHed.setVisibility(View.VISIBLE);

                // if the image is visible make it not visible
                else
                    imageViewHed.setVisibility(View.INVISIBLE);
                break;

        }
    }

}
