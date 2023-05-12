package com.metatest.llmanagementrestaurantt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        RestaurantTables.addCustomer("John") // pas besoin de RestaurantTables().addCustomer("argument") car ce n'est pas une instanciation de classe
        RestaurantTables.addCustomer("Lisa")
        RestaurantTables.addCustomer("Alex")

        Waiter.Registration.branchName = // Registration is not needed because a class can only have on companion object
            "Little Lemon Main Branch"

        Waiter.Registration.branchAdress = // Registration is not needed because a class can only have on companion object
            "New York, Fifth avenue, 25"


    }
}