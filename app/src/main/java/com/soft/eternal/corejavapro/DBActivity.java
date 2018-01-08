package com.soft.eternal.corejavapro;

import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;
import android.preference.PreferenceManager;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONObject;

/**
 * Created by singhsha on 7/13/2016.
 */

public class DBActivity extends SQLiteOpenHelper {


    public static final String DATABASE_NAME = "javaqna.db";
    /*public static final String TABLE_NAME = "ocjp";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_TYPE = "type";
    public static final String COLUMN_QUESTION = "question";
    public static final String COLUMN_OPT_ONE = "opt_one";
    public static final String COLUMN_OPT_TWO = "opt_two";
    public static final String COLUMN_OPT_THREE = "opt_three";
    public static final String COLUMN_OPT_FOUR = "opt_four";
    public static final String COLUMN_OPT_FIVE = "opt_five";
    public static final String COLUMN_OPT_SIX = "opt_six";
    public static final String COLUMN_NO_OPT = "no_opt";
    public static final String COLUMN_CHAPTER = "chapter";
    public static final String COLUMN_DIFFICULTY = "difficulty";
    public static final String COLUMN_MOCK = "mock";
    public static final String COLUMN_CORRECT_OPT = "correct_opt";
    public static final String COLUMN_EXPLANATION = "explanation";*/

    public DBActivity(Context context)
    {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub
        try {
            db.execSQL(
                    "create table ocjp " +
                            "(id integer primary key, type text,question text,opt_one text, opt_two text,opt_three text," +
                            "opt_four text,opt_five text,opt_six text,no_opt text,chapter text,difficulty text,mock text,correct_opt text,explanation text,duplicate text)"
            );
            db.execSQL(
                    "create table stats " +
                            "(sr INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, stats BLOB, testid text, type integer, dateTime DEFAULT CURRENT_TIMESTAMP)"
            );
        }catch (Exception e ){
            e.getMessage();
        }

        Log.e("DATABASE OPERATION","Database created successfully .....");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // TODO Auto-generated method stub
        db.execSQL("DROP TABLE IF EXISTS ocjp");
        onCreate(db);
    }

    public void onDrop(SQLiteDatabase db) {
        // TODO Auto-generated method stub
        db.execSQL("DROP TABLE IF EXISTS ocjp");
        db.execSQL("DROP TABLE IF EXISTS stats");
        onCreate(db);
    }

    public boolean insertData  (Table temp,SQLiteDatabase db){

        ContentValues contentValues = new ContentValues();
        contentValues.put("id",temp.getID());
        contentValues.put("type",temp.getTYPE());
        contentValues.put("question",temp.getQUESTION());
        contentValues.put("opt_one",temp.getOPT_ONE());
        contentValues.put("opt_two",temp.getOPT_TWO());
        contentValues.put("opt_three",temp.getOPT_THREE());
        contentValues.put("opt_four",temp.getOPT_FOUR());
        contentValues.put("opt_five",temp.getOPT_FIVE());
        contentValues.put("opt_six",temp.getOPT_SIX());
        contentValues.put("no_opt",temp.getNo_Opt());
        contentValues.put("chapter",temp.getCHAPTER());
        contentValues.put("difficulty",temp.getDIFFICULTY());
        contentValues.put("mock",temp.getMOCK());
        contentValues.put("correct_opt",temp.getCORRECT_OPT());
        contentValues.put("explanation",temp.getEXPLANATION());
        contentValues.put("duplicate",temp.getDuplicate());

        db.insert("ocjp", null, contentValues);
        Log.e("DATABASE OPERATION","Row inserted .....");
        return true;
    }

    public boolean insertLastStats  (Map<String , List<Integer>> lastStats, SQLiteDatabase db, Context context){
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strDate = sdf.format(new Date());

        ContentValues contentValues = new ContentValues();
        contentValues.put("stats", new JSONObject(lastStats).toString());
        contentValues.put("dateTime", strDate);
        contentValues.put("testid",prefs.getString("TestID", "1") );
        contentValues.put("type",prefs.getInt("isMock", 1) );
        db.insert("stats", null, contentValues);
        return true;
    }

    public List<String> getTestID(){
        List<String> testId = new ArrayList();

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from stats", null );
        res.moveToFirst();
        String id, date;
        while(res.isAfterLast() == false){
            id = res.getString(res.getColumnIndex("testid"));
            date = res.getString(res.getColumnIndex("dateTime"));
            testId.add(id +" ("+ date + ")");
            res.moveToNext();
        }
        return testId;
    }

