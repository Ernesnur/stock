package ru.example.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import ru.example.service.api.ParserService;
import ru.example.service.model.Storage;
import ru.example.web.endpoint.StockEndpoint;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

@Service
public class ParserServiceImpl implements ParserService {
    private final static Logger logger = LoggerFactory.getLogger(StockEndpoint.class.getName());

    /**
     * в application.properties
     */
    @Value("${xml.filename}")
    private String filename;

    @Override
    public Storage parse() {
        try {
            JAXBContext jaxb = JAXBContext.newInstance(Storage.class);
            Unmarshaller unmarshaller = jaxb.createUnmarshaller();
            return (Storage) unmarshaller.unmarshal(new File(filename));
        } catch (JAXBException e) {
            logger.error("Ошибка парсинга файла " + filename, e);
        }
        return null;
    }
}
