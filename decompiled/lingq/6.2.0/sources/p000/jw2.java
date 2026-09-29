package p000;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import androidx.media3.common.IllegalSeekPositionException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.ExoTimeoutException;
import androidx.media3.exoplayer.image.ImageOutput;
import com.google.common.collect.AbstractC1104t;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class jw2 implements ExoPlayer, da7 {

    /* JADX INFO: renamed from: A */
    public final C3488q8 f46254A;

    /* JADX INFO: renamed from: B */
    public final bl2 f46255B;

    /* JADX INFO: renamed from: C */
    public final bl2 f46256C;

    /* JADX INFO: renamed from: D */
    public boolean f46257D;

    /* JADX INFO: renamed from: E */
    public int f46258E;

    /* JADX INFO: renamed from: F */
    public int f46259F;

    /* JADX INFO: renamed from: G */
    public boolean f46260G;

    /* JADX INFO: renamed from: H */
    public boolean f46261H;

    /* JADX INFO: renamed from: I */
    public ImmutableSet f46262I;

    /* JADX INFO: renamed from: J */
    public final jo8 f46263J;

    /* JADX INFO: renamed from: K */
    public final tt8 f46264K;

    /* JADX INFO: renamed from: L */
    public l69 f46265L;

    /* JADX INFO: renamed from: M */
    public final tv2 f46266M;

    /* JADX INFO: renamed from: N */
    public aa7 f46267N;

    /* JADX INFO: renamed from: O */
    public tu5 f46268O;

    /* JADX INFO: renamed from: P */
    public Object f46269P;

    /* JADX INFO: renamed from: Q */
    public Surface f46270Q;

    /* JADX INFO: renamed from: R */
    public final int f46271R;

    /* JADX INFO: renamed from: S */
    public v89 f46272S;

    /* JADX INFO: renamed from: T */
    public final C3476px f46273T;

    /* JADX INFO: renamed from: U */
    public float f46274U;

    /* JADX INFO: renamed from: V */
    public boolean f46275V;

    /* JADX INFO: renamed from: W */
    public final boolean f46276W;

    /* JADX INFO: renamed from: X */
    public boolean f46277X;

    /* JADX INFO: renamed from: Y */
    public final int f46278Y;

    /* JADX INFO: renamed from: Z */
    public tu5 f46279Z;

    /* JADX INFO: renamed from: a */
    public final y0a f46280a;

    /* JADX INFO: renamed from: a0 */
    public k97 f46281a0;

    /* JADX INFO: renamed from: b */
    public final u8a f46282b;

    /* JADX INFO: renamed from: b0 */
    public int f46283b0;

    /* JADX INFO: renamed from: c */
    public final aa7 f46284c;

    /* JADX INFO: renamed from: c0 */
    public long f46285c0;

    /* JADX INFO: renamed from: d */
    public final hg1 f46286d;

    /* JADX INFO: renamed from: e */
    public final Context f46287e;

    /* JADX INFO: renamed from: f */
    public final jw2 f46288f;

    /* JADX INFO: renamed from: g */
    public final y90[] f46289g;

    /* JADX INFO: renamed from: h */
    public final y90[] f46290h;

    /* JADX INFO: renamed from: i */
    public final i92 f46291i;

    /* JADX INFO: renamed from: j */
    public final qp9 f46292j;

    /* JADX INFO: renamed from: k */
    public final yv2 f46293k;

    /* JADX INFO: renamed from: l */
    public final rw2 f46294l;

    /* JADX INFO: renamed from: m */
    public final vg5 f46295m;

    /* JADX INFO: renamed from: n */
    public final CopyOnWriteArraySet f46296n;

    /* JADX INFO: renamed from: o */
    public final x0a f46297o;

    /* JADX INFO: renamed from: p */
    public final ArrayList f46298p;

    /* JADX INFO: renamed from: q */
    public final boolean f46299q;

    /* JADX INFO: renamed from: r */
    public final l52 f46300r;

    /* JADX INFO: renamed from: s */
    public final Looper f46301s;

    /* JADX INFO: renamed from: t */
    public final u52 f46302t;

    /* JADX INFO: renamed from: u */
    public final mp9 f46303u;

    /* JADX INFO: renamed from: v */
    public final ew2 f46304v;

    /* JADX INFO: renamed from: w */
    public final fw2 f46305w;

    /* JADX INFO: renamed from: x */
    public final wn9 f46306x;

    /* JADX INFO: renamed from: y */
    public final qb2 f46307y;

    /* JADX INFO: renamed from: z */
    public final long f46308z;

    static {
        qu5.m20178a("media3.exoplayer");
    }

    public jw2(sv2 sv2Var) {
        Handler.Callback callback;
        Context context = sv2Var.f61457a;
        this.f46280a = new y0a();
        this.f46286d = new hg1();
        try {
            ss5.m21686M("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.0] [" + uma.f64080a + "]");
            Looper looper = sv2Var.f61463g;
            mp9 mp9Var = sv2Var.f61458b;
            this.f46287e = context.getApplicationContext();
            this.f46300r = new l52(mp9Var);
            this.f46278Y = sv2Var.f61464h;
            this.f46273T = sv2Var.f61465i;
            this.f46271R = sv2Var.f61466j;
            this.f46275V = false;
            this.f46308z = sv2Var.f61471o;
            ew2 ew2Var = new ew2(this);
            this.f46304v = ew2Var;
            this.f46305w = new fw2();
            y90[] y90VarArrM3356i = ((b64) sv2Var.f61459c.get()).m3356i(new Handler(looper), ew2Var, ew2Var, ew2Var, ew2Var);
            this.f46289g = y90VarArrM3356i;
            bna.m3987z(y90VarArrM3356i.length > 0);
            this.f46290h = new y90[y90VarArrM3356i.length];
            int i = 0;
            while (true) {
                y90[] y90VarArr = this.f46290h;
                if (i >= y90VarArr.length) {
                    break;
                }
                int i2 = this.f46289g[i].f69496b;
                y90VarArr[i] = null;
                i++;
            }
            this.f46291i = (i92) sv2Var.f61461e.get();
            sv2Var.f61460d.get();
            this.f46302t = (u52) sv2Var.f61462f.get();
            this.f46299q = sv2Var.f61467k;
            this.f46264K = sv2Var.f61468l;
            this.f46263J = sv2Var.f61469m;
            this.f46301s = looper;
            this.f46303u = mp9Var;
            this.f46288f = this;
            this.f46295m = new vg5(new CopyOnWriteArraySet(), looper, looper.getThread(), mp9Var, new ho2(this, 7), true);
            this.f46296n = new CopyOnWriteArraySet();
            this.f46298p = new ArrayList();
            this.f46265L = new l69();
            this.f46266M = tv2.f62943a;
            y90[] y90VarArr2 = this.f46289g;
            this.f46282b = new u8a(new b68[y90VarArr2.length], new C3565s8[y90VarArr2.length], a9a.f388b, null);
            this.f46297o = new x0a();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            for (int i3 = 0; i3 < 20; i3++) {
                int i4 = iArr[i3];
                bna.m3987z(!false);
                sparseBooleanArray.append(i4, true);
            }
            this.f46291i.getClass();
            bna.m3987z(!false);
            sparseBooleanArray.append(29, true);
            bna.m3987z(!false);
            t63 t63Var = new t63(sparseBooleanArray);
            SparseBooleanArray sparseBooleanArray2 = t63Var.f61911a;
            this.f46284c = new aa7(t63Var);
            SparseBooleanArray sparseBooleanArray3 = new SparseBooleanArray();
            for (int i5 = 0; i5 < sparseBooleanArray2.size(); i5++) {
                bna.m3973s(i5, sparseBooleanArray2.size());
                int iKeyAt = sparseBooleanArray2.keyAt(i5);
                bna.m3987z(!false);
                sparseBooleanArray3.append(iKeyAt, true);
            }
            bna.m3987z(!false);
            sparseBooleanArray3.append(4, true);
            bna.m3987z(!false);
            sparseBooleanArray3.append(10, true);
            bna.m3987z(!false);
            this.f46267N = new aa7(new t63(sparseBooleanArray3));
            this.f46292j = this.f46303u.m16990a(this.f46301s, null);
            yv2 yv2Var = new yv2(this);
            this.f46293k = yv2Var;
            this.f46281a0 = k97.m15013j(this.f46282b);
            this.f46300r.m15809K(this.f46288f, this.f46301s);
            xb7 xb7Var = new xb7(sv2Var.f61478v);
            rw2 rw2Var = new rw2(this.f46287e, this.f46289g, this.f46290h, this.f46291i, this.f46282b, new h72(), this.f46302t, this.f46257D, this.f46300r, this.f46264K, sv2Var.f61470n, this.f46301s, this.f46303u, yv2Var, xb7Var, this.f46266M, this.f46305w, sv2Var.f61479w);
            qp9 qp9Var = rw2Var.f59932h;
            this.f46294l = rw2Var;
            Looper looper2 = rw2Var.f59936j;
            this.f46274U = 1.0f;
            tu5 tu5Var = tu5.f62885B;
            this.f46268O = tu5Var;
            this.f46279Z = tu5Var;
            this.f46283b0 = -1;
            AbstractC1104t abstractC1104t = es1.f37770b;
            this.f46276W = true;
            l52 l52Var = this.f46300r;
            vg5 vg5Var = this.f46295m;
            l52Var.getClass();
            vg5Var.m23268a(l52Var);
            this.f46302t.m22471a(new Handler(this.f46301s), this.f46300r);
            this.f46296n.add(this.f46304v);
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 31) {
                callback = null;
                this.f46303u.m16990a(rw2Var.f59936j, null).m20098c(new cw2(this.f46287e, sv2Var.f61476t, this, xb7Var));
            } else {
                callback = null;
            }
            Handler.Callback callback2 = callback;
            C3488q8 c3488q8 = new C3488q8(0, looper2, this.f46301s, this.f46303u, new yv2(this));
            this.f46254A = c3488q8;
            c3488q8.m19724J(new RunnableC0002a0(this, 9));
            C3552rx c3552rx = new C3552rx(context, looper2, sv2Var.f61463g, this.f46304v, this.f46303u);
            if (c3552rx.f59986a) {
                ((qp9) c3552rx.f59989d).m20098c(new RunnableC0002a0(c3552rx, 4));
                c3552rx.f59986a = false;
            }
            boolean z = (sv2Var.f61472p == Integer.MAX_VALUE || sv2Var.f61473q == Integer.MAX_VALUE || sv2Var.f61474r == Integer.MAX_VALUE || sv2Var.f61475s == Integer.MAX_VALUE) ? false : true;
            wn9 wn9Var = new wn9(context, looper2, this.f46303u);
            this.f46306x = wn9Var;
            if (wn9Var.f67094a != z) {
                wn9Var.f67094a = z;
                wn9Var.m24083a(z, wn9Var.f67095b);
            }
            mp9 mp9Var2 = this.f46303u;
            qb2 qb2Var = new qb2();
            new p84(context.getApplicationContext(), 18);
            mp9Var2.m16990a(looper2, callback2);
            mp9Var2.m16990a(Looper.getMainLooper(), callback2);
            this.f46307y = qb2Var;
            int i7 = xc2.f68055c;
            lsa lsaVar = lsa.f50084d;
            this.f46272S = v89.f65026c;
            if (i6 >= 34) {
                new m58(this, context);
            }
            this.f46255B = new bl2(6);
            this.f46256C = new bl2(6);
            new n16(this, this.f46304v, this.f46303u, sv2Var.f61472p, sv2Var.f61473q, sv2Var.f61474r, sv2Var.f61475s);
            qp9Var.m20097a(38, this.f46263J).m19440b();
            C3476px c3476px = this.f46273T;
            qp9Var.getClass();
            pp9 pp9VarM20096b = qp9.m20096b();
            pp9VarM20096b.f56637a = qp9Var.f58033a.obtainMessage(31, 0, 0, c3476px);
            pp9VarM20096b.m19440b();
            m14728z(1, this.f46273T, 3);
            m14728z(2, Integer.valueOf(this.f46271R), 4);
            m14728z(2, 0, 5);
            m14728z(1, Boolean.valueOf(this.f46275V), 9);
            m14728z(6, this.f46305w, 8);
            m14728z(-1, Integer.valueOf(this.f46278Y), 16);
        } finally {
            this.f46286d.m13225b();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m14692a(jw2 jw2Var, final int i, final int i2) {
        v89 v89Var = jw2Var.f46272S;
        if (i == v89Var.f65027a && i2 == v89Var.f65028b) {
            return;
        }
        jw2Var.f46272S = new v89(i, i2);
        jw2Var.f46295m.m23271d(24, new sg5() { // from class: zv2
            @Override // p000.sg5
            public final void invoke(Object obj) {
                ((ba7) obj).mo3506B(i, i2);
            }
        });
        jw2Var.m14728z(2, new v89(i, i2), 14);
    }

    /* JADX INFO: renamed from: r */
    public static long m14693r(k97 k97Var) {
        y0a y0aVar = new y0a();
        x0a x0aVar = new x0a();
        k97Var.f46893a.mo23250g(k97Var.f46894b.f46226a, x0aVar);
        long j = k97Var.f46895c;
        return j == -9223372036854775807L ? k97Var.f46893a.mo39m(x0aVar.f67601c, y0aVar, 0L).f69073j : x0aVar.f67603e + j;
    }

    /* JADX INFO: renamed from: u */
    public static k97 m14694u(k97 k97Var, int i) {
        k97 k97VarM15020g = k97Var.m15020g(i);
        return (i == 1 || i == 4) ? k97VarM15020g.m15014a(false) : k97VarM15020g;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00a8  */
    /* JADX INFO: renamed from: A */
    public final void m14695A(q90 q90Var) {
        m14705K();
        List listSingletonList = Collections.singletonList(q90Var);
        m14705K();
        m14705K();
        m14717m(this.f46281a0);
        m14714j();
        this.f46258E++;
        ArrayList arrayList = this.f46298p;
        arrayList.clear();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < listSingletonList.size(); i++) {
            vv5 vv5Var = new vv5((q90) listSingletonList.get(i), this.f46299q);
            arrayList2.add(vv5Var);
            arrayList.add(i, new gw2(vv5Var.f65983b, vv5Var.f65982a));
        }
        l69 l69Var = this.f46265L;
        int size = arrayList2.size();
        l69Var.getClass();
        this.f46265L = new l69(new Random(l69Var.f49199a.nextLong())).m15907a(size);
        ve7 ve7Var = new ve7(arrayList, this.f46265L);
        if (!ve7Var.m25398p() && -1 >= ve7Var.mo17288o()) {
            throw new IllegalSeekPositionException();
        }
        int iMo23247a = ve7Var.mo23247a(this.f46257D);
        k97 k97VarM14724v = m14724v(this.f46281a0, ve7Var, m14725w(ve7Var, iMo23247a, -9223372036854775807L));
        int i2 = k97VarM14724v.f46897e;
        if (i2 == 1) {
            i2 = 1;
        } else if (ve7Var.m25398p()) {
            i2 = 4;
        } else if (iMo23247a != -1) {
            if (iMo23247a >= ve7Var.mo17288o()) {
                i2 = 4;
            } else {
                i2 = 2;
            }
        }
        k97 k97VarM14694u = m14694u(k97VarM14724v, i2);
        this.f46294l.f59932h.m20097a(17, new nw2(arrayList2, this.f46265L, iMo23247a, uma.m22797B(-9223372036854775807L))).m19440b();
        m14703I(k97VarM14694u, 0, (this.f46281a0.f46894b.f46226a.equals(k97VarM14694u.f46894b.f46226a) || this.f46281a0.f46893a.m25398p()) ? false : true, 4, m14715k(k97VarM14694u), -1);
    }

    /* JADX INFO: renamed from: B */
    public final void m14696B(boolean z) {
        m14705K();
        m14702H(1, z);
    }

    /* JADX INFO: renamed from: C */
    public final void m14697C(n97 n97Var) {
        m14705K();
        if (this.f46281a0.f46907o.equals(n97Var)) {
            return;
        }
        k97 k97VarM15019f = this.f46281a0.m15019f(n97Var);
        this.f46258E++;
        this.f46294l.f59932h.m20097a(4, n97Var).m19440b();
        m14703I(k97VarM15019f, 0, false, 5, -9223372036854775807L, -1);
    }

    /* JADX INFO: renamed from: D */
    public final void m14698D(Surface surface) {
        Object obj = this.f46269P;
        boolean z = false;
        boolean z2 = true;
        boolean z3 = (obj == null || obj == surface) ? false : true;
        long j = z3 ? this.f46308z : -9223372036854775807L;
        rw2 rw2Var = this.f46294l;
        if (rw2Var.f59936j.getThread().isAlive()) {
            mp9 mp9Var = rw2Var.f59902K;
            hg1 hg1Var = new hg1(mp9Var);
            rw2Var.f59932h.m20097a(30, new Pair(surface, hg1Var)).m19440b();
            if (j != -9223372036854775807L) {
                synchronized (hg1Var) {
                    try {
                        if (j <= 0) {
                            z2 = hg1Var.f42318b;
                        } else {
                            mp9Var.getClass();
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            long j2 = j + jElapsedRealtime;
                            if (j2 < jElapsedRealtime) {
                                hg1Var.m13224a();
                            } else {
                                while (!hg1Var.f42318b && jElapsedRealtime < j2) {
                                    try {
                                        hg1Var.f42317a.getClass();
                                        hg1Var.wait(j2 - jElapsedRealtime);
                                    } catch (InterruptedException unused) {
                                        z = true;
                                    }
                                    hg1Var.f42317a.getClass();
                                    jElapsedRealtime = SystemClock.elapsedRealtime();
                                }
                                if (z) {
                                    Thread.currentThread().interrupt();
                                }
                            }
                            z2 = hg1Var.f42318b;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        if (z3) {
            Object obj2 = this.f46269P;
            Surface surface2 = this.f46270Q;
            if (obj2 == surface2) {
                surface2.release();
                this.f46270Q = null;
            }
        }
        this.f46269P = surface;
        if (z2) {
            return;
        }
        m14700F(ExoPlaybackException.m2528e(new ExoTimeoutException(), 1003));
    }

    /* JADX INFO: renamed from: E */
    public final void m14699E() {
        m14705K();
        m14700F(null);
        ImmutableList immutableListM6289v = ImmutableList.m6289v();
        long j = this.f46281a0.f46911s;
        new es1(immutableListM6289v);
    }

    /* JADX INFO: renamed from: F */
    public final void m14700F(ExoPlaybackException exoPlaybackException) {
        k97 k97Var = this.f46281a0;
        k97 k97VarM15015b = k97Var.m15015b(k97Var.f46894b);
        k97VarM15015b.f46909q = k97VarM15015b.f46911s;
        k97VarM15015b.f46910r = 0L;
        k97 k97VarM14694u = m14694u(k97VarM15015b, 1);
        if (exoPlaybackException != null) {
            k97VarM14694u = k97VarM14694u.m15018e(exoPlaybackException);
        }
        k97 k97Var2 = k97VarM14694u;
        this.f46258E++;
        qp9 qp9Var = this.f46294l.f59932h;
        qp9Var.getClass();
        pp9 pp9VarM20096b = qp9.m20096b();
        pp9VarM20096b.f56637a = qp9Var.f58033a.obtainMessage(6);
        pp9VarM20096b.m19440b();
        m14703I(k97Var2, 0, false, 5, -9223372036854775807L, -1);
    }

    /* JADX INFO: renamed from: G */
    public final void m14701G() {
        int iMo23251k;
        int iMo23249e;
        aa7 aa7Var = this.f46267N;
        String str = uma.f64080a;
        jw2 jw2Var = this.f46288f;
        boolean zM14723t = jw2Var.m14723t();
        y0a y0aVar = jw2Var.f46280a;
        z0a z0aVarM14716l = jw2Var.m14716l();
        boolean z = false;
        boolean z2 = !z0aVarM14716l.m25398p() && z0aVarM14716l.mo39m(jw2Var.m14712h(), y0aVar, 0L).f69069f;
        z0a z0aVarM14716l2 = jw2Var.m14716l();
        if (z0aVarM14716l2.m25398p()) {
            iMo23251k = -1;
        } else {
            int iM14712h = jw2Var.m14712h();
            jw2Var.m14705K();
            jw2Var.m14705K();
            iMo23251k = z0aVarM14716l2.mo23251k(iM14712h, 0, jw2Var.f46257D);
        }
        boolean z3 = iMo23251k != -1;
        z0a z0aVarM14716l3 = jw2Var.m14716l();
        if (z0aVarM14716l3.m25398p()) {
            iMo23249e = -1;
        } else {
            int iM14712h2 = jw2Var.m14712h();
            jw2Var.m14705K();
            jw2Var.m14705K();
            iMo23249e = z0aVarM14716l3.mo23249e(iM14712h2, 0, jw2Var.f46257D);
        }
        boolean z4 = iMo23249e != -1;
        z0a z0aVarM14716l4 = jw2Var.m14716l();
        boolean z5 = !z0aVarM14716l4.m25398p() && z0aVarM14716l4.mo39m(jw2Var.m14712h(), y0aVar, 0L).m24824a();
        z0a z0aVarM14716l5 = jw2Var.m14716l();
        boolean z6 = !z0aVarM14716l5.m25398p() && z0aVarM14716l5.mo39m(jw2Var.m14712h(), y0aVar, 0L).f69070g;
        boolean zM25398p = jw2Var.m14716l().m25398p();
        cc4 cc4Var = new cc4(15);
        xe1 xe1Var = (xe1) cc4Var.f9881a;
        SparseBooleanArray sparseBooleanArray = this.f46284c.f425a.f61911a;
        xe1Var.getClass();
        for (int i = 0; i < sparseBooleanArray.size(); i++) {
            bna.m3973s(i, sparseBooleanArray.size());
            xe1Var.m24468a(sparseBooleanArray.keyAt(i));
        }
        boolean z7 = !zM14723t;
        cc4Var.m4507c(4, z7);
        cc4Var.m4507c(5, z2 && !zM14723t);
        cc4Var.m4507c(6, z3 && !zM14723t);
        cc4Var.m4507c(7, !zM25398p && (z3 || !z5 || z2) && !zM14723t);
        cc4Var.m4507c(8, z4 && !zM14723t);
        boolean z8 = !zM25398p && (z4 || (z5 && z6)) && !zM14723t;
        int i2 = 9;
        cc4Var.m4507c(9, z8);
        cc4Var.m4507c(10, z7);
        cc4Var.m4507c(11, z2 && !zM14723t);
        if (z2 && !zM14723t) {
            z = true;
        }
        cc4Var.m4507c(12, z);
        aa7 aa7Var2 = new aa7(xe1Var.m24469b());
        this.f46267N = aa7Var2;
        if (aa7Var2.equals(aa7Var)) {
            return;
        }
        this.f46295m.m23270c(13, new C3440oy(this, i2));
    }

    /* JADX INFO: renamed from: H */
    public final void m14702H(int i, boolean z) {
        int i2;
        if (this.f46261H) {
            i2 = 4;
        } else {
            i2 = (this.f46281a0.f46906n != 1 || z) ? 0 : 1;
        }
        k97 k97Var = this.f46281a0;
        boolean z2 = k97Var.f46904l;
        if (z2 == z && k97Var.f46906n == i2 && k97Var.f46905m == i) {
            return;
        }
        this.f46258E++;
        if (k97Var.f46908p) {
            k97Var = new k97(k97Var.f46893a, k97Var.f46894b, k97Var.f46895c, k97Var.f46896d, k97Var.f46897e, k97Var.f46898f, k97Var.f46899g, k97Var.f46900h, k97Var.f46901i, k97Var.f46902j, k97Var.f46903k, z2, k97Var.f46905m, k97Var.f46906n, k97Var.f46907o, k97Var.f46909q, k97Var.f46910r, k97Var.m15023k(), SystemClock.elapsedRealtime(), k97Var.f46908p);
        }
        k97 k97VarM15017d = k97Var.m15017d(i, i2, z);
        int i3 = i | (i2 << 4);
        qp9 qp9Var = this.f46294l.f59932h;
        qp9Var.getClass();
        pp9 pp9VarM20096b = qp9.m20096b();
        pp9VarM20096b.f56637a = qp9Var.f58033a.obtainMessage(1, z ? 1 : 0, i3);
        pp9VarM20096b.m19440b();
        m14703I(k97VarM15017d, 0, false, 5, -9223372036854775807L, -1);
    }

    /* JADX INFO: renamed from: I */
    public final void m14703I(final k97 k97Var, int i, boolean z, int i2, long j, int i3) {
        Pair pair;
        int i4;
        pu5 pu5Var;
        int i5;
        int i6;
        Object obj;
        pu5 pu5Var2;
        Object obj2;
        long j2;
        long j3;
        long jM14693r;
        long jM14693r2;
        Object obj3;
        pu5 pu5Var3;
        Object obj4;
        k97 k97Var2 = this.f46281a0;
        this.f46281a0 = k97Var;
        boolean zEquals = k97Var2.f46893a.equals(k97Var.f46893a);
        y0a y0aVar = this.f46280a;
        x0a x0aVar = this.f46297o;
        z0a z0aVar = k97Var2.f46893a;
        jv5 jv5Var = k97Var2.f46894b;
        z0a z0aVar2 = k97Var.f46893a;
        jv5 jv5Var2 = k97Var.f46894b;
        int i7 = 0;
        if (z0aVar2.m25398p() && z0aVar.m25398p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (z0aVar2.m25398p() != z0aVar.m25398p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (z0aVar.mo39m(z0aVar.mo23250g(jv5Var.f46226a, x0aVar).f67601c, y0aVar, 0L).f69064a.equals(z0aVar2.mo39m(z0aVar2.mo23250g(jv5Var2.f46226a, x0aVar).f67601c, y0aVar, 0L).f69064a)) {
            pair = (z && i2 == 0 && jv5Var.f46229d < jv5Var2.f46229d) ? new Pair(Boolean.TRUE, 0) : new Pair(Boolean.FALSE, -1);
        } else {
            if (z && i2 == 0) {
                i4 = 1;
            } else if (z && i2 == 1) {
                i4 = 2;
            } else {
                if (zEquals) {
                    uk9.m22770c();
                    return;
                }
                i4 = 3;
            }
            pair = new Pair(Boolean.TRUE, Integer.valueOf(i4));
        }
        boolean zBooleanValue = ((Boolean) pair.first).booleanValue();
        int iIntValue = ((Integer) pair.second).intValue();
        if (zBooleanValue) {
            pu5Var = k97Var.f46893a.m25398p() ? null : k97Var.f46893a.mo39m(k97Var.f46893a.mo23250g(k97Var.f46894b.f46226a, this.f46297o).f67601c, this.f46280a, 0L).f69065b;
            this.f46279Z = tu5.f62885B;
        } else {
            pu5Var = null;
        }
        if (zBooleanValue || !k97Var2.f46902j.equals(k97Var.f46902j)) {
            su5 su5VarM22307a = this.f46279Z.m22307a();
            List list = k97Var.f46902j;
            for (int i8 = 0; i8 < list.size(); i8++) {
                ey5 ey5Var = (ey5) list.get(i8);
                for (int i9 = 0; i9 < ey5Var.m11390e(); i9++) {
                    ey5Var.m11389d(i9).mo4207b(su5VarM22307a);
                }
            }
            this.f46279Z = new tu5(su5VarM22307a);
        }
        tu5 tu5VarM14706b = m14706b();
        boolean zEquals2 = tu5VarM14706b.equals(this.f46268O);
        this.f46268O = tu5VarM14706b;
        boolean z2 = k97Var2.f46904l != k97Var.f46904l;
        boolean z3 = k97Var2.f46897e != k97Var.f46897e;
        if (z3 || z2) {
            m14704J();
        }
        boolean z4 = k97Var2.f46899g != k97Var.f46899g;
        if (!zEquals) {
            this.f46295m.m23270c(0, new uv2(k97Var, i, i7));
        }
        if (z) {
            x0a x0aVar2 = new x0a();
            if (k97Var2.f46893a.m25398p()) {
                i5 = i3;
                i6 = i5;
                obj = null;
                pu5Var2 = null;
                obj2 = null;
            } else {
                Object obj5 = k97Var2.f46894b.f46226a;
                k97Var2.f46893a.mo23250g(obj5, x0aVar2);
                int i10 = x0aVar2.f67601c;
                int iMo17285b = k97Var2.f46893a.mo17285b(obj5);
                obj = k97Var2.f46893a.mo39m(i10, this.f46280a, 0L).f69064a;
                pu5Var2 = this.f46280a.f69065b;
                obj2 = obj5;
                i5 = i10;
                i6 = iMo17285b;
            }
            jv5 jv5Var3 = k97Var2.f46894b;
            if (i2 == 0) {
                boolean zM14690b = jv5Var3.m14690b();
                jv5 jv5Var4 = k97Var2.f46894b;
                if (zM14690b) {
                    jM14693r = x0aVar2.m24223a(jv5Var4.f46227b, jv5Var4.f46228c);
                    jM14693r2 = m14693r(k97Var2);
                } else {
                    if (jv5Var4.f46230e != -1) {
                        jM14693r = m14693r(this.f46281a0);
                    } else {
                        j2 = x0aVar2.f67603e;
                        j3 = x0aVar2.f67602d;
                        jM14693r = j2 + j3;
                    }
                    jM14693r2 = jM14693r;
                }
            } else if (jv5Var3.m14690b()) {
                jM14693r = k97Var2.f46911s;
                jM14693r2 = m14693r(k97Var2);
            } else {
                j2 = x0aVar2.f67603e;
                j3 = k97Var2.f46911s;
                jM14693r = j2 + j3;
                jM14693r2 = jM14693r;
            }
            long jM22805J = uma.m22805J(jM14693r);
            long jM22805J2 = uma.m22805J(jM14693r2);
            jv5 jv5Var5 = k97Var2.f46894b;
            ca7 ca7Var = new ca7(obj, i5, pu5Var2, obj2, i6, jM22805J, jM22805J2, jv5Var5.f46227b, jv5Var5.f46228c);
            y0a y0aVar2 = this.f46280a;
            int iM14712h = m14712h();
            int iM14713i = m14713i();
            if (this.f46281a0.f46893a.m25398p()) {
                obj3 = null;
                pu5Var3 = null;
                obj4 = null;
            } else {
                k97 k97Var3 = this.f46281a0;
                Object obj6 = k97Var3.f46894b.f46226a;
                k97Var3.f46893a.mo23250g(obj6, this.f46297o);
                iM14713i = this.f46281a0.f46893a.mo17285b(obj6);
                Object obj7 = this.f46281a0.f46893a.mo39m(iM14712h, y0aVar2, 0L).f69064a;
                pu5Var3 = y0aVar2.f69065b;
                obj4 = obj6;
                obj3 = obj7;
            }
            int i11 = iM14713i;
            long jM22805J3 = uma.m22805J(j);
            long jM22805J4 = this.f46281a0.f46894b.m14690b() ? uma.m22805J(m14693r(this.f46281a0)) : jM22805J3;
            jv5 jv5Var6 = this.f46281a0.f46894b;
            this.f46295m.m23270c(11, new bw2(i2, ca7Var, new ca7(obj3, iM14712h, pu5Var3, obj4, i11, jM22805J3, jM22805J4, jv5Var6.f46227b, jv5Var6.f46228c)));
        } else {
            zBooleanValue = zBooleanValue;
            zEquals2 = zEquals2;
            z3 = z3;
        }
        if (zBooleanValue) {
            this.f46295m.m23270c(1, new uv2(pu5Var, iIntValue, 1));
        }
        final int i12 = 8;
        final int i13 = 7;
        if (k97Var2.f46898f != k97Var.f46898f) {
            this.f46295m.m23270c(10, new sg5() { // from class: vv2
                @Override // p000.sg5
                public final void invoke(Object obj8) {
                    int i14 = i13;
                    k97 k97Var4 = k97Var;
                    ba7 ba7Var = (ba7) obj8;
                    switch (i14) {
                        case 0:
                            boolean z5 = k97Var4.f46899g;
                            ba7Var.getClass();
                            ba7Var.mo3510d(k97Var4.f46899g);
                            break;
                        case 1:
                            ba7Var.mo3524u(k97Var4.f46897e, k97Var4.f46904l);
                            break;
                        case 2:
                            ba7Var.mo3514i(k97Var4.f46897e);
                            break;
                        case 3:
                            ba7Var.mo3511e(k97Var4.f46905m, k97Var4.f46904l);
                            break;
                        case 4:
                            ba7Var.mo3509b(k97Var4.f46906n);
                            break;
                        case 5:
                            ba7Var.mo3507D(k97Var4.m15024l());
                            break;
                        case 6:
                            ba7Var.mo3525v(k97Var4.f46907o);
                            break;
                        case 7:
                            ba7Var.mo3527x(k97Var4.f46898f);
                            break;
                        case 8:
                            ba7Var.mo3505A(k97Var4.f46898f);
                            break;
                        default:
                            ba7Var.mo3517n((a9a) k97Var4.f46901i.f63596e);
                            break;
                    }
                }
            });
            if (k97Var.f46898f != null) {
                this.f46295m.m23270c(10, new sg5() { // from class: vv2
                    @Override // p000.sg5
                    public final void invoke(Object obj8) {
                        int i14 = i12;
                        k97 k97Var4 = k97Var;
                        ba7 ba7Var = (ba7) obj8;
                        switch (i14) {
                            case 0:
                                boolean z5 = k97Var4.f46899g;
                                ba7Var.getClass();
                                ba7Var.mo3510d(k97Var4.f46899g);
                                break;
                            case 1:
                                ba7Var.mo3524u(k97Var4.f46897e, k97Var4.f46904l);
                                break;
                            case 2:
                                ba7Var.mo3514i(k97Var4.f46897e);
                                break;
                            case 3:
                                ba7Var.mo3511e(k97Var4.f46905m, k97Var4.f46904l);
                                break;
                            case 4:
                                ba7Var.mo3509b(k97Var4.f46906n);
                                break;
                            case 5:
                                ba7Var.mo3507D(k97Var4.m15024l());
                                break;
                            case 6:
                                ba7Var.mo3525v(k97Var4.f46907o);
                                break;
                            case 7:
                                ba7Var.mo3527x(k97Var4.f46898f);
                                break;
                            case 8:
                                ba7Var.mo3505A(k97Var4.f46898f);
                                break;
                            default:
                                ba7Var.mo3517n((a9a) k97Var4.f46901i.f63596e);
                                break;
                        }
                    }
                });
            }
        }
        u8a u8aVar = k97Var2.f46901i;
        u8a u8aVar2 = k97Var.f46901i;
        if (u8aVar != u8aVar2) {
            i92 i92Var = this.f46291i;
            Object obj8 = u8aVar2.f63597f;
            i92Var.getClass();
            final int i14 = 9;
            this.f46295m.m23270c(2, new sg5() { // from class: vv2
                @Override // p000.sg5
                public final void invoke(Object obj9) {
                    int i15 = i14;
                    k97 k97Var4 = k97Var;
                    ba7 ba7Var = (ba7) obj9;
                    switch (i15) {
                        case 0:
                            boolean z5 = k97Var4.f46899g;
                            ba7Var.getClass();
                            ba7Var.mo3510d(k97Var4.f46899g);
                            break;
                        case 1:
                            ba7Var.mo3524u(k97Var4.f46897e, k97Var4.f46904l);
                            break;
                        case 2:
                            ba7Var.mo3514i(k97Var4.f46897e);
                            break;
                        case 3:
                            ba7Var.mo3511e(k97Var4.f46905m, k97Var4.f46904l);
                            break;
                        case 4:
                            ba7Var.mo3509b(k97Var4.f46906n);
                            break;
                        case 5:
                            ba7Var.mo3507D(k97Var4.m15024l());
                            break;
                        case 6:
                            ba7Var.mo3525v(k97Var4.f46907o);
                            break;
                        case 7:
                            ba7Var.mo3527x(k97Var4.f46898f);
                            break;
                        case 8:
                            ba7Var.mo3505A(k97Var4.f46898f);
                            break;
                        default:
                            ba7Var.mo3517n((a9a) k97Var4.f46901i.f63596e);
                            break;
                    }
                }
            });
        }
        if (!zEquals2) {
            this.f46295m.m23270c(14, new C3440oy(this.f46268O, i12));
        }
        if (z4) {
            final int i15 = 0;
            this.f46295m.m23270c(3, new sg5() { // from class: vv2
                @Override // p000.sg5
                public final void invoke(Object obj9) {
                    int i16 = i15;
                    k97 k97Var4 = k97Var;
                    ba7 ba7Var = (ba7) obj9;
                    switch (i16) {
                        case 0:
                            boolean z5 = k97Var4.f46899g;
                            ba7Var.getClass();
                            ba7Var.mo3510d(k97Var4.f46899g);
                            break;
                        case 1:
                            ba7Var.mo3524u(k97Var4.f46897e, k97Var4.f46904l);
                            break;
                        case 2:
                            ba7Var.mo3514i(k97Var4.f46897e);
                            break;
                        case 3:
                            ba7Var.mo3511e(k97Var4.f46905m, k97Var4.f46904l);
                            break;
                        case 4:
                            ba7Var.mo3509b(k97Var4.f46906n);
                            break;
                        case 5:
                            ba7Var.mo3507D(k97Var4.m15024l());
                            break;
                        case 6:
                            ba7Var.mo3525v(k97Var4.f46907o);
                            break;
                        case 7:
                            ba7Var.mo3527x(k97Var4.f46898f);
                            break;
                        case 8:
                            ba7Var.mo3505A(k97Var4.f46898f);
                            break;
                        default:
                            ba7Var.mo3517n((a9a) k97Var4.f46901i.f63596e);
                            break;
                    }
                }
            });
        }
        if (z3 || z2) {
            final int i16 = 1;
            this.f46295m.m23270c(-1, new sg5() { // from class: vv2
                @Override // p000.sg5
                public final void invoke(Object obj9) {
                    int i17 = i16;
                    k97 k97Var4 = k97Var;
                    ba7 ba7Var = (ba7) obj9;
                    switch (i17) {
                        case 0:
                            boolean z5 = k97Var4.f46899g;
                            ba7Var.getClass();
                            ba7Var.mo3510d(k97Var4.f46899g);
                            break;
                        case 1:
                            ba7Var.mo3524u(k97Var4.f46897e, k97Var4.f46904l);
                            break;
                        case 2:
                            ba7Var.mo3514i(k97Var4.f46897e);
                            break;
                        case 3:
                            ba7Var.mo3511e(k97Var4.f46905m, k97Var4.f46904l);
                            break;
                        case 4:
                            ba7Var.mo3509b(k97Var4.f46906n);
                            break;
                        case 5:
                            ba7Var.mo3507D(k97Var4.m15024l());
                            break;
                        case 6:
                            ba7Var.mo3525v(k97Var4.f46907o);
                            break;
                        case 7:
                            ba7Var.mo3527x(k97Var4.f46898f);
                            break;
                        case 8:
                            ba7Var.mo3505A(k97Var4.f46898f);
                            break;
                        default:
                            ba7Var.mo3517n((a9a) k97Var4.f46901i.f63596e);
                            break;
                    }
                }
            });
        }
        final int i17 = 4;
        if (z3) {
            final int i18 = 2;
            this.f46295m.m23270c(4, new sg5() { // from class: vv2
                @Override // p000.sg5
                public final void invoke(Object obj9) {
                    int i19 = i18;
                    k97 k97Var4 = k97Var;
                    ba7 ba7Var = (ba7) obj9;
                    switch (i19) {
                        case 0:
                            boolean z5 = k97Var4.f46899g;
                            ba7Var.getClass();
                            ba7Var.mo3510d(k97Var4.f46899g);
                            break;
                        case 1:
                            ba7Var.mo3524u(k97Var4.f46897e, k97Var4.f46904l);
                            break;
                        case 2:
                            ba7Var.mo3514i(k97Var4.f46897e);
                            break;
                        case 3:
                            ba7Var.mo3511e(k97Var4.f46905m, k97Var4.f46904l);
                            break;
                        case 4:
                            ba7Var.mo3509b(k97Var4.f46906n);
                            break;
                        case 5:
                            ba7Var.mo3507D(k97Var4.m15024l());
                            break;
                        case 6:
                            ba7Var.mo3525v(k97Var4.f46907o);
                            break;
                        case 7:
                            ba7Var.mo3527x(k97Var4.f46898f);
                            break;
                        case 8:
                            ba7Var.mo3505A(k97Var4.f46898f);
                            break;
                        default:
                            ba7Var.mo3517n((a9a) k97Var4.f46901i.f63596e);
                            break;
                    }
                }
            });
        }
        final int i19 = 5;
        if (z2 || k97Var2.f46905m != k97Var.f46905m) {
            final int i20 = 3;
            this.f46295m.m23270c(5, new sg5() { // from class: vv2
                @Override // p000.sg5
                public final void invoke(Object obj9) {
                    int i110 = i20;
                    k97 k97Var4 = k97Var;
                    ba7 ba7Var = (ba7) obj9;
                    switch (i110) {
                        case 0:
                            boolean z5 = k97Var4.f46899g;
                            ba7Var.getClass();
                            ba7Var.mo3510d(k97Var4.f46899g);
                            break;
                        case 1:
                            ba7Var.mo3524u(k97Var4.f46897e, k97Var4.f46904l);
                            break;
                        case 2:
                            ba7Var.mo3514i(k97Var4.f46897e);
                            break;
                        case 3:
                            ba7Var.mo3511e(k97Var4.f46905m, k97Var4.f46904l);
                            break;
                        case 4:
                            ba7Var.mo3509b(k97Var4.f46906n);
                            break;
                        case 5:
                            ba7Var.mo3507D(k97Var4.m15024l());
                            break;
                        case 6:
                            ba7Var.mo3525v(k97Var4.f46907o);
                            break;
                        case 7:
                            ba7Var.mo3527x(k97Var4.f46898f);
                            break;
                        case 8:
                            ba7Var.mo3505A(k97Var4.f46898f);
                            break;
                        default:
                            ba7Var.mo3517n((a9a) k97Var4.f46901i.f63596e);
                            break;
                    }
                }
            });
        }
        final int i21 = 6;
        if (k97Var2.f46906n != k97Var.f46906n) {
            this.f46295m.m23270c(6, new sg5() { // from class: vv2
                @Override // p000.sg5
                public final void invoke(Object obj9) {
                    int i110 = i17;
                    k97 k97Var4 = k97Var;
                    ba7 ba7Var = (ba7) obj9;
                    switch (i110) {
                        case 0:
                            boolean z5 = k97Var4.f46899g;
                            ba7Var.getClass();
                            ba7Var.mo3510d(k97Var4.f46899g);
                            break;
                        case 1:
                            ba7Var.mo3524u(k97Var4.f46897e, k97Var4.f46904l);
                            break;
                        case 2:
                            ba7Var.mo3514i(k97Var4.f46897e);
                            break;
                        case 3:
                            ba7Var.mo3511e(k97Var4.f46905m, k97Var4.f46904l);
                            break;
                        case 4:
                            ba7Var.mo3509b(k97Var4.f46906n);
                            break;
                        case 5:
                            ba7Var.mo3507D(k97Var4.m15024l());
                            break;
                        case 6:
                            ba7Var.mo3525v(k97Var4.f46907o);
                            break;
                        case 7:
                            ba7Var.mo3527x(k97Var4.f46898f);
                            break;
                        case 8:
                            ba7Var.mo3505A(k97Var4.f46898f);
                            break;
                        default:
                            ba7Var.mo3517n((a9a) k97Var4.f46901i.f63596e);
                            break;
                    }
                }
            });
        }
        if (k97Var2.m15024l() != k97Var.m15024l()) {
            this.f46295m.m23270c(7, new sg5() { // from class: vv2
                @Override // p000.sg5
                public final void invoke(Object obj9) {
                    int i110 = i19;
                    k97 k97Var4 = k97Var;
                    ba7 ba7Var = (ba7) obj9;
                    switch (i110) {
                        case 0:
                            boolean z5 = k97Var4.f46899g;
                            ba7Var.getClass();
                            ba7Var.mo3510d(k97Var4.f46899g);
                            break;
                        case 1:
                            ba7Var.mo3524u(k97Var4.f46897e, k97Var4.f46904l);
                            break;
                        case 2:
                            ba7Var.mo3514i(k97Var4.f46897e);
                            break;
                        case 3:
                            ba7Var.mo3511e(k97Var4.f46905m, k97Var4.f46904l);
                            break;
                        case 4:
                            ba7Var.mo3509b(k97Var4.f46906n);
                            break;
                        case 5:
                            ba7Var.mo3507D(k97Var4.m15024l());
                            break;
                        case 6:
                            ba7Var.mo3525v(k97Var4.f46907o);
                            break;
                        case 7:
                            ba7Var.mo3527x(k97Var4.f46898f);
                            break;
                        case 8:
                            ba7Var.mo3505A(k97Var4.f46898f);
                            break;
                        default:
                            ba7Var.mo3517n((a9a) k97Var4.f46901i.f63596e);
                            break;
                    }
                }
            });
        }
        if (!k97Var2.f46907o.equals(k97Var.f46907o)) {
            this.f46295m.m23270c(12, new sg5() { // from class: vv2
                @Override // p000.sg5
                public final void invoke(Object obj9) {
                    int i110 = i21;
                    k97 k97Var4 = k97Var;
                    ba7 ba7Var = (ba7) obj9;
                    switch (i110) {
                        case 0:
                            boolean z5 = k97Var4.f46899g;
                            ba7Var.getClass();
                            ba7Var.mo3510d(k97Var4.f46899g);
                            break;
                        case 1:
                            ba7Var.mo3524u(k97Var4.f46897e, k97Var4.f46904l);
                            break;
                        case 2:
                            ba7Var.mo3514i(k97Var4.f46897e);
                            break;
                        case 3:
                            ba7Var.mo3511e(k97Var4.f46905m, k97Var4.f46904l);
                            break;
                        case 4:
                            ba7Var.mo3509b(k97Var4.f46906n);
                            break;
                        case 5:
                            ba7Var.mo3507D(k97Var4.m15024l());
                            break;
                        case 6:
                            ba7Var.mo3525v(k97Var4.f46907o);
                            break;
                        case 7:
                            ba7Var.mo3527x(k97Var4.f46898f);
                            break;
                        case 8:
                            ba7Var.mo3505A(k97Var4.f46898f);
                            break;
                        default:
                            ba7Var.mo3517n((a9a) k97Var4.f46901i.f63596e);
                            break;
                    }
                }
            });
        }
        m14701G();
        this.f46295m.m23269b();
        if (k97Var2.f46908p != k97Var.f46908p) {
            Iterator it = this.f46296n.iterator();
            while (it.hasNext()) {
                ((ew2) it.next()).f37985a.m14704J();
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m14704J() {
        int iM14721q = m14721q();
        qb2 qb2Var = this.f46307y;
        wn9 wn9Var = this.f46306x;
        boolean z = false;
        if (iM14721q != 1) {
            if (iM14721q == 2 || iM14721q == 3) {
                m14705K();
                boolean z2 = this.f46281a0.f46908p;
                if (m14719o() && !z2) {
                    z = true;
                }
                if (wn9Var.f67095b != z) {
                    wn9Var.f67095b = z;
                    if (wn9Var.f67094a) {
                        wn9Var.m24083a(true, z);
                    }
                }
                boolean zM14719o = m14719o();
                if (qb2Var.f57531a == zM14719o) {
                    return;
                }
                qb2Var.f57531a = zM14719o;
                return;
            }
            if (iM14721q != 4) {
                uk9.m22770c();
                return;
            }
        }
        if (wn9Var.f67095b) {
            wn9Var.f67095b = false;
            if (wn9Var.f67094a) {
                wn9Var.m24083a(true, false);
            }
        }
        if (qb2Var.f57531a) {
            qb2Var.f57531a = false;
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m14705K() {
        this.f46286d.m13224a();
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.f46301s;
        if (threadCurrentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = uma.f64080a;
            Locale locale = Locale.US;
            String strM22991n = ux5.m22991n("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.f46276W) {
                C3386nv.m17633t(strM22991n);
            } else {
                ss5.m21709e0("ExoPlayerImpl", strM22991n, this.f46277X ? null : new IllegalStateException());
                this.f46277X = true;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final tu5 m14706b() {
        z0a z0aVarM14716l = m14716l();
        if (z0aVarM14716l.m25398p()) {
            return this.f46279Z;
        }
        pu5 pu5Var = z0aVarM14716l.mo39m(m14712h(), this.f46280a, 0L).f69065b;
        su5 su5VarM22307a = this.f46279Z.m22307a();
        tu5 tu5Var = pu5Var.f56813d;
        if (tu5Var != null) {
            ImmutableList immutableList = tu5Var.f62886A;
            byte[] bArr = tu5Var.f62892f;
            CharSequence charSequence = tu5Var.f62887a;
            if (charSequence != null) {
                su5VarM22307a.f61418a = charSequence;
            }
            CharSequence charSequence2 = tu5Var.f62888b;
            if (charSequence2 != null) {
                su5VarM22307a.f61419b = charSequence2;
            }
            CharSequence charSequence3 = tu5Var.f62889c;
            if (charSequence3 != null) {
                su5VarM22307a.f61420c = charSequence3;
            }
            CharSequence charSequence4 = tu5Var.f62890d;
            if (charSequence4 != null) {
                su5VarM22307a.f61421d = charSequence4;
            }
            CharSequence charSequence5 = tu5Var.f62891e;
            if (charSequence5 != null) {
                su5VarM22307a.f61422e = charSequence5;
            }
            if (bArr != null) {
                Integer num = tu5Var.f62893g;
                su5VarM22307a.f61423f = bArr == null ? null : (byte[]) bArr.clone();
                su5VarM22307a.f61424g = num;
                tu5 tu5Var2 = tu5.f62885B;
            }
            Integer num2 = tu5Var.f62894h;
            if (num2 != null) {
                su5VarM22307a.f61425h = num2;
            }
            Integer num3 = tu5Var.f62895i;
            if (num3 != null) {
                su5VarM22307a.f61426i = num3;
            }
            Integer num4 = tu5Var.f62896j;
            if (num4 != null) {
                su5VarM22307a.f61427j = num4;
            }
            Boolean bool = tu5Var.f62897k;
            if (bool != null) {
                su5VarM22307a.f61428k = bool;
            }
            Integer num5 = tu5Var.f62898l;
            if (num5 != null) {
                su5VarM22307a.f61429l = num5;
            }
            Integer num6 = tu5Var.f62899m;
            if (num6 != null) {
                su5VarM22307a.f61429l = num6;
            }
            Integer num7 = tu5Var.f62900n;
            if (num7 != null) {
                su5VarM22307a.f61430m = num7;
            }
            Integer num8 = tu5Var.f62901o;
            if (num8 != null) {
                su5VarM22307a.f61431n = num8;
            }
            Integer num9 = tu5Var.f62902p;
            if (num9 != null) {
                su5VarM22307a.f61432o = num9;
            }
            Integer num10 = tu5Var.f62903q;
            if (num10 != null) {
                su5VarM22307a.f61433p = num10;
            }
            Integer num11 = tu5Var.f62904r;
            if (num11 != null) {
                su5VarM22307a.f61434q = num11;
            }
            CharSequence charSequence6 = tu5Var.f62905s;
            if (charSequence6 != null) {
                su5VarM22307a.f61435r = charSequence6;
            }
            CharSequence charSequence7 = tu5Var.f62906t;
            if (charSequence7 != null) {
                su5VarM22307a.f61436s = charSequence7;
            }
            CharSequence charSequence8 = tu5Var.f62907u;
            if (charSequence8 != null) {
                su5VarM22307a.f61437t = charSequence8;
            }
            Integer num12 = tu5Var.f62908v;
            if (num12 != null) {
                su5VarM22307a.f61438u = num12;
            }
            Integer num13 = tu5Var.f62909w;
            if (num13 != null) {
                su5VarM22307a.f61439v = num13;
            }
            CharSequence charSequence9 = tu5Var.f62910x;
            if (charSequence9 != null) {
                su5VarM22307a.f61440w = charSequence9;
            }
            CharSequence charSequence10 = tu5Var.f62911y;
            if (charSequence10 != null) {
                su5VarM22307a.f61441x = charSequence10;
            }
            Integer num14 = tu5Var.f62912z;
            if (num14 != null) {
                su5VarM22307a.f61442y = num14;
            }
            if (!immutableList.isEmpty()) {
                su5VarM22307a.f61443z = ImmutableList.m6287r(immutableList);
            }
        }
        return new tu5(su5VarM22307a);
    }

    /* JADX INFO: renamed from: c */
    public final void m14707c() {
        int i;
        int i2;
        Pair pairM14725w;
        m14705K();
        ArrayList arrayList = this.f46298p;
        int size = arrayList.size();
        int iMin = Math.min(Integer.MAX_VALUE, size);
        if (size <= 0 || iMin == 0) {
            return;
        }
        k97 k97Var = this.f46281a0;
        int iM14717m = m14717m(k97Var);
        long jM14709e = m14709e(k97Var);
        z0a z0aVar = k97Var.f46893a;
        this.f46258E++;
        for (int i3 = iMin - 1; i3 >= 0; i3--) {
            arrayList.remove(i3);
        }
        l69 l69Var = this.f46265L;
        int[] iArr = l69Var.f49200b;
        int[] iArr2 = new int[iArr.length - iMin];
        int i4 = 0;
        for (int i5 = 0; i5 < iArr.length; i5++) {
            int i6 = iArr[i5];
            if (i6 < 0 || i6 >= iMin) {
                int i7 = i5 - i4;
                if (i6 >= 0) {
                    i6 -= iMin;
                }
                iArr2[i7] = i6;
            } else {
                i4++;
            }
        }
        this.f46265L = new l69(iArr2, new Random(l69Var.f49199a.nextLong()));
        ve7 ve7Var = new ve7(arrayList, this.f46265L);
        if (z0aVar.m25398p() || ve7Var.m25398p()) {
            i = 0;
            i2 = -1;
            boolean z = !z0aVar.m25398p() && ve7Var.m25398p();
            pairM14725w = m14725w(ve7Var, z ? -1 : iM14717m, z ? -9223372036854775807L : jM14709e);
        } else {
            Pair pairM25395i = z0aVar.m25395i(this.f46280a, this.f46297o, iM14717m, uma.m22797B(jM14709e));
            Object obj = pairM25395i.first;
            if (ve7Var.mo17285b(obj) != -1) {
                pairM14725w = pairM25395i;
                i = 0;
                i2 = -1;
            } else {
                i = 0;
                i2 = -1;
                int iM20870T = rw2.m20870T(this.f46280a, this.f46297o, 0, this.f46257D, obj, z0aVar, ve7Var);
                if (iM20870T != -1) {
                    y0a y0aVar = this.f46280a;
                    ve7Var.mo39m(iM20870T, y0aVar, 0L);
                    pairM14725w = m14725w(ve7Var, iM20870T, uma.m22805J(y0aVar.f69073j));
                } else {
                    pairM14725w = m14725w(ve7Var, -1, -9223372036854775807L);
                }
            }
        }
        k97 k97VarM14724v = m14724v(k97Var, ve7Var, pairM14725w);
        int i8 = k97VarM14724v.f46897e;
        if (i8 != 1 && i8 != 4 && iM14717m >= 0 && iM14717m < iMin) {
            if (rw2.m20870T(this.f46280a, this.f46297o, 0, this.f46257D, k97Var.f46894b.f46226a, z0aVar, ve7Var) == i2) {
                k97VarM14724v = m14694u(k97VarM14724v, 4);
            }
        }
        l69 l69Var2 = this.f46265L;
        qp9 qp9Var = this.f46294l.f59932h;
        qp9Var.getClass();
        pp9 pp9VarM20096b = qp9.m20096b();
        pp9VarM20096b.f56637a = qp9Var.f58033a.obtainMessage(20, i, iMin, l69Var2);
        pp9VarM20096b.m19440b();
        k97 k97Var2 = k97VarM14724v;
        m14703I(k97Var2, 0, !k97VarM14724v.f46894b.f46226a.equals(this.f46281a0.f46894b.f46226a), 4, m14715k(k97Var2), -1);
    }

    /* JADX INFO: renamed from: d */
    public final long m14708d() {
        m14705K();
        if (m14723t()) {
            k97 k97Var = this.f46281a0;
            return k97Var.f46903k.equals(k97Var.f46894b) ? uma.m22805J(this.f46281a0.f46909q) : m14718n();
        }
        m14705K();
        if (this.f46281a0.f46893a.m25398p()) {
            return this.f46285c0;
        }
        k97 k97Var2 = this.f46281a0;
        long j = 0;
        if (k97Var2.f46903k.f46229d != k97Var2.f46894b.f46229d) {
            return uma.m22805J(k97Var2.f46893a.mo39m(m14712h(), this.f46280a, 0L).f69074k);
        }
        long j2 = k97Var2.f46909q;
        if (this.f46281a0.f46903k.m14690b()) {
            k97 k97Var3 = this.f46281a0;
            k97Var3.f46893a.mo23250g(k97Var3.f46903k.f46226a, this.f46297o).m24226d(this.f46281a0.f46903k.f46227b);
        } else {
            j = j2;
        }
        k97 k97Var4 = this.f46281a0;
        z0a z0aVar = k97Var4.f46893a;
        Object obj = k97Var4.f46903k.f46226a;
        x0a x0aVar = this.f46297o;
        z0aVar.mo23250g(obj, x0aVar);
        return uma.m22805J(j + x0aVar.f67603e);
    }

    /* JADX INFO: renamed from: e */
    public final long m14709e(k97 k97Var) {
        jv5 jv5Var = k97Var.f46894b;
        long j = k97Var.f46895c;
        z0a z0aVar = k97Var.f46893a;
        if (!jv5Var.m14690b()) {
            return uma.m22805J(m14715k(k97Var));
        }
        Object obj = k97Var.f46894b.f46226a;
        x0a x0aVar = this.f46297o;
        z0aVar.mo23250g(obj, x0aVar);
        if (j == -9223372036854775807L) {
            return uma.m22805J(z0aVar.mo39m(m14717m(k97Var), this.f46280a, 0L).f69073j);
        }
        return uma.m22805J(j) + uma.m22805J(x0aVar.f67603e);
    }

    /* JADX INFO: renamed from: f */
    public final int m14710f() {
        m14705K();
        if (m14723t()) {
            return this.f46281a0.f46894b.f46227b;
        }
        return -1;
    }

    /* JADX INFO: renamed from: g */
    public final int m14711g() {
        m14705K();
        if (m14723t()) {
            return this.f46281a0.f46894b.f46228c;
        }
        return -1;
    }

    /* JADX INFO: renamed from: h */
    public final int m14712h() {
        m14705K();
        int iM14717m = m14717m(this.f46281a0);
        if (iM14717m == -1) {
            return 0;
        }
        return iM14717m;
    }

    /* JADX INFO: renamed from: i */
    public final int m14713i() {
        m14705K();
        if (!this.f46281a0.f46893a.m25398p()) {
            k97 k97Var = this.f46281a0;
            return k97Var.f46893a.mo17285b(k97Var.f46894b.f46226a);
        }
        int i = this.f46283b0;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final boolean isScrubbingModeEnabled() {
        m14705K();
        return this.f46261H;
    }

    /* JADX INFO: renamed from: j */
    public final long m14714j() {
        m14705K();
        return uma.m22805J(m14715k(this.f46281a0));
    }

    /* JADX INFO: renamed from: k */
    public final long m14715k(k97 k97Var) {
        if (k97Var.f46893a.m25398p()) {
            return uma.m22797B(this.f46285c0);
        }
        long jM15023k = k97Var.f46908p ? k97Var.m15023k() : k97Var.f46911s;
        if (k97Var.f46894b.m14690b()) {
            return jM15023k;
        }
        z0a z0aVar = k97Var.f46893a;
        Object obj = k97Var.f46894b.f46226a;
        x0a x0aVar = this.f46297o;
        z0aVar.mo23250g(obj, x0aVar);
        return jM15023k + x0aVar.f67603e;
    }

    /* JADX INFO: renamed from: l */
    public final z0a m14716l() {
        m14705K();
        return this.f46281a0.f46893a;
    }

    /* JADX INFO: renamed from: m */
    public final int m14717m(k97 k97Var) {
        return k97Var.f46893a.m25398p() ? this.f46283b0 : k97Var.f46893a.mo23250g(k97Var.f46894b.f46226a, this.f46297o).f67601c;
    }

    /* JADX INFO: renamed from: n */
    public final long m14718n() {
        m14705K();
        if (!m14723t()) {
            z0a z0aVarM14716l = m14716l();
            if (z0aVarM14716l.m25398p()) {
                return -9223372036854775807L;
            }
            return uma.m22805J(z0aVarM14716l.mo39m(m14712h(), this.f46280a, 0L).f69074k);
        }
        k97 k97Var = this.f46281a0;
        jv5 jv5Var = k97Var.f46894b;
        z0a z0aVar = k97Var.f46893a;
        Object obj = jv5Var.f46226a;
        x0a x0aVar = this.f46297o;
        z0aVar.mo23250g(obj, x0aVar);
        return uma.m22805J(x0aVar.m24223a(jv5Var.f46227b, jv5Var.f46228c));
    }

    /* JADX INFO: renamed from: o */
    public final boolean m14719o() {
        m14705K();
        return this.f46281a0.f46904l;
    }

    /* JADX INFO: renamed from: p */
    public final n97 m14720p() {
        m14705K();
        return this.f46281a0.f46907o;
    }

    /* JADX INFO: renamed from: q */
    public final int m14721q() {
        m14705K();
        return this.f46281a0.f46897e;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m14722s() {
        if (m14721q() != 3 || !m14719o()) {
            return false;
        }
        m14705K();
        return this.f46281a0.f46906n == 0;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setImageOutput(ImageOutput imageOutput) {
        m14705K();
        m14728z(4, imageOutput, 15);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setScrubbingModeEnabled(boolean z) {
        d92 d92Var;
        d92 d92Var2;
        d92 d92Var3;
        jo8 jo8Var = this.f46263J;
        i92 i92Var = this.f46291i;
        m14705K();
        if (z == this.f46261H) {
            return;
        }
        this.f46261H = z;
        if (!jo8Var.f45922a.isEmpty()) {
            i92Var.getClass();
            synchronized (i92Var.f43729c) {
                d92Var = i92Var.f43732f;
            }
            if (z) {
                this.f46262I = d92Var.f60540v;
                ImmutableSet immutableSet = jo8Var.f45922a;
                c92 c92Var = new c92(d92Var);
                bga it = immutableSet.iterator();
                while (it.hasNext()) {
                    c92Var.f58921v.add(Integer.valueOf(((Integer) it.next()).intValue()));
                }
                d92Var2 = new d92(c92Var);
            } else {
                d92Var.getClass();
                c92 c92Var2 = new c92(d92Var);
                ImmutableSet immutableSet2 = this.f46262I;
                c92Var2.f58921v.clear();
                c92Var2.f58921v.addAll(immutableSet2);
                d92 d92Var4 = new d92(c92Var2);
                this.f46262I = null;
                d92Var2 = d92Var4;
            }
            if (!d92Var2.equals(d92Var)) {
                i92Var.m13735m(d92Var2);
                synchronized (i92Var.f43729c) {
                    d92Var3 = i92Var.f43732f;
                }
                c92 c92Var3 = new c92(d92Var3);
                c92Var3.m20447a(d92Var2);
                i92Var.m13735m(new d92(c92Var3));
            }
        }
        this.f46294l.f59932h.m20097a(36, Boolean.valueOf(z)).m19440b();
        k97 k97Var = this.f46281a0;
        m14702H(k97Var.f46905m, k97Var.f46904l);
    }

    /* JADX INFO: renamed from: t */
    public final boolean m14723t() {
        m14705K();
        return this.f46281a0.f46894b.m14690b();
    }

    /* JADX INFO: renamed from: v */
    public final k97 m14724v(k97 k97Var, z0a z0aVar, Pair pair) {
        bna.m3969q(z0aVar.m25398p() || pair != null);
        z0a z0aVar2 = k97Var.f46893a;
        long jM14709e = m14709e(k97Var);
        k97 k97VarM15022i = k97Var.m15022i(z0aVar);
        if (z0aVar.m25398p()) {
            jv5 jv5Var = k97.f46892u;
            long jM22797B = uma.m22797B(this.f46285c0);
            k97 k97VarM15015b = k97VarM15022i.m15016c(jv5Var, jM22797B, jM22797B, jM22797B, 0L, k8a.f46867d, this.f46282b, ImmutableList.m6289v()).m15015b(jv5Var);
            k97VarM15015b.f46909q = k97VarM15015b.f46911s;
            return k97VarM15015b;
        }
        Object obj = k97VarM15022i.f46894b.f46226a;
        boolean zEquals = obj.equals(pair.first);
        jv5 jv5Var2 = !zEquals ? new jv5(pair.first) : k97VarM15022i.f46894b;
        long jLongValue = ((Long) pair.second).longValue();
        long jM22797B2 = uma.m22797B(jM14709e);
        if (!z0aVar2.m25398p()) {
            jM22797B2 -= z0aVar2.mo23250g(obj, this.f46297o).f67603e;
            if (zEquals && jM22797B2 - jLongValue == 1 && jM22797B2 == z0aVar2.mo23250g(obj, this.f46297o).f67602d) {
                jM22797B2--;
            }
        }
        if (!zEquals || jLongValue < jM22797B2) {
            jv5 jv5Var3 = jv5Var2;
            bna.m3987z(!jv5Var3.m14690b());
            k97 k97VarM15015b2 = k97VarM15022i.m15016c(jv5Var3, jLongValue, jLongValue, jLongValue, 0L, !zEquals ? k8a.f46867d : k97VarM15022i.f46900h, !zEquals ? this.f46282b : k97VarM15022i.f46901i, !zEquals ? ImmutableList.m6289v() : k97VarM15022i.f46902j).m15015b(jv5Var3);
            k97VarM15015b2.f46909q = jLongValue;
            return k97VarM15015b2;
        }
        if (jLongValue != jM22797B2) {
            jv5 jv5Var4 = jv5Var2;
            bna.m3987z(!jv5Var4.m14690b());
            long jMax = Math.max(0L, k97VarM15022i.f46910r - (jLongValue - jM22797B2));
            long j = k97VarM15022i.f46909q;
            if (k97VarM15022i.f46903k.equals(k97VarM15022i.f46894b)) {
                j = jLongValue + jMax;
            }
            k97 k97VarM15016c = k97VarM15022i.m15016c(jv5Var4, jLongValue, jLongValue, jLongValue, jMax, k97VarM15022i.f46900h, k97VarM15022i.f46901i, k97VarM15022i.f46902j);
            k97VarM15016c.f46909q = j;
            return k97VarM15016c;
        }
        int iMo17285b = z0aVar.mo17285b(k97VarM15022i.f46903k.f46226a);
        if (iMo17285b != -1 && z0aVar.mo16393f(iMo17285b, this.f46297o, false).f67601c == z0aVar.mo23250g(jv5Var2.f46226a, this.f46297o).f67601c) {
            return k97VarM15022i;
        }
        z0aVar.mo23250g(jv5Var2.f46226a, this.f46297o);
        boolean zM14690b = jv5Var2.m14690b();
        x0a x0aVar = this.f46297o;
        long jM24223a = zM14690b ? x0aVar.m24223a(jv5Var2.f46227b, jv5Var2.f46228c) : x0aVar.f67602d;
        jv5 jv5Var5 = jv5Var2;
        k97 k97VarM15015b3 = k97VarM15022i.m15016c(jv5Var5, k97VarM15022i.f46911s, k97VarM15022i.f46911s, k97VarM15022i.f46896d, jM24223a - k97VarM15022i.f46911s, k97VarM15022i.f46900h, k97VarM15022i.f46901i, k97VarM15022i.f46902j).m15015b(jv5Var5);
        k97VarM15015b3.f46909q = jM24223a;
        return k97VarM15015b3;
    }

    /* JADX INFO: renamed from: w */
    public final Pair m14725w(z0a z0aVar, int i, long j) {
        if (z0aVar.m25398p()) {
            this.f46283b0 = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.f46285c0 = j;
            return null;
        }
        if (i == -1 || i >= z0aVar.mo17288o()) {
            i = z0aVar.mo23247a(this.f46257D);
            j = uma.m22805J(z0aVar.mo39m(i, this.f46280a, 0L).f69073j);
        }
        return z0aVar.m25395i(this.f46280a, this.f46297o, i, uma.m22797B(j));
    }

    /* JADX INFO: renamed from: x */
    public final void m14726x() {
        m14705K();
        k97 k97Var = this.f46281a0;
        if (k97Var.f46897e != 1) {
            return;
        }
        k97 k97VarM15018e = k97Var.m15018e(null);
        k97 k97VarM14694u = m14694u(k97VarM15018e, k97VarM15018e.f46893a.m25398p() ? 4 : 2);
        this.f46258E++;
        qp9 qp9Var = this.f46294l.f59932h;
        qp9Var.getClass();
        pp9 pp9VarM20096b = qp9.m20096b();
        pp9VarM20096b.f56637a = qp9Var.f58033a.obtainMessage(29);
        pp9VarM20096b.m19440b();
        m14703I(k97VarM14694u, 1, false, 5, -9223372036854775807L, -1);
    }

    /* JADX INFO: renamed from: y */
    public final void m14727y(long j) {
        int iM14712h = m14712h();
        m14705K();
        if (iM14712h == -1) {
            return;
        }
        bna.m3969q(iM14712h >= 0);
        z0a z0aVar = this.f46281a0.f46893a;
        if (z0aVar.m25398p() || iM14712h < z0aVar.mo17288o()) {
            l52 l52Var = this.f46300r;
            if (!l52Var.f49071h) {
                C3496qf c3496qfM15803E = l52Var.m15803E();
                l52Var.f49071h = true;
                l52Var.m15808J(c3496qfM15803E, -1, new hm2(c3496qfM15803E));
            }
            this.f46258E++;
            if (m14723t()) {
                ss5.m21707d0("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                ow2 ow2Var = new ow2(this.f46281a0);
                ow2Var.m18532c(1);
                jw2 jw2Var = this.f46293k.f70543a;
                jw2Var.f46292j.m20098c(new RunnableC0806bd(21, jw2Var, ow2Var));
                return;
            }
            k97 k97VarM15020g = this.f46281a0;
            int i = k97VarM15020g.f46897e;
            if (i == 3 || (i == 4 && !z0aVar.m25398p())) {
                k97VarM15020g = this.f46281a0.m15020g(2);
            }
            int iM14712h2 = m14712h();
            k97 k97VarM14724v = m14724v(k97VarM15020g, z0aVar, m14725w(z0aVar, iM14712h, j));
            this.f46294l.f59932h.m20097a(3, new qw2(z0aVar, iM14712h, uma.m22797B(j))).m19440b();
            m14703I(k97VarM14724v, 0, true, 1, m14715k(k97VarM14724v), iM14712h2);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m14728z(int i, Object obj, int i2) {
        rw2 rw2Var;
        y90[] y90VarArr = this.f46289g;
        int length = y90VarArr.length;
        int i3 = 0;
        while (true) {
            rw2Var = this.f46294l;
            if (i3 >= length) {
                break;
            }
            y90 y90Var = y90VarArr[i3];
            if (i == -1 || y90Var.f69496b == i) {
                int iM14717m = m14717m(this.f46281a0);
                z0a z0aVar = this.f46281a0.f46893a;
                if (iM14717m == -1) {
                    iM14717m = 0;
                }
                zb7 zb7Var = new zb7(rw2Var, y90Var, z0aVar, iM14717m, rw2Var.f59936j);
                bna.m3987z(!zb7Var.f71308f);
                zb7Var.f71305c = i2;
                bna.m3987z(!zb7Var.f71308f);
                zb7Var.f71306d = obj;
                zb7Var.m25540b();
            }
            i3++;
        }
        for (y90 y90Var2 : this.f46290h) {
            if (y90Var2 != null && (i == -1 || y90Var2.f69496b == i)) {
                int iM14717m2 = m14717m(this.f46281a0);
                z0a z0aVar2 = this.f46281a0.f46893a;
                if (iM14717m2 == -1) {
                    iM14717m2 = 0;
                }
                zb7 zb7Var2 = new zb7(rw2Var, y90Var2, z0aVar2, iM14717m2, rw2Var.f59936j);
                bna.m3987z(!zb7Var2.f71308f);
                zb7Var2.f71305c = i2;
                bna.m3987z(!zb7Var2.f71308f);
                zb7Var2.f71306d = obj;
                zb7Var2.m25540b();
            }
        }
    }
}
