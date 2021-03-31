/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore;

/**
 *
 * @author Samarveer Sandhu
 */
public class Owner extends User{
    
    private int points;
    private String status;
    
    @SuppressWarnings("deprecation")
    public Owner(){
        points = 0;
        status = " ";
    }

    @Override
    public void login() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void logout() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public double getPoints(){
        return points;
    }
    
    public void setPoints(int points){
        this.points = points;
    }
    
    public String getStatus(){
        return status;
    }
    
    public void setStatus(String status){
        this.status = status;
    }
    
    public void addBook(){
        //implement
    }
    
    public void deleteBook(){
        //implement
    }
    
    public void addCustomer(){
        //implement
    }
    
    public void deleteCustomer(){
        //implement
    }
    
    public void changeStatus(){
        //implement
    }
    
    @Override
    public String toString() {
        return " ";  
    }
    
}
