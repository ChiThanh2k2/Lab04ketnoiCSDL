package com.example.Lab04.services;

import com.example.Lab04.entity.Book;
import com.example.Lab04.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;

@Service
public class CategoryService {
    @Autowired
    private ICategoryRepository categoryRepository;
    public List<Category> getAllCategories(){return categoryRepository.findAll();}
    public Category getCategoryById(Long id){return categoryRepository.findById(id).orElse(null);}
    public Category saveCategory(Category category){return categoryRepository.save(category);}
    public void deleteCategory(Long id){categoryRepository.deleteById(id);}
}
