package com.example.proyectomarketplace;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

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

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.contenedorFragment, new Main())
                    .commit();
        }
    }

    public void mostrarMensaje(View view) {
        Toast.makeText(this, "holaaaaa", Toast.LENGTH_LONG).show();
    }

    public void sumar(View view){
        EditText cajaNum1 = findViewById(R.id.editTextNumber7);

        EditText cajaNum2 = findViewById(R.id.editTextNumber6);

        TextView cajaResultado = findViewById(R.id.textView);

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