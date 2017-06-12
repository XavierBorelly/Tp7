package com.example.admin.bouton;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class activitePage3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        //Bouton pour aller vers la page principale
        Button bouton5 = (Button) findViewById(R.id.button5);

        bouton5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activitePage3.this, MainActivity.class);
                intent.putExtra("param", "Je viens du bouton N°+1");
                startActivity(intent);
                finish();
            }
        });

        //Bouton pour aller vers la page 2
        Button bouton6 = (Button) findViewById(R.id.button6);

        bouton6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activitePage3.this, activitePage2.class);
                intent.putExtra("param", "Je viens du bouton N°++");
                startActivity(intent);
                finish();
            }
        });


        //affichage du texte d'où l'on vien
        Intent i = getIntent();
        String texte = i.getStringExtra("param");
        TextView editText = (TextView) findViewById(R.id.text3);
        editText.setText(texte);
    }
}
