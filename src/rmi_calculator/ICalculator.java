package rmi_calculator;
import java.rmi.*;
public interface ICalculator extends Remote {
    public double add(double x, double y) throws RemoteException;
    public double sub(double x, double y) throws RemoteException;
    public double mul(double x, double y) throws RemoteException;
    public double div(double x, double y) throws RemoteException;
}
