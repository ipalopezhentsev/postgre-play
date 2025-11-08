package ru.ipal.postgre.server.service;

import org.springframework.stereotype.Service;

import ru.ipal.postgre.server.model.Item;
import ru.ipal.postgre.server.repository.ItemRepository;

@Service
public class ItemService {
    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public Item saveItem(Item item) {
        return itemRepository.save(item);
    }

    public Item getItemById(Long id) {
        return itemRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Item not found with id: " + id));
    }
}