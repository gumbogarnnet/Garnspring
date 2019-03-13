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
public class author {
    @id
    @GeneratedValue(strategy=GenerationType:AUTO)
    
    
    private String frstname;
    private String lstname;
    
    private Set<Book> books = new HashSet<>();
    
    public author();{
}
    public author(String frstname,String lstname){
        this.frstname=frstname;
        this.lstname=lstname;
        
    }
    @ManytoMany
     public author(String frstname,String lstname,Set<Book> books){
        this.frstname=frstname;
        this.lstname=lstname;
        this.book=books;
        
    }
     public long getid(){return id;}
     public void setid (string id){this id=id}
     
     public String getfrstname(){return frstname;}
     public void setfrstname(String frstname){this frstname=frstname}
     
      public String getlstname(){return lstname;}
     public void setlstname(String lstname){this lstname=lstname}
     
      public Set<Book> getBooks(){return books;}
     public void setBooks  (Set<Books> books){this books=books}
}
    
    
    
    
