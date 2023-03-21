package queue;

public class MyQueue {
    private Node front; // đây là node đầu Queue
    private Node rear;  //Node cuối cảu Queue

    public MyQueue(){
        //Khởi tạo queue rỗng
        this.front=null;
        this.rear=null;
    }
    //Phương thức enqueue thêm vào phần tử cuối của mảng
    public void enqueue(int data){
        Node newNode= new Node(data);
        if (this.rear == null) {
            //Nếu hàng đợi null
            this.front= newNode;
            this.rear= newNode;
            return;
        }
        this.rear.link= newNode;
        this.rear= newNode;
    }
    //Lấy và xóa phần tử node đầu
    public int dequeue() {
        if (this.front == null){
            throw new IllegalStateException("Hàng đợi null");
        }
        //Lấy giá trị của node front
        int data= this.front.getData();
        if (this.front == null) {
            this.rear= null;
        }
        this.front= this.front.link;
        return data;
    }
    public void displayData(){

    }
}