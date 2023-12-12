import java.util.Scanner;

public class Ejercicios_Examen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ejercicio1();
		ejercicio2();
	}

	static void ejercicio1() {
		final int PRECIO_PRODUCTO=5;//Declaro e inicializo la constante precio producto con un valor 5
		//Declaro las variables
		int numeroVentas;
		double prima;
		String pais;
		prima=0;//Inicializo la variable prima con un valor 0
		Scanner tecladoTexto=new Scanner(System.in);//Declaro un scanner para recoger el texto que se introduce por teclado
		Scanner teclado=new Scanner(System.in);//Declaro un scanner para recoger los datos de tipo numérico.

		System.out.print("Por favor, ingresa el número de ventas del vendedor: ");//Pido que se introduzca el número de ventas
		numeroVentas=teclado.nextInt();//Recojo el número de ventas y almaceno el valor en la variable numeroVentas
		System.out.print("Por favor, ingresa el país (EEUU/Canadá/México): ");//Pido que se introduzca el país 
		pais=tecladoTexto.nextLine();//Recojo el valor y lo almaceno en la variable pais

		if (numeroVentas>0&&(pais.equals("EEUU")||pais.equals("Canadá")||pais.equals("México"))) {//Si el número de ventas es mayor que 0 y el país que se introduce corresponde con (EEUU/Canadá/México) se ejecuta el if 

			if (pais.equals("EEUU")&&numeroVentas>=1&&numeroVentas<=5) {//Si el país es igual que EEUU y el número de ventas está entre 1 y 5 ambos incluidos se ejecuta el if
				prima=numeroVentas*2;//multiplico el número de ventas por 2 y lo almaceno en la variable prima
				System.out.println("La prima total del vendedor es de "+prima+"$");//muestro el mensaje junto al valor de la variable prima
			}else if (pais.equals("EEUU")&&numeroVentas>5) {//Si el país es igual que EEUU y el número de ventas es superior a 5 se ejecuta el if
				prima=numeroVentas*3;//multiplico el número de ventas por 3 y lo almaceno en la variable prima
				System.out.println("La prima total del vendedor es de "+prima+"$");//muestro el mensaje junto al valor de la variable prima
			}

			if (pais.equals("Canadá")&&numeroVentas>=1&&numeroVentas<=5) {//Si el país es igual a Canadá y el número de ventas está entre 1 y 5 ambos incluidos se ejecuta el if
				prima=(numeroVentas*PRECIO_PRODUCTO)*0.05;//Aquí calculo la prima que corresponde al 5% de la venta realizada y almaceno el valor en la variable prima
				System.out.println("La prima total del vendedor es de "+prima+"$");//muestro el mensaje junto al valor de la variable prima
			}else if (pais.equals("Canadá")&&numeroVentas>5){
				prima=(numeroVentas*PRECIO_PRODUCTO)*0.06;//Aquí calculo la prima que corresponde al 6% de la venta realizada y almaceno el valor en la variable prima
				System.out.println("La prima total del vendedor es de "+prima+"$");//muestro el mensaje junto al valor de la variable prima
			}

			if (pais.equals("México")&&numeroVentas>=1&&numeroVentas<=5) {//Si el país es igual que México y el número de ventas está entre 1 y 5 ambos incluidos se ejecuta el if
				prima=(numeroVentas*PRECIO_PRODUCTO)*0.07;//Aquí calculo la prima que corresponde al 7% de la venta realizada y almaceno el valor en la variable prima
				System.out.printf("La prima total del vendedor es de %.2f ",prima);//muestro el mensaje junto al valor de la variable prima formateado a dos decimales
				System.out.print("$");
			}else if (pais.equals("México")&&numeroVentas>5){
				prima=(numeroVentas*PRECIO_PRODUCTO)*0.08;//Aquí calculo la prima que corresponde al 8% de la venta realizada y almaceno el valor en la variable prima
				System.out.printf("La prima total del vendedor es de %.2f ",prima);//muestro el mensaje junto al valor de la variable prima formateado a dos decimales
				System.out.print("$");
			}


		}else {//Si el número que se introduce es inferior a 1 o el pais no corresponde con los mencionados anteriormente se muestra el mensaje.
			System.out.println("ERROR.Los datos introducidos son incorrectos");
		}
		teclado.close();
		tecladoTexto.close();
	}

	static void ejercicio2() {
		
		Scanner teclado=new Scanner(System.in);//Declaro un scanner para recoger los datos 
		
		int n1,n2;//Declaro las variables
		
		System.out.print("Indica n1: ");//Pido que se introduzca el n1
		n1=teclado.nextInt();//recojo el valor de n1 y lo almaceno en la variable
		
		System.out.print("Indica n2: ");//Pido que se introduzca n2
		n2=teclado.nextInt();//Recojo el valor y lo almaceno en la variable
		
		do {
			
			
				if (n2%5==0) {//si el n2(Que en este caso es el índice desde el que partimos hacia atrás) es divisible entre 5
					System.out.print("AA");//Muestro el mensaje
				}else {
					System.out.print(" "+n2+" ");//si el n2 no es divisible muestro el número
				}
				
				n2--;//Decremento en 1 el n2
			
		}while(!(n1<0||n2<0)&&n1<=n2);//Este bucle siempre se ejecuta 1 vez y luego se comprueba esta condición
										//el bucle se detendrá cuando n1 o n2 sean negativos o n1 o n2 sean iguales
		
		
		teclado.close();//cierro el teclado
		
	}

}
