/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;

import javax.swing.JOptionPane;

/**
 *
 * @author malcolmx
 */
public class main {
    public static void main(String[] args) {
         Principal vent=new Principal();
        vent.setTitle("Resultados");
        
   Integer a,b,c,d,e,f,g,h,i,j,k,l,m,n,ñ,o,opcion,a11,a12,a13,a14,a21,a22,a23,a24,a31,a32,a33,a34,a41,a42,a43,a44 = 0;
   double determ,ai,ai11,ai12,ai13,ai14,ai21,ai22,ai23,ai24,ai31,ai32,ai33,ai34,ai41,ai42,ai43,ai44 =0;
   
   opcion = Integer.parseInt(JOptionPane.showInputDialog("1: Matriz 2x2" + 
                "\n2: Matriz 3x3"+ "\n3: Matrizes 4x4"));
        
        switch (opcion){
        case 1: 
          
           /** Operacion Determinate **/
           determ = (a*d)-((b*c));
           ai=1/determ;
           
           if (determ==0){
               JOptionPane.showMessageDialog(null,"Esta matriz no tiene Inversa" +
                       "\n"+a + "   " +b+
                       "\n"+c + "   " +d);

               break;
           } else {
               JOptionPane.showMessageDialog(null,"\nValor de la Determinate: "+ determ +"\nMatriz Transpuesta :" +
                       /** Operacion Matriz Transpuesta **/
                       "\n"+a + "   " +c +
                       "\n"+b + "   " +d);

               
               /** Operacion Matriz adjunta **/
                a11= d; a12= -(b); 
                a21= -(c); a22=a;
                
                JOptionPane.showMessageDialog(null,"\nMatriz Adjunta" +
                       "\n"+a11+ "   " + a12 + 
                       "\n"+a21+ "   " + a22 +
                       "\nMatriz Inversa"+
                       "\n"+ai*a11+ "   " + ai*a12 + 
                       "\n"+ai*a21+ "   " + ai*a22);
            break;
           } 
        case 2:
           
           /** Operacion Determinate **/
           determ = (a*e*i)+(d*h*c)+(g*b*f)-((c*e*g)+(h*f*a)+(i*d*b));
           ai=1/determ;
           
           if (determ==0){
               JOptionPane.showMessageDialog(null,"Esta matriz no tiene Inversa" +
                       "\n"+a + "   " +b+ "   " +c +
                       "\n"+d + "   " +e+ "   " +f +
                       "\n"+g + "   " +h+ "   " +i);
               break;
           } else {
               JOptionPane.showMessageDialog(null,"\nValor de la Determinate: "+ determ +"\nMatriz Transpuesta :" +
                       /** Operacion Matriz Transpuesta **/
                       "\n"+a + "   " +d+ "   " +g +
                       "\n"+b + "   " +e+ "   " +h +
                       "\n"+c + "   " +f+ "   " +i);
               
               /** Operacion Matriz adjunta **/
                a11= (e*i)-(f*h); a12= -((d*i)-(f*g)); a13= (d*h)-(e*g); 
                a21= -((b*i)-(c*h)); a22= (a*i)-(c*g); a23= -((a*h)-(b*g)); 
                a31= (b*f)-(e*c); a32= -((a*f)-(d*c)); a33= (a*e)-(d*b);
                
                JOptionPane.showMessageDialog(null,"\nMatriz Adjunta" +
                       "\n"+a11+ "   " + a12 + "   " + a13 +
                       "\n"+a21+ "   " + a22 + "   " + a23 +
                       "\n"+a31+ "   " + a32 + "   " + a33 +
                       "\nMatriz Inversa"+
                       "\n"+ai*a11+ "   " + ai*a12 + "   " + ai*a13 +
                       "\n"+ai*a21+ "   " + ai*a22 + "   " + ai*a23 +
                       "\n"+ai*a31+ "   " + ai*a32 + "   " + ai*a33 );
             break;
           }
        case 3:
           
           /** Operacion Determinate **/
           determ = (a*e*i)+(d*h*c)+(g*b*f)-((c*e*g)+(h*f*a)+(i*d*b));
           ai=1%determ;
           
           if (determ==0){
               JOptionPane.showMessageDialog(null,"Esta matriz no tiene Inversa" +
                       "\n"+a + "   " +b+ "   " +c +
                       "\n"+d + "   " +e+ "   " +f +
                       "\n"+g + "   " +h+ "   " +i);
               break;
           } else {
               JOptionPane.showMessageDialog(null,"\nValor de la Determinate: "+ determ +"\nMatriz Transpuesta :" +
                       /** Operacion Matriz Transpuesta **/
                       "\n"+a + "   " +d+ "   " +g +
                       "\n"+b + "   " +e+ "   " +h +
                       "\n"+c + "   " +f+ "   " +i);
               
               /** Operacion Matriz adjunta **/
                a11= (e*i)-(f*h); a12= -((d*i)-(f*g)); a13= (d*h)-(e*g); 
                a21= -((b*i)-(c*h)); a22= (a*i)-(c*g); a23= -((a*h)-(b*g)); 
                a31= (b*f)-(e*c); a32= -((a*f)-(d*c)); a33= (a*e)-(d*b);
                
                JOptionPane.showMessageDialog(null,"\nMatriz Adjunta" +
                       "\n"+a11+ "   " + a12 + "   " + a13 +
                       "\n"+a21+ "   " + a22 + "   " + a23 +
                       "\n"+a31+ "   " + a32 + "   " + a33 +
                       "\nMatriz Inversa"+
                       "\n"+ai*a11+ "   " + ai*a12 + "   " + ai*a13 +
                       "\n"+ai*a21+ "   " + ai*a22 + "   " + ai*a23 +
                       "\n"+ai*a31+ "   " + ai*a32 + "   " + ai*a33 );
             break;
             }
        default:
            throw new AssertionError();
        }
    
    }
    
}
