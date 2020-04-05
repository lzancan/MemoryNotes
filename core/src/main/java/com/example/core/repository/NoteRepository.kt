package com.example.core.repository

import com.example.core.data.Note

class NoteRepository(private val noteDataSource: NoteDataSource) {

    suspend fun addNote(note: Note) = noteDataSource.add(note)

    suspend fun getNote(id: Long) = noteDataSource.get(id)

    suspend fun getAllNotes() = noteDataSource.getAll()

    suspend fun removeNote(note: Note) = noteDataSource.remove(note)
}