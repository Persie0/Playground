package p000;

import com.google.android.gms.internal.measurement.zzacr;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class z2d implements Comparable {

    /* JADX INFO: renamed from: a */
    public final long f70810a;

    /* JADX INFO: renamed from: b */
    public final String f70811b;

    /* JADX INFO: renamed from: c */
    public final int f70812c;

    /* JADX INFO: renamed from: d */
    public final long f70813d;

    /* JADX INFO: renamed from: e */
    public final Object f70814e;

    /* JADX INFO: renamed from: f */
    public final RuntimeException f70815f;

    public z2d(int i, long j, long j2, Object obj, String str) {
        bna.m3969q(((j > 0L ? 1 : (j == 0L ? 0 : -1)) == 0) == (str != null));
        this.f70810a = j;
        this.f70811b = str;
        this.f70812c = i;
        this.f70813d = j2;
        this.f70814e = obj;
        if (i != 5) {
            this.f70815f = null;
            return;
        }
        if (obj == null) {
            this.f70815f = new NullPointerException("Null stringOrBytes");
        } else if ((obj instanceof byte[]) || (obj instanceof zzacr)) {
            this.f70815f = null;
        } else {
            this.f70815f = new RuntimeException("Wrong stringOrBytes type: ".concat(String.valueOf(obj.getClass())));
        }
    }

    /* JADX INFO: renamed from: a */
    public final Object m25422a() {
        int i = this.f70812c;
        if (i == 0) {
            return Boolean.FALSE;
        }
        if (i == 1) {
            return Boolean.TRUE;
        }
        long j = this.f70813d;
        if (i == 2) {
            return Long.valueOf(j);
        }
        if (i == 3) {
            return Double.valueOf(Double.longBitsToDouble(j));
        }
        Object obj = this.f70814e;
        if (i == 4) {
            obj.getClass();
            return obj;
        }
        if (i != 5) {
            throw new AssertionError("Impossible, this was validated when parsed or created");
        }
        obj.getClass();
        try {
            return obj instanceof byte[] ? (byte[]) obj : ((zzacr) obj).m5434n();
        } catch (Throwable th) {
            RuntimeException runtimeException = this.f70815f;
            if (runtimeException != null) {
                th.addSuppressed(runtimeException);
            }
            throw th;
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        z2d z2dVar = (z2d) obj;
        long j = z2dVar.f70810a;
        long j2 = this.f70810a;
        int iCompare = Long.compare(j2, j);
        if (iCompare != 0) {
            return iCompare;
        }
        if (j2 != 0) {
            return 0;
        }
        String str = this.f70811b;
        str.getClass();
        String str2 = z2dVar.f70811b;
        str2.getClass();
        return str.compareTo(str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2d)) {
            return false;
        }
        z2d z2dVar = (z2d) obj;
        return this.f70810a == z2dVar.f70810a && Objects.equals(this.f70811b, z2dVar.f70811b);
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f70810a), this.f70811b);
    }

    public final String toString() {
        String string = this.f70811b;
        if (string == null) {
            string = Long.toString(this.f70810a);
        }
        String strValueOf = String.valueOf(m25422a());
        return AbstractC3393o1.m17739n(new StringBuilder(String.valueOf(string).length() + 1 + strValueOf.length()), string, ":", strValueOf);
    }
}
