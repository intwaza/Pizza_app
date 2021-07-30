package com.example.floodgroceries

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class RvAdapterProducts(var context:Context, var productList: List<Products>): RecyclerView.Adapter<ProductViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
      var itemView=LayoutInflater.from(parent.context)
          .inflate(R.layout.pizza_items,parent,false)
        return ProductViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        var currentProducts= productList.get(position)
        holder.productName.text= currentProducts.text
        Picasso.get()
            .load(currentProducts.image)
            .resize(200,100)
            .centerCrop()
            .into(holder.productImage)

    }

    override fun getItemCount(): Int {
        return productList.size
    }
}
class ProductViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var productImage= itemView.findViewById<ImageView>(R.id.imgProduct)
    var productName= itemView.findViewById<TextView>(R.id.tvName)

}