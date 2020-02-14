package com.example.gasto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText peso, estatura;
    private TextView mensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        peso = (EditText)findViewById(R.id.etPeso);
        estatura = (EditText)findViewById(R.id.etEstatura);
        mensaje = (TextView)findViewById(R.id.tvMensaje);
    }

    public void calcular(View view){
        String valor1 = peso.getText().toString();
        String valor2 = estatura.getText().toString();
        double peso1 = Double.parseDouble(valor1);
        double estatura1 = Double.parseDouble(valor2);
        double operacion = peso1/(estatura1*estatura1);
        String calculo = String.valueOf(operacion);

        if(operacion<18.5){
            mensaje.setText("La persona tiene desnutrición");
        }
        if((operacion>=18.5)&&(operacion<25)){
            mensaje.setText("La persona tiene bajo peso");
        }
        if((operacion>=25)&&(operacion<30)){
            mensaje.setText("La persona tiene peso normal");
        }
        if((operacion>=30)&&(operacion<40)){
            mensaje.setText("La persona tiene problemas de obesidad");
        }

        if((operacion>=40)){
            mensaje.setText("La persona tiene obesidad severa");
        }
    }
}
