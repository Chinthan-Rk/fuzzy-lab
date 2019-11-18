echo "Enter file 1 name "
read f1
echo "Enter file 2 name"
read f2

if [ -e $f1 -a -e $f2 ]
then
	perm1=`ls -l $f1 | cut -c 2-10`
	perm2=`ls -l $f2 | cut -c 2-10`
	if [ "$perm1" = "$perm2" ]
	then
		echo "$f1 and $f2 have same permissions"
	else
		echo "File 1 = $perm1"
		echo "File 2 = $perm2"
	fi
else
	echo "Invalid File Names"
fi
