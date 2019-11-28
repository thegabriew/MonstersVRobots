package monstervrobots;

public class Personagem {
    private String nome;
    private double ataque;
    private double defesa;
    private double esquiva;
    private double bonusAtaque;
    private double bonusDefesa;
    private double hp;
    private String estado;

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

    public double getDefesa() {
        return defesa;
    }

    public void setDefesa(double defesa) {
        this.defesa = defesa;
    }

    public double getEsquiva() {
        return esquiva;
    }

    public void setEsquiva(double esquiva) {
        this.esquiva = esquiva;
    }

    public double getBonusAtaque() {
        return bonusAtaque;
    }

    public void setBonusAtaque(double bonusAtaque) {
        this.bonusAtaque = bonusAtaque;
    }

    public double getBonusDefesa() {
        return bonusDefesa;
    }

    public void setBonusDefesa(double bonusDefesa) {
        this.bonusDefesa = bonusDefesa;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }
    
   
    public void atacar(Personagem alvo) {
        estado = "Ataque";
 System.out.println(nome + " ataca o personagem: "+alvo.getNome());
       if(alvo.getEstado().equals("Defesa")) {
          if(ataque > alvo.getDefesa()) {
              // causa algum dano
          } else {
              // dano é igual a 0
          }
       } else if(alvo.getEstado().equals("Esquiva")) {
            if(alvo.getEsquiva() == 3) {
              // O alvo conseguiu se esquivar
          } else {
              // alvo recebe o dano
          }
       }
 
    }
    
    
}
