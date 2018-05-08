package org.tony2tones.imagesdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void imageHandler(View view) {

        ImageView face = (ImageView) findViewById(R.id.faceId);
        face.setImageResource(R.drawable.facebeard);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
