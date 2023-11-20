public class Bolsista extends Aluno{
    private float bolsa;
    public void renovarBolsa(){
        System.out.println("Renovando bolsa de "+ this.getNome());
    }

    @Override
    public void pagarMensalidade() {
        System.out.println(this.getNome()+ " é bolsista! pagando mensalidade");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
