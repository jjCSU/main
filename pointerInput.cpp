#include <iostream>

int main() {
    int a, b, c;
    int* pa = &a;
    int* pb = &b;
    int* pc = &c;
    
    std::cout << "Input first integer here: " << std::endl;
    std::cin >> a;
    
    std::cout << "Input second integer here: " << std::endl;
    std::cin >> b;
    
    std::cout << "Input third integer here: " << std::endl;
    std::cin >> c;
    
    std::cout << "Your Inputs: " << a << ": " << pa << ", " << b << ": " << pb << ", " << c << ": " << pc << std::endl;
    
}
