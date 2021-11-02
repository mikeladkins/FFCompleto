package com.madkins.ffcompleto.model

import com.google.gson.annotations.SerializedName

data class PlayerCharacter(
    @SerializedName("ID")
    val id: Int, // Primary key, aka Lodestone ID
    @SerializedName("Name")
    val name: String,
    val activeJob: Job, // Currently active job, as reported by Lodestone
    @SerializedName("ClassJobs")
    val jobs: List<Job>,
    @SerializedName("Avatar")
    val avatarUrl: String
    //val equipment: List<Equipment> // Currently equipped items
) {

}