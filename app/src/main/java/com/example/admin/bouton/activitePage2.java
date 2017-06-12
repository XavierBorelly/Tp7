package com.example.admin.bouton;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class activitePage2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button bouton3 = (Button) findViewById(R.id.button3);

        bouton3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activitePage2.this, MainActivity.class);
                intent.putExtra("param", "Je viens du bouton N°-1");
                startActivity(intent);
            }
        });

        Button bouton5 = (Button) findViewById(R.id.button5);

        bouton5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activitePage2.this, activitePage3.class);
                intent.putExtra("param", "Je viens du bouton N°--");
                startActivity(intent);
            }
        });
    }
}
