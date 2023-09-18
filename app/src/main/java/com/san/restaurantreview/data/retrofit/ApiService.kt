package com.san.restaurantreview.data.retrofit

import com.san.restaurantreview.data.response.PostReviewResponse
import com.san.restaurantreview.data.response.RestaurantResponse
import retrofit2.Call
import retrofit2.http.*

interface ApiService {
    @GET("detail/{id}")
    fun getRestaurant(
        @Path("id") id: String
    ): Call<RestaurantResponse>

    @FormUrlEncoded
    @Headers("Authorization: token 123456")
    @POST("review")
    fun postReview (
        @Field("id") id: String,
        @Field("name") name:String,
        @Field("review") review:String
    ): Call<PostReviewResponse>
}