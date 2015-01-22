#!/usr/bin/perl

$input = <STDIN>;
chomp($input);


for ($i = 0; $i < $input; $i++){
	$height = 1;
    $cycles = <STDIN>;
    chomp($cycles);

    $j = 0;
    while ($j < $cycles){
        if ( $j % 2 == 0 ){
        $height = $height * 2;
        }
        else {
            $height++;
        }
        $j++
    }
    print "$height\n";
}
