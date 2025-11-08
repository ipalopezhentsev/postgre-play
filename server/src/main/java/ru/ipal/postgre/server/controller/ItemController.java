package ru.ipal.postgre.server.controller;

import org.springframework.web.bind.annotation.*;

import ru.ipal.postgre.server.model.Item;
import ru.ipal.postgre.server.service.ItemService;

@RestController
@RequestMapping("/api/items")
public class ItemController {
    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping
    public Item createItem(@RequestBody Item item) {
        Item savedItem = itemService.saveItem(item);
        return savedItem;
    }

    @GetMapping("/{id}")
    public Item getItem(@PathVariable Long id) {
        Item item = itemService.getItemById(id);
        return item;
    }
}