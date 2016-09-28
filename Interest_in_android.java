package com.rishabh2631.me;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Interest_in_android extends AppCompatActivity {
    Button btn13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interest_in_android);
        addListenerOnButton();
    }

    private void addListenerOnButton() {
        final Context context =this;
        btn13=(Button)findViewById(R.id.button13);
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,Main2Activity.class);
                startActivity(intent);
            }
        });
    }
}
