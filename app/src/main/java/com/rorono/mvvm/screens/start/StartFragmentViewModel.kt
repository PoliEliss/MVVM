package com.rorono.mvvm.screens.start

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import com.rorono.mvvm.database.room.AppRoomDataBase
import com.rorono.mvvm.utilits.TYPE_ROOM

class StartFragmentViewModel(aplication:Application):AndroidViewModel(aplication){
    private val mContext= aplication

    fun initdataBase(type:String){
        when(type){
            TYPE_ROOM->{
                val dao = AppRoomDataBase.getInstance(mContext).getAppRoomDao()
            }

        }

    }


}