//
// Created by sudhb on 3/14/2022.
//
#include "PolynomialTerm.h"
#include "LinearTerm.h"
#include "Math.h"

AbstractTerm *PolynomialTerm::derivative() {
    if (b == 2){
        LinearTerm* n = new LinearTerm(a * 2);
        return n;
    }
    PolynomialTerm* n = new PolynomialTerm(a * b, b - 1);
    return n;
}

std::string PolynomialTerm::toString() {
    if (a > 0) {
        return "+ " + std::to_string(a) + "x^" + std::to_string(b) + " ";
    }
    return "- " + std::to_string(a * -1) + "x^" + std::to_string(b) + " ";
}

double PolynomialTerm::evaluate(double x) {
    double ans = pow(x, b);
    ans *= a;
    return ans;
}
