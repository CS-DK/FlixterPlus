package com.example.flixterplus

import com.google.gson.annotations.SerializedName

class Movie {
    @SerializedName("original_title")
    var movieName: String? = null

    @JvmField
    @SerializedName("overview")
    var movieDescription: String? = null

    @JvmField
    @SerializedName("poster_path")
    var movieImage: String? = null
}