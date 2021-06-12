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


post '/customers/add' => sub {
    my $params = from-json(request.body);

    sub AddComment() {

  my $customerId = shift;    # the customerId to find
  my $productName  = shift;    # the productName to add
  chomp($customerId);
  chomp($productName);

  open my $DATA, '<', "input.csv" or die "$!";    #open the data file
  my @lines = <$DATA>;              #Make an array of the files lines

  my @NewDataFile;                  # make an array to store new file lines
  my $addRow = 0;                # flag to know when to add comment

  for my $line (@lines) {
    if ($line eq $productName) {           # if this line is the username
      $addRow = 1;               # set flag that next line you add comment
      push(@NewCommentsFile, $line);    # add this line to new array
    }
    elsif ($addRow eq 1) {       # if the flag is 1 then do this
      push(@NewDataFile, $comment); # add the comment to the array
      $addRow = 0;               # reset flag
    }
    else {
      push(@NewDataFile, $line);       #add line to array
    }
  }

  open my $fh, '>', "input.csv" or die "Cannot open input.csv: $!";

  # Loop over the array
  foreach (@NewDataFile) {
    print $fh "$_";    # Print each entry in our new array to the file
  }

  close $fh;
}

        header('location', '/users/' ~ %user_data<uuid>);
        log("Successfully Created");
        status 201;
    }
    else {
        log("Error");
        status 400;
    }

    return status;
}
