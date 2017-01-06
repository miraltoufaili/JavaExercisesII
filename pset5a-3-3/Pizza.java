class Pizza
{

private String name;
public double diameter;
public double price;
public int slices;

public Pizza (String name, double diameter, double price, int slices)
{
    this.name = name;
    this.diameter = diameter;
    this.price = price;
    this.slices = slices;
    
}


public String getName()
{
    return name;
}

public double areaPerSlice()
{
    return Math.PI * Math.pow(diameter/2, 2)/slices;
   
}

public double costPerSlice()
{
    return price / slices;
    
}

public double costPerSquareInch()
{
    return costPerSlice()/areaPerSlice();
}
}