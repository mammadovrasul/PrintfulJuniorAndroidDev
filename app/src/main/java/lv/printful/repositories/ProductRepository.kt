package lv.printful.repositories

import lv.printful.service.ApiService
import lv.printful.service.RetrofitInstance
import lv.printful.model.Products

/**
 * Created by Rasul Mamadov on 2/23/2021.
 */
class ProductRepository {
    suspend fun getProduct(): Products? {
        val retService = RetrofitInstance
            .getRetrofitInstance()
            .create(ApiService::class.java)
        val response = retService.getProduct()
        return response
    }
}