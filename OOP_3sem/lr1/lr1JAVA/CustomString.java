public class CustomString {
    private char[] data;

    public CustomString() {
        this.data = new char[0];
    }

    public CustomString(char[] chars) {
        this.data = chars.clone();
    }

    public CustomString(String str) {
        this.data = str.toCharArray();
    }

    public int Length() {
        return data.length;
    }

    public void Copy(CustomString str) {
        this.data = str.data.clone();
    }

    public int Find(char ch, int start) {
        if (start < 0 || start >= data.length) {
            return -1;
        }
        for (int i = start; i < data.length; i++) {
            if (data[i] == ch) {
                return i;
            }
        }
        return -1;
    }

    public int FindLast(char ch) {
        for (int i = data.length - 1; i >= 0; i--) {
            if (data[i] == ch) {
                return i;
            }
        }
        return -1;
    }

    public CustomString Substr(int index, int count) {
        if (index < 0 || index >= data.length || count <= 0) {
            return new CustomString();
        }

        int actualCount = Math.min(count, data.length - index);
        char[] sub = new char[actualCount];

        for (int i = 0; i < actualCount; i++) {
            sub[i] = data[index + i];
        }

        return new CustomString(sub);
    }

    public void Remove(int index, int count) {
        if (index < 0 || index >= data.length || count <= 0) {
            return;
        }

        int actualCount = Math.min(count, data.length - index);
        char[] newData = new char[data.length - actualCount];

        // Часть до удаления
        for (int i = 0; i < index; i++) {
            newData[i] = data[i];
        }

        // Часть после удаления
        for (int i = index + actualCount; i < data.length; i++) {
            newData[i - actualCount] = data[i];
        }

        this.data = newData;
    }

    public void Insert(char[] s, int index) {
        if (index < 0 || index > data.length || s == null) {
            return;
        }

        char[] newData = new char[data.length + s.length];

        for (int i = 0; i < index; i++) {
            newData[i] = data[i];
        }

        for (int i = 0; i < s.length; i++) {
            newData[index + i] = s[i];
        }

        for (int i = index; i < data.length; i++) {
            newData[i + s.length] = data[i];
        }

        this.data = newData;
    }

    public void Insert(String s, int index) {
        if (s != null) {
            Insert(s.toCharArray(), index);
        }
    }

    public void print() {
        System.out.println(new String(data));
    }

    @Override
    public String toString() {
        return new String(data);
    }
}