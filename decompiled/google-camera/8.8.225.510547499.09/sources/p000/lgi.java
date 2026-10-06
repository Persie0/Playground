package p000;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lgi implements Iterable {

    /* JADX INFO: renamed from: a */
    public final int[] f38211a;

    private lgi(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            this.f38211a = new int[0];
            return;
        }
        Arrays.sort(iArr);
        int i = iArr[0] + 1;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            i3 += i == i4 ? 0 : 1;
            i2++;
            i = i4;
        }
        int[] iArr2 = new int[i3];
        this.f38211a = iArr2;
        int i5 = iArr[0] + 1;
        int i6 = 0;
        for (int i7 : iArr) {
            if (i5 != i7) {
                iArr2[i6] = i7;
                i6++;
                i5 = i7;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static lgi m15312a(int... iArr) {
        return new lgi(Arrays.copyOf(iArr, iArr.length));
    }

    /* JADX INFO: renamed from: b */
    public final boolean m15313b() {
        return Arrays.binarySearch(this.f38211a, 32856) >= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lgi) {
            return Arrays.equals(this.f38211a, ((lgi) obj).f38211a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f38211a);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new lgh(this, 0);
    }

    public final String toString() {
        return "IntSet[" + this.f38211a.length + "]";
    }
}
