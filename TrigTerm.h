//
// Created by sudhb on 3/14/2022.
//

#ifndef PROJECT2_TRIGTERM_H
#define PROJECT2_TRIGTERM_H
#include "AbstractTerm.h"

enum class TRIG {COSINE = 0, SIN};
class TrigTerm : public AbstractTerm{
private:
    TRIG trigVal;
    int a;
public:
    TrigTerm(int x, TRIG y){
        a = x; trigVal = y;
        if (trigVal == TRIG::SIN)
            this->setType(TYPE::SIN);
        else
            this->setType(TYPE::COSINE);
    }
    AbstractTerm* derivative() override;
    double evaluate(double) override;
    std::string toString() override;
    int getIntVal() override{return a;}
};


#endif //PROJECT2_TRIGTERM_H