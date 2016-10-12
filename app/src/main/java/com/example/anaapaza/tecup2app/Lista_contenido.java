package com.example.anaapaza.tecup2app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Renato on 11/10/2016.
 */
public class Lista_contenido {

    /**
     * Donde se guardan las entradas de la lista.
     */
    public static ArrayList<Lista_entrada> ENTRADAS_LISTA = new ArrayList<Lista_entrada>();

    /**
     * Donde se asigna el identificador a cada entrada de la lista
     */
    public static Map<String, Lista_entrada> ENTRADAS_LISTA_HASHMAP = new HashMap<String, Lista_entrada>();

    /**
     * Creamos estáticamente las entradas
     */
    static {
        aniadirEntrada(new Lista_entrada("0", R.drawable.logo, "BUHO", "Búho es el nombre común..."));
        aniadirEntrada(new Lista_entrada("1", R.drawable.logo, "COLIBRÍ", "Los troquilinos (Trochilinae) son..."));
        aniadirEntrada(new Lista_entrada("2", R.drawable.logo, "CUERVO", "El cuervo común (Corvus corax) es ..."));
        aniadirEntrada(new Lista_entrada("3", R.drawable.logo, "FLAMENCO", "Los fenicopteriformes..."));
        aniadirEntrada(new Lista_entrada("4", R.drawable.logo, "KIWI", "Los kiwis (Apterix, gr. 'sin alas') son..."));
        aniadirEntrada(new Lista_entrada("5", R.drawable.logo, "LORO", "Las Psitácidas (Psittacidae) son..."));
        aniadirEntrada(new Lista_entrada("6", R.drawable.logo, "PAVO", "Pavo es un género de aves..."));
    }

    /** Añade una entrada a la lista
     * @param entrada Elemento que añadimos a la lista
     */
    private static void aniadirEntrada(Lista_entrada entrada) {
        ENTRADAS_LISTA.add(entrada);
        ENTRADAS_LISTA_HASHMAP.put(entrada.id, entrada);
    }

    /**
     * Representa una entrada del contenido de la lista
     */
    public static class Lista_entrada {
        public String id;
        public int idImagen;
        public String textoEncima;
        public String textoDebajo;

        public Lista_entrada (String id, int idImagen, String textoEncima, String textoDebajo) {
            this.id = id;
            this.idImagen = idImagen;
            this.textoEncima = textoEncima;
            this.textoDebajo = textoDebajo;
        }
    }

}