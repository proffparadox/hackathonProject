import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import com.opencsv.CSVReader;

public class main {
        public static void main(String[] args) throws IOException {
            String Invoice_Item_Number;
            String Date;
            int Store_Number;
            String Store_Name;
            String Address;
            String City;
            String Zip_Code;
            String Store_Location;
            int County_Number;
            String County;
            int Category;
            String Category_Name;
            int vendor_Number;
            String Vendor_Name;
            int Item_Number;
            String Item_Description;
            int pack;
            int Bottle_Volume;
            String State_Bottle_Cost;
            String State_Bottle_Retail;
            int Bottles_Sold;
            String Sale_Dollars;
            double Volume_Liters;
            double Volume_gallons = 0;
            int i = 0;
            data[] funglebungle = new data[13000000];
            try (CSVReader reader = new CSVReader(new FileReader("Iowa_Liquor_Sales.csv"))){
                reader.readNext();
                String[] nextLine;
                while((nextLine = reader.readNext()) != null) {
                    Invoice_Item_Number = nextLine[0];
                    Date = nextLine[1];
                    Store_Number = Integer.parseInt(nextLine[2]);
                    Store_Name = nextLine[3];
                    Address = nextLine[4];
                    City = nextLine[5];
                    Zip_Code = nextLine[6];
                    if(nextLine[7].equals("")){
                        Store_Location = "Empty";
                    } else {
                        Store_Location = nextLine[7];
                    }
                    if(nextLine[8].equals("")){
                        County_Number = 0;
                    } else {
                        County_Number = Integer.parseInt(nextLine[8]);
                    }
                    County = nextLine[9];
                    if(nextLine[10].equals("")){
                        Category = 0;
                    } else {
                        Category = Integer.parseInt(nextLine[10]);
                    }
                    if(nextLine[11].equals("")) {
                        Category_Name = "Empty";
                    } else Category_Name = nextLine[11];
                    vendor_Number = Integer.parseInt(nextLine[12]);
                    Vendor_Name = nextLine[13];
                    Item_Number = Integer.parseInt(nextLine[14]);
                    Item_Description = nextLine[15];
                    pack = Integer.parseInt(nextLine[16]);
                    Bottle_Volume = Integer.parseInt(nextLine[17]);
                    State_Bottle_Cost = nextLine[18];
                    State_Bottle_Retail = nextLine[19];
                    Bottles_Sold = Integer.parseInt(nextLine[20]);
                    Sale_Dollars = nextLine[21];
                    if(nextLine[22].equals("")) {
                        Volume_Liters = 0;
                    } else { Volume_Liters = Double.parseDouble(nextLine[22]); }
                    if(nextLine[23].equals("")){
                        Volume_gallons = 0;
                    } else { Volume_gallons = Double.parseDouble(nextLine[23]); }
                    funglebungle[i] = new data(Invoice_Item_Number, Date, Store_Number, Store_Name, Address, City, Zip_Code, Store_Location, County_Number, County, Category, Category_Name, vendor_Number, Vendor_Name, Item_Number, Item_Description, pack, Bottle_Volume, State_Bottle_Cost, State_Bottle_Retail, Bottles_Sold, Sale_Dollars, Volume_Liters, Volume_gallons);
                    i++;
                    }
                }
                System.out.print(funglebungle[0].getInvoice_Item_Number());
            }

    }
