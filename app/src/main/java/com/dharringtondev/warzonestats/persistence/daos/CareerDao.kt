package com.dharringtondev.warzonestats.persistence.daos

import androidx.room.*
import com.dharringtondev.warzonestats.persistence.entities.CareerStatsEntity

@Dao
interface CareerDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCareerStats(careerStatsEntity: CareerStatsEntity)

    @Delete
    suspend fun deleteCareerStats(careerStatsEntity: CareerStatsEntity)

    @Query("DELETE FROM career_table")
    suspend fun deleteAllCareerStats()

    @Query("SELECT * FROM career_table ORDER BY id ASC")
    suspend fun getAllCareerStats(): List<CareerStatsEntity>

    @Query("SELECT * FROM career_table WHERE platform=:platform AND player_name=:playerName")
    suspend fun getSingleCareer(platform: String, playerName: String): CareerStatsEntity

}