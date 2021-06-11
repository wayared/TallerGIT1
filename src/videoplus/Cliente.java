/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoplus;

import java.util.ArrayList;

/**
 *
 * @author Personal
 */
public class Cliente {
	private ArrayList<Video> listaReproduccion;
	private String nombre;
	/**
	* Constructor que fija el nombre del cliente e inializa listaReproduccion
	* @param nombre
	*/
	public Cliente(String nombre){
		this.nombre = nombre;
		//iinicializamos el objeto lista
                //listaReproduccion = new ArrayList<>;
                //no se pudo inicializar, daba error
	}
		
	/**
	* Agregar un video al final de la lista de reproduccion. El cliente no puede tener
	* mas de 5 videos en la lista. Retorna verdadero si se pudo agregar el video
	* Retorno falso caso contrario
	* @param p
	*/
	public boolean agregarLista(Video v){
		//metod size retorna el numero de elementos en el arreglo
		if(listaReproduccion.size()<5){
			//el metodo add no abierto al final de la lista
			listaReproduccion.add(v);
			return true;
		}
		return false;
	}
        
        /**
         * Simula la reproducción de los videos
         * Los videos se muestran uno a uno en el orden que estan en la lista
         * Al reproducirse un video este se quita de la lista
         * Antes de reproducir el siguiente video se pregunta al usuario si quiere continuar
         * al reproducirse un video se incrementa su numero de reproducciones
         */
        public void reproducir(){
            String continuar="no";
            do{
                //obtenga el primer video de la lista - use el metodo get
                //muestro el video
                //incremento el numero de reproducciones
                //remuevo el video de la lista - use el metodo remove
                
            }while(continuar.equals("si"));
        }
}

