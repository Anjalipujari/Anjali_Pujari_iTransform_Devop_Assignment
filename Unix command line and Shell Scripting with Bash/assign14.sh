#!/bin/bash

dish=('1=panipuri' '2=samosa' '3=dosa')
echo "${dish[@]}"
echo "Choose any dish"
read dish
case $dish in
[1])
echo "Panipuri yummm"
;;
[2])
echo "Samosa is best"
;;
[3])
 echo "Dosa is top dish"
 ;;
*)
echo "Sorry! Please choose from menu only "
;;
esac
