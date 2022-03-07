package dio.desafio.poo.br.dominio;

public class Curso extends Conteudo {
  
    private int cargaHoraria;
    
    @Override
    public double calcularXp() { 
        return XP_PADRAO * cargaHoraria; 
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String toString(){
        return "Mentoria{" +
                "Título = " + getTitulo() + '\'' +
                ", Descrição = " + '\'' + getDescricao() + '\'' +
                ", Carga Horária = " + cargaHoraria;
    }
}
