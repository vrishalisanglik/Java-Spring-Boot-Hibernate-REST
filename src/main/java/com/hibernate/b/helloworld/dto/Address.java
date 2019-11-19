// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Address.java

package com.hibernate.b.helloworld.dto;


// Referenced classes of package com.vrishali.hibernate.crud.test.dto:
//            Employee

public class Address
{

    public String toString()
    {
        return (new StringBuilder("Address [empId=")).append(empId).append(", addressLine=").append(addressLine).append(", emp=").append(emp).append("]").toString();
    }

    public Address()
    {
    }

    public Address(int empId, String addressLine, Employee emp)
    {
        this.empId = empId;
        this.addressLine = addressLine;
        this.emp = emp;
    }

    public int getEmpId()
    {
        return empId;
    }

    public void setEmpId(int empId)
    {
        this.empId = empId;
    }

    public String getAddressLine()
    {
        return addressLine;
    }

    public void setAddressLine(String addressLine)
    {
        this.addressLine = addressLine;
    }

    public Employee getEmp()
    {
        return emp;
    }

    public void setEmp(Employee emp)
    {
        this.emp = emp;
    }

    private int empId;
    private String addressLine;
    private Employee emp;
}
