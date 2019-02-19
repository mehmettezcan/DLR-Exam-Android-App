package com.wmstudio.dlrexcom.room_database;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

import java.io.Serializable;

@Entity
public class scores_all implements Serializable {
    @PrimaryKey(autoGenerate = true)
    public long id;
    public int true_scores;
    public int false_scores;
    public String score_date;

    public scores_all() {
    }


    public int getTrue_scores() {
        return true_scores;
    }

    public void setTrue_scores(int true_scores) {
        this.true_scores = true_scores;
    }

    public int getFalse_scores() {
        return false_scores;
    }
    public void setFalse_scores(int false_scores) {
        this.false_scores = false_scores;
    }

    public String getScore_date() {
        return score_date;
    }

    public void setScore_date(String score_date) {
        this.score_date = score_date;
    }
}
