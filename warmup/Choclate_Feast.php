<?php
function  cFeast($line) {
	list ($n, $c, $m) = explode(" ", $line);

	$bought = floor($n / $c);
	$wrapperCount = $bought;
	$total = $bought;

	do {
		$free = floor($wrapperCount / $m);
		$wrapperCount = $wrapperCount % $m;
		$wrapperCount += $free;
		$total += $free;
	} while ($wrapperCount >= $m);

	echo "{$total}\n";
}

$fp = fopen("php://stdin", "r");
$cases = explode(" ", trim(fgets($fp)));
while($line = trim(fgets($fp))) {
	cFeast($line);
}
?>