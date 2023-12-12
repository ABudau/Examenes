import java.util.Scanner;

public class ExamenAndreiBudau {

	public static void main(String[] args) {
//		ejercicio1();
		ejercicio2();

	}
	private static void ejercicio1() {
		// TODO Auto-generated method stub
		int tamanio;
		System.out.println("Introduce un valor para definir la altura y el ancho del dibujo del número 3");
		tamanio=Teclado.recogerOpcionMenu(5, 9);
		printNumberThree(tamanio);

	}
	/**
	 * Método que dibuja el número 3 
	 * @param tamanio es el tamaño que se le asigna al ancho y al largo del dibujo
	 */
	public static void printNumberThree(int tamanio) {
		int contador=1;//declaro un contador y lo inicilizo con un valor 1

		for (int i = 1; i <= tamanio; i++) {//declaro un bucle for para dibujar el largo del dibujo
			if (i==1) {//Si la i es igual a 1 
				printLinea(tamanio, contador);//imprimo la linea con el número del contador
			}else if (tamanio%2==0&&i==tamanio/2) {//si el tamaño es divisible entre 2 y la i es igual a la mitad del tamaño
				printLinea(tamanio, contador);//Muestro la linea con el número correspondiente del contador
			}else if (tamanio%2!=0&&i==tamanio/2+1) {//Si el tamaño no es divisible entre 2 y la i es igual al tamaño entre dos mas 1 
				printLinea(tamanio, contador);//Muestro la linea
			}else if (i==tamanio) {//Si es la ultima ejecución del bucle
				printLinea(tamanio, contador);//Muestro la linea con el número correspondiente del contador
			}else {//si no se cumplen ninguna de las condiciones anteriores 
				printEspacio(tamanio, contador);//muestro el número del contador con X espacios delante
			}
				contador++;//aumento el contador
				
		}
	}
	/**
	 * Método que asigna a una cadena el valor de un contador tantas veces como ciclos tenga el bucle
	 * @param tamanio es el número de veces que se va a ejecutar el bucle y corresponderia con la anchura del dibujo
	 * @param contador es el número que se va agregando a la cadena
	 * @author Budau
	 */
	public static void printLinea(int tamanio,int contador) {

		String cadena="";//declaro e inicializo una cadena
		for (int i = 1; i <= tamanio; i++) {
			cadena+=contador;//asigno a la cadena el valor del contador tantas veces como ciclos tenga el bucle
		}
		System.out.println(cadena);//muestro la cadena
	}
	/**
	 * Método que asigna a una cadena unos espacios y un número 
	 * @param tamanio es las veces que se ejecuta el bucle 
	 * @param contador es el número que se le asigna al final de la cadena
	 */
	public static void printEspacio(int tamanio,int contador) {
		String cadena="";//declaro una cadena vacía
		for (int i = 1; i < tamanio; i++) {
			cadena+=" ";//asigno y sumo un espacio por cada ciclo de bucle a la cadena
		}
		cadena+=contador;//cuando finaliza el bucle asigno el numero del contador al final de la cadena
		System.out.println("\n"+cadena+"\n");//muestro la cadena
	}
	
