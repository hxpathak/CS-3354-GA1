//
// Created by sudhb on 3/14/2022.
//

#include "TrigTerm.h"
#include "Math.h"

AbstractTerm *TrigTerm::derivative() {
    if (trigVal == TRIG::COSINE){
        TrigTerm* ans = new TrigTerm(a * -1, TRIG::SIN);
        return ans;
    }
    else{
        TrigTerm* ans = new TrigTerm(a, TRIG::COSINE);
        return ans;
    }
}

std::string TrigTerm::toString() {
    std::string val;
    if (trigVal == TRIG::SIN)
        val = "sin";
    else
        val = "cos";
    if (a > 0)
        return "+ " + std::to_string(a) + val + "(x) ";
    return "- " + std::to_string(a * -1) + val + "(x) ";
}

double TrigTerm::evaluate(double x) {
    double ans;
    if (trigVal == TRIG::SIN)
        ans = a * (sin (x * (M_PI/180)));
    else
        ans = a * (cos (x * (M_PI/180)));
    return ans;
}
