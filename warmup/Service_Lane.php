<?php
function  sLane($line, $width) {
	list ($i, $j) = explode(" ", $line);
	$min = 3;
	for(;$i <= $j; $i++) {
		$min = $width[$i] < $min ? $width[$i] : $min;
	}

	echo "$min\n";
}



$fp = fopen("php://stdin", "r");
list ($length, $caseCount) = fscanf($fp, "%d %d");
$width = explode(" ", trim(fgets($fp)));
while($line = trim(fgets($fp))) {
	sLane($line, $width);
}
?>