/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.monotonic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author erick
 */
public class CollectionsConcept {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Product door = new Product("wooden Door", 35);
        Product floorPanel = new Product("floor panel", 25);
        Product window = new Product("glass window", 10);
        
        Collection<Product> products = new ArrayList<>();
        products.add(door);
        products.add(floorPanel);
        products.add(window);
        
       //System.out.println(product);
//         final Iterator<Product> productIterator = products.iterator();
//         while (productIterator.hasNext()) {
//            Product product = productIterator.next();
//             System.out.println(product);  
         for(Product product: products){
             System.out.println(product);
        }
    }
    
}
