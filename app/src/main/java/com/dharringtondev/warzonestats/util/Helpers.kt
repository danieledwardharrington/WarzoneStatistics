package com.dharringtondev.warzonestats.util

import com.dharringtondev.warzonestats.persistence.entities.CareerStatsEntity
import com.dharringtondev.warzonestats.persistence.entities.MatchEntity
import com.dharringtondev.warzonestats.persistence.entities.WeeklyStatsEntity
import com.dharringtondev.warzonestats.remote.models.CareerStatsModel
import com.dharringtondev.warzonestats.remote.models.MatchModel
import com.dharringtondev.warzonestats.remote.models.WeeklyPropertiesModel

class Helpers {

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

}