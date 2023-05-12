package com.metatest.llmanagementrestaurantt

object RestaurantTables {  // it's a singleton

    val customers :MutableList<String> = mutableListOf()

    fun addCustomer (customer: String) {
        customers.add(customer) // paramètre de la fonction customer
    }

    fun removeCustomer (customer: String) {
        customers.remove(customer)
    }



} // end of RestaurantTables