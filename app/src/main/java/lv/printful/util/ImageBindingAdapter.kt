package lv.printful.util

import android.util.Log
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import lv.printful.R

/**
 * Created by Rasul Mamadov on 2/24/2021.
 */
class ImageBindingAdapter {
    //This BindingAdapter is used for loading image
    companion object {
        @JvmStatic
        @BindingAdapter("loadImage")
        fun loadImage(imageView: ImageView, url: String) {
            if (url != null) {
                Glide.with(imageView)
                    .load(url)
                    .placeholder(R.drawable.ic_background)
                    .error(R.drawable.ic_background)
                    .into(imageView)
            }
        }
    }
}