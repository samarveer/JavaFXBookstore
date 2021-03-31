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
public class Customer extends User {
    
    private int points;
    
    @SuppressWarnings("deprecation")
	public Customer() {
            points = 0;
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
    
    public void buyBook(Book b){
        //implement
    }
    
    public void redeemPoints(int points){
        //implement
    }
    
    @Override
    public String toString() {
        return " "; 
    }
    
}
