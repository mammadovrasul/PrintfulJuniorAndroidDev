package lv.printful.model


import com.google.gson.annotations.SerializedName

data class File(
    @SerializedName("additional_price")
    val additionalPrice: Any,
    @SerializedName("id")
    val id: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("type")
    val type: String
)