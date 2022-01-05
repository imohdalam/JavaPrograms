package generic;

@SuppressWarnings("unchecked")
class Generic<List>{
    List[] data = (List[]) new Object[5];
    int length = 0;
    void write(List s){
        data[length++] = s;
    }
    void display(){
        for(int i=0; i<length; i++){
            System.out.println(data[i]);
        }
    }
}

class Data<Type>{
   private Type Value;
   void setData(Type Value){
       this.Value = Value;
   }
   Type getData(){
       return this.Value;
   }
}
class MyArray<T>{
    T[] A = (T[]) new Object[10];
    int length = 0;
    void append(T Value){
        A[length++] = Value;
    }
    void display(){
        for(int i=0; i<length; i++){
            System.out.println(A[i]);
        }
    }
}
public class GenericClass {

    public static void main(String[] args) {

        Generic<String> GD = new Generic<>();
        GD.write("Be hard on Your Routine");
        GD.write("Finish Java ASAP");
        // GD.write(100); // Integer not allowed, type not matched
        GD.write("Now RUN");
        GD.display();
        
        Data<Integer> DI = new Data<>();
        DI.setData(73);
        System.out.println("Value: "+DI.getData());

        MyArray<String> arr = new MyArray<>();
        arr.append("Can only be written in the same class");
        arr.append("Because Type of same Object");
        arr.append("By using method for each task");
        arr.display();
    }
}
