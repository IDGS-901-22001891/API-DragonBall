package com.example.ejemplo3tarjetaidgs904.Segmentacion

import android.R
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.api_dragonball_idgs904.Character
import com.example.api_dragonball_idgs904.DragonBallApi
import com.example.api_dragonball_idgs904.ImagenGuerrero
// import com.example.ejemplo3tarjetaidgs904.ui.theme.Ejemplo3TarjetaIDGS904Theme


// Composable que hacepta los datos de la API con el "Character"
@Composable
fun MyPersonajes(personaje: Character){
    Card (
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(), // Add fillMaxWidth to make the card take full width
        elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.primaryContainer) // Use a color from your theme or Color.Blue
    ) {
        Row(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.background) // Row background can be different if needed
        ) {
            // Instanciamos el objeto de la función para acceder a su propiedad de la imágen
            ImagenGuerrero(personaje.image.toString())
            Personajes(personaje)
        }
    }
}

@Composable
fun Personajes(personaje: Character){
    Column {
        Text(
            text = personaje.name,
            color = MaterialTheme.colorScheme.primary,
            style = MaterialTheme.typography.titleLarge
        )
        Text(
            text = personaje.description.toString(),
            color = MaterialTheme.colorScheme.onBackground,
            style = MaterialTheme.typography.bodyMedium,
            maxLines = 4,
            overflow = TextOverflow.Ellipsis
        )
    }
}

@Composable
fun Personaje(name: String, color: Color, style: TextStyle){
    Text(text = name)
}

