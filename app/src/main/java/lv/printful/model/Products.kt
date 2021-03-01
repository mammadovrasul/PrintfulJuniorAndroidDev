package lv.printful.model


import com.google.gson.annotations.SerializedName

data class Products(
    @SerializedName("code")
    val code: Int,
    @SerializedName("extra")
    val extra: List<Any>,
    @SerializedName("result")
    val result: ArrayList<Result>
)