package assignment8.prob3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Marketing {
    private String employeename;
    private String productname;
    double saleamoount;

    public Marketing(String employeename, String productname, double saleamoount) {
        this.employeename = employeename;
        this.productname = productname;
        this.saleamoount = saleamoount;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public double getSaleamoount() {
        return saleamoount;
    }

    public void setSaleamoount(double saleamoount) {
        this.saleamoount = saleamoount;
    }

    @Override
    public String toString() {
        return "\n<Name: "+employeename+", Product: "+productname+", Sale Amount: "+saleamoount+">";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Marketing marketing = (Marketing) obj;
        return Objects.equals(employeename, ((Marketing) obj).employeename) && Objects.equals(productname, ((Marketing) obj).productname) && saleamoount == ((Marketing) obj).saleamoount;
    }


}
