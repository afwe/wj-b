package com.wj.evan.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wj.evan.pojo.Category;

public interface CategoryDAO extends JpaRepository<Category, Integer> {

}
