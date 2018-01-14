import java.util.Date;

public class data {
    private String Invoice_Item_Number;
    private String Date;
    private int Store_Number;
    private String Store_Name;
    private String Address;
    private String City;
    private String Zip_Code;
    private String Store_Location;
    private int County_Number;
    private String County;
    private int Category;
    private String Category_Name;
    private int vendor_Number;
    private String Vendor_Name;
    private int Item_Number;
    private String Item_Description;
    private int pack;
    private int Bottle_Volume;
    private String State_Bottle_Cost;
    private String State_Bottle_Retail;
    private int Bottles_Sold;
    private String Sale_Dollars;
    private double Volume_Liters;
    private double Volume_gallons;

    public String getInvoice_Item_Number() {
        return Invoice_Item_Number;
    }

    public void setInvoice_Item_Number(String invoice_Item_Number) {
        Invoice_Item_Number = invoice_Item_Number;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public int getStore_Number() {
        return Store_Number;
    }

    public void setStore_Number(int store_Number) {
        Store_Number = store_Number;
    }

    public String getStore_Name() {
        return Store_Name;
    }

    public void setStore_Name(String store_Name) {
        Store_Name = store_Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getZip_Code() {
        return Zip_Code;
    }


    public String getStore_Location() {
        return Store_Location;
    }

    public void setStore_Location(String store_Location) {
        Store_Location = store_Location;
    }

    public int getCounty_Number() {
        return County_Number;
    }

    public void setCounty_Number(int county_Number) {
        County_Number = county_Number;
    }

    public String getCounty() {
        return County;
    }

    public void setCounty(String county) {
        County = county;
    }

    public int getCategory() {
        return Category;
    }

    public void setCategory(int category) {
        Category = category;
    }

    public String getCategory_Name() {
        return Category_Name;
    }

    public void setCategory_Name(String category_Name) {
        Category_Name = category_Name;
    }

    public int getVendor_Number() {
        return vendor_Number;
    }

    public void setVendor_Number(int vendor_Number) {
        this.vendor_Number = vendor_Number;
    }

    public String getVendor_Name() {
        return Vendor_Name;
    }

    public void setVendor_Name(String vendor_Name) {
        Vendor_Name = vendor_Name;
    }

    public int getItem_Number() {
        return Item_Number;
    }

    public void setItem_Number(int item_Number) {
        Item_Number = item_Number;
    }

    public String getItem_Description() {
        return Item_Description;
    }

    public void setItem_Description(String item_Description) {
        Item_Description = item_Description;
    }

    public int getPack() {
        return pack;
    }

    public void setPack(int pack) {
        this.pack = pack;
    }

    public int getBottle_Volume() {
        return Bottle_Volume;
    }

    public void setBottle_Volume(int bottle_Volume) {
        Bottle_Volume = bottle_Volume;
    }

    public String getState_Bottle_Cost() {
        return State_Bottle_Cost;
    }

    public void setState_Bottle_Cost(String state_Bottle_Cost) {
        State_Bottle_Cost = state_Bottle_Cost;
    }

    public String getState_Bottle_Retail() {
        return State_Bottle_Retail;
    }

    public void setState_Bottle_Retail(String state_Bottle_Retail) {
        State_Bottle_Retail = state_Bottle_Retail;
    }

    public int getBottles_Sold() {
        return Bottles_Sold;
    }

    public void setBottles_Sold(int bottles_Sold) {
        Bottles_Sold = bottles_Sold;
    }

    public String getSale_Dollars() {
        return Sale_Dollars;
    }

    public void setSale_Dollars(String sale_Dollars) {
        Sale_Dollars = sale_Dollars;
    }

    public double getVolume_Liters() {
        return Volume_Liters;
    }

    public void setVolume_Liters(double volume_Liters) {
        Volume_Liters = volume_Liters;
    }

    public double getVolume_gallons() {
        return Volume_gallons;
    }

    public void setVolume_gallons(double volume_gallons) {
        Volume_gallons = volume_gallons;
    }

    public void setZip_Code(String zip_Code) {
        Zip_Code = zip_Code;
    }

    public data(String Invoice_Item_Number,
                String Date,
                int Store_Number,
                String Store_Name,
                String Address,
                String City,
                String Zip_Code,
                String Store_Location,
                int County_Number,
                String County,
                int Category,
                String Category_Name,
                int vendor_Number,
                String Vendor_Name,
                int Item_Number,
                String Item_Description,
                int pack,
                int Bottle_Volume,
                String State_Bottle_Cost,
                String State_Bottle_Retail,
                int Bottles_Sold,
                String Sale_Dollars,
                double Volume_Liters,
                double Volume_gallons){
        this.Invoice_Item_Number = Invoice_Item_Number;
        this.Date = Date;
        this.Store_Number = Store_Number;
        this.Store_Name = Store_Name;
        this.Address = Address;
        this.City = City;
        this.Zip_Code = Zip_Code;
        this.Store_Location = Store_Location;
        this.County_Number = County_Number;
        this.County = County;
        this.Category = Category;
        this.Category_Name = Category_Name;
        this.vendor_Number = vendor_Number;
        this.Vendor_Name = Vendor_Name;
        this.Item_Number = Item_Number;
        this.Item_Description = Item_Description;
        this.pack = pack;
        this.Bottle_Volume = Bottle_Volume;
        this.State_Bottle_Cost = State_Bottle_Cost;
        this.State_Bottle_Retail = State_Bottle_Retail;
        this.Bottles_Sold = Bottles_Sold;
        this.Sale_Dollars = Sale_Dollars;
        this.Volume_Liters = Volume_Liters;
        this.Volume_gallons = Volume_gallons;
    }
}
