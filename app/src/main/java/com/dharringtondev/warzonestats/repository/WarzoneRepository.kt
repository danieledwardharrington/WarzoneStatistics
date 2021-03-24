package com.dharringtondev.warzonestats.repository

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.dharringtondev.warzonestats.persistence.WarzoneDatabase
import com.dharringtondev.warzonestats.persistence.entities.CareerStatsEntity
import com.dharringtondev.warzonestats.persistence.entities.MatchEntity
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class WarzoneRepository(application: Application) {

    private val warzoneDatabase = WarzoneDatabase.getWarzoneInstance(application)!!
    private val matchDao = warzoneDatabase.matchDao()
    private val careerDao = warzoneDatabase.careerDao()
    private val weeklyDao = warzoneDatabase.weeklyDao()

    //match live data
    private var allMatchesLD = MutableLiveData<List<MatchEntity>>()
    private var singleMatchLD = MutableLiveData<MatchEntity>()

    //career live data
    private var allCareerStatsLD = MutableLiveData<List<CareerStatsEntity>>()
    private var singleCareerLD = MutableLiveData<CareerStatsEntity>()

    //MATCH FUNCTIONS
    fun insertMatch(matchEntity: MatchEntity) {
        GlobalScope.launch {
            warzoneDatabase.matchDao().insertMatch(matchEntity)
            getAllMatches()
        }
    }

    fun deleteMatch(matchEntity: MatchEntity) {
        GlobalScope.launch {
            warzoneDatabase.matchDao().deleteMatch(matchEntity)
            getAllMatches()
        }
    }

    fun deleteAllMatches() {
        GlobalScope.launch {
            warzoneDatabase.matchDao().deleteAllMatches()
        }
    }

    fun getAllMatches() {
        GlobalScope.launch {
            allMatchesLD.postValue(warzoneDatabase.matchDao().getAllMatches())
        }
    }

    fun getSingleMatch(matchId: String) {
        GlobalScope.launch {
            singleMatchLD.postValue(warzoneDatabase.matchDao().getSingleMatch(matchId))
        }
    }

    //CAREER FUNCTIONS
    fun insertCareerStats(careerStatsEntity: CareerStatsEntity) {
        GlobalScope.launch {
            warzoneDatabase.careerDao().insertCareerStats(careerStatsEntity)
            getAllCareerStats()
        }
    }

    fun deleteCareerStats(careerStatsEntity: CareerStatsEntity) {
        GlobalScope.launch {
            warzoneDatabase.careerDao().deleteCareerStats(careerStatsEntity)
            getAllCareerStats()
        }
    }

    fun deleteAllCareerStats() {
        GlobalScope.launch {
            warzoneDatabase.careerDao().deleteAllCareerStats()
        }
    }

    fun getAllCareerStats() {
        GlobalScope.launch {
            allCareerStatsLD.postValue(warzoneDatabase.careerDao().getAllCareerStats())
        }
    }

    fun getSingleCareer(platform: String, playerName: String) {
        GlobalScope.launch {
            singleCareerLD.postValue(warzoneDatabase.careerDao().getSingleCareer(platform, playerName))
        }
    }

    //WEEKLY FUNCTIONS

}