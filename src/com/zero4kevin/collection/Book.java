package com.zero4kevin.collection;

class Book implements Comparable<Book>{
    int id;
    String name, author, publisher;
    int quantity;

    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    public int compareTo(Book b){
        if (this.id>b.id){
            return 1;
        }else if(this.id<b.id){
            return -1;
        }else{
            return 0;
        }
    }
    public String toString(){
        return "id is "+ id +", name is " + name +", author is "+author + ", publisher is "+ publisher + ", quantity is "+ quantity;
    }
}