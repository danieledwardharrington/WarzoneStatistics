package com.dharringtondev.warzonestats.persistence.daos

import androidx.lifecycle.LiveData
import androidx.room.*
import com.dharringtondev.warzonestats.persistence.entities.MatchEntity

@Dao
interface MatchDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMatch(matchEntity: MatchEntity)

    @Delete
    suspend fun deleteMatch(matchEntity: MatchEntity)

    @Update
    suspend fun updateMatch(matchEntity: MatchEntity)

    @Query("DELETE FROM match_table")
    suspend fun deleteAllMatches()

    @Query("SELECT * FROM match_table")
    suspend fun getAllMatches(): LiveData<List<MatchEntity>>

    @Query("SELECT * FROM match_table WHERE match_id=:matchId")
    suspend fun getSingleMatch(matchId: String): MatchEntity?

}