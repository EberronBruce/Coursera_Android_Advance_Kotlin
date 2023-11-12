package com.littlelemon.menu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class ProductActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Task 5
        val title = intent.getStringExtra(KEY_TITLE) ?: ""
        val price = intent.getDoubleExtra(KEY_PRICE, 0.0)
        val category = intent.getStringExtra(KEY_CATEGORY) ?: ""
        val imageRes = intent.getIntExtra(KEY_IMAGE, -1)

        val productItem =
            ProductItem(title, price, category, imageRes)
        setContent { ProductDetails(productItem) }
    }

    //TASK 3
    companion object {
        const val KEY_TITLE = "title"
        const val KEY_PRICE = "price"
        const val KEY_IMAGE = "image"
        const val KEY_CATEGORY = "category"
    }
}