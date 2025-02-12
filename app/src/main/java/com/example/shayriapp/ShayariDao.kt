package com.example.shayriapp

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

@Dao
 interface ShayariDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertShayari(dataEntity: DataEntity)
    @Delete

    suspend fun deleteShayari(dataEntity: DataEntity)
    @Update

    suspend fun updateShayari(dataEntity: DataEntity)
    @Query("SELECT * From shayari_table ORDER BY date DESC ")

    fun getAllShayari():List<DataEntity>



}