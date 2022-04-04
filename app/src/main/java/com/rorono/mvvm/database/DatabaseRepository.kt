package com.rorono.mvvm.database

import androidx.lifecycle.LiveData
import com.rorono.mvvm.models.AppNote
import io.reactivex.internal.operators.single.SingleDoOnSuccess

interface DatabaseRepository {

    val allNotes:LiveData<List<AppNote>> // получать все записи

    suspend fun insert(note: AppNote,onSuccess:()->Unit) // добавить
    suspend fun delete(note: AppNote,onSuccess:()->Unit) // удалить
}