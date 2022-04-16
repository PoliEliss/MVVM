package com.rorono.mvvm.utilits

import com.rorono.mvvm.MainActivity
import com.rorono.mvvm.database.DatabaseRepository

lateinit var APP_ACTIVITY:MainActivity

lateinit var REPOSITORY:DatabaseRepository

const val TYPE_DATABASE = "type_database"
const val TYPE_ROOM = "room"