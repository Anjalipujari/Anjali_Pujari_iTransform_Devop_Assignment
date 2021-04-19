#!/bin/bash

ls $1 2> /dev/null
if [[ $? = 0 ]]
then
    echo " successfully done"
else
    echo "Not successful exit code is "$?""
fi
