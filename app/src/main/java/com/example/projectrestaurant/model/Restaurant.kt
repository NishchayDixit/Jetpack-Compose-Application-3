package com.example.projectrestaurant.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Restaurant(
    @DrawableRes val image: Int,
    @StringRes val restaurantName: Int,
    @StringRes val restaurantDetail: Int,
    @StringRes val restaurantRating: Int,
    @StringRes val resPrice: Int
)
