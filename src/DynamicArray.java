public class DynamicArray<T> {
    private T[] table;
    private int nElems;

    public DynamicArray(int size) {
        table = (T[]) new Object[size];
        nElems = 0;
    }

    public void insert(T value) {
        if (nElems == table.length) {
            resize();
        }
        table[nElems] = value;
        nElems++;
    }

    private void resize() {
        @SuppressWarnings("unchecked")
        T[] temp = (T[]) new Object[table.length * 2];
        System.arraycopy(table, 0, temp, 0, table.length);
        table = temp;
    }

    public boolean remove(T value) {
        if (nElems == 0) {
            return false;
        }

        int index = -1;
        for (int i = 0; i < nElems; i++) {
            if (table[i].equals(value)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            return false;
        }

        for (int j = index; j < nElems - 1; j++) {
            table[j] = table[j + 1];
        }

        table[nElems - 1] = null;
        nElems--;
        return true;
    }

    public boolean find(T value) {
        for (int j = 0; j < nElems; j++) {
            if (table[j].equals(value)) {
                return true;
            }
        }
        return false;
    }

    public T get(int index) {
        if (index < 0 || index >= nElems) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        return table[index];
    }

    public int size() {
        return nElems;
    }
}
