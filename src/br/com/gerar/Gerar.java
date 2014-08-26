/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gerar;

import br.com.entidade.Pessoa;



/**
 *
 * @author baquino
 */
public class Gerar {
    
    
    public static void main(String[] args){
        
        Pessoa pessoa = new Pessoa();
        
        pessoa.setId(Long.valueOf(1000));
        pessoa.setNome("Bruno Aquino");
        pessoa.setEmail("theodorodeaquino@gmail.com");
        
        pessoa.xStrem(pessoa);
        
       
        pessoa.geraArquivo(pessoa.xStrem(pessoa));
        
        
        
    }
    
}
