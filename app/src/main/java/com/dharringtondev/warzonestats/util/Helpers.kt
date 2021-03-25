package com.dharringtondev.warzonestats.util

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.util.Log
import android.view.View
import android.widget.Toast
import com.dharringtondev.warzonestats.persistence.entities.CareerStatsEntity
import com.dharringtondev.warzonestats.persistence.entities.MatchEntity
import com.dharringtondev.warzonestats.persistence.entities.WeeklyStatsEntity
import com.dharringtondev.warzonestats.remote.models.CareerStatsModel
import com.dharringtondev.warzonestats.remote.models.MatchModel
import com.dharringtondev.warzonestats.remote.models.WeeklyPropertiesModel
import com.google.android.material.snackbar.Snackbar

class Helpers(val context: Context) {

    private val TAG = "Helpers"

    //helpers for mapping to retro models to room entities
    fun careerModelToEntity(careerStatsModel: CareerStatsModel, platform: String, playerName: String): CareerStatsEntity {
        return CareerStatsEntity(careerStatsModel.cash,
                careerStatsModel.contracts,
                careerStatsModel.deaths,
                careerStatsModel.downs,
                careerStatsModel.gamesPlayed,
                careerStatsModel.kdRatio,
                careerStatsModel.kills,
                careerStatsModel.revives,
                careerStatsModel.score,
                careerStatsModel.scorePerMinute,
                careerStatsModel.timePlayed,
                careerStatsModel.topFive,
                careerStatsModel.topTen,
                careerStatsModel.wins,
                playerName,
                platform
                )
    }

    fun weeklyModelToEntity(weeklyPropertiesModel: WeeklyPropertiesModel, platform: String, playerName: String): WeeklyStatsEntity {
        return WeeklyStatsEntity(weeklyPropertiesModel.killsPerGame,
                weeklyPropertiesModel.headshotPercentage,
                weeklyPropertiesModel.deaths,
                weeklyPropertiesModel.avgLifeTime,
                weeklyPropertiesModel.kdRatio,
                weeklyPropertiesModel.kills,
                weeklyPropertiesModel.score,
                weeklyPropertiesModel.scorePerMinute,
                weeklyPropertiesModel.timePlayed,
                weeklyPropertiesModel.gulagDeaths,
                platform,
                playerName
                )
    }

    fun matchModelToEntity(matchModel: MatchModel): MatchEntity {
        return MatchEntity(matchModel.matchId,
                matchModel.duration,
                matchModel.playerStats,
                matchModel.gameType,
                matchModel.isPrivateMatch,
                matchModel.rankedTeams,
                matchModel.teamCount,
                matchModel.playerCount
        )
    }

    //toast/snackbar helpers
    fun showShortToast(message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

    fun showLongToast(message: String) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }

    fun showShortSnackbar(view: View, message: String) {
        Snackbar.make(view, message, Snackbar.LENGTH_SHORT).show()
    }

    fun showLongSnackbar(view: View, message: String) {
        Snackbar.make(view, message, Snackbar.LENGTH_LONG).show()
    }

    //network check function
    fun isOnline(context: Context): Boolean {
        val connectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

        val capabilities = connectivityManager.getNetworkCapabilities(connectivityManager.activeNetwork)

        if (capabilities != null) {
            when {
                capabilities.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> {
                    Log.i(TAG, "NetworkCapabilities.TRANSPORT_CELLULAR")
                    return true
                }
                capabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> {
                    Log.i(TAG, "NetworkCapabilities.TRANSPORT_WIFI")
                    return true
                }
                capabilities.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET) -> {
                    Log.i(TAG, "NetworkCapabilities.TRANSPORT_ETHERNET")
                    return true
                }
            }
        }
        return false
    }

}