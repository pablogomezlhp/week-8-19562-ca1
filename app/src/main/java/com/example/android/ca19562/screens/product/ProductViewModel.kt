package com.example.android.ca19562.screens.product

import android.util.Log
import androidx.lifecycle.ViewModel

class ProductViewModel : ViewModel(){
    // The current word
    var product = ""
    // The current score
    var cart = 5.0
    var count = 0
    // The list of words - the front of the list is the next word to guess
    private lateinit var productList: MutableList<String>

    /**
     * Resets the list of words and randomizes the order
     */
    private fun resetList() {
        productList = mutableListOf(
                "Darjelling",
                "Assam",
                "Lapsang",
                "Earl Grey",
                "Irish Breakfast"
        )
    }

    init {
        resetList()
        nextProduct()
        Log.i("GameViewModel", "GameViewModel created!")
    }
    /**
     * Moves to the next word in the list
     */
    private fun nextProduct() {
        if (!productList.isEmpty()) {
            //Select and remove a word from the list
            product = productList.removeAt(0)
        }
//        updateWordText()
//        updateScoreText()
    }
    /** Methods for buttons presses **/
    fun onSkip() {
        nextProduct()
    }

    fun onCorrect() {
        if(product.equals("Darjelling"))
        {
            cart+=8.5
            count++
            nextProduct()
        }
        if(product.equals("Assam"))
        {
            cart+=7.5
            count++
            nextProduct()
        }
        if(product.equals("Lapsang"))
        {
            cart+=9.5
            count++
            nextProduct()
        }
        if(product.equals("Earl Grey"))
        {
            cart+=3.5
            count++
            nextProduct()
        }
        if(product.equals("Irish Breakfast"))
        {
            cart+=2.5
            count++
            nextProduct()
        }
        if(count==5)
        {
            cart-=5.0
        }
    }

    override fun onCleared() {
        super.onCleared()
    }
}