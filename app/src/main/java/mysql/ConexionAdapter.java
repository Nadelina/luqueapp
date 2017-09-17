package mysql;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
/**
 * Created by Nathaly on 17/09/2017.
 */
public class ConexionAdapter {
    /**
     * Definimos constante con el nombre de la tabla
     */
    public static final String C_TABLA = "libro" ;

    /**
     * Definimos constantes con el nombre de las columnas de la tabla
     */
    public static final String C_COLUMNA_ID_LIB   = "ID_LIB";
    public static final String C_COLUMNA_ISBN = "ISBN";
    public static final String C_COLUMNA_TIT_LIB = "TIT_LIB";
    public static final String C_COLUMNA_NOMB_AUT = "NOMB_AUT";
    public static final String C_COLUMNA_FECH_LIB = "FECH_LIB";
    public static final String C_COLUMNA_NUM_EDICION = "NUM_EDICION";
    public static final String C_COLUMNA_NUM_PAG = "NUM_PAG";
    public static final String C_COLUMNA_ID_ESTAN = "ID_ESTAN";
    public static final String C_COLUMNA_GNR_LIB = "GNR_LIB";
    public static final String C_COLUMNA_CONT_LIB = "CONT_LIB";
    public static final String C_COLUMNA_NOMB_EDIT = "NOMB_EDIT";

    private Context contexto;
    private Conexion dbHelper;
    private SQLiteDatabase db;

    /**
     * Definimos lista de columnas de la tabla para utilizarla en las consultas a la base de datos
     */
    private String[] columnas = new String[]{ C_COLUMNA_ID_LIB, C_COLUMNA_ISBN, C_COLUMNA_TIT_LIB, C_COLUMNA_NOMB_AUT, C_COLUMNA_FECH_LIB, C_COLUMNA_NUM_EDICION, C_COLUMNA_NUM_PAG, C_COLUMNA_ID_ESTAN, C_COLUMNA_GNR_LIB, C_COLUMNA_CONT_LIB, C_COLUMNA_NOMB_EDIT} ;

    public ConexionAdapter(Context context)
    {
        this.contexto = context;
    }

    public ConexionAdapter abrir() throws SQLException
    {
        dbHelper = new Conexion(contexto);
        db = dbHelper.getWritableDatabase();
        return this;
    }
    public void cerrar()
    {
        dbHelper.close();
    }
    /**
     * Devuelve cursor con todos las columnas de la tabla
     */
    public Cursor getCursor() throws SQLException
    {
        Cursor c = db.query( true, C_TABLA, columnas, null, null, null, null, null, null);

        return c;
    }

}
