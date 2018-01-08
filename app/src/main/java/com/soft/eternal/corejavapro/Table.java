package com.soft.eternal.corejavapro;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;

import java.io.Serializable;
import java.sql.ResultSet;

/**
 * Created by singhsha on 7/13/2016.
 */

public class Table implements  Serializable{

    public String ID ;
    public String TYPE ;
    public String QUESTION ;
    public String OPT_ONE ;
    public String OPT_TWO ;
    public String OPT_THREE ;
    public String OPT_FOUR ;
    public String OPT_FIVE ;
    public String OPT_SIX ;
    public String No_Opt  ;
    public String CHAPTER  ;
    public String DIFFICULTY ;
    public String MOCK ;
    public String CORRECT_OPT ;
    public String EXPLANATION ;
    public String Duplicate ;



    public Table() {

    }
    public Table(Cursor res) {

        try {
            this.ID = res.getString(0);
            this.TYPE = res.getString(1);
            this.QUESTION = res.getString(2);
            this.OPT_ONE = res.getString(3);
            this.OPT_TWO = res.getString(4);
            this.OPT_THREE = res.getString(5);
            this.OPT_FOUR = res.getString(6);
            this.OPT_FIVE = res.getString(7);
            this.OPT_SIX = res.getString(8);
            this.No_Opt = res.getString(9);
            this.CHAPTER = res.getString(10);
            this.DIFFICULTY = res.getString(11);
            this.MOCK = res.getString(12);
            this.CORRECT_OPT = res.getString(13);
            this.EXPLANATION = res.getString(14);
            this.Duplicate = res.getString(15);
        }catch(Exception e)
        {}
    }
    public Table(String ID, String TYPE, String QUESTION, String OPT_ONE, String OPT_TWO, String OPT_THREE, String OPT_FOUR, String OPT_FIVE, String OPT_SIX, String no_Opt, String CHAPTER, String DIFFICULTY, String MOCK, String CORRECT_OPT, String EXPLANATION,String Duplicate) {
        this.ID = ID;
        this.TYPE = TYPE;
        this.QUESTION = QUESTION;
        this.OPT_ONE = OPT_ONE;
        this.OPT_TWO = OPT_TWO;
        this.OPT_THREE = OPT_THREE;
        this.OPT_FOUR = OPT_FOUR;
        this.OPT_FIVE = OPT_FIVE;
        this.OPT_SIX = OPT_SIX;
        this.No_Opt = no_Opt;
        this.CHAPTER = CHAPTER;
        this.DIFFICULTY = DIFFICULTY;
        this.MOCK = MOCK;
        this.CORRECT_OPT = CORRECT_OPT;
        this.EXPLANATION = EXPLANATION;
        this.Duplicate = Duplicate;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTYPE() {
        return TYPE;
    }

    public void setTYPE(String TYPE) {
        this.TYPE = TYPE;
    }

    public String getQUESTION() {
        return QUESTION;
    }

    public void setQUESTION(String QUESTION) {
        this.QUESTION = QUESTION;
    }

    public String getOPT_ONE() {
        return OPT_ONE;
    }

    public void setOPT_ONE(String OPT_ONE) {
        this.OPT_ONE = OPT_ONE;
    }

    public String getOPT_TWO() {
        return OPT_TWO;
    }

    public void setOPT_TWO(String OPT_TWO) {
        this.OPT_TWO = OPT_TWO;
    }

    public String getOPT_THREE() {
        return OPT_THREE;
    }

    public void setOPT_THREE(String OPT_THREE) {
        this.OPT_THREE = OPT_THREE;
    }

    public String getOPT_FOUR() {
        return OPT_FOUR;
    }

    public void setOPT_FOUR(String OPT_FOUR) {
        this.OPT_FOUR = OPT_FOUR;
    }

    public String getOPT_FIVE() {
        return OPT_FIVE;
    }

    public void setOPT_FIVE(String OPT_FIVE) {
        this.OPT_FIVE = OPT_FIVE;
    }

    public String getOPT_SIX() {
        return OPT_SIX;
    }

    public void setOPT_SIX(String OPT_SIX) {
        this.OPT_SIX = OPT_SIX;
    }

    public String getNo_Opt() {
        return No_Opt;
    }

    public void setNo_Opt(String no_Opt) {
        No_Opt = no_Opt;
    }

    public String getCHAPTER() {
        return CHAPTER;
    }

    public void setCHAPTER(String CHAPTER) {
        this.CHAPTER = CHAPTER;
    }

    public String getDIFFICULTY() {
        return DIFFICULTY;
    }

    public void setDIFFICULTY(String DIFFICULTY) {
        this.DIFFICULTY = DIFFICULTY;
    }

    public String getMOCK() {
        return MOCK;
    }

    public void setMOCK(String MOCK) {
        this.MOCK = MOCK;
    }

    public String getCORRECT_OPT() {
        return CORRECT_OPT;
    }

    public void setCORRECT_OPT(String CORRECT_OPT) {
        this.CORRECT_OPT = CORRECT_OPT;
    }

    public String getEXPLANATION() {
        return EXPLANATION;
    }

    public void setEXPLANATION(String EXPLANATION) {
        this.EXPLANATION = EXPLANATION;
    }

    public String getDuplicate() {
        return Duplicate;
    }

    public void setDuplicate(String duplicate) {
        Duplicate = duplicate;
    }


}

