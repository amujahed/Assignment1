package com.thoughtworks.foodbazar.util;

import com.thoughtworks.foodbazar.customer.Customer;
import com.thoughtworks.foodbazar.customer.CustomerOrder;
import com.thoughtworks.foodbazar.fruit.Fruit;
import com.thoughtworks.foodbazar.item.LineItem;
import java.util.List;

public class PrintUtil {

    public static void printCustomerOrderReceipt( CustomerOrder customerOrder)
    {
        System.out.println("----------------------");
        System.out.println("Customer Order Receipt");
        System.out.println("----------------------");
        List<LineItem> lineItemList=customerOrder.getLineItemList();
        System.out.println("Fruit       Quantity        Amount");
        for(LineItem lineItem:lineItemList)
        {
            System.out.println(((Fruit)lineItem.getItem()).getName()+"      "+lineItem.getQuantity()+"      "+lineItem.getTotalPrice());

        }
        System.out.println("Total Amount is "+customerOrder.getOrderPrice());

    }
}
