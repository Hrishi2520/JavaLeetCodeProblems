publi class CountSegments {
    public static int countSegments(String s) {
        s = s.trim();
        return (s.length() > 0) ? s.split("\\s+").length : 0;
    }
}