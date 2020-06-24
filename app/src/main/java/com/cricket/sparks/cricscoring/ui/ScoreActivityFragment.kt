package com.cricket.sparks.cricscoring.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.cricket.sparks.cricscoring.R

/**
 * A placeholder fragment containing a simple view.
 */
class ScoreActivityFragment : androidx.fragment.app.Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_score, container, false)
    }
}
