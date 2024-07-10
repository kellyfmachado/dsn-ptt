package java_project.dsn_ptt.service.impl;

import java_project.dsn_ptt.model.Category;
import java_project.dsn_ptt.model.Transaction;
import java_project.dsn_ptt.repository.CategoryRepository;
import java_project.dsn_ptt.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    public CategoryRepository categoryRepository;

    @Override
    public void addCategory(Category category){
        categoryRepository.save(category);
    }

    @Override
    public void updateCategory(Long id, Category category){
        Optional<Category> categoryBd = categoryRepository.findById(id);
        if (categoryBd.isPresent()){
            categoryRepository.save(category);
        }
    }

    @Override
    public void deleteCategory(Category category){
        categoryRepository.delete(category);
    }

    @Override
    public Optional<Category> viewCategory(Long id){
        return categoryRepository.findById(id);
    }
}
