package com.devmountain.noteApp.services;

import com.devmountain.noteApp.dtos.NoteDto;
import com.devmountain.noteApp.dtos.UserDto;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface NoteService {
    @Transactional
    List<String> addNote(NoteDto noteDto, Long userId);
    List<String> deleteNote(Long noteId);
    List<String> updateNote(NoteDto noteDto);
    List<NoteDto> getAllNotesByUserId(Long userId);
}
