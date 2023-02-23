/*
Создайте класс Stack, реализующий стек для хранения символов.
Используйте методы push () и рор () для манипулирования содержимым стека.
Пользователь класса Stack должен иметь возможность задавать размер стека при его создании.
Все члены класса Stack, кроме методов push () и рор (), должны быть объявлены как private.
 */

package BookSchildtFirst.main.chapter6;

class Stack{
    private char stck[];
    private int tos;

    Stack(int size){
        stck = new char[size];
        tos = 0;
    }

    Stack(Stack ob){
        tos = ob.tos;
        stck = new char[ob.stck.length];

        for (int i = 0; i < tos; i++){
            stck[i] = ob.stck[i];
        }
    }

    Stack(char a[]){
        stck = new char[a.length];
        for (int i = 0; i < a.length; i++){
            push(a[i]);
        }
    }

    void push(char ch){
        if(tos == stck.length){
            System.out.println("Stack is full");
            return;
        }

        stck[tos] = ch;
        tos++;
    }

    char pop(){
        if(tos == 0){
            System.out.println("Stack is null");
            return (char) 0;
        }

        tos--;
        return stck[tos];
    }
}
public class Task3 {
    public static void main(String[] args) {
        Stack stk1 = new Stack(10);

        char name[] = {'T', 'o', 'm'};

        Stack stk2 = new Stack(name);

        char ch;
        int i;

        for (i = 0; i < 10; i++){
            stk1.push((char) ('A' + i));
        }

        Stack stk3 = new Stack(stk1);

        System.out.print("stk1 = ");
        for (i = 0; i < 10; i++){
            ch = stk1.pop();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("stk2 = ");
        for (i = 0; i < 3; i++){
            ch = stk2.pop();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("stk3 = ");
        for (i = 0; i < 10; i++){
            ch = stk3.pop();
            System.out.print(ch);
        }
    }

}
