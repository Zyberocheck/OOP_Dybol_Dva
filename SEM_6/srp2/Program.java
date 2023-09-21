package SEM_1.SEM_6.srp2;

public class Program {

    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        Order order = new Order("", "", 0, 0);
        order.inputFromConsole();

        JSSave jSaver = new JSSave(order);
        jSaver.save();

        XMLSave xSaver = new XMLSave(order);
        xSaver.save();
        
        
    }
    
}
