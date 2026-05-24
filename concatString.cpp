#include <iostream>
#include <string>


int main() {
	std::string phrase1;
	std::string phrase2;

	std::cout << "Input first string here: " << std::endl;
	std::cin >> phrase1;
	
	std::cout << "Input second string here: " << std::endl;	
	std::cin >> phrase2;

	cout << "Your inputs: " + phrase1 + " " + phrase2 + "\n"<< std::endl;

	//std::getline(std::cin >> std::ws, phrase);
	//getline to include text with whitespace, std::ws to eliminate whitespace you didn't include

	return 0;

}
