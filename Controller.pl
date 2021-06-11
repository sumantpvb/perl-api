#!/usr/bin/perl 

use JSON::Fast;

my $file = 'input.csv';

app.config.default-content-type = 'application/json';

get '/customers/schedule' => sub () {
	open INFILE, "$file" ; 
	@data = <INFILE> ; 
	close INFILE ;

    return to-json @data;
}
