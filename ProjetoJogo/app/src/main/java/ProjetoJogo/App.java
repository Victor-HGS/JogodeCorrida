/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjetoJogo;

/**
 *
 * @author Admin
 */
public class App {
    public static void main(String[] args){
    Veiculo fusca = new Veiculo(new MotorDeFusca());
    Veiculo ferrari = new Veiculo(new MotorDeFerrari());
    Veiculo lamborguini = new Veiculo(new MotorDeLamborquini());
    
    System.out.println(fusca.acelerar());
    System.out.println(ferrari.acelerar());
    System.out.println(lamborguini.acelerar());
}
}