package com.example.language.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.language.model.Language;
import com.example.language.repository.LanguageRepo;

@Service
public class LanguageService {

    private final LanguageRepo languageRepo;

    public LanguageService(LanguageRepo languageRepo) {
        this.languageRepo = languageRepo;
    }

    public Language createLanguage(Language language) {
        return languageRepo.save(language);
    }

    public List<Language> getAllLanguages() {
        return (List<Language>) languageRepo.findAll();
    }

    public Language getLanguageById(int languageId) {
        return languageRepo.findById(languageId).orElse(null);
    }

    public Language updateLanguage(int languageId, Language language) {
        if (languageRepo.existsById(languageId)) {
            language.setLanguageId(languageId);
            return languageRepo.save(language);
        } else {
            return null;
        }
    }

    public boolean deleteLanguage(int languageId) {
        if (languageRepo.existsById(languageId)) {
            languageRepo.deleteById(languageId);
            return true;
        } else {
            return false;
        }
    }
}
