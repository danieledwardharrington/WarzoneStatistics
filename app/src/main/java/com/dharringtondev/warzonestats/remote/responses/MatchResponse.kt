package com.dharringtondev.warzonestats.remote.responses

import com.dharringtondev.warzonestats.remote.models.MatchModel
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MatchResponse(@SerialName("matches")
                         val results: MutableList<MatchModel>)
