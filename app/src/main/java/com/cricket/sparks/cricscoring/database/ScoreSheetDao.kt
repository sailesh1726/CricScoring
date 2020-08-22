package com.cricket.sparks.cricscoring.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.cricket.sparks.cricscoring.datamodel.ScoreSheet

@Dao
interface ScoreSheetDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun bulkInsert(events: List<ScoreSheet>)

    @Query("DELETE FROM score_sheet_table")
    fun deleteAll()
}
