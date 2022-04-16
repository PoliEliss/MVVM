package com.rorono.mvvm.screens

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.rorono.mvvm.models.AppNote
import com.rorono.mvvm.utilits.REPOSITORY
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch
import okhttp3.Dispatcher
import kotlinx.coroutines.Dispatchers

class AddNewViewNoteModel (application: Application):AndroidViewModel(application){

    fun insert(note:AppNote,onSuccess:()->Unit){
        viewModelScope.launch(Dispatchers.IO){
            REPOSITORY.insert(note){
                onSuccess()
            }
        }
    }
}