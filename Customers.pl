#!/usr/bin/perl 

package Person;

sub new {
   my $class = shift;
   my $self = {
      _customerId => shift,
      _productName  => shift,
      _domain       => shift,
	  _startDate => shift,
      _durationMonths  => shift,
      _emailDate       => shift,
   };
   # Print all the values just for clarification.
   print "First Name is $self->{_firstName}\n";
   print "Last Name is $self->{_lastName}\n";
   print "SSN is $self->{_ssn}\n";
   bless $self, $class;
   return $self;
}
sub setCustomerId {
   my ( $self, $customerId ) = @_;
   $self->{_customerId} = $customerId if defined($customerId);
   return $self->{_customerId};
}

sub getCustomerId {
   my( $self ) = @_;
   return $self->{_customerId};
}

sub setProductName {
   my ( $self, $productName ) = @_;
   $self->{_productName} = $productName if defined($productName);
   return $self->{_productName};
}

sub getProductName {
   my( $self ) = @_;
   return $self->{_productName};
}

sub setDomain {
   my ( $self, $domain ) = @_;
   $self->{_domain} = $domain if defined($domain);
   return $self->{_domain};
}

sub getDomain {
   my( $self ) = @_;
   return $self->{_domain};
}

sub setStartDate {
   my ( $self, $startDate ) = @_;
   $self->{_startDate} = $startDate if defined($startDate);
   return $self->{_startDate};
}

sub getStartDate {
   my( $self ) = @_;
   return $self->{_startDate};
}

sub setDurationMonths {
   my ( $self, $durationMonths ) = @_;
   $self->{_durationMonths} = $durationMonths if defined($durationMonths);
   return $self->{_durationMonths};
}

sub getDurationMonths {
   my( $self ) = @_;
   return $self->{_durationMonths};
}

sub setEmailDate {
   my ( $self, $emailDate ) = @_;
   $self->{_emailDate} = $emailDate if defined($emailDate);
   return $self->{_emailDate};
}

sub getEmailDate {
   my( $self ) = @_;
   return $self->{_emailDate};
}
1;