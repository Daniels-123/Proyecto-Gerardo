<?php

function connectDB(){

        $server = "localhost";
        $user = "root";
        $pass = "";
        $bd = "users";

    $conexion = mysqli_connect($server, $user, $pass,$bd);

        if($conexion){
          
        }else{
            echo 'Ha sucedido un error inexperado en la conexion de la base de datos
';
        }

    return $conexion;
}

function disconnectDB($conexion){

    $close = mysqli_close($conexion);

        if($close){
           
        }else{
            echo 'Ha sucedido un error inexperado en la desconexion de la base de datos
';
        }   

    return $close;
}
		$sql = "SELECT name, email FROM users_table";	

function getArraySQL($sql){
    //Creamos la conexión con la función anterior
    $conexion = connectDB();

    //generamos la consulta

        mysqli_set_charset($conexion, "utf8"); //formato de datos utf8

		
    if(!$result = mysqli_query($conexion, $sql)) die(); //si la conexión cancelar programa

    $rawdata = array(); //creamos un array

    

    disconnectDB($conexion); //desconectamos la base de datos

    return $rawdata; //devolvemos el array
}

        $myArray = getArraySQL($sql);
        echo json_encode($myArray);
?>