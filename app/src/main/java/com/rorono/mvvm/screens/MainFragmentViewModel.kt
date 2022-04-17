package com.rorono.mvvm.screens

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.rorono.mvvm.utilits.REPOSITORY

class MainFragmentViewModel(application:Application):AndroidViewModel(application) {

    val allNotes = REPOSITORY.allNotes
}