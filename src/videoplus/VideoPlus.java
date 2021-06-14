/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoplus;

import java.util.ArrayList;

/**
 *
 * @author rocio
 */
public class VideoPlus {

    private static Iterable<Video> listaReproduccion;
    
    public static void main(String[] args){
        ArrayList<Video> videos = new ArrayList<Video>();
        videos.add(new Video("Cruela"));
        videos.add(new Video("Lazo While"));
        videos.add(new Video("El rey Leon"));
        videos.add(new Video("Chapie"));
        videos.add(new Video("Blanca Nieves"));
        videos.add(new Video("Buscando a neno"));
        
        Cliente c = new Cliente("jose");
        //agregue cinco peluclas a la lista de reproduccion
        videos.add(new Video("Predestination"));
        videos.add(new Video("1917"));
        videos.add(new Video("The Joker"));
        videos.add(new Video("End Game"));
        videos.add(new Video("Kimetsu No Yaiba:Mugen Train"));
        
        //reproduzca las peliculas*/
        for (Video b: listaReproduccion){
            reproducir(b);
          
        }
    }
}
