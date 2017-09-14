# Estimating Pi Using Various PRNGs and Searching Analysis for Heuristic PRNGs and CSPRNGs

Ernesto Cesaro's Theorem can be used to statistically approximate the value of Pi. Cesaro's theorem states that given two random integers, x and y, the probability that gcd(x, y) = 1 is 6/(Pi^2). Using a pseudo random number generator provided in various system libraries, we can generate a statistical estimate of Pi. Note that the PRNG used affects how close the resulting estimate is to Pi (3.14159).
