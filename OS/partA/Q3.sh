x=`expr $1 % 400`
y=`expr $1 % 100`
z=`expr $1 % 4`

if [ $x -eq 0 ] || ([ $y -ne 0 ] && [ $z -eq 0 ])
then
	echo "$1 is a laep year"
else
	echo "$1 is not a leap year"
fi
