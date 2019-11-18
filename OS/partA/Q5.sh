echo "Enter the string"
read str

if [ -z $str ]
then
	echo "null string"
	z=0
else
	z=`expr "$str" : '.*'`
	echo " String length = $z"
fi

if [ $z -ge 6 ]
then
	z=`expr "$str" : '\(...\).*'`
	echo "First 3 characters = $z"
	z=`expr "$str" : '.*\(...\)'`
	echo "Last 3 characters = $z"
else
	echo "String too short to extract substring"
fi
