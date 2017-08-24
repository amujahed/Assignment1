package com.thoughtworks.foodbazar;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.foodbazar.customer.Customer;
import com.thoughtworks.foodbazar.customer.CustomerOrder;
import com.thoughtworks.foodbazar.fruit.Apple;
import com.thoughtworks.foodbazar.fruit.Banana;
import com.thoughtworks.foodbazar.fruit.Kiwi;
import com.thoughtworks.foodbazar.fruit.Orange;
import com.thoughtworks.foodbazar.item.Item;
import com.thoughtworks.foodbazar.item.LineItem;
import com.thoughtworks.foodbazar.util.PrintUtil;

public class FoodBazar {
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Item apple=new Apple("Apple","KG",100);
        Item orange=new Orange("Orange","KG",80);
        Item banana=new Banana("Banana","KG",30);
        Item kiwi=new Kiwi("Kiwi","KG",120);
        
        LineItem appleLineItem=new LineItem(apple,2);
        LineItem orangeLineItem=new LineItem(orange,1.5f);
        LineItem bananaLineItem=new LineItem(banana,0.5f);
        LineItem kiwiLineItem=new LineItem(kiwi,0.75f);
        
        List<LineItem> lineItemList=new ArrayList();
        lineItemList.add(appleLineItem);
        lineItemList.add(orangeLineItem);
        lineItemList.add(bananaLineItem);
        lineItemList.add(kiwiLineItem);     
        
        CustomerOrder customerOrder1=new CustomerOrder(1,lineItemList);
        List<CustomerOrder> customerOrderList=new ArrayList();
        customerOrderList.add(customerOrder1);
        
        Customer customer=new Customer(1,"Praveena",customerOrderList);

        PrintUtil.printCustomerOrderReceipt(customerOrder1);

    }


}
