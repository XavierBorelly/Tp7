package com.example.admin.bouton;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class activitePage2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Bouton pour aller vers la page principale
        Button bouton3 = (Button) findViewById(R.id.button3);

        bouton3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activitePage2.this, MainActivity.class);
                intent.putExtra("param", "Je viens du bouton N°-1");
                startActivity(intent);
                finish();
            }
        });

        //Bouton pour aller vers la page 3
        Button bouton4 = (Button) findViewById(R.id.button4);

        bouton4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activitePage2.this, activitePage3.class);
                intent.putExtra("param", "Je viens du bouton N°--");
                startActivity(intent);
                finish();
            }
        });


        //affichage du texte d'où l'on vien
        Intent i = getIntent();
        String texte = i.getStringExtra("param");
        TextView editText = (TextView) findViewById(R.id.text2);
        editText.setText(texte);
    }
}
