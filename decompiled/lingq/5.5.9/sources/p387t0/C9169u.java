package p387t0;

import dm.C5206f;
import dm.C5207g;
import p003a2.C0009a;
import p338qd.C8584v;
import p402u0.AbstractC9360c;
import p402u0.C9359b;
import p402u0.C9363f;
import p402u0.C9364g;
import p402u0.C9365h;
import p402u0.C9374q;

/* JADX INFO: renamed from: t0.u */
/* JADX INFO: loaded from: classes.dex */
public final class C9169u {

    /* JADX INFO: renamed from: b */
    public static final long f47699b = C8584v.m16784i(4278190080L);

    /* JADX INFO: renamed from: c */
    public static final long f47700c;

    /* JADX INFO: renamed from: d */
    public static final long f47701d;

    /* JADX INFO: renamed from: e */
    public static final long f47702e;

    /* JADX INFO: renamed from: f */
    public static final long f47703f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ int f47704g = 0;

    /* JADX INFO: renamed from: a */
    public final long f47705a;

    static {
        C8584v.m16784i(4282664004L);
        C8584v.m16784i(4287137928L);
        C8584v.m16784i(4291611852L);
        C8584v.m16784i(4294967295L);
        f47700c = C8584v.m16784i(4294901760L);
        C8584v.m16784i(4278255360L);
        f47701d = C8584v.m16784i(4278190335L);
        C8584v.m16784i(4294967040L);
        C8584v.m16784i(4278255615L);
        C8584v.m16784i(4294902015L);
        f47702e = C8584v.m16783h(0);
        f47703f = C8584v.m16782g(0.0f, 0.0f, 0.0f, 0.0f, C9363f.f48123s);
    }

    public /* synthetic */ C9169u(long j10) {
        this.f47705a = j10;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x003d  */
    /* JADX WARN: Code duplicated, block: B:20:0x0048  */
    /* JADX WARN: Code duplicated, block: B:25:0x006b  */
    /* JADX INFO: renamed from: a */
    public static final long m17495a(long j10, AbstractC9360c abstractC9360c) {
        C9365h c9364g;
        long j11;
        C9365h c9365h;
        C5207g.m11111f(abstractC9360c, "colorSpace");
        AbstractC9360c abstractC9360cM17500f = m17500f(j10);
        if (C5207g.m11106a(abstractC9360c, abstractC9360cM17500f)) {
            return j10;
        }
        C5207g.m11111f(abstractC9360cM17500f, "$this$connect");
        C9374q c9374q = C9363f.f48107c;
        if (abstractC9360cM17500f == c9374q) {
            if (abstractC9360c == c9374q) {
                c9364g = C9365h.f48126e;
            } else if (abstractC9360c == C9363f.f48124t) {
                c9364g = C9365h.f48127f;
            } else if (abstractC9360cM17500f == abstractC9360c) {
                C9364g c9364g2 = C9365h.f48126e;
                c9364g = new C9364g(abstractC9360cM17500f);
            } else {
                j11 = C9359b.f48096a;
                if (C9359b.m17721a(abstractC9360cM17500f.f48102b, j11) || !C9359b.m17721a(abstractC9360c.f48102b, j11)) {
                    c9365h = new C9365h(abstractC9360cM17500f, abstractC9360c, 0);
                } else {
                    c9365h = new C9365h.b((C9374q) abstractC9360cM17500f, (C9374q) abstractC9360c, 0);
                }
                c9364g = c9365h;
            }
        } else if (abstractC9360cM17500f == C9363f.f48124t && abstractC9360c == c9374q) {
            c9364g = C9365h.f48128g;
        } else if (abstractC9360cM17500f == abstractC9360c) {
            C9364g c9364g3 = C9365h.f48126e;
            c9364g = new C9364g(abstractC9360cM17500f);
        } else {
            j11 = C9359b.f48096a;
            if (C9359b.m17721a(abstractC9360cM17500f.f48102b, j11)) {
                c9365h = new C9365h(abstractC9360cM17500f, abstractC9360c, 0);
            } else {
                c9365h = new C9365h(abstractC9360cM17500f, abstractC9360c, 0);
            }
            c9364g = c9365h;
        }
        return c9364g.mo17741a(m17502h(j10), m17501g(j10), m17499e(j10), m17498d(j10));
    }

    /* JADX INFO: renamed from: b */
    public static long m17496b(long j10, float f3) {
        return C8584v.m16782g(m17502h(j10), m17501g(j10), m17499e(j10), f3, m17500f(j10));
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m17497c(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX INFO: renamed from: d */
    public static final float m17498d(long j10) {
        float fM11028w1;
        float f3;
        if ((63 & j10) == 0) {
            fM11028w1 = (float) C5206f.m11028w1((j10 >>> 56) & 255);
            f3 = 255.0f;
        } else {
            fM11028w1 = (float) C5206f.m11028w1((j10 >>> 6) & 1023);
            f3 = 1023.0f;
        }
        return fM11028w1 / f3;
    }

    /* JADX INFO: renamed from: e */
    public static final float m17499e(long j10) {
        return (63 & j10) == 0 ? ((float) C5206f.m11028w1((j10 >>> 32) & 255)) / 255.0f : C9171w.m17505f((short) ((j10 >>> 16) & 65535));
    }

    /* JADX INFO: renamed from: f */
    public static final AbstractC9360c m17500f(long j10) {
        float[] fArr = C9363f.f48105a;
        return C9363f.f48125u[(int) (j10 & 63)];
    }

    /* JADX INFO: renamed from: g */
    public static final float m17501g(long j10) {
        return (63 & j10) == 0 ? ((float) C5206f.m11028w1((j10 >>> 40) & 255)) / 255.0f : C9171w.m17505f((short) ((j10 >>> 32) & 65535));
    }

    /* JADX INFO: renamed from: h */
    public static final float m17502h(long j10) {
        return (63 & j10) == 0 ? ((float) C5206f.m11028w1((j10 >>> 48) & 255)) / 255.0f : C9171w.m17505f((short) ((j10 >>> 48) & 65535));
    }

    /* JADX INFO: renamed from: i */
    public static String m17503i(long j10) {
        StringBuilder sb2 = new StringBuilder("Color(");
        sb2.append(m17502h(j10));
        sb2.append(", ");
        sb2.append(m17501g(j10));
        sb2.append(", ");
        sb2.append(m17499e(j10));
        sb2.append(", ");
        sb2.append(m17498d(j10));
        sb2.append(", ");
        return C0009a.m22j(sb2, m17500f(j10).f48101a, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C9169u) {
            return this.f47705a == ((C9169u) obj).f47705a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f47705a);
    }

    public final String toString() {
        return m17503i(this.f47705a);
    }
}
