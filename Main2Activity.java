package com.rishabh2631.me;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    Button btn2,btn3,btn4,btn5,btn6,btn7 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        addListenerOnButton();
    }

    private void addListenerOnButton() {
        final Context context=this;
        btn2=(Button)findViewById(R.id.button2);
        btn3=(Button)findViewById(R.id.button3);
        btn4=(Button)findViewById(R.id.button4);
        btn5=(Button)findViewById(R.id.button5);
        btn6=(Button)findViewById(R.id.button6);
        btn7=(Button)findViewById(R.id.button7);


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(context,Introduction.class);
                Toast.makeText(getApplicationContext(),"In Introduction!",Toast.LENGTH_LONG).show();
                startActivity(intent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(context,skill_set.class);
                Toast.makeText(getApplicationContext(),"In Skill Set!",Toast.LENGTH_LONG).show();
                startActivity(intent);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(context,Achievements.class);
                Toast.makeText(getApplicationContext(),"In Achievements!",Toast.LENGTH_LONG).show();
                startActivity(intent);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(context,Experience.class);
                Toast.makeText(getApplicationContext(),"In Experience!",Toast.LENGTH_LONG).show();
                startActivity(intent);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(context,Dream_project.class);
                Toast.makeText(getApplicationContext(),"In Dream Project!",Toast.LENGTH_LONG).show();
                startActivity(intent);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(context,Interest_in_android.class);
                Toast.makeText(getApplicationContext(),"In Interest in Android!",Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }
    }

