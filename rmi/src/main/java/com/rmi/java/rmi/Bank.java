package com.rmi.java.rmi;
import java.rmi.*;
import java.util.*;
interface Bank extends Remote{
public List<Customer> getCustomers()throws RemoteException;
}