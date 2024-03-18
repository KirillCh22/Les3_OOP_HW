import java.util.LinkedList;
import java.util.Iterator;
public class MyLinkedList implements Iterable<String> {
    private LinkedList<String> linkedList = new LinkedList<>();


    // МЕТОД ДОБАВЛЕНИЯ ЭЛЕМЕНТА В LINKEDLIST
    public void AddElement(int position, String element) {
        this.linkedList.add(position, element);
    }


    // МЕТОД УДАЛЕНИЯ ЭЛЕМЕНТА ИЗ LINKEDLIST
    public void RemoveElement(String element) {
        this.linkedList.remove(element);
    }

    // МЕТОД ВОЗВРАЩЕННИЯ ВСЕГО МАССИВА
    public LinkedList<String> getLinkedList() {
        return linkedList;
    }

    // МЕТОД ВОЗВРАЩЕНИЯ ЭЛЕМЕНТА ИЗ МАССИВА
    public String GetElement(int index) {
        return linkedList.get(index);
    }


    // МЕТОД ВОЗВРАЩАЕТ 1-ЫЙ ЭЛЕМЕНТ LINKEDLIST
    public String GetFirst() {
        return linkedList.getFirst();
    }

    // ПЕРЕООПРЕДЕЛЕНИЕ МЕТОДА ITERATOR ДЛЯ ИСПОЛЬЗОВАНИЯ for-each
    @Override
    public Iterator<String> iterator() {
        return new MyLinkedListTest();
    }

    // КЛАСС ДЛЯ ПРОВЕРКИ MYLINKEDLIST
    private class MyLinkedListTest implements Iterator<String> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < linkedList.size();
        }

        @Override
        public String next() {
            return linkedList.get(currentIndex++);
        }
    }


    @Override
    public String toString() {
        return GetFirst();
    }
}





