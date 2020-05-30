package com.shop.repository;

import com.shop.entity.PhoneCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneCategoryRepository extends JpaRepository<PhoneCategory, Integer> {
    public PhoneCategory findByCategoryType(Integer categoryType);
}
