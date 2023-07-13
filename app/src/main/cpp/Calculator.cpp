//
// Created by PC on 2023-07-12.
//
#include "Calculator.h"
#include <stdio.h>
#include <unistd.h>
#include <dirent.h>
#include <sys/stat.h>
#include <string.h>
#include <android/log.h>

#define  LOG_TAG  "FRIDA_DETECT"

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

int FridaDetect::is_frida_binary() {
    DIR *dir_info;
    struct dirent *dir_entry;
    char *ptr;

    dir_info = opendir("/data/local/tmp");
    if (NULL != dir_info) {
        while (dir_entry = readdir(dir_info)) {
            ptr = strstr(dir_entry->d_name, "frida");
            if (ptr != NULL) {
                __android_log_print(ANDROID_LOG_VERBOSE, LOG_TAG,
                                    "FRIDA DETECTION [1]: Exits File : %s", dir_entry->d_name);
                return 1;
            }
        }
        closedir(dir_info);
    }
    return 0;
}