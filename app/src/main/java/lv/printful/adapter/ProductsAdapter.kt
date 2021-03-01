package lv.printful.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import lv.printful.R
import lv.printful.databinding.ProductsListItemBinding
import lv.printful.model.Result
import lv.printful.util.ProductItemClickListener

/**
 * Created by Rasul Mamadov on 2/23/2021.
 */
class ProductsAdapter(itemClickLister: ProductItemClickListener) :
    RecyclerView.Adapter<MyViewHolder>() {
    private val productList = ArrayList<Result>()
    var itemClickLister: ProductItemClickListener

    init {
        this.itemClickLister = itemClickLister
    }


    fun setList(movies: ArrayList<Result>) {
        productList.clear()
        productList.addAll(movies)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding: ProductsListItemBinding = DataBindingUtil.inflate(
            layoutInflater,
            R.layout.products_list_item,
            parent,
            false
        )
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return productList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(productList[position])

        holder.binding.productItemCard.setOnClickListener(View.OnClickListener {
            itemClickLister.clickProductItem(
                productList[position].id
            )
        })
    }
}

class MyViewHolder(val binding: ProductsListItemBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(product: Result) {
        binding.productModel = product
    }
}

