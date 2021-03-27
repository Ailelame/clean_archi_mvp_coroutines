package com.stormbirdmedia.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.stormbirdmedia.local.dao.BasicCryptoDao
import com.stormbirdmedia.local.model.BasicCryptoLocal


@Database(entities = [BasicCryptoLocal::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun basicCryptoDao(): BasicCryptoDao
}