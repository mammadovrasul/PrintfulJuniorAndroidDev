package lv.printful.model


import com.google.gson.annotations.SerializedName

data class Option(
    @SerializedName("additional_price")
    val additionalPrice: Any,
    @SerializedName("additional_price_breakdown")
    val additionalPriceBreakdown: Any,
    @SerializedName("id")
    val id: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("values")
    val values: Any
)