	private static void ejercicio2() {
		int opcion;
		int anioNacimiento;
		do {
			anioNacimiento=pedirFechaNacimiento();
			System.out.println("Su esperanza de vida se extiende hasta el año "+ calcularEsperanzaVida(anioNacimiento));
			mostrarMenuRepetir();
			opcion=Teclado.recogerOpcionMenus(1, 2);
		}while(opcion!=2);

	
	}
	/**
	 * Método que muestra un menu
	 */
	public static void mostrarMenuRepetir() {
		System.out.println("¿Quiere repetir de nuevo el test?");
		System.out.println("1. Sí");
		System.out.println("2. No");
	}
	/**
	 * Método que muestra un menu
	 */
	public static void mostrarMenuFumar() {
		System.out.println("¿Fumas habitualmente?");
		System.out.println("1. Sí");
		System.out.println("2. No");
	}
	/**
	 * Método que muestra un menu
	 */
	public static void mostrarMenuAlcohol() {
		System.out.println("¿Bebes alcohol habitualmente?");
		System.out.println("1. Sí");
		System.out.println("2. No");
	}
	/**
	 * Método que pide una fecha de nacimiento comprendida entre dos años 1900 y 2023
	 * @return devuelve el año introducido comprendido entre 1900 y 2023
	 */
	public static int pedirFechaNacimiento() {
		System.out.println("¿Cuál es su fecha de nacimiento?");
		int anioNacimiento=recogerOpcionFechaNacimiento(1900, 2023);
		return anioNacimiento;
	}
	/**
	 * Método que calcula la esperanza de vida en función de si la persona bebe o fuma
	 * @param anioNacimiento es el año en el que nace la persona
	 * @return devuelve el año que corresponderia con la esperanza de vida de la persona
	 */
	public static int calcularEsperanzaVida(int anioNacimiento ){
		int esperanzaVida=83;//declaro una variable y la inicializo con un valor de 83
		esperanzaVida-=calcularEsperanzaVidaFUMAR();//le resto a la variable el valor retornado del método de si la persona fuma o no
		esperanzaVida-=calcularEsperanzaVidaAlcohol();//le resto a la variable el valor retornado de método de si la persona bebe o no
		esperanzaVida+=anioNacimiento;//sumo a la esperanza de vida el año de nacimiento obteniendo la esperanza de vida de la persona
		return esperanzaVida; //devuelvo el valor
	}
	/**
	 * método que devuelve un valor en función de una opción escogida
	 * @return devuelve el valor según la opcion que se ha escogido
	 */
	public static int calcularEsperanzaVidaFUMAR(){
		int opcion,decremento=0;
		final int DECREMENTO_FUMAR=10;
		mostrarMenuFumar();//muestro el menú
		opcion=Teclado.recogerOpcionMenus(1, 2);//recojo la opción entre 1 y 2
		if (opcion==1) {
			decremento=DECREMENTO_FUMAR;//si la opcion es 1 asigno el valor de la constante a decremento
		}else if (opcion!=2) {
			System.out.println("Elige una opción correcta");
		}
		return decremento;//devuelvo el decremento
	}
	/**
	 * método que devuelve un valor en función de una opción escogida
	 * @return devuelve el valor según la opcion que se ha escogido
	 */
	public static int calcularEsperanzaVidaAlcohol(){
		int opcion,decremento=0;
		final int DECREMENTO_ALCOHOL=5;
		mostrarMenuAlcohol();//muestro el menu
		opcion=Teclado.recogerOpcionMenus(1, 2);//recojo la opcion entre 1 y 2
		if (opcion==1) {
			decremento=DECREMENTO_ALCOHOL;//si la opcion es 1 asigno el valor de la constante a la variable decremento
		}else if (opcion!=2) {
			System.out.println("Elige una opción correcta");
		}
		return decremento;//devuelvo el valor
	}
	
	/**
	 * Método que devuelve un número comprendido entre dos números
	 * @param n1 es el número minimo
	 * @param n2 es el número máximo
	 * @return devuelve el número comprendido entre los dos números que se le pasan como parámetro
	 * @author Budau_Andrei
	 * @version 1.0
	 */
	public static int recogerOpcionFechaNacimiento(int n1,int n2) {//metodo que recoge la opcion del menu y la devuelve
		Scanner teclado=new Scanner(System.in);
		int opcion;//declaro la variable
		boolean valido=false;
		do {//inicio del bucle

			opcion=teclado.nextInt();//recojo el valor introducido por teclado y lo almaceno en la variable opcion
			if (opcion<n1||opcion>n2) {//si la opcion es menor que 1 
				System.out.println("Error Escoge un valor correcto entre "+ n1+" y "+ n2);//muestro el mensaje

			}else {//si la opcion esta entre el 1 o el 3 
				valido=true;//asigno el valor true a valido y el bucle para
			}
		}while(!valido);
		return opcion;
		//		teclado.close();


	}
}
