package com.rorono.mvvm.database.room

import androidx.lifecycle.LiveData
import androidx.room.*
import com.rorono.mvvm.models.AppNote

@Dao //расшировывается как Data access object
interface AppRoomDao {

    @Query("SELECT * from notes_tables")
    fun getAllNotes():LiveData<List<AppNote>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(note: AppNote)

    @Delete
    suspend fun delete(note: AppNote)
}