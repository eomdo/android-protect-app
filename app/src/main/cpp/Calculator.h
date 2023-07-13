//
// Created by PC on 2023-07-12.
//

#ifndef NATIVE_TEST_CALCULATOR_H
#define NATIVE_TEST_CALCULATOR_H

class Calculator {
private:
    int mNum;

public:
    Calculator();
    Calculator(int num);
    int getAdd(const int& num);
    int getMinus(const int& num);
    ~Calculator();
};

class FridaDetect {
public:
    int is_frida_binary();
};


#endif //NATIVE_TEST_CALCULATOR_H
