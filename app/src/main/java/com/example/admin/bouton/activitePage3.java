package com.example.admin.bouton;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class activitePage3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button bouton4 = (Button) findViewById(R.id.button4);

        bouton4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activitePage3.this, MainActivity.class);
                intent.putExtra("param", "Je viens du bouton N°+1");
                startActivity(intent);
            }
        });

        Button bouton6 = (Button) findViewById(R.id.button6);

        bouton6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activitePage3.this, activitePage2.class);
                intent.putExtra("param", "Je viens du bouton N°++");
                startActivity(intent);
            }
        });
    }
}
