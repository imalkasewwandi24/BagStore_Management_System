
package Java_class;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Bag_Details {
    private String  BagName;
    private String  BagId;
    private String BagColor;
    private String BagCode;
    private String BagSize;
    private String Catagorise;
    private String Price;

    private int BagCount;
    Bag_Details_FileHandler Bag_FILE = new Bag_Details_FileHandler("Bag.txt");
  
     public static void Bag_Details(String Bag) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Bag.txt", true))) {
            writer.write(Bag);
            writer.newLine();
        } catch (IOException e) {
        }
    } 
      public Bag_Details(){}
    
    public Bag_Details(String BagName, String BagId, String BagColor, String BagCode, String BagSize, String Catagorise, String Price) {
        this.BagId = BagId;
        this.BagName = BagName;
        this.BagColor = BagColor;
         this.BagCode = BagCode;
        this.BagSize= BagSize;
        this.Catagorise = Catagorise;
        this.Price = Price;
 
    }

    public String getBagName() {
        return BagName;
    }

    public void setBagName(String BagName) {
        this.BagName = BagName;
    }
 
    public String getBagId() {
        return BagId;
    }

    public void setBagId(String BagId) {
        this.BagId = BagId;
    }


    public String getBagColor() {
        return BagColor;
    }
    
    public void setBagColor(String BagColor) {
        this.BagColor = BagColor;
    }
    
     public String getBagCode() {
        return BagCode;
    }
    
    public void setBagCode(String BagCode) {
        this.BagCode = BagCode;
    }
    
    public String getBagSize() {
        return BagSize;
    }

    public void setBagSize(String BagSize) {
        this.BagSize = BagSize;
    }

    public String getCatagorise() {
        return Catagorise;
    }

    public void setCatagorise(String Catagorise) {
        this.Catagorise = Catagorise;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }  
        public int getBagCount() {
        return BagCount;
    }

    public void setBagCount(int BagCount) {
        this.BagCount = BagCount;
    }
    
           public boolean addBag() {
        
        if(!Bag_FILE.create_NewFile())
        {
String record =  BagId + " " + BagName + " " + BagColor + " " + BagCode+" " +BagSize + " "+ Catagorise + " "
        +  Price+" ";
System.err.println(BagId + " " + BagName + " " + BagColor + " " + BagCode +" " +BagSize+ " " 
        + Catagorise + " " +  Price+" ");
            return Bag_FILE.writeDataToFile(record);
        }
        return false;
    }
    
   public static void SearchBag(String Bag) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Bag.txt", true))) {
            writer.write(Bag);
            writer.newLine();
        } catch (IOException e) {
        }
    }
   
         public boolean searchBag(String keyword) 
      {
        boolean isFound = false;   
        try {
            String[] words =null ;          
            BufferedReader bufferedReader = Bag_FILE.readAFile();
            String bag;       
            outerloop:
            while ((bag = bufferedReader.readLine()) != null) 
                
            {              
                words = bag.split(" ");          
                for (String word : words) 
                {
                    if (word.equals(keyword)) 
                    {
                        isFound = true;                      
                        this.setBagId(words[0]);
                        this.setBagName(words[1]);
                        this.setBagColor(words[2]);
                         this.setBagCode(words[3]);
                  this.setBagSize(words[4]);
                    this.setCatagorise(words[5]);
                 this.setPrice(words[6]);
                
                        
                        break outerloop;
                    }
                }
            }
        } catch (IOException e) {
             System.err.println("Something went wrong searching Bag" + e);
        } 
        return isFound;
    }
    
       public String viewAllBag () 
      {
        String Bag, allBag = " ";
        String[] words = null;
        int count = 1;
        BufferedReader bufferedReader = Bag_FILE.readAFile();
        try {
            while ((Bag = bufferedReader.readLine()) != null) {     
                words = Bag.split(" ");
allBag = allBag + words[1] + "\t" + words[2] + "\t" + 
        words[3] + "\n";
                count++;               
            }
        } catch (IOException e) {
            System.err.println("Something went wrong when vewing Bags" + e);
        }
        setBagCount(count);
        return allBag;
    }

    

    

    
    
}
