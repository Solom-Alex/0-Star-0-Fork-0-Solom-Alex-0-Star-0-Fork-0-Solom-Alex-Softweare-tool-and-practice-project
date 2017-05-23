import javax.swing.JOptionPane;

 class Gitab_calculetor 
 {
      int a,b;
      public void sum()
      {
          String a= JOptionPane.showInputDialog("enter the first number");
          int f=Integer.parseInt(a);
          String b=JOptionPane.showInputDialog("enter the Second number");
          int g=Integer.parseInt(b);
          int c=f+g;
          JOptionPane.showMessageDialog(null,"the sum is "+c );
      }
      public void diference(){
      String a= JOptionPane.showInputDialog("enter the first number");
          int f=Integer.parseInt(a);
          String b=JOptionPane.showInputDialog("enter the Second number");
          int g=Integer.parseInt(b);
          int c=f+g;
          JOptionPane.showMessageDialog(null,"the sum is "+c );
      }
    
     
     public static void main(String[] args) {
      Gitab_calculetor Gc=new Gitab_calculetor();
      String a= JOptionPane.showInputDialog(" 1 for Adition 2 for subtraction 3 for product 4 for divition");
       int f=Integer.parseInt(a);
      if(f==1){
      Gc.sum(); 
      }
      else if(f==2){
      Gc.diference();    
      }
//      else if(f==3){
//      Gc.product();
//      }
//      else if(f==4){
//      Gc.divition();
//      }
//      
      else{
      JOptionPane.showMessageDialog(null,"plese read  insraction");
      }
      //String b= JOptionPane.showInputDialog("enter B for Subtraction number");
      
    }
    
}
