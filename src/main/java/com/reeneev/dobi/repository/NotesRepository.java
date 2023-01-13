package com.reeneev.dobi.repository;

import com.reeneev.dobi.entity.Note;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface NotesRepository extends MongoRepository<Note, String> {

}