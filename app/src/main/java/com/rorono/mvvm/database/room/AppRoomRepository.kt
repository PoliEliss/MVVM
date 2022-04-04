package com.rorono.mvvm.database.room

import androidx.lifecycle.LiveData
import com.rorono.mvvm.database.DatabaseRepository
import com.rorono.mvvm.models.AppNote

class AppRoomRepository(private  val appRoomDao: AppRoomDao):DatabaseRepository {

    override val allNotes: LiveData<List<AppNote>>
        get() = appRoomDao.getAllNotes()

    override suspend fun insert(note: AppNote, onSuccess: () -> Unit) {
        appRoomDao.insert(note)
    }

    override suspend fun delete(note: AppNote, onSuccess: () -> Unit) {
       appRoomDao.delete(note)
    }
}