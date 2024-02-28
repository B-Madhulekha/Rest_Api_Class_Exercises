package com.example.language.repository;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.repository.CrudRepository;
import com.example.language.model.Language;

public interface LanguageRepo extends JpaRepository<Language, Integer> {
    
}
