package com.tarikuzzamantito.apps.onlineshop.model

import java.io.Serializable

/**
 * Created by Tarikuzzaman Tito on 12/5/2024 5:10 PM
 */
data class ItemsModel(
    var title: String = "",
    var description: String = "",
    var picUrl: ArrayList<String> = ArrayList(),
    val model: ArrayList<String> = ArrayList(),
    var price: Double = 0.0,
    var rating: Double = 0.0,
    var numberInCart: Int = 0,
    var showRecommended: Boolean = false,
    var categoryId: String = ""
) : Serializable
