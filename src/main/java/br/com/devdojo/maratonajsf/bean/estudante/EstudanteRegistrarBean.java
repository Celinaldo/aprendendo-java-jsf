package br.com.devdojo.maratonajsf.bean.estudante;

import br.com.devdojo.maratonajsf.model.Estudante;


import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.util.*;

import static java.util.Arrays.asList;

@Named

public class EstudanteRegistrarBean {

    private Estudante estudante = new Estudante();
    private String[] nomesArry = {"junior", "eh", "foda"};
    private List<String> nomesList = asList("junior", "joao", "celinaldo", "ferreira");
    private Set<String> nomesSet = new HashSet<>(asList("naruto", "Goku", "sasuke", "boruto"));
    private Map<String, String> nomesMap = new HashMap<>();
    private boolean mostrarNotas;
    private boolean mostrarLink;

    {
        nomesMap.put("Goku", "o mais forte");
        nomesMap.put("One Piece", "O mais longo");
        nomesMap.put("Naruto", "O com mais lenga lenga");

        //    for (Map.Entry<String , String  >entry : nomesMap.entrySet())   {
        //     System.out.println(entry.getKey());
        //     System.out.println(entry.getValue());
        //    }
    }

    /*
        public void executar(){
            System.out.println("fazendo uma busca no BD");
            System.out.println("Processando dados");
            System.out.println("exibindo dados");
        }
    */
    public String irParaIndex2() {
        return "index2";
    }

    public void exibirNotas() {
        this.mostrarNotas = true;

    }

    public void esconderNotas() {
        this.mostrarNotas = false;

    }
    public void exibirLinck() {
        this.mostrarLink = true;

    }

    public void esconderLinck() {
        this.mostrarLink = false;

    }


    public boolean isMostrarNotas() {
        return mostrarNotas;
    }

    public void setMostrarNotas(boolean mostrarNotas) {
        this.mostrarNotas = mostrarNotas;
    }

    public Map<String, String> getNomesMap() {
        return nomesMap;
    }

    public void setNomesMap(Map<String, String> nomesMap) {
        this.nomesMap = nomesMap;
    }

    public Set<String> getNomesSet() {
        return nomesSet;
    }

    public void setNomesSet(Set<String> nomesSet) {
        this.nomesSet = nomesSet;
    }

    public List<String> getNomesList() {
        return nomesList;
    }

    public void setNomesList(List<String> nomesList) {
        this.nomesList = nomesList;
    }

    public String[] getNomesArry() {
        return nomesArry;
    }

    public void setNomesArry(String[] nomesArry) {
        this.nomesArry = nomesArry;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    public boolean isMostrarLink() {
        return mostrarLink;
    }

    public void setMostrarLink(boolean mostrarLink) {
        this.mostrarLink = mostrarLink;
    }
}
