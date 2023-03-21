package br.senai.sp.jandira.lazyproducts.dao.repository

import android.graphics.drawable.Drawable
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import br.senai.sp.jandira.lazyproducts.R
import br.senai.sp.jandira.lazyproducts.model.Product

class ProductRepository {

    companion object {
        @Composable
        fun getProductList(): List<Product> {

            return listOf<Product>(
                Product(
                    id = 1,
                    name = "Mouse",
                    image = painterResource(id = R.drawable.mouse)

                ),
                Product(
                    id = 2,
                    name = "Teclado"
                ),
                Product(
                    id = 3,
                    name = "Monitor",
                    price = 897.99
                ),
                Product(id = 4,
                    name = "Impressora"
                )
            )

        }
    }
}