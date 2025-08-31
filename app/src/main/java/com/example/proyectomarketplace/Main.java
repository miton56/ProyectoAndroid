package com.example.proyectomarketplace;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Main extends Fragment {

    Button botonCambiar;

    public Main() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        botonCambiar = rootView.findViewById(R.id.botonCambiar);

        botonCambiar.setOnClickListener(v -> {
            // Aquí cambias al otro fragmento
            requireActivity().getSupportFragmentManager().beginTransaction()
                    .replace(R.id.contenedorFragment, new sumar())
                    .addToBackStack(null)
                    .commit();
        });


        return rootView;
    }

}