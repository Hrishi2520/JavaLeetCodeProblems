class CheckRecord {
    public boolean checkRecord(String s) {
        int size = s.length();
        return (s.replace("A", "").length() <= size-2 || s.indexOf("LLL") != -1) ? false : true;
    }
}