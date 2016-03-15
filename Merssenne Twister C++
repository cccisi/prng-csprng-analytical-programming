#include <algorithm>
#include <iostream>
#include <random>

auto RandomlySeededMersenneTwister() {
	// Magic number 624: The number of unsigned ints the MT uses as state
	std::vector<unsigned int> random_data(624);
	std::random_device source;
	std::generate(begin(random_data), end(random_data), [&]() {return source(); });
	std::seed_seq seeds(begin(random_data), end(random_data));
	std::mt19937 seededEngine(seeds);
	return seededEngine;
}


int main() {
	auto rng = RandomlySeededMersenneTwister();
	unsigned int a[100];
	for (int i = 0; i < 100; i++) {
		a[i] = rng();
		if (i % 5 == 4) std::cout << "\n";
		std::cout << a[i] << " ";
	}
	int m, n, j, r;
	int	sum = 0;

	for (j = 0; j < 100; j += 2)
	{
		m = a[j];
		n = a[j + 1];
		do
		{
			r = m%n;
			m = n;
			n = r;
		} while (r != 0);		
			if (m == 1)
			sum = sum + 1;
	}

	double Pi, p;
	p = 300.0 / sum;
	Pi = sqrt(p);
	std:: cout << "Estimate value of Pi is: " << Pi <<"\n";
	system("pause");
	return 0;

}
