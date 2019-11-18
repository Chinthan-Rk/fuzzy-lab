echo "Enter the string"
read str
if [ -z $str ]
then
	echo"Null string"
	z=0
else
	z=`expr "$str" : '.*'`
	echo " Length = $z"
	if [ $z -ge 3 ]
	then
		z=`expr "$str" : '.*\(...\)'`
		echo "Substring : $z"
	else
		echo "Length is less than 3"
	fi
fi

echo "Enter the char to be found "
read char

pos=`expr index "$str" $char`
echo "Position of $char in $str = $pos"




