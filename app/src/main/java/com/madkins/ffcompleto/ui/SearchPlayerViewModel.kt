package com.madkins.ffcompleto.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.madkins.ffcompleto.model.CharacterResponse
import com.madkins.ffcompleto.model.PlayerCharacter
import com.madkins.ffcompleto.repo.XIVRepo

class SearchPlayerViewModel: ViewModel() {
    private val repo = XIVRepo()
    var playerLiveData: LiveData<CharacterResponse> = MutableLiveData()

    fun fetchPlayerById(id: Int) {
        playerLiveData = repo.fetchPlayerById(id)
    }
}