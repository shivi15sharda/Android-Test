package com.example.testandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {
    Spinner s1,s2,s3,s4,s5,s6,s7,s8,s9,s10;
    Button b1;
    private Second objSec;
    String data1[]={"Dog","Cat"};
    String data2[]={"Lion","Rabbit"};
    String data3[]={"Fox","Donkey"};
    String data4[]={"Mule","Horse"};
    String data5[]={"Jackal","Panda"};
    String data6[]={"Hen","Duck"};
    String data7[]={"Swan","Sparrow"};
    String data8[]={"Parrot","Blue bird"};
    String data9[]={"Cow","Buffalo"};
    String data10[]={"Crow","Pigeon"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s1=(Spinner)findViewById(R.id.s1);
        s2=(Spinner)findViewById(R.id.s2);
        s3=(Spinner)findViewById(R.id.s3);
        s4=(Spinner)findViewById(R.id.s4);
        s5=(Spinner)findViewById(R.id.s5);
        s6=(Spinner)findViewById(R.id.s6);
        s7=(Spinner)findViewById(R.id.s7);
        s8=(Spinner)findViewById(R.id.s8);
        s9=(Spinner)findViewById(R.id.s9);
        s10=(Spinner)findViewById(R.id.s10);
        b1=(Button)findViewById(R.id.b1);
        ArrayAdapter a1=new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,data1);
        ArrayAdapter a2=new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,data2);
        ArrayAdapter a3=new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,data3);
        ArrayAdapter a4=new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,data4);
        ArrayAdapter a5=new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,data5);
        ArrayAdapter a6=new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,data6);
        ArrayAdapter a7=new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,data7);
        ArrayAdapter a8=new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,data8);
        ArrayAdapter a9=new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,data9);
        ArrayAdapter a10=new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,data10);
        s1.setAdapter(a1);
        s2.setAdapter(a2);
        s3.setAdapter(a3);
        s4.setAdapter(a4);
        s5.setAdapter(a5);
        s6.setAdapter(a6);
        s7.setAdapter(a7);
        s8.setAdapter(a8);
        s9.setAdapter(a9);
        s10.setAdapter(a10);
        objSec=new Second();
        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Toast.makeText(MainActivity.this, "fauna 1", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(MainActivity.this, "fauna 2", Toast.LENGTH_SHORT).show();
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        s2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Toast.makeText(MainActivity.this, "fauna 3", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(MainActivity.this, "fauna 4", Toast.LENGTH_SHORT).show();
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        s3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Toast.makeText(MainActivity.this, "fauna 5", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(MainActivity.this, "fauna 6", Toast.LENGTH_SHORT).show();
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        s4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Toast.makeText(MainActivity.this, "fauna 7", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(MainActivity.this, "fauna 8", Toast.LENGTH_SHORT).show();
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        s5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Toast.makeText(MainActivity.this, "fauna 9", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(MainActivity.this, "fauna 10", Toast.LENGTH_SHORT).show();
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        s6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Toast.makeText(MainActivity.this, "fauna 11", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(MainActivity.this, "fauna 12", Toast.LENGTH_SHORT).show();
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        s7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Toast.makeText(MainActivity.this, "fauna 13", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(MainActivity.this, "fauna 14", Toast.LENGTH_SHORT).show();
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        s8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Toast.makeText(MainActivity.this, "fauna 15", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(MainActivity.this, "fauna 16", Toast.LENGTH_SHORT).show();
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        s9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Toast.makeText(MainActivity.this, "fauna 17", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(MainActivity.this, "fauna 18", Toast.LENGTH_SHORT).show();
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        s10.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Toast.makeText(MainActivity.this, "fauna 19", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(MainActivity.this, "fauna 20", Toast.LENGTH_SHORT).show();
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent( MainActivity.this,Second.class);
                i.putExtra("Second", (Serializable) objSec);
                startActivity(i);
            }
        });
    }
}
