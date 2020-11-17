package rmi_calculator;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Calculator_Server {
    public static void main(String[] args) {
        try {
            Calculator vCalculator = new Calculator();
            LocateRegistry.createRegistry(5000);
            Naming.rebind("rmi://localhost:5000/Calculator", vCalculator);
            System.out.println("Calculator Bound to Port 5000");
        } catch (RemoteException | MalformedURLException ex) {
            Logger.getLogger(Calculator_Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
