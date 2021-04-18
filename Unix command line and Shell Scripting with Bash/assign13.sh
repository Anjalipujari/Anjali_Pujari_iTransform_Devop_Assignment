#!/bin/bash


LIST=$(ls *.sh)
   
for i in $LIST
do      	
    iterate=$( cat $i )
    echo "THE CONTENT OF $i are:"
    echo $iterate
done 
