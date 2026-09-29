package com.google.android.exoplayer2;

import android.util.Pair;
import com.google.android.exoplayer2.source.InterfaceC2492i;
import com.google.android.exoplayer2.source.ads.C2473a;
import com.google.common.collect.ImmutableList;
import p150h9.C5902a0;
import p150h9.C5943z;
import p174i9.InterfaceC6206a;
import p213k4.RunnableC6589i;
import p479xa.C10129a;
import p479xa.InterfaceC10142k;

/* JADX INFO: renamed from: com.google.android.exoplayer2.r */
/* JADX INFO: loaded from: classes.dex */
public final class C2468r {

    /* JADX INFO: renamed from: a */
    public final AbstractC2382c0.b f12973a = new AbstractC2382c0.b();

    /* JADX INFO: renamed from: b */
    public final AbstractC2382c0.c f12974b = new AbstractC2382c0.c();

    /* JADX INFO: renamed from: c */
    public final InterfaceC6206a f12975c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC10142k f12976d;

    /* JADX INFO: renamed from: e */
    public long f12977e;

    /* JADX INFO: renamed from: f */
    public int f12978f;

    /* JADX INFO: renamed from: g */
    public boolean f12979g;

    /* JADX INFO: renamed from: h */
    public C5943z f12980h;

    /* JADX INFO: renamed from: i */
    public C5943z f12981i;

    /* JADX INFO: renamed from: j */
    public C5943z f12982j;

    /* JADX INFO: renamed from: k */
    public int f12983k;

    /* JADX INFO: renamed from: l */
    public Object f12984l;

    /* JADX INFO: renamed from: m */
    public long f12985m;

    public C2468r(InterfaceC6206a interfaceC6206a, InterfaceC10142k interfaceC10142k) {
        this.f12975c = interfaceC6206a;
        this.f12976d = interfaceC10142k;
    }

    /* JADX INFO: renamed from: l */
    public static InterfaceC2492i.b m7215l(AbstractC2382c0 abstractC2382c0, Object obj, long j10, long j11, AbstractC2382c0.c cVar, AbstractC2382c0.b bVar) {
        abstractC2382c0.mo6778g(obj, bVar);
        abstractC2382c0.m6908m(bVar.f12065c, cVar);
        int iMo6774b = abstractC2382c0.mo6774b(obj);
        Object obj2 = obj;
        while (bVar.f12066d == 0) {
            C2473a c2473a = bVar.f12069g;
            if (c2473a.f13041b <= 0 || !bVar.m6917g(c2473a.f13044e) || bVar.m6913c(0L) != -1) {
                break;
            }
            int i10 = iMo6774b + 1;
            if (iMo6774b >= cVar.f12089K) {
                break;
            }
            abstractC2382c0.mo6777f(i10, bVar, true);
            obj2 = bVar.f12064b;
            obj2.getClass();
            iMo6774b = i10;
        }
        abstractC2382c0.mo6778g(obj2, bVar);
        int iM6913c = bVar.m6913c(j10);
        return iM6913c == -1 ? new InterfaceC2492i.b(bVar.m6912b(j10), j11, obj2) : new InterfaceC2492i.b(obj2, iM6913c, bVar.m6916f(iM6913c), j11);
    }

    /* JADX INFO: renamed from: a */
    public final C5943z m7216a() {
        C5943z c5943z = this.f12980h;
        if (c5943z == null) {
            return null;
        }
        if (c5943z == this.f12981i) {
            this.f12981i = c5943z.f35387l;
        }
        c5943z.m12380f();
        int i10 = this.f12983k - 1;
        this.f12983k = i10;
        if (i10 == 0) {
            this.f12982j = null;
            C5943z c5943z2 = this.f12980h;
            this.f12984l = c5943z2.f35377b;
            this.f12985m = c5943z2.f35381f.f35249a.f34760d;
        }
        this.f12980h = this.f12980h.f35387l;
        m7225j();
        return this.f12980h;
    }

