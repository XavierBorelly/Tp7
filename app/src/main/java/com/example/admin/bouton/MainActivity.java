package com.example.admin.bouton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bouton pour aller vers la page 2
        Button bouton = (Button) findViewById(R.id.button);

        bouton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, activitePage2.class);
                intent.putExtra("param", "Je viens du bouton N°+1");
                startActivity(intent);
                finish();
            }
        });

        //Bouton pour aller vers la page 3
        Button bouton2 = (Button) findViewById(R.id.button2);

        bouton2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, activitePage3.class);
                intent.putExtra("param", "Je viens du bouton N°-1");
                startActivity(intent);
                finish();
            }
        });

        //affichage du texte d'où l'on vien
        Intent i = getIntent();
        String texte = i.getStringExtra("param");
        TextView editText = (TextView) findViewById(R.id.text);
        editText.setText(texte);
    }


}
