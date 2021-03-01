package lv.printful.service

import lv.printful.model.ProductDetails
import lv.printful.model.Products
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by Rasul Mamadov on 1/20/2021.
 */
interface ApiService {
    @GET("products")//url endpoint
    suspend fun getProduct() : Products

    @GET("products/{id}")//url endpoint
    suspend fun getProductDetails(@Path("id") id: String) : ProductDetails
}