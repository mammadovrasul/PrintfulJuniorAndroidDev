package lv.printful.model


import com.google.gson.annotations.SerializedName

data class AvailabilityStatu(
    @SerializedName("region")
    val region: String,
    @SerializedName("status")
    val status: String
)