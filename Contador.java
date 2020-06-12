/**
   Esta classe modela um contador analógico de mão.
*/
public class Contador
{
   private int valor;
   private int limiteMaximo;

   /**
      Devolve o valor atual do contador.
      @return o valor atual do contador.
   */
   public int getValor()
   {
      return valor;
   }

   /**
      Incrementa o contador em uma unidade.
   */
   public void conta()
   {
      if(valor < limiteMaximo){
         valor = valor + 1;
      }
      else
         {
            System.out.println("Limite excedido.");
         }
   }

   /**
    * Reinicializa o contador passando o valor para zero.
    */
   public void reinicializa()
   {
      valor = 0;
   }

   /**
    * Desfaz a última contagem.
    */
   public void desfazer()
   {
      if(valor <= 0) {
         System.out.print("Contador zerado.");
      }
      else {
         valor = valor -1;
      }

   }

   /**
    * Coloca um limite de contagem.
    */
   public void ajustaLimite(int maximo)
   {
      limiteMaximo = maximo;
   }
}
