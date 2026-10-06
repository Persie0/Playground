package p000;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nnb implements Serializable {

    /* JADX INFO: renamed from: b */
    private static final nnb f43927b = new nnb(new int[0]);

    /* JADX INFO: renamed from: a */
    public final int f43928a;

    /* JADX INFO: renamed from: c */
    private final int[] f43929c;

    public nnb(int[] iArr) {
        int length = iArr.length;
        this.f43929c = iArr;
        this.f43928a = length;
    }

    /* JADX INFO: renamed from: a */
    public final int m17515a(int i) {
        lku.m15620O(i, this.f43928a);
        return this.f43929c[i];
    }

    /* JADX INFO: renamed from: b */
    public final boolean m17516b() {
        return this.f43928a == 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nnb)) {
            return false;
        }
        nnb nnbVar = (nnb) obj;
        if (this.f43928a != nnbVar.f43928a) {
            return false;
        }
        for (int i = 0; i < this.f43928a; i++) {
            if (m17515a(i) != nnbVar.m17515a(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f43928a; i2++) {
            i = (i * 31) + this.f43929c[i2];
        }
        return i;
    }

    Object readResolve() {
        return m17516b() ? f43927b : this;
    }

    public final String toString() {
        if (m17516b()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(this.f43928a * 5);
        sb.append('[');
        sb.append(this.f43929c[0]);
        for (int i = 1; i < this.f43928a; i++) {
            sb.append(", ");
            sb.append(this.f43929c[i]);
        }
        sb.append(']');
        return sb.toString();
    }

    Object writeReplace() {
        int i = this.f43928a;
        int[] iArr = this.f43929c;
        return i < iArr.length ? new nnb(Arrays.copyOfRange(iArr, 0, i)) : this;
    }
}
