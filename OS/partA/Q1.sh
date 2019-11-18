if [ $1 -ge $2 ] && [ $1 -ge $3 ]
then
	echo " $1 is greatest "
elif [ $2 -ge $1 ] && [ $2 -ge $3 ]
then
	echo " echo $2 is greatest "
else
	echo "  $3 is greatest "
fi

if [ $1 -le $2 ] && [ $1 -le $3 ]
then    
        echo " $1 is smallest "
elif [ $2 -le $1 ] && [ $2 -le $3 ]
then    
        echo " echo $2 is smallest "
else    
        echo " echo $3 is smallest "
fi  
