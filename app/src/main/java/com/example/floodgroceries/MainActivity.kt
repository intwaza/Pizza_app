  package com.example.floodgroceries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

  class MainActivity : AppCompatActivity() {
    lateinit var rvItems:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        displayProduct()
    }
      fun displayProduct(){
          var productList= listOf(
              Products("https://media.istockphoto.com/photos/homemade-hot-cheese-pizza-picture-id522398707?k=6&m=522398707&s=612x612&w=0&h=p3aZXJe44S_nJn7eDCRMs04FfIMJvSdoKDQft6svbzc=","Chess Pizza"),
              Products("https://static.toiimg.com/thumb/59696130.cms?imgsize=1530680&width=800&height=800","Sausage Pizza"),
              Products("https://www.rockrecipes.com/wp-content/uploads/2008/03/Barbecue-Steak-Pizza-close-up-photo-of-cut-pizza-on-a-wooden-cutting-board.jpg","Beef Pizza"),
              Products("https://www.budgetbytes.com/wp-content/uploads/2016/05/Bacon-and-Caramelized-Bacon-Pizza-cooked-1-500x480.jpg","Bacon Pizza")
          )
          rvItems= findViewById(R.id.rvItems)
          var itemsAdapter= RvAdapterProducts(baseContext,productList)
          rvItems.layoutManager= LinearLayoutManager(baseContext)
          rvItems.adapter= itemsAdapter
      }
}