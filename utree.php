<?php
function  uTree($n) {
	$height = 1;
	for ($i = 1; $i <= $n; $i++) {
		$height = $i % 2 ? $height * 2 : $height + 1;
	}
	echo "$height\n";
}

$fp = fopen("php://stdin", "r");
fscanf($fp, "%d", $m);
while(fscanf($fp, "%d", $line)) {
	utree($line);
}
?>
