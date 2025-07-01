package com.example.api_dragonball_idgs904

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import coil.compose.rememberAsyncImagePainter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.draw.clip
import androidx.compose.foundation.layout.size


// Composable para obtener la imágen y mostrarla
@Composable
fun ImagenGuerrero(imagenUrl : String){
    Image(
        painter = rememberAsyncImagePainter(imagenUrl),
        contentDescription =  null,
        modifier = Modifier
            .padding(16.dp)
            .clip(CircleShape)
            .size(100.dp)
            .background(MaterialTheme.colorScheme.primary)
    )
}