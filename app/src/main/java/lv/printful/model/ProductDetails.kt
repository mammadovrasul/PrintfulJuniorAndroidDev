package lv.printful.model


import com.google.gson.annotations.SerializedName

data class ProductDetails(
    @SerializedName("code")
    val code: Int,
    @SerializedName("extra")
    val extra: List<Any>,
    @SerializedName("result")
    val result: ProductDetailsResult
)