<?php
function  uTree($n) {
	$parityAdjust = $n % 2 == 0 ? 0 : 1;
	$exp = ($n + $parityAdjust) / 2 + 1;
	$height = pow(2, $exp) - 1 - $parityAdjust;

	echo "$height\n";
}



$fp = fopen("php://stdin", "r");
fscanf($fp, "%d", $m);
while(fscanf($fp, "%d", $line)) {
	utree($line);
}
?>