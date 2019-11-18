y=`expr $1 % $2`

if [ $y -eq 0 ]
then
	echo "$1 is divisible"
else
	echo "$1 is not divisible"
fi
