package com.example.testandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.Serializable;

public class Second extends AppCompatActivity {
    TextView txt,txt2;
    Button b2;
    private Third objThird;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        objThird=new Third();
        setContentView(R.layout.activity_second);
        txt=(TextView)findViewById(R.id.txt);
        txt2=(TextView)findViewById(R.id.txt2);
        b2=(Button)findViewById(R.id.b2);
        Bundle extras=getIntent().getExtras();
        final Third objThird=(Third)getIntent().getExtras().get("Third");
        txt.setText("Snigdha Kashyap");
        txt2.setText("Khushi Gupta");
        b2.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {

                                      Intent i=new Intent( Second.this,Third.class);
                                      i.putExtra("Third", (Serializable) objThird);
                                      startActivity(i);
                                  }
                              }

        );
    }
}
