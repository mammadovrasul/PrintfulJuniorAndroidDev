package lv.printful.repositories

import lv.printful.model.ProductDetails
import lv.printful.service.ApiService
import lv.printful.service.RetrofitInstance

/**
 * Created by Rasul Mamadov on 2/23/2021.
 */
class ProductDetailsRepository {
    suspend fun getProduct(productId : String): ProductDetails? {
        val retService = RetrofitInstance
            .getRetrofitInstance()
            .create(ApiService::class.java)
        val response = retService.getProductDetails(productId)
        return response
    }
}