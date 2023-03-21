package br.senai.sp.jandira.lazyproducts

import android.content.ClipData.Item
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.senai.sp.jandira.lazyproducts.dao.repository.ProductRepository
import br.senai.sp.jandira.lazyproducts.model.Product
import br.senai.sp.jandira.lazyproducts.ui.theme.LazyProductsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Criar um objeto product

        val p = Product(
            id = 1,
            name = "Mouse Microsoft",
            price = 123.88
        )





        setContent {
            LazyProductsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting(ProductRepository.getProductList())
                }
            }
        }
    }
}

@Composable
fun Greeting(products: List<Product>) {
    Surface(modifier = Modifier.fillMaxSize()) {

        Column() {
            LazyRow() {
                for (product in products) {

                    item {
                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp),
                            backgroundColor = Color.Magenta
                        ) {
                            Column(modifier = Modifier.padding(8.dp)) {
                                Column(modifier = Modifier.padding(8.dp)) {
                                    Text(text = "${product.id} - ${product.name} - ${product.price}")
                                    Text(text = "${product.price}")

                                }

                            }
                        }
                    }
                }
            }
            LazyColumn() {
                items(products) { product ->

                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        backgroundColor = Color.Magenta
                    ) {
                        Column(modifier = Modifier.padding(8.dp)) {
                            Column(modifier = Modifier.padding(8.dp)) {
                                Text(text = "${product.id} - ${product.name} - ${product.price}")
                                Text(text = "${product.price}")

                            }

                        }
                    }
                }
            }

        }
//        Column() {
//            for(product in products){
//                Text(text = "${product.id} - ${product.name} - ${product.price}")
//
//            }
//        }
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LazyProductsTheme {
        Greeting(ProductRepository.getProductList())
    }
}