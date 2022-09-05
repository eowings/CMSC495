package com.project.CMSC495;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.*;


/**
 * @author      Edward Owings <eddyo2@yahoo.com>
 * @version     4.3                 (current version number of program)
 * @since       1.0          (the version of the package this class was first added to)
 */


/**
 * Cost setter and getter, determines variables for cost object and also the format of the string returned.
 */


@Entity
@Table(name = "package_cost")

public class Cost {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="package_id")
	private int package_id;
	private String package_name;
	private BigDecimal package_price;
	
	public int package_monthly_cost() {
		return package_id;
	}
	public String getPackage_Name() {
		return package_name;
	}
	public BigDecimal getPackagePrice() {
		return package_price;
	}
	
	public void setPackage_id(int package_id) {
		this.package_id = package_id;
	}
	public void setPackage_name(String package_name) {
		this.package_name = package_name;
	}
	public void setPackagePrice(BigDecimal package_price) {
		this.package_price = package_price;
	}
	
    // override toString()
    @Override
    public String toString() {
    	List<String> packageList = Arrays.asList(String.valueOf(package_price)); 
    	String packageListString = String.join(", ", packageList );
        return packageListString;
    }

}
