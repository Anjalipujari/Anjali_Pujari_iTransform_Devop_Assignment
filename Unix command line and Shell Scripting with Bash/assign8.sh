#!/bin/bash


read -p "Firstname:" name
read -p "Lastname:" lname
read -p "USERAGE:" age



echo "Greetings $fname $lname" 

fage=$(($age+10))
echo "your age in 10 years would be" $fage

