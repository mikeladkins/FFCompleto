package com.madkins.ffcompleto.api

import com.madkins.ffcompleto.model.CharacterResponse
import com.madkins.ffcompleto.model.PlayerCharacter
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

// TODO make this into a Character Call
interface XIVService {
    @GET("/character/search/{name}")
    fun searchForCharacter(@Path(value = "name") name: String): Call<PlayerCharacter>

    @GET("/character/{id}?private_key=adf168a13cf54fb19c58d430b2e77e6cd0b5f2af9ac84a79924ee0437c60f143")
    fun getPlayerById(@Path(value = "id") id: Int): Call<CharacterResponse>
}