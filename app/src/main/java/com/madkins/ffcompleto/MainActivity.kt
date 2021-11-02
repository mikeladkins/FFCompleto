package com.madkins.ffcompleto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.viewModels
import com.madkins.ffcompleto.api.XIVServiceProvider
import com.madkins.ffcompleto.ui.SearchPlayerViewModel
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {
    private val viewModel by viewModels<SearchPlayerViewModel>()
    lateinit var avatarImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        avatarImage = findViewById(R.id.avatar_image)

        viewModel.fetchPlayerById(18606659)

        viewModel.playerLiveData.observe(
            this,
            { player ->
                println("Character: ${player.character.name}")
                Picasso.get().load(player.character.avatarUrl).into(avatarImage)
            }
        )
    }
}