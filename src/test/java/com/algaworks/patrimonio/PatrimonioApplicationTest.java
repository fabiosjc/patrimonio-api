package com.algaworks.patrimonio;

import com.algaworks.patrimonio.repository.ItemRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PatrimonioApplicationTest {

    @Autowired
    private ItemRepository itemRepository;

    @Test
    public void initialTest() {
        assertNotEquals(itemRepository.findAll().size(), 0);
    }
}