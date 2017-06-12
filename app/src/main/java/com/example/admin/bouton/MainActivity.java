package com.example.admin.bouton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bouton = (Button) findViewById(R.id.button);

        bouton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, activitePage2.class);
                intent.putExtra("param", "Je viens du bouton N°+1");
                startActivity(intent);
            }
        });

        Button bouton2 = (Button) findViewById(R.id.button2);

        bouton2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, activitePage3.class);
                intent.putExtra("param", "Je viens du bouton N°-1");
                startActivity(intent);
            }
        });
    }


}