package com.cricket.sparks.cricscoring.util

import android.app.Application
import com.cricket.sparks.cricscoring.database.ScoreDatabase
import com.cricket.sparks.cricscoring.repository.ScoreRepository
import com.cricket.sparks.cricscoring.viewModelFactory.ScoreViewModelFactory

object InjectorUtils {
    fun provideScoreViewModelFactory(application: Application): ScoreViewModelFactory {
        val scoreSheetDao = ScoreDatabase.getDatabase(application).scoreSheetDao()
        val scoreRepository = ScoreRepository.getInstance(scoreSheetDao)
        return ScoreViewModelFactory(scoreRepository)
    }

}
