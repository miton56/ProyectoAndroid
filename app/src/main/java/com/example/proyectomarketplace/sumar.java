package com.example.proyectomarketplace;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class sumar extends Fragment {

    public sumar() {
        // Constructor vacío obligatorio
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflar el layout del fragmento
        return inflater.inflate(R.layout.fragment_sumar, container, false);
    }
    public void sumar1(View view){
        EditText cajaNum1 = view.findViewById(R.id.editTextNumber);

        EditText cajaNum2 = view.findViewById(R.id.editTextNumber2);

        TextView cajaResultado = view.findViewById(R.id.textView3);

        String texto1 = cajaNum1.getText().toString();

        String texto2 = cajaNum2.getText().toString();

        if (texto1.isEmpty() || texto2.isEmpty()){
            Toast.makeText(this, "ingrese dos numeros", Toast.LENGTH_SHORT).show();
            return;
        }

        int num1 = Integer.parseInt(texto1);

        int num2 = Integer.parseInt(texto2);

        int resultado = num1 + num2;

        cajaResultado.setText("resultado " + resultado);

    }

}