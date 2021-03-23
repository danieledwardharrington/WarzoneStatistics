package com.dharringtondev.warzonestats.persistence.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import com.dharringtondev.warzonestats.remote.models.PlayerStatsModel
import com.dharringtondev.warzonestats.remote.models.TeamModel

@Entity(tableName = "match_table", indices = [Index(value = arrayOf("matchId"), unique = true)])
data class MatchEntity(@ColumnInfo(name = "match_id")
                       val matchId: String,

                       @ColumnInfo(name = "duration")
                       val duration: Int,

                       @ColumnInfo(name = "player_stats")
                       val playerStats: PlayerStatsModel,

                       @ColumnInfo(name = "game_type")
                       val gameType: String,

                       @ColumnInfo(name = "private_match")
                       val isPrivateMatch: Boolean,

                       @ColumnInfo(name = "ranked_teams")
                       val rankedTeams: MutableList<TeamModel>,

                       @ColumnInfo(name = "team_count")
                       val teamCount: Int,

                       @ColumnInfo(name = "player_count")
                       val playerCount: Int
)
