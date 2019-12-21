package com.example.simple.app.domains

class Product( val id: Int, val name: String, val price: Double, val category: Category) {

    init {
        require(id > 0) { "id can not be negative or 0" }
        require(name.isNotEmpty()) { "name can not be empty" }
        require(price > 0.0 ) { "price can not be negative or 0" }
    }

}