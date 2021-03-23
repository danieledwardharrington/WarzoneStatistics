package com.dharringtondev.warzonestats.repository

import android.app.Application
import com.dharringtondev.warzonestats.persistence.WarzoneDatabase

class WarzoneRepository(application: Application) {

    private val warzoneDatabase = WarzoneDatabase.getWarzoneInstance(application)
    private val matchDao = warzoneDatabase!!.matchDao()
    private val careerDao = warzoneDatabase!!.careerDao()
    private val weeklyDao = warzoneDatabase!!.weeklyDao()

}