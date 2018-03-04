package com.algaworks.patrimonio.resource;

import com.algaworks.patrimonio.model.Item;
import com.algaworks.patrimonio.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin("${origem-permitida}")
public class ItemResource {

    @Autowired
    private ItemRepository itemRepository;

    @GetMapping("/api/itens")
    public List<Item> list() {
        return this.itemRepository.findAll();
    }

    @PostMapping("/api/itens")
    public Item criar(@RequestBody @Valid Item item){
        return this.itemRepository.save(item);
    }

}
