package ru.example.db.dao.api;

import ru.example.service.model.Box;
import ru.example.service.model.Item;

/**
 * Интерфейс для работы дао слоем
 */
public interface StockDao {

    /**
     * Достает вещь по id
     */
    Item getItem(String id);
    /**
     * Достает вещь по id и цвету
     */
    Item getItem(String id, String color);
    /**
     * Достает вещь по color
     */
    Item getItemByColor(String color);
    /**
     * Достает коробку по id
     */
    Box getBox(String id);

}
