package com.devmountain.noteApp.services;

import com.devmountain.noteApp.dtos.NoteDto;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;


public interface NoteService {
    @Transactional
    void addNote(NoteDto noteDto, Long userId);
    @Transactional
    void deleteNote(Long noteId);
    @Transactional
    void updateNote(NoteDto noteDto);
    @Transactional
    List<NoteDto> getAllNotesByUserId(Long userId);

    Optional<NoteDto> getNoteById(Long noteId);
}
