package com.apps.creative.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by dev on 8/15/2016.
 */
public class home_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);

        final Button personal_button = (Button) findViewById(R.id.personal_button);
        personal_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // your handler code here


                Intent personal_intent = new Intent(home_page.this, personal.class);
                startActivity(personal_intent);


            }
        });

        final Button academic_button = (Button) findViewById(R.id.academic_button);
       academic_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // your handler code here
                Intent academic_intent = new Intent(home_page.this, academic.class);
                startActivity(academic_intent);

            }
        });

        final Button gallery_button = (Button) findViewById(R.id.gallery_button);
      gallery_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // your handler code here
                Intent gallery_intent = new Intent(home_page.this, gallery.class);
                startActivity(gallery_intent);

            }
        });

        final Button others_button = (Button) findViewById(R.id.others_button);
       others_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // your handler code here
                Intent others_intent = new Intent(home_page.this, others.class);
                startActivity(others_intent);
            }
        });

        final Button welcome_button = (Button) findViewById(R.id.welcome_button);
        welcome_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // your handler code here
                Intent welcome_intent = new Intent(home_page.this, others.class);
                startActivity(welcome_intent);
            }
        });





    }
}

