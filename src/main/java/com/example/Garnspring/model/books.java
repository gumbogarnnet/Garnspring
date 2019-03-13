/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Garnspring.model;

/**
 *
 * @author Garnet
 */
@Entity
public class books {
    @id
    @GeneratedValue(strategy=GenerationType:AUTO)
    
    private String title;
    private String isbn;
    private String publisher;
    
    private Set<author> authors = new HashSet<>();
    
    public book();{
}
    public author(String title,String isbn,String publisher){
        this.title=title;
        this.isbn=isbn;
        this.publisher=publisher;
        
    }
    @ManytoMany
     public author(String title,String isbn,String publisher,Set<Author> authors){
        this.title=title;
        this.isbn=isbn;
        this.publisher=publisher;
        this.author=authors;
    }
     public long getid(){return id;}
     public void setid (string id){this id=id}
     public String gettitle(){return title;}
     public void settitle(String title){this title=title}
     
      public String getisbn(){return isbn;}
     public void setisbn(String isbn){this isbn=isbn}
     
      public String getpublisher(){return publisher;}
     public void setpublisher(String publisher){this publisher=publisher}
     
      public Set<Author> getAuthors(){return authors;}
     public void setAuthors  (Set<Authors> authors){this authors=authors}
    
}
