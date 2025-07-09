package com.becoder.service;

import com.becoder.dto.CategoryDto;
import com.becoder.dto.CategoryResponse;
import com.becoder.entity.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {

    public Boolean saveCategory(CategoryDto categoryDto);

    public List<CategoryDto> getAllCategory();

    List<CategoryResponse> getActiveCategory();

    CategoryDto getCategoryById(Integer id);

    Boolean deleteCategory(Integer id);
}
