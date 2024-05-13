package Aula0205;
import javax.swing.JOptionPane; 

public class calculadora {
	public static void main(String[] args) { 

		String menu=("Escolha a operação que deseja realizar \n1.-Soma\n2-subtração\n3-multiplicação\n4-divisão\n5-Exponencial\n6-Raiz quadrada\n7-Encerrar sessao\\n"), e1=("Insira numero(s) a calcular\nN1:"),e2=("N2:"),re=("\nResultado: ");
		double n1,n2,r; 
		int opcao; 

		do {
			opcao= Integer.parseInt(JOptionPane.showInputDialog(null,menu));
			
			switch(opcao){
			case 1:
				n1= Double.parseDouble(JOptionPane.showInputDialog(null,"Soma\n" + e1));
				n2= Double.parseDouble(JOptionPane.showInputDialog(null,e2));
				r=n1+n2; 
				JOptionPane.showMessageDialog(null, re+r); 
			break;
			
			case 2: 
				n1= Double.parseDouble(JOptionPane.showInputDialog(null,"Subtração\\n" + e1));
				n2= Double.parseDouble(JOptionPane.showInputDialog(null,e2));
				r=n1-n2; 
				JOptionPane.showMessageDialog(null, re+r);
			break; 

			case 3: 
				n1= Double.parseDouble(JOptionPane.showInputDialog(null,"Multiplição\n" + e1));
				n2= Double.parseDouble(JOptionPane.showInputDialog(null,e2));
				r=n1*n2; 
				JOptionPane.showMessageDialog(null, re+r); 
			break;
			case 4: 
				n1= Double.parseDouble(JOptionPane.showInputDialog(null,"Divisão\n" + e1));
				n2= Double.parseDouble(JOptionPane.showInputDialog(null,e2));
				if(n2==0) { 
					JOptionPane.showMessageDialog(null,"\nOperação invalida.");
				}else { 
					r=n1/n2; 
					JOptionPane.showMessageDialog(null, re+r);} 
			break; 
			case 5: 
				n1= Double.parseDouble(JOptionPane.showInputDialog(null,"Exponencial\n" + e1));
				n2= Double.parseDouble(JOptionPane.showInputDialog(null,"Exponencia: "));
				r=Math.pow(n1,n2); 
				JOptionPane.showMessageDialog(null, re+r); 
			break; 
			case 6:
				n1= Double.parseDouble(JOptionPane.showInputDialog(null,"Raiz quadrada\n" + e1)); 
				r=Math.sqrt(n1); 
				JOptionPane.showMessageDialog(null, re+r); 
			break;
			case 7:
			break;
			default:
				JOptionPane.showMessageDialog(null,"Opção invalida.");
			};
			if(opcao==7) {
				JOptionPane.showMessageDialog(null,"Encerrando sessão");
			}else {
				opcao= JOptionPane.showConfirmDialog(null, "Deseja continuar calculando?", "SESSÃO" , JOptionPane.YES_NO_OPTION);
			}
	        
        }while(opcao== JOptionPane.YES_OPTION);
	}
};