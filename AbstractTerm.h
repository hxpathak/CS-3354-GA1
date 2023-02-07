//
// Created by sudhb on 3/14/2022.
//

#ifndef PROJECT2_ABSTRACTTERM_H
#define PROJECT2_ABSTRACTTERM_H
#include <iostream>
enum class TYPE {POLYNOMIAL = 0, LINEAR, CONST, SIN, COSINE};
class AbstractTerm {
private:
    TYPE t;
public:
    TYPE getType(){return t;}
    void setType(TYPE type){t = type;}
    virtual int getIntVal() = 0;
    virtual AbstractTerm* derivative() {return nullptr;}
    virtual double evaluate(double) {return 0;}
    virtual std::string toString() {return "";}
};


#endif //PROJECT2_ABSTRACTTERM_H