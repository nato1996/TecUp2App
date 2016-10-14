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
        aniadirEntrada(new Lista_entrada("0", R.drawable.inicio, "Inicio", "Aqui encontraras la ayuda necesaria para obtener un tecnico a su servicio"));
        aniadirEntrada(new Lista_entrada("1", R.drawable.historial, "Historial", "Aqui encontraras la historia de tus servicios"));
        aniadirEntrada(new Lista_entrada("2", R.drawable.tips, "Tips", "Aqui encontraras tips faciles para operar tu equipo"));
        aniadirEntrada(new Lista_entrada("3", R.drawable.video, "Videos", "Aui encontraras videos dinamicos de instrucciones para tu equipo"));
        aniadirEntrada(new Lista_entrada("4", R.drawable.nosotros, "Quienes somos", "Somos una empresa dediada al rubro de Tecnologias de la informacion y Sopote tecnico..."));

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