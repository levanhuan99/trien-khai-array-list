public interface MyList_Interface<E> {
    void add(int index, E element);     //thêm phàn tử vào vị trí index nào đó;
    void remove(int index);                //xóa 1 phần tử ở vị trí nào đó tra phan tu o vi tri do
    int size();                         //trả về độ dài mảng
    boolean contain(E o);               //xem có chứa phần tử x k?
    int indexOf(E o);                   //trả về vị trí của phần tử
    void ensureCap();    //tăng độ dài mảng
    void clear();                       //xóa mảng
}
