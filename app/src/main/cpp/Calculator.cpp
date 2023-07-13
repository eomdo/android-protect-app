//
// Created by PC on 2023-07-12.
//
#include "Calculator.h"

Calculator::Calculator()
        : mNum(2) {

}

Calculator::Calculator(int num)
        : mNum(num) {

}

int Calculator::getAdd(const int &num) {
    return mNum + num;
}

int Calculator::getMinus(const int &num) {
    return mNum - num;
}

Calculator::~Calculator() {

}