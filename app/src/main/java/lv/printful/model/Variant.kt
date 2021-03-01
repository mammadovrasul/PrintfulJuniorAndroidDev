package lv.printful.model


import com.google.gson.annotations.SerializedName

data class Variant(
    @SerializedName("availability_regions")
    val availabilityRegions: AvailabilityRegions,
    @SerializedName("availability_status")
    val availabilityStatus: List<AvailabilityStatu>,
    @SerializedName("color")
    val color: String,
    @SerializedName("color_code")
    val colorCode: String,
    @SerializedName("color_code2")
    val colorCode2: Any,
    @SerializedName("id")
    val id: Int,
    @SerializedName("image")
    val image: String,
    @SerializedName("in_stock")
    val inStock: Boolean,
    @SerializedName("name")
    val name: String,
    @SerializedName("price")
    val price: String,
    @SerializedName("product_id")
    val productId: Int,
    @SerializedName("size")
    val size: String
)