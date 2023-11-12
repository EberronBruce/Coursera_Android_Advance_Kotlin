package com.littlelemon.menu

class FilterHelper {//TODO create a FilterHelperTest and write a unit test for filterProducts

    fun filterProducts(type: FilterType, productsList: List<ProductItem>): List<ProductItem> {
        return when (type) {
            FilterType.All -> productsList
            FilterType.Dessert -> filterByCategory(productsList, "Dessert")
            FilterType.Drinks -> filterByCategory(productsList, "Drinks")
            FilterType.Food -> filterByCategory(productsList, "Food")
        }
    }

    private fun filterByCategory(productsList: List<ProductItem>, category: String): List<ProductItem> {
        return productsList.filter { it.category == category }
    }

}