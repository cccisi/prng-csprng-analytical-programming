# Estimating Pi Using Various PRNGs and Searching Analysis for Heuristic PRNGs and CSPRNGs

Ernesto Cesaro's Theorem can be used to statistically approximate the value of Pi. Cesaro's theorem states that given two random integers, x and y, the probability that gcd(x, y) = 1 is 6/(Pi^2). Using a pseudo random number generator provided in various system libraries, we can generate a statistical estimate of Pi. Note that the PRNG used affects how close the resulting estimate is to Pi (3.14159).

Proof
First of all, fix an integer n, as in the second formulation of the theorem.
We are going to make a little of enumeration by counting the number of couples (i, j) where i and j are inferior to n and prime between them...

1. First condition that they are prime between them is that they are not both multiple of 2. As a number out of two is multiple of 2 , the probability that i and j are divisible by 2 is 1/2*1/2=1/2 2 .
So the probability that i and j are not multiple of 2 is (1-1/2 2).

2. Second condition is that i and j are not both multiple of 3. As well as previously, this probability is equal to (1-1/3 2).
As these conditions are independent, the probability that i and j are neither multiple of 2 nor 3 is (1-1/22)(1-1/32).
Now i and j will be prime between them if they are not both multiple of any integer, that is to say any prime number both, because any number is decomposable into first factors. By continuing for all the prime numbers the previous conditions, we obtain that probability Pthat i and j are prime between them is equal to, when n tends to the infinity:
 
This means that looked probability is :
P =  
