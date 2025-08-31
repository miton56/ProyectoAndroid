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

    private EditText cajaNum1;
    private EditText cajaNum2;
    private TextView cajaResultado;

    public sumar() {
        // Constructor vacío obligatorio
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_sumar, container, false);

        EditText cajaNum1 = rootView.findViewById(R.id.editTextNumber7);

        EditText cajaNum2 = rootView.findViewById(R.id.editTextNumber6);

        TextView cajaResultado = rootView.findViewById(R.id.textView);

        return rootView;

    }
    public void sumar1(View view){


        String texto1 = cajaNum1.getText().toString();

        String texto2 = cajaNum2.getText().toString();

        if (texto1.isEmpty() || texto2.isEmpty()){
            Toast.makeText(getContext(), "ingrese dos numeros", Toast.LENGTH_SHORT).show();
            return;
        }

        int num1 = Integer.parseInt(texto1);

        int num2 = Integer.parseInt(texto2);

        int resultado = num1 + num2;

        cajaResultado.setText("resultado " + resultado);

    }

}