
    import java.util.LinkedList; 

    public class java02 {
    
        private static LinkedList<Integer> list = new LinkedList<Integer>();
        public static void main(String[] args) {
            System.out.print("\033[H\033[J");
            enqueue(1);
            enqueue(5);
            enqueue(7);
    
            System.out.print("Размер: ");
            System.out.println(size());
            System.out.print("Пустая: ");
            System.out.println(isEmpty());
            System.out.print("Первый элемент: ");
            System.out.println(first());
    
            System.out.println(dequeue());
            System.out.println(dequeue());
            System.out.println(dequeue());
    
        }
        
        public static void enqueue (int el) {
            list.add(el);
        }
    
        public static int dequeue () {
            return list.removeFirst();
        }
    
        public static int first () {
            return list.getFirst();
        }
    
        public static int size () {
            return list.size();
            
        }
    
        public static boolean isEmpty () {
            return list.isEmpty();
        }
    }
      
