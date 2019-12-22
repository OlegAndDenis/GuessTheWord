package com.example.android.guesstheword.screens.game

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.android.guesstheword.database.PlayersDatabaseDao

class GameViewModelFactory(
    private val playerKey: Long,
    private val dataSource: PlayersDatabaseDao
) : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(GameViewModel::class.java)) {
            return GameViewModel(playerKey, dataSource) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}