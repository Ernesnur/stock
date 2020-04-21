package ru.example.db.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import ru.example.db.dao.api.StockDao;
import ru.example.service.model.Box;
import ru.example.service.model.Item;

@Component
public class StockDaoImpl implements StockDao {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public StockDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Item getItem(String id) {
        return null;
    }

    @Override
    public Item getItem(String id, String color) {
        return null;
    }

    @Override
    public Item getItemByColor(String color) {
        return null;
    }

    @Override
    public Box getBox(String id) {
        return null;
    }
}
