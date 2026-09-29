package com.google.android.exoplayer2;

import ae.C0062b;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.metadata.C2431a;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.InterfaceC2480h;
import com.google.android.exoplayer2.source.InterfaceC2492i;
import com.google.android.exoplayer2.source.InterfaceC2500q;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.common.collect.ImmutableList;
import ga.C5736s;
import ga.InterfaceC5731n;
import ga.InterfaceC5732o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p118fe.C5509a;
import p128g2.RunnableC5682t;
import p150h9.C5902a0;
import p150h9.C5920j0;
import p150h9.C5922k0;
import p150h9.C5926m0;
import p150h9.C5930o0;
import p150h9.C5943z;
import p150h9.InterfaceC5924l0;
import p150h9.InterfaceC5942y;
import p174i9.C6215e0;
import p174i9.InterfaceC6206a;
import p219ka.C6652m;
import p454wa.C9885j;
import p454wa.C9887l;
import p454wa.InterfaceC9878c;
import p479xa.C10129a;
import p479xa.C10134c0;
import p479xa.C10145n;
import p479xa.C10154w;
import p479xa.C10156y;
import p479xa.InterfaceC10133c;
import p479xa.InterfaceC10142k;
import p479xa.InterfaceC10146o;
import p482xd.InterfaceC10177i;
import ua.AbstractC9510s;
import ua.C9511t;
import ua.InterfaceC9502k;

/* JADX INFO: renamed from: com.google.android.exoplayer2.l */
/* JADX INFO: loaded from: classes.dex */
public final class C2415l implements Handler.Callback, InterfaceC2480h.a, AbstractC9510s.a, C2469s.d, C2411h.a, C2534w.a {

    /* JADX INFO: renamed from: H */
    public final long f12350H;

    /* JADX INFO: renamed from: I */
    public final boolean f12351I;

    /* JADX INFO: renamed from: J */
    public final C2411h f12352J;

    /* JADX INFO: renamed from: K */
    public final ArrayList<c> f12353K;

    /* JADX INFO: renamed from: L */
    public final InterfaceC10133c f12354L;

    /* JADX INFO: renamed from: M */
    public final e f12355M;

    /* JADX INFO: renamed from: N */
    public final C2468r f12356N;

    /* JADX INFO: renamed from: O */
    public final C2469s f12357O;

    /* JADX INFO: renamed from: P */
    public final InterfaceC2464o f12358P;

    /* JADX INFO: renamed from: Q */
    public final long f12359Q;

    /* JADX INFO: renamed from: R */
    public C5930o0 f12360R;

    /* JADX INFO: renamed from: S */
    public C5920j0 f12361S;

    /* JADX INFO: renamed from: T */
    public d f12362T;

    /* JADX INFO: renamed from: U */
    public boolean f12363U;

    /* JADX INFO: renamed from: V */
    public boolean f12364V;

    /* JADX INFO: renamed from: W */
    public boolean f12365W;

    /* JADX INFO: renamed from: X */
    public boolean f12366X;

    /* JADX INFO: renamed from: Y */
    public boolean f12367Y;

    /* JADX INFO: renamed from: Z */
    public int f12368Z;

    /* JADX INFO: renamed from: a */
    public final InterfaceC2536y[] f12369a;

    /* JADX INFO: renamed from: a0 */
    public boolean f12370a0;

    /* JADX INFO: renamed from: b */
    public final Set<InterfaceC2536y> f12371b;

    /* JADX INFO: renamed from: b0 */
    public boolean f12372b0;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5924l0[] f12373c;

    /* JADX INFO: renamed from: c0 */
    public boolean f12374c0;

    /* JADX INFO: renamed from: d */
    public final AbstractC9510s f12375d;

    /* JADX INFO: renamed from: d0 */
    public boolean f12376d0;

    /* JADX INFO: renamed from: e */
    public final C9511t f12377e;

    /* JADX INFO: renamed from: e0 */
    public int f12378e0;

    /* JADX INFO: renamed from: f */
    public final InterfaceC5942y f12379f;

    /* JADX INFO: renamed from: f0 */
    public g f12380f0;

    /* JADX INFO: renamed from: g */
    public final InterfaceC9878c f12381g;

    /* JADX INFO: renamed from: g0 */
    public long f12382g0;

    /* JADX INFO: renamed from: h */
    public final InterfaceC10142k f12383h;

    /* JADX INFO: renamed from: h0 */
    public int f12384h0;

    /* JADX INFO: renamed from: i */
    public final HandlerThread f12385i;

    /* JADX INFO: renamed from: i0 */
    public boolean f12386i0;

    /* JADX INFO: renamed from: j */
    public final Looper f12387j;

    /* JADX INFO: renamed from: j0 */
    public ExoPlaybackException f12388j0;

    /* JADX INFO: renamed from: k */
    public final AbstractC2382c0.c f12389k;

    /* JADX INFO: renamed from: k0 */
    public long f12390k0;

    /* JADX INFO: renamed from: l */
    public final AbstractC2382c0.b f12391l;

    /* JADX INFO: renamed from: l0 */
    public long f12392l0 = -9223372036854775807L;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.l$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final List<C2469s.c> f12393a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC5732o f12394b;

        /* JADX INFO: renamed from: c */
        public final int f12395c;

        /* JADX INFO: renamed from: d */
        public final long f12396d;

