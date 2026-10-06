package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class inj implements Comparable {

    /* JADX INFO: renamed from: a */
    private final int[] f31597a;

    public inj(String str) {
        String[] strArrSplit = str.split("\\.");
        int length = strArrSplit.length;
        if (length < 2) {
            throw new IllegalArgumentException("Unrecognized version name is found: ".concat(String.valueOf(str)));
        }
        this.f31597a = new int[length];
        for (int i = 0; i < strArrSplit.length; i++) {
            try {
                this.f31597a[i] = Integer.parseInt(strArrSplit[i]);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Unrecognized version name is found: ".concat(String.valueOf(str)));
            }
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(inj injVar) {
        int length;
        int i = 0;
        while (true) {
            int[] iArr = this.f31597a;
            length = iArr.length;
            if (i >= length) {
                break;
            }
            int[] iArr2 = injVar.f31597a;
            if (i >= iArr2.length) {
                break;
            }
            int i2 = iArr[i];
            int i3 = iArr2[i];
            if (i2 > i3) {
                return 1;
            }
            if (i2 < i3) {
                return -1;
            }
            i++;
        }
        int length2 = injVar.f31597a.length;
        if (length >= length2) {
            while (true) {
                int[] iArr3 = this.f31597a;
                if (length2 >= iArr3.length) {
                    break;
                }
                int i4 = iArr3[length2];
                if (i4 > 0) {
                    return 1;
                }
                if (i4 < 0) {
                    return -1;
                }
                length2++;
            }
        } else {
            while (true) {
                int[] iArr4 = injVar.f31597a;
                if (length >= iArr4.length) {
                    break;
                }
                int i5 = iArr4[length];
                if (i5 > 0) {
                    return 1;
                }
                if (i5 < 0) {
                    return -1;
                }
                length++;
            }
        }
        return 0;
    }
}
