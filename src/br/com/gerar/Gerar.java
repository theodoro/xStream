/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gerar;

import br.com.entidade.Pessoa;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;



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
