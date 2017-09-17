package mysql;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;


/**
 * Created by Bryan on 09/09/2017.
 */
public class Conexion extends SQLiteOpenHelper{

    private static int version = 1;
    private static String name = "luqueapp" ;
    private static CursorFactory factory = null;

    public Conexion(Context context) {
        super(context, name, factory, version);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
       //
        Log.i(this.getClass().toString(), "Creando base de datos");
        db.execSQL("CREATE TABLE libro(" +
                "ID_LIB INTEGER PRIMARYKEY AUTO INCREMENT," +
                " ISBN TEXT," +
                " TIT_LIB TEXT NOT NULL," +
                " NOMB_AUT TEXT NOT NULL," +
                " FECH_LIB TEXT," +
                " NUM_EDICION INTEGER," +
                " NUM_PAG INTEGER," +
                " ID_ESTAN INTEGER," +
                " GNR_LIB TEXT," +
                " CONT_LIB TEXT," +
                " NOMB_EDIT TEXT");
        db.execSQL("CREATE UNIQUE INDEX ISBN ON libro(ISBN ASC)");
        Log.i(this.getClass().toString(), "Tabla libro creada");
        //Insertamos valores


        db.execSQL("INSERT INTO libro(TIT_LIB, NOMB_AUT) VALUES('Mil soles espledidos','Khaled Hosseini')");
        db.execSQL("INSERT INTO libro(TIT_LIB, NOMB_AUT) VALUES('Inferno','Dan Brown')");
        db.execSQL("INSERT INTO libro(TIT_LIB, NOMB_AUT) VALUES('Misery','Stephen King')");
        db.execSQL("INSERT INTO libro(TIT_LIB, NOMB_AUT) VALUES('Rayuela','Julio Cortazar')");
        db.execSQL("INSERT INTO libro(TIT_LIB, NOMB_AUT) VALUES('La isla bajo el mar','Isabel Allende')");


        Log.i(this.getClass().toString(), "Datos iniciales libro insertados");

        Log.i(this.getClass().toString(), "Base de datos creada");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXITS libro");
        onCreate(db);
    }


 


}
