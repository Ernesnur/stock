package ru.example.web.endpoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.example.db.dao.api.StockDao;

@RestController
public class StockEndpoint {
    private final static Logger logger = LoggerFactory.getLogger(StockEndpoint.class.getName());

    @Autowired
    private StockDao stockDao;

    /**
     * Тестовый рест чтобы проверить работу
     */
    @GetMapping
    public String status() {
        logger.info("dawd");
        stockDao.getItem("");
        return "awdawd";
    }
}
