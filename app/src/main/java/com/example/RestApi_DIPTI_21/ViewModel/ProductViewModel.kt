package com.example.RestApi_DIPTI_21.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.RestApi_DIPTI_21.ApiInstance_21
import com.example.RestApi_DIPTI_21.Product_21

import kotlinx.coroutines.launch

class ProductViewModel: ViewModel() {

    private val _products = MutableLiveData<List<Product_21>>()
    val products: LiveData<List<Product_21>> = _products
    init {
        viewModelScope.launch {
            fetchProducts()
        }
    }

    private  suspend fun fetchProducts() {
        try {
            val response = ApiInstance_21.apiService.getProducts()
            _products.postValue(response)
        }catch (e:Exception){
            e.printStackTrace()
        }
    }
}