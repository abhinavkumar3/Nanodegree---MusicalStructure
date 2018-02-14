package com.apk2try.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Album extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);

        //Clicking on the Image for buying the album
        ImageButton buyMusic1 = (ImageButton)findViewById(R.id.buyMusic1);
        ImageButton buyMusic2 = (ImageButton)findViewById(R.id.buyMusic2);


        //click on listener of first button

        buyMusic1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Create a new intent to open the {@link PaymentActivity Activity}
                Intent paymentIntent = new Intent(Album.this, PaymentActivity.class);

                // Start the new activity
                startActivity(paymentIntent);
            }
        });


        //click on listener of second button

        buyMusic2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Create a new intent to open the {@link PaymentActivity Activity}
                Intent paymentIntent = new Intent(Album.this, PaymentActivity.class);

                // Start the new activity
                startActivity(paymentIntent);
            }
        });

    }
}
