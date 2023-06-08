package assignment6;

public class MyTable {
    private Entry[] entries;

    MyTable() {
        entries = new Entry[26];
    }

    public String get(char c) {
        for (Entry e : entries) {
            if (e != null && e.ch == c)
                return e.str;
        }
        return null;
    }

    public void add(char c, String s) {
        //'a' => 97
        //'b' => 98
        //'z' => 122
        int charInt = (int) c;
        entries[charInt - 97] = new Entry(c, s);
    }

    public String toString() {
        String str = "";
        for (Entry entry : entries) {
            if (entry != null) {
                str += entry + "\n";
            }
        }
        return str;
    }

    private class Entry {
        private char ch;
        private String str;

        Entry(char ch, String str) {
            this.ch = ch;
            this.str = str;
        }

        @Override
        public String toString() {
            return ch + "->" + str;
        }
    }
}
