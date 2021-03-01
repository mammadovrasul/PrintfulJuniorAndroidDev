package lv.printful.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import lv.printful.R
import lv.printful.databinding.ProductVariantsListItemBinding
import lv.printful.model.Variant

/**
 * Created by Rasul Mamadov on 2/24/2021.
 */
class ProductSizeAdapter() :
    RecyclerView.Adapter<MyProductDetailViewHolder>() {
    private val productVariants = ArrayList<Variant>()


    fun setList(movies: List<Variant>) {
        productVariants.clear()
        productVariants.addAll(movies)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyProductDetailViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding: ProductVariantsListItemBinding = DataBindingUtil.inflate(
            layoutInflater,
            R.layout.product_variants_list_item,
            parent,
            false
        )
        return MyProductDetailViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return productVariants.size
    }

    override fun onBindViewHolder(holder: MyProductDetailViewHolder, position: Int) {
        holder.bind(productVariants[position])
    }
}

class MyProductDetailViewHolder(val binding: ProductVariantsListItemBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(variants: Variant) {
        binding.variants = variants
    }
}
