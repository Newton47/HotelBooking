package resources;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderClass {
  @DataProvider(name="SearchProvider")
  public static Object[][] getDataFromDataprovider(){
      return new Object[][] {
          { "Mi trimmer" },
          { "Philips trimmer"},
          { "Syska trimmers"}
      };  
}}
