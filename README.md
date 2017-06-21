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

Posteriormente definir una clase DemoCoche el cual contendra el bloque main y dentro de este una instancia de la clase Coche previamente definida. Posteriormente se imprime en pantalla el modelo y color del coche.

## Ejercicio 3

Definir en la clase Coche un metodo de nombre imprimeCoche que imprima el modelo y el color del coche, haciendo referencia a los atributos mediante this.
El metodo no devuelve ningun valor de retorno por lo que se utiliza la clausula void

En la clase DemoCoche solo debera contener dentro del bloque main() la creacion de la instancia de la clase Coche, la asignacion de los atributos modelo y color del coche, asi como, la llamada al metodo imprimirCoche.

## Ejercicio 4

Modificar el ambito de los atributos de la clase coche a privado. Definir metodos accesores a atributos bajo la sintaxis getNombreAtributo para los siguientes atributos:

	- modelo
	- color
	- matricula
	- año de fabricacion

Para acceder a los atributos dentro de cada metodo se debe hacer referencia mediante this.
Cada metodo debe retornar el mismo tipo de dato al que hace referencia.

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

## Ejercicio 8



## Ejercicio 1

1. Definir una clase llamada Bicicleta con los siguientes atributos publicos inicializados en cero:
	
	- cadencia (int)
	- velocidad (int)
	- engranaje (int)

2. Definir los siguientes metodos publicos en la clase Bicicleta:

	- cambiarCadencia: tipo vacio(void), recibe un parametro de tipo entero(int) y es asignado al atributo cadencia del objeto como nuevo valor
	- aumentarVelocidad: tipo vacio(void), recibe un parametro de tipo entero(int) e incrementa el valor del atributo velocidad del objeto
	- frenar: tipo vacio(void), recibe un parametro de tipo entero(int) y decrementa el valor del atributo velocidad, siempre y cuando sea menor o igual que el atributo velocidad del objeto
	- cambiarEngranaje: tipo vacio(void), recibe un parametro de tipo entero(int) y es asignado al atributo engrenaje del objeto como nuevo valor
	- imprimirEstados: tipo vacio(void) imprime el valor de los atributos cadencia y velocidad del objeto como cadena

3. Definir una clase DemoBicicleta con los siguientes metodos:

	- main: metodo publico con el modificador static y de tipo void que recibe como parametro un arreglo de tipo string. 
	Crear una instancia de la clase Bicicleta y realizar llamadas a los siguientes metodos:

		- cambiarEngranaje
		- cambiarCadencia
		- aumentarVelocidad
		- frenar

4. La salida del paso anterior debe se la siguiente:
	
	engranaje: 3 cadencia: 20 velocidad: 40


## Ejercicio 2

1. Definir la clase MontanaBicicleta que tiene como clase padre Bicicleta, con los siguientes atributos publicos:
	- diametroRuedas
	- numeroEngranajes
	- peso

2. Definir los siguientes metodos publicos en la clase MontanaBicicleta:

	- ConfiguracionDescenso
	- 

## Ejercicio 3
1. definir la clase CarreteraBicicleta que tiene como clase padre Bicicleta, con los siguientes atributos publicos:
	- diametroRuedas
	- peso

2. definir los siguientes metodo publicos en la clase CarreteraBicicleta:

	- 


