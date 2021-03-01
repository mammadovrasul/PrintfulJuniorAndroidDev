package lv.printful.model


import com.google.gson.annotations.SerializedName

data class AvailabilityRegions(
    @SerializedName("US")
    val uS: String
)