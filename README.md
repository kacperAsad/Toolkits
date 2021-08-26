## Toolkits
Library to easiest write code. 


### Elements:
1. **Fast Save and Read Map objects in Files - Ready to use**
   
   Maps can save only String Values, including int, float, double, long etc.
   Files is saved with human readable format, so don't save a sensitive data 
   with this method. 
   

2. **Argument Parser - Ready to use**

   ArgsParser class accepts a 2 format types: list and map format.
   
   List format generate a `List<String>` object with a String values. Args format in this type must be a: 

   "Argument1;Argument2;Argument3" or "Argument1;" - "Argument2;" - "Argument3"

   Map format generate a `Map<String, String>` object with a String key and String value. Args format must be a:

   "Key1=Value1;Key2=Value2;Key3=Value3" or "Key1=Value1;" - "Key2=Value2"
   

3. **Console Color - Ready to use**
   This class allows you to color the output in the terminal
   
   Usage: 

   `
   System.out.println(ConsoleColor.GREEN + "This text is green" + ConsoleColor.RESET);
   `
   
   ConsoleColor.RESET can be used also as function: 

   `ConsoleColor.RESET_COLOR()`
   