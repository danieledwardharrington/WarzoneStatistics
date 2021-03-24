package com.dharringtondev.warzonestats.persistence.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "weekly_table")
data class WeeklyStatsEntity(@ColumnInfo(name = "killsPerGame")
                             var killsPerGame: Double,

                             @ColumnInfo(name = "headshotPercentage")
                             var headshotPercentage: Double,

                             @ColumnInfo(name = "deaths")
                             var deaths: Int,

                             @ColumnInfo(name = "avgLifeTime")
                             var avgLifeTime: Double,

                             @ColumnInfo(name = "kdRatio")
                             var kdRatio: Double,

                             @ColumnInfo(name = "kills")
                             var kills: Int,

                             @ColumnInfo(name = "score")
                             var score: Long,

                             @ColumnInfo(name = "scorePerMinute")
                             var scorePerMinute: Double,

                             @ColumnInfo(name = "timePlayed")
                             var timePlayed: Long,

                             @ColumnInfo(name = "gulagDeaths")
                             var gulagDeaths: Int,

                             @ColumnInfo(name = "platform")
                             var platform: String,

                             @ColumnInfo(name = "player_name")
                             var playerName: String
) {
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0
}
