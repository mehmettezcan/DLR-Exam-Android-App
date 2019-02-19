package com.wmstudio.dlrexcom;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.wmstudio.dlrexcom.questionContract.*;
import java.util.ArrayList;
import java.util.List;

public class questionDBHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "dlrexcom.db";
    private static final int DATABASE_VERSION = 2 ;

    private SQLiteDatabase db;

    public questionDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        this.db = db;
        final String SQL_CREATE_QUESTIONS_TABLE= " CREATE TABLE "+
                questionTable.TABLE_NAME + " ( " +
                questionTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "+
                questionTable.COL_QUESTİONS +" INTEGER,"+
                questionTable.COL_DIRECTION +" STRING,"+
                questionTable.COL_COLOR +" STRING,"+
                questionTable.COL_DOT_COUNT +" INTEGER,"+
                questionTable.COL_OPTION1 + " INTEGER,"+
                questionTable.COL_OPTION2 + " INTEGER,"+
                questionTable.COL_OPTION3 + " INTEGER "+
                " ) ";
        db.execSQL(SQL_CREATE_QUESTIONS_TABLE);
        fillQustionsTable();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+ questionTable.TABLE_NAME);
        onCreate(db);

    }

    private void fillQustionsTable(){
        question q1 = new question(R.drawable.red_0,"bottom","red",0,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q1);
        question q2 = new question(R.drawable.red_1,"bottom","red",1,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q2);
        question q3 = new question(R.drawable.red_2,"bottom","red",2,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q3);
        question q4 = new question(R.drawable.red_3,"bottom","red",3,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q4);
        question q5 = new question(R.drawable.red_4,"bottom","red",4,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q5);
        question q6 = new question(R.drawable.red_5,"left","red",0,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q6);
        question q7 = new question(R.drawable.red_6,"left","red",1,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q7);
        question q8 = new question(R.drawable.red_7,"left","red",2,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q8);
        question q9 = new question(R.drawable.red_8,"left","red",3,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q9);
        question q10 = new question(R.drawable.red_9,"left","red",4,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q10);
        question q11 = new question(R.drawable.red_10,"top","red",0,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q11);
        question q12 = new question(R.drawable.red_11,"top","red",1,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q12);
        question q13 = new question(R.drawable.red_12,"top","red",2,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q13);
        question q14 = new question(R.drawable.red_13,"top","red",3,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q14);
        question q15 = new question(R.drawable.red_14,"top","red",4,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q15);
        question q16 = new question(R.drawable.red_15,"right","red",0,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q16);
        question q17 = new question(R.drawable.red_16,"right","red",1,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q17);
        question q18 = new question(R.drawable.red_17,"right","red",2,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q18);
        question q19 = new question(R.drawable.red_18,"right","red",3,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q19);
        question q20 = new question(R.drawable.red_19,"right","red",4,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q20);

        question q21 = new question(R.drawable.yellow_0,"bottom","yellow",0,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q21);
        question q22 = new question(R.drawable.yellow_1,"bottom","yellow",1,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q22);
        question q23 = new question(R.drawable.yellow_2,"bottom","yellow",2,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q23);
        question q24 = new question(R.drawable.yellow_3,"bottom","yellow",3,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q24);
        question q25 = new question(R.drawable.yellow_4,"bottom","yellow",4,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q25);
        question q26 = new question(R.drawable.yellow_5,"left","yellow",0,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q26);
        question q27 = new question(R.drawable.yellow_6,"left","yellow",1,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q27);
        question q28 = new question(R.drawable.yellow_7,"left","yellow",2,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q28);
        question q29 = new question(R.drawable.yellow_8,"left","yellow",3,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q29);
        question q30 = new question(R.drawable.yellow_9,"left","yellow",4,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q30);
        question q31 = new question(R.drawable.yellow_10,"top","yellow",0,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q31);
        question q32 = new question(R.drawable.yellow_11,"top","yellow",1,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q32);
        question q33 = new question(R.drawable.yellow_12,"top","yellow",2,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q33);
        question q34 = new question(R.drawable.yellow_13,"top","yellow",3,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q34);
        question q35 = new question(R.drawable.yellow_14,"top","yellow",4,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q35);
        question q36 = new question(R.drawable.yellow_15,"right","yellow",0,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q36);
        question q37 = new question(R.drawable.yellow_16,"right","yellow",1,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q37);
        question q38 = new question(R.drawable.yellow_17,"right","yellow",2,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q38);
        question q39 = new question(R.drawable.yellow_18,"right","yellow",3,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q39);
        question q40 = new question(R.drawable.yellow_19,"right","yellow",4,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q40);

        question q41 = new question(R.drawable.mavi_0,"bottom","blue",0,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q41);
        question q42 = new question(R.drawable.mavi_1,"bottom","blue",1,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q42);
        question q43 = new question(R.drawable.mavi_2,"bottom","blue",2,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q43);
        question q44 = new question(R.drawable.mavi_3,"bottom","blue",3,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q44);
        question q45 = new question(R.drawable.mavi_4,"bottom","blue",4,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q45);
        question q46 = new question(R.drawable.mavi_5,"left","blue",0,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q46);
        question q47 = new question(R.drawable.mavi_6,"left","blue",1,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q47);
        question q48 = new question(R.drawable.mavi_7,"left","blue",2,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q48);
        question q49 = new question(R.drawable.mavi_8,"left","blue",3,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q49);
        question q50 = new question(R.drawable.mavi_9,"left","blue",4,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q50);
        question q51 = new question(R.drawable.mavi_10,"top","blue",0,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q51);
        question q52 = new question(R.drawable.mavi_11,"top","blue",1,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q52);
        question q53 = new question(R.drawable.mavi_12,"top","blue",2,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q53);
        question q54 = new question(R.drawable.mavi_13,"top","blue",3,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q54);
        question q55 = new question(R.drawable.mavi_14,"top","blue",4,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q55);
        question q56 = new question(R.drawable.mavi_15,"right","blue",0,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q56);
        question q57 = new question(R.drawable.mavi_17,"right","blue",2,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q57);
        question q58 = new question(R.drawable.mavi_18,"right","blue",3,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q58);
        question q59 = new question(R.drawable.mavi_19,"right","blue",4,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q59);

        question q60 = new question(R.drawable.green_0,"bottom","green",0,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q60);
        question q61 = new question(R.drawable.green_1,"bottom","green",1,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q61);
        question q62 = new question(R.drawable.green_2,"bottom","green",2,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q62);
        question q63 = new question(R.drawable.green_3,"bottom","green",3,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q63);
        question q64 = new question(R.drawable.green_4,"bottom","green",4,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q64);
        question q65 = new question(R.drawable.green_5,"left","green",0,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q65);
        question q66 = new question(R.drawable.green_6,"left","green",1,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q66);
        question q67 = new question(R.drawable.green_7,"left","green",2,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q67);
        question q68 = new question(R.drawable.green_8,"left","green",3,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q68);
        question q69 = new question(R.drawable.green_9,"left","green",4,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q69);
        question q70 = new question(R.drawable.green_10,"top","green",0,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q70);
        question q71 = new question(R.drawable.green_11,"top","green",1,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q71);
        question q72 = new question(R.drawable.green_12,"top","green",2,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q72);
        question q73 = new question(R.drawable.green_13,"top","green",3,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q73);
        question q74 = new question(R.drawable.green_14,"top","green",4,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q74);
        question q75 = new question(R.drawable.green_15,"right","green",0,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q75);
        question q76 = new question(R.drawable.green_16,"right","green",1,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q76);
        question q77 = new question(R.drawable.green_17,"right","green",2,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q77);
        question q78 = new question(R.drawable.green_18,"right","green",3,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q78);
        question q79 = new question(R.drawable.green_19,"right","green",4,R.id.top_button_custom,R.id.right_button_custom,R.id.bottom_button_custom);
        addquestion(q79);



    }
    private void addquestion(question question){
        ContentValues cv = new ContentValues();
        cv.put(questionTable.COL_QUESTİONS,question.getQuestion());
        cv.put(questionTable.COL_DIRECTION,question.getQuestion_direction());
        cv.put(questionTable.COL_COLOR,question.getQuestion_color());
        cv.put(questionTable.COL_DOT_COUNT,question.getQuestion_dot());
        cv.put(questionTable.COL_OPTION1,question.getOption1());
        cv.put(questionTable.COL_OPTION2,question.getOption2());
        cv.put(questionTable.COL_OPTION3,question.getOption3());
        db.insert(questionTable.TABLE_NAME,null,cv);


    }
    public List<question> getAllquestions(){
        List<question> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c= db.rawQuery(" SELECT * FROM " + questionTable.TABLE_NAME,null);
        if (c.moveToFirst()){
            do {
                question question = new question();
                question.setQuestion(c.getInt(c.getColumnIndex(questionTable.COL_QUESTİONS)));
                question.setQuestion_direction(c.getString(c.getColumnIndex(questionTable.COL_DIRECTION)));
                question.setQuestion_color(c.getString(c.getColumnIndex(questionTable.COL_COLOR)));
                question.setOption1(c.getInt(c.getColumnIndex(questionTable.COL_OPTION1)));
                question.setOption2(c.getInt(c.getColumnIndex(questionTable.COL_OPTION2)));
                question.setOption3(c.getInt(c.getColumnIndex(questionTable.COL_OPTION3)));
                questionList.add(question);
            }while (c.moveToNext());
        }
        c.close();
        return questionList;
    }
}

