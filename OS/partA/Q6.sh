echo "1.Addition\n2.Multiplication\n3.Division\nSubtraction"
read option
echo "Enter the 2 numbers"
read num1 
read num2

case $option in 
	'+')y=`expr $num1 + $num2`
		echo "Sum = $y";;
	'-')y=`expr $num1 - $num2`
		echo "Div = $y";;
	'*')y=`expr $num1 \* $num2`
		echo "Mul = $y";;
	'/')y=`expr $num1 / $num2`
		echo "Quotient = $y";;
	'*')echo "invalid choice";;
esac

