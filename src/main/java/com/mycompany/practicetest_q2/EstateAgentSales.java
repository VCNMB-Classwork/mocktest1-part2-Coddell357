/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.practicetest_q2;

/**
 *
 * @author Coddell Tariro Chikomo
 */
public abstract class EstateAgentSales extends EstateAgent
{

    private String agent_Name;
    private double property_Price;
    private double agent_Commission;
    
    public EstateAgentSales(String agentName, double propertyPrice)
    {
        this.agent_Name = agentName;
        this.property_Price = propertyPrice; 
    }
    
    public String getAgentName() {
        return agent_Name;
    }

    public void setAgen_Name(String agent_Name) {
        this.agent_Name = agent_Name;
    }

    public double getPropertyPrice() {
        return property_Price;
    }

   
    public void setPropertyPrice(double property_Price) {
        this.property_Price = property_Price;
    }

    public double getAgentCommission() {
        return agent_Commission;
    }

    
    public void setAgentCommission(double agent_Commission) {
        this.agent_Commission = agent_Commission;
    }
    
    //@Override
    public void printPropertyReport()
    {  
        double discount = 0;
        discount = getPropertyPrice() * 0.2;
     
        agent_Commission = getPropertyPrice() - discount;
        
        System.out.println();
        System.out.println("ESTAE AGENT REPORT");
        System.out.println("********************************");
        System.out.println("ESTATE AGENT NAME: " + getAgentName());
        System.out.println("PROPERTY PRICE: R" + getPropertyPrice());
        System.out.println("AGENT COMMISSION: " + getAgentCommission());
       
    }
    
    
}

    

