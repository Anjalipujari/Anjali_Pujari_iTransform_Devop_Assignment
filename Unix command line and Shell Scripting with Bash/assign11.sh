#!/bin/bash

mynumber=2

read -p "Guess my number between 1 to 5:" guestnum

if [[ $guestnum == $mynumber ]]
then
	echo "The number you guessed is right"

fi	
