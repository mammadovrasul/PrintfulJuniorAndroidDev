package lv.printful.model


import com.google.gson.annotations.SerializedName
import lv.printful.model.File
import lv.printful.model.Option

data class Product(
    @SerializedName("avg_fulfillment_time")
    val avgFulfillmentTime: Any,
    @SerializedName("brand")
    val brand: String,
    @SerializedName("currency")
    val currency: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("dimensions")
    val dimensions: Any,
    @SerializedName("files")
    val files: List<File>,
    @SerializedName("id")
    val id: Int,
    @SerializedName("image")
    val image: String,
    @SerializedName("is_discontinued")
    val isDiscontinued: Boolean,
    @SerializedName("model")
    val model: String,
    @SerializedName("options")
    val options: List<Option>,
    @SerializedName("type")
    val type: String,
    @SerializedName("type_name")
    val typeName: String,
    @SerializedName("variant_count")
    val variantCount: Int
)