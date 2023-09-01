# AntsProblem

We have a wooden plank of the length n units. Two ants are walking on the plank, each ant moves with a speed of 1 unit per round. One ant moves to the left, the other moves to the right. At one round, each ant makes a move. Ant walking to the left moves first.


If an ant is going to move to a point that is already occupied by another ant, then each of the ants change direction and only after that the current ant moves. Assume changing directions does not take any additional round. Also, ants cannot take the same position on the plank.


When an ant reaches one end of the plank and moves towards the end of the plank, it does not fall out of the plank immediately, it happens in the next round.


Given an integer n — plank length and two integers: left — the position of the ant which moves to the left and right — the position of the ant which moves to the right. Return number of rounds needed to get the first ant falls out of the plank.
