package com.idat.laterraza.util;

public class Global {
    // enum representan un grupos de constantes que defienen un tipo de dato
    public enum Estado {
        A, //Activo
        I  //Inactivo
    }

    //Variables globales
    public static final String TYPE_RESULT = "Result";
    public static final String TYPE_DATA = "Data";
    public static final String TYPE_AUTH = "Auth";

    public static final int RESPONSE_OK = 1;
    public static final int RESPONSE_ERROR = -1;
    public static final int RESPONSE_WARNING = 0;

    public static final String CORRECT_OPERATION = "Operación finalizada correctamente";
    public static final String INCORRECT_OPERATION = "No se ha podido culminar la operación";
    public static final String ERROR_OPERATION = "Ha ocurrido un error al realizar la operación";
    public static final String AUTH_SECRET = "";
    
}
