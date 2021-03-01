package lv.printful.model


import com.google.gson.annotations.SerializedName

data class ProductDetailsResult(
    @SerializedName("product")
    val product: Product,
    @SerializedName("variants")
    val variants: List<Variant>
)