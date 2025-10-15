#include "COne.h"
#include <iostream>

COne::COne() : l(0), s("") {}

COne::COne(long l, const std::string& s) {
    this->l = l;
    this->s = s;
}

COne::COne(const COne& other) : l(other.l), s(other.s) {}

// деструктор не нужен

COne& COne::operator=(const COne& other) {
    if (this != &other) {
        l = other.l;
        s = other.s;
    }
    return *this;
}

long COne::getL() const {
    return l;
}

std::string COne::getS() const {
    return s;
}

void COne::setL(long l) {
    this->l = l;
}

void COne::setS(const std::string& s) {
    this->s = s;
}

void COne::print() const {
    std::cout << "COne: l = " << l << ", s = " << s << std::endl;
}