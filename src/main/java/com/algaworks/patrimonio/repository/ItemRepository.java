package com.algaworks.patrimonio.repository;

import com.algaworks.patrimonio.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
