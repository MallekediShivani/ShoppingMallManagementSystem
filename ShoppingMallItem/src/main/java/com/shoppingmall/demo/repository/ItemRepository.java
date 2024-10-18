package com.shoppingmall.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shoppingmall.demo.entity.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long>{

}
