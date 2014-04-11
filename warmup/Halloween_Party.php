<?php
function  hParty($line) {
	list ($n, $c, $m) = $line;
	$bought = floor($n / $c);
	$free = floor($bought / $m);
	$total = $free + $bought;
	echo "{$total}\n";
}

$fp = fopen("php://stdin", "r");
$cases = explode(" ", trim(fgets($fp)));
while($line = trim(fgets($fp))) {
	hParty($line);
}
?>