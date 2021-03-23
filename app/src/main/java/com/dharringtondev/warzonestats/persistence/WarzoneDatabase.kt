package com.dharringtondev.warzonestats.persistence

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.dharringtondev.warzonestats.persistence.daos.CareerDao
import com.dharringtondev.warzonestats.persistence.daos.MatchDao
import com.dharringtondev.warzonestats.persistence.daos.WeeklyDao
import com.dharringtondev.warzonestats.persistence.entities.CareerStatsEntity
import com.dharringtondev.warzonestats.persistence.entities.MatchEntity
import com.dharringtondev.warzonestats.persistence.entities.WeeklyStatsEntity

@Database(entities = [MatchEntity::class, WeeklyStatsEntity::class, CareerStatsEntity::class], version = 1)
abstract class WarzoneDatabase: RoomDatabase() {

    abstract fun matchDao(): MatchDao
    abstract fun careerDao(): CareerDao
    abstract fun weeklyDao(): WeeklyDao

    companion object {
        private var warzoneInstance: WarzoneDatabase? = null

        fun getWarzoneInstance(context: Context): WarzoneDatabase? {
            if (warzoneInstance == null) {
                synchronized(WarzoneDatabase::class) {
                    warzoneInstance = Room.databaseBuilder(
                            context.applicationContext,
                            WarzoneDatabase::class.java,
                            "warzone_db.db"
                    ).fallbackToDestructiveMigration().build()
                }
            }

            return warzoneInstance
        }
    }
}