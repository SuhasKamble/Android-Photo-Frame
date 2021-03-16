package com.suhaskamble.deathnoteframe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageButton prev,next;
    TextView name;
    ImageView image;
    int currentIndex = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int [] myImageList = new int[]{R.drawable.main,R.drawable.l,R.drawable.misa,R.drawable.ryuk};
        String [] myNameList = new String[]{"Light Yagami","L","Misa Amane","Ryuk"};
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image = findViewById(R.id.image);
        prev = findViewById(R.id.prev);
        next = findViewById(R.id.next);
        name = findViewById(R.id.name);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(currentIndex!=myImageList.length-1){
                    currentIndex = currentIndex+1;
                }else {
                    currentIndex = 0;
                }

                image.setImageResource(myImageList[currentIndex]);
                name.setText(myNameList[currentIndex]);
            }
        });

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(currentIndex!=0){
                    currentIndex = currentIndex-1;
                }else {
                    currentIndex = myImageList.length-1;
                }

                image.setImageResource(myImageList[currentIndex]);
                name.setText(myNameList[currentIndex]);
            }
        });
    }
}