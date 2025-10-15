#ifndef CONE_H
#define CONE_H

#include <string>

class COne {
private:
    long l;
    std::string s;

public:
    // Конструктор по умолчанию
    COne();

    // Конструктор с параметрами
    COne(long l, const std::string& s);

    // Конструктор копирования
    COne(const COne& other);

    // Деструктор
    ~COne();

    // Оператор присваивания
    COne& operator=(const COne& other);

    // Методы доступа
    long getL() const;
    std::string getS() const;
    void setL(long l);
    void setS(const std::string& s);

    // Метод печати
    void print() const;
};

#endif