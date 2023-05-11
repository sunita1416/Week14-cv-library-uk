package resources.testdata;

import org.testng.annotations.DataProvider;

/**
 * Created by Jay
 */
public class TestData {
    @DataProvider(name = "data")
    public Object[][] getData() {
        Object[][] data = new Object[][]{
                {
                        "Tester", "Uxbridge", "6 miles", "4000", "50000", "Per annum", "Permanent", "Permanent Tester jobs in Uxbridge"
                },
                {
                        "Restaurant", "Hayes", "10 miles", "20000", "60000", "Per annum", "permanent", "Permanent Head chef jobs in Hayes"
                },
                {
                        "Banking", "Croydon", "10 miles", "4000", "7000", "Per month", "Contract", "Contract Banking jobs in Croydon"
                },
                {
                        "Customer Services", "Harrow", "3 miles", "300", "500", "Per week", "Temporary", "Temporary Customer Services jobs in Harrow"
                },
                {
                        "Healthcare", "West Drayton", " 15 miles", "1000", "1500", "Per month", "Part Time", "Part Time Healthcare jobs in West Drayton"
                },
                {
                        "Education", "Harrow", "1 mile", "25000", "40000", "Per annum", "Permanent", "Permanent Education jobs in Harrow"
                }
        };
        return data;
    }

}
