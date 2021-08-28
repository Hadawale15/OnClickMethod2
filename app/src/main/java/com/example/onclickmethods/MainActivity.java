package com.example.onclickmethods;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ButtonWork(View view) {

        switch (view.getId())
        {
            case R.id.button1:
                Intent intent=new Intent(MainActivity.this,FirstActivity.class);
                startActivity(intent);
                break;

            case R.id.button2:
                Intent intent1=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent1);
                break;

            case R.id.button3:
                Intent intent2=new Intent(MainActivity.this,ThirdActivity.class);
                startActivity(intent2);
                break;
        }
    }
}