    public Map<String , List<Integer>> getAllStats(int id){

        Map<String , List<Integer>> hash_list = new HashMap();

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res = null;
        try {
            res = db.rawQuery("select * from stats where type=" + id, null);
        }catch (Exception e){
            e.getMessage();
        }
        res.moveToFirst();

        Map<String , List<Integer>> allStats = new HashMap<String , List<Integer>>();

        while(res.isAfterLast() == false){
            byte[] blob = res.getBlob(res.getColumnIndex("stats"));
            String json = new String(blob).trim();
            Gson gson = new Gson();
            Type type = new TypeToken<Map<String , List<Integer>>>() {}.getType();
            Map<String , List<Integer>> stat = gson.fromJson(json, type);
            for (Map.Entry<String , List<Integer>> entry : stat.entrySet()) {

                if(!allStats.containsKey(entry.getKey())){
                    List<Integer> list =  new ArrayList<Integer>();
                    list.add(0);
                    list.add(0);
                    allStats.put(entry.getKey(),list);
                }

                    List<Integer> key = allStats.get(entry.getKey());;
                    key.set(0,key.get(0) + entry.getValue().get(0));
                    key.set(1,key.get(1) + entry.getValue().get(1));
                    allStats.put(entry.getKey(), key);

            }
            res.moveToNext();
        }

        return allStats;
    }


    public Map<String , List<Integer>> getStat(long id){

        Map<String , List<Integer>> hash_list = new HashMap();

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from stats where sr="+ id, null );
        res.moveToFirst();

        Map<String , List<Integer>> allStats = new HashMap<String , List<Integer>>();

        while(res.isAfterLast() == false){
            byte[] blob = res.getBlob(res.getColumnIndex("stats"));
            String json = new String(blob).trim();
            Gson gson = new Gson();
            Type type = new TypeToken<Map<String , List<Integer>>>() {}.getType();
            Map<String , List<Integer>> stat = gson.fromJson(json, type);
            for (Map.Entry<String , List<Integer>> entry : stat.entrySet()) {

                if(!allStats.containsKey(entry.getKey())){
                    List<Integer> list =  new ArrayList<Integer>();
                    list.add(0);
                    list.add(0);
                    allStats.put(entry.getKey(),list);
                }

                List<Integer> key = allStats.get(entry.getKey());;
                key.set(0,key.get(0) + entry.getValue().get(0));
                key.set(1,key.get(1) + entry.getValue().get(1));
                allStats.put(entry.getKey(), key);

            }
            res.moveToNext();
        }

        return allStats;
    }



    public ArrayList<Table> getDataByChapter(Long chapter)
    {
        ArrayList<Table> array_list = new ArrayList<Table>();


        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from ocjp where chapter="+chapter+" AND duplicate='false'", null );
        res.moveToFirst();
        int i = 0;

        while(res.isAfterLast() == false){
            array_list.add(new Table(res));
            res.moveToNext();
        }
        // shuffle the list
        Collections.shuffle(array_list);
        return array_list;
    }

    public ArrayList<Table> getDataByDifficulty(Long difficulty){

        ArrayList<Table> array_list = new ArrayList<Table>();


        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from ocjp where difficulty="+difficulty+" AND duplicate='false'", null );
        res.moveToFirst();

        while(res.isAfterLast() == false){
            array_list.add(new Table(res));
            res.moveToNext();
        }
        // shuffle the list
        Collections.shuffle(array_list);
        return array_list;
    }


    public ArrayList<Table> getDataByMock(Long mock)
    {
        ArrayList<Table> array_list = new ArrayList<Table>();


        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from ocjp where mock="+mock+"", null );
        res.moveToFirst();

        while(res.isAfterLast() == false){
            array_list.add(new Table(res));
            res.moveToNext();
        }
        // shuffle the list
        Collections.shuffle(array_list);
        return array_list;
    }

    public ArrayList<Table> getDataRandom(){

        ArrayList<Table> array_list = new ArrayList<Table>();


        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "SELECT * FROM ocjp ORDER BY RANDOM() LIMIT 15", null );
        res.moveToFirst();

        while(res.isAfterLast() == false){
            array_list.add(new Table(res));
            res.moveToNext();
        }
        // shuffle the list
        return array_list;
    }

}
