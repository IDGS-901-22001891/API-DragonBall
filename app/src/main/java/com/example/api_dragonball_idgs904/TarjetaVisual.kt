package com.example.api_dragonball_idgs904




import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.ejemplo3tarjetaidgs904.Segmentacion.MyPersonajes
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.ejemplo3tarjetaidgs904.Segmentacion.MyPersonajes

@Composable
fun TarjetaVisual(viewModel: GuerrerosViewModel = viewModel()) {
    val personajes by viewModel.characters.collectAsState()

    LazyColumn {
        items(personajes) { personaje ->
            MyPersonajes(personaje)
        }
    }
}