package ru.ipal.postgre.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.ipal.postgre.server.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {
}