    /* JADX INFO: renamed from: b */
    public final void m7217b() {
        if (this.f12983k == 0) {
            return;
        }
        C5943z c5943z = this.f12980h;
        C10129a.m18993e(c5943z);
        this.f12984l = c5943z.f35377b;
        this.f12985m = c5943z.f35381f.f35249a.f34760d;
        while (c5943z != null) {
            c5943z.m12380f();
            c5943z = c5943z.f35387l;
        }
        this.f12980h = null;
        this.f12982j = null;
        this.f12981i = null;
        this.f12983k = 0;
        m7225j();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00e3  */
    /* JADX INFO: renamed from: c */
    public final C5902a0 m7218c(AbstractC2382c0 abstractC2382c0, C5943z c5943z, long j10) {
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        C5902a0 c5902a0 = c5943z.f35381f;
        long j16 = (c5943z.f35390o + c5902a0.f35253e) - j10;
        boolean z10 = c5902a0.f35255g;
        AbstractC2382c0.b bVar = this.f12973a;
        long jLongValue = c5902a0.f35251c;
        InterfaceC2492i.b bVar2 = c5902a0.f35249a;
        if (!z10) {
            abstractC2382c0.mo6778g(bVar2.f34757a, bVar);
            boolean zM12079a = bVar2.m12079a();
            Object obj = bVar2.f34757a;
            if (!zM12079a) {
                int i10 = bVar2.f34761e;
                int iM6916f = bVar.m6916f(i10);
                boolean z11 = bVar.m6917g(i10) && bVar.m6915e(i10, iM6916f) == 3;
                if (iM6916f != bVar.f12069g.m7248a(i10).f13056b && !z11) {
                    return m7220e(abstractC2382c0, bVar2.f34757a, bVar2.f34761e, iM6916f, c5902a0.f35253e, bVar2.f34760d);
                }
                abstractC2382c0.mo6778g(obj, bVar);
                long jM6914d = bVar.m6914d(i10);
                return m7221f(abstractC2382c0, bVar2.f34757a, jM6914d == Long.MIN_VALUE ? bVar.f12066d : jM6914d + bVar.f12069g.m7248a(i10).f13061g, c5902a0.f35253e, bVar2.f34760d);
            }
            int i11 = bVar2.f34758b;
            int i12 = bVar.f12069g.m7248a(i11).f13056b;
            if (i12 == -1) {
                return null;
            }
            int iM7249a = bVar.f12069g.m7248a(i11).m7249a(bVar2.f34759c);
            if (iM7249a < i12) {
                return m7220e(abstractC2382c0, bVar2.f34757a, i11, iM7249a, c5902a0.f35251c, bVar2.f34760d);
            }
            if (jLongValue == -9223372036854775807L) {
                Pair<Object, Long> pairM6907j = abstractC2382c0.m6907j(this.f12974b, bVar, bVar.f12065c, -9223372036854775807L, Math.max(0L, j16));
                if (pairM6907j == null) {
                    return null;
                }
                jLongValue = ((Long) pairM6907j.second).longValue();
            }
            abstractC2382c0.mo6778g(obj, bVar);
            int i13 = bVar2.f34758b;
            long jM6914d2 = bVar.m6914d(i13);
            return m7221f(abstractC2382c0, bVar2.f34757a, Math.max(jM6914d2 == Long.MIN_VALUE ? bVar.f12066d : jM6914d2 + bVar.f12069g.m7248a(i13).f13061g, jLongValue), c5902a0.f35251c, bVar2.f34760d);
        }
        boolean z12 = true;
        int iM6904d = abstractC2382c0.m6904d(abstractC2382c0.mo6774b(bVar2.f34757a), this.f12973a, this.f12974b, this.f12978f, this.f12979g);
        if (iM6904d == -1) {
            return null;
        }
        int i14 = abstractC2382c0.mo6777f(iM6904d, bVar, true).f12065c;
        Object obj2 = bVar.f12064b;
        obj2.getClass();
        if (abstractC2382c0.m6908m(i14, this.f12974b).f12088J == iM6904d) {
            Pair<Object, Long> pairM6907j2 = abstractC2382c0.m6907j(this.f12974b, this.f12973a, i14, -9223372036854775807L, Math.max(0L, j16));
            if (pairM6907j2 == null) {
                return null;
            }
            obj2 = pairM6907j2.first;
            long jLongValue2 = ((Long) pairM6907j2.second).longValue();
            C5943z c5943z2 = c5943z.f35387l;
            if (c5943z2 == null || !c5943z2.f35377b.equals(obj2)) {
                j11 = this.f12977e;
                this.f12977e = 1 + j11;
            } else {
                j11 = c5943z2.f35381f.f35249a.f34760d;
            }
            j12 = jLongValue2;
            j13 = -9223372036854775807L;
        } else {
            j11 = bVar2.f34760d;
            j12 = 0;
            j13 = 0;
        }
        InterfaceC2492i.b bVarM7215l = m7215l(abstractC2382c0, obj2, j12, j11, this.f12974b, this.f12973a);
        if (j13 == -9223372036854775807L || jLongValue == -9223372036854775807L) {
            j14 = j12;
            j15 = j13;
        } else {
            if (abstractC2382c0.mo6778g(bVar2.f34757a, bVar).f12069g.f13041b <= 0 || !bVar.m6917g(bVar.f12069g.f13044e)) {
                z12 = false;
            }
            if (bVarM7215l.m12079a() && z12) {
                j15 = jLongValue;
                j14 = j12;
            } else {
                if (z12) {
                    j14 = jLongValue;
                } else {
                    j14 = j12;
                }
                j15 = j13;
            }
        }
        return m7219d(abstractC2382c0, bVarM7215l, j15, j14);
    }

    /* JADX INFO: renamed from: d */
    public final C5902a0 m7219d(AbstractC2382c0 abstractC2382c0, InterfaceC2492i.b bVar, long j10, long j11) {
        abstractC2382c0.mo6778g(bVar.f34757a, this.f12973a);
        return bVar.m12079a() ? m7220e(abstractC2382c0, bVar.f34757a, bVar.f34758b, bVar.f34759c, j10, bVar.f34760d) : m7221f(abstractC2382c0, bVar.f34757a, j11, j10, bVar.f34760d);
    }

    /* JADX INFO: renamed from: e */
    public final C5902a0 m7220e(AbstractC2382c0 abstractC2382c0, Object obj, int i10, int i11, long j10, long j11) {
        InterfaceC2492i.b bVar = new InterfaceC2492i.b(obj, i10, i11, j11);
        AbstractC2382c0.b bVar2 = this.f12973a;
        long jM6911a = abstractC2382c0.mo6778g(obj, bVar2).m6911a(i10, i11);
        long j12 = i11 == bVar2.m6916f(i10) ? bVar2.f12069g.f13042c : 0L;
        return new C5902a0(bVar, (jM6911a == -9223372036854775807L || j12 < jM6911a) ? j12 : Math.max(0L, jM6911a - 1), j10, -9223372036854775807L, jM6911a, bVar2.m6917g(i10), false, false, false);
    }

    /* JADX INFO: renamed from: f */
    public final C5902a0 m7221f(AbstractC2382c0 abstractC2382c0, Object obj, long j10, long j11, long j12) {
        boolean z10;
        boolean z11;
        long jM6914d;
        long jMax = j10;
        AbstractC2382c0.b bVar = this.f12973a;
        abstractC2382c0.mo6778g(obj, bVar);
        int iM6912b = bVar.m6912b(jMax);
        if (iM6912b == -1) {
            C2473a c2473a = bVar.f12069g;
            z11 = c2473a.f13041b > 0 && bVar.m6917g(c2473a.f13044e);
        } else {
            if (bVar.m6917g(iM6912b) && bVar.m6914d(iM6912b) == bVar.f12066d) {
                C2473a.a aVarM7248a = bVar.f12069g.m7248a(iM6912b);
                int i10 = aVarM7248a.f13056b;
                if (i10 == -1) {
                    z10 = true;
                    break;
                }
                int i11 = 0;
                while (true) {
                    if (i11 >= i10) {
                        z10 = false;
                        break;
                    }
                    int i12 = aVarM7248a.f13059e[i11];
                    if (i12 == 0 || i12 == 1) {
                        z10 = true;
                        break;
                    }
                    i11++;
                }
                if (!z10) {
                    iM6912b = -1;
                }
            }
        }
        InterfaceC2492i.b bVar2 = new InterfaceC2492i.b(iM6912b, j12, obj);
        boolean z12 = !bVar2.m12079a() && iM6912b == -1;
        boolean zM7224i = m7224i(abstractC2382c0, bVar2);
        boolean zM7223h = m7223h(abstractC2382c0, bVar2, z12);
        boolean z13 = iM6912b != -1 && bVar.m6917g(iM6912b);
        if (iM6912b != -1) {
            jM6914d = bVar.m6914d(iM6912b);
        } else {
            jM6914d = z11 ? bVar.f12066d : -9223372036854775807L;
        }
        long j13 = (jM6914d == -9223372036854775807L || jM6914d == Long.MIN_VALUE) ? bVar.f12066d : jM6914d;
        if (j13 != -9223372036854775807L && jMax >= j13) {
            jMax = Math.max(0L, j13 - ((long) ((zM7223h || !z11) ? 1 : 0)));
        }
        return new C5902a0(bVar2, jMax, j11, jM6914d, j13, z13, z12, zM7224i, zM7223h);
    }

    /* JADX INFO: renamed from: g */
    public final C5902a0 m7222g(AbstractC2382c0 abstractC2382c0, C5902a0 c5902a0) {
        long jM6911a;
        boolean zM6917g;
        InterfaceC2492i.b bVar = c5902a0.f35249a;
        boolean z10 = !bVar.m12079a() && bVar.f34761e == -1;
        boolean zM7224i = m7224i(abstractC2382c0, bVar);
        boolean zM7223h = m7223h(abstractC2382c0, bVar, z10);
        Object obj = c5902a0.f35249a.f34757a;
        AbstractC2382c0.b bVar2 = this.f12973a;
        abstractC2382c0.mo6778g(obj, bVar2);
        boolean zM12079a = bVar.m12079a();
        int i10 = bVar.f34761e;
        long jM6914d = (zM12079a || i10 == -1) ? -9223372036854775807L : bVar2.m6914d(i10);
        boolean zM12079a2 = bVar.m12079a();
        int i11 = bVar.f34758b;
        if (zM12079a2) {
            jM6911a = bVar2.m6911a(i11, bVar.f34759c);
        } else {
            jM6911a = (jM6914d == -9223372036854775807L || jM6914d == Long.MIN_VALUE) ? bVar2.f12066d : jM6914d;
        }
        if (bVar.m12079a()) {
            zM6917g = bVar2.m6917g(i11);
        } else {
            zM6917g = i10 != -1 && bVar2.m6917g(i10);
        }
        return new C5902a0(bVar, c5902a0.f35250b, c5902a0.f35251c, jM6914d, jM6911a, zM6917g, z10, zM7224i, zM7223h);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m7223h(AbstractC2382c0 abstractC2382c0, InterfaceC2492i.b bVar, boolean z10) {
        int iMo6774b = abstractC2382c0.mo6774b(bVar.f34757a);
        if (abstractC2382c0.m6908m(abstractC2382c0.mo6777f(iMo6774b, this.f12973a, false).f12065c, this.f12974b).f12099i) {
            return false;
        }
        return (abstractC2382c0.m6904d(iMo6774b, this.f12973a, this.f12974b, this.f12978f, this.f12979g) == -1) && z10;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m7224i(AbstractC2382c0 abstractC2382c0, InterfaceC2492i.b bVar) {
        if (!(!bVar.m12079a() && bVar.f34761e == -1)) {
            return false;
        }
        Object obj = bVar.f34757a;
        return abstractC2382c0.m6908m(abstractC2382c0.mo6778g(obj, this.f12973a).f12065c, this.f12974b).f12089K == abstractC2382c0.mo6774b(obj);
    }

    /* JADX INFO: renamed from: j */
    public final void m7225j() {
        ImmutableList.C3147b c3147b = ImmutableList.f16043b;
        ImmutableList.C3146a c3146a = new ImmutableList.C3146a();
        for (C5943z c5943z = this.f12980h; c5943z != null; c5943z = c5943z.f35387l) {
            c3146a.m9055b(c5943z.f35381f.f35249a);
        }
        C5943z c5943z2 = this.f12981i;
        this.f12976d.mo19079e(new RunnableC6589i(2, this, c3146a, c5943z2 == null ? null : c5943z2.f35381f.f35249a));
    }

    /* JADX INFO: renamed from: k */
    public final boolean m7226k(C5943z c5943z) {
        boolean z10 = false;
        C10129a.m18992d(c5943z != null);
        if (c5943z.equals(this.f12982j)) {
            return false;
        }
        this.f12982j = c5943z;
        while (true) {
            c5943z = c5943z.f35387l;
            if (c5943z == null) {
                break;
            }
            if (c5943z == this.f12981i) {
                this.f12981i = this.f12980h;
                z10 = true;
            }
            c5943z.m12380f();
            this.f12983k--;
        }
        C5943z c5943z2 = this.f12982j;
        if (c5943z2.f35387l != null) {
            c5943z2.m12376b();
            c5943z2.f35387l = null;
            c5943z2.m12377c();
        }
        m7225j();
        return z10;
    }

    /* JADX INFO: renamed from: m */
    public final InterfaceC2492i.b m7227m(AbstractC2382c0 abstractC2382c0, Object obj, long j10) {
        long j11;
        int iMo6774b;
        Object obj2 = obj;
        AbstractC2382c0.b bVar = this.f12973a;
        int i10 = abstractC2382c0.mo6778g(obj2, bVar).f12065c;
        Object obj3 = this.f12984l;
        if (obj3 == null || (iMo6774b = abstractC2382c0.mo6774b(obj3)) == -1 || abstractC2382c0.mo6777f(iMo6774b, bVar, false).f12065c != i10) {
            C5943z c5943z = this.f12980h;
            while (true) {
                if (c5943z == null) {
                    C5943z c5943z2 = this.f12980h;
                    while (true) {
                        if (c5943z2 == null) {
                            j11 = this.f12977e;
                            this.f12977e = 1 + j11;
                            if (this.f12980h != null) {
                                break;
                            }
                            this.f12984l = obj2;
                            this.f12985m = j11;
                            break;
                        }
                        int iMo6774b2 = abstractC2382c0.mo6774b(c5943z2.f35377b);
                        if (iMo6774b2 != -1 && abstractC2382c0.mo6777f(iMo6774b2, bVar, false).f12065c == i10) {
                            j11 = c5943z2.f35381f.f35249a.f34760d;
                            break;
                        }
                        c5943z2 = c5943z2.f35387l;
                    }
                } else {
                    if (c5943z.f35377b.equals(obj2)) {
                        j11 = c5943z.f35381f.f35249a.f34760d;
                        break;
                    }
                    c5943z = c5943z.f35387l;
                }
            }
        } else {
            j11 = this.f12985m;
        }
        long j12 = j11;
        abstractC2382c0.mo6778g(obj2, bVar);
        int i11 = bVar.f12065c;
        AbstractC2382c0.c cVar = this.f12974b;
        abstractC2382c0.m6908m(i11, cVar);
        boolean z10 = false;
        for (int iMo6774b3 = abstractC2382c0.mo6774b(obj); iMo6774b3 >= cVar.f12088J; iMo6774b3--) {
            abstractC2382c0.mo6777f(iMo6774b3, bVar, true);
            boolean z11 = bVar.f12069g.f13041b > 0;
            z10 |= z11;
            if (bVar.m6913c(bVar.f12066d) != -1) {
                obj2 = bVar.f12064b;
                obj2.getClass();
            }
            if (z10 && (!z11 || bVar.f12066d != 0)) {
                break;
            }
        }
        return m7215l(abstractC2382c0, obj2, j10, j12, this.f12974b, this.f12973a);
    }

    /* JADX INFO: renamed from: n */
    public final boolean m7228n(AbstractC2382c0 abstractC2382c0) {
        C5943z c5943z;
        C5943z c5943z2 = this.f12980h;
        if (c5943z2 == null) {
            return true;
        }
        int iMo6774b = abstractC2382c0.mo6774b(c5943z2.f35377b);
        while (true) {
            iMo6774b = abstractC2382c0.m6904d(iMo6774b, this.f12973a, this.f12974b, this.f12978f, this.f12979g);
            while (true) {
                c5943z = c5943z2.f35387l;
                if (c5943z == null || c5943z2.f35381f.f35255g) {
                    break;
                }
                c5943z2 = c5943z;
            }
            if (iMo6774b == -1 || c5943z == null || abstractC2382c0.mo6774b(c5943z.f35377b) != iMo6774b) {
                break;
                break;
                break;
            }
            c5943z2 = c5943z;
        }
        boolean zM7226k = m7226k(c5943z2);
        c5943z2.f35381f = m7222g(abstractC2382c0, c5943z2.f35381f);
        return !zM7226k;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m7229o(AbstractC2382c0 abstractC2382c0, long j10, long j11) {
        boolean zM7226k;
        C5902a0 c5902a0M7222g;
        C5943z c5943z = this.f12980h;
        C5943z c5943z2 = null;
        while (c5943z != null) {
            C5902a0 c5902a0 = c5943z.f35381f;
            if (c5943z2 != null) {
                C5902a0 c5902a0M7218c = m7218c(abstractC2382c0, c5943z2, j10);
                if (c5902a0M7218c == null) {
                    zM7226k = m7226k(c5943z2);
                } else {
                    if (c5902a0.f35250b == c5902a0M7218c.f35250b && c5902a0.f35249a.equals(c5902a0M7218c.f35249a)) {
                        c5902a0M7222g = c5902a0M7218c;
                    } else {
                        zM7226k = m7226k(c5943z2);
                    }
                }
                return !zM7226k;
            }
            c5902a0M7222g = m7222g(abstractC2382c0, c5902a0);
            c5943z.f35381f = c5902a0M7222g.m12321a(c5902a0.f35251c);
            long j12 = c5902a0.f35253e;
            long j13 = c5902a0M7222g.f35253e;
            if (!(j12 == -9223372036854775807L || j12 == j13)) {
                c5943z.m12382h();
                return (m7226k(c5943z) || (c5943z == this.f12981i && !c5943z.f35381f.f35254f && ((j11 > Long.MIN_VALUE ? 1 : (j11 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j11 > ((j13 > (-9223372036854775807L) ? 1 : (j13 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : c5943z.f35390o + j13) ? 1 : (j11 == ((j13 > (-9223372036854775807L) ? 1 : (j13 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : c5943z.f35390o + j13) ? 0 : -1)) >= 0))) ? false : true;
            }
            c5943z2 = c5943z;
            c5943z = c5943z.f35387l;
        }
        return true;
    }
}
