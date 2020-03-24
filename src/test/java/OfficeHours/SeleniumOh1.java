package OfficeHours;
import java.util.*;
public class SeleniumOh1 {
    /*
    -Iterator
    -List,Set ,Map and other tues of collections can use Iterateor class to Iterate over theat collection
    -List has indexes(for i, for each, while Iterator)
    -Map( for each,Iterator- to loop through keys)
    -Basic Selenium Navigations-

     */
    public static void main(String[] args) {
        //Create arraylist of Strings-iterate over it
        ArrayList<String> keysToSearch = new ArrayList<>();
        keysToSearch.add("fruits");
        keysToSearch.add("veggies");
        keysToSearch.add("berries");
        Iterator<String> iterator = keysToSearch.iterator();
        //iterator()-return Iterator type which we can use with all iterator methods
        //[fruits,veggies,berries]
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        //print before modification and
        //add * to each string and print again

        Iterator<String> iterator1 = keysToSearch.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator.next());
            System.out.println();
        }
        //create a map with <String, String>
        HashMap<String, String> personalInfo = new HashMap<>();
        personalInfo.put("name", "Bryan");
        personalInfo.put("student_id", "234160");
        personalInfo.put("major", "computer sience");

        Iterator<String> mapIterator = personalInfo.keySet().iterator();
        while (mapIterator.hasNext()) {
            String key = mapIterator.next();
            System.out.println(mapIterator.next() + ":" + personalInfo.get(key));

        }

    //=================
         //SELENIUM
        /*

        id -unique(it is not always available)
        class- clasname
        name
        tag- every element will have a tag

        will only work with the link
        linktext
        partial linketext

        locator taht is using html (syntax)
        css
        xpath
         */
    }
}