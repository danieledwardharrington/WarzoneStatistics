package com.dharringtondev.warzonestats.persistence.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "career_table")
data class CareerStatsEntity(@ColumnInfo(name = "cash")
                             var cash: Long,

                             @ColumnInfo(name = "contracts")
                             var contracts: Int,

                             @ColumnInfo(name = "deaths")
                             var deaths: Int,

                             @ColumnInfo(name = "downs")
                             var downs: Int,

                             @ColumnInfo(name = "games_played")
                             var gamesPlayed: Int,

                             @ColumnInfo(name = "kd_ratio")
                             var kdRatio: Double,

                             @ColumnInfo(name = "kills")
                             var kills: Int,

                             @ColumnInfo(name = "revives")
                             var revives: Int,

                             @ColumnInfo(name = "score")
                             var score: Long,

                             @ColumnInfo(name = "score_per_minute")
                             var scorePerMinute: Double,

                             @ColumnInfo(name = "time_played")
                             var timePlayed: Long,

                             @ColumnInfo(name = "top_five")
                             var topFive: Int,

                             @ColumnInfo(name = "top_ten")
                             var topTen: Int,

                             @ColumnInfo(name = "wins")
                             var wins: Int,

                             @ColumnInfo(name = "player_name")
                             var playerName: String,

                             @ColumnInfo(name = "platform")
                             var platform: String

) {
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0
}
