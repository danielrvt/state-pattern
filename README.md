# State Pattern

Synergy quiere cambiar la caja fuerte donde guarda la llave de la oficina por una electrónica. Esta caja fuerte debe cumplir con las siguientes condiciones:

### Reglas
* Debe tener la siguiente clave de cuatro digitos: 14 7 2 0
* Los números deben ser ingresados en el orden descrito
* Al ingresar un número válido, la caja fuerte recordará el número que se introdujo. El candado no se bloquea al ingresar un número incorrecto.
* Al ingresar el último número de forma correcta, se puede abrir la caja fuerte.

### Debes hacer lo siguiente:
    1. Determina los estados.
    2. Determina las transiciones.
    3. Dibuja la máquina de estados.
    4. Programa los estados y las transiciones.


### Requisitos:
* Debes tener instalado ```maven 3```.
* Una vez que hayas completado la asignación, puedes correrla con el siguiente comando:

``` $ mvn spring-boot:run```

Lo que levantará un servidor web en la siguiente dirección: http://localhost:8080

Una vez que se corra la aplicación, se deberá introducir la combinación a través de requests GET por el navegador a los siguientes endpoints:

* ```GET state-machine/one```, parámetro: ```number=primer número```
* ```Get state-machine/two```, parámetro: ```number=segundo número```
*  ```Get state-machine/three```, parámetro: ```number=tercer número```
*  ```Get state-machine/four```, parámetro: ```number=cuarto número```
* ```Get state-machine/open```, pregunta si esta abierta o no.
* ```Get state-machine/close```, cierra la caja fuerte

### Nivel dos
Intenta hacer que el candado se bloquee al introducir un número incorrecto, y que se tenga que comenzar a introducir la clave desde el primer número.