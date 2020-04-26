

public class MyList<E> implements MyList_Interface<E> {

    int size=10;
    static final int DEFAULT_CAPACITY=10;
    Object[] myArray;

    public MyList(){
        myArray=new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity){
        myArray=new Object[capacity];
    }

    @Override
    public void ensureCap() {
        Object[] newArray=new Object[myArray.length*2];
        for (int i=0;i<myArray.length;i++){
            newArray[i]=myArray[i];
        }
        myArray=newArray;
    }

    @Override
    public void add(int index, E element) {
        if (index <0 || index>=size){
            throw new RuntimeException("Index không hợp lệ.");
        }
        if (size>=myArray.length){
            ensureCap();
        }
        for (int i=index;i<size;i++){
            myArray[i+1]=myArray[i];
        }
        myArray[index]=element;
        size++;
    }

    @Override
    public void remove(int index) {
        if (index <0 || index>=size){
            throw new IndexOutOfBoundsException("out of index");
        }
        for (int i=index;i<size;i++){
            myArray[i]=myArray[i+1];
        }
        myArray[myArray.length-1]=null;
        size--;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contain(E o) {
        boolean flag=false;
        for (int i=0;i<size;i++){
            if (myArray[i]==o){
                flag= true;
            }
        }
        return flag;
    }

    @Override
    public int indexOf(E o) {
        int index=0;
        for (int i=0;i<size;i++){
            if (myArray[i]==o){
                index=i;
                break;
            }
        }
        return index;
    }


    @Override
    public void clear() {
        Object[] newArr=new Object[DEFAULT_CAPACITY];
        myArray=newArr;

    }
    public E get(int index){
        for (int i=0;i<size;i++){
            if (i==index){
                return (E) myArray[i];
            }
        }
        return  null;
    }

}
