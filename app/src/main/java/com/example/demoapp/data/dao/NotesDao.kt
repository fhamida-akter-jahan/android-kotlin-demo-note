package com.example.demoapp.data.dao
import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.demoapp.model.Note

// annotation for dao class.
@Dao
interface NotesDao {
    // below is the insert method for
    // adding a new entry to our database.
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(note : Note)

    // below is the delete method
    // for deleting our note.
    @Delete
    suspend fun delete(note: Note)

    @Query("DELETE FROM notesTable")
    suspend fun deleteAllNotes()

    // below is the method to read all the notes
    // from our database we have specified the query for it.
    // inside the query we are arranging it in ascending
    // order on below line and we are specifying
    // the table name from which
    // we have to get the data.
    @Query("SELECT * from notesTable ORDER BY id ASC")
    fun getAllNotes(): LiveData<List<Note>>

    // below method is use to update the note.
    @Update
    suspend fun update(note: Note)

}