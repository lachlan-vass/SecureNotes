package com.lachlanvass.securenotes.data.repository

import com.lachlanvass.securenotes.data.datasource.NoteDao
import com.lachlanvass.securenotes.domain.model.Note
import com.lachlanvass.securenotes.domain.repository.NoteRepository

class NoteRepositoryImpl(private val dao: NoteDao) : NoteRepository {

    override fun getNotes(): List<Note?> {
        return dao.getNotes()
    }

    override suspend fun insertNote(note: Note) {
        dao.insertNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        dao.deleteNote(note)
    }
}