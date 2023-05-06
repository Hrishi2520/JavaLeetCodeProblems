class CheckRecord3 {
    public boolean checkRecord(String s) {
        
        char[] chars = s.toCharArray();

        int lateCount = 0;
        int absCount = 0;
        for (char c : chars) {
            switch (c) {
                case 'P':
                    lateCount = 0;
                    break;
                case 'L':
                    lateCount++;
                    if (lateCount == 3) {
                        return false;
                    }
                    break;
                case 'A':
                    lateCount = 0;
                    absCount++;
                    if (absCount >= 2) {
                        return false;
                    }
                    break;
            }
        }

        return true;

    }
}