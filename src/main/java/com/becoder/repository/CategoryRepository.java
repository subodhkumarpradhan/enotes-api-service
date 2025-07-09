package com.becoder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.becoder.entity.Category;

import java.util.List;
import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{
    List<Category> findByIsActiveTrue();
    Optional<Category> findByIdAndIsDeletedFalse(Integer id);
    List<Category> findByIsDeletedFalse();
    List<Category> findByIsActiveTrueAndIsDeletedFalse();
}
