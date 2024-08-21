package com.tecmilenio.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

/*
* David
* */
public class MainActivity extends AppCompatActivity {

    private EditText etNombre;
    private EditText etEscuela;
    private EditText etCarrera;
    private EditText etMateria;
    private Button borrar;
    private Button guardar;
    private TextView tvGuardaDatos;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        etNombre=(EditText) findViewById(R.id.etNombre);
        etEscuela=(EditText) findViewById(R.id.etEscuela);
        etCarrera=(EditText) findViewById(R.id.etCarrera);
        etMateria=(EditText) findViewById(R.id.etMateria);

        borrar=(Button) findViewById(R.id.borrar);
        guardar=(Button) findViewById(R.id.guardar);

        tvGuardaDatos = (android.widget.TextView) findViewById(R.id.tvGuardaDatos);
        textView = (android.widget.TextView) findViewById(R.id.textView);

        guardar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){

                String nombre = etNombre.getText().toString();
                String escuela = etEscuela.getText().toString();
                String carrera = etCarrera.getText().toString();
                String materia = etMateria.getText().toString();

                tvGuardaDatos.setVisibility(View.VISIBLE);

                textView.setText("El nombre es: "+nombre+"\nLa escuela es: "+escuela+"\nLa carrera es: "+carrera+"\nLa materia es: "+materia);
            }
        });


    }
}