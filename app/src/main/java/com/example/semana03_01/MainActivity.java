package com.example.semana03_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnIniciar;
    EditText txtUsu,txtPas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUsu=findViewById(R.id.txtMail);
        txtPas=findViewById(R.id.txtPas);
        btnIniciar=findViewById(R.id.btnIniciar);

        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(txtUsu.getText().toString().equals("jaimito") &&
                txtPas.getText().toString().equals("123")) {
                    Intent i = new Intent(getApplicationContext(), MainActivity2.class);
                    startActivity(i);
                }else{
                    Toast.makeText(getApplicationContext(),
                            "Usuario o Pas Incorrectos", Toast.LENGTH_SHORT).show();


                }


            }
        });


    }
}