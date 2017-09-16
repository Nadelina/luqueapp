package mysql;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Bryan on 09/09/2017.
 */
public class Conexion extends SQLiteOpenHelper{

       /* String sql = "CREATE TABLE libro (ID_LIB PRIMARYKEY AUTO INCREMENT, ISBN TEXT, TIT_LIB TEXT, NOMB_AUT TEXT, FECH_LIB TEXT,NUM_EDICION NUMBER, NUM_PAG NUMBER, GNR_LIB TEXT,CONT_LIB TEXT, NOMB_EDIT TEXT)";
*/
    @Override
    public void onCreate(SQLiteDatabase db) {
    db.execSQL("CREATE TABLE libro (ID_LIB PRIMARYKEY AUTO INCREMENT, ISBN TEXT, TIT_LIB TEXT, NOMB_AUT TEXT, FECH_LIB TEXT,NUM_EDICION NUMBER, NUM_PAG NUMBER, GNR_LIB TEXT,CONT_LIB TEXT, NOMB_EDIT TEXT)"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXITS libro");
        onCreate(db);
    }

    Context cnt;
    public Conexion(Context context) {
        super(context, "luqueapp", null, 1);
       /* this.sql = sql;*/
        cnt=context;
    }
}
