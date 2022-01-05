/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Onur
 */
public class Node <Item> {
    Item data;
    Node next;
    
    public Node(Item data) {
        this.data = data;
        next = null;
    }
    
    @Override
    public String toString(){
        return (" "+data.toString());
    }
}
