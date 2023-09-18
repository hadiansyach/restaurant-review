package com.san.restaurantreview.data.response

import com.google.gson.annotations.SerializedName

data class RestaurantResponse(

	@field:SerializedName("restaurant")
	val restaurant: Restaurant,

	@field:SerializedName("error")
	val error: Boolean,

	@field:SerializedName("message")
	val message: String
)