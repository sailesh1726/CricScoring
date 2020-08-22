package com.cricket.sparks.cricscoring.repository

import com.cricket.sparks.cricscoring.database.ScoreSheetDao

class ScoreRepository(scoreSheetDao: ScoreSheetDao) {

    companion object {
        @Volatile
        private var instance: ScoreRepository? = null

        fun getInstance(scoreSheetDao: ScoreSheetDao) =
                instance ?: synchronized(this) {
                    instance ?: ScoreRepository(scoreSheetDao).also { instance = it }
                }
    }
}
