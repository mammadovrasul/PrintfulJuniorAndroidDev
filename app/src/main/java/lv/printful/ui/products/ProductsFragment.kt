package lv.printful.ui.products

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import lv.printful.R
import lv.printful.adapter.ProductsAdapter
import lv.printful.databinding.FragmentProductsBinding
import lv.printful.util.ProductItemClickListener

/**
 * Created by Rasul Mamadov on 2/23/2021.
 */
class ProductsFragment : Fragment(), ProductItemClickListener {

    private lateinit var productViewModel: ProductsViewModel
    private lateinit var adapter: ProductsAdapter
    private lateinit var binding: FragmentProductsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_products, container, false)
        productViewModel = ViewModelProvider(this).get(ProductsViewModel::class.java)


        getProductsList()
        binding.productList.layoutManager = GridLayoutManager(context, 2)
        adapter = ProductsAdapter(this)
        binding.productList.adapter = adapter

        return binding.root
    }

    fun getProductsList() {
        productViewModel.responseProducts.observe(viewLifecycleOwner, Observer {
            if (it != null) {
                binding.progressBar.visibility = View.GONE
                adapter.setList(it.result)
                adapter.notifyDataSetChanged()
            }
        })
    }


    override fun clickProductItem(id: Int) {
        val bundle: Bundle =
            bundleOf("productId" to id.toString())
        findNavController().navigate(R.id.action_productsFragment_to_productDetailsFragment, bundle)
    }
}