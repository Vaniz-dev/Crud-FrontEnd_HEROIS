/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;
public class Heroi {
    private int id;
    private String nome, habilidade, fraqueza, foto;
    
    public Heroi(){}
    public Heroi(String nome, String habilidade, String fraqueza, String foto) {
        this.nome = nome; this.habilidade = habilidade;
        this.fraqueza = fraqueza; this.foto = foto;
    }
// Métodos Getters e Setters de Acesso aos Dados
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getHabilidade() { return habilidade; }
    public void setHabilidade(String habilidade) { this.habilidade = habilidade; }
    public String getFraqueza() { return fraqueza; }
    public void setFraqueza(String fraqueza) { this.fraqueza = fraqueza; }
    public String getFoto() { return foto; }
    public void setFoto(String foto) { this.foto = foto; }
}