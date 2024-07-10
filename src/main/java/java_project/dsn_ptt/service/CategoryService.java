package java_project.dsn_ptt.service;

import java_project.dsn_ptt.model.Category;

import java.util.Optional;

public interface CategoryService {
    void addCategory(Category category);
    void updateCategory(Long id, Category category);
    void deleteCategory(Category category);
    Optional<Category> viewCategory(Long id);
}