        public a(ArrayList arrayList, InterfaceC5732o interfaceC5732o, int i10, long j10) {
            this.f12393a = arrayList;
            this.f12394b = interfaceC5732o;
            this.f12395c = i10;
            this.f12396d = j10;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.l$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final int f12397a;

        /* JADX INFO: renamed from: b */
        public final int f12398b;

        /* JADX INFO: renamed from: c */
        public final int f12399c;

        /* JADX INFO: renamed from: d */
        public final InterfaceC5732o f12400d;

        public b(int i10, int i11, int i12, InterfaceC5732o interfaceC5732o) {
            this.f12397a = i10;
            this.f12398b = i11;
            this.f12399c = i12;
            this.f12400d = interfaceC5732o;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.l$c */
    public static final class c implements Comparable<c> {
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        public c() {
            throw null;
        }

        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            cVar.getClass();
            return 0;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.l$d */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public boolean f12401a;

        /* JADX INFO: renamed from: b */
        public C5920j0 f12402b;

        /* JADX INFO: renamed from: c */
        public int f12403c;

        /* JADX INFO: renamed from: d */
        public boolean f12404d;

        /* JADX INFO: renamed from: e */
        public int f12405e;

        /* JADX INFO: renamed from: f */
        public boolean f12406f;

        /* JADX INFO: renamed from: g */
        public int f12407g;

        public d(C5920j0 c5920j0) {
            this.f12402b = c5920j0;
        }

        /* JADX INFO: renamed from: a */
        public final void m7122a(int i10) {
            this.f12401a |= i10 > 0;
            this.f12403c += i10;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.l$e */
    public interface e {
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.l$f */
    public static final class f {

        /* JADX INFO: renamed from: a */
        public final InterfaceC2492i.b f12408a;

        /* JADX INFO: renamed from: b */
        public final long f12409b;

        /* JADX INFO: renamed from: c */
        public final long f12410c;

        /* JADX INFO: renamed from: d */
        public final boolean f12411d;

        /* JADX INFO: renamed from: e */
        public final boolean f12412e;

        /* JADX INFO: renamed from: f */
        public final boolean f12413f;

        public f(InterfaceC2492i.b bVar, long j10, long j11, boolean z10, boolean z11, boolean z12) {
            this.f12408a = bVar;
            this.f12409b = j10;
            this.f12410c = j11;
            this.f12411d = z10;
            this.f12412e = z11;
            this.f12413f = z12;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.l$g */
    public static final class g {

        /* JADX INFO: renamed from: a */
        public final AbstractC2382c0 f12414a;

        /* JADX INFO: renamed from: b */
        public final int f12415b;

        /* JADX INFO: renamed from: c */
        public final long f12416c;

        public g(AbstractC2382c0 abstractC2382c0, int i10, long j10) {
            this.f12414a = abstractC2382c0;
            this.f12415b = i10;
            this.f12416c = j10;
        }
    }

    public C2415l(InterfaceC2536y[] interfaceC2536yArr, AbstractC9510s abstractC9510s, C9511t c9511t, InterfaceC5942y interfaceC5942y, InterfaceC9878c interfaceC9878c, int i10, boolean z10, InterfaceC6206a interfaceC6206a, C5930o0 c5930o0, C2410g c2410g, long j10, boolean z11, Looper looper, InterfaceC10133c interfaceC10133c, C5509a c5509a, C6215e0 c6215e0) {
        this.f12355M = c5509a;
        this.f12369a = interfaceC2536yArr;
        this.f12375d = abstractC9510s;
        this.f12377e = c9511t;
        this.f12379f = interfaceC5942y;
        this.f12381g = interfaceC9878c;
        this.f12368Z = i10;
        this.f12370a0 = z10;
        this.f12360R = c5930o0;
        this.f12358P = c2410g;
        this.f12359Q = j10;
        this.f12390k0 = j10;
        this.f12364V = z11;
        this.f12354L = interfaceC10133c;
        this.f12350H = interfaceC5942y.mo12325b();
        this.f12351I = interfaceC5942y.mo12324a();
        C5920j0 c5920j0M12335h = C5920j0.m12335h(c9511t);
        this.f12361S = c5920j0M12335h;
        this.f12362T = new d(c5920j0M12335h);
        this.f12373c = new InterfaceC5924l0[interfaceC2536yArr.length];
        for (int i11 = 0; i11 < interfaceC2536yArr.length; i11++) {
            interfaceC2536yArr[i11].mo6996g(i11, c6215e0);
            this.f12373c[i11] = interfaceC2536yArr[i11].mo6999k();
        }
        this.f12352J = new C2411h(this, interfaceC10133c);
        this.f12353K = new ArrayList<>();
        this.f12371b = Collections.newSetFromMap(new IdentityHashMap());
        this.f12389k = new AbstractC2382c0.c();
        this.f12391l = new AbstractC2382c0.b();
        abstractC9510s.f49009a = this;
        abstractC9510s.f49010b = interfaceC9878c;
        this.f12386i0 = true;
        C10156y c10156yMo19013b = interfaceC10133c.mo19013b(looper, null);
        this.f12356N = new C2468r(interfaceC6206a, c10156yMo19013b);
        this.f12357O = new C2469s(this, interfaceC6206a, c10156yMo19013b, c6215e0);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f12385i = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f12387j = looper2;
        this.f12383h = interfaceC10133c.mo19013b(looper2, this);
    }

    /* JADX INFO: renamed from: F */
    public static Pair<Object, Long> m7064F(AbstractC2382c0 abstractC2382c0, g gVar, boolean z10, int i10, boolean z11, AbstractC2382c0.c cVar, AbstractC2382c0.b bVar) {
        Object objM7065G;
        AbstractC2382c0 abstractC2382c1 = gVar.f12414a;
        if (abstractC2382c0.m6910p()) {
            return null;
        }
        AbstractC2382c0 abstractC2382c2 = abstractC2382c1.m6910p() ? abstractC2382c0 : abstractC2382c1;
        try {
            Pair<Object, Long> pairM6906i = abstractC2382c2.m6906i(cVar, bVar, gVar.f12415b, gVar.f12416c);
            if (abstractC2382c0.equals(abstractC2382c2)) {
                return pairM6906i;
            }
            if (abstractC2382c0.mo6774b(pairM6906i.first) != -1) {
                return (abstractC2382c2.mo6778g(pairM6906i.first, bVar).f12068f && abstractC2382c2.m6908m(bVar.f12065c, cVar).f12088J == abstractC2382c2.mo6774b(pairM6906i.first)) ? abstractC2382c0.m6906i(cVar, bVar, abstractC2382c0.mo6778g(pairM6906i.first, bVar).f12065c, gVar.f12416c) : pairM6906i;
            }
            if (z10 && (objM7065G = m7065G(cVar, bVar, i10, z11, pairM6906i.first, abstractC2382c2, abstractC2382c0)) != null) {
                return abstractC2382c0.m6906i(cVar, bVar, abstractC2382c0.mo6778g(objM7065G, bVar).f12065c, -9223372036854775807L);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    /* JADX INFO: renamed from: G */
    public static Object m7065G(AbstractC2382c0.c cVar, AbstractC2382c0.b bVar, int i10, boolean z10, Object obj, AbstractC2382c0 abstractC2382c0, AbstractC2382c0 abstractC2382c1) {
        int iMo6774b = abstractC2382c0.mo6774b(obj);
        int iMo6905h = abstractC2382c0.mo6905h();
        int iM6904d = iMo6774b;
        int iMo6774b2 = -1;
        for (int i11 = 0; i11 < iMo6905h && iMo6774b2 == -1; i11++) {
            iM6904d = abstractC2382c0.m6904d(iM6904d, bVar, cVar, i10, z10);
            if (iM6904d == -1) {
                break;
            }
            iMo6774b2 = abstractC2382c1.mo6774b(abstractC2382c0.mo6780l(iM6904d));
        }
        if (iMo6774b2 == -1) {
            return null;
        }
        return abstractC2382c1.mo6780l(iMo6774b2);
    }

    /* JADX INFO: renamed from: M */
    public static void m7066M(InterfaceC2536y interfaceC2536y, long j10) {
        interfaceC2536y.mo6998i();
        if (interfaceC2536y instanceof C6652m) {
            C6652m c6652m = (C6652m) interfaceC2536y;
            C10129a.m18992d(c6652m.f12230k);
            c6652m.f37717V = j10;
        }
    }

    /* JADX INFO: renamed from: r */
    public static boolean m7067r(InterfaceC2536y interfaceC2536y) {
        return interfaceC2536y.getState() != 0;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0044 A[EDGE_INSN: B:20:0x0044->B:21:0x0046 BREAK  A[LOOP:1: B:13:0x0034->B:18:0x003e]] */
    /* JADX INFO: renamed from: A */
    public final void m7068A() throws ExoPlaybackException {
        boolean z10;
        float f3 = this.f12352J.getPlaybackParameters().f13474a;
        C2468r c2468r = this.f12356N;
        C5943z c5943z = c2468r.f12980h;
        C5943z c5943z2 = c2468r.f12981i;
        boolean z11 = true;
        for (C5943z c5943z3 = c5943z; c5943z3 != null && c5943z3.f35379d; c5943z3 = c5943z3.f35387l) {
            C9511t c9511tM12381g = c5943z3.m12381g(f3, this.f12361S.f35313a);
            C9511t c9511t = c5943z3.f35389n;
            if (c9511t == null) {
                z10 = false;
                break;
            }
            int length = c9511t.f49013c.length;
            InterfaceC9502k[] interfaceC9502kArr = c9511tM12381g.f49013c;
            if (length != interfaceC9502kArr.length) {
                z10 = false;
                break;
            }
            int i10 = 0;
            while (true) {
                if (i10 >= interfaceC9502kArr.length) {
                    z10 = true;
                    break;
                } else {
                    if (!c9511tM12381g.m17976a(c9511t, i10)) {
                        z10 = false;
                        break;
                    }
                    i10++;
                }
            }
            if (!z10) {
                if (z11) {
                    C2468r c2468r2 = this.f12356N;
                    C5943z c5943z4 = c2468r2.f12980h;
                    boolean zM7226k = c2468r2.m7226k(c5943z4);
                    boolean[] zArr = new boolean[this.f12369a.length];
                    long jM12375a = c5943z4.m12375a(c9511tM12381g, this.f12361S.f35330r, zM7226k, zArr);
                    C5920j0 c5920j0 = this.f12361S;
                    boolean z12 = (c5920j0.f35317e == 4 || jM12375a == c5920j0.f35330r) ? false : true;
                    C5920j0 c5920j1 = this.f12361S;
                    this.f12361S = m7112p(c5920j1.f35314b, jM12375a, c5920j1.f35315c, c5920j1.f35316d, z12, 5);
                    if (z12) {
                        m7071D(jM12375a);
                    }
                    boolean[] zArr2 = new boolean[this.f12369a.length];
                    int i11 = 0;
                    while (true) {
                        InterfaceC2536y[] interfaceC2536yArr = this.f12369a;
                        if (i11 >= interfaceC2536yArr.length) {
                            break;
                        }
                        InterfaceC2536y interfaceC2536y = interfaceC2536yArr[i11];
                        boolean zM7067r = m7067r(interfaceC2536y);
                        zArr2[i11] = zM7067r;
                        InterfaceC5731n interfaceC5731n = c5943z4.f35378c[i11];
                        if (zM7067r) {
                            if (interfaceC5731n != interfaceC2536y.mo7002r()) {
                                m7097d(interfaceC2536y);
                            } else if (zArr[i11]) {
                                interfaceC2536y.mo7006v(this.f12382g0);
                            }
                        }
                        i11++;
                    }
                    m7101f(zArr2);
                } else {
                    this.f12356N.m7226k(c5943z3);
                    if (c5943z3.f35379d) {
                        c5943z3.m12375a(c9511tM12381g, Math.max(c5943z3.f35381f.f35250b, this.f12382g0 - c5943z3.f35390o), false, new boolean[c5943z3.f35384i.length]);
                    }
                }
                m7108l(true);
                if (this.f12361S.f35317e != 4) {
                    m7115t();
                    m7098d0();
                    this.f12383h.mo19083i(2);
                    return;
                }
                return;
            }
            if (c5943z3 == c5943z2) {
                z11 = false;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x009a  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c6 A[PHI: r4 r5 r8
      0x00c6: PHI (r4v4 com.google.android.exoplayer2.source.i$b) = (r4v3 com.google.android.exoplayer2.source.i$b), (r4v11 com.google.android.exoplayer2.source.i$b) binds: [B:39:0x009e, B:41:0x00c3] A[DONT_GENERATE, DONT_INLINE]
      0x00c6: PHI (r5v2 long) = (r5v1 long), (r5v6 long) binds: [B:39:0x009e, B:41:0x00c3] A[DONT_GENERATE, DONT_INLINE]
      0x00c6: PHI (r8v2 long) = (r8v1 long), (r8v5 long) binds: [B:39:0x009e, B:41:0x00c3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: B */
    public final void m7069B(boolean z10, boolean z11, boolean z12, boolean z13) {
        long j10;
        boolean z14;
        this.f12383h.mo19084j(2);
        this.f12388j0 = null;
        this.f12366X = false;
        C2411h c2411h = this.f12352J;
        c2411h.f12263f = false;
        C10154w c10154w = c2411h.f12258a;
        if (c10154w.f51449b) {
            c10154w.m19162a(c10154w.mo6886l());
            c10154w.f51449b = false;
        }
        this.f12382g0 = 1000000000000L;
        for (InterfaceC2536y interfaceC2536y : this.f12369a) {
            try {
                m7097d(interfaceC2536y);
            } catch (ExoPlaybackException | RuntimeException e10) {
                C10145n.m19096d("ExoPlayerImplInternal", "Disable failed.", e10);
            }
        }
        if (z10) {
            for (InterfaceC2536y interfaceC2536y2 : this.f12369a) {
                if (this.f12371b.remove(interfaceC2536y2)) {
                    try {
                        interfaceC2536y2.mo6994c();
                    } catch (RuntimeException e11) {
                        C10145n.m19096d("ExoPlayerImplInternal", "Reset failed.", e11);
                    }
                }
            }
        }
        this.f12378e0 = 0;
        C5920j0 c5920j0 = this.f12361S;
        InterfaceC2492i.b bVar = c5920j0.f35314b;
        long jLongValue = c5920j0.f35330r;
        if (this.f12361S.f35314b.m12079a()) {
            j10 = this.f12361S.f35315c;
        } else {
            C5920j0 c5920j1 = this.f12361S;
            AbstractC2382c0.b bVar2 = this.f12391l;
            InterfaceC2492i.b bVar3 = c5920j1.f35314b;
            AbstractC2382c0 abstractC2382c0 = c5920j1.f35313a;
            if (abstractC2382c0.m6910p() || abstractC2382c0.mo6778g(bVar3.f34757a, bVar2).f12068f) {
                j10 = this.f12361S.f35315c;
            } else {
                j10 = this.f12361S.f35330r;
            }
        }
        if (z11) {
            this.f12380f0 = null;
            Pair<InterfaceC2492i.b, Long> pairM7105i = m7105i(this.f12361S.f35313a);
            bVar = (InterfaceC2492i.b) pairM7105i.first;
            jLongValue = ((Long) pairM7105i.second).longValue();
            j10 = -9223372036854775807L;
            z14 = bVar.equals(this.f12361S.f35314b) ? false : true;
        }
        InterfaceC2492i.b bVar4 = bVar;
        long j11 = jLongValue;
        long j12 = j10;
        this.f12356N.m7217b();
        this.f12367Y = false;
        C5920j0 c5920j2 = this.f12361S;
        AbstractC2382c0 abstractC2382c1 = c5920j2.f35313a;
        int i10 = c5920j2.f35317e;
        ExoPlaybackException exoPlaybackException = z13 ? null : c5920j2.f35318f;
        C5736s c5736s = z14 ? C5736s.f34805d : c5920j2.f35320h;
        C9511t c9511t = z14 ? this.f12377e : c5920j2.f35321i;
        List listM9062Y = z14 ? ImmutableList.m9062Y() : c5920j2.f35322j;
        C5920j0 c5920j3 = this.f12361S;
        this.f12361S = new C5920j0(abstractC2382c1, bVar4, j12, j11, i10, exoPlaybackException, false, c5736s, c9511t, listM9062Y, bVar4, c5920j3.f35324l, c5920j3.f35325m, c5920j3.f35326n, j11, 0L, j11, false);
        if (z12) {
            C2469s c2469s = this.f12357O;
            HashMap<C2469s.c, C2469s.b> map = c2469s.f12991f;
            for (C2469s.b bVar5 : map.values()) {
                try {
                    bVar5.f13000a.releaseSource(bVar5.f13001b);
                } catch (RuntimeException e12) {
                    C10145n.m19096d("MediaSourceList", "Failed to release child source.", e12);
                }
                InterfaceC2492i interfaceC2492i = bVar5.f13000a;
                C2469s.a aVar = bVar5.f13002c;
                interfaceC2492i.removeEventListener(aVar);
                bVar5.f13000a.removeDrmEventListener(aVar);
            }
            map.clear();
            c2469s.f12992g.clear();
            c2469s.f12996k = false;
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m7070C() {
        C5943z c5943z = this.f12356N.f12980h;
        this.f12365W = c5943z != null && c5943z.f35381f.f35256h && this.f12364V;
    }

    /* JADX INFO: renamed from: D */
    public final void m7071D(long j10) throws ExoPlaybackException {
        C5943z c5943z = this.f12356N.f12980h;
        long j11 = j10 + (c5943z == null ? 1000000000000L : c5943z.f35390o);
        this.f12382g0 = j11;
        this.f12352J.f12258a.m19162a(j11);
        for (InterfaceC2536y interfaceC2536y : this.f12369a) {
            if (m7067r(interfaceC2536y)) {
                interfaceC2536y.mo7006v(this.f12382g0);
            }
        }
        for (C5943z c5943z2 = r0.f12980h; c5943z2 != null; c5943z2 = c5943z2.f35387l) {
            for (InterfaceC9502k interfaceC9502k : c5943z2.f35389n.f49013c) {
                if (interfaceC9502k != null) {
                    interfaceC9502k.mo7354p();
                }
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m7072E(AbstractC2382c0 abstractC2382c0, AbstractC2382c0 abstractC2382c1) {
        if (abstractC2382c0.m6910p() && abstractC2382c1.m6910p()) {
            return;
        }
        ArrayList<c> arrayList = this.f12353K;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            arrayList.get(size).getClass();
            throw null;
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m7073H(boolean z10) throws ExoPlaybackException {
        InterfaceC2492i.b bVar = this.f12356N.f12980h.f35381f.f35249a;
        long jM7075J = m7075J(bVar, this.f12361S.f35330r, true, false);
        if (jM7075J != this.f12361S.f35330r) {
            C5920j0 c5920j0 = this.f12361S;
            this.f12361S = m7112p(bVar, jM7075J, c5920j0.f35315c, c5920j0.f35316d, z10, 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00a8 A[Catch: all -> 0x0147, TryCatch #1 {all -> 0x0147, blocks: (B:22:0x009e, B:24:0x00a8, B:27:0x00af, B:29:0x00b5, B:30:0x00b8, B:32:0x00bd, B:34:0x00c7, B:36:0x00cd, B:40:0x00d5, B:42:0x00df, B:44:0x00ef, B:48:0x00fa, B:53:0x010e, B:57:0x0117, B:61:0x0122), top: B:77:0x009e }] */
    /* JADX WARN: Code duplicated, block: B:25:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:27:0x00af A[Catch: all -> 0x0147, TryCatch #1 {all -> 0x0147, blocks: (B:22:0x009e, B:24:0x00a8, B:27:0x00af, B:29:0x00b5, B:30:0x00b8, B:32:0x00bd, B:34:0x00c7, B:36:0x00cd, B:40:0x00d5, B:42:0x00df, B:44:0x00ef, B:48:0x00fa, B:53:0x010e, B:57:0x0117, B:61:0x0122), top: B:77:0x009e }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00b5 A[Catch: all -> 0x0147, TryCatch #1 {all -> 0x0147, blocks: (B:22:0x009e, B:24:0x00a8, B:27:0x00af, B:29:0x00b5, B:30:0x00b8, B:32:0x00bd, B:34:0x00c7, B:36:0x00cd, B:40:0x00d5, B:42:0x00df, B:44:0x00ef, B:48:0x00fa, B:53:0x010e, B:57:0x0117, B:61:0x0122), top: B:77:0x009e }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00bd A[Catch: all -> 0x0147, TryCatch #1 {all -> 0x0147, blocks: (B:22:0x009e, B:24:0x00a8, B:27:0x00af, B:29:0x00b5, B:30:0x00b8, B:32:0x00bd, B:34:0x00c7, B:36:0x00cd, B:40:0x00d5, B:42:0x00df, B:44:0x00ef, B:48:0x00fa, B:53:0x010e, B:57:0x0117, B:61:0x0122), top: B:77:0x009e }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00c7 A[Catch: all -> 0x0147, TryCatch #1 {all -> 0x0147, blocks: (B:22:0x009e, B:24:0x00a8, B:27:0x00af, B:29:0x00b5, B:30:0x00b8, B:32:0x00bd, B:34:0x00c7, B:36:0x00cd, B:40:0x00d5, B:42:0x00df, B:44:0x00ef, B:48:0x00fa, B:53:0x010e, B:57:0x0117, B:61:0x0122), top: B:77:0x009e }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00de  */
    /* JADX WARN: Code duplicated, block: B:52:0x010d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0114  */
    /* JADX WARN: Code duplicated, block: B:56:0x0116  */
    /* JADX WARN: Code duplicated, block: B:59:0x011f  */
    /* JADX WARN: Code duplicated, block: B:60:0x0121  */
    /* JADX WARN: Code duplicated, block: B:65:0x012e  */
    /* JADX INFO: renamed from: I */
    public final void m7074I(g gVar) throws Throwable {
        long jLongValue;
        boolean z10;
        InterfaceC2492i.b bVar;
        long j10;
        boolean z11;
        long j11;
        long j12;
        boolean z12;
        C2468r c2468r;
        boolean z13;
        long jM7075J;
        boolean z14;
        long j13;
        C5943z c5943z;
        long jMo7259n;
        C5920j0 c5920j0;
        int i10;
        this.f12362T.m7122a(1);
        Pair<Object, Long> pairM7064F = m7064F(this.f12361S.f35313a, gVar, true, this.f12368Z, this.f12370a0, this.f12389k, this.f12391l);
        long j14 = -9223372036854775807L;
        try {
            if (pairM7064F != null) {
                Object obj = pairM7064F.first;
                jLongValue = ((Long) pairM7064F.second).longValue();
                long j15 = gVar.f12416c == -9223372036854775807L ? -9223372036854775807L : jLongValue;
                InterfaceC2492i.b bVarM7227m = this.f12356N.m7227m(this.f12361S.f35313a, obj, jLongValue);
                if (bVarM7227m.m12079a()) {
                    this.f12361S.f35313a.mo6778g(bVarM7227m.f34757a, this.f12391l);
                    jLongValue = this.f12391l.m6916f(bVarM7227m.f34758b) == bVarM7227m.f34759c ? this.f12391l.f12069g.f13042c : 0L;
                    j10 = j15;
                    bVar = bVarM7227m;
                    z11 = true;
                } else {
                    z10 = gVar.f12416c == -9223372036854775807L;
                    j14 = j15;
                    bVar = bVarM7227m;
                }
                if (this.f12361S.f35313a.m6910p()) {
                    if (pairM7064F == null) {
                        if (this.f12361S.f35317e != 1) {
                            m7087W(4);
                        }
                        m7069B(false, true, false, true);
                    } else {
                        if (bVar.equals(this.f12361S.f35314b)) {
                            c5943z = this.f12356N.f12980h;
                            if (c5943z == null && c5943z.f35379d && jLongValue != 0) {
                                jMo7259n = c5943z.f35376a.mo7259n(jLongValue, this.f12360R);
                            } else {
                                jMo7259n = jLongValue;
                            }
                            if (C10134c0.m19033R(jMo7259n) == C10134c0.m19033R(this.f12361S.f35330r) || !((i10 = (c5920j0 = this.f12361S).f35317e) == 2 || i10 == 3)) {
                                j12 = jMo7259n;
                            } else {
                                j13 = c5920j0.f35330r;
                            }
                        } else {
                            j12 = jLongValue;
                        }
                        if (this.f12361S.f35317e == 4) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        c2468r = this.f12356N;
                        if (c2468r.f12980h != c2468r.f12981i) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        jM7075J = m7075J(bVar, j12, z13, z12);
                        z14 = (jLongValue != jM7075J) | z11;
                        try {
                            C5920j0 c5920j1 = this.f12361S;
                            AbstractC2382c0 abstractC2382c0 = c5920j1.f35313a;
                            m7100e0(abstractC2382c0, bVar, abstractC2382c0, c5920j1.f35314b, j10);
                            z11 = z14;
                            j13 = jM7075J;
                        } catch (Throwable th2) {
                            th = th2;
                            z11 = z14;
                            j11 = jM7075J;
                            this.f12361S = m7112p(bVar, j11, j10, j11, z11, 2);
                            throw th;
                        }
                    }
                    this.f12361S = m7112p(bVar, j13, j10, j13, z11, 2);
                    return;
                }
                this.f12380f0 = gVar;
                j13 = jLongValue;
                this.f12361S = m7112p(bVar, j13, j10, j13, z11, 2);
                return;
            }
            Pair<InterfaceC2492i.b, Long> pairM7105i = m7105i(this.f12361S.f35313a);
            bVar = (InterfaceC2492i.b) pairM7105i.first;
            jLongValue = ((Long) pairM7105i.second).longValue();
            z10 = !this.f12361S.f35313a.m6910p();
            if (this.f12361S.f35313a.m6910p()) {
                if (pairM7064F == null) {
                    if (this.f12361S.f35317e != 1) {
                        m7087W(4);
                    }
                    m7069B(false, true, false, true);
                } else {
                    if (bVar.equals(this.f12361S.f35314b)) {
                        c5943z = this.f12356N.f12980h;
                        if (c5943z == null) {
                            jMo7259n = jLongValue;
                        } else {
                            jMo7259n = jLongValue;
                        }
                        if (C10134c0.m19033R(jMo7259n) == C10134c0.m19033R(this.f12361S.f35330r)) {
                        }
                        j12 = jMo7259n;
                    } else {
                        j12 = jLongValue;
                    }
                    if (this.f12361S.f35317e == 4) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    c2468r = this.f12356N;
                    if (c2468r.f12980h != c2468r.f12981i) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    jM7075J = m7075J(bVar, j12, z13, z12);
                    z14 = (jLongValue != jM7075J) | z11;
                    C5920j0 c5920j2 = this.f12361S;
                    AbstractC2382c0 abstractC2382c1 = c5920j2.f35313a;
                    m7100e0(abstractC2382c1, bVar, abstractC2382c1, c5920j2.f35314b, j10);
                    z11 = z14;
                    j13 = jM7075J;
                }
                this.f12361S = m7112p(bVar, j13, j10, j13, z11, 2);
                return;
            }
            this.f12380f0 = gVar;
            j13 = jLongValue;
            this.f12361S = m7112p(bVar, j13, j10, j13, z11, 2);
            return;
        } catch (Throwable th3) {
            th = th3;
            j11 = jLongValue;
        }
        j10 = j14;
        z11 = z10;
    }

    /* JADX INFO: renamed from: J */
    public final long m7075J(InterfaceC2492i.b bVar, long j10, boolean z10, boolean z11) throws ExoPlaybackException {
        m7094b0();
        this.f12366X = false;
        if (z11 || this.f12361S.f35317e == 3) {
            m7087W(2);
        }
        C2468r c2468r = this.f12356N;
        C5943z c5943z = c2468r.f12980h;
        C5943z c5943z2 = c5943z;
        while (c5943z2 != null && !bVar.equals(c5943z2.f35381f.f35249a)) {
            c5943z2 = c5943z2.f35387l;
        }
        if (z10 || c5943z != c5943z2 || (c5943z2 != null && c5943z2.f35390o + j10 < 0)) {
            InterfaceC2536y[] interfaceC2536yArr = this.f12369a;
            for (InterfaceC2536y interfaceC2536y : interfaceC2536yArr) {
                m7097d(interfaceC2536y);
            }
            if (c5943z2 != null) {
                while (c2468r.f12980h != c5943z2) {
                    c2468r.m7216a();
                }
                c2468r.m7226k(c5943z2);
                c5943z2.f35390o = 1000000000000L;
                m7101f(new boolean[interfaceC2536yArr.length]);
            }
        }
        if (c5943z2 != null) {
            c2468r.m7226k(c5943z2);
            if (!c5943z2.f35379d) {
                c5943z2.f35381f = c5943z2.f35381f.m12322b(j10);
            } else if (c5943z2.f35380e) {
                InterfaceC2480h interfaceC2480h = c5943z2.f35376a;
                j10 = interfaceC2480h.mo7253g(j10);
                interfaceC2480h.mo7255j(this.f12351I, j10 - this.f12350H);
            }
            m7071D(j10);
            m7115t();
        } else {
            c2468r.m7217b();
            m7071D(j10);
        }
        m7108l(false);
        this.f12383h.mo19083i(2);
        return j10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: K */
    public final void m7076K(C2534w c2534w) throws ExoPlaybackException {
        Looper looper = c2534w.f13781f;
        Looper looper2 = this.f12387j;
        InterfaceC10142k interfaceC10142k = this.f12383h;
        if (looper != looper2) {
            interfaceC10142k.mo19085k(15, c2534w).m19164a();
            return;
        }
        synchronized (c2534w) {
        }
        try {
            c2534w.f13776a.mo6889q(c2534w.f13779d, c2534w.f13780e);
            c2534w.m7516b(true);
            int i10 = this.f12361S.f35317e;
            if (i10 != 3 && i10 != 2) {
                return;
            }
            interfaceC10142k.mo19083i(2);
        } catch (Throwable th2) {
            c2534w.m7516b(true);
            throw th2;
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m7077L(C2534w c2534w) {
        Looper looper = c2534w.f13781f;
        if (looper.getThread().isAlive()) {
            this.f12354L.mo19013b(looper, null).mo19079e(new RunnableC5682t(this, 8, c2534w));
        } else {
            C10145n.m19099g("TAG", "Trying to send message on a dead thread.");
            c2534w.m7516b(false);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: N */
    public final void m7078N(boolean z10, AtomicBoolean atomicBoolean) {
        if (this.f12372b0 != z10) {
            this.f12372b0 = z10;
            if (!z10) {
                for (InterfaceC2536y interfaceC2536y : this.f12369a) {
                    if (!m7067r(interfaceC2536y) && this.f12371b.remove(interfaceC2536y)) {
                        interfaceC2536y.mo6994c();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m7079O(a aVar) throws ExoPlaybackException {
        this.f12362T.m7122a(1);
        int i10 = aVar.f12395c;
        InterfaceC5732o interfaceC5732o = aVar.f12394b;
        List<C2469s.c> list = aVar.f12393a;
        if (i10 != -1) {
            this.f12380f0 = new g(new C5922k0(list, interfaceC5732o), aVar.f12395c, aVar.f12396d);
        }
        C2469s c2469s = this.f12357O;
        ArrayList arrayList = c2469s.f12987b;
        c2469s.m7236g(0, arrayList.size());
        m7109m(c2469s.m7230a(arrayList.size(), list, interfaceC5732o), false);
    }

    /* JADX INFO: renamed from: P */
    public final void m7080P(boolean z10) {
        if (z10 == this.f12376d0) {
            return;
        }
        this.f12376d0 = z10;
        if (!z10 && this.f12361S.f35327o) {
            this.f12383h.mo19083i(2);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m7081Q(boolean z10) throws ExoPlaybackException {
        this.f12364V = z10;
        m7070C();
        if (this.f12365W) {
            C2468r c2468r = this.f12356N;
            if (c2468r.f12981i != c2468r.f12980h) {
                m7073H(true);
                m7108l(false);
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m7082R(int i10, int i11, boolean z10, boolean z11) throws ExoPlaybackException {
        this.f12362T.m7122a(z11 ? 1 : 0);
        d dVar = this.f12362T;
        dVar.f12401a = true;
        dVar.f12406f = true;
        dVar.f12407g = i11;
        this.f12361S = this.f12361S.m12338c(i10, z10);
        this.f12366X = false;
        for (C5943z c5943z = this.f12356N.f12980h; c5943z != null; c5943z = c5943z.f35387l) {
            for (InterfaceC9502k interfaceC9502k : c5943z.f35389n.f49013c) {
                if (interfaceC9502k != null) {
                    interfaceC9502k.mo7345g(z10);
                }
            }
        }
        if (!m7088X()) {
            m7094b0();
            m7098d0();
            return;
        }
        int i12 = this.f12361S.f35317e;
        InterfaceC10142k interfaceC10142k = this.f12383h;
        if (i12 == 3) {
            m7090Z();
            interfaceC10142k.mo19083i(2);
        } else if (i12 == 2) {
            interfaceC10142k.mo19083i(2);
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m7083S(C2505u c2505u) throws ExoPlaybackException {
        this.f12383h.mo19084j(16);
        C2411h c2411h = this.f12352J;
        c2411h.setPlaybackParameters(c2505u);
        C2505u playbackParameters = c2411h.getPlaybackParameters();
        m7111o(playbackParameters, playbackParameters.f13474a, true, true);
    }

    /* JADX INFO: renamed from: T */
    public final void m7084T(int i10) throws ExoPlaybackException {
        this.f12368Z = i10;
        AbstractC2382c0 abstractC2382c0 = this.f12361S.f35313a;
        C2468r c2468r = this.f12356N;
        c2468r.f12978f = i10;
        if (!c2468r.m7228n(abstractC2382c0)) {
            m7073H(true);
        }
        m7108l(false);
    }

    /* JADX INFO: renamed from: U */
    public final void m7085U(boolean z10) throws ExoPlaybackException {
        this.f12370a0 = z10;
        AbstractC2382c0 abstractC2382c0 = this.f12361S.f35313a;
        C2468r c2468r = this.f12356N;
        c2468r.f12979g = z10;
        if (!c2468r.m7228n(abstractC2382c0)) {
            m7073H(true);
        }
        m7108l(false);
    }

    /* JADX INFO: renamed from: V */
    public final void m7086V(InterfaceC5732o interfaceC5732o) throws ExoPlaybackException {
        this.f12362T.m7122a(1);
        C2469s c2469s = this.f12357O;
        int size = c2469s.f12987b.size();
        if (interfaceC5732o.mo12080a() != size) {
            interfaceC5732o = interfaceC5732o.mo12087h().mo12085f(0, size);
        }
        c2469s.f12995j = interfaceC5732o;
        m7109m(c2469s.m7231b(), false);
    }

    /* JADX INFO: renamed from: W */
    public final void m7087W(int i10) {
        C5920j0 c5920j0 = this.f12361S;
        if (c5920j0.f35317e != i10) {
            if (i10 != 2) {
                this.f12392l0 = -9223372036854775807L;
            }
            this.f12361S = c5920j0.m12341f(i10);
        }
    }

    /* JADX INFO: renamed from: X */
    public final boolean m7088X() {
        C5920j0 c5920j0 = this.f12361S;
        return c5920j0.f35324l && c5920j0.f35325m == 0;
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m7089Y(AbstractC2382c0 abstractC2382c0, InterfaceC2492i.b bVar) {
        if (bVar.m12079a() || abstractC2382c0.m6910p()) {
            return false;
        }
        int i10 = abstractC2382c0.mo6778g(bVar.f34757a, this.f12391l).f12065c;
        AbstractC2382c0.c cVar = this.f12389k;
        abstractC2382c0.m6908m(i10, cVar);
        return cVar.m6919a() && cVar.f12099i && cVar.f12096f != -9223372036854775807L;
    }

    /* JADX INFO: renamed from: Z */
    public final void m7090Z() throws ExoPlaybackException {
        this.f12366X = false;
        C2411h c2411h = this.f12352J;
        c2411h.f12263f = true;
        C10154w c10154w = c2411h.f12258a;
        if (!c10154w.f51449b) {
            c10154w.f51451d = c10154w.f51448a.mo19015d();
            c10154w.f51449b = true;
        }
        for (InterfaceC2536y interfaceC2536y : this.f12369a) {
            if (m7067r(interfaceC2536y)) {
                interfaceC2536y.start();
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2500q.a
    /* JADX INFO: renamed from: a */
    public final void mo7091a(InterfaceC2500q interfaceC2500q) {
        this.f12383h.mo19085k(9, (InterfaceC2480h) interfaceC2500q).m19164a();
    }

    /* JADX INFO: renamed from: a0 */
    public final void m7092a0(boolean z10, boolean z11) {
        m7069B(z10 || !this.f12372b0, false, true, false);
        this.f12362T.m7122a(z11 ? 1 : 0);
        this.f12379f.mo12332i();
        m7087W(1);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2480h.a
    /* JADX INFO: renamed from: b */
    public final void mo7093b(InterfaceC2480h interfaceC2480h) {
        this.f12383h.mo19085k(8, interfaceC2480h).m19164a();
    }

    /* JADX INFO: renamed from: b0 */
    public final void m7094b0() throws ExoPlaybackException {
        C2411h c2411h = this.f12352J;
        c2411h.f12263f = false;
        C10154w c10154w = c2411h.f12258a;
        if (c10154w.f51449b) {
            c10154w.m19162a(c10154w.mo6886l());
            c10154w.f51449b = false;
        }
        for (InterfaceC2536y interfaceC2536y : this.f12369a) {
            if (m7067r(interfaceC2536y) && interfaceC2536y.getState() == 2) {
                interfaceC2536y.stop();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m7095c(a aVar, int i10) throws ExoPlaybackException {
        this.f12362T.m7122a(1);
        C2469s c2469s = this.f12357O;
        if (i10 == -1) {
            i10 = c2469s.f12987b.size();
        }
        m7109m(c2469s.m7230a(i10, aVar.f12393a, aVar.f12394b), false);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m7096c0() {
        C5943z c5943z = this.f12356N.f12982j;
        boolean z10 = this.f12367Y || (c5943z != null && c5943z.f35376a.isLoading());
        C5920j0 c5920j0 = this.f12361S;
        if (z10 != c5920j0.f35319g) {
            this.f12361S = new C5920j0(c5920j0.f35313a, c5920j0.f35314b, c5920j0.f35315c, c5920j0.f35316d, c5920j0.f35317e, c5920j0.f35318f, z10, c5920j0.f35320h, c5920j0.f35321i, c5920j0.f35322j, c5920j0.f35323k, c5920j0.f35324l, c5920j0.f35325m, c5920j0.f35326n, c5920j0.f35328p, c5920j0.f35329q, c5920j0.f35330r, c5920j0.f35327o);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m7097d(InterfaceC2536y interfaceC2536y) throws ExoPlaybackException {
        if (interfaceC2536y.getState() != 0) {
            C2411h c2411h = this.f12352J;
            if (interfaceC2536y == c2411h.f12260c) {
                c2411h.f12261d = null;
                c2411h.f12260c = null;
                c2411h.f12262e = true;
            }
            if (interfaceC2536y.getState() == 2) {
                interfaceC2536y.stop();
            }
            interfaceC2536y.mo6995f();
            this.f12378e0--;
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00d2  */
    /* JADX INFO: renamed from: d0 */
    public final void m7098d0() throws ExoPlaybackException {
        C2505u playbackParameters;
        C2415l c2415l;
        C2415l c2415l2;
        C2415l c2415l3;
        c cVar;
        float f3;
        C5943z c5943z = this.f12356N.f12980h;
        if (c5943z == null) {
            return;
        }
        long j10 = -9223372036854775807L;
        long jMo7256k = c5943z.f35379d ? c5943z.f35376a.mo7256k() : -9223372036854775807L;
        if (jMo7256k != -9223372036854775807L) {
            m7071D(jMo7256k);
            if (jMo7256k != this.f12361S.f35330r) {
                C5920j0 c5920j0 = this.f12361S;
                this.f12361S = m7112p(c5920j0.f35314b, jMo7256k, c5920j0.f35315c, jMo7256k, true, 5);
            }
            c2415l = this;
            j10 = -9223372036854775807L;
            c2415l2 = c2415l;
        } else {
            C2411h c2411h = this.f12352J;
            boolean z10 = c5943z != this.f12356N.f12981i;
            InterfaceC2536y interfaceC2536y = c2411h.f12260c;
            boolean z11 = interfaceC2536y == null || interfaceC2536y.mo6877d() || (!c2411h.f12260c.mo6879e() && (z10 || c2411h.f12260c.mo6997h()));
            C10154w c10154w = c2411h.f12258a;
            if (z11) {
                c2411h.f12262e = true;
                if (c2411h.f12263f && !c10154w.f51449b) {
                    c10154w.f51451d = c10154w.f51448a.mo19015d();
                    c10154w.f51449b = true;
                }
            } else {
                InterfaceC10146o interfaceC10146o = c2411h.f12261d;
                interfaceC10146o.getClass();
                long jMo6886l = interfaceC10146o.mo6886l();
                if (!c2411h.f12262e) {
                    c10154w.m19162a(jMo6886l);
                    playbackParameters = interfaceC10146o.getPlaybackParameters();
                    if (!playbackParameters.equals(c10154w.f51452e)) {
                        c10154w.setPlaybackParameters(playbackParameters);
                        ((C2415l) c2411h.f12259b).f12383h.mo19085k(16, playbackParameters).m19164a();
                    }
                } else if (jMo6886l >= c10154w.mo6886l()) {
                    c2411h.f12262e = false;
                    if (c2411h.f12263f && !c10154w.f51449b) {
                        c10154w.f51451d = c10154w.f51448a.mo19015d();
                        c10154w.f51449b = true;
                    }
                    c10154w.m19162a(jMo6886l);
                    playbackParameters = interfaceC10146o.getPlaybackParameters();
                    if (!playbackParameters.equals(c10154w.f51452e)) {
                        c10154w.setPlaybackParameters(playbackParameters);
                        ((C2415l) c2411h.f12259b).f12383h.mo19085k(16, playbackParameters).m19164a();
                    }
                } else if (c10154w.f51449b) {
                    c10154w.m19162a(c10154w.mo6886l());
                    c10154w.f51449b = false;
                }
            }
            long jMo6886l2 = c2411h.mo6886l();
            this.f12382g0 = jMo6886l2;
            long j11 = jMo6886l2 - c5943z.f35390o;
            long j12 = this.f12361S.f35330r;
            if (this.f12353K.isEmpty() || this.f12361S.f35314b.m12079a()) {
                c2415l = this;
                j10 = -9223372036854775807L;
                c2415l2 = c2415l;
            } else {
                if (this.f12386i0) {
                    j12--;
                    this.f12386i0 = false;
                }
                C5920j0 c5920j1 = this.f12361S;
                int iMo6774b = c5920j1.f35313a.mo6774b(c5920j1.f35314b.f34757a);
                int iMin = Math.min(this.f12384h0, this.f12353K.size());
                if (iMin > 0) {
                    cVar = this.f12353K.get(iMin - 1);
                    c2415l3 = this;
                    c2415l = c2415l3;
                    c2415l2 = c2415l;
                } else {
                    c2415l2 = this;
                    c2415l = this;
                    c2415l3 = this;
                    cVar = null;
                }
                while (cVar != null) {
                    cVar.getClass();
                    if (iMo6774b >= 0) {
                        if (iMo6774b != 0) {
                            break;
                        }
                        cVar.getClass();
                        if (0 <= j12) {
                            break;
                        }
                    }
                    iMin--;
                    if (iMin > 0) {
                        cVar = c2415l3.f12353K.get(iMin - 1);
                    } else {
                        j10 = j10;
                        c2415l2 = c2415l2;
                        c2415l = c2415l;
                        c2415l3 = c2415l3;
                        cVar = null;
                    }
                }
                c cVar2 = iMin < c2415l3.f12353K.size() ? c2415l3.f12353K.get(iMin) : null;
                if (cVar2 != null) {
                    cVar2.getClass();
                }
                if (cVar2 != null) {
                    cVar2.getClass();
                }
                c2415l3.f12384h0 = iMin;
            }
            c2415l.f12361S.f35330r = j11;
        }
        c2415l.f12361S.f35328p = c2415l.f12356N.f12982j.m12378d();
        C5920j0 c5920j2 = c2415l.f12361S;
        long j13 = c2415l2.f12361S.f35328p;
        C5943z c5943z2 = c2415l2.f12356N.f12982j;
        c5920j2.f35329q = c5943z2 == null ? 0L : Math.max(0L, j13 - (c2415l2.f12382g0 - c5943z2.f35390o));
        C5920j0 c5920j3 = c2415l.f12361S;
        if (c5920j3.f35324l && c5920j3.f35317e == 3 && c2415l.m7089Y(c5920j3.f35313a, c5920j3.f35314b)) {
            C5920j0 c5920j4 = c2415l.f12361S;
            if (c5920j4.f35326n.f13474a == 1.0f) {
                InterfaceC2464o interfaceC2464o = c2415l.f12358P;
                long jM7103g = c2415l.m7103g(c5920j4.f35313a, c5920j4.f35314b.f34757a, c5920j4.f35330r);
                long j14 = c2415l2.f12361S.f35328p;
                C5943z c5943z3 = c2415l2.f12356N.f12982j;
                long jMax = c5943z3 != null ? Math.max(0L, j14 - (c2415l2.f12382g0 - c5943z3.f35390o)) : 0L;
                C2410g c2410g = (C2410g) interfaceC2464o;
                if (c2410g.f12246d == j10) {
                    f3 = 1.0f;
                } else {
                    long j15 = jM7103g - jMax;
                    long j16 = c2410g.f12256n;
                    if (j16 == j10) {
                        c2410g.f12256n = j15;
                        c2410g.f12257o = 0L;
                    } else {
                        float f10 = c2410g.f12245c;
                        float f11 = 1.0f - f10;
                        long jMax2 = Math.max(j15, (long) ((j15 * f11) + (j16 * f10)));
                        c2410g.f12256n = jMax2;
                        c2410g.f12257o = (long) ((f11 * Math.abs(j15 - jMax2)) + (c2410g.f12257o * f10));
                    }
                    if (c2410g.f12255m == j10 || SystemClock.elapsedRealtime() - c2410g.f12255m >= 1000) {
                        c2410g.f12255m = SystemClock.elapsedRealtime();
                        long j17 = (c2410g.f12257o * 3) + c2410g.f12256n;
                        if (c2410g.f12251i > j17) {
                            float fM19026K = C10134c0.m19026K(1000L);
                            long[] jArr = {j17, c2410g.f12248f, c2410g.f12251i - (((long) ((c2410g.f12254l - 1.0f) * fM19026K)) + ((long) ((c2410g.f12252j - 1.0f) * fM19026K)))};
                            long j18 = j17;
                            for (int i10 = 1; i10 < 3; i10++) {
                                long j19 = jArr[i10];
                                if (j19 > j18) {
                                    j18 = j19;
                                }
                            }
                            c2410g.f12251i = j18;
                        } else {
                            long jM19042i = C10134c0.m19042i(jM7103g - ((long) (Math.max(0.0f, c2410g.f12254l - 1.0f) / 1.0E-7f)), c2410g.f12251i, j17);
                            c2410g.f12251i = jM19042i;
                            long j20 = c2410g.f12250h;
                            if (j20 != j10 && jM19042i > j20) {
                                c2410g.f12251i = j20;
                            }
                        }
                        long j21 = jM7103g - c2410g.f12251i;
                        if (Math.abs(j21) < c2410g.f12243a) {
                            c2410g.f12254l = 1.0f;
                        } else {
                            c2410g.f12254l = C10134c0.m19040g((1.0E-7f * j21) + 1.0f, c2410g.f12253k, c2410g.f12252j);
                        }
                        f3 = c2410g.f12254l;
                    } else {
                        f3 = c2410g.f12254l;
                    }
                }
                if (c2415l.f12352J.getPlaybackParameters().f13474a != f3) {
                    C2505u c2505u = new C2505u(f3, c2415l.f12361S.f35326n.f13475b);
                    c2415l.f12383h.mo19084j(16);
                    c2415l.f12352J.setPlaybackParameters(c2505u);
                    c2415l.m7111o(c2415l.f12361S.f35326n, c2415l.f12352J.getPlaybackParameters().f13474a, false, false);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:231:0x0375  */
    /* JADX WARN: Code duplicated, block: B:312:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:35:0x007e  */
    /* JADX WARN: Code duplicated, block: B:399:0x0604  */
    /* JADX WARN: Code duplicated, block: B:57:0x011c  */
    /* JADX INFO: renamed from: e */
    public final void m7099e() throws ExoPlaybackException, IOException {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean zM7114s;
        boolean z13;
        int i10;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        C5943z c5943z;
        C5943z c5943z2;
        InterfaceC2536y[] interfaceC2536yArr;
        long jMo19012a = this.f12354L.mo19012a();
        this.f12383h.mo19084j(2);
        int i11 = 0;
        if (this.f12361S.f35313a.m6910p() || !this.f12357O.f12996k) {
            z10 = true;
        } else {
            C2468r c2468r = this.f12356N;
            long j10 = this.f12382g0;
            C5943z c5943z3 = c2468r.f12982j;
            if (c5943z3 != null) {
                C10129a.m18992d(c5943z3.f35387l == null);
                if (c5943z3.f35379d) {
                    c5943z3.f35376a.mo7262t(j10 - c5943z3.f35390o);
                }
            }
            C2468r c2468r2 = this.f12356N;
            C5943z c5943z4 = c2468r2.f12982j;
            if (c5943z4 == null) {
                z14 = true;
            } else {
                if (!c5943z4.f35381f.f35257i) {
                    if ((c5943z4.f35379d && (!c5943z4.f35380e || c5943z4.f35376a.mo7261r() == Long.MIN_VALUE)) && c2468r2.f12982j.f35381f.f35253e != -9223372036854775807L && c2468r2.f12983k < 100) {
                        z14 = true;
                    }
                }
                z14 = false;
            }
            if (z14) {
                C2468r c2468r3 = this.f12356N;
                long j11 = this.f12382g0;
                C5920j0 c5920j0 = this.f12361S;
                C5943z c5943z5 = c2468r3.f12982j;
                C5902a0 c5902a0M7219d = c5943z5 == null ? c2468r3.m7219d(c5920j0.f35313a, c5920j0.f35314b, c5920j0.f35315c, c5920j0.f35330r) : c2468r3.m7218c(c5920j0.f35313a, c5943z5, j11);
                if (c5902a0M7219d != null) {
                    C2468r c2468r4 = this.f12356N;
                    InterfaceC5924l0[] interfaceC5924l0Arr = this.f12373c;
                    AbstractC9510s abstractC9510s = this.f12375d;
                    C9885j c9885jMo12331h = this.f12379f.mo12331h();
                    C2469s c2469s = this.f12357O;
                    C9511t c9511t = this.f12377e;
                    C5943z c5943z6 = c2468r4.f12982j;
                    C5943z c5943z7 = new C5943z(interfaceC5924l0Arr, c5943z6 == null ? 1000000000000L : (c5943z6.f35390o + c5943z6.f35381f.f35253e) - c5902a0M7219d.f35250b, abstractC9510s, c9885jMo12331h, c2469s, c5902a0M7219d, c9511t);
                    C5943z c5943z8 = c2468r4.f12982j;
                    if (c5943z8 == null) {
                        c2468r4.f12980h = c5943z7;
                        c2468r4.f12981i = c5943z7;
                    } else if (c5943z7 != c5943z8.f35387l) {
                        c5943z8.m12376b();
                        c5943z8.f35387l = c5943z7;
                        c5943z8.m12377c();
                    }
                    c2468r4.f12984l = null;
                    c2468r4.f12982j = c5943z7;
                    z15 = true;
                    c2468r4.f12983k++;
                    c2468r4.m7225j();
                    c5943z7.f35376a.mo7257l(this, c5902a0M7219d.f35250b);
                    if (this.f12356N.f12980h == c5943z7) {
                        m7071D(c5902a0M7219d.f35250b);
                    }
                    m7108l(false);
                } else {
                    z15 = true;
                }
            } else {
                z15 = true;
            }
            if (this.f12367Y) {
                this.f12367Y = m7113q();
                m7096c0();
            } else {
                m7115t();
            }
            C2468r c2468r5 = this.f12356N;
            C5943z c5943z9 = c2468r5.f12981i;
            if (c5943z9 != null) {
                C5943z c5943z10 = c5943z9.f35387l;
                InterfaceC2536y[] interfaceC2536yArr2 = this.f12369a;
                if (c5943z10 != null && !this.f12365W) {
                    if (!c5943z9.f35379d) {
                        z16 = false;
                        break;
                    }
                    int i12 = 0;
                    while (true) {
                        if (i12 >= interfaceC2536yArr2.length) {
                            z16 = z15;
                            break;
                        }
                        InterfaceC2536y interfaceC2536y = interfaceC2536yArr2[i12];
                        InterfaceC5731n interfaceC5731n = c5943z9.f35378c[i12];
                        if (interfaceC2536y.mo7002r() == interfaceC5731n) {
                            if (interfaceC5731n != null && !interfaceC2536y.mo6997h()) {
                                C5943z c5943z11 = c5943z9.f35387l;
                                if (!((c5943z9.f35381f.f35254f && c5943z11.f35379d && ((interfaceC2536y instanceof C6652m) || (interfaceC2536y instanceof C2431a) || interfaceC2536y.mo7005u() >= c5943z11.m12379e())) ? z15 : false)) {
                                }
                            }
                            i12++;
                        }
                        z16 = false;
                        break;
                    }
                    if (z16) {
                        C5943z c5943z12 = c5943z9.f35387l;
                        if (c5943z12.f35379d || this.f12382g0 >= c5943z12.m12379e()) {
                            C9511t c9511t2 = c5943z9.f35389n;
                            C5943z c5943z13 = c2468r5.f12981i;
                            C10129a.m18992d((c5943z13 == null || c5943z13.f35387l == null) ? false : z15);
                            c2468r5.f12981i = c2468r5.f12981i.f35387l;
                            c2468r5.m7225j();
                            C5943z c5943z14 = c2468r5.f12981i;
                            C9511t c9511t3 = c5943z14.f35389n;
                            AbstractC2382c0 abstractC2382c0 = this.f12361S.f35313a;
                            m7100e0(abstractC2382c0, c5943z14.f35381f.f35249a, abstractC2382c0, c5943z9.f35381f.f35249a, -9223372036854775807L);
                            if (!c5943z14.f35379d || c5943z14.f35376a.mo7256k() == -9223372036854775807L) {
                                for (int i13 = 0; i13 < interfaceC2536yArr2.length; i13++) {
                                    boolean zM17977b = c9511t2.m17977b(i13);
                                    boolean zM17977b2 = c9511t3.m17977b(i13);
                                    if (zM17977b && !interfaceC2536yArr2[i13].mo7007w()) {
                                        boolean z19 = ((AbstractC2406e) this.f12373c[i13]).f12220a == -2;
                                        C5926m0 c5926m0 = c9511t2.f49012b[i13];
                                        C5926m0 c5926m1 = c9511t3.f49012b[i13];
                                        if (!zM17977b2 || !c5926m1.equals(c5926m0) || z19) {
                                            m7066M(interfaceC2536yArr2[i13], c5943z14.m12379e());
                                        }
                                    }
                                }
                            } else {
                                long jM12379e = c5943z14.m12379e();
                                for (InterfaceC2536y interfaceC2536y2 : interfaceC2536yArr2) {
                                    if (interfaceC2536y2.mo7002r() != null) {
                                        m7066M(interfaceC2536y2, jM12379e);
                                    }
                                }
                            }
                        }
                    }
                } else if (c5943z9.f35381f.f35257i || this.f12365W) {
                    for (int i14 = 0; i14 < interfaceC2536yArr2.length; i14++) {
                        InterfaceC2536y interfaceC2536y3 = interfaceC2536yArr2[i14];
                        InterfaceC5731n interfaceC5731n2 = c5943z9.f35378c[i14];
                        if (interfaceC5731n2 != null && interfaceC2536y3.mo7002r() == interfaceC5731n2 && interfaceC2536y3.mo6997h()) {
                            long j12 = c5943z9.f35381f.f35253e;
                            m7066M(interfaceC2536y3, (j12 == -9223372036854775807L || j12 == Long.MIN_VALUE) ? -9223372036854775807L : j12 + c5943z9.f35390o);
                        }
                    }
                }
            }
            C2468r c2468r6 = this.f12356N;
            C5943z c5943z15 = c2468r6.f12981i;
            if (c5943z15 == null || c2468r6.f12980h == c5943z15 || c5943z15.f35382g) {
                z17 = true;
            } else {
                C9511t c9511t4 = c5943z15.f35389n;
                int i15 = 0;
                boolean z20 = false;
                while (true) {
                    interfaceC2536yArr = this.f12369a;
                    if (i15 >= interfaceC2536yArr.length) {
                        break;
                    }
                    InterfaceC2536y interfaceC2536y4 = interfaceC2536yArr[i15];
                    if (m7067r(interfaceC2536y4)) {
                        InterfaceC5731n interfaceC5731nMo7002r = interfaceC2536y4.mo7002r();
                        InterfaceC5731n[] interfaceC5731nArr = c5943z15.f35378c;
                        int i16 = interfaceC5731nMo7002r != interfaceC5731nArr[i15] ? 1 : i11;
                        if (!c9511t4.m17977b(i15) || i16 != 0) {
                            if (!interfaceC2536y4.mo7007w()) {
                                InterfaceC9502k interfaceC9502k = c9511t4.f49013c[i15];
                                int length = interfaceC9502k != null ? interfaceC9502k.length() : i11;
                                C2416m[] c2416mArr = new C2416m[length];
                                while (i11 < length) {
                                    c2416mArr[i11] = interfaceC9502k.mo7346h(i11);
                                    i11++;
                                }
                                interfaceC2536y4.mo7004t(c2416mArr, interfaceC5731nArr[i15], c5943z15.m12379e(), c5943z15.f35390o);
                            } else if (interfaceC2536y4.mo6877d()) {
                                m7097d(interfaceC2536y4);
                            } else {
                                z20 = true;
                            }
                        }
                    }
                    i15++;
                    i11 = 0;
                }
                z17 = true;
                if (!z20) {
                    m7101f(new boolean[interfaceC2536yArr.length]);
                }
            }
            boolean z21 = false;
            while (true) {
                boolean zM7088X = m7088X();
                C2468r c2468r7 = this.f12356N;
                if (!((zM7088X && !this.f12365W && (c5943z = c2468r7.f12980h) != null && (c5943z2 = c5943z.f35387l) != null && this.f12382g0 >= c5943z2.m12379e() && c5943z2.f35382g) ? z17 : false)) {
                    break;
                }
                if (z21) {
                    m7116u();
                }
                C5943z c5943zM7216a = c2468r7.m7216a();
                c5943zM7216a.getClass();
                if (this.f12361S.f35314b.f34757a.equals(c5943zM7216a.f35381f.f35249a.f34757a)) {
                    InterfaceC2492i.b bVar = this.f12361S.f35314b;
                    if (bVar.f34758b == -1) {
                        InterfaceC2492i.b bVar2 = c5943zM7216a.f35381f.f35249a;
                        if (bVar2.f34758b != -1 || bVar.f34761e == bVar2.f34761e) {
                            z18 = false;
                        } else {
                            z18 = z17;
                        }
                    } else {
                        z18 = false;
                    }
                } else {
                    z18 = false;
                }
                C5902a0 c5902a0 = c5943zM7216a.f35381f;
                InterfaceC2492i.b bVar3 = c5902a0.f35249a;
                long j13 = c5902a0.f35250b;
                this.f12361S = m7112p(bVar3, j13, c5902a0.f35251c, j13, !z18, 0);
                m7070C();
                m7098d0();
                z21 = z17;
                z17 = z21;
            }
            z10 = z17;
        }
        int i17 = this.f12361S.f35317e;
        if (i17 == z10 || i17 == 4) {
            return;
        }
        C5943z c5943z16 = this.f12356N.f12980h;
        if (c5943z16 == null) {
            this.f12383h.mo19082h(jMo19012a + 10);
            return;
        }
        C0062b.m315V("doSomeWork");
        m7098d0();
        if (c5943z16.f35379d) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            c5943z16.f35376a.mo7255j(this.f12351I, this.f12361S.f35330r - this.f12350H);
            z11 = z10;
            z12 = z11;
            int i18 = 0;
            while (true) {
                InterfaceC2536y[] interfaceC2536yArr3 = this.f12369a;
                if (i18 >= interfaceC2536yArr3.length) {
                    break;
                }
                InterfaceC2536y interfaceC2536y5 = interfaceC2536yArr3[i18];
                if (m7067r(interfaceC2536y5)) {
                    interfaceC2536y5.mo7151p(this.f12382g0, jElapsedRealtime);
                    z12 = (z12 && interfaceC2536y5.mo6877d()) ? z10 : false;
                    boolean z22 = c5943z16.f35378c[i18] != interfaceC2536y5.mo7002r() ? z10 : false;
                    boolean z23 = (z22 || ((z22 || !interfaceC2536y5.mo6997h()) ? false : z10) || interfaceC2536y5.mo6879e() || interfaceC2536y5.mo6877d()) ? z10 : false;
                    z11 = (z11 && z23) ? z10 : false;
                    if (!z23) {
                        interfaceC2536y5.mo7003s();
                    }
                }
                i18++;
            }
        } else {
            c5943z16.f35376a.mo7252f();
            z11 = z10;
            z12 = z11;
        }
        long j14 = c5943z16.f35381f.f35253e;
        boolean z24 = (z12 && c5943z16.f35379d && (j14 == -9223372036854775807L || j14 <= this.f12361S.f35330r)) ? z10 : false;
        if (z24 && this.f12365W) {
            this.f12365W = false;
            m7082R(this.f12361S.f35325m, 5, false, false);
        }
        if (z24 && c5943z16.f35381f.f35257i) {
            m7087W(4);
            m7094b0();
        } else {
            C5920j0 c5920j1 = this.f12361S;
            if (c5920j1.f35317e == 2) {
                if (this.f12378e0 == 0) {
                    zM7114s = m7114s();
                    z11 = z11;
                } else {
                    if (z11) {
                        if (c5920j1.f35319g) {
                            AbstractC2382c0 abstractC2382c1 = c5920j1.f35313a;
                            C2468r c2468r8 = this.f12356N;
                            long j15 = m7089Y(abstractC2382c1, c2468r8.f12980h.f35381f.f35249a) ? ((C2410g) this.f12358P).f12251i : -9223372036854775807L;
                            C5943z c5943z17 = c2468r8.f12982j;
                            boolean z25 = (((!c5943z17.f35379d || (c5943z17.f35380e && (c5943z17.f35376a.mo7261r() > Long.MIN_VALUE ? 1 : (c5943z17.f35376a.mo7261r() == Long.MIN_VALUE ? 0 : -1)) != 0)) ? false : z10) && c5943z17.f35381f.f35257i) ? z10 : false;
                            boolean z26 = (!c5943z17.f35381f.f35249a.m12079a() || c5943z17.f35379d) ? false : z10;
                            if (z25 || z26) {
                                z11 = z11;
                            } else {
                                InterfaceC5942y interfaceC5942y = this.f12379f;
                                long j16 = this.f12361S.f35328p;
                                C5943z c5943z18 = this.f12356N.f12982j;
                                if (interfaceC5942y.mo12330g(c5943z18 == null ? 0L : Math.max(0L, j16 - (this.f12382g0 - c5943z18.f35390o)), this.f12352J.getPlaybackParameters().f13474a, this.f12366X, j15)) {
                                }
                            }
                        } else {
                            z11 = z11;
                        }
                        zM7114s = z10;
                    } else {
                        z11 = z11;
                    }
                    zM7114s = false;
                }
                if (zM7114s) {
                    m7087W(3);
                    this.f12388j0 = null;
                    if (m7088X()) {
                        m7090Z();
                    }
                }
            } else {
                z11 = z11;
            }
            if (this.f12361S.f35317e == 3 && (this.f12378e0 != 0 ? !z11 : !m7114s())) {
                this.f12366X = m7088X();
                m7087W(2);
                if (this.f12366X) {
                    for (C5943z c5943z19 = this.f12356N.f12980h; c5943z19 != null; c5943z19 = c5943z19.f35387l) {
                        for (InterfaceC9502k interfaceC9502k2 : c5943z19.f35389n.f49013c) {
                            if (interfaceC9502k2 != null) {
                                interfaceC9502k2.mo7356r();
                            }
                        }
                    }
                    C2410g c2410g = (C2410g) this.f12358P;
                    long j17 = c2410g.f12251i;
                    if (j17 != -9223372036854775807L) {
                        long j18 = j17 + c2410g.f12244b;
                        c2410g.f12251i = j18;
                        long j19 = c2410g.f12250h;
                        if (j19 != -9223372036854775807L && j18 > j19) {
                            c2410g.f12251i = j19;
                        }
                        c2410g.f12255m = -9223372036854775807L;
                    }
                }
                m7094b0();
            }
        }
        if (this.f12361S.f35317e == 2) {
            int i19 = 0;
            while (true) {
                InterfaceC2536y[] interfaceC2536yArr4 = this.f12369a;
                if (i19 >= interfaceC2536yArr4.length) {
                    break;
                }
                if (m7067r(interfaceC2536yArr4[i19]) && this.f12369a[i19].mo7002r() == c5943z16.f35378c[i19]) {
                    this.f12369a[i19].mo7003s();
                }
                i19++;
            }
            C5920j0 c5920j2 = this.f12361S;
            if (c5920j2.f35319g || c5920j2.f35329q >= 500000 || !m7113q()) {
                z13 = false;
            } else {
                z13 = z10;
            }
        } else {
            z13 = false;
        }
        if (!z13) {
            this.f12392l0 = -9223372036854775807L;
        } else if (this.f12392l0 == -9223372036854775807L) {
            this.f12392l0 = this.f12354L.mo19015d();
        } else if (this.f12354L.mo19015d() - this.f12392l0 >= 4000) {
            throw new IllegalStateException("Playback stuck buffering and not loading");
        }
        boolean z27 = (m7088X() && this.f12361S.f35317e == 3) ? z10 : false;
        if (!this.f12376d0 || !this.f12374c0 || !z27) {
            z10 = false;
        }
        C5920j0 c5920j3 = this.f12361S;
        if (c5920j3.f35327o != z10) {
            this.f12361S = new C5920j0(c5920j3.f35313a, c5920j3.f35314b, c5920j3.f35315c, c5920j3.f35316d, c5920j3.f35317e, c5920j3.f35318f, c5920j3.f35319g, c5920j3.f35320h, c5920j3.f35321i, c5920j3.f35322j, c5920j3.f35323k, c5920j3.f35324l, c5920j3.f35325m, c5920j3.f35326n, c5920j3.f35328p, c5920j3.f35329q, c5920j3.f35330r, z10);
        }
        this.f12374c0 = false;
        if (!z10 && (i10 = this.f12361S.f35317e) != 4) {
            if (z27 || i10 == 2) {
                this.f12383h.mo19082h(jMo19012a + 10);
            } else if (i10 == 3 && this.f12378e0 != 0) {
                this.f12383h.mo19082h(jMo19012a + 1000);
            }
        }
        C0062b.m283K0();
    }

    /* JADX INFO: renamed from: e0 */
    public final void m7100e0(AbstractC2382c0 abstractC2382c0, InterfaceC2492i.b bVar, AbstractC2382c0 abstractC2382c1, InterfaceC2492i.b bVar2, long j10) throws ExoPlaybackException {
        if (!m7089Y(abstractC2382c0, bVar)) {
            C2505u c2505u = bVar.m12079a() ? C2505u.f13473d : this.f12361S.f35326n;
            C2411h c2411h = this.f12352J;
            if (!c2411h.getPlaybackParameters().equals(c2505u)) {
                this.f12383h.mo19084j(16);
                c2411h.setPlaybackParameters(c2505u);
                m7111o(this.f12361S.f35326n, c2505u.f13474a, false, false);
            }
            return;
        }
        Object obj = bVar.f34757a;
        AbstractC2382c0.b bVar3 = this.f12391l;
        int i10 = abstractC2382c0.mo6778g(obj, bVar3).f12065c;
        AbstractC2382c0.c cVar = this.f12389k;
        abstractC2382c0.m6908m(i10, cVar);
        C2466p.e eVar = cVar.f12101k;
        C2410g c2410g = (C2410g) this.f12358P;
        c2410g.getClass();
        c2410g.f12246d = C10134c0.m19026K(eVar.f12830a);
        c2410g.f12249g = C10134c0.m19026K(eVar.f12831b);
        c2410g.f12250h = C10134c0.m19026K(eVar.f12832c);
        float f3 = eVar.f12833d;
        if (f3 == -3.4028235E38f) {
            f3 = 0.97f;
        }
        c2410g.f12253k = f3;
        float f10 = eVar.f12834e;
        if (f10 == -3.4028235E38f) {
            f10 = 1.03f;
        }
        c2410g.f12252j = f10;
        if (f3 == 1.0f && f10 == 1.0f) {
            c2410g.f12246d = -9223372036854775807L;
        }
        c2410g.m7015a();
        if (j10 != -9223372036854775807L) {
            c2410g.f12247e = m7103g(abstractC2382c0, obj, j10);
            c2410g.m7015a();
            return;
        }
        if (C10134c0.m19034a(!abstractC2382c1.m6910p() ? abstractC2382c1.m6908m(abstractC2382c1.mo6778g(bVar2.f34757a, bVar3).f12065c, cVar).f12091a : null, cVar.f12091a)) {
            return;
        }
        c2410g.f12247e = -9223372036854775807L;
        c2410g.m7015a();
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00e7  */
    /* JADX INFO: renamed from: f */
    public final void m7101f(boolean[] zArr) throws ExoPlaybackException {
        InterfaceC2536y[] interfaceC2536yArr;
        Set<InterfaceC2536y> set;
        InterfaceC2536y[] interfaceC2536yArr2;
        InterfaceC10146o interfaceC10146o;
        C2468r c2468r = this.f12356N;
        C5943z c5943z = c2468r.f12981i;
        C9511t c9511t = c5943z.f35389n;
        int i10 = 0;
        while (true) {
            interfaceC2536yArr = this.f12369a;
            int length = interfaceC2536yArr.length;
            set = this.f12371b;
            if (i10 >= length) {
                break;
            }
            if (!c9511t.m17977b(i10) && set.remove(interfaceC2536yArr[i10])) {
                interfaceC2536yArr[i10].mo6994c();
            }
            i10++;
        }
        int i11 = 0;
        while (i11 < interfaceC2536yArr.length) {
            if (c9511t.m17977b(i11)) {
                boolean z10 = zArr[i11];
                InterfaceC2536y interfaceC2536y = interfaceC2536yArr[i11];
                if (m7067r(interfaceC2536y)) {
                    interfaceC2536yArr2 = interfaceC2536yArr;
                } else {
                    C5943z c5943z2 = c2468r.f12981i;
                    boolean z11 = c5943z2 == c2468r.f12980h;
                    C9511t c9511t2 = c5943z2.f35389n;
                    C5926m0 c5926m0 = c9511t2.f49012b[i11];
                    InterfaceC9502k interfaceC9502k = c9511t2.f49013c[i11];
                    int length2 = interfaceC9502k != null ? interfaceC9502k.length() : 0;
                    C2416m[] c2416mArr = new C2416m[length2];
                    for (int i12 = 0; i12 < length2; i12++) {
                        c2416mArr[i12] = interfaceC9502k.mo7346h(i12);
                    }
                    boolean z12 = m7088X() && this.f12361S.f35317e == 3;
                    boolean z13 = !z10 && z12;
                    this.f12378e0++;
                    set.add(interfaceC2536y);
                    interfaceC2536yArr2 = interfaceC2536yArr;
                    interfaceC2536y.mo7000n(c5926m0, c2416mArr, c5943z2.f35378c[i11], this.f12382g0, z13, z11, c5943z2.m12379e(), c5943z2.f35390o);
                    interfaceC2536y.mo6889q(11, new C2414k(this));
                    C2411h c2411h = this.f12352J;
                    c2411h.getClass();
                    InterfaceC10146o interfaceC10146oMo6892x = interfaceC2536y.mo6892x();
                    if (interfaceC10146oMo6892x != null && interfaceC10146oMo6892x != (interfaceC10146o = c2411h.f12261d)) {
                        if (interfaceC10146o != null) {
                            throw new ExoPlaybackException(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
                        }
                        c2411h.f12261d = interfaceC10146oMo6892x;
                        c2411h.f12260c = interfaceC2536y;
                        interfaceC10146oMo6892x.setPlaybackParameters(c2411h.f12258a.f51452e);
                    }
                    if (z12) {
                        interfaceC2536y.start();
                    }
                }
            } else {
                interfaceC2536yArr2 = interfaceC2536yArr;
            }
            i11++;
            interfaceC2536yArr = interfaceC2536yArr2;
        }
        c5943z.f35382g = true;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: f0 */
    public final synchronized void m7102f0(InterfaceC10177i<Boolean> interfaceC10177i, long j10) {
        long jMo19015d = this.f12354L.mo19015d() + j10;
        boolean z10 = false;
        while (!interfaceC10177i.get().booleanValue() && j10 > 0) {
            try {
                this.f12354L.mo19014c();
                wait(j10);
            } catch (InterruptedException unused) {
                z10 = true;
            }
            j10 = jMo19015d - this.f12354L.mo19015d();
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: renamed from: g */
    public final long m7103g(AbstractC2382c0 abstractC2382c0, Object obj, long j10) {
        AbstractC2382c0.b bVar = this.f12391l;
        int i10 = abstractC2382c0.mo6778g(obj, bVar).f12065c;
        AbstractC2382c0.c cVar = this.f12389k;
        abstractC2382c0.m6908m(i10, cVar);
        if (cVar.f12096f == -9223372036854775807L || !cVar.m6919a() || !cVar.f12099i) {
            return -9223372036854775807L;
        }
        long j11 = cVar.f12097g;
        return C10134c0.m19026K((j11 == -9223372036854775807L ? System.currentTimeMillis() : j11 + SystemClock.elapsedRealtime()) - cVar.f12096f) - (j10 + bVar.f12067e);
    }

    /* JADX INFO: renamed from: h */
    public final long m7104h() {
        C5943z c5943z = this.f12356N.f12981i;
        if (c5943z == null) {
            return 0L;
        }
        long jMax = c5943z.f35390o;
        if (!c5943z.f35379d) {
            return jMax;
        }
        int i10 = 0;
        while (true) {
            InterfaceC2536y[] interfaceC2536yArr = this.f12369a;
            if (i10 >= interfaceC2536yArr.length) {
                return jMax;
            }
            if (m7067r(interfaceC2536yArr[i10]) && interfaceC2536yArr[i10].mo7002r() == c5943z.f35378c[i10]) {
                long jMo7005u = interfaceC2536yArr[i10].mo7005u();
                if (jMo7005u == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jMax = Math.max(jMo7005u, jMax);
            }
            i10++;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        int i10;
        C5943z c5943z;
        int i11 = 1000;
        try {
            switch (message.what) {
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    m7119x();
                    break;
                case 1:
                    m7082R(message.arg2, 1, message.arg1 != 0, true);
                    break;
                case 2:
                    m7099e();
                    break;
                case 3:
                    m7074I((g) message.obj);
                    break;
                case 4:
                    m7083S((C2505u) message.obj);
                    break;
                case 5:
                    this.f12360R = (C5930o0) message.obj;
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    m7092a0(false, true);
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    m7120y();
                    return true;
                case 8:
                    m7110n((InterfaceC2480h) message.obj);
                    break;
                case 9:
                    m7106j((InterfaceC2480h) message.obj);
                    break;
                case 10:
                    m7068A();
                    break;
                case 11:
                    m7084T(message.arg1);
                    break;
                case 12:
                    m7085U(message.arg1 != 0);
                    break;
                case 13:
                    m7078N(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    C2534w c2534w = (C2534w) message.obj;
                    c2534w.getClass();
                    m7076K(c2534w);
                    break;
                case 15:
                    m7077L((C2534w) message.obj);
                    break;
                case 16:
                    C2505u c2505u = (C2505u) message.obj;
                    m7111o(c2505u, c2505u.f13474a, true, false);
                    break;
                case 17:
                    m7079O((a) message.obj);
                    break;
                case 18:
                    m7095c((a) message.obj, message.arg1);
                    break;
                case 19:
                    m7118w((b) message.obj);
                    break;
                case 20:
                    m7121z(message.arg1, message.arg2, (InterfaceC5732o) message.obj);
                    break;
                case 21:
                    m7086V((InterfaceC5732o) message.obj);
                    break;
                case 22:
                    m7117v();
                    break;
                case 23:
                    m7081Q(message.arg1 != 0);
                    break;
                case 24:
                    m7080P(message.arg1 == 1);
                    break;
                case 25:
                    m7073H(true);
                    break;
                default:
                    return false;
            }
        } catch (ExoPlaybackException e10) {
            e = e10;
            if (e.f11790c == 1 && (c5943z = this.f12356N.f12981i) != null) {
                e = e.m6767a(c5943z.f35381f.f35249a);
            }
            if (e.f11796i && this.f12388j0 == null) {
                C10145n.m19100h("ExoPlayerImplInternal", "Recoverable renderer error", e);
                this.f12388j0 = e;
                InterfaceC10142k interfaceC10142k = this.f12383h;
                interfaceC10142k.mo19077c(interfaceC10142k.mo19085k(25, e));
            } else {
                ExoPlaybackException exoPlaybackException = this.f12388j0;
                if (exoPlaybackException != null) {
                    exoPlaybackException.addSuppressed(e);
                    e = this.f12388j0;
                }
                C10145n.m19096d("ExoPlayerImplInternal", "Playback error", e);
                m7092a0(true, false);
                this.f12361S = this.f12361S.m12339d(e);
            }
        } catch (ParserException e11) {
            boolean z10 = e11.f11817a;
            int i12 = e11.f11818b;
            if (i12 == 1) {
                i10 = z10 ? 3001 : 3003;
            } else {
                if (i12 == 4) {
                    i10 = z10 ? 3002 : 3004;
                }
                m7107k(e11, i11);
            }
            i11 = i10;
            m7107k(e11, i11);
        } catch (DrmSession.DrmSessionException e12) {
            m7107k(e12, e12.f12195a);
        } catch (BehindLiveWindowException e13) {
            m7107k(e13, 1002);
        } catch (DataSourceException e14) {
            m7107k(e14, e14.f13686a);
        } catch (IOException e15) {
            m7107k(e15, 2000);
        } catch (RuntimeException e16) {
            ExoPlaybackException exoPlaybackException2 = new ExoPlaybackException(2, e16, ((e16 instanceof IllegalStateException) || (e16 instanceof IllegalArgumentException)) ? 1004 : 1000);
            C10145n.m19096d("ExoPlayerImplInternal", "Playback error", exoPlaybackException2);
            m7092a0(true, false);
            this.f12361S = this.f12361S.m12339d(exoPlaybackException2);
        }
        m7116u();
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final Pair<InterfaceC2492i.b, Long> m7105i(AbstractC2382c0 abstractC2382c0) {
        if (abstractC2382c0.m6910p()) {
            return Pair.create(C5920j0.f35312s, 0L);
        }
        Pair<Object, Long> pairM6906i = abstractC2382c0.m6906i(this.f12389k, this.f12391l, abstractC2382c0.mo6773a(this.f12370a0), -9223372036854775807L);
        InterfaceC2492i.b bVarM7227m = this.f12356N.m7227m(abstractC2382c0, pairM6906i.first, 0L);
        long jLongValue = ((Long) pairM6906i.second).longValue();
        if (bVarM7227m.m12079a()) {
            Object obj = bVarM7227m.f34757a;
            AbstractC2382c0.b bVar = this.f12391l;
            abstractC2382c0.mo6778g(obj, bVar);
            jLongValue = bVarM7227m.f34759c == bVar.m6916f(bVarM7227m.f34758b) ? bVar.f12069g.f13042c : 0L;
        }
        return Pair.create(bVarM7227m, Long.valueOf(jLongValue));
    }

    /* JADX INFO: renamed from: j */
    public final void m7106j(InterfaceC2480h interfaceC2480h) {
        C5943z c5943z = this.f12356N.f12982j;
        boolean z10 = true;
        if (c5943z != null && c5943z.f35376a == interfaceC2480h) {
            long j10 = this.f12382g0;
            if (c5943z != null) {
                if (c5943z.f35387l != null) {
                    z10 = false;
                }
                C10129a.m18992d(z10);
                if (c5943z.f35379d) {
                    c5943z.f35376a.mo7262t(j10 - c5943z.f35390o);
                }
            }
            m7115t();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m7107k(IOException iOException, int i10) {
        ExoPlaybackException exoPlaybackException = new ExoPlaybackException(0, iOException, i10);
        C5943z c5943z = this.f12356N.f12980h;
        if (c5943z != null) {
            exoPlaybackException = exoPlaybackException.m6767a(c5943z.f35381f.f35249a);
        }
        C10145n.m19096d("ExoPlayerImplInternal", "Playback error", exoPlaybackException);
        m7092a0(false, false);
        this.f12361S = this.f12361S.m12339d(exoPlaybackException);
    }

    /* JADX INFO: renamed from: l */
    public final void m7108l(boolean z10) {
        C5943z c5943z = this.f12356N.f12982j;
        InterfaceC2492i.b bVar = c5943z == null ? this.f12361S.f35314b : c5943z.f35381f.f35249a;
        boolean z11 = !this.f12361S.f35323k.equals(bVar);
        if (z11) {
            this.f12361S = this.f12361S.m12336a(bVar);
        }
        C5920j0 c5920j0 = this.f12361S;
        c5920j0.f35328p = c5943z == null ? c5920j0.f35330r : c5943z.m12378d();
        C5920j0 c5920j1 = this.f12361S;
        long j10 = c5920j1.f35328p;
        C5943z c5943z2 = this.f12356N.f12982j;
        c5920j1.f35329q = c5943z2 != null ? Math.max(0L, j10 - (this.f12382g0 - c5943z2.f35390o)) : 0L;
        if (z11 || z10) {
            if (c5943z != null && c5943z.f35379d) {
                this.f12379f.mo12327d(this.f12369a, c5943z.f35389n.f49013c);
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v47 ??, still in use, count: 1, list:
          (r0v47 ?? I:??[OBJECT, ARRAY]) from 0x0039: MOVE (r7v26 ?? I:??[OBJECT, ARRAY]) = (r0v47 ?? I:??[OBJECT, ARRAY])
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    /* JADX INFO: renamed from: m */
    public final void m7109m(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v47 ??, still in use, count: 1, list:
          (r0v47 ?? I:??[OBJECT, ARRAY]) from 0x0039: MOVE (r7v26 ?? I:??[OBJECT, ARRAY]) = (r0v47 ?? I:??[OBJECT, ARRAY])
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r38v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    /* JADX INFO: renamed from: n */
    public final void m7110n(InterfaceC2480h interfaceC2480h) throws ExoPlaybackException {
        C2468r c2468r = this.f12356N;
        C5943z c5943z = c2468r.f12982j;
        if (c5943z != null && c5943z.f35376a == interfaceC2480h) {
            float f3 = this.f12352J.getPlaybackParameters().f13474a;
            AbstractC2382c0 abstractC2382c0 = this.f12361S.f35313a;
            c5943z.f35379d = true;
            c5943z.f35388m = c5943z.f35376a.mo7258m();
            C9511t c9511tM12381g = c5943z.m12381g(f3, abstractC2382c0);
            C5902a0 c5902a0 = c5943z.f35381f;
            long jMax = c5902a0.f35250b;
            long j10 = c5902a0.f35253e;
            if (j10 != -9223372036854775807L && jMax >= j10) {
                jMax = Math.max(0L, j10 - 1);
            }
            long jM12375a = c5943z.m12375a(c9511tM12381g, jMax, false, new boolean[c5943z.f35384i.length]);
            long j11 = c5943z.f35390o;
            C5902a0 c5902a1 = c5943z.f35381f;
            c5943z.f35390o = (c5902a1.f35250b - jM12375a) + j11;
            c5943z.f35381f = c5902a1.m12322b(jM12375a);
            InterfaceC9502k[] interfaceC9502kArr = c5943z.f35389n.f49013c;
            InterfaceC5942y interfaceC5942y = this.f12379f;
            InterfaceC2536y[] interfaceC2536yArr = this.f12369a;
            interfaceC5942y.mo12327d(interfaceC2536yArr, interfaceC9502kArr);
            if (c5943z == c2468r.f12980h) {
                m7071D(c5943z.f35381f.f35250b);
                m7101f(new boolean[interfaceC2536yArr.length]);
                C5920j0 c5920j0 = this.f12361S;
                InterfaceC2492i.b bVar = c5920j0.f35314b;
                long j12 = c5943z.f35381f.f35250b;
                this.f12361S = m7112p(bVar, j12, c5920j0.f35315c, j12, false, 5);
            }
            m7115t();
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m7111o(C2505u c2505u, float f3, boolean z10, boolean z11) throws ExoPlaybackException {
        int i10;
        if (z10) {
            if (z11) {
                this.f12362T.m7122a(1);
            }
            this.f12361S = this.f12361S.m12340e(c2505u);
        }
        float f10 = c2505u.f13474a;
        C5943z c5943z = this.f12356N.f12980h;
        while (true) {
            i10 = 0;
            if (c5943z == null) {
                break;
            }
            InterfaceC9502k[] interfaceC9502kArr = c5943z.f35389n.f49013c;
            int length = interfaceC9502kArr.length;
            while (i10 < length) {
                InterfaceC9502k interfaceC9502k = interfaceC9502kArr[i10];
                if (interfaceC9502k != null) {
                    interfaceC9502k.mo7352n(f10);
                }
                i10++;
            }
            c5943z = c5943z.f35387l;
        }
        InterfaceC2536y[] interfaceC2536yArr = this.f12369a;
        int length2 = interfaceC2536yArr.length;
        while (i10 < length2) {
            InterfaceC2536y interfaceC2536y = interfaceC2536yArr[i10];
            if (interfaceC2536y != null) {
                interfaceC2536y.mo7148m(f3, c2505u.f13474a);
            }
            i10++;
        }
    }

    /* JADX INFO: renamed from: p */
    public final C5920j0 m7112p(InterfaceC2492i.b bVar, long j10, long j11, long j12, boolean z10, int i10) {
        C5736s c5736s;
        C9511t c9511t;
        List<Metadata> listM9062Y;
        this.f12386i0 = (!this.f12386i0 && j10 == this.f12361S.f35330r && bVar.equals(this.f12361S.f35314b)) ? false : true;
        m7070C();
        C5920j0 c5920j0 = this.f12361S;
        C5736s c5736s2 = c5920j0.f35320h;
        C9511t c9511t2 = c5920j0.f35321i;
        List<Metadata> list = c5920j0.f35322j;
        if (this.f12357O.f12996k) {
            C5943z c5943z = this.f12356N.f12980h;
            C5736s c5736s3 = c5943z == null ? C5736s.f34805d : c5943z.f35388m;
            C9511t c9511t3 = c5943z == null ? this.f12377e : c5943z.f35389n;
            InterfaceC9502k[] interfaceC9502kArr = c9511t3.f49013c;
            ImmutableList.C3146a c3146a = new ImmutableList.C3146a();
            boolean z11 = false;
            for (InterfaceC9502k interfaceC9502k : interfaceC9502kArr) {
                if (interfaceC9502k != null) {
                    Metadata metadata = interfaceC9502k.mo7346h(0).f12482j;
                    if (metadata == null) {
                        c3146a.m9055b(new Metadata(new Metadata.Entry[0]));
                    } else {
                        c3146a.m9055b(metadata);
                        z11 = true;
                    }
                }
            }
            ImmutableList immutableListM9068e = z11 ? c3146a.m9068e() : ImmutableList.m9062Y();
            if (c5943z != null) {
                C5902a0 c5902a0 = c5943z.f35381f;
                if (c5902a0.f35251c != j11) {
                    c5943z.f35381f = c5902a0.m12321a(j11);
                }
            }
            listM9062Y = immutableListM9068e;
            c5736s = c5736s3;
            c9511t = c9511t3;
        } else if (bVar.equals(c5920j0.f35314b)) {
            c5736s = c5736s2;
            c9511t = c9511t2;
            listM9062Y = list;
        } else {
            c5736s = C5736s.f34805d;
            c9511t = this.f12377e;
            listM9062Y = ImmutableList.m9062Y();
        }
        if (z10) {
            d dVar = this.f12362T;
            if (!dVar.f12404d || dVar.f12405e == 5) {
                dVar.f12401a = true;
                dVar.f12404d = true;
                dVar.f12405e = i10;
            } else {
                C10129a.m18990b(i10 == 5);
            }
        }
        C5920j0 c5920j1 = this.f12361S;
        long j13 = c5920j1.f35328p;
        C5943z c5943z2 = this.f12356N.f12982j;
        return c5920j1.m12337b(bVar, j10, j11, j12, c5943z2 == null ? 0L : Math.max(0L, j13 - (this.f12382g0 - c5943z2.f35390o)), c5736s, c9511t, listM9062Y);
    }

    /* JADX INFO: renamed from: q */
    public final boolean m7113q() {
        C5943z c5943z = this.f12356N.f12982j;
        if (c5943z == null) {
            return false;
        }
        return (!c5943z.f35379d ? 0L : c5943z.f35376a.mo7251d()) != Long.MIN_VALUE;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m7114s() {
        C5943z c5943z = this.f12356N.f12980h;
        long j10 = c5943z.f35381f.f35253e;
        if (!c5943z.f35379d || (j10 != -9223372036854775807L && this.f12361S.f35330r >= j10 && m7088X())) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: t */
    public final void m7115t() {
        boolean zMo12328e;
        if (m7113q()) {
            C5943z c5943z = this.f12356N.f12982j;
            long jMo7251d = !c5943z.f35379d ? 0L : c5943z.f35376a.mo7251d();
            C5943z c5943z2 = this.f12356N.f12982j;
            long jMax = c5943z2 == null ? 0L : Math.max(0L, jMo7251d - (this.f12382g0 - c5943z2.f35390o));
            if (c5943z != this.f12356N.f12980h) {
                long j10 = c5943z.f35381f.f35250b;
            }
            zMo12328e = this.f12379f.mo12328e(jMax, this.f12352J.getPlaybackParameters().f13474a);
            if (!zMo12328e && jMax < 500000 && (this.f12350H > 0 || this.f12351I)) {
                this.f12356N.f12980h.f35376a.mo7255j(false, this.f12361S.f35330r);
                zMo12328e = this.f12379f.mo12328e(jMax, this.f12352J.getPlaybackParameters().f13474a);
            }
        } else {
            zMo12328e = false;
        }
        this.f12367Y = zMo12328e;
        if (zMo12328e) {
            C5943z c5943z3 = this.f12356N.f12982j;
            long j11 = this.f12382g0;
            C10129a.m18992d(c5943z3.f35387l == null);
            c5943z3.f35376a.mo7254h(j11 - c5943z3.f35390o);
        }
        m7096c0();
    }

    /* JADX INFO: renamed from: u */
    public final void m7116u() {
        d dVar = this.f12362T;
        C5920j0 c5920j0 = this.f12361S;
        boolean z10 = dVar.f12401a | (dVar.f12402b != c5920j0);
        dVar.f12401a = z10;
        dVar.f12402b = c5920j0;
        if (z10) {
            C2413j c2413j = (C2413j) ((C5509a) this.f12355M).f34148b;
            int i10 = C2413j.f12267x0;
            c2413j.getClass();
            c2413j.f12309i.mo19079e(new RunnableC5682t(c2413j, 7, dVar));
            this.f12362T = new d(this.f12361S);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m7117v() throws ExoPlaybackException {
        m7109m(this.f12357O.m7231b(), true);
    }

    /* JADX INFO: renamed from: w */
    public final void m7118w(b bVar) throws ExoPlaybackException {
        AbstractC2382c0 abstractC2382c0M7231b;
        this.f12362T.m7122a(1);
        int i10 = bVar.f12397a;
        C2469s c2469s = this.f12357O;
        c2469s.getClass();
        ArrayList arrayList = c2469s.f12987b;
        int i11 = bVar.f12398b;
        int i12 = bVar.f12399c;
        C10129a.m18990b(i10 >= 0 && i10 <= i11 && i11 <= arrayList.size() && i12 >= 0);
        c2469s.f12995j = bVar.f12400d;
        if (i10 == i11 || i10 == i12) {
            abstractC2382c0M7231b = c2469s.m7231b();
        } else {
            int iMin = Math.min(i10, i12);
            int iMax = Math.max(((i11 - i10) + i12) - 1, i11 - 1);
            int iMo6909o = ((C2469s.c) arrayList.get(iMin)).f13006d;
            C10134c0.m19025J(arrayList, i10, i11, i12);
            while (iMin <= iMax) {
                C2469s.c cVar = (C2469s.c) arrayList.get(iMin);
                cVar.f13006d = iMo6909o;
                iMo6909o += cVar.f13003a.f13113h.mo6909o();
                iMin++;
            }
            abstractC2382c0M7231b = c2469s.m7231b();
        }
        m7109m(abstractC2382c0M7231b, false);
    }

    /* JADX INFO: renamed from: x */
    public final void m7119x() {
        this.f12362T.m7122a(1);
        int i10 = 0;
        m7069B(false, false, false, true);
        this.f12379f.mo12326c();
        m7087W(this.f12361S.f35313a.m6910p() ? 4 : 2);
        C9887l c9887lMo18373g = this.f12381g.mo18373g();
        C2469s c2469s = this.f12357O;
        C10129a.m18992d(!c2469s.f12996k);
        c2469s.f12997l = c9887lMo18373g;
        while (true) {
            ArrayList arrayList = c2469s.f12987b;
            if (i10 >= arrayList.size()) {
                c2469s.f12996k = true;
                this.f12383h.mo19083i(2);
                return;
            } else {
                C2469s.c cVar = (C2469s.c) arrayList.get(i10);
                c2469s.m7234e(cVar);
                c2469s.f12992g.add(cVar);
                i10++;
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m7120y() {
        m7069B(true, false, true, false);
        this.f12379f.mo12329f();
        m7087W(1);
        HandlerThread handlerThread = this.f12385i;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        synchronized (this) {
            this.f12363U = true;
            notifyAll();
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m7121z(int i10, int i11, InterfaceC5732o interfaceC5732o) throws ExoPlaybackException {
        boolean z10 = true;
        this.f12362T.m7122a(1);
        C2469s c2469s = this.f12357O;
        c2469s.getClass();
        if (i10 < 0 || i10 > i11 || i11 > c2469s.f12987b.size()) {
            z10 = false;
        }
        C10129a.m18990b(z10);
        c2469s.f12995j = interfaceC5732o;
        c2469s.m7236g(i10, i11);
        m7109m(c2469s.m7231b(), false);
    }
}
