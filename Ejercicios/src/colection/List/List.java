package colection.List;

public class List <E>{

    private int sizeList;
    private E[] itemsList;

    public List(int s){
        sizeList = s > 0 ? s : 10;
        itemsList = (E[]) new Object[sizeList];
    }

    public void add(){

    }

}
