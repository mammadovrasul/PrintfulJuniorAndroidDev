package lv.printful.ui.products

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import lv.printful.model.Products
import lv.printful.repositories.ProductRepository

/**
 * Created by Rasul Mamadov on 2/23/2021.
 */
class ProductsViewModel : ViewModel() {

    private var productRepository: ProductRepository

    init {
        productRepository = ProductRepository()
    }

    val responseProducts: LiveData<Products> = liveData() {
        val response = productRepository.getProduct()
        if (response != null) {
            emit(response)
        }

    }
}