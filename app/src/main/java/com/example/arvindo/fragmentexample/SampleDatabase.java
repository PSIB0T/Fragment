package com.example.arvindo.fragmentexample;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by arvindo on 8/8/17.
 */

public class SampleDatabase extends SQLiteOpenHelper{
    public static final String DATABASE_NAME = "student_db";
    public static final String TABLE_NAME = "student_table";
    public static final String COL_1 = "id";
    public static final String COL_2 = "name";
    public static final String COL_3 = "surname";

    public SampleDatabase(Context context) {
        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase db = this.getWritableDatabase();
    }

    public void onCreate(SQLiteDatabase sqlLiteDatabase){
        sqlLiteDatabase.execSQL("CREATE TABLE " + TABLE_NAME + "(" +
                COL_1 + "int PRIMARY KEY AUTOINCREMENT" +
                COL_2 + "varchar(64)" +
                COL_3 + "varchar(64)" +
                ");");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int j){
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(sqLiteDatabase);
    }

}
