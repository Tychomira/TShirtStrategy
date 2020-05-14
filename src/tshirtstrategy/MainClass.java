/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tshirtstrategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import tshirtstrategy.models.Color;
import tshirtstrategy.models.Fabric;
import tshirtstrategy.models.Size;
import tshirtstrategy.models.TShirt;
import tshirtstrategy.strategy.BankPaymentImpl;
import tshirtstrategy.strategy.CardPaymentImpl;
import tshirtstrategy.strategy.CashPaymentImpl;
import tshirtstrategy.strategy.IPayment;

/**
 *
 * @author ticho
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//          TShirt tShirt = new TShirt("AAA", Color.ORANGE, Size.XL, Fabric.LINEN, 11);
//        Context cardPaymentContext =new Context(new CardPaymentImpl());
//        float price1=cardPaymentContext.executePayment(0, Color.ORANGE, Size.XL, Fabric.LINEN);
//        System.out.println("Price by Card Payment : " +price1 );
//        
//        Context bankPaymentContext=new Context(new BankPaymentImpl());
//        float price2=bankPaymentContext.executePayment(0, Color.ORANGE, Size.XL, Fabric.LINEN);
//        System.out.println("Price by Card Payment : " +price2 );
//        
//        
//        Context cashPaymentContext=new Context(new CashPaymentImpl());
//        float price3=bankPaymentContext.executePayment(0, Color.ORANGE, Size.XL, Fabric.LINEN);
//        System.out.println("Price by Card Payment : " +price3 );
//        
//        
        // System.out.println("//______________//");
//        IPayment p[] = new IPayment[]{new CardPaymentImpl(), new BankPaymentImpl(), new CashPaymentImpl()};
//        List<IPayment> payments = Arrays.asList(new IPayment[]{new CardPaymentImpl(), new BankPaymentImpl(), new CashPaymentImpl()});
//        HashMap<String, Float> allPayments = new HashMap<>();
//        Context contextAll = new Context(payments);
//        allPayments = contextAll.executePayments(tShirt.getPrice(),
//                tShirt.getColor(), tShirt.getSize(), tShirt.getFabric());
//        
//
//        HashMap<String, Float> allPayments2 = generateTshirtAndStrategies();
//        allPayments2.entrySet().forEach(
//                entry
//                -> {
//            System.out.println(entry.getKey() + " Price: " + entry.getValue());
//        });
// mia class ena constructror (isws ena noumero) kai stn main Class class new Class kai me mia seira trexei auto.
//   generateTShirtsAndStrategies(15).forEach(
//                action
//                -> {
//           action.entrySet().forEach(
//                   entry -> {
//                       System.out.println(entry.getKey() + " Price: " + entry.getValue());
//
//                    });
//            System.out.println("//______________//");
//
//       });
//       
          List<TShirt> tShirts =think2();
          think(tShirts);
        
          
        /* 
        From HashMap <String, Float> that is filled from executePayments...
        we ask for a Set which contains a 
        Map<String, Float>
        On this Map we call forEach in order to iterate eithin the Map
        Map.forEach returns an entry within the Map
        
         */
