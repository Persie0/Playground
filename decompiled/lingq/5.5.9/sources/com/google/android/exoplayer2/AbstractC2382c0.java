package com.google.android.exoplayer2;

import android.net.Uri;
import android.util.Pair;
import com.google.android.exoplayer2.source.ads.C2473a;
import p150h9.C5931p;
import p291o7.C8002l;
import p479xa.C10129a;
import p479xa.C10134c0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.c0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2382c0 implements InterfaceC2409f {

    /* JADX INFO: renamed from: a */
    public static final a f12057a = new a();

    /* JADX INFO: renamed from: com.google.android.exoplayer2.c0$a */
    public class a extends AbstractC2382c0 {
        @Override // com.google.android.exoplayer2.AbstractC2382c0
        /* JADX INFO: renamed from: b */
        public final int mo6774b(Object obj) {
            return -1;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // com.google.android.exoplayer2.AbstractC2382c0
        /* JADX INFO: renamed from: f */
        public final b mo6777f(int i10, b bVar, boolean z10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.AbstractC2382c0
        /* JADX INFO: renamed from: h */
        public final int mo6905h() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.AbstractC2382c0
        /* JADX INFO: renamed from: l */
        public final Object mo6780l(int i10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.AbstractC2382c0
        /* JADX INFO: renamed from: n */
        public final c mo6781n(int i10, c cVar, long j10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.AbstractC2382c0
        /* JADX INFO: renamed from: o */
        public final int mo6909o() {
            return 0;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.c0$b */
    public static final class b implements InterfaceC2409f {

        /* JADX INFO: renamed from: h */
        public static final String f12058h = C10134c0.m19021F(0);

        /* JADX INFO: renamed from: i */
        public static final String f12059i = C10134c0.m19021F(1);

        /* JADX INFO: renamed from: j */
        public static final String f12060j = C10134c0.m19021F(2);

        /* JADX INFO: renamed from: k */
        public static final String f12061k = C10134c0.m19021F(3);

        /* JADX INFO: renamed from: l */
        public static final String f12062l = C10134c0.m19021F(4);

        /* JADX INFO: renamed from: a */
        public Object f12063a;

        /* JADX INFO: renamed from: b */
        public Object f12064b;

        /* JADX INFO: renamed from: c */
        public int f12065c;

        /* JADX INFO: renamed from: d */
        public long f12066d;

        /* JADX INFO: renamed from: e */
        public long f12067e;

        /* JADX INFO: renamed from: f */
        public boolean f12068f;

        /* JADX INFO: renamed from: g */
        public C2473a f12069g = C2473a.f13034g;

        static {
            new C5931p(12);
        }

        /* JADX INFO: renamed from: a */
        public final long m6911a(int i10, int i11) {
            C2473a.a aVarM7248a = this.f12069g.m7248a(i10);
            if (aVarM7248a.f13056b != -1) {
                return aVarM7248a.f13060f[i11];
            }
            return -9223372036854775807L;
        }

        /* JADX INFO: renamed from: b */
        public final int m6912b(long j10) {
            int i10;
            C2473a c2473a = this.f12069g;
            long j11 = this.f12066d;
            c2473a.getClass();
            if (j10 == Long.MIN_VALUE) {
                return -1;
            }
            if (j11 != -9223372036854775807L && j10 >= j11) {
                return -1;
            }
            int i11 = c2473a.f13044e;
            while (true) {
                i10 = c2473a.f13041b;
                if (i11 >= i10) {
                    break;
                }
                if (c2473a.m7248a(i11).f13055a == Long.MIN_VALUE || c2473a.m7248a(i11).f13055a > j10) {
                    C2473a.a aVarM7248a = c2473a.m7248a(i11);
                    int i12 = aVarM7248a.f13056b;
                    if (i12 == -1 || aVarM7248a.m7249a(-1) < i12) {
                        break;
                    }
                }
                i11++;
            }
            if (i11 < i10) {
                return i11;
            }
            return -1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
        
            if (r14 < r8) goto L17;
         */
        /* JADX INFO: renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int m6913c(long j10) {
            boolean z10;
            C2473a c2473a = this.f12069g;
            long j11 = this.f12066d;
            boolean z11 = true;
            int i10 = c2473a.f13041b - 1;
            while (i10 >= 0) {
                if (j10 == Long.MIN_VALUE) {
                    z10 = false;
                } else {
                    long j12 = c2473a.m7248a(i10).f13055a;
                    if (j12 == Long.MIN_VALUE) {
                        if (j11 != -9223372036854775807L) {
                            if (j10 >= j11) {
                                z10 = false;
                            }
                        }
                        z10 = true;
                    }
                }
                if (!z10) {
                    break;
                }
                i10--;
            }
            if (i10 >= 0) {
                C2473a.a aVarM7248a = c2473a.m7248a(i10);
                int i11 = aVarM7248a.f13056b;
                if (i11 != -1) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= i11) {
                            z11 = false;
                            break;
                        }
                        int i13 = aVarM7248a.f13059e[i12];
                        if (i13 == 0 || i13 == 1) {
                            break;
                        }
                        i12++;
                    }
                }
                if (z11) {
                    return i10;
                }
            }
            return -1;
        }

        /* JADX INFO: renamed from: d */
        public final long m6914d(int i10) {
            return this.f12069g.m7248a(i10).f13055a;
        }

        /* JADX INFO: renamed from: e */
        public final int m6915e(int i10, int i11) {
            C2473a.a aVarM7248a = this.f12069g.m7248a(i10);
            if (aVarM7248a.f13056b != -1) {
                return aVarM7248a.f13059e[i11];
            }
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !b.class.equals(obj.getClass())) {
                return false;
            }
            b bVar = (b) obj;
            return C10134c0.m19034a(this.f12063a, bVar.f12063a) && C10134c0.m19034a(this.f12064b, bVar.f12064b) && this.f12065c == bVar.f12065c && this.f12066d == bVar.f12066d && this.f12067e == bVar.f12067e && this.f12068f == bVar.f12068f && C10134c0.m19034a(this.f12069g, bVar.f12069g);
        }

        /* JADX INFO: renamed from: f */
        public final int m6916f(int i10) {
            return this.f12069g.m7248a(i10).m7249a(-1);
        }

        /* JADX INFO: renamed from: g */
        public final boolean m6917g(int i10) {
            return this.f12069g.m7248a(i10).f13062h;
        }

        /* JADX INFO: renamed from: h */
        public final void m6918h(Object obj, Object obj2, int i10, long j10, long j11, C2473a c2473a, boolean z10) {
            this.f12063a = obj;
            this.f12064b = obj2;
            this.f12065c = i10;
            this.f12066d = j10;
            this.f12067e = j11;
            this.f12069g = c2473a;
            this.f12068f = z10;
        }

        public final int hashCode() {
            Object obj = this.f12063a;
            int iHashCode = 0;
            int iHashCode2 = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f12064b;
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            }
            int i10 = (((iHashCode2 + iHashCode) * 31) + this.f12065c) * 31;
            long j10 = this.f12066d;
            int i11 = (i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f12067e;
            return this.f12069g.hashCode() + ((((i11 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f12068f ? 1 : 0)) * 31);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.c0$c */
    public static final class c implements InterfaceC2409f {

        /* JADX INFO: renamed from: M */
        public static final Object f12070M = new Object();

        /* JADX INFO: renamed from: N */
        public static final Object f12071N = new Object();

        /* JADX INFO: renamed from: O */
        public static final C2466p f12072O;

        /* JADX INFO: renamed from: P */
        public static final String f12073P;

        /* JADX INFO: renamed from: Q */
        public static final String f12074Q;

        /* JADX INFO: renamed from: R */
        public static final String f12075R;

        /* JADX INFO: renamed from: S */
        public static final String f12076S;

        /* JADX INFO: renamed from: T */
        public static final String f12077T;

        /* JADX INFO: renamed from: U */
        public static final String f12078U;

        /* JADX INFO: renamed from: V */
        public static final String f12079V;

        /* JADX INFO: renamed from: W */
        public static final String f12080W;

        /* JADX INFO: renamed from: X */
        public static final String f12081X;

        /* JADX INFO: renamed from: Y */
        public static final String f12082Y;

        /* JADX INFO: renamed from: Z */
        public static final String f12083Z;

        /* JADX INFO: renamed from: a0 */
        public static final String f12084a0;

        /* JADX INFO: renamed from: b0 */
        public static final String f12085b0;

        /* JADX INFO: renamed from: H */
        public long f12086H;

        /* JADX INFO: renamed from: I */
        public long f12087I;

        /* JADX INFO: renamed from: J */
        public int f12088J;

        /* JADX INFO: renamed from: K */
        public int f12089K;

        /* JADX INFO: renamed from: L */
        public long f12090L;

        /* JADX INFO: renamed from: b */
        @Deprecated
        public Object f12092b;

        /* JADX INFO: renamed from: d */
        public Object f12094d;

        /* JADX INFO: renamed from: e */
        public long f12095e;

        /* JADX INFO: renamed from: f */
        public long f12096f;

        /* JADX INFO: renamed from: g */
        public long f12097g;

        /* JADX INFO: renamed from: h */
        public boolean f12098h;

        /* JADX INFO: renamed from: i */
        public boolean f12099i;

        /* JADX INFO: renamed from: j */
        @Deprecated
        public boolean f12100j;

        /* JADX INFO: renamed from: k */
        public C2466p.e f12101k;

        /* JADX INFO: renamed from: l */
        public boolean f12102l;

        /* JADX INFO: renamed from: a */
        public Object f12091a = f12070M;

        /* JADX INFO: renamed from: c */
        public C2466p f12093c = f12072O;

        static {
            C2466p.a aVar = new C2466p.a();
            aVar.f12777a = "com.google.android.exoplayer2.Timeline";
            aVar.f12778b = Uri.EMPTY;
            f12072O = aVar.m7213a();
            f12073P = C10134c0.m19021F(1);
            f12074Q = C10134c0.m19021F(2);
            f12075R = C10134c0.m19021F(3);
            f12076S = C10134c0.m19021F(4);
            f12077T = C10134c0.m19021F(5);
            f12078U = C10134c0.m19021F(6);
            f12079V = C10134c0.m19021F(7);
            f12080W = C10134c0.m19021F(8);
            f12081X = C10134c0.m19021F(9);
            f12082Y = C10134c0.m19021F(10);
            f12083Z = C10134c0.m19021F(11);
            f12084a0 = C10134c0.m19021F(12);
            f12085b0 = C10134c0.m19021F(13);
            new C8002l(13);
        }

        /* JADX INFO: renamed from: a */
        public final boolean m6919a() {
            C10129a.m18992d(this.f12100j == (this.f12101k != null));
            return this.f12101k != null;
        }

        /* JADX INFO: renamed from: b */
        public final void m6920b(Object obj, C2466p c2466p, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, C2466p.e eVar, long j13, long j14, int i10, int i11, long j15) {
            C2466p.g gVar;
            this.f12091a = obj;
            this.f12093c = c2466p != null ? c2466p : f12072O;
            this.f12092b = (c2466p == null || (gVar = c2466p.f12772b) == null) ? null : gVar.f12846g;
            this.f12094d = obj2;
            this.f12095e = j10;
            this.f12096f = j11;
            this.f12097g = j12;
            this.f12098h = z10;
            this.f12099i = z11;
            this.f12100j = eVar != null;
            this.f12101k = eVar;
            this.f12086H = j13;
            this.f12087I = j14;
            this.f12088J = i10;
            this.f12089K = i11;
            this.f12090L = j15;
            this.f12102l = false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !c.class.equals(obj.getClass())) {
                return false;
            }
            c cVar = (c) obj;
            return C10134c0.m19034a(this.f12091a, cVar.f12091a) && C10134c0.m19034a(this.f12093c, cVar.f12093c) && C10134c0.m19034a(this.f12094d, cVar.f12094d) && C10134c0.m19034a(this.f12101k, cVar.f12101k) && this.f12095e == cVar.f12095e && this.f12096f == cVar.f12096f && this.f12097g == cVar.f12097g && this.f12098h == cVar.f12098h && this.f12099i == cVar.f12099i && this.f12102l == cVar.f12102l && this.f12086H == cVar.f12086H && this.f12087I == cVar.f12087I && this.f12088J == cVar.f12088J && this.f12089K == cVar.f12089K && this.f12090L == cVar.f12090L;
        }

        public final int hashCode() {
            int iHashCode = (this.f12093c.hashCode() + ((this.f12091a.hashCode() + 217) * 31)) * 31;
            Object obj = this.f12094d;
            int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            C2466p.e eVar = this.f12101k;
            int iHashCode3 = (iHashCode2 + (eVar != null ? eVar.hashCode() : 0)) * 31;
            long j10 = this.f12095e;
            int i10 = (iHashCode3 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f12096f;
            int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f12097g;
            int i12 = (((((((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f12098h ? 1 : 0)) * 31) + (this.f12099i ? 1 : 0)) * 31) + (this.f12102l ? 1 : 0)) * 31;
            long j13 = this.f12086H;
            int i13 = (i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
            long j14 = this.f12087I;
            int i14 = (((((i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.f12088J) * 31) + this.f12089K) * 31;
            long j15 = this.f12090L;
            return i14 + ((int) (j15 ^ (j15 >>> 32)));
        }
    }

    static {
        C10134c0.m19021F(0);
        C10134c0.m19021F(1);
        C10134c0.m19021F(2);
    }

    /* JADX INFO: renamed from: a */
    public int mo6773a(boolean z10) {
        return m6910p() ? -1 : 0;
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo6774b(Object obj);

    /* JADX INFO: renamed from: c */
    public int mo6775c(boolean z10) {
        if (m6910p()) {
            return -1;
        }
        return mo6909o() - 1;
    }

    /* JADX INFO: renamed from: d */
    public final int m6904d(int i10, b bVar, c cVar, int i11, boolean z10) {
        int i12 = mo6777f(i10, bVar, false).f12065c;
        if (m6908m(i12, cVar).f12089K != i10) {
            return i10 + 1;
        }
        int iMo6776e = mo6776e(i12, i11, z10);
        if (iMo6776e == -1) {
            return -1;
        }
        return m6908m(iMo6776e, cVar).f12088J;
    }

    /* JADX INFO: renamed from: e */
    public int mo6776e(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == mo6775c(z10)) {
                return -1;
            }
            return i10 + 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == mo6775c(z10) ? mo6773a(z10) : i10 + 1;
        }
        throw new IllegalStateException();
    }

    public final boolean equals(Object obj) {
        int iMo6775c;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC2382c0)) {
            return false;
        }
        AbstractC2382c0 abstractC2382c0 = (AbstractC2382c0) obj;
        if (abstractC2382c0.mo6909o() != mo6909o() || abstractC2382c0.mo6905h() != mo6905h()) {
            return false;
        }
        c cVar = new c();
        b bVar = new b();
        c cVar2 = new c();
        b bVar2 = new b();
        for (int i10 = 0; i10 < mo6909o(); i10++) {
            if (!m6908m(i10, cVar).equals(abstractC2382c0.m6908m(i10, cVar2))) {
                return false;
            }
        }
        for (int i11 = 0; i11 < mo6905h(); i11++) {
            if (!mo6777f(i11, bVar, true).equals(abstractC2382c0.mo6777f(i11, bVar2, true))) {
                return false;
            }
        }
        int iMo6773a = mo6773a(true);
        if (iMo6773a == abstractC2382c0.mo6773a(true) && (iMo6775c = mo6775c(true)) == abstractC2382c0.mo6775c(true)) {
            while (iMo6773a != iMo6775c) {
                int iMo6776e = mo6776e(iMo6773a, 0, true);
                if (iMo6776e != abstractC2382c0.mo6776e(iMo6773a, 0, true)) {
                    return false;
                }
                iMo6773a = iMo6776e;
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public abstract b mo6777f(int i10, b bVar, boolean z10);

    /* JADX INFO: renamed from: g */
    public b mo6778g(Object obj, b bVar) {
        return mo6777f(mo6774b(obj), bVar, true);
    }

    /* JADX INFO: renamed from: h */
    public abstract int mo6905h();

    public final int hashCode() {
        c cVar = new c();
        b bVar = new b();
        int iMo6909o = mo6909o() + 217;
        for (int i10 = 0; i10 < mo6909o(); i10++) {
            iMo6909o = (iMo6909o * 31) + m6908m(i10, cVar).hashCode();
        }
        int iMo6905h = mo6905h() + (iMo6909o * 31);
        for (int i11 = 0; i11 < mo6905h(); i11++) {
            iMo6905h = (iMo6905h * 31) + mo6777f(i11, bVar, true).hashCode();
        }
        int iMo6773a = mo6773a(true);
        while (true) {
            int i12 = iMo6773a;
            if (i12 == -1) {
                return iMo6905h;
            }
            iMo6905h = (iMo6905h * 31) + i12;
            iMo6773a = mo6776e(i12, 0, true);
        }
    }

    /* JADX INFO: renamed from: i */
    public final Pair<Object, Long> m6906i(c cVar, b bVar, int i10, long j10) {
        Pair<Object, Long> pairM6907j = m6907j(cVar, bVar, i10, j10, 0L);
        pairM6907j.getClass();
        return pairM6907j;
    }

    /* JADX INFO: renamed from: j */
    public final Pair<Object, Long> m6907j(c cVar, b bVar, int i10, long j10, long j11) {
        C10129a.m18991c(i10, mo6909o());
        mo6781n(i10, cVar, j11);
        if (j10 == -9223372036854775807L) {
            j10 = cVar.f12086H;
            if (j10 == -9223372036854775807L) {
                return null;
            }
        }
        int i11 = cVar.f12088J;
        mo6777f(i11, bVar, false);
        while (i11 < cVar.f12089K && bVar.f12067e != j10) {
            int i12 = i11 + 1;
            if (mo6777f(i12, bVar, false).f12067e > j10) {
                break;
            }
            i11 = i12;
        }
        mo6777f(i11, bVar, true);
        long jMin = j10 - bVar.f12067e;
        long j12 = bVar.f12066d;
        if (j12 != -9223372036854775807L) {
            jMin = Math.min(jMin, j12 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = bVar.f12064b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    /* JADX INFO: renamed from: k */
    public int mo6779k(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == mo6773a(z10)) {
                return -1;
            }
            return i10 - 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == mo6773a(z10) ? mo6775c(z10) : i10 - 1;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: l */
    public abstract Object mo6780l(int i10);

    /* JADX INFO: renamed from: m */
    public final c m6908m(int i10, c cVar) {
        return mo6781n(i10, cVar, 0L);
    }

    /* JADX INFO: renamed from: n */
    public abstract c mo6781n(int i10, c cVar, long j10);

    /* JADX INFO: renamed from: o */
    public abstract int mo6909o();

    /* JADX INFO: renamed from: p */
    public final boolean m6910p() {
        return mo6909o() == 0;
    }
}
