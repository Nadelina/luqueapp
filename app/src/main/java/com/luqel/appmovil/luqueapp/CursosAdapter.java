package com.luqel.appmovil.luqueapp;
import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

import mysql.ConexionAdapter;

/**
 * Created by Nathaly on 17/09/2017.
 */
public class CursosAdapter extends CursorAdapter {

    private ConexionAdapter dbAdapter = null ;

    public CursosAdapter(Context context, Cursor c)
    {
        super(context, c);
        dbAdapter = new ConexionAdapter(context);
        dbAdapter.abrir();
    }
    @Override
    public void bindView(View view, Context context, Cursor cursor)
    {
        TextView tv = (TextView) view ;

        tv.setText(cursor.getString(cursor.getColumnIndex(ConexionAdapter.C_COLUMNA_TIT_LIB)));
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent)
    {
        final LayoutInflater inflater = LayoutInflater.from(context);
        final View view = inflater.inflate(android.R.layout.simple_dropdown_item_1line, parent, false);

        return view;
    }
}
