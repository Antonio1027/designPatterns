# Programacion POO

## Ejercicio 1

Escribir un programa que imprima en pantalla su nombre completo en una linea y en la linea siguiente su fecha de nacimiento.

El nombre de la clase es MisDatosPersonales. Dentro del bloque main() estan las sentencias que imprimen los datos mencionados. 

## Ejercicio 2

Definir una clase que represente a un coche. En la definicion se debe incluir:

	- modelo
	- color
	- si la pintura es metalizada o no
	- matricula
	- año de fabricacion

Posteriormente definir una clase DemoCoche el cual contendra el bloque main y dentro de este una instancia de la clase Coche previamente definida. Asignar valores a los atributos modelo y color e imprimirlos en pantalla.

Creacion de una instancia:
	- NombreClase NombreInstancia = new NombreClase()

Acceder a un atributo de un objeto
	- NombreInstancia.NombreAtributo

## Ejercicio 3

Definir en la clase Coche un metodo de nombre imprimeCoche que imprima el modelo y el color del coche, haciendo referencia a los atributos mediante this.
El metodo no devuelve ningun valor de retorno por lo que se utiliza la clausula void

En la clase DemoCoche solo debera contener dentro del bloque main() la creacion de la instancia de la clase Coche, la asignacion de los atributos modelo y color del coche, asi como, la llamada al metodo imprimirCoche.

## Ejercicio 4

Modificar el ambito de los atributos de la clase coche a privado. 
Definir metodos accesores a atributos bajo la sintaxis getNombreAtributo para los siguientes atributos:

	- modelo
	- color
	- matricula
	- año de fabricacion

Cada metodo debe retornar el mismo tipo de dato al que hace referencia.

Definir metodos accesores a atributos que asignan un valor a un atributo mediante la sintaxis setNombreAtributo para los siguientes atributos:

	- modelo
	- color
	- matricula

En estos metodos no se devulve ningun valor ya que unicamente se le asigna un valor al atributo.

Para acceder a los atributos dentro de cada metodo se debe hacer referencia mediante this:

	- this.NombreAtributo

Dentro del bloque main de la clase DemoCoche realizar la llamada al metodo que devuelve la matricula e imprimirla en pantalla.

## Ejercicio 5

Agregar a la clase Coche un metodo constructor que recibe los parametros:
	
	- modelo
	- color

Modificar el bloque main() de la clase DemoCoche en la creacion de la instacia de la clase Coche agregando los parametros para el constructor.

## Ejercicio 6

Mediante sobrecarga de metodos, definir otro metodo constructor en la clase Coche que recibe los siguientes parametros:

	- modelo
	- color
	- matricula

Crear una instacia mediante este constructor en el bloque main() de la clase DemoCoche, invocar el metodo imprimirCoche y en la siguiente linea imprimir la matricula mediante la llamada al metodo getMatricula definido en el ejercicio 4.

## Ejercicio 7

Definir el atributo agencia que es de tipo String, precedido por el modificador static y de ambito privado e inicializarla.

Definir un metodo imprimirAgencia, sin valor de retorno precedido por el modificador static y de ambito publico. Dentro de este metodo escribir la sentencia que imprimir el valor del atributo agencia.

En el bloque main() de la clase DemoCoche imprimir el valor del atributo agencia de la clase Coche mediate la llamada al metodo imprimirAgencia bajo la siguiente sintaxis:

	- NombreClase.nombreMetodo()

Agregar el modificador final al atributo agencia para convertirla en constante.

## Ejercicio 8

Crear una clase CocheDeportivo


## Ejercicio 9

Sobreescribir el metodo imprimirCoche en la clase CocheDeportivo que ademas de imprimir el modelo y el color, imprima en pantalla la velocidad maxima del coche

##

