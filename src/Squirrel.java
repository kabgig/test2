public class Squirrel {
    int[] nuts;
    int maxNutsAmount = 0;

    public Squirrel(int[] nuts) {
        this.nuts = nuts;
    }

    public int maxNuts() {
        if (nuts.length > 0) {
            for (int i = 0; i < nuts.length; i++) {
                if (nuts[i] > 0) maxNutsAmount += nuts[i];
                else if ((i + 1 == nuts.length)) break;
                else if (nuts[i + 1] >= 0) {
                    maxNutsAmount += nuts[i + 1];
                    i++;
                } else if (nuts[i] > nuts[i + 1]) {
                    maxNutsAmount += nuts[i];
                    i++;
                } else {
                    maxNutsAmount += nuts[i + 1];
                    i++;
                }
                if (maxNutsAmount < 0) maxNutsAmount = 0;
            }
        }
        return maxNutsAmount;
    }
//
//    public int getNuts(int index) {
//        return nuts[index];
//    }
}



