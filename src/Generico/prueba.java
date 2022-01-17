/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo
 */

 package generico;
 
import generico.Chocolates;
import generico.Golosina;
 
public class prueba {
 
    public static void main(String[] args) {

        Bolsa<Chocolates> bolsa= new Bolsa<Chocolates>(3);
        
        Bolsa<Golosina> bolsita= new Bolsa<Golosina>(1);
        
        Bolsa<Jugos> bolsita_jugo= new Bolsa<Jugos>(1);

        Chocolates c    = new Chocolates("Cadbury");
        Chocolates c1   = new Chocolates("Vizzio");
        Chocolates c2   = new Chocolates("Trebol");
        
        Golosina g1     = new Golosina("Gummy");
        
        Jugos h1        = new Jugos("Frugos");

        bolsa.add(c);
        bolsa.add(c1);
        bolsa.add(c2);
        
        bolsita.add(g1);
        
        bolsita_jugo.add();

        System.out.println("=======Chocolates========");
        for (Chocolates chocolates:bolsa) {
            System.out.println(chocolates.getMarca());
        }
        System.out.println("=======Golosinas========");
        for (Golosina golosinas:bolsita) {
            System.out.println(golosinas.getNombre());
        }
    }
}
