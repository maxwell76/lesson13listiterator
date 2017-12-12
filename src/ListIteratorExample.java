import java.util.ArrayList;
import java.util.ListIterator;
public class ListIteratorExample {

    static ArrayList<String> al = new ArrayList();
    static ListIterator li;
    static int pos=0;
    
    public static void main(String[] args) {
        al.add("a");
        al.add("b");
        al.add("c");
        li = al.listIterator();
        showList();
        //move 1
        System.out.println("1 - Move over item "+li.next());
        pos++;
        showList();
        //move 2
        System.out.println("2 - Move over item "+li.next());
        pos++;
        showList();
        //move 3
        System.out.println("3 - Removing last item travelled over: b"+li.next());
        li.remove();
        pos--;
        showList();
        //move 4
        System.out.println("4 - Adding b back to left of it");
        li.add("b");
        pos++;
        showList();
        //move 5
        System.out.println("5 - move over item "+li.next());
        pos++;
        showList();
        //move 6
        System.out.println("6 - move back over item "+li.previous());
        pos--;
        showList();
        //move 7
        System.out.println("7 - Deleting last item traveled over ");
        li.remove();
        showList();
        //move 8
        System.out.println("8 - move back over item "+li.previous());
        pos--;
        showList();
        //move 9
        System.out.println("set the last item traveled over to e ");
        li.set("e");
        showList();
        //move 10 and 11
        System.out.println("adding c and b bakc into the left of iterator");
        li.add("c)");
        pos++;
        li.add("b");
        pos++;
        showList();
        //move 12
        System.out.println("12 - Trying to remove but will cause erroe");
        System.out.println("Must do a pervious or next first");
        try{
        li.remove();
        }catch (Exception e){
            //this will run when an erroe is thrown and cought down here
            System.out.println("The following error occured");
            System.out.println(e);
        }
        //code lives on down here
        showList();
        
        //move 13
        System.out.println("Moving next past "+li.next());
        pos++;
        showList();
        
        //move 14
        System.out.println("Trying to move past the end of the list");
        try{
            li.next();             
        }catch(Exception e){
            System.out.println(e.toString());
        }
        showList();
        //move 15 BONUS MOVE
        System.out.println("Travelling to the frount of the list");
        while(li.hasPrevious()){
            System.out.println(li.previous());
            pos--;
        }
        showList();
        
        //move 16 BONUS
        System.out.println("Removing last this it saw");
        li.remove();
        showList();
        
        
    }
    
    public static void showList(){
        for (int i = 0; i < al.size(); i++) {
            if(i==pos)
                System.out.println("*");
            System.out.println(al.get(i));
            
        }
        if(pos==al.size()) System.out.println("*");
        System.out.println("");
    }
}
