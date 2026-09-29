package ua;

import com.google.android.exoplayer2.C2416m;
import com.google.common.collect.ImmutableList;
import dm.C5206f;
import ga.C5735r;
import java.util.ArrayList;
import java.util.List;
import p151ha.AbstractC5947d;
import p151ha.InterfaceC5948e;
import p454wa.InterfaceC9878c;
import p479xa.C10134c0;
import p479xa.C10145n;
import p479xa.InterfaceC10133c;

/* JADX INFO: renamed from: ua.a */
/* JADX INFO: loaded from: classes.dex */
public final class C9492a extends AbstractC9493b {

    /* JADX INFO: renamed from: g */
    public final InterfaceC9878c f48770g;

    /* JADX INFO: renamed from: h */
    public final long f48771h;

    /* JADX INFO: renamed from: i */
    public final long f48772i;

    /* JADX INFO: renamed from: j */
    public final long f48773j;

    /* JADX INFO: renamed from: k */
    public final int f48774k;

    /* JADX INFO: renamed from: l */
    public final int f48775l;

    /* JADX INFO: renamed from: m */
    public final float f48776m;

    /* JADX INFO: renamed from: n */
    public final float f48777n;

    /* JADX INFO: renamed from: o */
    public final ImmutableList<a> f48778o;

    /* JADX INFO: renamed from: p */
    public final InterfaceC10133c f48779p;

    /* JADX INFO: renamed from: q */
    public float f48780q;

    /* JADX INFO: renamed from: r */
    public int f48781r;

    /* JADX INFO: renamed from: s */
    public int f48782s;

    /* JADX INFO: renamed from: t */
    public long f48783t;

    /* JADX INFO: renamed from: u */
    public AbstractC5947d f48784u;

    /* JADX INFO: renamed from: ua.a$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final long f48785a;

        /* JADX INFO: renamed from: b */
        public final long f48786b;

        public a(long j10, long j11) {
            this.f48785a = j10;
            this.f48786b = j11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f48785a == aVar.f48785a && this.f48786b == aVar.f48786b;
        }

