/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.entidade;

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
public class Pessoa {
    
    private Long id;
    private String nome;
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
   public String xStrem(Pessoa pessoa){
       
        XStream xStream = new XStream(new DomDriver());
        xStream.alias("Pessoa", Pessoa.class);
        String xml = xStream.toXML(pessoa);
        
        System.out.println(xml);
        
        return  xml;
   }
   
   public void geraArquivo(String xml){
        
        PrintWriter print = null;  
        try {
            File file = new File("/home/baquino/Documentos/Java/arquivo.xml");
            print = new PrintWriter(file);
            print.write(xml);
            print.flush();
            print.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pessoa.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            print.close();
        }
       
   }
    
}
