package p000;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.media3.common.C0713b;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.StuckPlayerException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class rw2 implements Handler.Callback, wu5, wpa {

    /* JADX INFO: renamed from: z0 */
    public static final long f59898z0 = uma.m22805J(10000);

    /* JADX INFO: renamed from: H */
    public final long f59899H;

    /* JADX INFO: renamed from: I */
    public final j72 f59900I;

    /* JADX INFO: renamed from: J */
    public final ArrayList f59901J;

    /* JADX INFO: renamed from: K */
    public final mp9 f59902K;

    /* JADX INFO: renamed from: L */
    public final yv2 f59903L;

    /* JADX INFO: renamed from: M */
    public final av5 f59904M;

    /* JADX INFO: renamed from: N */
    public final wv5 f59905N;

    /* JADX INFO: renamed from: O */
    public final f72 f59906O;

    /* JADX INFO: renamed from: P */
    public final xb7 f59907P;

    /* JADX INFO: renamed from: Q */
    public final l52 f59908Q;

    /* JADX INFO: renamed from: R */
    public final qp9 f59909R;

    /* JADX INFO: renamed from: S */
    public final boolean f59910S;

    /* JADX INFO: renamed from: T */
    public final C3164jy f59911T;

    /* JADX INFO: renamed from: U */
    public final boolean f59912U;

    /* JADX INFO: renamed from: V */
    public tt8 f59913V;

    /* JADX INFO: renamed from: X */
    public boolean f59915X;

    /* JADX INFO: renamed from: Y */
    public boolean f59916Y;

    /* JADX INFO: renamed from: Z */
    public qw2 f59917Z;

    /* JADX INFO: renamed from: a */
    public final c68[] f59918a;

    /* JADX INFO: renamed from: a0 */
    public int f59919a0;

    /* JADX INFO: renamed from: b */
    public final y90[] f59920b;

    /* JADX INFO: renamed from: b0 */
    public k97 f59921b0;

    /* JADX INFO: renamed from: c */
    public final boolean[] f59922c;

    /* JADX INFO: renamed from: c0 */
    public ow2 f59923c0;

    /* JADX INFO: renamed from: d */
    public final i92 f59924d;

    /* JADX INFO: renamed from: e */
    public final u8a f59926e;

    /* JADX INFO: renamed from: e0 */
    public boolean f59927e0;

    /* JADX INFO: renamed from: f */
    public final h72 f59928f;

    /* JADX INFO: renamed from: f0 */
    public boolean f59929f0;

    /* JADX INFO: renamed from: g */
    public final u52 f59930g;

    /* JADX INFO: renamed from: h */
    public final qp9 f59932h;

    /* JADX INFO: renamed from: h0 */
    public boolean f59933h0;

    /* JADX INFO: renamed from: i */
    public final sg3 f59934i;

    /* JADX INFO: renamed from: j */
    public final Looper f59936j;

    /* JADX INFO: renamed from: j0 */
    public boolean f59937j0;

    /* JADX INFO: renamed from: k */
    public final y0a f59938k;

    /* JADX INFO: renamed from: k0 */
    public boolean f59939k0;

    /* JADX INFO: renamed from: l */
    public final x0a f59940l;

    /* JADX INFO: renamed from: l0 */
    public boolean f59941l0;

    /* JADX INFO: renamed from: m0 */
    public boolean f59942m0;

    /* JADX INFO: renamed from: n0 */
    public int f59943n0;

    /* JADX INFO: renamed from: o0 */
    public qw2 f59944o0;

    /* JADX INFO: renamed from: p0 */
    public long f59945p0;

    /* JADX INFO: renamed from: q0 */
    public long f59946q0;

    /* JADX INFO: renamed from: r0 */
    public int f59947r0;

    /* JADX INFO: renamed from: s0 */
    public boolean f59948s0;

    /* JADX INFO: renamed from: t0 */
    public ExoPlaybackException f59949t0;

    /* JADX INFO: renamed from: v0 */
    public tv2 f59951v0;

    /* JADX INFO: renamed from: x0 */
    public boolean f59953x0;

    /* JADX INFO: renamed from: w0 */
    public long f59952w0 = -9223372036854775807L;

    /* JADX INFO: renamed from: i0 */
    public int f59935i0 = 0;

    /* JADX INFO: renamed from: d0 */
    public boolean f59925d0 = false;

    /* JADX INFO: renamed from: y0 */
    public float f59954y0 = 1.0f;

    /* JADX INFO: renamed from: W */
    public jo8 f59914W = jo8.f45921b;

    /* JADX INFO: renamed from: u0 */
    public long f59950u0 = -9223372036854775807L;

    /* JADX INFO: renamed from: g0 */
    public long f59931g0 = -9223372036854775807L;

    public rw2(Context context, y90[] y90VarArr, y90[] y90VarArr2, i92 i92Var, u8a u8aVar, h72 h72Var, u52 u52Var, boolean z, l52 l52Var, tt8 tt8Var, f72 f72Var, Looper looper, mp9 mp9Var, yv2 yv2Var, xb7 xb7Var, tv2 tv2Var, final wpa wpaVar, boolean z2) {
        Looper looper2;
        this.f59903L = yv2Var;
        this.f59924d = i92Var;
        this.f59926e = u8aVar;
        this.f59928f = h72Var;
        this.f59930g = u52Var;
        boolean z3 = false;
        this.f59937j0 = z;
        this.f59913V = tt8Var;
        this.f59906O = f72Var;
        this.f59902K = mp9Var;
        this.f59907P = xb7Var;
        this.f59951v0 = tv2Var;
        this.f59908Q = l52Var;
        this.f59912U = z2;
        this.f59899H = h72Var.f41871n;
        w0a w0aVar = z0a.f70734a;
        k97 k97VarM15013j = k97.m15013j(u8aVar);
        this.f59921b0 = k97VarM15013j;
        this.f59923c0 = new ow2(k97VarM15013j);
        this.f59920b = new y90[y90VarArr.length];
        this.f59922c = new boolean[y90VarArr.length];
        i92Var.getClass();
        this.f59918a = new c68[y90VarArr.length];
        boolean z4 = false;
        for (int i = 0; i < y90VarArr.length; i++) {
            y90 y90Var = y90VarArr[i];
            y90Var.f69499e = i;
            y90Var.f69500f = xb7Var;
            y90Var.f69501g = mp9Var;
            this.f59920b[i] = y90Var;
            y90 y90Var2 = this.f59920b[i];
            synchronized (y90Var2.f69495a) {
                y90Var2.f69494M = i92Var;
            }
            y90 y90Var3 = y90VarArr2[i];
            if (y90Var3 != null) {
                y90Var3.f69499e = i;
                y90Var3.f69500f = xb7Var;
                y90Var3.f69501g = mp9Var;
                z4 = true;
            }
            c68[] c68VarArr = this.f59918a;
            y90 y90Var4 = y90VarArr[i];
            c68 c68Var = new c68();
            c68Var.f9642e = y90Var4;
            c68Var.f9640c = i;
            c68Var.f9643f = y90Var3;
            c68Var.f9641d = 0;
            c68Var.f9638a = false;
            c68Var.f9639b = false;
            c68VarArr[i] = c68Var;
        }
        this.f59910S = z4;
        this.f59900I = new j72(this, mp9Var);
        this.f59901J = new ArrayList();
        this.f59938k = new y0a();
        this.f59940l = new x0a();
        bna.m3987z(i92Var.f43727a == null);
        i92Var.f43727a = this;
        i92Var.f43728b = u52Var;
        this.f59948s0 = true;
        qp9 qp9VarM16990a = mp9Var.m16990a(looper, null);
        this.f59909R = qp9VarM16990a;
        this.f59904M = new av5(l52Var, qp9VarM16990a, new C3487q7(this, 11), tv2Var);
        this.f59905N = new wv5(this, l52Var, qp9VarM16990a, xb7Var);
        sg3 sg3Var = new sg3(4);
        this.f59934i = sg3Var;
        synchronized (sg3Var.f60817c) {
            try {
                if (((Looper) sg3Var.f60818d) == null) {
                    if (sg3Var.f60816b == 0 && ((HandlerThread) sg3Var.f60819e) == null) {
                        z3 = true;
                    }
                    bna.m3987z(z3);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    sg3Var.f60819e = handlerThread;
                    handlerThread.start();
                    sg3Var.f60818d = ((HandlerThread) sg3Var.f60819e).getLooper();
                }
                sg3Var.f60816b++;
                looper2 = (Looper) sg3Var.f60818d;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f59936j = looper2;
        qp9 qp9VarM16990a2 = mp9Var.m16990a(looper2, this);
        this.f59932h = qp9VarM16990a2;
        this.f59911T = new C3164jy(context, looper2, this);
        qp9VarM16990a2.m20097a(35, new wpa() { // from class: lw2
            @Override // p000.wpa
            /* JADX INFO: renamed from: c */
            public final void mo12219c(long j, long j2, C0713b c0713b, MediaFormat mediaFormat) {
                wpaVar.mo12219c(j, j2, c0713b, mediaFormat);
                this.f50202a.mo12219c(j, j2, c0713b, mediaFormat);
            }
        }).m19440b();
    }

    /* JADX INFO: renamed from: S */
    public static Pair m20869S(z0a z0aVar, qw2 qw2Var, boolean z, int i, boolean z2, y0a y0aVar, x0a x0aVar) {
        int iM20870T;
        z0a z0aVar2 = qw2Var.f58270a;
        if (z0aVar.m25398p()) {
            return null;
        }
        z0a z0aVar3 = z0aVar2.m25398p() ? z0aVar : z0aVar2;
        try {
            Pair pairM25395i = z0aVar3.m25395i(y0aVar, x0aVar, qw2Var.f58271b, qw2Var.f58272c);
            if (!z0aVar.equals(z0aVar3)) {
                if (z0aVar.mo17285b(pairM25395i.first) == -1) {
                    if (!z || (iM20870T = m20870T(y0aVar, x0aVar, i, z2, pairM25395i.first, z0aVar3, z0aVar)) == -1) {
                        return null;
                    }
                    return z0aVar.m25395i(y0aVar, x0aVar, iM20870T, -9223372036854775807L);
                }
                if (z0aVar3.mo23250g(pairM25395i.first, x0aVar).f67604f && z0aVar3.mo39m(x0aVar.f67601c, y0aVar, 0L).f69075l == z0aVar3.mo17285b(pairM25395i.first)) {
                    return z0aVar.m25395i(y0aVar, x0aVar, z0aVar.mo23250g(pairM25395i.first, x0aVar).f67601c, qw2Var.f58272c);
                }
            }
            return pairM25395i;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: T */
    public static int m20870T(y0a y0aVar, x0a x0aVar, int i, boolean z, Object obj, z0a z0aVar, z0a z0aVar2) {
        z0a z0aVar3 = z0aVar;
        Object obj2 = z0aVar3.mo39m(z0aVar3.mo23250g(obj, x0aVar).f67601c, y0aVar, 0L).f69064a;
        for (int i2 = 0; i2 < z0aVar2.mo17288o(); i2++) {
            if (z0aVar2.mo39m(i2, y0aVar, 0L).f69064a.equals(obj2)) {
                return i2;
            }
        }
        int iMo17285b = z0aVar3.mo17285b(obj);
        int iMo17286h = z0aVar3.mo17286h();
        int iMo17285b2 = -1;
        int i3 = 0;
        while (i3 < iMo17286h && iMo17285b2 == -1) {
            z0a z0aVar4 = z0aVar3;
            int iM25394d = z0aVar4.m25394d(iMo17285b, x0aVar, y0aVar, i, z);
            if (iM25394d == -1) {
                break;
            }
            iMo17285b2 = z0aVar2.mo17285b(z0aVar4.mo17287l(iM25394d));
            i3++;
            z0aVar3 = z0aVar4;
            iMo17285b = iM25394d;
        }
        if (iMo17285b2 == -1) {
            return -1;
        }
        return z0aVar2.mo16393f(iMo17285b2, x0aVar, false).f67601c;
    }

    /* JADX INFO: renamed from: z */
    public static boolean m20871z(yu5 yu5Var) {
        return (yu5Var == null || yu5Var.m25332o() || yu5Var.m25326i() == Long.MIN_VALUE) ? false : true;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m20872A(int i, jv5 jv5Var) {
        av5 av5Var = this.f59904M;
        yu5 yu5Var = av5Var.f7566k;
        if (yu5Var != null && yu5Var.f70478g.f72178a.equals(jv5Var)) {
            c68 c68Var = this.f59918a[i];
            yu5 yu5Var2 = av5Var.f7566k;
            int i2 = c68Var.f9641d;
            boolean z = (i2 == 2 || i2 == 4) && c68Var.m4349d(yu5Var2) == ((y90) c68Var.f9642e);
            boolean z2 = c68Var.f9641d == 3 && c68Var.m4349d(yu5Var2) == ((y90) c68Var.f9643f);
            if (z || z2) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00c2  */
    /* JADX INFO: renamed from: A0 */
    public final void m20873A0() {
        n97 n97VarMo14315e;
        long j;
        float f;
        yu5 yu5Var = this.f59904M.f7564i;
        if (yu5Var == null) {
            return;
        }
        long jMo2552k = yu5Var.f70476e ? yu5Var.f70472a.mo2552k() : -9223372036854775807L;
        if (jMo2552k != -9223372036854775807L) {
            if (!yu5Var.m25333p()) {
                this.f59904M.m3093m(yu5Var);
                m20936u(false);
                m20876C();
            }
            m20891Q(jMo2552k, true);
            if (jMo2552k != this.f59921b0.f46911s) {
                k97 k97Var = this.f59921b0;
                this.f59921b0 = m20944y(k97Var.f46894b, jMo2552k, k97Var.f46895c, jMo2552k, true, 5);
            }
        } else {
            j72 j72Var = this.f59900I;
            boolean z = yu5Var != this.f59904M.f7565j;
            qg9 qg9Var = j72Var.f45135a;
            y90 y90Var = j72Var.f45137c;
            if (y90Var == null || y90Var.mo4258m() || ((z && j72Var.f45137c.f69502h != 2) || (!j72Var.f45137c.mo4259o() && (z || j72Var.f45137c.m24993l())))) {
                j72Var.f45139e = true;
                if (j72Var.f45140f) {
                    qg9Var.m19951f();
                }
            } else {
                qt5 qt5Var = j72Var.f45138d;
                qt5Var.getClass();
                long jMo14312b = qt5Var.mo14312b();
                if (!j72Var.f45139e) {
                    qg9Var.m19950d(jMo14312b);
                    n97VarMo14315e = qt5Var.mo14315e();
                    if (!n97VarMo14315e.equals((n97) qg9Var.f57770e)) {
                        qg9Var.mo14311a(n97VarMo14315e);
                        j72Var.f45136b.f59932h.m20097a(16, n97VarMo14315e).m19440b();
                    }
                } else if (jMo14312b >= qg9Var.mo14312b()) {
                    j72Var.f45139e = false;
                    if (j72Var.f45140f) {
                        qg9Var.m19951f();
                    }
                    qg9Var.m19950d(jMo14312b);
                    n97VarMo14315e = qt5Var.mo14315e();
                    if (!n97VarMo14315e.equals((n97) qg9Var.f57770e)) {
                        qg9Var.mo14311a(n97VarMo14315e);
                        j72Var.f45136b.f59932h.m20097a(16, n97VarMo14315e).m19440b();
                    }
                } else if (qg9Var.f57767b) {
                    qg9Var.m19950d(qg9Var.mo14312b());
                    qg9Var.f57767b = false;
                }
            }
            long jMo14312b2 = j72Var.mo14312b();
            this.f59945p0 = jMo14312b2;
            long jM25341x = yu5Var.m25341x(jMo14312b2);
            long j2 = this.f59921b0.f46911s;
            if (!this.f59901J.isEmpty() && !this.f59921b0.f46894b.m14690b()) {
                if (this.f59948s0) {
                    this.f59948s0 = false;
                }
                k97 k97Var2 = this.f59921b0;
                k97Var2.f46893a.mo17285b(k97Var2.f46894b.f46226a);
                int iMin = Math.min(this.f59947r0, this.f59901J.size());
                if (iMin > 0) {
                    g9a.m12435l(this.f59901J.get(iMin - 1));
                }
                if (iMin < this.f59901J.size()) {
                    g9a.m12435l(this.f59901J.get(iMin));
                }
                this.f59947r0 = iMin;
            }
            if (this.f59900I.mo14313c()) {
                boolean z2 = !this.f59923c0.f55061e;
                k97 k97Var3 = this.f59921b0;
                this.f59921b0 = m20944y(k97Var3.f46894b, jM25341x, k97Var3.f46895c, jM25341x, z2, 6);
            } else {
                k97 k97Var4 = this.f59921b0;
                k97Var4.f46911s = jM25341x;
                k97Var4.f46912t = SystemClock.elapsedRealtime();
            }
        }
        this.f59921b0.f46909q = this.f59904M.f7567l.m25324g();
        k97 k97Var5 = this.f59921b0;
        k97Var5.f46910r = m20926p(k97Var5.f46909q);
        k97 k97Var6 = this.f59921b0;
        if (k97Var6.f46904l && k97Var6.f46897e == 3 && m20931r0(k97Var6.f46893a, k97Var6.f46894b)) {
            k97 k97Var7 = this.f59921b0;
            float f2 = 1.0f;
            if (k97Var7.f46907o.f52510a == 1.0f) {
                f72 f72Var = this.f59906O;
                long jM20920m = m20920m(k97Var7.f46893a, k97Var7.f46894b.f46226a, k97Var7.f46911s);
                long j3 = this.f59921b0.f46910r;
                if (f72Var.f38553c != -9223372036854775807L) {
                    long j4 = jM20920m - j3;
                    long j5 = f72Var.f38563m;
                    if (j5 == -9223372036854775807L) {
                        f72Var.f38563m = j4;
                        f72Var.f38564n = 0L;
                    } else {
                        long jMax = Math.max(j4, (long) ((j4 * 9.999871E-4f) + (j5 * 0.999f)));
                        f72Var.f38563m = jMax;
                        f72Var.f38564n = (long) ((9.999871E-4f * Math.abs(j4 - jMax)) + (f72Var.f38564n * 0.999f));
                    }
                    if (f72Var.f38562l != -9223372036854775807L) {
                        j = 1000;
                        if (SystemClock.elapsedRealtime() - f72Var.f38562l < 1000) {
                            f2 = f72Var.f38561k;
                        }
                    } else {
                        j = 1000;
                    }
                    f72Var.f38562l = SystemClock.elapsedRealtime();
                    long j6 = (f72Var.f38564n * 3) + f72Var.f38563m;
                    if (f72Var.f38558h > j6) {
                        float fM22797B = uma.m22797B(j);
                        f = 1.0E-7f;
                        f72Var.f38558h = hnb.m13381c(j6, f72Var.f38555e, f72Var.f38558h - (((long) ((f72Var.f38561k - 1.0f) * fM22797B)) + ((long) ((f72Var.f38559i - 1.0f) * fM22797B))));
                    } else {
                        f = 1.0E-7f;
                        long jM22813h = uma.m22813h(jM20920m - ((long) (Math.max(0.0f, f72Var.f38561k - 1.0f) / 1.0E-7f)), f72Var.f38558h, j6);
                        f72Var.f38558h = jM22813h;
                        long j7 = f72Var.f38557g;
                        if (j7 != -9223372036854775807L && jM22813h > j7) {
                            f72Var.f38558h = j7;
                        }
                    }
                    long j8 = jM20920m - f72Var.f38558h;
                    if (Math.abs(j8) < f72Var.f38551a) {
                        f72Var.f38561k = 1.0f;
                    } else {
                        f72Var.f38561k = uma.m22811f((f * j8) + 1.0f, f72Var.f38560j, f72Var.f38559i);
                    }
                    f2 = f72Var.f38561k;
                }
                if (this.f59900I.mo14315e().f52510a != f2) {
                    n97 n97Var = new n97(f2, this.f59921b0.f46907o.f52511b);
                    this.f59932h.m20099d(16);
                    this.f59900I.mo14311a(n97Var);
                    m20942x(this.f59921b0.f46907o, this.f59900I.mo14315e().f52510a, false, false);
                }
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public final boolean m20874B() {
        yu5 yu5Var = this.f59904M.f7564i;
        long j = yu5Var.f70478g.f72183f;
        if (yu5Var.f70476e) {
            return j == -9223372036854775807L || this.f59921b0.f46911s < j || !m20929q0();
        }
        return false;
    }

    /* JADX INFO: renamed from: B0 */
    public final void m20875B0(z0a z0aVar, jv5 jv5Var, z0a z0aVar2, jv5 jv5Var2, long j, boolean z) {
        long jM22797B = uma.m22797B(-9223372036854775807L);
        boolean zM20931r0 = m20931r0(z0aVar, jv5Var);
        Object obj = jv5Var.f46226a;
        if (!zM20931r0) {
            n97 n97Var = jv5Var.m14690b() ? n97.f52509d : this.f59921b0.f46907o;
            j72 j72Var = this.f59900I;
            if (j72Var.mo14315e().equals(n97Var)) {
                return;
            }
            this.f59932h.m20099d(16);
            j72Var.mo14311a(n97Var);
            m20942x(this.f59921b0.f46907o, n97Var.f52510a, false, false);
            return;
        }
        x0a x0aVar = this.f59940l;
        int i = z0aVar.mo23250g(obj, x0aVar).f67601c;
        y0a y0aVar = this.f59938k;
        z0aVar.m25397n(i, y0aVar);
        lu5 lu5Var = y0aVar.f69071h;
        f72 f72Var = this.f59906O;
        f72Var.getClass();
        lu5Var.getClass();
        f72Var.f38553c = jM22797B;
        f72Var.f38556f = jM22797B;
        f72Var.f38557g = jM22797B;
        f72Var.f38560j = 0.97f;
        f72Var.f38559i = 1.03f;
        f72Var.m11578a();
        if (j != -9223372036854775807L) {
            f72Var.f38554d = m20920m(z0aVar, obj, j);
            f72Var.m11578a();
            return;
        }
        if (!Objects.equals(!z0aVar2.m25398p() ? z0aVar2.mo39m(z0aVar2.mo23250g(jv5Var2.f46226a, x0aVar).f67601c, y0aVar, 0L).f69064a : null, y0aVar.f69064a) || z) {
            f72Var.f38554d = -9223372036854775807L;
            f72Var.m11578a();
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m20876C() {
        boolean zM13107b;
        if (m20871z(this.f59904M.f7567l)) {
            yu5 yu5Var = this.f59904M.f7567l;
            long jM20926p = m20926p(yu5Var.m25326i());
            yu5 yu5Var2 = this.f59904M.f7564i;
            long j = m20931r0(this.f59921b0.f46893a, yu5Var.f70478g.f72178a) ? this.f59906O.f38558h : -9223372036854775807L;
            xb7 xb7Var = this.f59907P;
            z0a z0aVar = this.f59921b0.f46893a;
            jv5 jv5Var = yu5Var.f70478g.f72178a;
            float f = this.f59900I.mo14315e().f52510a;
            boolean z = this.f59921b0.f46904l;
            dh5 dh5Var = new dh5(xb7Var, z0aVar, jv5Var, jM20926p, f, this.f59929f0, j);
            zM13107b = this.f59928f.m13107b(dh5Var);
            yu5 yu5Var3 = this.f59904M.f7564i;
            if (!zM13107b && yu5Var3.f70476e && jM20926p < 500000 && this.f59899H > 0) {
                yu5Var3.f70472a.mo2549h(this.f59921b0.f46911s);
                zM13107b = this.f59928f.m13107b(dh5Var);
            }
        } else {
            zM13107b = false;
        }
        this.f59933h0 = zM13107b;
        if (zM13107b) {
            yu5 yu5Var4 = this.f59904M.f7567l;
            yu5Var4.getClass();
            nh5 nh5Var = new nh5();
            nh5Var.m17432c(yu5Var4.m25341x(this.f59945p0));
            nh5Var.m17433d(this.f59900I.mo14315e().f52510a);
            nh5Var.m17431b(this.f59931g0);
            yu5Var4.m25321d(nh5Var.m17430a());
        }
        m20939v0();
    }

    /* JADX INFO: renamed from: C0 */
    public final void m20877C0(boolean z, boolean z2) {
        long jElapsedRealtime;
        this.f59929f0 = z;
        if (!z || z2) {
            jElapsedRealtime = -9223372036854775807L;
        } else {
            this.f59902K.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.f59931g0 = jElapsedRealtime;
    }

    /* JADX INFO: renamed from: D */
    public final void m20878D() {
        av5 av5Var = this.f59904M;
        av5Var.m3091k();
        yu5 yu5Var = av5Var.f7568m;
        if (yu5Var != null) {
            xu5 xu5Var = yu5Var.f70472a;
            if ((!yu5Var.f70475d || yu5Var.f70476e) && !xu5Var.mo2550i()) {
                z0a z0aVar = this.f59921b0.f46893a;
                if (yu5Var.f70476e) {
                    xu5Var.mo2557p();
                }
                Iterator it = this.f59928f.f41873p.values().iterator();
                while (it.hasNext()) {
                    if (((g72) it.next()).f40310b) {
                        return;
                    }
                }
                if (!yu5Var.f70475d) {
                    yu5Var.m25335r(this, yu5Var.f70478g.f72179b);
                    return;
                }
                nh5 nh5Var = new nh5();
                nh5Var.m17432c(yu5Var.m25341x(this.f59945p0));
                nh5Var.m17433d(this.f59900I.mo14315e().f52510a);
                nh5Var.m17431b(this.f59931g0);
                yu5Var.m25321d(nh5Var.m17430a());
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m20879E() {
        ow2 ow2Var = this.f59923c0;
        k97 k97Var = this.f59921b0;
        boolean z = ow2Var.f55060d | (((k97) ow2Var.f55062f) != k97Var);
        ow2Var.f55060d = z;
        ow2Var.f55062f = k97Var;
        if (z) {
            jw2 jw2Var = this.f59903L.f70543a;
            jw2Var.f46292j.m20098c(new RunnableC0806bd(21, jw2Var, ow2Var));
            this.f59923c0 = new ow2(this.f59921b0);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m20880F(int i) {
        c68 c68Var = this.f59918a[i];
        try {
            yu5 yu5Var = this.f59904M.f7564i;
            yu5Var.getClass();
            y90 y90VarM4349d = c68Var.m4349d(yu5Var);
            y90VarM4349d.getClass();
            zk8 zk8Var = y90VarM4349d.f69503i;
            zk8Var.getClass();
            zk8Var.mo4200c();
        } catch (IOException | RuntimeException e) {
            int i2 = ((y90) c68Var.f9642e).f69496b;
            if (i2 != 3 && i2 != 5) {
                throw e;
            }
            u8a u8aVarM25330m = this.f59904M.f7564i.m25330m();
            ss5.m21724v("ExoPlayerImplInternal", "Disabling track due to error: ".concat(C0713b.m2519c(((C3565s8[]) u8aVarM25330m.f63595d)[i].m21152c())), e);
            u8a u8aVar = new u8a((b68[]) ((b68[]) u8aVarM25330m.f63594c).clone(), (C3565s8[]) ((C3565s8[]) u8aVarM25330m.f63595d).clone(), (a9a) u8aVarM25330m.f63596e, u8aVarM25330m.f63597f);
            ((b68[]) u8aVar.f63594c)[i] = null;
            ((C3565s8[]) u8aVar.f63595d)[i] = null;
            m20912i(i);
            this.f59904M.f7564i.m25318a(u8aVar, this.f59921b0.f46911s);
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m20881G(final int i, final boolean z) {
        boolean[] zArr = this.f59922c;
        if (zArr[i] != z) {
            zArr[i] = z;
            this.f59909R.m20098c(new Runnable() { // from class: kw2
                @Override // java.lang.Runnable
                public final void run() {
                    rw2 rw2Var = this.f48491a;
                    l52 l52Var = rw2Var.f59908Q;
                    c68[] c68VarArr = rw2Var.f59918a;
                    final int i2 = i;
                    final int i3 = ((y90) c68VarArr[i2].f9642e).f69496b;
                    final C3496qf c3496qfM15807I = l52Var.m15807I();
                    final boolean z2 = z;
                    l52Var.m15808J(c3496qfM15807I, 1033, new sg5() { // from class: b52
                        @Override // p000.sg5
                        public final void invoke(Object obj) {
                            ((InterfaceC3534rf) obj).mo20639x(c3496qfM15807I, i2, i3, z2);
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m20882H() throws Throwable {
        m20938v(this.f59905N.m24166c(), true);
    }

    /* JADX INFO: renamed from: I */
    public final void m20883I() {
        this.f59923c0.m18532c(1);
        throw null;
    }

    /* JADX INFO: renamed from: J */
    public final void m20884J() {
        this.f59923c0.m18532c(1);
        m20889O(false, false, false, true);
        h72 h72Var = this.f59928f;
        ConcurrentHashMap concurrentHashMap = h72Var.f41873p;
        long id = Thread.currentThread().getId();
        long j = h72Var.f41874q;
        bna.m3985y("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j == -1 || j == id);
        h72Var.f41874q = id;
        xb7 xb7Var = this.f59907P;
        g72 g72Var = (g72) concurrentHashMap.get(xb7Var);
        if (g72Var == null) {
            concurrentHashMap.put(xb7Var, new g72());
        } else {
            g72Var.f40309a++;
        }
        g72 g72Var2 = (g72) concurrentHashMap.get(xb7Var);
        g72Var2.getClass();
        Integer num = (Integer) h72Var.f41872o.get(xb7Var.f68029a);
        int iIntValue = (num == null || num.intValue() == -1) ? h72Var.f41869l : num.intValue();
        if (iIntValue == -1) {
            iIntValue = 13107200;
        }
        g72Var2.f40311c = iIntValue;
        g72Var2.f40310b = false;
        m20921m0(this.f59921b0.f46893a.m25398p() ? 4 : 2);
        k97 k97Var = this.f59921b0;
        boolean z = k97Var.f46904l;
        m20946z0(this.f59911T.m14744d(k97Var.f46897e, z), k97Var.f46906n, k97Var.f46905m, z);
        u52 u52Var = this.f59930g;
        u52Var.getClass();
        wv5 wv5Var = this.f59905N;
        ArrayList arrayList = (ArrayList) wv5Var.f67355c;
        bna.m3987z(!wv5Var.f67353a);
        wv5Var.f67364l = u52Var;
        for (int i = 0; i < arrayList.size(); i++) {
            vv5 vv5Var = (vv5) arrayList.get(i);
            wv5Var.m24170h(vv5Var);
            ((HashSet) wv5Var.f67360h).add(vv5Var);
        }
        wv5Var.f67353a = true;
        this.f59932h.m20100e(2);
    }

    /* JADX INFO: renamed from: K */
    public final void m20885K(hg1 hg1Var) {
        sg3 sg3Var = this.f59934i;
        qp9 qp9Var = this.f59932h;
        try {
            m20889O(true, false, true, false);
            m20886L();
            h72 h72Var = this.f59928f;
            xb7 xb7Var = this.f59907P;
            ConcurrentHashMap concurrentHashMap = h72Var.f41873p;
            g72 g72Var = (g72) concurrentHashMap.get(xb7Var);
            if (g72Var != null) {
                int i = g72Var.f40309a - 1;
                g72Var.f40309a = i;
                if (i == 0) {
                    concurrentHashMap.remove(xb7Var);
                    h72Var.m13108c();
                }
            }
            if (h72Var.f41873p.isEmpty()) {
                h72Var.f41874q = -1L;
            }
            C3164jy c3164jy = this.f59911T;
            c3164jy.f46373c = null;
            c3164jy.m14741a();
            c3164jy.m14743c(0);
            this.f59924d.m13734j();
            m20921m0(1);
        } finally {
            qp9Var.f58033a.removeCallbacksAndMessages(null);
            sg3Var.m21359k();
            hg1Var.m13225b();
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m20886L() {
        for (int i = 0; i < this.f59918a.length; i++) {
            y90 y90Var = this.f59920b[i];
            synchronized (y90Var.f69495a) {
                y90Var.f69494M = null;
            }
            c68 c68Var = this.f59918a[i];
            y90 y90Var2 = (y90) c68Var.f9642e;
            bna.m3987z(y90Var2.f69502h == 0);
            y90Var2.mo4263s();
            c68Var.f9638a = false;
            y90 y90Var3 = (y90) c68Var.f9643f;
            if (y90Var3 != null) {
                bna.m3987z(y90Var3.f69502h == 0);
                y90Var3.mo4263s();
                c68Var.f9639b = false;
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m20887M(int i, int i2, l69 l69Var) throws Throwable {
        this.f59923c0.m18532c(1);
        wv5 wv5Var = this.f59905N;
        wv5Var.getClass();
        bna.m3969q(i >= 0 && i <= i2 && i2 <= ((ArrayList) wv5Var.f67355c).size());
        wv5Var.f67363k = l69Var;
        wv5Var.m24172j(i, i2);
        m20938v(wv5Var.m24166c(), false);
    }

    /* JADX INFO: renamed from: N */
    public final void m20888N() {
        int i;
        float f = this.f59900I.mo14315e().f52510a;
        av5 av5Var = this.f59904M;
        yu5 yu5VarM25325h = av5Var.f7564i;
        yu5 yu5Var = av5Var.f7565j;
        u8a u8aVar = null;
        boolean z = true;
        while (yu5VarM25325h != null && yu5VarM25325h.f70476e) {
            u8a u8aVarM25338u = yu5VarM25325h.m25338u(f, this.f59921b0.f46893a);
            u8a u8aVar2 = yu5VarM25325h == this.f59904M.f7564i ? u8aVarM25338u : u8aVar;
            u8a u8aVarM25330m = yu5VarM25325h.m25330m();
            C3565s8[] c3565s8Arr = (C3565s8[]) u8aVarM25338u.f63595d;
            boolean z2 = false;
            if (u8aVarM25330m != null && ((C3565s8[]) u8aVarM25330m.f63595d).length == c3565s8Arr.length) {
                int i2 = 0;
                while (true) {
                    if (i2 >= c3565s8Arr.length) {
                        if (yu5VarM25325h == yu5Var) {
                            z = false;
                        }
                        yu5VarM25325h = yu5VarM25325h.m25325h();
                        u8aVar = u8aVar2;
                    } else if (u8aVarM25338u.m22551l(u8aVarM25330m, i2)) {
                        i2++;
                    }
                }
            }
            av5 av5Var2 = this.f59904M;
            if (z) {
                yu5 yu5Var2 = av5Var2.f7564i;
                boolean z3 = (av5Var2.m3093m(yu5Var2) & 1) != 0;
                boolean[] zArr = new boolean[this.f59918a.length];
                u8aVar2.getClass();
                long jM25319b = yu5Var2.m25319b(u8aVar2, this.f59921b0.f46911s, z3, zArr);
                k97 k97Var = this.f59921b0;
                if (k97Var.f46897e != 4 && jM25319b != k97Var.f46911s) {
                    z2 = true;
                }
                k97 k97Var2 = this.f59921b0;
                i = 4;
                this.f59921b0 = m20944y(k97Var2.f46894b, jM25319b, k97Var2.f46895c, k97Var2.f46896d, z2, 5);
                if (z2) {
                    m20891Q(jM25319b, true);
                }
                m20910h();
                boolean[] zArr2 = new boolean[this.f59918a.length];
                int i3 = 0;
                while (true) {
                    c68[] c68VarArr = this.f59918a;
                    if (i3 >= c68VarArr.length) {
                        break;
                    }
                    int iM4348c = c68VarArr[i3].m4348c();
                    zArr2[i3] = this.f59918a[i3].m4352g();
                    c68 c68Var = this.f59918a[i3];
                    zk8 zk8Var = yu5Var2.f70474c[i3];
                    j72 j72Var = this.f59900I;
                    long j = this.f59945p0;
                    boolean z4 = zArr[i3];
                    y90 y90Var = (y90) c68Var.f9642e;
                    if (c68.m4345h(y90Var)) {
                        if (zk8Var != y90Var.f69503i) {
                            c68Var.m4347a(y90Var, j72Var);
                        } else if (z4) {
                            y90Var.m24991B(j, false, true);
                        }
                    }
                    y90 y90Var2 = (y90) c68Var.f9643f;
                    if (y90Var2 != null && c68.m4345h(y90Var2)) {
                        if (zk8Var != y90Var2.f69503i) {
                            c68Var.m4347a(y90Var2, j72Var);
                        } else if (z4) {
                            y90Var2.m24991B(j, false, true);
                        }
                    }
                    if (iM4348c - this.f59918a[i3].m4348c() > 0) {
                        m20881G(i3, false);
                    }
                    this.f59943n0 -= iM4348c - this.f59918a[i3].m4348c();
                    i3++;
                }
                m20918l(zArr2, this.f59945p0);
                yu5Var2.f70479h = true;
            } else {
                i = 4;
                av5Var2.m3093m(yu5VarM25325h);
                if (yu5VarM25325h.f70476e) {
                    long jMax = Math.max(yu5VarM25325h.f70478g.f72179b, yu5VarM25325h.m25341x(this.f59945p0));
                    if (this.f59910S && m20906f() && this.f59904M.f7566k == yu5VarM25325h) {
                        m20910h();
                    }
                    yu5VarM25325h.m25318a(u8aVarM25338u, jMax);
                }
            }
            m20936u(true);
            if (this.f59921b0.f46897e != i) {
                m20876C();
                m20873A0();
                this.f59932h.m20100e(2);
                return;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x009b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0112 A[PHI: r0
      0x0112: PHI (r0v15 z0a) = (r0v14 z0a), (r0v14 z0a), (r0v34 z0a), (r0v34 z0a) binds: [B:43:0x00d7, B:45:0x00db, B:47:0x00ec, B:49:0x0104] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: O */
    public final void m20889O(boolean z, boolean z2, boolean z3, boolean z4) {
        long j;
        long j2;
        long j3;
        boolean z5;
        z0a z0aVar;
        jv5 jv5Var;
        this.f59932h.m20099d(2);
        this.f59916Y = false;
        if (this.f59917Z != null) {
            this.f59923c0.m18532c(1);
            this.f59917Z = null;
        }
        this.f59949t0 = null;
        m20877C0(false, true);
        j72 j72Var = this.f59900I;
        j72Var.f45140f = false;
        qg9 qg9Var = j72Var.f45135a;
        if (qg9Var.f57767b) {
            qg9Var.m19950d(qg9Var.mo14312b());
            qg9Var.f57767b = false;
        }
        this.f59945p0 = 1000000000000L;
        for (int i = 0; i < this.f59918a.length; i++) {
            try {
                m20912i(i);
            } catch (ExoPlaybackException | RuntimeException e) {
                ss5.m21724v("ExoPlayerImplInternal", "Disable failed.", e);
            }
        }
        this.f59952w0 = -9223372036854775807L;
        if (z) {
            for (c68 c68Var : this.f59918a) {
                try {
                    c68Var.m4355k();
                } catch (RuntimeException e2) {
                    ss5.m21724v("ExoPlayerImplInternal", "Reset failed.", e2);
                }
            }
        }
        this.f59943n0 = 0;
        k97 k97Var = this.f59921b0;
        jv5 jv5Var2 = k97Var.f46894b;
        long j4 = k97Var.f46911s;
        if (this.f59921b0.f46894b.m14690b()) {
            j = this.f59921b0.f46895c;
        } else {
            k97 k97Var2 = this.f59921b0;
            x0a x0aVar = this.f59940l;
            jv5 jv5Var3 = k97Var2.f46894b;
            z0a z0aVar2 = k97Var2.f46893a;
            if (z0aVar2.m25398p() || z0aVar2.mo23250g(jv5Var3.f46226a, x0aVar).f67604f) {
                j = this.f59921b0.f46895c;
            } else {
                j = this.f59921b0.f46911s;
            }
        }
        if (z2) {
            this.f59944o0 = null;
            Pair pairM20924o = m20924o(this.f59921b0.f46893a);
            jv5Var2 = (jv5) pairM20924o.first;
            long jLongValue = ((Long) pairM20924o.second).longValue();
            z5 = jv5Var2.equals(this.f59921b0.f46894b) ? false : true;
            j2 = jLongValue;
            j3 = -9223372036854775807L;
        } else {
            j2 = j4;
            j3 = j;
            z5 = false;
        }
        this.f59904M.m3082b();
        this.f59933h0 = false;
        z0a z0aVarM23252q = this.f59921b0.f46893a;
        if (z3 && (z0aVarM23252q instanceof ve7)) {
            z0aVarM23252q = ((ve7) z0aVarM23252q).m23252q((l69) this.f59905N.f67363k);
            if (jv5Var2.f46227b != -1) {
                z0aVarM23252q.mo23250g(jv5Var2.f46226a, this.f59940l);
                int i2 = this.f59940l.f67601c;
                y0a y0aVar = this.f59938k;
                z0aVarM23252q.mo39m(i2, y0aVar, 0L);
                if (y0aVar.m24824a()) {
                    z0aVar = z0aVarM23252q;
                    jv5Var = new jv5(jv5Var2.f46226a, jv5Var2.f46229d);
                } else {
                    z0aVar = z0aVarM23252q;
                    jv5Var = jv5Var2;
                }
            } else {
                z0aVar = z0aVarM23252q;
                jv5Var = jv5Var2;
            }
        } else {
            z0aVar = z0aVarM23252q;
            jv5Var = jv5Var2;
        }
        k97 k97Var3 = this.f59921b0;
        int i3 = k97Var3.f46897e;
        ExoPlaybackException exoPlaybackException = z4 ? null : k97Var3.f46898f;
        k8a k8aVar = z5 ? k8a.f46867d : k97Var3.f46900h;
        u8a u8aVar = z5 ? this.f59926e : k97Var3.f46901i;
        List listM6289v = z5 ? ImmutableList.m6289v() : k97Var3.f46902j;
        k97 k97Var4 = this.f59921b0;
        this.f59921b0 = new k97(z0aVar, jv5Var, j3, j2, i3, exoPlaybackException, false, k8aVar, u8aVar, listM6289v, jv5Var, k97Var4.f46904l, k97Var4.f46905m, k97Var4.f46906n, k97Var4.f46907o, j2, 0L, j2, 0L, false);
        if (z3) {
            av5 av5Var = this.f59904M;
            if (!av5Var.f7572q.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (int i4 = 0; i4 < av5Var.f7572q.size(); i4++) {
                    ((yu5) av5Var.f7572q.get(i4)).m25337t();
                }
                av5Var.f7572q = arrayList;
                av5Var.f7568m = null;
                av5Var.m3091k();
            }
            wv5 wv5Var = this.f59905N;
            HashMap map = (HashMap) wv5Var.f67358f;
            for (uv5 uv5Var : map.values()) {
                try {
                    uv5Var.f64403a.m19803p(uv5Var.f64404b);
                } catch (RuntimeException e3) {
                    ss5.m21724v("MediaSourceList", "Failed to release child source.", e3);
                }
                q90 q90Var = uv5Var.f64403a;
                tv5 tv5Var = uv5Var.f64405c;
                q90Var.m19805s(tv5Var);
                uv5Var.f64403a.m19804r(tv5Var);
            }
            map.clear();
            ((HashSet) wv5Var.f67360h).clear();
            wv5Var.f67353a = false;
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m20890P() {
        yu5 yu5Var = this.f59904M.f7564i;
        this.f59927e0 = yu5Var != null && yu5Var.f70478g.f72187j && this.f59925d0;
    }

    /* JADX INFO: renamed from: Q */
    public final void m20891Q(long j, boolean z) {
        yu5 yu5Var = this.f59904M.f7564i;
        long jM25342y = yu5Var == null ? j + 1000000000000L : yu5Var.m25342y(j);
        this.f59945p0 = jM25342y;
        this.f59900I.f45135a.m19950d(jM25342y);
        for (c68 c68Var : this.f59918a) {
            long j2 = this.f59945p0;
            y90 y90VarM4349d = c68Var.m4349d(yu5Var);
            if (y90VarM4349d != null) {
                y90VarM4349d.m24991B(j2, false, z);
            }
        }
        for (yu5 yu5VarM25325h = r0.f7564i; yu5VarM25325h != null; yu5VarM25325h = yu5VarM25325h.m25325h()) {
            for (C3565s8 c3565s8 : (C3565s8[]) yu5VarM25325h.m25330m().f63595d) {
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m20892R(z0a z0aVar, z0a z0aVar2) {
        if (z0aVar.m25398p() && z0aVar2.m25398p()) {
            return;
        }
        ArrayList arrayList = this.f59901J;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            g9a.m12435l(arrayList.get(size));
            throw null;
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m20893U(long j) {
        boolean z;
        if (this.f59915X) {
            this.f59914W.getClass();
            z = true;
        } else {
            z = false;
        }
        k97 k97Var = this.f59921b0;
        long jMin = 1000;
        long j2 = f59898z0;
        if (z) {
            jMin = k97Var.f46897e != 3 ? j2 : 1000L;
            for (c68 c68Var : this.f59918a) {
                long j3 = this.f59945p0;
                long j4 = this.f59946q0;
                y90 y90Var = (y90) c68Var.f9643f;
                y90 y90Var2 = (y90) c68Var.f9642e;
                long jMo24692i = c68.m4345h(y90Var2) ? y90Var2.mo24692i(j3, j4) : Long.MAX_VALUE;
                if (y90Var != null && y90Var.f69502h != 0) {
                    jMo24692i = Math.min(jMo24692i, y90Var.mo24692i(j3, j4));
                }
                jMin = Math.min(jMin, uma.m22805J(jMo24692i));
            }
            if (this.f59921b0.m15024l()) {
                yu5 yu5Var = this.f59904M.f7564i;
                yu5 yu5VarM25325h = yu5Var != null ? yu5Var.m25325h() : null;
                if (yu5VarM25325h != null) {
                    if ((uma.m22797B(jMin) * this.f59921b0.f46907o.f52510a) + this.f59945p0 >= yu5VarM25325h.m25328k()) {
                        jMin = Math.min(jMin, j2);
                    }
                }
            }
        } else if (k97Var.f46897e != 3 || m20929q0()) {
            jMin = j2;
        }
        this.f59932h.f58033a.sendEmptyMessageAtTime(2, j + jMin);
    }

    /* JADX INFO: renamed from: V */
    public final void m20894V(boolean z) {
        jv5 jv5Var = this.f59904M.f7564i.f70478g.f72178a;
        long jM20896X = m20896X(jv5Var, this.f59921b0.f46911s, true, false);
        if (jM20896X != this.f59921b0.f46911s) {
            k97 k97Var = this.f59921b0;
            this.f59921b0 = m20944y(jv5Var, jM20896X, k97Var.f46895c, k97Var.f46896d, z, 5);
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m20895W(qw2 qw2Var) throws Throwable {
        long jLongValue;
        long jMax;
        jv5 jv5VarM3094o;
        long j;
        boolean z;
        long j2;
        boolean z2;
        long j3;
        long jMo2546e;
        long j4;
        k97 k97Var;
        int i;
        long j5;
        jv5 jv5Var;
        int i2;
        long j6;
        long j7;
        rw2 rw2Var = this;
        if (rw2Var.f59916Y) {
            if (rw2Var.f59917Z != null) {
                rw2Var.f59919a0++;
                rw2Var.f59923c0.m18532c(1);
            }
            rw2Var.f59917Z = qw2Var;
            return;
        }
        rw2Var.f59923c0.m18532c(1);
        Pair pairM20869S = m20869S(rw2Var.f59921b0.f46893a, qw2Var, true, rw2Var.f59935i0, rw2Var.f59937j0, rw2Var.f59938k, rw2Var.f59940l);
        if (pairM20869S == null) {
            Pair pairM20924o = rw2Var.m20924o(rw2Var.f59921b0.f46893a);
            jv5VarM3094o = (jv5) pairM20924o.first;
            jLongValue = ((Long) pairM20924o.second).longValue();
            z = !rw2Var.f59921b0.f46893a.m25398p();
            j = 0;
            jMax = -9223372036854775807L;
        } else {
            Object obj = pairM20869S.first;
            jLongValue = ((Long) pairM20869S.second).longValue();
            jMax = qw2Var.f58272c == -9223372036854775807L ? -9223372036854775807L : jLongValue;
            jv5VarM3094o = rw2Var.f59904M.m3094o(rw2Var.f59921b0.f46893a, obj, jLongValue);
            if (jv5VarM3094o.m14690b()) {
                rw2Var.f59921b0.f46893a.mo23250g(jv5VarM3094o.f46226a, rw2Var.f59940l);
                if (rw2Var.f59940l.m24227e(jv5VarM3094o.f46227b) == jv5VarM3094o.f46228c) {
                    rw2Var.f59940l.f67605g.getClass();
                }
                rw2Var.f59940l.f67605g.m14950a(jv5VarM3094o.f46227b).getClass();
                jMax = Math.max(jMax, 0L);
                jLongValue = 0;
                j = 0;
            } else {
                j = 0;
                if (qw2Var.f58272c != -9223372036854775807L) {
                    z = false;
                }
            }
            z = true;
        }
        try {
            try {
                if (!rw2Var.f59921b0.f46893a.m25398p()) {
                    k97 k97Var2 = rw2Var.f59921b0;
                    if (pairM20869S == null) {
                        if (k97Var2.f46897e != 1) {
                            rw2Var.m20921m0(4);
                        }
                        rw2Var.m20889O(false, true, false, true);
                    } else {
                        if (jv5VarM3094o.equals(k97Var2.f46894b)) {
                            try {
                                yu5 yu5Var = rw2Var.f59904M.f7564i;
                                if (yu5Var == null || !yu5Var.f70476e || jLongValue == j) {
                                    jMo2546e = jLongValue;
                                } else {
                                    xu5 xu5Var = yu5Var.f70472a;
                                    long j8 = rw2Var.f59938k.f69074k;
                                    if (rw2Var.f59915X && j8 != -9223372036854775807L) {
                                        rw2Var.f59914W.getClass();
                                    }
                                    jMo2546e = xu5Var.mo2546e(jLongValue, rw2Var.f59913V);
                                }
                                long j9 = jMo2546e;
                                if (uma.m22805J(jMo2546e) == uma.m22805J(rw2Var.f59921b0.f46911s) && ((i = (k97Var = rw2Var.f59921b0).f46897e) == 2 || i == 3)) {
                                    j5 = k97Var.f46911s;
                                    z2 = z;
                                    jv5Var = jv5VarM3094o;
                                    i2 = 2;
                                    j6 = j5;
                                    j7 = jMax;
                                } else {
                                    j4 = j9;
                                }
                            } catch (Throwable th) {
                                th = th;
                                z = z;
                                jv5VarM3094o = jv5VarM3094o;
                                z2 = z;
                                j3 = jLongValue;
                                j2 = jMax;
                                rw2Var.f59921b0 = rw2Var.m20944y(jv5VarM3094o, j3, j2, j3, z2, 2);
                                throw th;
                            }
                        } else {
                            j4 = jLongValue;
                        }
                        try {
                            if (rw2Var.f59915X) {
                                try {
                                    for (c68 c68Var : rw2Var.f59918a) {
                                        if (c68Var.m4352g() && ((y90) c68Var.f9642e).f69496b == 2) {
                                            rw2Var.f59916Y = true;
                                            break;
                                        }
                                        rw2Var.f59921b0 = rw2Var.m20944y(jv5VarM3094o, j3, j2, j3, z2, 2);
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    z2 = z;
                                    j3 = jLongValue;
                                    j2 = jMax;
                                }
                            }
                            boolean z3 = rw2Var.f59921b0.f46897e == 4;
                            try {
                                av5 av5Var = rw2Var.f59904M;
                                long jM20896X = rw2Var.m20896X(jv5VarM3094o, j4, av5Var.f7564i != av5Var.f7565j, z3);
                                z2 = (jLongValue != jM20896X) | z;
                                try {
                                    k97 k97Var3 = rw2Var.f59921b0;
                                    jv5 jv5Var2 = jv5VarM3094o;
                                    try {
                                        z0a z0aVar = k97Var3.f46893a;
                                        long j10 = jMax;
                                        try {
                                            rw2Var.m20875B0(z0aVar, jv5Var2, z0aVar, k97Var3.f46894b, j10, true);
                                            jv5Var = jv5Var2;
                                            j7 = j10;
                                            j5 = jM20896X;
                                            i2 = 2;
                                            j6 = j5;
                                            rw2Var = this;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            jv5VarM3094o = jv5Var2;
                                            j2 = j10;
                                            j3 = jM20896X;
                                            rw2Var.f59921b0 = rw2Var.m20944y(jv5VarM3094o, j3, j2, j3, z2, 2);
                                            throw th;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        jv5VarM3094o = jv5Var2;
                                        j2 = jMax;
                                        j3 = jM20896X;
                                        rw2Var.f59921b0 = rw2Var.m20944y(jv5VarM3094o, j3, j2, j3, z2, 2);
                                        throw th;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                j2 = jMax;
                                z2 = z;
                                j3 = jLongValue;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                        }
                    }
                    rw2Var.f59921b0 = rw2Var.m20944y(jv5Var, j5, j7, j6, z2, i2);
                }
                rw2Var.f59944o0 = qw2Var;
                z2 = z;
                jv5Var = jv5VarM3094o;
                j5 = jLongValue;
                j7 = jMax;
                i2 = 2;
                j6 = j5;
                rw2Var = this;
                rw2Var.f59921b0 = rw2Var.m20944y(jv5Var, j5, j7, j6, z2, i2);
            } catch (Throwable th8) {
                th = th8;
                z2 = z;
                jv5VarM3094o = jv5VarM3094o;
            }
        } catch (Throwable th9) {
            th = th9;
            z = z;
            jv5VarM3094o = jv5VarM3094o;
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00f7  */
    /* JADX INFO: renamed from: X */
    public final long m20896X(jv5 jv5Var, long j, boolean z, boolean z2) {
        av5 av5Var;
        m20937u0();
        boolean z3 = true;
        m20877C0(false, true);
        if (z2 || this.f59921b0.f46897e == 3) {
            m20921m0(2);
        }
        yu5 yu5Var = this.f59904M.f7564i;
        yu5 yu5VarM25325h = yu5Var;
        while (yu5VarM25325h != null && !jv5Var.equals(yu5VarM25325h.f70478g.f72178a)) {
            yu5VarM25325h = yu5VarM25325h.m25325h();
        }
        if (z || yu5Var != yu5VarM25325h || (yu5VarM25325h != null && yu5VarM25325h.m25342y(j) < 0)) {
            for (int i = 0; i < this.f59918a.length; i++) {
                m20912i(i);
            }
            this.f59952w0 = -9223372036854775807L;
            if (yu5VarM25325h != null) {
                while (true) {
                    av5Var = this.f59904M;
                    if (av5Var.f7564i == yu5VarM25325h) {
                        break;
                    }
                    av5Var.m3081a();
                }
                av5Var.m3093m(yu5VarM25325h);
                yu5VarM25325h.m25340w(1000000000000L);
                m20918l(new boolean[this.f59918a.length], this.f59904M.f7565j.m25328k());
                yu5VarM25325h.f70479h = true;
            }
        }
        m20910h();
        av5 av5Var2 = this.f59904M;
        if (yu5VarM25325h != null) {
            av5Var2.m3093m(yu5VarM25325h);
            if (!yu5VarM25325h.f70476e) {
                yu5VarM25325h.f70478g = yu5VarM25325h.f70478g.m25791b(j, -9223372036854775807L);
            } else if (yu5VarM25325h.f70477f) {
                if (this.f59915X) {
                    this.f59914W.getClass();
                    if (this.f59921b0.f46893a.m25398p() || !yu5VarM25325h.f70478g.f72178a.equals(this.f59921b0.f46894b)) {
                        j = yu5VarM25325h.f70472a.mo2548g(j);
                        yu5VarM25325h.f70472a.mo2549h(j - this.f59899H);
                    } else {
                        long jM25342y = yu5VarM25325h.m25342y(j);
                        boolean z4 = true;
                        for (c68 c68Var : this.f59918a) {
                            if (c68Var.m4352g()) {
                                y90 y90VarM4349d = c68Var.m4349d(yu5VarM25325h);
                                z4 &= y90VarM4349d != null && y90VarM4349d.mo12158F(jM25342y);
                            }
                        }
                        if (z4) {
                            xu5 xu5Var = yu5VarM25325h.f70472a;
                            long j2 = this.f59921b0.f46911s;
                            tt8 tt8Var = tt8.f62866c;
                            if (xu5Var.mo2546e(j2, tt8Var) == yu5VarM25325h.f70472a.mo2546e(j, tt8Var)) {
                                z3 = false;
                            } else {
                                j = yu5VarM25325h.f70472a.mo2548g(j);
                                yu5VarM25325h.f70472a.mo2549h(j - this.f59899H);
                            }
                        } else {
                            j = yu5VarM25325h.f70472a.mo2548g(j);
                            yu5VarM25325h.f70472a.mo2549h(j - this.f59899H);
                        }
                    }
                } else {
                    j = yu5VarM25325h.f70472a.mo2548g(j);
                    yu5VarM25325h.f70472a.mo2549h(j - this.f59899H);
                }
            }
            m20891Q(j, z3);
            m20876C();
        } else {
            av5Var2.m3082b();
            m20891Q(j, true);
        }
        m20936u(false);
        this.f59932h.m20100e(2);
        return j;
    }

    /* JADX INFO: renamed from: Y */
    public final void m20897Y(zb7 zb7Var) {
        zb7Var.getClass();
        qp9 qp9Var = this.f59932h;
        if (zb7Var.f71307e != this.f59936j) {
            qp9Var.m20097a(15, zb7Var).m19440b();
            return;
        }
        synchronized (zb7Var) {
        }
        try {
            zb7Var.f71303a.mo4256d(zb7Var.f71305c, zb7Var.f71306d);
            zb7Var.m25539a(true);
            int i = this.f59921b0.f46897e;
            if (i == 3 || i == 2) {
                qp9Var.m20100e(2);
            }
        } catch (Throwable th) {
            zb7Var.m25539a(true);
            throw th;
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m20898Z(zb7 zb7Var) {
        Looper looper = zb7Var.f71307e;
        if (looper.getThread().isAlive()) {
            this.f59902K.m16990a(looper, null).m20098c(new RunnableC3781y2(this, zb7Var));
        } else {
            ss5.m21707d0("TAG", "Trying to send message on a dead thread.");
            zb7Var.m25539a(false);
        }
    }

    @Override // p000.wu5
    /* JADX INFO: renamed from: a */
    public final void mo17593a(xu5 xu5Var) {
        this.f59932h.m20097a(9, xu5Var).m19440b();
    }

    /* JADX INFO: renamed from: a0 */
    public final void m20899a0(C3476px c3476px, boolean z) {
        i92 i92Var = this.f59924d;
        if (!i92Var.f43735i.equals(c3476px)) {
            i92Var.f43735i = c3476px;
            i92Var.m13733h();
        }
        if (!z) {
            c3476px = null;
        }
        C3164jy c3164jy = this.f59911T;
        if (!Objects.equals(c3164jy.f46374d, c3476px)) {
            c3164jy.f46374d = c3476px;
            int i = c3476px == null ? 0 : 1;
            c3164jy.f46376f = i;
            bna.m3967p("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", i == 1 || i == 0);
        }
        k97 k97Var = this.f59921b0;
        boolean z2 = k97Var.f46904l;
        m20946z0(c3164jy.m14744d(k97Var.f46897e, z2), k97Var.f46906n, k97Var.f46905m, z2);
    }

    @Override // p000.wu5
    /* JADX INFO: renamed from: b */
    public final void mo17594b(xu5 xu5Var) {
        this.f59932h.m20097a(8, xu5Var).m19440b();
    }

    /* JADX INFO: renamed from: b0 */
    public final void m20900b0(boolean z, hg1 hg1Var) {
        if (this.f59939k0 != z) {
            this.f59939k0 = z;
            if (!z) {
                for (c68 c68Var : this.f59918a) {
                    c68Var.m4355k();
                }
            }
        }
        if (hg1Var != null) {
            hg1Var.m13225b();
        }
    }

    @Override // p000.wpa
    /* JADX INFO: renamed from: c */
    public final void mo12219c(long j, long j2, C0713b c0713b, MediaFormat mediaFormat) {
        if (this.f59916Y) {
            qp9 qp9Var = this.f59932h;
            qp9Var.getClass();
            pp9 pp9VarM20096b = qp9.m20096b();
            pp9VarM20096b.f56637a = qp9Var.f58033a.obtainMessage(37);
            pp9VarM20096b.m19440b();
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m20901c0(nw2 nw2Var) throws Throwable {
        this.f59923c0.m18532c(1);
        if (nw2Var.f53313c != -1) {
            this.f59944o0 = new qw2(new ve7(nw2Var.f53311a, nw2Var.f53312b), nw2Var.f53313c, nw2Var.f53314d);
        }
        List list = nw2Var.f53311a;
        l69 l69Var = nw2Var.f53312b;
        wv5 wv5Var = this.f59905N;
        ArrayList arrayList = (ArrayList) wv5Var.f67355c;
        wv5Var.m24172j(0, arrayList.size());
        m20938v(wv5Var.m24164a(arrayList.size(), list, l69Var), false);
    }

    /* JADX INFO: renamed from: d */
    public final void m20902d(nw2 nw2Var, int i) throws Throwable {
        this.f59923c0.m18532c(1);
        wv5 wv5Var = this.f59905N;
        if (i == -1) {
            i = ((ArrayList) wv5Var.f67355c).size();
        }
        m20938v(wv5Var.m24164a(i, nw2Var.f53311a, nw2Var.f53312b), false);
    }

    /* JADX INFO: renamed from: d0 */
    public final void m20903d0(boolean z) {
        this.f59925d0 = z;
        m20890P();
        if (this.f59927e0) {
            av5 av5Var = this.f59904M;
            if (av5Var.f7565j != av5Var.f7564i) {
                m20894V(true);
                m20936u(false);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m20904e() {
        for (c68 c68Var : this.f59918a) {
            jo8 jo8Var = this.f59915X ? this.f59914W : null;
            ((y90) c68Var.f9642e).mo4256d(18, jo8Var);
            y90 y90Var = (y90) c68Var.f9643f;
            if (y90Var != null) {
                y90Var.mo4256d(18, jo8Var);
            }
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m20905e0(n97 n97Var) {
        this.f59932h.m20099d(16);
        j72 j72Var = this.f59900I;
        j72Var.mo14311a(n97Var);
        n97 n97VarMo14315e = j72Var.mo14315e();
        m20942x(n97VarMo14315e, n97VarMo14315e.f52510a, true, true);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m20906f() {
        if (!this.f59910S) {
            return false;
        }
        for (c68 c68Var : this.f59918a) {
            if (c68Var.m4351f()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f0 */
    public final void m20907f0(tv2 tv2Var) {
        this.f59951v0 = tv2Var;
        z0a z0aVar = this.f59921b0.f46893a;
        av5 av5Var = this.f59904M;
        av5Var.getClass();
        tv2Var.getClass();
        if (av5Var.f7572q.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < av5Var.f7572q.size(); i++) {
            ((yu5) av5Var.f7572q.get(i)).m25337t();
        }
        av5Var.f7572q = arrayList;
        av5Var.f7568m = null;
        av5Var.m3091k();
    }

    /* JADX INFO: renamed from: g */
    public final void m20908g() {
        m20888N();
        m20894V(true);
    }

    /* JADX INFO: renamed from: g0 */
    public final void m20909g0(int i) {
        this.f59935i0 = i;
        z0a z0aVar = this.f59921b0.f46893a;
        av5 av5Var = this.f59904M;
        av5Var.f7562g = i;
        int iM3096q = av5Var.m3096q(z0aVar);
        if ((iM3096q & 1) != 0) {
            m20894V(true);
        } else if ((iM3096q & 2) != 0) {
            m20910h();
        }
        m20936u(false);
    }

    /* JADX INFO: renamed from: h */
    public final void m20910h() {
        y90 y90Var;
        if (this.f59910S && m20906f()) {
            for (c68 c68Var : this.f59918a) {
                int iM4348c = c68Var.m4348c();
                if (c68Var.m4351f()) {
                    int i = c68Var.f9641d;
                    boolean z = i == 4 || i == 2;
                    int i2 = i != 4 ? 0 : 1;
                    if (z) {
                        y90Var = (y90) c68Var.f9642e;
                    } else {
                        y90Var = (y90) c68Var.f9643f;
                        y90Var.getClass();
                    }
                    c68Var.m4347a(y90Var, this.f59900I);
                    c68Var.m4353i(z);
                    c68Var.f9641d = i2;
                }
                this.f59943n0 -= iM4348c - c68Var.m4348c();
            }
            this.f59952w0 = -9223372036854775807L;
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m20911h0(boolean z) throws Throwable {
        if (!z) {
            qw2 qw2Var = this.f59917Z;
            qp9 qp9Var = this.f59932h;
            if (qw2Var != null && this.f59916Y && !qp9Var.f58033a.hasMessages(37)) {
                this.f59919a0++;
            }
            int i = this.f59919a0;
            if (i > 0) {
                this.f59909R.m20098c(new RunnableC2971eo(this, i, 2));
            }
            this.f59919a0 = 0;
            this.f59916Y = false;
            qp9Var.m20099d(37);
            qw2 qw2Var2 = this.f59917Z;
            if (qw2Var2 != null) {
                m20895W(qw2Var2);
                this.f59917Z = null;
                this.f59916Y = false;
            }
        }
        this.f59915X = z;
        m20904e();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        int i;
        yu5 yu5Var;
        jv5 jv5Var;
        yu5 yu5Var2;
        int i2 = DescriptorProtos.Edition.EDITION_2023_VALUE;
        try {
            switch (message.what) {
                case 1:
                    boolean z = message.arg1 != 0;
                    int i3 = message.arg2;
                    this.f59923c0.m18532c(1);
                    m20946z0(this.f59911T.m14744d(this.f59921b0.f46897e, z), i3 >> 4, i3 & 15, z);
                    break;
                case 2:
                    m20914j();
                    break;
                case 3:
                    m20895W((qw2) message.obj);
                    break;
                case 4:
                    m20905e0((n97) message.obj);
                    break;
                case 5:
                    m20915j0((tt8) message.obj);
                    break;
                case 6:
                    m20935t0(false, true);
                    break;
                case 7:
                    m20885K((hg1) message.obj);
                    return true;
                case 8:
                    m20940w((xu5) message.obj);
                    break;
                case 9:
                    m20932s((xu5) message.obj);
                    break;
                case 10:
                    m20888N();
                    break;
                case 11:
                    m20909g0(message.arg1);
                    break;
                case 12:
                    m20917k0(message.arg1 != 0);
                    break;
                case 13:
                    m20900b0(message.arg1 != 0, (hg1) message.obj);
                    break;
                case 14:
                    m20897Y((zb7) message.obj);
                    break;
                case 15:
                    m20898Z((zb7) message.obj);
                    break;
                case 16:
                    n97 n97Var = (n97) message.obj;
                    m20942x(n97Var, n97Var.f52510a, true, false);
                    break;
                case 17:
                    m20901c0((nw2) message.obj);
                    break;
                case 18:
                    m20902d((nw2) message.obj, message.arg1);
                    break;
                case 19:
                    g9a.m12435l(message.obj);
                    m20883I();
                    throw null;
                case 20:
                    m20887M(message.arg1, message.arg2, (l69) message.obj);
                    break;
                case 21:
                    m20919l0((l69) message.obj);
                    break;
                case 22:
                    m20882H();
                    break;
                case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                    m20903d0(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    m20908g();
                    break;
                case 26:
                    m20888N();
                    m20894V(true);
                    break;
                case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    m20943x0(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    m20907f0((tv2) message.obj);
                    break;
                case 29:
                    m20884J();
                    break;
                case 30:
                    Pair pair = (Pair) message.obj;
                    m20925o0(pair.first, (hg1) pair.second);
                    break;
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    m20899a0((C3476px) message.obj, message.arg1 != 0);
                    break;
                case 32:
                    m20927p0(((Float) message.obj).floatValue());
                    break;
                case 33:
                    m20928q(message.arg1);
                    break;
                case 34:
                    m20930r();
                    break;
                case DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                    m20923n0((wpa) message.obj);
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    m20911h0(((Boolean) message.obj).booleanValue());
                    break;
                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    this.f59916Y = false;
                    qw2 qw2Var = this.f59917Z;
                    if (qw2Var != null) {
                        m20895W(qw2Var);
                        this.f59917Z = null;
                    }
                    break;
                case 38:
                    m20913i0((jo8) message.obj);
                    break;
            }
        } catch (ParserException e) {
            boolean z2 = e.f6371a;
            int i4 = e.f6372b;
            if (i4 == 1) {
                i2 = z2 ? 3001 : 3003;
            } else if (i4 == 4) {
                i2 = z2 ? 3002 : 3004;
            }
            m20934t(e, i2);
        } catch (DataSourceException e2) {
            m20934t(e2, e2.f6436a);
        } catch (ExoPlaybackException e3) {
            e = e3;
            int i5 = e.f6439c;
            av5 av5Var = this.f59904M;
            if (i5 == 1 && (yu5Var2 = av5Var.f7565j) != null && e.f6444h == null) {
                e = e.m2529b(yu5Var2.f70478g.f72178a);
            }
            int i6 = e.f6439c;
            qp9 qp9Var = this.f59932h;
            if (i6 == 1 && (jv5Var = e.f6444h) != null && m20872A(e.f6441e, jv5Var)) {
                this.f59953x0 = true;
                m20910h();
                yu5 yu5VarM3087g = av5Var.m3087g();
                yu5 yu5VarM25325h = av5Var.f7564i;
                if (yu5VarM25325h != yu5VarM3087g) {
                    while (yu5VarM25325h != null && yu5VarM25325h.m25325h() != yu5VarM3087g) {
                        yu5VarM25325h = yu5VarM25325h.m25325h();
                    }
                }
                av5Var.m3093m(yu5VarM25325h);
                if (this.f59921b0.f46897e != 4) {
                    m20876C();
                    qp9Var.m20100e(2);
                }
            } else {
                ExoPlaybackException exoPlaybackException = this.f59949t0;
                if (exoPlaybackException != null) {
                    exoPlaybackException.addSuppressed(e);
                    e = this.f59949t0;
                }
                if (e.f6439c == 1 && av5Var.f7564i != av5Var.f7565j) {
                    while (true) {
                        yu5Var = av5Var.f7564i;
                        if (yu5Var == av5Var.f7565j) {
                            break;
                        }
                        av5Var.m3081a();
                    }
                    bna.m3975t(yu5Var);
                    m20879E();
                    zu5 zu5Var = yu5Var.f70478g;
                    jv5 jv5Var2 = zu5Var.f72178a;
                    long j = zu5Var.f72179b;
                    this.f59921b0 = m20944y(jv5Var2, j, zu5Var.f72181d, j, true, 0);
                }
                if (e.f6445i && (this.f59949t0 == null || (i = e.f6373a) == 5004 || i == 5003)) {
                    ss5.m21709e0("ExoPlayerImplInternal", "Recoverable renderer error", e);
                    if (this.f59949t0 == null) {
                        this.f59949t0 = e;
                    }
                    pp9 pp9VarM20097a = qp9Var.m20097a(25, e);
                    Handler handler = qp9Var.f58033a;
                    Message message2 = pp9VarM20097a.f56637a;
                    message2.getClass();
                    handler.sendMessageAtFrontOfQueue(message2);
                    pp9VarM20097a.m19439a();
                } else {
                    ss5.m21724v("ExoPlayerImplInternal", "Playback error", e);
                    m20935t0(true, false);
                    this.f59921b0 = this.f59921b0.m15018e(e);
                }
            }
        } catch (DrmSession$DrmSessionException e4) {
            m20934t(e4, e4.f6453a);
        } catch (BehindLiveWindowException e5) {
            m20934t(e5, 1002);
        } catch (IOException e6) {
            m20934t(e6, 2000);
        } catch (RuntimeException e7) {
            if ((e7 instanceof IllegalStateException) || (e7 instanceof IllegalArgumentException)) {
                i2 = 1004;
            }
            ExoPlaybackException exoPlaybackExceptionM2528e = ExoPlaybackException.m2528e(e7, i2);
            ss5.m21724v("ExoPlayerImplInternal", "Playback error", exoPlaybackExceptionM2528e);
            m20935t0(true, false);
            this.f59921b0 = this.f59921b0.m15018e(exoPlaybackExceptionM2528e);
        }
        m20879E();
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final void m20912i(int i) {
        c68[] c68VarArr = this.f59918a;
        int iM4348c = c68VarArr[i].m4348c();
        c68 c68Var = c68VarArr[i];
        y90 y90Var = (y90) c68Var.f9642e;
        j72 j72Var = this.f59900I;
        c68Var.m4347a(y90Var, j72Var);
        y90 y90Var2 = (y90) c68Var.f9643f;
        if (y90Var2 != null) {
            boolean z = (y90Var2.f69502h == 0 || c68Var.f9641d == 3) ? false : true;
            c68Var.m4347a(y90Var2, j72Var);
            c68Var.m4353i(false);
            if (z) {
                y90 y90Var3 = (y90) c68Var.f9642e;
                y90Var2.getClass();
                y90Var2.mo4256d(17, y90Var3);
            }
        }
        c68Var.f9641d = 0;
        m20881G(i, false);
        this.f59943n0 -= iM4348c;
    }

    /* JADX INFO: renamed from: i0 */
    public final void m20913i0(jo8 jo8Var) {
        this.f59914W = jo8Var;
        m20904e();
    }

    /* JADX WARN: Code duplicated, block: B:116:0x01da  */
    /* JADX WARN: Code duplicated, block: B:149:0x0254  */
    /* JADX WARN: Code duplicated, block: B:151:0x0261  */
    /* JADX WARN: Code duplicated, block: B:182:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:185:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:187:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:191:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:205:0x0345  */
    /* JADX WARN: Code duplicated, block: B:208:0x0352  */
    /* JADX WARN: Code duplicated, block: B:211:0x035b  */
    /* JADX WARN: Code duplicated, block: B:214:0x0360  */
    /* JADX WARN: Code duplicated, block: B:218:0x0367  */
    /* JADX WARN: Code duplicated, block: B:221:0x036e  */
    /* JADX WARN: Code duplicated, block: B:224:0x0379  */
    /* JADX WARN: Code duplicated, block: B:241:0x02f5 A[EDGE_INSN: B:241:0x02f5->B:189:0x02f5 BREAK  A[LOOP:1: B:183:0x02e2->B:188:0x02f2], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:243:0x02f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:93:0x0159  */
    /* JADX INFO: renamed from: j */
    public final void m20914j() {
        boolean z;
        boolean z2;
        long j;
        boolean z3;
        boolean z4;
        boolean zM20874B;
        boolean z5;
        k97 k97Var;
        int i;
        int i2;
        c68[] c68VarArr;
        k97 k97Var2;
        this.f59902K.getClass();
        long jUptimeMillis = SystemClock.uptimeMillis();
        this.f59932h.m20099d(2);
        if (!this.f59912U) {
            m20945y0();
        }
        int i3 = this.f59921b0.f46897e;
        if (i3 == 1 || i3 == 4) {
            return;
        }
        if (this.f59912U) {
            m20945y0();
        }
        yu5 yu5Var = this.f59904M.f7564i;
        if (yu5Var == null) {
            m20893U(jUptimeMillis);
            return;
        }
        g8d.m12416a("doSomeWork");
        m20873A0();
        if (yu5Var.f70476e) {
            this.f59902K.getClass();
            this.f59946q0 = uma.m22797B(SystemClock.elapsedRealtime());
            yu5Var.f70472a.mo2549h(this.f59921b0.f46911s - this.f59899H);
            z = true;
            z2 = true;
            int i4 = 0;
            while (true) {
                c68[] c68VarArr2 = this.f59918a;
                if (i4 >= c68VarArr2.length) {
                    break;
                }
                c68 c68Var = c68VarArr2[i4];
                if (c68Var.m4348c() == 0) {
                    m20881G(i4, false);
                } else {
                    long j2 = this.f59945p0;
                    long j3 = this.f59946q0;
                    y90 y90Var = (y90) c68Var.f9643f;
                    y90 y90Var2 = (y90) c68Var.f9642e;
                    if (c68.m4345h(y90Var2)) {
                        y90Var2.mo4266z(j2, j3);
                    }
                    if (y90Var != null && y90Var.f69502h != 0) {
                        y90Var.mo4266z(j2, j3);
                    }
                    if (z) {
                        y90 y90Var3 = (y90) c68Var.f9643f;
                        y90 y90Var4 = (y90) c68Var.f9642e;
                        boolean zMo4258m = c68.m4345h(y90Var4) ? y90Var4.mo4258m() : true;
                        if (y90Var3 != null && y90Var3.f69502h != 0) {
                            zMo4258m &= y90Var3.mo4258m();
                        }
                        if (zMo4258m) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    y90 y90VarM4349d = c68Var.m4349d(yu5Var);
                    boolean z6 = y90VarM4349d == null || y90VarM4349d.m24993l() || y90VarM4349d.mo4259o() || y90VarM4349d.mo4258m();
                    m20881G(i4, z6);
                    z2 = z2 && z6;
                    if (!z6) {
                        m20880F(i4);
                    }
                }
                i4++;
            }
        } else {
            yu5Var.f70472a.mo2547f();
            z = true;
            z2 = true;
        }
        long j4 = yu5Var.f70478g.f72183f;
        boolean z7 = z && yu5Var.f70476e && (j4 == -9223372036854775807L || j4 <= this.f59921b0.f46911s);
        if (z7 && this.f59927e0) {
            this.f59927e0 = false;
            int i5 = this.f59921b0.f46906n;
            this.f59923c0.m18532c(0);
            m20946z0(this.f59911T.m14744d(this.f59921b0.f46897e, false), i5, 5, false);
        }
        if (!z7 || !yu5Var.f70478g.f72188k) {
            k97 k97Var3 = this.f59921b0;
            if (k97Var3.f46897e == 2) {
                av5 av5Var = this.f59904M;
                if (this.f59943n0 != 0) {
                    if (!z2) {
                        zM20874B = false;
                    } else if (k97Var3.f46899g) {
                        yu5 yu5Var2 = av5Var.f7564i;
                        long j5 = m20931r0(k97Var3.f46893a, yu5Var2.f70478g.f72178a) ? this.f59906O.f38558h : -9223372036854775807L;
                        yu5 yu5Var3 = av5Var.f7567l;
                        boolean z8 = yu5Var3.m25333p() && yu5Var3.f70478g.f72188k;
                        boolean z9 = yu5Var3.f70478g.f72178a.m14690b() && !yu5Var3.f70476e;
                        if (z8 || z9) {
                            j = -9223372036854775807L;
                        } else {
                            long jM20926p = m20926p(yu5Var3.m25324g());
                            h72 h72Var = this.f59928f;
                            xb7 xb7Var = this.f59907P;
                            j = -9223372036854775807L;
                            z0a z0aVar = this.f59921b0.f46893a;
                            jv5 jv5Var = yu5Var2.f70478g.f72178a;
                            float f = this.f59900I.mo14315e().f52510a;
                            boolean z10 = this.f59921b0.f46904l;
                            boolean z11 = this.f59929f0;
                            h72Var.getClass();
                            long j6 = j5;
                            mu5 mu5Var = z0aVar.mo39m(z0aVar.mo23250g(jv5Var.f46226a, h72Var.f41859b).f67601c, h72Var.f41858a, 0L).f69065b.f56811b;
                            if (mu5Var == null) {
                                z4 = false;
                            } else {
                                String scheme = mu5Var.f51852a.getScheme();
                                if (TextUtils.isEmpty(scheme) || h72.f41857r.contains(scheme)) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                            }
                            if (f != 1.0f) {
                                jM20926p = Math.round(jM20926p / ((double) f));
                            }
                            long jMin = z11 ? z4 ? h72Var.f41868k : h72Var.f41867j : z4 ? h72Var.f41866i : h72Var.f41865h;
                            if (j6 != -9223372036854775807L) {
                                jMin = Math.min(j6 / 2, jMin);
                            }
                            if (jMin > 0 && jM20926p < jMin) {
                                if (!(z4 ? h72Var.f41870m : false)) {
                                    g72 g72Var = (g72) h72Var.f41873p.get(xb7Var);
                                    g72Var.getClass();
                                    int iM12403a = g72Var.m12403a() * h72Var.f41860c.f63380b;
                                    g72 g72Var2 = (g72) h72Var.f41873p.get(xb7Var);
                                    g72Var2.getClass();
                                    if (iM12403a >= g72Var2.f40311c) {
                                    }
                                }
                                zM20874B = false;
                            }
                        }
                        zM20874B = true;
                    } else {
                        j = -9223372036854775807L;
                        zM20874B = true;
                    }
                    if (zM20874B) {
                        m20921m0(3);
                        this.f59949t0 = null;
                        if (m20929q0()) {
                            m20877C0(false, false);
                            j72 j72Var = this.f59900I;
                            z3 = true;
                            j72Var.f45140f = true;
                            j72Var.f45135a.m19951f();
                            m20933s0();
                        }
                    }
                    if (this.f59921b0.f46897e == 2) {
                        i2 = 0;
                        while (true) {
                            c68VarArr = this.f59918a;
                            if (i2 < c68VarArr.length) {
                                break;
                            }
                            if (c68VarArr[i2].m4349d(yu5Var) != null) {
                                m20880F(i2);
                            }
                            i2++;
                        }
                        k97Var2 = this.f59921b0;
                        if (k97Var2.f46899g && k97Var2.f46910r < 500000 && m20871z(this.f59904M.f7567l) && m20929q0()) {
                            long j7 = this.f59950u0;
                            mp9 mp9Var = this.f59902K;
                            if (j7 == -9223372036854775807L) {
                                mp9Var.getClass();
                                this.f59950u0 = SystemClock.elapsedRealtime();
                            } else {
                                mp9Var.getClass();
                                if (SystemClock.elapsedRealtime() - this.f59950u0 >= 4000) {
                                    throw new StuckPlayerException(0, 4000);
                                }
                            }
                        } else {
                            this.f59950u0 = -9223372036854775807L;
                        }
                    } else {
                        this.f59950u0 = -9223372036854775807L;
                    }
                    if (m20929q0() || this.f59921b0.f46897e != 3) {
                        z5 = false;
                    } else {
                        z5 = z3;
                    }
                    if (this.f59942m0 || !this.f59941l0 || !z5) {
                        z3 = false;
                    }
                    k97Var = this.f59921b0;
                    if (k97Var.f46908p != z3) {
                        this.f59921b0 = k97Var.m15021h(z3);
                    }
                    this.f59941l0 = false;
                    if (!z3 && (i = this.f59921b0.f46897e) != 4 && (z5 || i == 2 || (i == 3 && this.f59943n0 != 0))) {
                        m20893U(jUptimeMillis);
                    }
                    g8d.m12417b();
                }
                zM20874B = m20874B();
                j = -9223372036854775807L;
                if (zM20874B) {
                    m20921m0(3);
                    this.f59949t0 = null;
                    if (m20929q0()) {
                        m20877C0(false, false);
                        j72 j72Var2 = this.f59900I;
                        z3 = true;
                        j72Var2.f45140f = true;
                        j72Var2.f45135a.m19951f();
                        m20933s0();
                    }
                }
                if (this.f59921b0.f46897e == 2) {
                    i2 = 0;
                    while (true) {
                        c68VarArr = this.f59918a;
                        if (i2 < c68VarArr.length) {
                            break;
                            break;
                        } else {
                            if (c68VarArr[i2].m4349d(yu5Var) != null) {
                                m20880F(i2);
                            }
                            i2++;
                        }
                    }
                    k97Var2 = this.f59921b0;
                    if (k97Var2.f46899g) {
                        this.f59950u0 = -9223372036854775807L;
                    } else {
                        this.f59950u0 = -9223372036854775807L;
                    }
                } else {
                    this.f59950u0 = -9223372036854775807L;
                }
                if (m20929q0()) {
                    z5 = false;
                } else {
                    z5 = false;
                }
                if (this.f59942m0) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                k97Var = this.f59921b0;
                if (k97Var.f46908p != z3) {
                    this.f59921b0 = k97Var.m15021h(z3);
                }
                this.f59941l0 = false;
                if (!z3) {
                    m20893U(jUptimeMillis);
                }
                g8d.m12417b();
            }
            j = -9223372036854775807L;
            z3 = true;
            if (this.f59921b0.f46897e == 3 && (this.f59943n0 != 0 ? !z2 : !m20874B())) {
                m20877C0(m20929q0(), false);
                m20921m0(2);
                if (this.f59929f0) {
                    for (yu5 yu5VarM25325h = this.f59904M.f7564i; yu5VarM25325h != null; yu5VarM25325h = yu5VarM25325h.m25325h()) {
                        for (C3565s8 c3565s8 : (C3565s8[]) yu5VarM25325h.m25330m().f63595d) {
                        }
                    }
                    f72 f72Var = this.f59906O;
                    long j8 = f72Var.f38558h;
                    if (j8 != j) {
                        long j9 = j8 + f72Var.f38552b;
                        f72Var.f38558h = j9;
                        long j10 = f72Var.f38557g;
                        if (j10 != j && j9 > j10) {
                            f72Var.f38558h = j10;
                        }
                        f72Var.f38562l = j;
                    }
                }
                m20937u0();
            }
            if (this.f59921b0.f46897e == 2) {
                i2 = 0;
                while (true) {
                    c68VarArr = this.f59918a;
                    if (i2 < c68VarArr.length) {
                        break;
                        break;
                    } else {
                        if (c68VarArr[i2].m4349d(yu5Var) != null) {
                            m20880F(i2);
                        }
                        i2++;
                    }
                }
                k97Var2 = this.f59921b0;
                if (k97Var2.f46899g) {
                    this.f59950u0 = -9223372036854775807L;
                } else {
                    this.f59950u0 = -9223372036854775807L;
                }
            } else {
                this.f59950u0 = -9223372036854775807L;
            }
            if (m20929q0()) {
                z5 = false;
            } else {
                z5 = false;
            }
            if (this.f59942m0) {
                z3 = false;
            } else {
                z3 = false;
            }
            k97Var = this.f59921b0;
            if (k97Var.f46908p != z3) {
                this.f59921b0 = k97Var.m15021h(z3);
            }
            this.f59941l0 = false;
            if (!z3) {
                m20893U(jUptimeMillis);
            }
            g8d.m12417b();
        }
        m20921m0(4);
        m20937u0();
        z3 = true;
        if (this.f59921b0.f46897e == 2) {
            i2 = 0;
            while (true) {
                c68VarArr = this.f59918a;
                if (i2 < c68VarArr.length) {
                    break;
                    break;
                } else {
                    if (c68VarArr[i2].m4349d(yu5Var) != null) {
                        m20880F(i2);
                    }
                    i2++;
                }
            }
            k97Var2 = this.f59921b0;
            if (k97Var2.f46899g) {
                this.f59950u0 = -9223372036854775807L;
            } else {
                this.f59950u0 = -9223372036854775807L;
            }
        } else {
            this.f59950u0 = -9223372036854775807L;
        }
        if (m20929q0()) {
            z5 = false;
        } else {
            z5 = false;
        }
        if (this.f59942m0) {
            z3 = false;
        } else {
            z3 = false;
        }
        k97Var = this.f59921b0;
        if (k97Var.f46908p != z3) {
            this.f59921b0 = k97Var.m15021h(z3);
        }
        this.f59941l0 = false;
        if (!z3) {
            m20893U(jUptimeMillis);
        }
        g8d.m12417b();
    }

    /* JADX INFO: renamed from: j0 */
    public final void m20915j0(tt8 tt8Var) {
        this.f59913V = tt8Var;
    }

    /* JADX INFO: renamed from: k */
    public final void m20916k(yu5 yu5Var, int i, boolean z, long j) {
        c68 c68Var = this.f59918a[i];
        boolean zM4352g = c68Var.m4352g();
        y90 y90Var = (y90) c68Var.f9642e;
        if (zM4352g) {
            return;
        }
        boolean z2 = yu5Var == this.f59904M.f7564i;
        u8a u8aVarM25330m = yu5Var.m25330m();
        b68 b68Var = ((b68[]) u8aVarM25330m.f63594c)[i];
        C3565s8 c3565s8 = ((C3565s8[]) u8aVarM25330m.f63595d)[i];
        boolean z3 = m20929q0() && this.f59921b0.f46897e == 3;
        boolean z4 = !z && z3;
        this.f59943n0++;
        zk8 zk8Var = yu5Var.f70474c[i];
        long jM25327j = yu5Var.m25327j();
        jv5 jv5Var = yu5Var.f70478g.f72178a;
        y90 y90Var2 = (y90) c68Var.f9643f;
        int iM21154e = c3565s8 != null ? c3565s8.m21154e() : 0;
        C0713b[] c0713bArr = new C0713b[iM21154e];
        for (int i2 = 0; i2 < iM21154e; i2++) {
            c3565s8.getClass();
            c0713bArr[i2] = c3565s8.m21151b(i2);
        }
        int i3 = c68Var.f9641d;
        j72 j72Var = this.f59900I;
        if (i3 == 0 || i3 == 2 || i3 == 4) {
            c68Var.f9638a = true;
            bna.m3987z(y90Var.f69502h == 0);
            y90Var.f69498d = b68Var;
            y90Var.f69493L = jv5Var;
            y90Var.f69502h = 1;
            y90Var.mo4261q(z4, z2);
            y90Var.m24990A(c0713bArr, zk8Var, j, jM25327j, jv5Var);
            y90Var.m24991B(j, z4, true);
            j72Var.m14314d(y90Var);
        } else {
            c68Var.f9639b = true;
            y90Var2.getClass();
            bna.m3987z(y90Var2.f69502h == 0);
            y90Var2.f69498d = b68Var;
            y90Var2.f69493L = jv5Var;
            y90Var2.f69502h = 1;
            y90Var2.mo4261q(z4, z2);
            y90Var2.m24990A(c0713bArr, zk8Var, j, jM25327j, jv5Var);
            y90Var2.m24991B(j, z4, true);
            j72Var.m14314d(y90Var2);
        }
        mw2 mw2Var = new mw2(this);
        y90 y90VarM4349d = c68Var.m4349d(yu5Var);
        y90VarM4349d.getClass();
        y90VarM4349d.mo4256d(11, mw2Var);
        if (z3 && z2) {
            c68Var.m4356m();
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final void m20917k0(boolean z) {
        this.f59937j0 = z;
        z0a z0aVar = this.f59921b0.f46893a;
        av5 av5Var = this.f59904M;
        av5Var.f7563h = z;
        int iM3096q = av5Var.m3096q(z0aVar);
        if ((iM3096q & 1) != 0) {
            m20894V(true);
        } else if ((iM3096q & 2) != 0) {
            m20910h();
        }
        m20936u(false);
    }

    /* JADX INFO: renamed from: l */
    public final void m20918l(boolean[] zArr, long j) {
        c68[] c68VarArr;
        rw2 rw2Var;
        long j2;
        yu5 yu5Var = this.f59904M.f7565j;
        u8a u8aVarM25330m = yu5Var.m25330m();
        int i = 0;
        while (true) {
            c68VarArr = this.f59918a;
            if (i >= c68VarArr.length) {
                break;
            }
            if (!u8aVarM25330m.m22552m(i)) {
                c68VarArr[i].m4355k();
            }
            i++;
        }
        int i2 = 0;
        while (i2 < c68VarArr.length) {
            if (u8aVarM25330m.m22552m(i2) && c68VarArr[i2].m4349d(yu5Var) == null) {
                rw2Var = this;
                j2 = j;
                rw2Var.m20916k(yu5Var, i2, zArr[i2], j2);
            } else {
                rw2Var = this;
                j2 = j;
            }
            i2++;
            this = rw2Var;
            j = j2;
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final void m20919l0(l69 l69Var) throws Throwable {
        this.f59923c0.m18532c(1);
        wv5 wv5Var = this.f59905N;
        int size = ((ArrayList) wv5Var.f67355c).size();
        if (l69Var.f49200b.length != size) {
            l69Var = new l69(new Random(l69Var.f49199a.nextLong())).m15907a(size);
        }
        wv5Var.f67363k = l69Var;
        m20938v(wv5Var.m24166c(), false);
    }

    /* JADX INFO: renamed from: m */
    public final long m20920m(z0a z0aVar, Object obj, long j) {
        x0a x0aVar = this.f59940l;
        int i = z0aVar.mo23250g(obj, x0aVar).f67601c;
        y0a y0aVar = this.f59938k;
        z0aVar.m25397n(i, y0aVar);
        if (y0aVar.f69067d == -9223372036854775807L || !y0aVar.m24824a() || !y0aVar.f69070g) {
            return -9223372036854775807L;
        }
        long j2 = y0aVar.f69068e;
        return uma.m22797B((j2 == -9223372036854775807L ? System.currentTimeMillis() : j2 + SystemClock.elapsedRealtime()) - y0aVar.f69067d) - (j + x0aVar.f67603e);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m20921m0(int i) {
        k97 k97Var = this.f59921b0;
        if (k97Var.f46897e != i) {
            if (i != 2) {
                this.f59950u0 = -9223372036854775807L;
            }
            if (i != 3 && k97Var.f46908p) {
                this.f59921b0 = k97Var.m15021h(false);
            }
            this.f59921b0 = this.f59921b0.m15020g(i);
        }
    }

    /* JADX INFO: renamed from: n */
    public final long m20922n(yu5 yu5Var) {
        if (yu5Var == null) {
            return 0L;
        }
        long jM25327j = yu5Var.m25327j();
        if (!yu5Var.f70476e) {
            return jM25327j;
        }
        int i = 0;
        while (true) {
            c68[] c68VarArr = this.f59918a;
            if (i >= c68VarArr.length) {
                return jM25327j;
            }
            if (c68VarArr[i].m4349d(yu5Var) != null) {
                y90 y90VarM4349d = c68VarArr[i].m4349d(yu5Var);
                Objects.requireNonNull(y90VarM4349d);
                long j = y90VarM4349d.f69489H;
                if (j == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jM25327j = Math.max(j, jM25327j);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final void m20923n0(wpa wpaVar) {
        for (c68 c68Var : this.f59918a) {
            y90 y90Var = (y90) c68Var.f9642e;
            int i = y90Var.f69496b;
            if (i == 2 || i == 4) {
                y90Var.mo4256d(7, wpaVar);
                y90 y90Var2 = (y90) c68Var.f9643f;
                if (y90Var2 != null) {
                    y90Var2.mo4256d(7, wpaVar);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final Pair m20924o(z0a z0aVar) {
        long j = 0;
        if (z0aVar.m25398p()) {
            return Pair.create(k97.f46892u, 0L);
        }
        int iMo23247a = z0aVar.mo23247a(this.f59937j0);
        Pair pairM25395i = z0aVar.m25395i(this.f59938k, this.f59940l, iMo23247a, -9223372036854775807L);
        jv5 jv5VarM3094o = this.f59904M.m3094o(z0aVar, pairM25395i.first, 0L);
        long jLongValue = ((Long) pairM25395i.second).longValue();
        if (jv5VarM3094o.m14690b()) {
            Object obj = jv5VarM3094o.f46226a;
            x0a x0aVar = this.f59940l;
            z0aVar.mo23250g(obj, x0aVar);
            if (jv5VarM3094o.f46228c == x0aVar.m24227e(jv5VarM3094o.f46227b)) {
                x0aVar.f67605g.getClass();
            }
        } else {
            j = jLongValue;
        }
        return Pair.create(jv5VarM3094o, Long.valueOf(j));
    }

    /* JADX INFO: renamed from: o0 */
    public final void m20925o0(Object obj, hg1 hg1Var) {
        for (c68 c68Var : this.f59918a) {
            y90 y90Var = (y90) c68Var.f9642e;
            if (y90Var.f69496b == 2) {
                int i = c68Var.f9641d;
                if (i == 4 || i == 1) {
                    y90 y90Var2 = (y90) c68Var.f9643f;
                    y90Var2.getClass();
                    y90Var2.mo4256d(1, obj);
                } else {
                    y90Var.mo4256d(1, obj);
                }
            }
        }
        int i2 = this.f59921b0.f46897e;
        if (i2 == 3 || i2 == 2) {
            this.f59932h.m20100e(2);
        }
        if (hg1Var != null) {
            hg1Var.m13225b();
        }
    }

    /* JADX INFO: renamed from: p */
    public final long m20926p(long j) {
        yu5 yu5Var = this.f59904M.f7567l;
        if (yu5Var == null) {
            return 0L;
        }
        return Math.max(0L, j - yu5Var.m25341x(this.f59945p0));
    }

    /* JADX INFO: renamed from: p0 */
    public final void m20927p0(float f) {
        this.f59954y0 = f;
        float f2 = f * this.f59911T.f46377g;
        for (c68 c68Var : this.f59918a) {
            y90 y90Var = (y90) c68Var.f9642e;
            if (y90Var.f69496b == 1) {
                y90Var.mo4256d(2, Float.valueOf(f2));
                y90 y90Var2 = (y90) c68Var.f9643f;
                if (y90Var2 != null) {
                    y90Var2.mo4256d(2, Float.valueOf(f2));
                }
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m20928q(int i) {
        k97 k97Var = this.f59921b0;
        m20946z0(i, k97Var.f46906n, k97Var.f46905m, k97Var.f46904l);
    }

    /* JADX INFO: renamed from: q0 */
    public final boolean m20929q0() {
        k97 k97Var = this.f59921b0;
        return k97Var.f46904l && k97Var.f46906n == 0;
    }

    /* JADX INFO: renamed from: r */
    public final void m20930r() {
        m20927p0(this.f59954y0);
    }

    /* JADX INFO: renamed from: r0 */
    public final boolean m20931r0(z0a z0aVar, jv5 jv5Var) {
        if (jv5Var.m14690b() || z0aVar.m25398p()) {
            return false;
        }
        int i = z0aVar.mo23250g(jv5Var.f46226a, this.f59940l).f67601c;
        y0a y0aVar = this.f59938k;
        z0aVar.m25397n(i, y0aVar);
        return y0aVar.m24824a() && y0aVar.f69070g && y0aVar.f69067d != -9223372036854775807L;
    }

    /* JADX INFO: renamed from: s */
    public final void m20932s(xu5 xu5Var) {
        av5 av5Var = this.f59904M;
        yu5 yu5Var = av5Var.f7567l;
        if (yu5Var != null && yu5Var.f70472a == xu5Var) {
            long j = this.f59945p0;
            if (yu5Var != null) {
                yu5Var.m25336s(j);
            }
            m20876C();
            return;
        }
        yu5 yu5Var2 = av5Var.f7568m;
        if (yu5Var2 == null || yu5Var2.f70472a != xu5Var) {
            return;
        }
        m20878D();
    }

    /* JADX INFO: renamed from: s0 */
    public final void m20933s0() {
        yu5 yu5Var = this.f59904M.f7564i;
        if (yu5Var == null) {
            return;
        }
        u8a u8aVarM25330m = yu5Var.m25330m();
        int i = 0;
        while (true) {
            c68[] c68VarArr = this.f59918a;
            if (i >= c68VarArr.length) {
                return;
            }
            if (u8aVarM25330m.m22552m(i)) {
                c68VarArr[i].m4356m();
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m20934t(IOException iOException, int i) {
        ExoPlaybackException exoPlaybackExceptionM2527d = ExoPlaybackException.m2527d(iOException, i);
        yu5 yu5Var = this.f59904M.f7564i;
        if (yu5Var != null) {
            exoPlaybackExceptionM2527d = exoPlaybackExceptionM2527d.m2529b(yu5Var.f70478g.f72178a);
        }
        ss5.m21724v("ExoPlayerImplInternal", "Playback error", exoPlaybackExceptionM2527d);
        m20935t0(false, false);
        this.f59921b0 = this.f59921b0.m15018e(exoPlaybackExceptionM2527d);
    }

    /* JADX INFO: renamed from: t0 */
    public final void m20935t0(boolean z, boolean z2) {
        m20889O(z || !this.f59939k0, false, true, false);
        this.f59923c0.m18532c(z2 ? 1 : 0);
        h72 h72Var = this.f59928f;
        ConcurrentHashMap concurrentHashMap = h72Var.f41873p;
        xb7 xb7Var = this.f59907P;
        g72 g72Var = (g72) concurrentHashMap.get(xb7Var);
        if (g72Var != null) {
            int i = g72Var.f40309a - 1;
            g72Var.f40309a = i;
            if (i == 0) {
                concurrentHashMap.remove(xb7Var);
                h72Var.m13108c();
            }
        }
        this.f59911T.m14744d(1, this.f59921b0.f46904l);
        m20921m0(1);
    }

    /* JADX INFO: renamed from: u */
    public final void m20936u(boolean z) {
        yu5 yu5Var = this.f59904M.f7567l;
        jv5 jv5Var = yu5Var == null ? this.f59921b0.f46894b : yu5Var.f70478g.f72178a;
        boolean zEquals = this.f59921b0.f46903k.equals(jv5Var);
        if (!zEquals) {
            this.f59921b0 = this.f59921b0.m15015b(jv5Var);
        }
        k97 k97Var = this.f59921b0;
        k97Var.f46909q = yu5Var == null ? k97Var.f46911s : yu5Var.m25324g();
        k97 k97Var2 = this.f59921b0;
        k97Var2.f46910r = m20926p(k97Var2.f46909q);
        if ((!zEquals || z) && yu5Var != null && yu5Var.f70476e) {
            m20941w0(yu5Var.f70478g.f72178a, yu5Var.m25330m());
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final void m20937u0() {
        j72 j72Var = this.f59900I;
        j72Var.f45140f = false;
        qg9 qg9Var = j72Var.f45135a;
        if (qg9Var.f57767b) {
            qg9Var.m19950d(qg9Var.mo14312b());
            qg9Var.f57767b = false;
        }
        for (c68 c68Var : this.f59918a) {
            y90 y90Var = (y90) c68Var.f9643f;
            y90 y90Var2 = (y90) c68Var.f9642e;
            if (c68.m4345h(y90Var2)) {
                c68.m4344b(y90Var2);
            }
            if (y90Var != null && y90Var.f69502h != 0) {
                c68.m4344b(y90Var);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:158:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:246:0x0412  */
    /* JADX WARN: Code duplicated, block: B:247:0x0414  */
    /* JADX WARN: Code duplicated, block: B:252:0x042f  */
    /* JADX WARN: Code duplicated, block: B:254:0x0437  */
    /* JADX WARN: Code duplicated, block: B:255:0x0439  */
    /* JADX WARN: Code duplicated, block: B:259:0x0465  */
    /* JADX WARN: Code duplicated, block: B:264:0x047c  */
    /* JADX WARN: Code duplicated, block: B:265:0x047e  */
    /* JADX WARN: Code duplicated, block: B:268:0x048d  */
    /* JADX WARN: Code duplicated, block: B:270:0x0497  */
    /* JADX WARN: Code duplicated, block: B:272:0x049f  */
    /* JADX WARN: Code duplicated, block: B:273:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:277:0x04cd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24, types: [z0a] */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r2v10, types: [z0a] */
    /* JADX WARN: Type inference failed for: r2v15, types: [k97] */
    /* JADX WARN: Type inference failed for: r2v31, types: [av5] */
    /* JADX WARN: Type inference failed for: r45v0, types: [rw2] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v18, types: [z0a] */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: v */
    public final void m20938v(z0a z0aVar, boolean z) throws Throwable {
        long j;
        y0a y0aVar;
        Object obj;
        int iMo23247a;
        long jM22813h;
        boolean z2;
        boolean z3;
        boolean z4;
        z0a z0aVar2;
        x0a x0aVar;
        boolean z5;
        z0a z0aVar3;
        x0a x0aVar2;
        z0a z0aVar4;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        int i;
        pw2 pw2Var;
        int i2;
        long jLongValue;
        boolean z6;
        int iMo23247a2;
        boolean z7;
        x0a x0aVar3;
        z0a z0aVar5;
        ?? r11;
        jv5 jv5Var;
        long j7;
        jv5 jv5Var2;
        long j8;
        boolean z8;
        ?? r8;
        yu5 yu5Var;
        long j9;
        jv5 jv5Var3;
        long j10;
        k97 k97Var = this.f59921b0;
        qw2 qw2Var = this.f59944o0;
        av5 av5Var = this.f59904M;
        int i3 = this.f59935i0;
        boolean z9 = this.f59937j0;
        y0a y0aVar2 = this.f59938k;
        x0a x0aVar4 = this.f59940l;
        if (z0aVar.m25398p()) {
            jv5 jv5Var4 = k97.f46892u;
            boolean z10 = (jv5Var4.equals(k97Var.f46894b) && k97Var.f46911s == 0) ? false : true;
            pw2 pw2Var2 = new pw2(jv5Var4, 0L, -9223372036854775807L, false, true, false, z10, z10 && z && !k97Var.f46893a.m25398p() && !k97Var.f46893a.mo23250g(k97Var.f46894b.f46226a, x0aVar4).f67604f, 4);
            z0aVar5 = z0aVar;
            j4 = 0;
            pw2Var = pw2Var2;
            x0aVar3 = x0aVar4;
        } else {
            jv5 jv5Var5 = k97Var.f46894b;
            Object obj2 = jv5Var5.f46226a;
            z0a z0aVar6 = k97Var.f46893a;
            boolean z11 = z0aVar6.m25398p() || z0aVar6.mo23250g(jv5Var5.f46226a, x0aVar4).f67604f;
            long jMin = (k97Var.f46894b.m14690b() || z11) ? k97Var.f46895c : k97Var.f46911s;
            if (qw2Var != null) {
                boolean z12 = true;
                j = 1;
                z0a z0aVar7 = z0aVar;
                Pair pairM20869S = m20869S(z0aVar7, qw2Var, true, i3, z9, y0aVar2, x0aVar4);
                if (pairM20869S == null) {
                    iMo23247a2 = z0aVar7.mo23247a(z9);
                    obj = obj2;
                    jLongValue = jMin;
                    z6 = false;
                    z7 = false;
                } else {
                    long j11 = qw2Var.f58272c;
                    obj = pairM20869S.first;
                    if (j11 == -9223372036854775807L) {
                        iMo23247a2 = z0aVar7.mo23250g(obj, x0aVar4).f67601c;
                        obj = obj2;
                        jLongValue = jMin;
                        z6 = false;
                    } else {
                        jLongValue = ((Long) pairM20869S.second).longValue();
                        z6 = true;
                        iMo23247a2 = -1;
                    }
                    z7 = k97Var.f46897e == 4;
                    z12 = false;
                }
                z4 = z6;
                z3 = z12;
                z2 = z7;
                jMin = jLongValue;
                iMo23247a = iMo23247a2;
                y0aVar = y0aVar2;
                z0aVar4 = z0aVar7;
                x0aVar2 = x0aVar4;
            } else {
                j = 1;
                z0a z0aVar8 = z0aVar;
                if (k97Var.f46893a.m25398p()) {
                    iMo23247a = z0aVar8.mo23247a(z9);
                    y0aVar = y0aVar2;
                    obj = obj2;
                } else if (z0aVar8.mo17285b(obj2) == -1) {
                    int iM20870T = m20870T(y0aVar2, x0aVar4, i3, z9, obj, k97Var.f46893a, z0aVar8);
                    y0aVar = y0aVar2;
                    if (iM20870T == -1) {
                        obj = obj2;
                        z0aVar2 = z0aVar8;
                        x0aVar = x0aVar4;
                        iM20870T = z0aVar2.mo23247a(z9);
                        z5 = true;
                    } else {
                        obj = obj2;
                        z0aVar2 = z0aVar8;
                        x0aVar = x0aVar4;
                        z5 = false;
                    }
                    iMo23247a = iM20870T;
                    z3 = z5;
                    z2 = false;
                    z0aVar3 = z0aVar2;
                    z4 = false;
                    z0aVar4 = z0aVar3;
                    x0aVar2 = x0aVar;
                } else {
                    y0aVar = y0aVar2;
                    if (jMin == -9223372036854775807L) {
                        obj = obj2;
                        iMo23247a = z0aVar8.mo23250g(obj, x0aVar4).f67601c;
                    } else if (z11) {
                        k97Var.f46893a.mo23250g(jv5Var5.f46226a, x0aVar4);
                        if (k97Var.f46893a.mo39m(x0aVar4.f67601c, y0aVar, 0L).f69075l == k97Var.f46893a.mo17285b(jv5Var5.f46226a)) {
                            Pair pairM25395i = z0aVar8.m25395i(y0aVar, x0aVar4, z0aVar8.mo23250g(obj, x0aVar4).f67601c, jMin + x0aVar4.f67603e);
                            obj = pairM25395i.first;
                            jM22813h = ((Long) pairM25395i.second).longValue();
                        } else {
                            jM22813h = z0aVar8.mo23250g(obj, x0aVar4).f67602d != -9223372036854775807L ? uma.m22813h(jMin, 0L, x0aVar4.f67602d - 1) : jMin;
                        }
                        jMin = jM22813h;
                        iMo23247a = -1;
                        z2 = false;
                        z3 = false;
                        z4 = true;
                        z0aVar4 = z0aVar8;
                        x0aVar2 = x0aVar4;
                    } else {
                        iMo23247a = -1;
                    }
                }
                z2 = false;
                z3 = false;
                z0aVar3 = z0aVar8;
                x0aVar = x0aVar4;
                z4 = false;
                z0aVar4 = z0aVar3;
                x0aVar2 = x0aVar;
            }
            if (iMo23247a != -1) {
                Pair pairM25395i2 = z0aVar4.m25395i(y0aVar, x0aVar2, iMo23247a, -9223372036854775807L);
                obj = pairM25395i2.first;
                jMin = ((Long) pairM25395i2.second).longValue();
                j2 = -9223372036854775807L;
            } else {
                j2 = jMin;
            }
            jv5 jv5VarM3094o = av5Var.m3094o(z0aVar4, obj, jMin);
            int i4 = jv5VarM3094o.f46230e;
            boolean z13 = i4 == -1 || ((i2 = jv5Var5.f46230e) != -1 && i4 >= i2);
            boolean zEquals = jv5Var5.f46226a.equals(obj);
            boolean z14 = zEquals && !jv5Var5.m14690b() && !jv5VarM3094o.m14690b() && z13;
            x0a x0aVarMo23250g = z0aVar4.mo23250g(obj, x0aVar2);
            if (z11 || jMin != j2) {
                j3 = j2;
            } else {
                Object obj3 = jv5Var5.f46226a;
                int i5 = jv5Var5.f46227b;
                j3 = j2;
                if (obj3.equals(jv5VarM3094o.f46226a)) {
                    if (jv5Var5.m14690b()) {
                        x0aVarMo23250g.m24229g(i5);
                    }
                    if (jv5VarM3094o.m14690b()) {
                        x0aVarMo23250g.m24229g(jv5VarM3094o.f46227b);
                    }
                }
            }
            if (z14) {
                jv5VarM3094o = jv5Var5;
            }
            if (!jv5VarM3094o.m14690b()) {
                if (zEquals && jv5Var5.m14690b()) {
                    C3103i8 c3103i8M14950a = z0aVar4.mo23250g(obj, x0aVar2).f67605g.m14950a(jv5Var5.f46227b);
                    c3103i8M14950a.getClass();
                    long j12 = k97Var.f46895c;
                    j4 = 0;
                    if (j12 == -9223372036854775807L || 0 > j12) {
                        int i6 = c3103i8M14950a.f43665a;
                        int i7 = jv5Var5.f46228c;
                        if (i6 > i7 && c3103i8M14950a.f43669e[i7] == 2) {
                            long j13 = z0aVar4.mo23250g(obj, x0aVar2).f67602d;
                            if (j13 != -9223372036854775807L) {
                                jMin = Math.min(j13 - j, jMin);
                            }
                            j5 = jMin;
                            j6 = j5;
                        }
                    }
                } else {
                    j4 = 0;
                }
                j5 = jMin;
                j6 = j3;
            } else if (jv5VarM3094o.equals(jv5Var5)) {
                j5 = k97Var.f46911s;
                j6 = j3;
                j4 = 0;
            } else {
                z0aVar4.mo23250g(jv5VarM3094o.f46226a, x0aVar2);
                if (jv5VarM3094o.f46228c == x0aVar2.m24227e(jv5VarM3094o.f46227b)) {
                    x0aVar2.f67605g.getClass();
                }
                j6 = j3;
                j4 = 0;
                j5 = 0;
            }
            boolean z15 = (jv5VarM3094o.equals(k97Var.f46894b) && j5 == k97Var.f46911s) ? false : true;
            int i8 = z0aVar4.mo17285b(k97Var.f46894b.f46226a) == -1 ? 4 : 3;
            if (!jv5VarM3094o.f46226a.equals(k97Var.f46894b.f46226a) || jv5VarM3094o.f46227b == -1) {
                i = i8;
            } else {
                C3103i8 c3103i8M14950a2 = z0aVar4.mo23250g(jv5VarM3094o.f46226a, x0aVar2).f67605g.m14950a(jv5VarM3094o.f46227b);
                int i9 = jv5VarM3094o.f46228c;
                int[] iArr = c3103i8M14950a2.f43669e;
                if (i9 >= iArr.length || iArr[i9] != 2) {
                    i = 0;
                } else {
                    i = i8;
                }
            }
            pw2Var = new pw2(jv5VarM3094o, j5, j6, z2, z3, z4, z15, z15 && z && !k97Var.f46893a.m25398p() && !k97Var.f46893a.mo23250g(k97Var.f46894b.f46226a, x0aVar2).f67604f, i);
            z0aVar5 = z0aVar4;
            x0aVar3 = x0aVar2;
        }
        jv5 jv5Var6 = pw2Var.f56888a;
        long jM20896X = pw2Var.f56889b;
        try {
            if (pw2Var.f56892e) {
                z8 = true;
                if (this.f59921b0.f46897e != 1) {
                    m20921m0(4);
                }
                m20889O(false, false, false, true);
            } else {
                z8 = true;
            }
            c68[] c68VarArr = this.f59918a;
            int length = c68VarArr.length;
            int i10 = 0;
            ?? r9 = x0aVar3;
            while (i10 < length) {
                c68 c68Var = c68VarArr[i10];
                y90 y90Var = (y90) c68Var.f9642e;
                boolean zEquals2 = Objects.equals(y90Var.f69492K, z0aVar5);
                if (!zEquals2) {
                    y90Var.f69492K = z0aVar5;
                    y90Var.mo12197x();
                }
                y90 y90Var2 = (y90) c68Var.f9643f;
                if (y90Var2 != null && !Objects.equals(y90Var2.f69492K, z0aVar5)) {
                    y90Var2.f69492K = z0aVar5;
                    y90Var2.mo12197x();
                }
                i10++;
                r9 = zEquals2;
            }
            try {
                if (pw2Var.f56894g) {
                    r9 = z0aVar5;
                    if (r9.m25398p()) {
                        jv5Var = jv5Var6;
                    } else {
                        for (yu5 yu5VarM25325h = this.f59904M.f7564i; yu5VarM25325h != null; yu5VarM25325h = yu5VarM25325h.m25325h()) {
                            if (yu5VarM25325h.f70478g.f72178a.equals(jv5Var6)) {
                                yu5VarM25325h.f70478g = this.f59904M.m3088h(r9, yu5VarM25325h.f70478g);
                                yu5VarM25325h.m25343z();
                            }
                        }
                        boolean z16 = pw2Var.f56891d;
                        try {
                            av5 av5Var2 = this.f59904M;
                            jv5Var = jv5Var6;
                            try {
                                jM20896X = m20896X(jv5Var, jM20896X, av5Var2.f7564i != av5Var2.f7565j ? z8 : false, z16);
                            } catch (Throwable th) {
                                th = th;
                                jM20896X = jM20896X;
                                r8 = r9;
                                r11 = r8;
                                k97 k97Var2 = this.f59921b0;
                                z0a z0aVar9 = k97Var2.f46893a;
                                jv5 jv5Var7 = k97Var2.f46894b;
                                if (pw2Var.f56893f) {
                                    j7 = jM20896X;
                                } else {
                                    j7 = -9223372036854775807L;
                                }
                                jv5Var2 = jv5Var;
                                m20875B0(r11, jv5Var2, z0aVar9, jv5Var7, j7, false);
                                if (pw2Var.f56894g) {
                                    long j14 = pw2Var.f56890c;
                                    if (pw2Var.f56895h) {
                                        j8 = jM20896X;
                                    } else {
                                        j8 = this.f59921b0.f46896d;
                                    }
                                    this.f59921b0 = m20944y(jv5Var2, jM20896X, j14, j8, pw2Var.f56895h, pw2Var.f56896i);
                                } else {
                                    long j15 = pw2Var.f56890c;
                                    if (pw2Var.f56895h) {
                                        j8 = jM20896X;
                                    } else {
                                        j8 = this.f59921b0.f46896d;
                                    }
                                    this.f59921b0 = m20944y(jv5Var2, jM20896X, j15, j8, pw2Var.f56895h, pw2Var.f56896i);
                                }
                                m20890P();
                                m20892R(r11, this.f59921b0.f46893a);
                                this.f59921b0 = this.f59921b0.m15022i(r11);
                                if (!r11.m25398p()) {
                                    this.f59944o0 = null;
                                }
                                m20936u(false);
                                this.f59932h.m20100e(2);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            jv5Var = jv5Var6;
                            r8 = r9;
                            r11 = r8;
                            k97 k97Var3 = this.f59921b0;
                            z0a z0aVar10 = k97Var3.f46893a;
                            jv5 jv5Var8 = k97Var3.f46894b;
                            if (pw2Var.f56893f) {
                                j7 = jM20896X;
                            } else {
                                j7 = -9223372036854775807L;
                            }
                            jv5Var2 = jv5Var;
                            m20875B0(r11, jv5Var2, z0aVar10, jv5Var8, j7, false);
                            if (pw2Var.f56894g) {
                                long j16 = pw2Var.f56890c;
                                if (pw2Var.f56895h) {
                                    j8 = jM20896X;
                                } else {
                                    j8 = this.f59921b0.f46896d;
                                }
                                this.f59921b0 = m20944y(jv5Var2, jM20896X, j16, j8, pw2Var.f56895h, pw2Var.f56896i);
                            } else {
                                long j17 = pw2Var.f56890c;
                                if (pw2Var.f56895h) {
                                    j8 = jM20896X;
                                } else {
                                    j8 = this.f59921b0.f46896d;
                                }
                                this.f59921b0 = m20944y(jv5Var2, jM20896X, j17, j8, pw2Var.f56895h, pw2Var.f56896i);
                            }
                            m20890P();
                            m20892R(r11, this.f59921b0.f46893a);
                            this.f59921b0 = this.f59921b0.m15022i(r11);
                            if (!r11.m25398p()) {
                                this.f59944o0 = null;
                            }
                            m20936u(false);
                            this.f59932h.m20100e(2);
                            throw th;
                        }
                    }
                    k97 k97Var4 = this.f59921b0;
                    z0a z0aVar11 = k97Var4.f46893a;
                    jv5 jv5Var9 = k97Var4.f46894b;
                    if (pw2Var.f56893f) {
                        j9 = jM20896X;
                    } else {
                        j9 = -9223372036854775807L;
                    }
                    jv5Var3 = jv5Var;
                    m20875B0(z0aVar, jv5Var3, z0aVar11, jv5Var9, j9, false);
                    if (pw2Var.f56894g) {
                        long j18 = pw2Var.f56890c;
                        if (pw2Var.f56895h) {
                            j10 = jM20896X;
                        } else {
                            j10 = this.f59921b0.f46896d;
                        }
                        this.f59921b0 = m20944y(jv5Var3, jM20896X, j18, j10, pw2Var.f56895h, pw2Var.f56896i);
                    } else {
                        long j19 = pw2Var.f56890c;
                        if (pw2Var.f56895h) {
                            j10 = jM20896X;
                        } else {
                            j10 = this.f59921b0.f46896d;
                        }
                        this.f59921b0 = m20944y(jv5Var3, jM20896X, j19, j10, pw2Var.f56895h, pw2Var.f56896i);
                    }
                    m20890P();
                    m20892R(z0aVar, this.f59921b0.f46893a);
                    this.f59921b0 = this.f59921b0.m15022i(z0aVar);
                    if (!z0aVar.m25398p()) {
                        this.f59944o0 = null;
                    }
                    m20936u(false);
                    this.f59932h.m20100e(2);
                    return;
                }
                try {
                    yu5 yu5Var2 = this.f59904M.f7565j;
                    try {
                        try {
                            int iM3097r = this.f59904M.m3097r(z0aVar, this.f59945p0, yu5Var2 == null ? j4 : m20922n(yu5Var2), (!m20906f() || (yu5Var = this.f59904M.f7566k) == null) ? j4 : m20922n(yu5Var));
                            if ((iM3097r & 1) != 0) {
                                m20894V(false);
                            } else if ((iM3097r & 2) != 0) {
                                m20910h();
                            }
                            jv5Var = jv5Var6;
                            k97 k97Var5 = this.f59921b0;
                            z0a z0aVar12 = k97Var5.f46893a;
                            jv5 jv5Var10 = k97Var5.f46894b;
                            if (pw2Var.f56893f) {
                                j9 = jM20896X;
                            } else {
                                j9 = -9223372036854775807L;
                            }
                            jv5Var3 = jv5Var;
                            m20875B0(z0aVar, jv5Var3, z0aVar12, jv5Var10, j9, false);
                            if (pw2Var.f56894g || pw2Var.f56890c != this.f59921b0.f46895c) {
                                long j110 = pw2Var.f56890c;
                                if (pw2Var.f56895h) {
                                    j10 = jM20896X;
                                } else {
                                    j10 = this.f59921b0.f46896d;
                                }
                                this.f59921b0 = m20944y(jv5Var3, jM20896X, j110, j10, pw2Var.f56895h, pw2Var.f56896i);
                            }
                            m20890P();
                            m20892R(z0aVar, this.f59921b0.f46893a);
                            this.f59921b0 = this.f59921b0.m15022i(z0aVar);
                            if (!z0aVar.m25398p()) {
                                this.f59944o0 = null;
                            }
                            m20936u(false);
                            this.f59932h.m20100e(2);
                            return;
                        } catch (Throwable th3) {
                            th = th3;
                            r9 = z0aVar;
                            jv5Var = jv5Var6;
                            r8 = r9;
                            r11 = r8;
                            k97 k97Var6 = this.f59921b0;
                            z0a z0aVar13 = k97Var6.f46893a;
                            jv5 jv5Var11 = k97Var6.f46894b;
                            if (pw2Var.f56893f) {
                                j7 = jM20896X;
                            } else {
                                j7 = -9223372036854775807L;
                            }
                            jv5Var2 = jv5Var;
                            m20875B0(r11, jv5Var2, z0aVar13, jv5Var11, j7, false);
                            if (pw2Var.f56894g) {
                                long j111 = pw2Var.f56890c;
                                if (pw2Var.f56895h) {
                                    j8 = jM20896X;
                                } else {
                                    j8 = this.f59921b0.f46896d;
                                }
                                this.f59921b0 = m20944y(jv5Var2, jM20896X, j111, j8, pw2Var.f56895h, pw2Var.f56896i);
                            } else {
                                long j112 = pw2Var.f56890c;
                                if (pw2Var.f56895h) {
                                    j8 = jM20896X;
                                } else {
                                    j8 = this.f59921b0.f46896d;
                                }
                                this.f59921b0 = m20944y(jv5Var2, jM20896X, j112, j8, pw2Var.f56895h, pw2Var.f56896i);
                            }
                            m20890P();
                            m20892R(r11, this.f59921b0.f46893a);
                            this.f59921b0 = this.f59921b0.m15022i(r11);
                            if (!r11.m25398p()) {
                                this.f59944o0 = null;
                            }
                            m20936u(false);
                            this.f59932h.m20100e(2);
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        r9 = z0aVar;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    r9 = z0aVar5;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            th = th7;
            r11 = z0aVar5;
            jv5Var = jv5Var6;
        }
        k97 k97Var7 = this.f59921b0;
        z0a z0aVar14 = k97Var7.f46893a;
        jv5 jv5Var12 = k97Var7.f46894b;
        if (pw2Var.f56893f) {
            j7 = jM20896X;
        } else {
            j7 = -9223372036854775807L;
        }
        jv5Var2 = jv5Var;
        m20875B0(r11, jv5Var2, z0aVar14, jv5Var12, j7, false);
        if (pw2Var.f56894g || pw2Var.f56890c != this.f59921b0.f46895c) {
            long j113 = pw2Var.f56890c;
            if (pw2Var.f56895h) {
                j8 = jM20896X;
            } else {
                j8 = this.f59921b0.f46896d;
            }
            this.f59921b0 = m20944y(jv5Var2, jM20896X, j113, j8, pw2Var.f56895h, pw2Var.f56896i);
        }
        m20890P();
        m20892R(r11, this.f59921b0.f46893a);
        this.f59921b0 = this.f59921b0.m15022i(r11);
        if (!r11.m25398p()) {
            this.f59944o0 = null;
        }
        m20936u(false);
        this.f59932h.m20100e(2);
        throw th;
    }

    /* JADX INFO: renamed from: v0 */
    public final void m20939v0() {
        yu5 yu5Var = this.f59904M.f7567l;
        boolean z = this.f59933h0 || (yu5Var != null && yu5Var.f70472a.mo2550i());
        k97 k97Var = this.f59921b0;
        if (z != k97Var.f46899g) {
            this.f59921b0 = k97Var.m15014a(z);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m20940w(xu5 xu5Var) {
        yu5 yu5Var;
        rw2 rw2Var;
        av5 av5Var = this.f59904M;
        yu5 yu5Var2 = av5Var.f7567l;
        j72 j72Var = this.f59900I;
        if (yu5Var2 != null && yu5Var2.f70472a == xu5Var) {
            yu5Var2.getClass();
            if (!yu5Var2.f70476e) {
                yu5Var2.m25331n(j72Var.mo14315e().f52510a, this.f59921b0.f46893a);
            }
            m20941w0(yu5Var2.f70478g.f72178a, yu5Var2.m25330m());
            if (yu5Var2 == av5Var.f7564i) {
                m20891Q(yu5Var2.f70478g.f72179b, true);
                m20918l(new boolean[this.f59918a.length], av5Var.f7565j.m25328k());
                yu5Var2.f70479h = true;
                k97 k97Var = this.f59921b0;
                jv5 jv5Var = k97Var.f46894b;
                long j = yu5Var2.f70478g.f72179b;
                rw2Var = this;
                rw2Var.f59921b0 = m20944y(jv5Var, j, k97Var.f46895c, j, false, 5);
            } else {
                rw2Var = this;
            }
            rw2Var.m20876C();
            return;
        }
        int i = 0;
        while (true) {
            if (i >= av5Var.f7572q.size()) {
                yu5Var = null;
                break;
            }
            yu5Var = (yu5) av5Var.f7572q.get(i);
            if (yu5Var.f70472a == xu5Var) {
                break;
            } else {
                i++;
            }
        }
        if (yu5Var != null) {
            bna.m3987z(!yu5Var.f70476e);
            yu5Var.m25331n(j72Var.mo14315e().f52510a, this.f59921b0.f46893a);
            yu5 yu5Var3 = av5Var.f7568m;
            if (yu5Var3 == null || yu5Var3.f70472a != xu5Var) {
                return;
            }
            m20878D();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:15:0x007b  */
    /* JADX INFO: renamed from: w0 */
    public final void m20941w0(jv5 jv5Var, u8a u8aVar) {
        boolean z;
        yu5 yu5Var = this.f59904M.f7567l;
        yu5Var.getClass();
        m20926p(yu5Var.m25324g());
        if (m20931r0(this.f59921b0.f46893a, yu5Var.f70478g.f72178a)) {
            long j = this.f59906O.f38558h;
        }
        z0a z0aVar = this.f59921b0.f46893a;
        float f = this.f59900I.mo14315e().f52510a;
        boolean z2 = this.f59921b0.f46904l;
        C3565s8[] c3565s8Arr = (C3565s8[]) u8aVar.f63595d;
        h72 h72Var = this.f59928f;
        h72Var.getClass();
        ImmutableMap immutableMap = h72Var.f41872o;
        xb7 xb7Var = this.f59907P;
        Integer num = (Integer) immutableMap.get(xb7Var.f68029a);
        int iIntValue = (num == null || num.intValue() == -1) ? h72Var.f41869l : num.intValue();
        g72 g72Var = (g72) h72Var.f41873p.get(xb7Var);
        g72Var.getClass();
        if (iIntValue == -1) {
            mu5 mu5Var = z0aVar.mo39m(z0aVar.mo23250g(jv5Var.f46226a, h72Var.f41859b).f67601c, h72Var.f41858a, 0L).f69065b.f56811b;
            if (mu5Var == null) {
                z = false;
            } else {
                String scheme = mu5Var.f51852a.getScheme();
                if (TextUtils.isEmpty(scheme) || h72.f41857r.contains(scheme)) {
                    z = true;
                } else {
                    z = false;
                }
            }
            int length = c3565s8Arr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = 13107200;
                if (i < length) {
                    C3565s8 c3565s8 = c3565s8Arr[i];
                    if (c3565s8 != null) {
                        switch (c3565s8.m21153d().f45216c) {
                            case -2:
                                i3 = 0;
                                i2 += i3;
                                break;
                            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                            case 1:
                                i2 += i3;
                                break;
                            case 0:
                                i3 = 144310272;
                                i2 += i3;
                                break;
                            case 2:
                                i3 = z ? 19660800 : 131072000;
                                i2 += i3;
                                break;
                            case 3:
                            case 5:
                            case 6:
                                i3 = 131072;
                                i2 += i3;
                                break;
                            case 4:
                                i3 = 26214400;
                                i2 += i3;
                                break;
                            default:
                                ij6.m13959q();
                                break;
                        }
                        return;
                    }
                    i++;
                } else {
                    iIntValue = uma.m22812g(i2, 13107200, 210239488);
                }
            }
        }
        g72Var.f40311c = iIntValue;
        h72Var.m13108c();
    }

    /* JADX INFO: renamed from: x */
    public final void m20942x(n97 n97Var, float f, boolean z, boolean z2) {
        int i;
        if (z) {
            if (z2) {
                this.f59923c0.m18532c(1);
            }
            this.f59921b0 = this.f59921b0.m15019f(n97Var);
        }
        float f2 = n97Var.f52510a;
        yu5 yu5VarM25325h = this.f59904M.f7564i;
        while (true) {
            i = 0;
            if (yu5VarM25325h == null) {
                break;
            }
            C3565s8[] c3565s8Arr = (C3565s8[]) yu5VarM25325h.m25330m().f63595d;
            int length = c3565s8Arr.length;
            while (i < length) {
                C3565s8 c3565s8 = c3565s8Arr[i];
                i++;
            }
            yu5VarM25325h = yu5VarM25325h.m25325h();
        }
        c68[] c68VarArr = this.f59918a;
        int length2 = c68VarArr.length;
        while (i < length2) {
            c68 c68Var = c68VarArr[i];
            float f3 = n97Var.f52510a;
            ((y90) c68Var.f9642e).mo12157C(f, f3);
            y90 y90Var = (y90) c68Var.f9643f;
            if (y90Var != null) {
                y90Var.mo12157C(f, f3);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final void m20943x0(int i, int i2, List list) throws Throwable {
        this.f59923c0.m18532c(1);
        wv5 wv5Var = this.f59905N;
        wv5Var.getClass();
        ArrayList arrayList = (ArrayList) wv5Var.f67355c;
        bna.m3969q(i >= 0 && i <= i2 && i2 <= arrayList.size());
        bna.m3969q(list.size() == i2 - i);
        for (int i3 = i; i3 < i2; i3++) {
            ((vv5) arrayList.get(i3)).f65982a.mo16942t((pu5) list.get(i3 - i));
        }
        m20938v(wv5Var.m24166c(), false);
    }

    /* JADX INFO: renamed from: y */
    public final k97 m20944y(jv5 jv5Var, long j, long j2, long j3, boolean z, int i) {
        boolean z2;
        this.f59948s0 = (!this.f59948s0 && j == this.f59921b0.f46911s && jv5Var.equals(this.f59921b0.f46894b)) ? false : true;
        m20890P();
        k97 k97Var = this.f59921b0;
        k8a k8aVarM25329l = k97Var.f46900h;
        u8a u8aVarM25330m = k97Var.f46901i;
        List listM6289v = k97Var.f46902j;
        if (this.f59905N.f67353a) {
            yu5 yu5Var = this.f59904M.f7564i;
            k8aVarM25329l = yu5Var == null ? k8a.f46867d : yu5Var.m25329l();
            u8aVarM25330m = yu5Var == null ? this.f59926e : yu5Var.m25330m();
            C3565s8[] c3565s8Arr = (C3565s8[]) u8aVarM25330m.f63595d;
            c14 c14Var = new c14(4);
            boolean z3 = false;
            for (C3565s8 c3565s8 : c3565s8Arr) {
                if (c3565s8 != null) {
                    ey5 ey5Var = c3565s8.m21151b(0).f6403l;
                    if (ey5Var == null) {
                        c14Var.m3157b(new ey5(new dy5[0]));
                    } else {
                        c14Var.m3157b(ey5Var);
                        z3 = true;
                    }
                }
            }
            listM6289v = z3 ? c14Var.m4280g() : ImmutableList.m6289v();
            if (yu5Var != null) {
                zu5 zu5Var = yu5Var.f70478g;
                if (zu5Var.f72181d != j2) {
                    yu5Var.f70478g = zu5Var.m25790a(j2);
                }
            }
            c68[] c68VarArr = this.f59918a;
            av5 av5Var = this.f59904M;
            yu5 yu5Var2 = av5Var.f7564i;
            if (yu5Var2 == av5Var.f7565j && yu5Var2 != null) {
                u8a u8aVarM25330m2 = yu5Var2.m25330m();
                int i2 = 0;
                boolean z4 = false;
                while (true) {
                    if (i2 >= c68VarArr.length) {
                        z2 = true;
                        break;
                    }
                    if (u8aVarM25330m2.m22552m(i2)) {
                        if (((y90) c68VarArr[i2].f9642e).f69496b != 1) {
                            z2 = false;
                            break;
                        }
                        if (((b68[]) u8aVarM25330m2.f63594c)[i2].f8019a != 0) {
                            z4 = true;
                        }
                    }
                    i2++;
                }
                boolean z5 = z4 && z2;
                if (z5 != this.f59942m0) {
                    this.f59942m0 = z5;
                    if (!z5 && this.f59921b0.f46908p) {
                        this.f59932h.m20100e(2);
                    }
                }
            }
        } else if (!jv5Var.equals(k97Var.f46894b)) {
            k8aVarM25329l = k8a.f46867d;
            u8aVarM25330m = this.f59926e;
            listM6289v = ImmutableList.m6289v();
        }
        u8a u8aVar = u8aVarM25330m;
        List list = listM6289v;
        k8a k8aVar = k8aVarM25329l;
        if (z) {
            ow2 ow2Var = this.f59923c0;
            if (!ow2Var.f55061e || ow2Var.f55059c == 5) {
                ow2Var.f55060d = true;
                ow2Var.f55061e = true;
                ow2Var.f55059c = i;
            } else {
                bna.m3969q(i == 5);
            }
        }
        k97 k97Var2 = this.f59921b0;
        return k97Var2.m15016c(jv5Var, j, j2, j3, m20926p(k97Var2.f46909q), k8aVar, u8aVar, list);
    }

    /* JADX WARN: Code duplicated, block: B:144:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:146:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:197:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:199:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:201:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:206:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:208:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:21:0x0049  */
    /* JADX WARN: Code duplicated, block: B:222:0x0401  */
    /* JADX WARN: Code duplicated, block: B:241:0x0455  */
    /* JADX WARN: Code duplicated, block: B:310:0x0555  */
    /* JADX INFO: renamed from: y0 */
    public final void m20945y0() {
        yu5 yu5Var;
        yu5 yu5Var2;
        yu5 yu5VarM25325h;
        boolean z;
        boolean z2;
        u8a u8aVarM25330m;
        yu5 yu5Var3;
        yu5 yu5Var4;
        yu5 yu5Var5;
        u8a u8aVarM25330m2;
        int length;
        int i;
        y90 y90Var;
        boolean zM22552m;
        y90 y90Var2;
        byte b;
        int i2;
        int i3;
        yu5 yu5Var6;
        int i4;
        if (this.f59921b0.f46893a.m25398p() || !this.f59905N.f67353a) {
            return;
        }
        av5 av5Var = this.f59904M;
        long j = this.f59945p0;
        yu5 yu5Var7 = av5Var.f7567l;
        if (yu5Var7 != null) {
            yu5Var7.m25336s(j);
        }
        av5 av5Var2 = this.f59904M;
        yu5 yu5Var8 = av5Var2.f7567l;
        long j2 = -9223372036854775807L;
        if (yu5Var8 == null || (!yu5Var8.f70478g.f72188k && yu5Var8.m25333p() && av5Var2.f7567l.f70478g.f72183f != -9223372036854775807L && av5Var2.f7569n < 100)) {
            av5 av5Var3 = this.f59904M;
            long j3 = this.f59945p0;
            k97 k97Var = this.f59921b0;
            yu5 yu5Var9 = av5Var3.f7567l;
            zu5 zu5VarM3084d = yu5Var9 == null ? av5Var3.m3084d(k97Var.f46893a, k97Var.f46894b, k97Var.f46895c, k97Var.f46911s, -9223372036854775807L) : av5Var3.m3083c(k97Var.f46893a, yu5Var9, j3);
            if (zu5VarM3084d != null) {
                av5 av5Var4 = this.f59904M;
                yu5 yu5Var10 = av5Var4.f7567l;
                long jM25327j = yu5Var10 == null ? 1000000000000L : (yu5Var10.m25327j() + av5Var4.f7567l.f70478g.f72183f) - zu5VarM3084d.f72179b;
                int i5 = 0;
                while (true) {
                    if (i5 >= av5Var4.f7572q.size()) {
                        yu5Var = null;
                        break;
                    } else {
                        if (((yu5) av5Var4.f7572q.get(i5)).m25320c(zu5VarM3084d)) {
                            yu5Var = (yu5) av5Var4.f7572q.remove(i5);
                            break;
                        }
                        i5++;
                    }
                }
                if (yu5Var == null) {
                    rw2 rw2Var = (rw2) av5Var4.f7560e.f57333b;
                    y90[] y90VarArr = rw2Var.f59920b;
                    i92 i92Var = rw2Var.f59924d;
                    h72 h72Var = rw2Var.f59928f;
                    xb7 xb7Var = rw2Var.f59907P;
                    h72Var.getClass();
                    gv5 gv5Var = new gv5(h72Var, xb7Var);
                    wv5 wv5Var = rw2Var.f59905N;
                    u8a u8aVar = rw2Var.f59926e;
                    rw2Var.f59951v0.getClass();
                    yu5Var = new yu5(y90VarArr, jM25327j, i92Var, gv5Var, wv5Var, zu5VarM3084d, u8aVar);
                } else {
                    yu5Var.f70478g = zu5VarM3084d;
                    yu5Var.m25340w(jM25327j);
                }
                yu5 yu5Var11 = av5Var4.f7567l;
                if (yu5Var11 != null) {
                    yu5Var11.m25339v(yu5Var);
                } else {
                    av5Var4.f7564i = yu5Var;
                    av5Var4.f7565j = yu5Var;
                    av5Var4.f7566k = yu5Var;
                }
                av5Var4.f7570o = null;
                av5Var4.f7567l = yu5Var;
                av5Var4.f7569n++;
                av5Var4.m3092l();
                if (!yu5Var.f70475d) {
                    yu5Var.m25335r(this, zu5VarM3084d.f72179b);
                } else if (yu5Var.f70476e) {
                    this.f59932h.m20097a(8, yu5Var.f70472a).m19440b();
                }
                if (this.f59904M.f7564i == yu5Var) {
                    m20891Q(zu5VarM3084d.f72179b, true);
                }
                m20936u(false);
            } else {
                j2 = -9223372036854775807L;
            }
        } else {
            j2 = -9223372036854775807L;
        }
        if (this.f59933h0) {
            this.f59933h0 = m20871z(this.f59904M.f7567l);
            m20939v0();
        } else {
            m20876C();
        }
        av5 av5Var5 = this.f59904M;
        if (!this.f59927e0 && this.f59910S && !this.f59953x0 && !m20906f() && (yu5Var6 = av5Var5.f7566k) != null && yu5Var6 == av5Var5.f7565j && yu5Var6.m25325h() != null && yu5Var6.m25325h().f70476e) {
            yu5 yu5VarM25325h2 = yu5Var6.m25325h();
            bna.m3987z(yu5VarM25325h2.f70476e);
            if (((long) ((yu5VarM25325h2.m25328k() - this.f59945p0) / this.f59900I.mo14315e().f52510a)) <= 10000000) {
                yu5 yu5Var12 = av5Var5.f7566k;
                yu5Var12.getClass();
                av5Var5.f7566k = yu5Var12.m25325h();
                av5Var5.m3092l();
                av5Var5.f7566k.getClass();
                c68[] c68VarArr = this.f59918a;
                yu5 yu5Var13 = av5Var5.f7566k;
                if (yu5Var13 != null) {
                    u8a u8aVarM25330m3 = yu5Var13.m25330m();
                    for (int i6 = 0; i6 < c68VarArr.length; i6++) {
                        if (u8aVarM25330m3.m22552m(i6)) {
                            c68 c68Var = c68VarArr[i6];
                            if (((y90) c68Var.f9643f) != null && !c68Var.m4351f()) {
                                c68 c68Var2 = c68VarArr[i6];
                                bna.m3987z(!c68Var2.m4351f());
                                if (c68.m4345h((y90) c68Var2.f9642e)) {
                                    i4 = 3;
                                } else {
                                    y90 y90Var3 = (y90) c68Var2.f9643f;
                                    i4 = (y90Var3 == null || y90Var3.f69502h == 0) ? 2 : 4;
                                }
                                c68Var2.f9641d = i4;
                                m20916k(yu5Var13, i6, false, yu5Var13.m25328k());
                            }
                        }
                    }
                    if (m20906f()) {
                        this.f59952w0 = yu5Var13.f70472a.mo2552k();
                        if (!yu5Var13.m25333p()) {
                            av5Var5.m3093m(yu5Var13);
                            m20936u(false);
                            m20876C();
                        }
                    }
                }
            }
        }
        boolean z3 = this.f59910S;
        c68[] c68VarArr2 = this.f59918a;
        av5 av5Var6 = this.f59904M;
        yu5 yu5Var14 = av5Var6.f7565j;
        if (yu5Var14 != null) {
            if (yu5Var14.m25325h() != null && !this.f59927e0) {
                yu5 yu5Var15 = av5Var6.f7565j;
                if (yu5Var15.f70476e) {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= c68VarArr2.length) {
                            if ((m20906f() && av5Var6.f7566k == av5Var6.f7565j) || (!yu5Var14.m25325h().f70476e && this.f59945p0 < yu5Var14.m25325h().m25328k())) {
                                break;
                                break;
                            }
                            if (!yu5Var14.m25325h().f70476e) {
                                u8aVarM25330m = yu5Var14.m25330m();
                                yu5Var3 = av5Var6.f7566k;
                                yu5Var4 = av5Var6.f7565j;
                                if (yu5Var3 == yu5Var4) {
                                    yu5Var4.getClass();
                                    av5Var6.f7566k = yu5Var4.m25325h();
                                }
                                yu5 yu5Var16 = av5Var6.f7565j;
                                yu5Var16.getClass();
                                av5Var6.f7565j = yu5Var16.m25325h();
                                av5Var6.m3092l();
                                yu5Var5 = av5Var6.f7565j;
                                yu5Var5.getClass();
                                u8aVarM25330m2 = yu5Var5.m25330m();
                                z0a z0aVar = this.f59921b0.f46893a;
                                m20875B0(z0aVar, yu5Var5.f70478g.f72178a, z0aVar, yu5Var14.f70478g.f72178a, -9223372036854775807L, false);
                                if (yu5Var5.f70476e) {
                                    length = c68VarArr2.length;
                                    for (i = 0; i < length; i++) {
                                        c68 c68Var3 = c68VarArr2[i];
                                        long jM25328k = yu5Var5.m25328k();
                                        y90Var = (y90) c68Var3.f9642e;
                                        int i8 = c68Var3.f9640c;
                                        zM22552m = u8aVarM25330m.m22552m(i8);
                                        boolean zM22552m2 = u8aVarM25330m2.m22552m(i8);
                                        y90Var2 = (y90) c68Var3.f9643f;
                                        if (y90Var2 != null) {
                                            y90Var2 = y90Var;
                                        } else {
                                            y90Var2 = y90Var;
                                        }
                                        if (zM22552m) {
                                            b = -2;
                                        } else {
                                            b = -2;
                                        }
                                    }
                                    break;
                                    break;
                                }
                                length = c68VarArr2.length;
                                while (i < length) {
                                    c68 c68Var4 = c68VarArr2[i];
                                    long jM25328k2 = yu5Var5.m25328k();
                                    y90Var = (y90) c68Var4.f9642e;
                                    int i9 = c68Var4.f9640c;
                                    zM22552m = u8aVarM25330m.m22552m(i9);
                                    boolean zM22552m3 = u8aVarM25330m2.m22552m(i9);
                                    y90Var2 = (y90) c68Var4.f9643f;
                                    if (y90Var2 != null) {
                                        y90Var2 = y90Var;
                                    } else {
                                        y90Var2 = y90Var;
                                    }
                                    if (zM22552m) {
                                        b = -2;
                                    } else {
                                        b = -2;
                                    }
                                }
                                break;
                                break;
                            }
                            yu5 yu5VarM25325h3 = yu5Var14.m25325h();
                            bna.m3987z(yu5VarM25325h3.f70476e);
                            if (((long) ((yu5VarM25325h3.m25328k() - this.f59945p0) / this.f59900I.mo14315e().f52510a)) > 10000000) {
                                break;
                            }
                            u8aVarM25330m = yu5Var14.m25330m();
                            yu5Var3 = av5Var6.f7566k;
                            yu5Var4 = av5Var6.f7565j;
                            if (yu5Var3 == yu5Var4) {
                                yu5Var4.getClass();
                                av5Var6.f7566k = yu5Var4.m25325h();
                            }
                            yu5 yu5Var17 = av5Var6.f7565j;
                            yu5Var17.getClass();
                            av5Var6.f7565j = yu5Var17.m25325h();
                            av5Var6.m3092l();
                            yu5Var5 = av5Var6.f7565j;
                            yu5Var5.getClass();
                            u8aVarM25330m2 = yu5Var5.m25330m();
                            z0a z0aVar2 = this.f59921b0.f46893a;
                            m20875B0(z0aVar2, yu5Var5.f70478g.f72178a, z0aVar2, yu5Var14.f70478g.f72178a, -9223372036854775807L, false);
                            if (yu5Var5.f70476e && ((z3 && this.f59952w0 != j2) || yu5Var5.f70472a.mo2552k() != j2)) {
                                this.f59952w0 = j2;
                                boolean z4 = z3 && !this.f59953x0;
                                if (z4) {
                                    for (int i10 = 0; i10 < c68VarArr2.length; i10++) {
                                        boolean zM22552m4 = u8aVarM25330m2.m22552m(i10);
                                        C3565s8[] c3565s8Arr = (C3565s8[]) u8aVarM25330m2.f63595d;
                                        if (zM22552m4 && ((y90) c68VarArr2[i10].f9642e).f69496b != -2 && !ez5.m11391a(c3565s8Arr[i10].m21152c().f6406o, c3565s8Arr[i10].m21152c().f6402k) && !c68VarArr2[i10].m4351f()) {
                                            z4 = false;
                                            break;
                                        }
                                    }
                                }
                                if (!z4) {
                                    long jM25328k3 = yu5Var5.m25328k();
                                    for (c68 c68Var5 : c68VarArr2) {
                                        y90 y90Var4 = (y90) c68Var5.f9643f;
                                        y90 y90Var5 = (y90) c68Var5.f9642e;
                                        if (c68.m4345h(y90Var5) && (i3 = c68Var5.f9641d) != 4 && i3 != 2) {
                                            c68.m4346l(y90Var5, jM25328k3);
                                        }
                                        if (y90Var4 != null && y90Var4.f69502h != 0 && c68Var5.f9641d != 3) {
                                            c68.m4346l(y90Var4, jM25328k3);
                                        }
                                    }
                                    if (!yu5Var5.m25333p()) {
                                        av5Var6.m3093m(yu5Var5);
                                        m20936u(false);
                                        m20876C();
                                        break;
                                    }
                                    break;
                                }
                                length = c68VarArr2.length;
                                while (i < length) {
                                    c68 c68Var6 = c68VarArr2[i];
                                    long jM25328k4 = yu5Var5.m25328k();
                                    y90Var = (y90) c68Var6.f9642e;
                                    int i11 = c68Var6.f9640c;
                                    zM22552m = u8aVarM25330m.m22552m(i11);
                                    boolean zM22552m5 = u8aVarM25330m2.m22552m(i11);
                                    y90Var2 = (y90) c68Var6.f9643f;
                                    if (y90Var2 != null) {
                                        y90Var2 = y90Var;
                                    } else {
                                        y90Var2 = y90Var;
                                    }
                                    if (zM22552m) {
                                        b = -2;
                                    } else {
                                        b = -2;
                                    }
                                }
                                break;
                                break;
                            }
                            length = c68VarArr2.length;
                            while (i < length) {
                                c68 c68Var7 = c68VarArr2[i];
                                long jM25328k5 = yu5Var5.m25328k();
                                y90Var = (y90) c68Var7.f9642e;
                                int i12 = c68Var7.f9640c;
                                zM22552m = u8aVarM25330m.m22552m(i12);
                                boolean zM22552m6 = u8aVarM25330m2.m22552m(i12);
                                y90Var2 = (y90) c68Var7.f9643f;
                                if (y90Var2 != null || (i2 = c68Var7.f9641d) == 3 || (i2 == 0 && c68.m4345h(y90Var))) {
                                    y90Var2 = y90Var;
                                }
                                if (zM22552m || y90Var2.f69490I) {
                                    b = -2;
                                } else {
                                    int i13 = y90Var.f69496b;
                                    b = -2;
                                    boolean z5 = i13 == -2;
                                    b68 b68Var = ((b68[]) u8aVarM25330m.f63594c)[i12];
                                    b68 b68Var2 = ((b68[]) u8aVarM25330m2.f63594c)[i12];
                                    if (!zM22552m6 || !Objects.equals(b68Var2, b68Var) || z5 || c68Var7.m4351f()) {
                                        c68.m4346l(y90Var2, jM25328k5);
                                    }
                                }
                            }
                            break;
                        }
                        c68 c68Var8 = c68VarArr2[i7];
                        if (!c68Var8.m4350e(yu5Var15, (y90) c68Var8.f9642e) || !c68Var8.m4350e(yu5Var15, (y90) c68Var8.f9643f)) {
                            break;
                        } else {
                            i7++;
                        }
                    }
                }
            } else if (yu5Var14.f70478g.f72188k || this.f59927e0) {
                for (c68 c68Var9 : c68VarArr2) {
                    if (c68Var9.m4349d(yu5Var14) != null) {
                        y90 y90VarM4349d = c68Var9.m4349d(yu5Var14);
                        y90VarM4349d.getClass();
                        if (y90VarM4349d.m24993l()) {
                            long j4 = yu5Var14.f70478g.f72183f;
                            long jM25327j2 = (j4 == -9223372036854775807L || j4 == Long.MIN_VALUE) ? -9223372036854775807L : yu5Var14.m25327j() + yu5Var14.f70478g.f72183f;
                            y90 y90VarM4349d2 = c68Var9.m4349d(yu5Var14);
                            y90VarM4349d2.getClass();
                            c68.m4346l(y90VarM4349d2, jM25327j2);
                        }
                    }
                }
            }
        }
        av5 av5Var7 = this.f59904M;
        yu5 yu5Var18 = av5Var7.f7565j;
        if (yu5Var18 != null && av5Var7.f7564i != yu5Var18 && !yu5Var18.f70479h) {
            c68[] c68VarArr3 = this.f59918a;
            u8a u8aVarM25330m4 = yu5Var18.m25330m();
            boolean z6 = true;
            for (int i14 = 0; i14 < c68VarArr3.length; i14++) {
                int iM4348c = c68VarArr3[i14].m4348c();
                c68 c68Var10 = c68VarArr3[i14];
                j72 j72Var = this.f59900I;
                int iM4354j = c68Var10.m4354j((y90) c68Var10.f9642e, yu5Var18, u8aVarM25330m4, j72Var);
                int iM4354j2 = c68Var10.m4354j((y90) c68Var10.f9643f, yu5Var18, u8aVarM25330m4, j72Var);
                if (iM4354j == 1) {
                    iM4354j = iM4354j2;
                }
                if ((iM4354j & 2) != 0 && (z2 = this.f59942m0) && z2) {
                    this.f59942m0 = false;
                    if (this.f59921b0.f46908p) {
                        this.f59932h.m20100e(2);
                    }
                }
                this.f59943n0 -= iM4348c - c68VarArr3[i14].m4348c();
                z6 &= (iM4354j & 1) != 0;
            }
            if (z6) {
                for (int i15 = 0; i15 < c68VarArr3.length; i15++) {
                    if (u8aVarM25330m4.m22552m(i15) && c68VarArr3[i15].m4349d(yu5Var18) == null) {
                        m20916k(yu5Var18, i15, false, yu5Var18.m25328k());
                    }
                }
            }
            if (z6) {
                av5Var7.f7565j.f70479h = true;
            }
        }
        c68[] c68VarArr4 = this.f59918a;
        av5 av5Var8 = this.f59904M;
        boolean z7 = false;
        while (m20929q0() && !this.f59927e0 && (yu5Var2 = av5Var8.f7564i) != null && (yu5VarM25325h = yu5Var2.m25325h()) != null && this.f59945p0 >= yu5VarM25325h.m25328k() && yu5VarM25325h.f70479h) {
            if (z7) {
                m20879E();
            }
            this.f59953x0 = false;
            yu5 yu5VarM3081a = av5Var8.m3081a();
            yu5VarM3081a.getClass();
            if (this.f59921b0.f46894b.f46226a.equals(yu5VarM3081a.f70478g.f72178a.f46226a)) {
                jv5 jv5Var = this.f59921b0.f46894b;
                if (jv5Var.f46227b == -1) {
                    jv5 jv5Var2 = yu5VarM3081a.f70478g.f72178a;
                    if (jv5Var2.f46227b != -1 || jv5Var.f46230e == jv5Var2.f46230e) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            zu5 zu5Var = yu5VarM3081a.f70478g;
            boolean z8 = z;
            jv5 jv5Var3 = zu5Var.f72178a;
            long j5 = zu5Var.f72179b;
            this.f59921b0 = m20944y(jv5Var3, j5, zu5Var.f72181d, j5, !z8, 0);
            m20890P();
            m20873A0();
            if (m20906f() && yu5VarM3081a == av5Var8.f7566k) {
                for (c68 c68Var11 : c68VarArr4) {
                    int i16 = c68Var11.f9641d;
                    if (i16 == 3 || i16 == 4) {
                        boolean z9 = i16 == 4;
                        y90 y90Var6 = (y90) c68Var11.f9642e;
                        y90 y90Var7 = (y90) c68Var11.f9643f;
                        if (z9) {
                            y90Var7.getClass();
                            y90Var7.mo4256d(17, y90Var6);
                        } else {
                            y90Var7.getClass();
                            y90Var6.mo4256d(17, y90Var7);
                        }
                        c68Var11.f9641d = c68Var11.f9641d == 4 ? 0 : 1;
                    } else if (i16 == 2) {
                        c68Var11.f9641d = 0;
                    }
                }
            }
            if (this.f59921b0.f46897e == 3) {
                m20933s0();
            }
            u8a u8aVarM25330m5 = av5Var8.f7564i.m25330m();
            for (int i17 = 0; i17 < c68VarArr4.length; i17++) {
                if (u8aVarM25330m5.m22552m(i17)) {
                    c68 c68Var12 = c68VarArr4[i17];
                    y90 y90Var8 = (y90) c68Var12.f9643f;
                    y90 y90Var9 = (y90) c68Var12.f9642e;
                    if (c68.m4345h(y90Var9)) {
                        y90Var9.mo12186h();
                    } else if (y90Var8 != null && y90Var8.f69502h != 0) {
                        y90Var8.mo12186h();
                    }
                }
            }
            z7 = true;
        }
        this.f59951v0.getClass();
    }

    /* JADX INFO: renamed from: z0 */
    public final void m20946z0(int i, int i2, int i3, boolean z) {
        boolean z2 = z && i != -1;
        if (i == -1) {
            i3 = 2;
        } else if (i3 == 2) {
            i3 = 1;
        }
        boolean z3 = this.f59915X;
        if (i == 0) {
            i2 = 1;
        } else if (i2 == 1) {
            i2 = z3 ? 4 : 0;
        }
        k97 k97Var = this.f59921b0;
        if (k97Var.f46904l == z2 && k97Var.f46906n == i2 && k97Var.f46905m == i3) {
            return;
        }
        this.f59921b0 = k97Var.m15017d(i3, i2, z2);
        m20877C0(false, false);
        av5 av5Var = this.f59904M;
        for (yu5 yu5VarM25325h = av5Var.f7564i; yu5VarM25325h != null; yu5VarM25325h = yu5VarM25325h.m25325h()) {
            for (C3565s8 c3565s8 : (C3565s8[]) yu5VarM25325h.m25330m().f63595d) {
            }
        }
        if (!m20929q0()) {
            m20937u0();
            m20873A0();
            k97 k97Var2 = this.f59921b0;
            if (k97Var2.f46908p) {
                this.f59921b0 = k97Var2.m15021h(false);
            }
            long j = this.f59945p0;
            yu5 yu5Var = av5Var.f7567l;
            if (yu5Var != null) {
                yu5Var.m25336s(j);
                return;
            }
            return;
        }
        int i4 = this.f59921b0.f46897e;
        qp9 qp9Var = this.f59932h;
        if (i4 != 3) {
            if (i4 == 2) {
                qp9Var.m20100e(2);
            }
        } else {
            j72 j72Var = this.f59900I;
            j72Var.f45140f = true;
            j72Var.f45135a.m19951f();
            m20933s0();
            qp9Var.m20100e(2);
        }
    }
}
