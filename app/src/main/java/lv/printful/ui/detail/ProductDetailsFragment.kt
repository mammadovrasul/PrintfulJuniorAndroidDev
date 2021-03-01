package lv.printful.ui.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import lv.printful.R
import lv.printful.adapter.ProductSizeAdapter
import lv.printful.databinding.FragmentProductDetailsBinding

class ProductDetailsFragment : Fragment() {

    private lateinit var binding: FragmentProductDetailsBinding
    private lateinit var productDetailsViewModel: ProductDetailsViewModel
    private lateinit var viewModelFactory: ProductDetailsViewModelFactory
    private lateinit var adapter: ProductSizeAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_product_details, container, false)
        var  input : String? = requireArguments().getString("productId")
        viewModelFactory = ProductDetailsViewModelFactory(input!!)
        productDetailsViewModel =
            ViewModelProvider(this, viewModelFactory).get(ProductDetailsViewModel::class.java)

        getProductDetails()

        binding.recyclerViewSize.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        adapter = ProductSizeAdapter()
        binding.recyclerViewSize.adapter = adapter


        return binding.root
    }

    fun getProductDetails() {
        productDetailsViewModel.responseProductDetails.observe(viewLifecycleOwner, Observer {
            if (it != null) {
                binding.productDetailsModel = it.result
                adapter.setList(it.result.variants)
                adapter.notifyDataSetChanged()
            }
        })
    }

}