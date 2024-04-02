/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author mitie
 */
public class Calculos {
    
    private double H = 6.626e-34; //js
    private double Hev = 1.602e-19; //em ev
    private double massaEletron = 9.11e-31;
    private double massaProton = 1.67e-27; 
    private double vLuz = 3e8; 
    

    public double funcaoOndaNInicialAngulo(double nInicial, double largura){
        double s = (nInicial*Math.PI/largura);
        return s; 
    }
    
    public double funcaoOndaNInicial(double largura){
        double r = (Math.sqrt(2/largura));
        return r;
    }
   
    public double funcaoOndaNFinalAngulo(double nFinal, double largura){
        double s = (nFinal*Math.PI/largura);
        return s;
      
    }
    public double funcaoOndaNFinal(double largura){
        double r = (Math.sqrt(2/largura));
        return r; 
    }
     
    public double energiaInicialEletron(double nInicial, double largura){
        double rEI = (((Math.pow(H, 2))/(8*massaEletron*(Math.pow(largura, 2)))*(Math.pow(nInicial, 2))));
        return rEI;
    }
     public double energiaFinalEletron(double nFinal, double largura){
        double rEF = (((Math.pow(H, 2))/(8*massaEletron*(Math.pow(largura, 2)))*(Math.pow(nFinal, 2))));
        return rEF;
    }
    
    public double energiaInicialProton(double nInicial, double largura){
        double rPI = (((Math.pow(H, 2))/(8*massaProton*(Math.pow(largura, 2))*Math.pow(nInicial, 2))));
        return rPI;
    }
    
    public double energiaFinalProton(double nFinal, double largura){
        double rPF = (((Math.pow(H, 2))/(8*massaProton*(Math.pow(largura, 2))*Math.pow(nFinal, 2))));
        return rPF;
    }
    
    public double converteEnergiaInicialEletron(double energiaInicialE){ //entrar com energia inicial do eletron
        double energiaEV = energiaInicialE/Hev;
        return energiaEV;
    }
    
    public double converteEnergiaFinalEletron(double energiaFinalE){ //entrar com energia final do eletron
        double energiaEV = energiaFinalE/Hev;
        return energiaEV;
    }
    
    public double converteEnergiaInicialProton(double energiaInicialP){ //entrar com energia inicial do proton
        double energiaEV = energiaInicialP/Hev;
        return energiaEV;
    }
    
    public double converteEnergiaFinalProton(double energiaFinalP){ //entrar com energia final do proton
        double energiaEV = energiaFinalP/Hev;
        return energiaEV;
    }
    
    public double energia(double energiaFinal, double energiaInicial){ //calculo da energia do foton
        double en = Math.abs(energiaFinal - energiaInicial) ;
        return en/Hev;
    }
    
    public double frequencia(double en){
        double freq = en/H;
        return freq;
    }
    
    public double comprimento(double en){
        double c = (H*vLuz)/en;
        return c;
    }
    
    public double velocidadeInicialEletron(double enInicialE){
        double v = Math.sqrt((2*enInicialE)/massaEletron);
        return v;     
    }
    
    public double velocidadeFinalEletron(double enFinalE){
        double v = Math.sqrt((2*enFinalE)/massaEletron);
        return v;     
    }
    
    public double velocidadeInicialProton(double enInicialP){
        double v = Math.sqrt((2*enInicialP)/massaProton);
        return v;     
    }
    
    public double velocidadeFinalProton(double enFinalP){
        double v = Math.sqrt((2*enFinalP)/massaProton);
        return v;     
    }
    
    public double comprimentoInicialBroglieE(double enInicialE){
        double comprimentoEletronI = H/Math.sqrt((2*massaEletron*enInicialE));
        return comprimentoEletronI;
    }
    
    public double comprimentoFinalBroglieE(double enFinalE){
        double comprimentoEletronF = H/Math.sqrt((2*massaEletron*enFinalE));
        return comprimentoEletronF;
    }
    
    public double comprimentoInicialBroglieP(double enInicialP){
        double comprimentoProtonI = H/Math.sqrt((2*massaProton*enInicialP));
        return comprimentoProtonI;
    }
    
    public double comprimentoFinalBroglieP(double enFinalP){
        double comprimentoProtonF = H/Math.sqrt((2*massaProton*enFinalP));
        return comprimentoProtonF;
    }
    
    public double probabilidadeInicial(double n1, double L, double A, double B){
        double K = (n1*Math.PI)/L;
        double p = ((B - A) -(((Math.sin(2*K*B))/(2*K)) - Math.sin(2*K*A)/(2*K)))/L;
        return p*100;
    }
    
    public double probabilidadeFinal(double n2, double L, double a, double b){
        double K = (n2*Math.PI)/L;
        double p = ((b - a) -(((Math.sin(2*K*b))/(2*K)) - Math.sin(2*K*a)/(2*K)))/L;
        return p*100;
    }
    
    public double largura(double A){
        double l = 2/Math.pow(A, 2);
        return l;
 }
    
    public double nivel(double l, double k){
        double nivel = k*l/Math.PI;
        return nivel;
    }
    
    public double prob(double a, double k, double largura, double x){
        double ang = (k*x*largura*Math.PI)/180;
        
        double p = (Math.pow(a, 2)*(Math.pow(Math.sin(ang), 2)));
        return p;
    }  
    
    
    
    
}
