import java.util.LinkedList;
import java.util.List;

public class ListClientExample {
    private List list;
    
    //리스트를 캡슐화하는 클래스     
    
    public ListClientExample(){
        list = new LinkedList<>();
    }
    
    private List getList(){
        return list;
    }
    
    public static void main(String[] args) {
        ListClientExample lce = new ListClientExample();
        List list = lce.getList();
        System.out.println(list);
    }    
}
