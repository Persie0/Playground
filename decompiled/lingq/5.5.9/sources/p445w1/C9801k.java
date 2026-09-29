package p445w1;

import p338qd.C8573r0;
import p470x1.C10023k;
import p470x1.C10024l;

/* JADX INFO: renamed from: w1.k */
/* JADX INFO: loaded from: classes.dex */
public final class C9801k {

    /* JADX INFO: renamed from: c */
    public static final C9801k f49919c = new C9801k(C8573r0.m16765v0(0), C8573r0.m16765v0(0));

    /* JADX INFO: renamed from: a */
    public final long f49920a;

    /* JADX INFO: renamed from: b */
    public final long f49921b;

    public C9801k(long j10, long j11) {
        this.f49920a = j10;
        this.f49921b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9801k)) {
            return false;
        }
        C9801k c9801k = (C9801k) obj;
        return C10023k.m18630a(this.f49920a, c9801k.f49920a) && C10023k.m18630a(this.f49921b, c9801k.f49921b);
    }

    public final int hashCode() {
        C10024l[] c10024lArr = C10023k.f50981b;
        return Long.hashCode(this.f49921b) + (Long.hashCode(this.f49920a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) C10023k.m18633d(this.f49920a)) + ", restLine=" + ((Object) C10023k.m18633d(this.f49921b)) + ')';
    }
}
