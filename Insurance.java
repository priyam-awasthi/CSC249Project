public class Insurance
{
   private String number;
   private String providerName;
   private String fName;
   private String lName;
   private String age;
   private String smoking;
   private String height;
   private String weight;
   
   public Insurance(String number, String name, String fname, String lname, String age, String smoke, String height, String weight)
   {
      this.number = number;
      providerName = name;
      fName = fname;
      lName = lname;
      this.age = age;
      smoking = smoke;
      this.height = height;
      this.weight = weight;   
   }
   
   public String toString()
   {
      return "Policy Number: " + number + "\nName: " + fName + " " + lName + "\nAge: " + age + "\nSmoking: " + smoking + "\nHeight: " + height + "\nWeight: " + weight;
   }
}