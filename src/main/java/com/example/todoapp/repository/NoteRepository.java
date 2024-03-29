package com.example.todoapp.repository;

import com.example.todoapp.config.enums.Tag;
import com.example.todoapp.entity.Note;
import com.example.todoapp.entity.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
    List<Note> findNoteByTagAndVisibility(Tag tag, Boolean visibility);
    Optional<Note> findNoteByUserNikNameAndTitle(String nikName, String title);
    Optional<Note> findNoteByTitle(String title);

    @Transactional
    void deleteByTitleAndUserNikName(String title, String nikName);
}
