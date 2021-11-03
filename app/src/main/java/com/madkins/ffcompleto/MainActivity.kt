package com.madkins.ffcompleto

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.madkins.ffcompleto.ui.SearchPlayerViewModel

class MainActivity : ComponentActivity() {
    private val viewModel by viewModels<SearchPlayerViewModel>()
    private var name = "name"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.fetchPlayerById(18606659)
        viewModel.playerLiveData.observe(
            this,
            { player ->
                println("Character: ${player.character.name}")
                name = player.character.name
            }
        )

        setContent {
            TitleText(name)
        }
    }

}

@Composable
fun TitleText(name: String) {
    Text(text = "Hello $name")
}