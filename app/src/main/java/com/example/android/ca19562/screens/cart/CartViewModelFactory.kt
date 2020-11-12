package com.example.android.ca19562.screens.cart

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class CartViewModelFactory(private val finalScore: Int) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(CartViewModel::class.java)) {

            return CartViewModel(finalScore) as T
        }

        throw IllegalArgumentException("Unknown ViewModel class")

    }


}