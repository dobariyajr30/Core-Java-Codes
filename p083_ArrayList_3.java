package jDemo9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class inventory 
{
    int itm_id, itm_qt, itm_price;
    String itm_name;

    inventory(int xid,int xqt,int xprice,String xname) 
    {
        itm_id=xid;
        itm_qt=xqt;
        itm_price=xprice;
        itm_name=xname;
    }

    public void printData() 
    {
        System.out.println("-------------------------------");
        System.out.println("Item ID = "+itm_id);
        System.out.println("Item Name = "+itm_name);
        System.out.println("Item Quantity = "+itm_qt);
        System.out.println("Item Price = "+itm_price);
        System.out.println("-------------------------------");
    }

    public int getId() 
    {
        return itm_id;
    }

    public int getQuantity() 
    {
        return itm_qt;
    }

    public void setQuantity(int newQt)
    {
        itm_qt = newQt;
    }

    public void setPrice(int newPrice)
    {
        itm_price = newPrice;
    }

    public void setName(String newName)
    {
        itm_name = newName;
        
    }
}

public class p083_ArrayList_3
{
    public static void main(String[] args) 
    {
  
        int item_id[]={101,102,103,104,105,106,107,108,109,110,111,112,113,114,115};
        int item_quantity[] = {20,15,50,30,25,10,60,35,45,40,18,22,12,33,29};
        int item_price[] = {199,299,150,89,249,199,349,179,129,209,139,319,109,279,159};
        String item_name[] = {"Laptop","Smartphone","Headphones","Keyboard","Monitor","Mouse","Tablet","Printer","Router","Hard Drive","SSD","RAM","Motherboard","Graphics Card","Power Supply"};

        ArrayList<inventory> inventoryList=new ArrayList<>();
        Scanner sc=new Scanner(System.in);

        for (int i=0; i<15; i++)
        {
            inventory inv=new inventory(item_id[i],item_quantity[i],item_price[i],item_name[i]);
            inventoryList.add(inv);
        }

        while (true) 
        {
            System.out.println("---- Inventory Management ----");
            System.out.println("1. View All Inventory Items");
            System.out.println("2. Add New Inventory Item");
            System.out.println("3. Update Inventory Item Details");
            System.out.println("4. Remove Inventory Item by ID");
            System.out.println("5. Remove Out-of-Stock Items");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int opt=sc.nextInt();

            if (opt==1) 
            {
                Iterator<inventory> itr=inventoryList.iterator();
                while (itr.hasNext()) 
                {
                    inventory inv=itr.next();
                    inv.printData();
                    System.out.println();
                }
            } 
            else if (opt==2) 
            {
                System.out.println("Enter new item details:");
                System.out.print("Item ID: ");
                
                int newId=sc.nextInt();
                
                System.out.print("Item Name: ");
                sc.nextLine();
                
                String newName = sc.nextLine();
                System.out.print("Item Quantity: ");
                int newQt = sc.nextInt();
                
                System.out.print("Item Price: ");
                int newPrice = sc.nextInt();

                inventory newItem = new inventory(newId, newQt, newPrice, newName);
                inventoryList.add(newItem);
                System.out.println("New inventory item added successfully!");

            }
            else if (opt==3) 
            {
                System.out.print("Enter the ID of the item to update: ");
                int searchId = sc.nextInt();
                boolean found = false;

                for (inventory inv : inventoryList) 
                {
                    if (inv.getId() == searchId)
                    {
                        found = true;
                        System.out.println("Item found:");
                        inv.printData();

                        System.out.println("What would you like to update?");
                        System.out.println("1. Quantity");
                        System.out.println("2. Price");
                        System.out.println("3. Name");
                        int updateOpt = sc.nextInt();

                        if (updateOpt == 1) 
                        {
                            System.out.print("Enter new quantity: ");
                            int newQt = sc.nextInt();
                            inv.setQuantity(newQt);
                            System.out.println("Quantity updated successfully!");

                        } 
                        else if (updateOpt == 2) 
                        {
                            System.out.print("Enter new price: ");
                            int newPrice = sc.nextInt();
                            inv.setPrice(newPrice);
                            System.out.println("Price updated successfully!");

                        }
                        else if (updateOpt == 3)
                        {
                            System.out.print("Enter new name: ");
                            sc.nextLine();  // Consume newline
                            String newName = sc.nextLine();
                            inv.setName(newName);
                            System.out.println("Name updated successfully!");
                        } 
                        else 
                        {
                            System.out.println("Invalid option.");
                        }
                        break;
                    }
                }

                if (!found)
                {
                    System.out.println("Item with ID " + searchId + " not found.");
                }

            } 
            else if (opt==4) 
            {
                System.out.print("Enter the ID of the item to remove: ");
                int removeId = sc.nextInt();
                boolean removed = false;

                Iterator<inventory> itr = inventoryList.iterator();
                while (itr.hasNext())
                {
                    inventory inv = itr.next();
                    if (inv.getId() == removeId)
                    {
                        itr.remove();
                        removed = true;
                        System.out.println("Item removed successfully!");
                        break;
                    }
                }

                if (!removed)
                {
                    System.out.println("Item with ID " + removeId + " not found.");
                }

            } 
            else if (opt==5) 
            {
                Iterator<inventory> itr = inventoryList.iterator();
                while (itr.hasNext())
                {
                    inventory inv = itr.next();
                    if (inv.getQuantity() == 0)
                    {
                        itr.remove();
                    }
                }
                System.out.println("Out-of-stock items removed successfully!");

            } 
            else if (opt==6) 
            {
                System.out.println("Exiting inventory management system.");
                break;
            }
            else 
            {
                System.out.println("Invalid option. Please try again.");
            }
        }

        sc.close();
    }
}
