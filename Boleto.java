public class Boleto extends Pagamento {
   private String numeroDoBoleto;
   private int dia;
   private int mes;
   private int ano;
   
   public Boleto(String nomeDoPagador, String cpf, double valorASerPago, String numeroDoBoleto, int dia, int mes, int ano) {
      super(nomeDoPagador, cpf, valorASerPago);
      this.numeroDoBoleto = numeroDoBoleto;
      this.dia = dia;
      this.mes = mes;
      this.ano = ano;
   }
   
   public void setNumerDoBoleto(String numeroDoBoleto) {
      this.numeroDoBoleto = numeroDoBoleto;
   }
   public String getNumeroDoBoleto() {
      return numeroDoBoleto;
   }
   
   public void setDia(int dia) {
      this.dia = dia;
   }
   public int getDia() {
      return dia;
   }
   
   public void setMes(int mes) {
      this.mes = mes;
   }
   public int getMes() {
      return mes;
   }
   
   public void setAno(int ano) {
      this.ano = ano;
   }
   public int getAno() {
      return ano;
   }
}