        public final int hashCode() {
            return (((int) this.f48785a) * 31) + ((int) this.f48786b);
        }
    }

    /* JADX INFO: renamed from: ua.a$b */
    public static class b implements InterfaceC9502k.b {
    }

    public C9492a(C5735r c5735r, int[] iArr, int i10, InterfaceC9878c interfaceC9878c, long j10, long j11, long j12, int i11, int i12, float f3, float f10, ImmutableList immutableList, InterfaceC10133c interfaceC10133c) {
        long j13;
        super(c5735r, iArr);
        if (j12 < j10) {
            C10145n.m19099g("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j13 = j10;
        } else {
            j13 = j12;
        }
        this.f48770g = interfaceC9878c;
        this.f48771h = j10 * 1000;
        this.f48772i = j11 * 1000;
        this.f48773j = j13 * 1000;
        this.f48774k = i11;
        this.f48775l = i12;
        this.f48776m = f3;
        this.f48777n = f10;
        this.f48778o = ImmutableList.m9060Q(immutableList);
        this.f48779p = interfaceC10133c;
        this.f48780q = 1.0f;
        this.f48782s = 0;
        this.f48783t = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: u */
    public static void m17932u(ArrayList arrayList, long[] jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ImmutableList.C3146a c3146a = (ImmutableList.C3146a) arrayList.get(i10);
            if (c3146a != null) {
                c3146a.m9055b(new a(j10, jArr[i10]));
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public static long m17933w(List list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        AbstractC5947d abstractC5947d = (AbstractC5947d) C5206f.m11002X0(list);
        long j10 = abstractC5947d.f35400g;
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j11 = abstractC5947d.f35401h;
        if (j11 != -9223372036854775807L) {
            return j11 - j10;
        }
        return -9223372036854775807L;
    }

    @Override // ua.InterfaceC9502k
    /* JADX INFO: renamed from: b */
    public final int mo7340b() {
        return this.f48781r;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0045  */
    /* JADX WARN: Code duplicated, block: B:19:0x0050  */
    /* JADX WARN: Code duplicated, block: B:21:0x005c A[EDGE_INSN: B:21:0x005c->B:29:0x0072 BREAK  A[LOOP:0: B:23:0x0066->B:28:0x006f]] */
    /* JADX WARN: Code duplicated, block: B:22:0x005e  */
    /* JADX WARN: Code duplicated, block: B:25:0x006a  */
    /* JADX WARN: Code duplicated, block: B:28:0x006f A[LOOP:0: B:23:0x0066->B:28:0x006f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0074  */
    /* JADX WARN: Code duplicated, block: B:33:0x0087  */
    /* JADX WARN: Code duplicated, block: B:36:0x0097  */
    /* JADX WARN: Code duplicated, block: B:38:0x009b  */
    /* JADX WARN: Code duplicated, block: B:39:0x009e  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:55:0x005c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0072 A[EDGE_INSN: B:56:0x0072->B:29:0x0072 BREAK  A[LOOP:0: B:23:0x0066->B:28:0x006f], SYNTHETIC] */
    @Override // ua.InterfaceC9502k
    /* JADX INFO: renamed from: c */
    public final void mo7341c(long j10, long j11, long j12, List<? extends AbstractC5947d> list, InterfaceC5948e[] interfaceC5948eArr) {
        long jM17933w;
        long jMo12384b;
        long jMo12383a;
        int i10;
        int i11;
        boolean zIsEmpty;
        C2416m[] c2416mArr;
        C2416m c2416m;
        int iM17934v;
        long jMin;
        int i12;
        int i13;
        long j13;
        long jMo19015d = this.f48779p.mo19015d();
        int i14 = this.f48781r;
        int i15 = 0;
        if (i14 >= interfaceC5948eArr.length || !interfaceC5948eArr[i14].next()) {
            int length = interfaceC5948eArr.length;
            int i16 = 0;
            while (true) {
                if (i16 >= length) {
                    jM17933w = m17933w(list);
                    break;
                }
                InterfaceC5948e interfaceC5948e = interfaceC5948eArr[i16];
                if (interfaceC5948e.next()) {
                    jMo12384b = interfaceC5948e.mo12384b();
                    jMo12383a = interfaceC5948e.mo12383a();
                } else {
                    i16++;
                }
            }
            i10 = this.f48782s;
            if (i10 == 0) {
                this.f48782s = 1;
                this.f48781r = m17934v(jMo19015d, jM17933w);
                return;
            }
            i11 = this.f48781r;
            zIsEmpty = list.isEmpty();
            c2416mArr = this.f48790d;
            if (zIsEmpty) {
                c2416m = ((AbstractC5947d) C5206f.m11002X0(list)).f35397d;
                while (true) {
                    if (i15 < this.f48788b) {
                        i15 = -1;
                        break;
                    } else if (c2416mArr[i15] == c2416m) {
                        break;
                    } else {
                        i15++;
                    }
                }
            } else {
                i15 = -1;
                break;
            }
            if (i15 != -1) {
                i10 = ((AbstractC5947d) C5206f.m11002X0(list)).f35398e;
                i11 = i15;
            }
            iM17934v = m17934v(jMo19015d, jM17933w);
            if (!mo7343e(i11, jMo19015d)) {
                C2416m c2416m2 = c2416mArr[i11];
                C2416m c2416m3 = c2416mArr[iM17934v];
                jMin = this.f48771h;
                if (j12 != -9223372036854775807L) {
                    if (jM17933w != -9223372036854775807L) {
                        j13 = j12 - jM17933w;
                    } else {
                        j13 = j12;
                    }
                    jMin = Math.min((long) (j13 * this.f48777n), jMin);
                }
                i12 = c2416m3.f12480h;
                i13 = c2416m2.f12480h;
                if ((i12 <= i13 && j11 < jMin) || (i12 < i13 && j11 >= this.f48772i)) {
                }
            }
            if (iM17934v != i11) {
                i10 = 3;
            }
            this.f48782s = i10;
            this.f48781r = iM17934v;
        }
        InterfaceC5948e interfaceC5948e2 = interfaceC5948eArr[this.f48781r];
        jMo12384b = interfaceC5948e2.mo12384b();
        jMo12383a = interfaceC5948e2.mo12383a();
        jM17933w = jMo12384b - jMo12383a;
        i10 = this.f48782s;
        if (i10 == 0) {
            this.f48782s = 1;
            this.f48781r = m17934v(jMo19015d, jM17933w);
            return;
        }
        i11 = this.f48781r;
        zIsEmpty = list.isEmpty();
        c2416mArr = this.f48790d;
        if (zIsEmpty) {
            c2416m = ((AbstractC5947d) C5206f.m11002X0(list)).f35397d;
            while (true) {
                if (i15 < this.f48788b) {
                    i15 = -1;
                    break;
                } else {
                    if (c2416mArr[i15] == c2416m) {
                        break;
                        break;
                    }
                    i15++;
                }
            }
        } else {
            i15 = -1;
            break;
        }
        if (i15 != -1) {
            i10 = ((AbstractC5947d) C5206f.m11002X0(list)).f35398e;
            i11 = i15;
        }
        iM17934v = m17934v(jMo19015d, jM17933w);
        if (!mo7343e(i11, jMo19015d)) {
            C2416m c2416m4 = c2416mArr[i11];
            C2416m c2416m5 = c2416mArr[iM17934v];
            jMin = this.f48771h;
            if (j12 != -9223372036854775807L) {
                if (jM17933w != -9223372036854775807L) {
                    j13 = j12 - jM17933w;
                } else {
                    j13 = j12;
                }
                jMin = Math.min((long) (j13 * this.f48777n), jMin);
            }
            i12 = c2416m5.f12480h;
            i13 = c2416m4.f12480h;
            iM17934v = i12 <= i13 ? i11 : i11;
        }
        if (iM17934v != i11) {
            i10 = 3;
        }
        this.f48782s = i10;
        this.f48781r = iM17934v;
    }

    @Override // ua.AbstractC9493b, ua.InterfaceC9502k
    /* JADX INFO: renamed from: f */
    public final void mo7344f() {
        this.f48784u = null;
    }

    @Override // ua.AbstractC9493b, ua.InterfaceC9502k
    /* JADX INFO: renamed from: i */
    public final void mo7347i() {
        this.f48783t = -9223372036854775807L;
        this.f48784u = null;
    }

    @Override // ua.InterfaceC9502k
    /* JADX INFO: renamed from: m */
    public final int mo7351m() {
        return this.f48782s;
    }

    @Override // ua.AbstractC9493b, ua.InterfaceC9502k
    /* JADX INFO: renamed from: n */
    public final void mo7352n(float f3) {
        this.f48780q = f3;
    }

    @Override // ua.InterfaceC9502k
    /* JADX INFO: renamed from: o */
    public final Object mo7353o() {
        return null;
    }

    @Override // ua.AbstractC9493b, ua.InterfaceC9502k
    /* JADX INFO: renamed from: s */
    public final int mo7357s(List list, long j10) {
        int i10;
        int i11;
        long jMo19015d = this.f48779p.mo19015d();
        long j11 = this.f48783t;
        if (!(j11 == -9223372036854775807L || jMo19015d - j11 >= 1000 || !(list.isEmpty() || ((AbstractC5947d) C5206f.m11002X0(list)).equals(this.f48784u)))) {
            return list.size();
        }
        this.f48783t = jMo19015d;
        this.f48784u = list.isEmpty() ? null : (AbstractC5947d) C5206f.m11002X0(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jM19056w = C10134c0.m19056w(this.f48780q, ((AbstractC5947d) list.get(size - 1)).f35400g - j10);
        long j12 = this.f48773j;
        if (jM19056w < j12) {
            return size;
        }
        C2416m c2416m = this.f48790d[m17934v(jMo19015d, m17933w(list))];
        for (int i12 = 0; i12 < size; i12++) {
            AbstractC5947d abstractC5947d = (AbstractC5947d) list.get(i12);
            C2416m c2416m2 = abstractC5947d.f35397d;
            if (C10134c0.m19056w(this.f48780q, abstractC5947d.f35400g - j10) >= j12 && c2416m2.f12480h < c2416m.f12480h && (i10 = c2416m2.f12456M) != -1 && i10 <= this.f48775l && (i11 = c2416m2.f12455L) != -1 && i11 <= this.f48774k && i10 < c2416m.f12456M) {
                return i12;
            }
        }
        return size;
    }

    /* JADX INFO: renamed from: v */
    public final int m17934v(long j10, long j11) {
        long jMo18374h = (long) (((long) (this.f48770g.mo18374h() * this.f48776m)) / this.f48780q);
        ImmutableList<a> immutableList = this.f48778o;
        if (!immutableList.isEmpty()) {
            int i10 = 1;
            while (i10 < immutableList.size() - 1 && immutableList.get(i10).f48785a < jMo18374h) {
                i10++;
            }
            a aVar = immutableList.get(i10 - 1);
            a aVar2 = immutableList.get(i10);
            long j12 = aVar.f48785a;
            float f3 = (jMo18374h - j12) / (aVar2.f48785a - j12);
            long j13 = aVar2.f48786b;
            long j14 = aVar.f48786b;
            jMo18374h = ((long) (f3 * (j13 - j14))) + j14;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f48788b; i12++) {
            if (j10 == Long.MIN_VALUE || !mo7343e(i12, j10)) {
                if (((long) this.f48790d[i12].f12480h) <= jMo18374h) {
                    return i12;
                }
                i11 = i12;
            }
        }
        return i11;
    }
}