//        allPayments.entrySet().forEach(
//                entry
//                -> {
//            System.out.println(entry.getKey() + " Price: " + entry.getValue());
//        });
//        System.out.println("//----------------//");
//        float price=0;
//        IPayment cardPayment=new CardPaymentImpl();
//        //float price= cardPayment.pay(tShirt.getColor(),tShirt.getSize(), tShirt.getFabric(), tShirt.getPrice());
//        System.out.println("Price by Card Payment : " +price );
//        
//        
//        IPayment bankPayment=new BankPaymentImpl();
//       // price= bankPayment.pay(tShirt.getColor(),tShirt.getSize(), tShirt.getFabric(), tShirt.getPrice());
//        System.out.println("Price by Bank Payment : " +price );
//        
//        IPayment cashPayment=new CashPaymentImpl();
//       // price= cashPayment.pay(tShirt.getColor(),tShirt.getSize(), tShirt.getFabric(), tShirt.getPrice());
//        System.out.println("Price by Cash Payment : " +price );
//        
//              
//                    Color color=null;
//                    Size size=null;
//                    Fabric fabric=null;
//                    
//                    TShirt tShirt=null;
//                    for(int i=0; i<=Color.values().length; i++){ 
//                    tShirt.setColor(Color.values()[i]);
//                    for(int j=0; j<=Size.values().length; j++){ 
//                      tShirt.setSize(Size.values()[j]);
//                    for(int k=0; k<=Fabric.values().length; k++){ 
//                      tShirt.setFabric(Fabric.values()[k]);
//                          System.out.println(tShirt.toString());
//                      }
//                      
//                    }
//                
//                }
    }

    public static List<TShirt> think2() {

        List<TShirt> tShirts = new ArrayList<TShirt>();
       // List<HashMap<String, Float>> TShirtsPayments = new ArrayList<HashMap<String, Float>>();
        for (int i = 0; i < 7; i++) {
            //size
            Color color = Color.values()[i];
            for (int j = 0; j < 7; j++) {
                //Size 
                Size size = Size.values()[j];
                for (int k = 0; k < 7; k++) {
                    Fabric fabric = Fabric.values()[k];
                    TShirt tshirt=new TShirt(getRandomName(), color, size, fabric, 0);
                    tShirts.add(tshirt);
                    
                   // TShirtsPayments = think(tShirts);
                }
            }
            
            

        }
        
        
        
       
//           
//         TShirtsPayments.forEach(
//                    action
//                    -> {
//                       
//                action.entrySet().forEach(entry -> {
//                     
//                    System.out.println(entry.getKey() + " Price: " + entry.getValue());
//                  
//
//                });
//                
//                System.out.println("//______________//");
//            });
//        
        return tShirts;

    }

    public static List<HashMap<String, Float>> think(List<TShirt> tShirts) {

        List<IPayment> payments = Arrays.asList(new IPayment[]{new CardPaymentImpl(), new BankPaymentImpl(), new CashPaymentImpl()});
        HashMap<String, Float> allPayments = new HashMap<>();
        List<HashMap<String, Float>> TShirtsPayments = new ArrayList<HashMap<String, Float>>();
        for (int i = 0; i < tShirts.size(); i++) {

            tShirts.get(i);

            Context contextAll = new Context(payments);
            allPayments = contextAll.executePayments(tShirts.get(i).getPrice(),
                    tShirts.get(i).getColor(), tShirts.get(i).getSize(), tShirts.get(i).getFabric());
            TShirtsPayments.add(allPayments);
               // System.out.println(tShirts.get(i).toString());
        
        }
         TShirtsPayments.forEach(
                    action
                    -> {
                       
                action.entrySet().forEach(entry -> {
                     
                    System.out.println(entry.getKey() + " Price: " + entry.getValue());
                  

                });
                      
                System.out.println("//______________//");
            });
        
        return TShirtsPayments;
    }

    public static HashMap<String, Float> generateTshirtAndStrategies() {

        //generate dynamically Tshirts with all the implemented payment strategies
        // Random number 0 - 6 
        Color color = getRandomColor();
        Size size = getRandomSize();
        Fabric fabric = getRandomFabric();
        String name = getRandomName();
        TShirt t1 = new TShirt(name, color, size, fabric, getRandomNumberInRange(0, 20));

        List<IPayment> payments = Arrays.asList(new IPayment[]{new CardPaymentImpl(), new BankPaymentImpl(), new CashPaymentImpl()});
        HashMap<String, Float> allPayments = new HashMap<>();
        Context contextAll = new Context(payments);
        allPayments = contextAll.executePayments(t1.getPrice(),
                t1.getColor(), t1.getSize(), t1.getFabric());

        return (allPayments);
    }

    public static String getRandomName() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        java.util.Random random = new java.util.Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return (generatedString);
    }

    private static Color getRandomColor() {
        Color color1 = Color.values()[getRandomNumberInRange(0, 6)];
//     Color[] colors = Color.values();
//        Color color1=null;
//        for (Color color : colors) {
//
//            if (getRandomNumberInRange(0, 6) == color.ordinal()) {
//                color1 = color;
//            }
//        }

        return color1;
    }

    private static Size getRandomSize() {
        Size size1 = Size.values()[getRandomNumberInRange(0, 6)];

        return size1;
    }

    private static Fabric getRandomFabric() {
        Fabric fabric1 = Fabric.values()[getRandomNumberInRange(0, 6)];

        return fabric1;
    }

    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        java.util.Random r = new java.util.Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public static List<HashMap<String, Float>> generateTShirtsAndStrategies(int noOfTShirts) {
        List<HashMap<String, Float>> aaa = new ArrayList<HashMap<String, Float>>();
        for (int i = 0; i < noOfTShirts; i++) {

            aaa.add(generateTshirtAndStrategies());
        }

        return (aaa);

    }
}
