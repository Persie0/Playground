package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class x56 {

    /* JADX INFO: renamed from: a */
    public long[] f67780a;

    /* JADX INFO: renamed from: b */
    public int f67781b;

    public x56(int i) {
        this.f67780a = i == 0 ? sk5.f60953a : new long[i];
    }

    /* JADX INFO: renamed from: a */
    public final void m24287a(long j) {
        int i = this.f67781b + 1;
        long[] jArr = this.f67780a;
        if (jArr.length < i) {
            this.f67780a = Arrays.copyOf(jArr, Math.max(i, (jArr.length * 3) / 2));
        }
        long[] jArr2 = this.f67780a;
        int i2 = this.f67781b;
        jArr2[i2] = j;
        this.f67781b = i2 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x56) {
            x56 x56Var = (x56) obj;
            int i = x56Var.f67781b;
            int i2 = this.f67781b;
            if (i == i2) {
                long[] jArr = this.f67780a;
                long[] jArr2 = x56Var.f67780a;
                i84 i84VarM15922M = l70.m15922M(0, i2);
                int i3 = i84VarM15922M.f40379a;
                int i4 = i84VarM15922M.f40380b;
                if (i3 > i4) {
                    return true;
                }
                while (jArr[i3] == jArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        long[] jArr = this.f67780a;
        int i = this.f67781b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += Long.hashCode(jArr[i2]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        long[] jArr = this.f67780a;
        int i = this.f67781b;
        for (int i2 = 0; i2 < i; i2++) {
            long j = jArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                return sb.toString();
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(j);
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public /* synthetic */ x56() {
        this(16);
    }
}
