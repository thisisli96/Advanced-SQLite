package com.example.advancedsqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        SQLiteDatabase myDatabase = this.openOrCreateDatabase("Users", MODE_PRIVATE, null); // perintah ini untuk membuat database dengan nama table users
//        myDatabase.execSQL("CREATE TABLE IF NOT EXISTS Users (name VARCHAR, age INT(3))"); // disini kita bikin isi dari tabelnya dan variabel untuk table tsb
////       myDatabase.execSQL("INSERT INTO Users (name, age) VALUES ('peter', 22)");
////        myDatabase.execSQL("INSERT INTO Users (name, age) VALUES ('peter', 50)");
//
////        myDatabase.execSQL("INSERT INTO Users (name, age) VALUES ('noah', 27)");  // perintah ini untuk menambahkan is dari table tersebut.
//
//        // mengambil data dari database , untuk itu kita menggunakan Cursor
//        //Cursor c = myDatabase.rawQuery("SELECT * FROM Users WHERE age < 28 ", null);// quey untuk memanggil data dari database
//       // Cursor c = myDatabase.rawQuery("SELECT * FROM Users WHERE name = 'peter'", null);
//       // Cursor c = myDatabase.rawQuery("SELECT * FROM Users WHERE name = 'peter' AND age = 50 ", null);
//      //  Cursor c = myDatabase.rawQuery("SELECT * FROM Users WHERE name LIKE '%o%'", null);
//        myDatabase.execSQL("DELETE FROM Users WHERE name = 'noah'");
//        Cursor c = myDatabase.rawQuery("SELECT * FROM Users", null);
//
//
//        // membuat indeks untuk dari qury diatas
//        int nameIndex = c.getColumnIndex("name"); // untuk mendapakan isi dari kolom nama
//        int ageIndex = c.getColumnIndex("age"); //  mengambil data dari kolom c untuk kolom age
//
//        c.moveToFirst(); // mulai mengambil data dari awal
//
//        while (c != null){ // jika c tidak sama dengan null perintah akan di ulang sampai c sama dengan null
//
//            Log.i("name " , c.getString(nameIndex)); //  mengambil nama dari database dengan sesuai dengan kolom c
//            Log.i("age ", c.getString(ageIndex));
//            c.moveToNext();
//
//
//
//        }

        // coba 2

        SQLiteDatabase myDatabase = this.openOrCreateDatabase("Users", MODE_PRIVATE, null);
        myDatabase.execSQL("CREATE TABLE IF NOT EXISTS newUser (name VARCHAR, age INT(3), ID INTEGER PRIMARY KEY)");
         myDatabase.execSQL("INSERT INTO newUser (name, age) VALUES ('peter', 22)");
       myDatabase.execSQL("INSERT INTO newUser (name, age) VALUES ('noah', 50)");


       Cursor c = myDatabase.rawQuery("SELECT * FROM newUser", null);

        int nameIndex = c.getColumnIndex("name"); // untuk mendapakan isi dari kolom nama
       int ageIndex = c.getColumnIndex("age");
       int IdIndex = c.getColumnIndex("ID");

        c.moveToFirst(); // mulai mengambil data dari awal

        while (c != null){ // jika c tidak sama dengan null perintah akan di ulang sampai c sama dengan null

            Log.i("name " , c.getString(nameIndex)); //  mengambil nama dari database dengan sesuai dengan kolom c
            Log.i("age ", c.getString(ageIndex));
            Log.i("id :" , c.getString(IdIndex));
            c.moveToNext();



        }

    }
}
