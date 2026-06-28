#include <iostream>
#include <thread>
using namespace std;

int countUp(int n) {
	for (; n < 20; n++) {
		std::cout << n << std::endl; 
	}
	std::cout << to_string(n) + "<< End Count Up" << std::endl;
	return n;
}	

int countDown(int n) {
	for (; n > 0; n--) {
		std::cout << n << std::endl; 
	}
	std::cout << to_string(n) + " << End Count Down" << std::endl;
	return n;
}	

int main() {
	std::thread t1(countUp, 0);
	t1.join(); 

	std::thread t2(countDown, 20);
	t2.join(); 

	return 0;
}
