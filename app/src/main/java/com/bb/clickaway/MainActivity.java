package com.bb.clickaway;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView myTextView;
    private ImageView imageView;

    private String concatText = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myTextView = findViewById(R.id.main_textview);
        imageView = findViewById(R.id.action_imageview);

        myTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Pressed text!!", Toast.LENGTH_SHORT).show();
                Log.d("TAG_X", "Text Pressed..");

                concatText += "0";

                if(concatText.length() > 5)
                    imageView.setImageDrawable(getDrawable(R.drawable.car_image_two));
                else
                    imageView.setImageDrawable(getDrawable(R.drawable.car_image_one));

                if(concatText.length() > 10)
                    concatText = "0";

                myTextView.setText(concatText);

            }
        });
    }
}
