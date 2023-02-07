//
// Created by sudhb on 3/14/2022.
//

#ifndef PROJECT2_POLYNOMIALTERM_H
#define PROJECT2_POLYNOMIALTERM_H
#include "AbstractTerm.h"
class PolynomialTerm : public AbstractTerm {
private:
    int a; //Coefficient    ax^b
    int b; //Power
public:
    PolynomialTerm(int x, int y){a = x; b = y;this->setType(TYPE::POLYNOMIAL);} //Constructor
    //int getPower(){return b;}
    //Overridden Methods
    AbstractTerm* derivative() override;
    double evaluate(double) override;
    std::string toString() override;
    int getIntVal() override{return b;}
};


#endif //PROJECT2_POLYNOMIALTERM_H