package sl;

import dm.C5206f;
import dm.C5207g;

/* JADX INFO: renamed from: sl.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C9071d implements Comparable<C9071d> {

    /* JADX INFO: renamed from: a */
    public final long f47359a;

    public /* synthetic */ C9071d(long j10) {
        this.f47359a = j10;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C9071d c9071d) {
        long j10 = c9071d.f47359a;
        long j11 = this.f47359a ^ Long.MIN_VALUE;
        long j12 = j10 ^ Long.MIN_VALUE;
        if (j11 < j12) {
            return -1;
        }
        return j11 == j12 ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C9071d) {
            return this.f47359a == ((C9071d) obj).f47359a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f47359a);
    }

    public final String toString() {
        long j10 = this.f47359a;
        if (j10 >= 0) {
            C5206f.m11029x0(10);
            String string = Long.toString(j10, 10);
            C5207g.m11110e(string, "toString(this, checkRadix(radix))");
            return string;
        }
        long j11 = 10;
        long j12 = ((j10 >>> 1) / j11) << 1;
        long j13 = j10 - (j12 * j11);
        if (j13 >= j11) {
            j13 -= j11;
            j12++;
        }
        C5206f.m11029x0(10);
        String string2 = Long.toString(j12, 10);
        C5207g.m11110e(string2, "toString(this, checkRadix(radix))");
        C5206f.m11029x0(10);
        String string3 = Long.toString(j13, 10);
        C5207g.m11110e(string3, "toString(this, checkRadix(radix))");
        return string2.concat(string3);
    }
}
