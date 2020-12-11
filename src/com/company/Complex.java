package com.company;

public class Complex {
    int real;
    int image;
Complex(int real,int image)
{
    this.real=real;
    this.image=image;
}
Complex()
{
real=0;
image=0;
}
public String toString()
{
    return "Real part is "+real+" Image part is "+image;
}


}
