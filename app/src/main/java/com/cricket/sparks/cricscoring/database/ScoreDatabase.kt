package com.cricket.sparks.cricscoring.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.cricket.sparks.cricscoring.datamodel.ScoreSheet

@Database(entities = [ScoreSheet::class], version = 1)
abstract class ScoreDatabase : RoomDatabase() {
    abstract fun scoreSheetDao(): ScoreSheetDao

    companion object {
        // Singleton prevents multiple instances of database opening at the
        // same time.
        @Volatile
        private var INSTANCE: ScoreDatabase? = null

        fun getDatabase(context: Context): ScoreDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                        context.applicationContext,
                        ScoreDatabase::class.java,
                        "score_sheet_db"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}
