package occ.cs272.comparator;

/**
 * A country with a name and area.
 */
public class Country
{
    /**
     * Constructs a country.
     * 
     * @param aName the name of the country
     * @param anArea the area of the country
     */
    public Country(String aName, double anArea)
    {
        name = aName;
        area = anArea;
    }

    /**
     * Gets the name of the country.
     * 
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Gets the area of the country.
     * 
     * @return the area
     */
    public double getArea()
    {
        return area;
    }

    private String name;
    private double area;
}
