package com.dharringtondev.warzonestats.repository

import android.app.Application
import com.dharringtondev.warzonestats.persistence.WarzoneDatabase
import com.dharringtondev.warzonestats.persistence.entities.MatchEntity

class WarzoneRepository(application: Application) {

    private val warzoneDatabase = WarzoneDatabase.getWarzoneInstance(application)
    private val matchDao = warzoneDatabase!!.matchDao()
    private val careerDao = warzoneDatabase!!.careerDao()
    private val weeklyDao = warzoneDatabase!!.weeklyDao()

    fun insertMatch(matchEntity: MatchEntity) {
        
    }

}