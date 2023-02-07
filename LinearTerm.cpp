//
// Created by sudhb on 3/14/2022.
//

#include "LinearTerm.h"
#include "ConstantTerm.h"
AbstractTerm* LinearTerm::derivative() {
    ConstantTerm* n = new ConstantTerm(a);
    return n;
}

double LinearTerm::evaluate(double x) {
    return x * a;
}

std::string LinearTerm::toString(){
    if (a > 0) {
        return "+ " + std::to_string(a) + "x ";
    }
    else {
        return "- " + std::to_string(a * -1) + "x ";
    }
}