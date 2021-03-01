package lv.printful.ui.detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

/**
 * Created by Rasul Mamadov on 2/24/2021.
 */
class ProductDetailsViewModelFactory(private val productId : String) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ProductDetailsViewModel::class.java)){
            return ProductDetailsViewModel(productId) as T
        }
        throw IllegalArgumentException("Unknown View Model Class")
    }
}