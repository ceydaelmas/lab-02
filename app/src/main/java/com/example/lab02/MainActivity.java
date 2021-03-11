package com.example.lab02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("On Create Works!!");

    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("On Start Works!!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("On Resume Works!!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("On Pause Works!!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("On Stop Works!!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("On Destroy Works!!");
    }
    public void buttonClick(View view){
        EditText et=(EditText) findViewById(R.id.editTextTextPersonName);
        String name = et.getText().toString();
        System.out.println("Button Click works!! Name :"+name);

        Intent intent = new Intent(this,SecondActivity.class);
        //boş bir sayfa açıyor.
        intent.putExtra("customername",name);//hashmap like key and value
        //diğer sayfaya taşıyor.
        startActivity(intent);
    }
}