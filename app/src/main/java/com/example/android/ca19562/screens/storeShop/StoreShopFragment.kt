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

package com.example.android.ca19562.screens.storeShop

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.android.ca19562.R
import com.example.android.ca19562.databinding.ShoppingFragmentBinding

/**
 * Fragment for the starting or title screen of the app
 */
class StoreShopFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        // Inflate the layout for this fragment
        val binding: ShoppingFragmentBinding = DataBindingUtil.inflate(
                inflater, R.layout.shopping_fragment, container, false)

        binding.playGameButton.setOnClickListener {
            findNavController().navigate(StoreShopFragmentDirections.actionShoppingToGame())
        }
        return binding.root
    }
}
