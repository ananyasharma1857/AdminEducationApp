package com.example.adminappdceggn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    CardView uploadNotice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uploadNotice = findViewById(R.id.addNoticeImage);
        uploadNotice.setOnClickListener(this);
    }

        @Override
        public void onClick(View v){
           switch (v.getId()){
               case R.id.addNoticeImage:
                   Intent intent= new Intent(MainActivity.this,UploadNotice.class);
                   startActivity(intent);
                   break;
           }
        }

}


