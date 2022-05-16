package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnSumar;
    private Button btnRestar;
    private Button btnMultiplicar;
    private Button btnDividir;

    private TextView txtRespuesta;

    private EditText EtxtNumero1;
    private EditText EtxtNumero2;
    private EditText EtxtNombre;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSumar = findViewById(R.id.btn_Sumar);

        btnRestar = findViewById(R.id.btn_Restar);
        btnMultiplicar = findViewById(R.id.btn_Multiplicar);
        btnDividir = findViewById(R.id.btn_Dividir);
        txtRespuesta = findViewById(R.id.txtView_Respuesta);
        EtxtNumero1 = findViewById(R.id.editTxtNumero1);
        EtxtNumero2 = findViewById(R.id.editTxtNumero2);
        EtxtNombre = findViewById(R.id.editText_Nombre);
    }

    public void Sumar(View view){
        String n1 = EtxtNumero1.getText().toString();
        String n2 = EtxtNumero2.getText().toString();

        int numero1 = Integer.parseInt(n1);
        int numero2 = Integer.parseInt(n2);

        int suma = numero1 + numero2;

        String respuesta = String.valueOf(suma);

        txtRespuesta.setText(respuesta);


    }
    public void Siguiente(View view){

        String nombre = EtxtNombre.getText().toString();

        //Pasar al otro activity
        Intent salir = new Intent(this, MainActivity2.class );
        salir.putExtra("nombre", nombre);
        startActivity(salir);


    }


}