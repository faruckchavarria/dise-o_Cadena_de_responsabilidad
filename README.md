# diseño_Cadena_de_responsabilidad

## La siguuente documentacion mostrara la aplicacion del patron de diseño de cadena tipo responsabilidad.

### Para la presemtacion de este ejemplo tomaremos manejadore so repartidores de productos, creando una clase de tipo abstracta la cual sera una clase que sera utilizada con sus valores y metodos en las demas clases.
<img src="capturas\1.PNG" alt="Caso1"/>

### Luego cremos la siguiente clase esta clase tendra por nombre ManejadorConcreto1 el cual se extendera de la clase abstracta de manejador la cual le comparte parte de sus metodos, como lo es el calculo de coste de envio, hara usod e demas que se encuentran en las demas clases como lo es paquete, esta clase se encarga de atribuir un puntoe specifico del destino. y realizar calculos matematicos los cuales sean capaces de estimar el precio por el peso del producto que se vaya a enviar.
<img src="capturas\2.PNG" alt="Caso1"/>

### Por consiguiente existen 2 clases as que llevan por nombre en la manejadorconcreto 2 y 3 los cuales llevaran la misma tasa de infromacion en la clase suplantando el siito de envio o el get destino.

## Manejador concreto2
<img src="capturas\3.PNG" alt="Caso1"/>

## Manejador concreto3
<img src="capturas\4.PNG" alt="Caso1"/>

### Se crea la clase de Paquete la cual en esta habra la siguiente informacion, tendra las variables designadas las cuales seran el contenido del producto, eld estino del producto, y el peso del mismo. Luego se crean sus contenido para ser usados en los metodos que seran usados en las clases del manejador o manejadores.
### Se los otroga el primer manejador donde nos dice que sera un string el cual retornara el numero paquete, donde se contatena el destino, el contenido y el peso del producto.
### se crea otro metodo el cual tendra los gets de destino y retornara ese destino sera de tipo string al ser caracteres.

### se crea un metodo tipo double ya que este sera los gets de peso y sera de tipo double porque seran numero o bien decimales de grandes longitudes.
<img src="capturas\5.PNG" alt="Caso1"/>

### Se crea la clase de tipo cliente en este estara el main el cual se nos permitira ejecutar el programa al igual que hara uso de todas las clases para su ejecucion. 
### Primero se colocan los manejadores y se crean nuevos manejadores para esta clase, invocacion de constructores.
### luego se hace el llamado de los sucesores.

### ahora se hace el calculo para ver cuanto costaran enviar los paquetes con los datos de peso y destino y contenido que se nos han facilitado. Creamos el llamado de el constructor del paquete y colocamos cada uno de los producots, cual sera su destino, tienen que tenes el mismo destino a como esta en sus manejadores concretos y el peso a otorgar como se ha facilitado, luego de colocar cada uno de los.
### y luego se imprime el resultado contatenando el paquete mas sus caracteres  con el manejador, el constructor del calculo de envio para el paquete que deseemos, ene ste caso todos.
<img src="capturas\6.PNG" alt="Caso1"/>

# Resultado
<img src="capturas\7.PNG" alt="Caso1"/>