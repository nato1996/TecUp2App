package com.example.anaapaza.tecup2app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Renato on 11/10/2016.
 */
public class Fragment_Detalle extends Fragment {

    public static final String ARG_ID_ENTRADA_SELECIONADA = "item_id";
    private Lista_contenido.Lista_entrada mItem;

    public Fragment_Detalle() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ID_ENTRADA_SELECIONADA)) {
            //Cargamos el contenido de la entrada con cierto ID seleccionado en la lista. Se recomiendo usar un Loader para cargar el contenido
            mItem = Lista_contenido.ENTRADAS_LISTA_HASHMAP.get(getArguments().getString(ARG_ID_ENTRADA_SELECIONADA));
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.layout_fragment_detalle, container, false);

        //Mostramos el contenido al usuario
        if (mItem != null) {
            ((TextView) rootView.findViewById(R.id.textView_superior)).setText(mItem.textoEncima);
            ((TextView) rootView.findViewById(R.id.textView_inferior)).setText(mItem.textoDebajo);
            ((ImageView) rootView.findViewById(R.id.imageView_imagen)).setImageResource(mItem.idImagen);
        }

        return rootView;
    }
}