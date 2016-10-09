package com.example.anaapaza.tecup2app;

import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class numero extends AppCompatActivity {
    EditText insertanumero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numero);
        insertanumero=(EditText)findViewById(R.id.insertanumero);
    }

    public void verificar_onclick(View v){
        insertarnumero();
    }

    private void insertarnumero() {
    String consulta=Constantes.VALIDAR+"?numero="+insertanumero.getText().toString();
        Log.d("http",consulta);
        // Petición GET
        VolleySingleton.
                getInstance(numero.this).
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
            Toast.makeText(numero.this, response.getString("mensaje"), Toast.LENGTH_SHORT).show();
            switch (estado) {
                case "1": // EXITO
                    Intent intentvalidar = new Intent(numero.this, validar.class);
                    intentvalidar.putExtra("numero",insertanumero.getText().toString());
                    startActivity(intentvalidar);
                    break;
                case "2": // FALLIDO
                    break;
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }


}
