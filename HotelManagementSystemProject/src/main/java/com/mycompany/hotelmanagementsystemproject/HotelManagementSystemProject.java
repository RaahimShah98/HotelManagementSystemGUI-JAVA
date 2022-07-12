/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.hotelmanagementsystemproject;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
        
        
/**
 *
 * @author raahi
 */

class roomBook{
   String[] roomNoArray = new String[100];
   String roomName;
  
    
    void setRoomName(String Name , int Index){
        roomNoArray[Index] = Name;
        
    }
    public String getRoomName(){
        return roomName;
      
   }
   roomBook(){
       
      for(int i=0 ; i<100 ; i++){           if(i<=10){
                roomName = "Room " + i +" (VIP) ";            
      }
            else{
                roomName = "Room " + i ; 
            }
            roomNoArray[i] = roomName;
    }
}

}  
    

public class HotelManagementSystemProject {
     
    public static void main(String[] args) {
      
        String roomName;
        
        try{
            File myObj = new File("UserData.txt");
            if(myObj.createNewFile()){
                System.out.println("File created: " + myObj.getName());
            }
            else{
                System.out.println("File already exists");
            }
            
            FileWriter myWriter = new FileWriter("UserData.txt");
            for(int i=0 ; i<100 ; i++){
            if(i<10){
                roomName = "Room " + (i+1) +"(VIP)\n"; 
                
                myWriter.write(roomName);
                
                
            }
            else{
                roomName = "Room " + (i+1)+'\n' ; 
                myWriter.write(roomName);
            } 
           
    }
           
        myWriter.close();    
            
        }catch(IOException e){
            System.out.println("An error occured");
             e.printStackTrace();
        }
               
        LoginForm runn = new LoginForm();
        runn.show();
    }
}


