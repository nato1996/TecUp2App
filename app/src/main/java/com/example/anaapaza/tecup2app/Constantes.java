package com.example.anaapaza.tecup2app;

public class Constantes {
    /**
     * Transición Home -> Detalle
     */
    public static final int CODIGO_DETALLE = 100;

    /**
     * Transición Detalle -> Actualización
     */
    public static final int CODIGO_ACTUALIZACION = 101;

    /**
     * Puerto que utilizas para la conexión.
     * Dejalo en blanco si no has configurado esta carácteristica.
     */
    private static final String PUERTO_HOST = "81";

    /**
     * Dirección IP de genymotion o AVD
     */
    private static final String IP = "http://192.168.0.12:";
    /**
     * URLs del Web Service
     */
    public static final String GET = IP + PUERTO_HOST + "/CPTC/getall.php";
    public static final String VALIDAR = IP + PUERTO_HOST + "/up/regnuevousuario.php";
    public static final String VERIFICAR = IP + PUERTO_HOST + "/up/valusuario.php";
    public static final String GET_BY_ID = IP + PUERTO_HOST + "/CPTC/getbyid.php";
    public static final String UPDATE = IP + PUERTO_HOST + "/CPTC/update.php";
    public static final String DELETE = IP + PUERTO_HOST + "/CPTC/delete.php";
    public static final String INSERT = IP + PUERTO_HOST + "/CPTC/insert.php";
    public static final String INSERT2 = IP + PUERTO_HOST + "/CPTC/getreturnid.php";
    public static final String LOGIN = IP + PUERTO_HOST + "/CPTC/login_validacioncorp.php";
    public static final String MyPREFERENCES = "MyPrefsempresa" ;
    public static final String IMAGES = IP + PUERTO_HOST + "/CPTC/images/";
    public static final String IMAGESPERFIL = IP + PUERTO_HOST + "/CPTC/perfil/";
    public static final String INSERTIMAGE = IP + PUERTO_HOST + "/CPTC/subida.php";
    /**
     * Clave para el valor extra que representa al identificador de una meta
     */
//    public static final String EXTRA_ID = "IDEXTRA";

}