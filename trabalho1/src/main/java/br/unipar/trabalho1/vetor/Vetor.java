/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.trabalho1.vetor;

/**
 *
 * @author gabri
 */
public class Vetor {
        private int[] elementos;

    public Vetor(int tamanho) {
        this.elementos = new int[tamanho];
    }

    public int[] getElementos() {
        return elementos;
    }

    public void setElemento(int indice, int valor) {
        this.elementos[indice] = valor;
    }
}
