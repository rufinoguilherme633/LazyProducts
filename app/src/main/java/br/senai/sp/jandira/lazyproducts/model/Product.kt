package br.senai.sp.jandira.lazyproducts.model

import androidx.compose.ui.graphics.vector.ImageVector

data class Product(

    var id: Int = 0,
    var name: String = "",
    var description: String = "Ësta é a descrição do produto",
    var price: Double = 0.0,
    var image: ImageVector? = null
)