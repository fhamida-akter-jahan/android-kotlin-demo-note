package com.example.demoapp.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

// on below line we are specifying our table name
@Entity(tableName = "notesTable")

data class Note(
    @ColumnInfo(name = "title")
    val noteTitle: String,
    @ColumnInfo(name = "description")
    val noteDescription: String,
    @ColumnInfo(name = "timestamp")
    val timeStamp: String,
    // on below line we are specifying our key and
    // then auto generate as true and we are
    // specifying its initial value as 0
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
)
