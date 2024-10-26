package com.example.RestApi_DIPTI_21

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.RestApi_DIPTI_21.Adapter.ProductAdapter
import com.example.RestApi_DIPTI_21.ViewModel.ProductViewModel
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ProductActivity_21 : AppCompatActivity() {
    private lateinit var productViewModel: ProductViewModel
    private lateinit var productAdapter: ProductAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_21)

        productViewModel = ViewModelProvider(this).get(ProductViewModel::class.java)
        productAdapter = ProductAdapter(emptyList())

        val refreshbtn:FloatingActionButton = findViewById(R.id.refreshBtn)
        refreshbtn.setOnClickListener{
            startActivity(Intent(this@ProductActivity_21,ProductActivity_21::class.java))
            finish()
        }
        val recyclerView : RecyclerView = findViewById(R.id.productRV)
        recyclerView.layoutManager = LinearLayoutManager(this)

        productViewModel.products.observe(this, Observer { product ->
            productAdapter = ProductAdapter(product)
            recyclerView.adapter = productAdapter
        })
    }
}