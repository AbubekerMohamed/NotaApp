package com.insa.notaapp.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.insa.notaapp.ui.theme.*

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
){
    companion object{
        val noteColors = listOf(RedOrange,LightGreen, Violet, BabyBlue, RedPink)
    }
}

/*
* * A base Class for NoteException
* */
class InvalidNoteException(message: String): Exception(message)