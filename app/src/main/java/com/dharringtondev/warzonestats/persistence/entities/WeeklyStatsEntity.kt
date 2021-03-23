package com.dharringtondev.warzonestats.persistence.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "weekly_table")
data class WeeklyStatsEntity(@ColumnInfo(name = "killsPerGame")
                             val killsPerGame: Double,

                             @ColumnInfo(name = "headshotPercentage")
                             val headshotPercentage: Double,

                             @ColumnInfo(name = "deaths")
                             val deaths: Int,

                             @ColumnInfo(name = "avgLifeTime")
                             val avgLifeTime: Double,

                             @ColumnInfo(name = "kdRatio")
                             val kdRatio: Double,

                             @ColumnInfo(name = "kills")
                             val kills: Int,

                             @ColumnInfo(name = "score")
                             val score: Long,

                             @ColumnInfo(name = "scorePerMinute")
                             val scorePerMinute: Double,

                             @ColumnInfo(name = "timePlayed")
                             val timePlayed: Long,

                             @ColumnInfo(name = "gulagDeaths")
                             val gulagDeaths: Int,

                             @ColumnInfo(name = "platform")
                             val platform: String,

                             @PrimaryKey(autoGenerate = true)
                             var id: Long
)
