package com.dharringtondev.warzonestats.persistence.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import com.dharringtondev.warzonestats.remote.models.PlayerStatsModel
import com.dharringtondev.warzonestats.remote.models.TeamModel

@Entity(tableName = "match_table", indices = [Index(value = arrayOf("matchId"), unique = true)])
data class MatchEntity(@ColumnInfo(name = "match_id")
                       var matchId: String,

                       @ColumnInfo(name = "duration")
                       var duration: Int,

                       @ColumnInfo(name = "player_stats")
                       var playerStats: PlayerStatsModel,

                       @ColumnInfo(name = "game_type")
                       var gameType: String,

                       @ColumnInfo(name = "private_match")
                       var isPrivateMatch: Boolean,

                       @ColumnInfo(name = "ranked_teams")
                       var rankedTeams: MutableList<TeamModel>,

                       @ColumnInfo(name = "team_count")
                       var teamCount: Int,

                       @ColumnInfo(name = "player_count")
                       var playerCount: Int
)
