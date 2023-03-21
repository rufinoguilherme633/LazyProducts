package br.senai.sp.jandira.lazyproducts.dao.repository

import br.senai.sp.jandira.lazyproducts.model.Product

class ProductRepository {

    companion object {
        fun getProductList(): List<Product> {

            return listOf<Product>(
                Product(
                    id = 1,
                    name = "Mouse"

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
                Product(id = 4, name = "Impressora")
            )

        }
    }
}