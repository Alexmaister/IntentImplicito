package com.example.aortiz.intentimplicito;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void lanzarEmail(View boton){
//Hola

        EditText texto=(EditText)findViewById(R.id.texto);
        EditText receptor=(EditText)findViewById(R.id.receptor);
        EditText asunto=(EditText)findViewById(R.id.asunto);

        Intent lanzarEmail=new Intent(Intent.ACTION_SENDTO);
        String uri="mailto:"+ Uri.encode(receptor.getText().toString())
                +"?subject="+Uri.encode(asunto.getText().toString())+
                "?&body="+Uri.encode(texto.getText().toString());
        Uri uriV=Uri.parse(uri);
        lanzarEmail.setData(uriV);
        startActivity(lanzarEmail);
    }
}
