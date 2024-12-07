package com.tarikuzzamantito.apps.onlineshop.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.tarikuzzamantito.apps.onlineshop.model.CategoryModel
import com.tarikuzzamantito.apps.onlineshop.model.ItemsModel
import com.tarikuzzamantito.apps.onlineshop.model.SliderModel
import com.tarikuzzamantito.apps.onlineshop.repository.MainRepository

/**
 * Created by Tarikuzzaman Tito on 12/5/2024 7:45 AM
 */
class MainViewModel() : ViewModel() {
    private val repository = MainRepository()

    fun loadBanner(): LiveData<MutableList<SliderModel>> {
        return repository.loadBanner()
    }

    fun loadCategory(): LiveData<MutableList<CategoryModel>> {
        return repository.loadCategory()
    }

    fun loadPopular(): LiveData<MutableList<ItemsModel>> {
        return repository.loadPopular()
    }

    fun loadFiltered(id: String): LiveData<MutableList<ItemsModel>> {
        return repository.loadFiltered(id)
    }
}