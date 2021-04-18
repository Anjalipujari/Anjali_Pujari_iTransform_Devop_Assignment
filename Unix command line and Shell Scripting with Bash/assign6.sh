#!/bin/bash

n1=2
n2=4
n3=6

#add two numbers
sum=$(($n1 + $n2))
echo "Sum of two numbers is" $sum

#add two numbers and multiply by third number
Mul=$(($sum * $n3))
echo "result of sum of two numbers multiplying by third number is" $Mul

grp= expr $n1 + $n2\* $n3
echo $grp
