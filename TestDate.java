public class TestDate {
    public static void main(String[] args) {
        // Create a Date object
        Date date = new Date(29, 1, 2025);
        
        // Print the date using toString() method
        System.out.println(date.toString());
        
        // Test setDay, setMonth, and setYear
        date.setDay(15);
        date.setMonth(8);
        date.setYear(2025);
        System.out.println("Updated Date: " + date);
        
        // Test individual getters
        System.out.println("Day: " + date.getDay());
        System.out.println("Month: " + date.getMonth());
        System.out.println("Year: " + date.getYear());
        
        // Test setDate method
        date.setDate(31, 12, 2030);
        System.out.println("Final Date: " + date);
    }
}