package com.luqel.appmovil.luqueapp;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

import Beans.BeanLibros;
import mysql.Conexion;

/**
 * Created by bryan on 09/09/2017.
 */
public class VerLibros extends Activity{
/*Creo 3 atributos de clase*/
    ListView li;
    ArrayList<BeanLibros> lista = new ArrayList<BeanLibros>();
    BeanLibros libro;

    /*Cuando se crea la ventana*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);

        LinearLayout ventana = (LinearLayout)findViewById(R.id.layout_lista);
        ventana.setBackgroundColor(Color, BLACK);

        li = (ListView)findViewById(R.id.lista_libros);

        Conexion cn = (getC)
        SQLiteDatabase db = cn.getWritableDatabase();

        Cursor c = db.rawQuery("SELECT * FROM libro", null);

        if (c.moveToFirst()){
            do {
                libro = new BeanLibros(c.getString(1), c.getString(2),c.getString(3),c.getString(4),
                        c.getString(5),c.getInt(6),c.getInt(7));
            }while (c.moveToNext());
        }
        ArrayAdapter<BeanLibros> adap = new ArrayAdapter<BeanLibros>(getApplicationContext(), android.R.layout.simple_list_item_1, lista);
        li.setAdapter(adap);
    }

}
