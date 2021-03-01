package lv.printful.model


import com.google.gson.annotations.SerializedName

data class Dimensions(
    @SerializedName("default")
    val default: String,
    @SerializedName("front")
    val front: String,
    @SerializedName("L")
    val l: String,
    @SerializedName("M")
    val m: String,
    @SerializedName("11oz")
    val oz: String,
    @SerializedName("S")
    val s: String,
    @SerializedName("side")
    val side: String,
    @SerializedName("10x10")
    val x10: String,
    @SerializedName("16x16")
    val x16: String,
    @SerializedName("XL")
    val xL: String,
    @SerializedName("XS")
    val xS: String,
)