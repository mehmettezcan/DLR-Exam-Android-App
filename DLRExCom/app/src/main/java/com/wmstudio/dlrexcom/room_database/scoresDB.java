package com.wmstudio.dlrexcom.room_database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {scores_all.class}, version = 1)
public abstract class scoresDB extends RoomDatabase {
    public abstract scoresD getDao();
}