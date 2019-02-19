package com.wmstudio.dlrexcom.room_database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface scoresD {
    @Query("Select * from scores_all")
    public List<scores_all> getAllscores();
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public long insertscore(scores_all score);
    @Query("DELETE FROM scores_all")
    public void deleteallscores();
}
