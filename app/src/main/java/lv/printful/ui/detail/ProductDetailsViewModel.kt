package lv.printful.ui.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import lv.printful.model.ProductDetails
import lv.printful.repositories.ProductDetailsRepository

/**
 * Created by Rasul Mamadov on 2/23/2021.
 */
class ProductDetailsViewModel(productItemId : String) : ViewModel() {

    private var productRepository: ProductDetailsRepository
    private  var productId : String

    init {
        productRepository = ProductDetailsRepository()
        productId = productItemId
    }

    val responseProductDetails: LiveData<ProductDetails> = liveData() {
        val response = productRepository.getProduct(productId)
        if (response != null) {
            emit(response)
        }

    }
}