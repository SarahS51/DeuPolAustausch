<?php

$username = filter_input(INPUT_POST, 'username');
$password = filter_input(INPUT_POST, 'password');
$firstname = filter_input(INPUT_POST, 'firstname');
$lastname = filter_input(INPUT_POST, 'lastname');
$street = filter_input(INPUT_POST, 'street');
$housenumber = filter_input(INPUT_POST, 'housenumber');
$postalcode = filter_input(INPUT_POST, 'postalcode');
$city = filter_input(INPUT_POST, 'city');
$telephone = filter_input(INPUT_POST, 'telephone');
$schoolclass = filter_input(INPUT_POST, 'schoolclass');
$specialdiet = filter_input(INPUT_POST, 'specialdiet');
$physicalimpairment = filter_input(INPUT_POST, 'physicalimpairment');
$EmCo_name = filter_input(INPUT_POST, 'EmCo_name');
$EmCo_firstname = filter_input(INPUT_POST, 'EmCo_firstname');
$EmCo_telephone = filter_input(INPUT_POST, 'EmCo_telephone');
$birthdate = filter_input(INPUT_POST, 'birthdate');


if (!empty($username)){
  if (!empty($password)){
    
    $host = "localhost";
    $dbusername = "root";
    $dbpassword = "";
    $dbname = "deupol";
    $table = "pupil";

    //Connection zur DB erstellen
    $connect = new mysqli ($host, $dbusername, $dbpassword, $dbname);
    if (mysqli_connect_error()){
      die ('Connect Error('.mysqli_connect_errno().')' .
      mysqli_connect_error());
    }
    else {
      $sql = "INSERT INTO pupil (username, password, firstname, lastname, street, housenumber, postalcode, city, telephone, schoolclass, specialdiet, physicalimpairment, EmCo_name, EmCo_firstname, EmCo_telephone, birthdate)
      values ('$username', '$password', '$firstname', '$lastname', '$street', '$housenumber', '$postalcode', '$city', '$telephone', '$schoolclass', '$specialdiet', '$physicalimpairment', '$EmCo_name', '$EmCo_firstname', '$EmCo_telephone', '$birthdate')";
      if ($connect->query($sql) {echo "Alle neuen Einträge wurden erfolgreich uebertragen";}
      else {
        echo "Error: ".$sql. "<br>". $ connect->error;
      }
      $connect-> close();
    }
  }
  else {
    echo "Passwort muss eingetragen werden";
    die();
  }
}
else {
  echo "Username muss eingetragen werden";
  die();
}
?>
