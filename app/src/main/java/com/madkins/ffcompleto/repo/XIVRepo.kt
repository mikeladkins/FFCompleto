package com.madkins.ffcompleto.repo

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.madkins.ffcompleto.api.XIVService
import com.madkins.ffcompleto.api.XIVServiceProvider
import com.madkins.ffcompleto.model.CharacterResponse
import com.madkins.ffcompleto.model.PlayerCharacter
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

private const val TAG = "XIVRepo"

class XIVRepo {
    private val service = XIVServiceProvider.getRetrofit().create(XIVService::class.java)

    fun fetchPlayerById(id: Int): MutableLiveData<CharacterResponse> {
        val request = service.getPlayerById(id)
        val responseLiveData: MutableLiveData<CharacterResponse> = MutableLiveData()

        request.enqueue(object: Callback<CharacterResponse> {
            override fun onResponse(
                call: Call<CharacterResponse>,
                response: Response<CharacterResponse>
            ) {
                Log.i(TAG, "Response received: ${response.body()}")
                responseLiveData.value = response.body()
            }

            override fun onFailure(call: Call<CharacterResponse>, t: Throwable) {
                Log.e(TAG,"No response received: ${t}")
            }

        })

        return responseLiveData
    }
}