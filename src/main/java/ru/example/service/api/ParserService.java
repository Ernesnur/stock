package ru.example.service.api;

import ru.example.service.model.Storage;

/**
 * Сервис для работы с парсингом файла
 */
public interface ParserService {

    /**
     * Парсит xml в объект
     * Название файла берет из аргумента приложения
     * @return Объект из xml
     */
    Storage parse();
}
