package com.example.memorynotes.framework

import com.example.core.usecase.*

class UseCases (
    val addNote: AddNote,
    val getAllNotes: GetAllNotes,
    val getNote: GetNote,
    val removeNote: RemoveNote,
    val getWordCount: GetWordCount
)