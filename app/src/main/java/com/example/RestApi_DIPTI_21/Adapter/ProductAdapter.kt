package com.example.RestApi_DIPTI_21.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.RestApi_DIPTI_21.Product_21
import com.example.RestApi_DIPTI_21.R

class ProductAdapter (private val product21 : List<Product_21>) : RecyclerView.Adapter<ProductAdapter.ProductViewHolder> (){
    inner class ProductViewHolder (itemView:View) : RecyclerView.ViewHolder(itemView){

        val productImg:ImageView = itemView.findViewById(R.id.productImage)
        val productTitle:TextView = itemView.findViewById(R.id.productTitletv)
        val productId:TextView = itemView.findViewById(R.id.productIdtv)
        val productPrice:TextView = itemView.findViewById(R.id.productPriceTv)
        val productDesc:TextView = itemView.findViewById(R.id.productDescTv)

        fun bind(product21: Product_21){
            Glide.with(itemView)
                .load(product21.images[0])
                .into(productImg)
            productTitle.text = product21.title
            productId.text = product21.Id.toString()
            productPrice.text = "$${product21.price}"
            productDesc.text = product21.Description
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.product_list_21,parent,false)
        return ProductViewHolder(view)
    }

    override fun getItemCount(): Int {
        return product21.size
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val product = product21[position]
        holder.bind (product)
    }
}