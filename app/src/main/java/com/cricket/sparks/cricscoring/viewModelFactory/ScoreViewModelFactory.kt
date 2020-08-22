package com.cricket.sparks.cricscoring.viewModelFactory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.cricket.sparks.cricscoring.repository.ScoreRepository
import com.cricket.sparks.cricscoring.viewModel.ScoreViewModel

class ScoreViewModelFactory(private val scoreRepository: ScoreRepository) : ViewModelProvider.NewInstanceFactory() {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return ScoreViewModel(scoreRepository) as T
    }
}
