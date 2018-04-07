package ejemploarreglosmatrices;

import javax.swing.JOptionPane;

/**
 *
 * @author felipe_2
 */
public class EjemploArreglosMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //arreglos
        
        String pais [] = new String [3];
        pais[0] = "Colombia";
        pais[1] = "Brasil";
        pais[2] = "Argentina";
        
////        JOptionPane.showMessageDialog(null, "pais numero 1: "+pais[0]);
        
        String paises[] = {"Colombia","Brasil","Argentina"};
        
      for(int n=0;n<paises.length;n++){
            JOptionPane.showMessageDialog(null, paises[n]);
       }
        
        String paisesMatriz[][] = {{"Colombia","Brasil","Argentina"},{"Bogota","Brasilia","Buenos aires"},{"millos","santos","boca"}};
        
        for (int p=0;p<paisesMatriz.length;p++){
            
            
            for(int c=0; c<paisesMatriz[p].length; c++){
                
                if(paisesMatriz[p][c]== "Colombia"){
                   JOptionPane.showMessageDialog(null, "Pais "+paisesMatriz[p][c]+
                           " Capital "+paisesMatriz[1][c]+
                           " Equipos "+paisesMatriz[2][c]);
                }
                
                if(paisesMatriz[p][c]== "Brasil"){
                   JOptionPane.showMessageDialog(null, "Pais "+paisesMatriz[p][c]+
                           " Capital "+paisesMatriz[1][c]+
                           " Equipos "+paisesMatriz[2][c]);
                      
                }
                
                if(paisesMatriz[p][c]== "Argentina"){
                   JOptionPane.showMessageDialog(null, "Pais "+paisesMatriz[p][c]+
                           " Capital "+paisesMatriz[1][c]+
                           " Equipos "+paisesMatriz[2][c]);
                }
                
            }
        }
        
    }
    
}
