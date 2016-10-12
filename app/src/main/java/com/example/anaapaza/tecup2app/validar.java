package com.example.anaapaza.tecup2app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONException;
import org.json.JSONObject;

public class validar extends AppCompatActivity {
EditText insercodigo;
String telefono;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validar);
        insercodigo = (EditText)findViewById(R.id.insercodigo);
        Intent i=getIntent();
        telefono = i.getStringExtra("numero");
    }

    public void validar_onclick(View v){
        verificarnumero();

    }

    private void verificarnumero() {
        String consulta=Constantes.VERIFICAR+"?identificador="+insercodigo.getText().toString()+"&telefono="+telefono;
        Log.d("http", consulta);
        // Petición GET
        VolleySingleton.
                getInstance(validar.this).
                addToRequestQueue(
                        new JsonObjectRequest(Request.Method.GET, consulta, null,
                                new Response.Listener<JSONObject>() {

                                    @Override
                                    public void onResponse(JSONObject response) {
                                        // Procesar la respuesta Json
                                        procesarnumero(response);
                                    }
                                },
                                new Response.ErrorListener() {
                                    @Override
                                    public void onErrorResponse(VolleyError error) {
                                        Log.d("Error", "Error Volley: " + error.getMessage());
                                    }
                                }

                        )
                );
    }
    private void procesarnumero(JSONObject response) {

        try {
            // Obtener atributo "estado"
            String estado = response.getString("estado");
            Toast.makeText(validar.this, response.getString("mensaje"), Toast.LENGTH_SHORT).show();
            switch (estado) {
                case "1": // EXITO
                    startActivity(new Intent(this, Activity_Principal.class));
                    break;
                case "2": // FALLIDO
                    break;
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

}
