package LiskovSubstitutionPrinciple_LSP

import java.util.*

abstract class Product {
    abstract fun getName(): String

    /**
     * Function to get all of information about product
     */
    fun getProductInfo(){
        // some magic code
    }
}

abstract class FoodProduct: Product(){
    abstract fun getExpiredDate(): Date
}

class Vegetable: FoodProduct(){
    override fun getExpiredDate(): Date {
        return Date()
    }

    override fun getName(): String {
        return  "Broccoli"
    }
}