package interstests;

import methods.FindIntersection;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFindIntersection {

    FindIntersection fi = new FindIntersection();

    @Test(description = "test 01",
            enabled = true,
            groups = {"all", "regression", "bat", "methods.FindIntersection"},
            dependsOnGroups = {},
            dependsOnMethods = {},
            priority = 2)
    public void test01() {
        String[] strArr =   new String[] {"1, 3, 9, 10, 17, 18", "1, 4, 9, 10"};
        String expected = "1,9,10";
        Assert.assertTrue(fi.findIntersection(strArr).equals(expected), "Mismatch in common elements");
    }

    @Test(description = "test 02",
            enabled = true,
            groups = {"all", "regression", "bat", "methods.FindIntersection"},
            dependsOnGroups = {},
            dependsOnMethods = {},
            priority = 2)
    public void test02() {
        String[] strArr =   new String[] {"1, 2, 3", "1, 2, 3"};
        String expected = "1,2,3";
        Assert.assertEquals(fi.findIntersection(strArr), expected, "Mismatch in common elements");
    }

    @Test(description = "test 03",
            enabled = true,
            groups = {"all", "regression", "bat", "methods.FindIntersection"},
            dependsOnGroups = {},
            dependsOnMethods = {},
            priority = 2)
    public void test03() {
        String[] strArr =   new String[] {"1, 3, 9, 10, 17, 18", "2, 4, 8, 11"};
        String expected = "";
        Assert.assertEquals(fi.findIntersection(strArr), expected, "Mismatch in common elements");
    }

    @Test(description = "test 04",
            enabled = true,
            groups = {"all", "regression", "bat", "methods.FindIntersection"},
            dependsOnGroups = {},
            dependsOnMethods = {},
            priority = 2)
    public void test04() {
        String[] strArr =   new String[] {"1, 2, 3, 4, 5, 6", "6, 7, 8, 9"};
        String expected = "6";
        Assert.assertEquals(fi.findIntersection(strArr), expected, "Mismatch in common elements");
    }

    @Test(description = "test 05",
            enabled = true,
            groups = {"all", "regression", "bat", "methods.FindIntersection"},
            dependsOnGroups = {},
            dependsOnMethods = {},
            priority = 2)
    public void test05() {
        String[] strArr =   new String[] {"10, 100, 1000, 10000, 100000, 1000000", "1000000, 1000001"};
        String expected = "1000000";
        Assert.assertTrue(fi.findIntersection(strArr).equals(expected), "Mismatch in common elements");
    }

    @Test(description = "test 06",
            enabled = true,
            groups = {"all", "regression", "bat", "methods.FindIntersection"},
            dependsOnGroups = {},
            dependsOnMethods = {},
            priority = 2)
    public void test06() {
        String[] strArr =   new String[] {"10", "1, 2, 3, 10"};
        String expected = "10";
        Assert.assertTrue(fi.findIntersection(strArr).equals(expected), "Mismatch in common elements");
    }

    @Test(description = "test 07",
            enabled = true,
            groups = {"all", "regression", "bat", "methods.FindIntersection"},
            dependsOnGroups = {},
            dependsOnMethods = {},
            priority = 2)
    public void test07() {
        String[] strArr =   new String[] {"10, 20, 30, 40, 50, 60", "10, 11, 12, 13, 20, 30, 40, 50, 60"};
        String expected = "10,20,30,40,50,60";
        Assert.assertTrue(fi.findIntersection(strArr).equals(expected), "Mismatch in common elements");
    }
}

