package com.dharringtondev.warzonestats.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class WarzoneViewModelFactory(application: Application): ViewModelProvider.Factory {

    private var mApplication = application

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        @Suppress("UNCHECKED_CAST")
        return WarzoneViewModel(mApplication) as T
    }
}