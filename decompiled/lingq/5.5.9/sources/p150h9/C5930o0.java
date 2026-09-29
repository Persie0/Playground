package p150h9;

import p479xa.C10129a;
import p479xa.C10134c0;

/* JADX INFO: renamed from: h9.o0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5930o0 {

    /* JADX INFO: renamed from: c */
    public static final C5930o0 f35349c;

    /* JADX INFO: renamed from: a */
    public final long f35350a;

    /* JADX INFO: renamed from: b */
    public final long f35351b;

    static {
        C5930o0 c5930o0 = new C5930o0(0L, 0L);
        new C5930o0(Long.MAX_VALUE, Long.MAX_VALUE);
        new C5930o0(Long.MAX_VALUE, 0L);
        new C5930o0(0L, Long.MAX_VALUE);
        f35349c = c5930o0;
    }

    public C5930o0(long j10, long j11) {
        boolean z10 = true;
        C10129a.m18990b(j10 >= 0);
        C10129a.m18990b(j11 < 0 ? false : z10);
        this.f35350a = j10;
        this.f35351b = j11;
    }

    /* JADX INFO: renamed from: a */
    public final long m12345a(long j10, long j11, long j12) {
        long j13 = this.f35350a;
        long j14 = this.f35351b;
        if (j13 == 0 && j14 == 0) {
            return j10;
        }
        int i10 = C10134c0.f51354a;
        long j15 = j10 - j13;
        if (((j13 ^ j10) & (j10 ^ j15)) < 0) {
            j15 = Long.MIN_VALUE;
        }
        long j16 = j10 + j14;
        if (((j14 ^ j16) & (j10 ^ j16)) < 0) {
            j16 = Long.MAX_VALUE;
        }
        boolean z10 = j15 <= j11 && j11 <= j16;
        boolean z11 = j15 <= j12 && j12 <= j16;
        if (z10 && z11) {
            return Math.abs(j11 - j10) <= Math.abs(j12 - j10) ? j11 : j12;
        }
        if (z10) {
            return j11;
        }
        return z11 ? j12 : j15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5930o0.class != obj.getClass()) {
            return false;
        }
        C5930o0 c5930o0 = (C5930o0) obj;
        return this.f35350a == c5930o0.f35350a && this.f35351b == c5930o0.f35351b;
    }

    public final int hashCode() {
        return (((int) this.f35350a) * 31) + ((int) this.f35351b);
    }
}
