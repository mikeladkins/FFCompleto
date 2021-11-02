package com.madkins.ffcompleto.model

import com.google.gson.annotations.SerializedName

class CharacterResponse {
    @SerializedName("Character")
    lateinit var character: PlayerCharacter
}