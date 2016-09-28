package com.rishabh2631.me;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Achievements extends AppCompatActivity {
    Button btn10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_achievements);
        addListenerOnButton();
    }

    private void addListenerOnButton() {
        final Context context = this;
        btn10=(Button)findViewById(R.id.button10);

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(context,Main2Activity.class);
                startActivity(intent);
            }
        });
    }
}
