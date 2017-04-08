package com.dinnosoft.allinone;


/**
 * Created by yurley on 07/04/17.
 */

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
public class BaseDeDatos extends SQLiteOpenHelper {
    public BaseDeDatos(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table usuarios(codigo integer primary key autoincrement,usuario text,contrasena text)");
        db.execSQL("insert into usuarios values('admin','admin')");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int
            oldVersion, int newVersion) {
        db.execSQL("create table usuarios(codigo integer primary key autoincrement,usuario text,contrasena text)");
        db.execSQL("insert into usuarios values('admin','admin')");
    }

    }


