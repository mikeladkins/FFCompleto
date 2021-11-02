package com.madkins.ffcompleto.model

import com.google.gson.annotations.SerializedName

data class Job(
    @SerializedName("ClassID")
    val id: Int,
    val name: String
) {
}