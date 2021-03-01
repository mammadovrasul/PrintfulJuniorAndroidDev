package lv.printful.model


import com.google.gson.annotations.SerializedName

data class Result(
    @SerializedName("avg_fulfillment_time")
    val avgFulfillmentTime: Any,
    @SerializedName("brand")
    val brand: Any,
    @SerializedName("currency")
    val currency: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("dimensions")
    val dimensions: Dimensions,
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