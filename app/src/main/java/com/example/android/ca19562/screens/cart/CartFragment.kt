/*
 * Copyright (C) 2019 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.ca19562.screens.cart

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.android.ca19562.R
import com.example.android.ca19562.databinding.BasketFragmentBinding


class CartFragment : Fragment() {
    private lateinit var viewModel: CartViewModel
    private lateinit var viewModelFactory: CartViewModelFactory

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        // Inflate view and obtain an instance of the binding class.
        val binding: BasketFragmentBinding = DataBindingUtil.inflate(
                inflater,
                R.layout.basket_fragment,
                container,
                false


        )
        viewModelFactory = CartViewModelFactory(BasketFragmentArgs.fromBundle(arguments!!).score)
        viewModel = ViewModelProvider(this, viewModelFactory)
                .get(CartViewModel::class.java)
        binding.scoreText.text = viewModel.score.toString()
        return binding.root
    }
}
