package com.example.anaapaza.tecup2app;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

/**
 * Created by Renato on 11/10/2016.
 */
public class Activity_Detalle extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_activity_detalle);

        // Comprobamos que previamente no hayamos entrado en esta actividad (por ejemplo, al rotar el dispositivo). Si es así se añade el fragmento al contenedor
        if (savedInstanceState == null) {
            // Crea el fragmento del detalle de la entrada y lo añade a la actividad
            Bundle arguments = new Bundle();
            arguments.putString(Fragment_Detalle.ARG_ID_ENTRADA_SELECIONADA, getIntent().getStringExtra(Fragment_Detalle.ARG_ID_ENTRADA_SELECIONADA));
            Fragment_Detalle fragment = new Fragment_Detalle();
            fragment.setArguments(arguments);
            getSupportFragmentManager().beginTransaction().add(R.id.framelayout_contenedor_detalle, fragment).commit();
        }
    }

}