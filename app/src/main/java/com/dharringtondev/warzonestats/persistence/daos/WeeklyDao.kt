package com.dharringtondev.warzonestats.persistence.daos

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.dharringtondev.warzonestats.persistence.entities.WeeklyStatsEntity

@Dao
interface WeeklyDao {

    @Insert
    suspend fun insertWeeklyStats(weeklyStatsEntity: WeeklyStatsEntity)

    @Delete
    suspend fun deleteWeeklyStats(weeklyStatsEntity: WeeklyStatsEntity)

    @Query("DELETE FROM weekly_table")
    suspend fun deleteAllWeeklyStats()

    @Query("SELECT * FROM weekly_table")
    suspend fun getAllWeeklyStats(): List<WeeklyStatsEntity>

    @Query("SELECT * FROM weekly_table WHERE platform=:platform AND player_name=:playerName")
    suspend fun getSingleWeeklyStats(platform: String, playerName: String): WeeklyStatsEntity

}