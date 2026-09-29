package androidx.media3.exoplayer.source;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.media3.common.C0713b;
import androidx.media3.common.ParserException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import p000.C3329mb;
import p000.C3565s8;
import p000.bna;
import p000.dg1;
import p000.dy5;
import p000.e74;
import p000.eh5;
import p000.ey5;
import p000.ez5;
import p000.fg2;
import p000.fm2;
import p000.gn7;
import p000.gv5;
import p000.hg1;
import p000.hh5;
import p000.hn7;
import p000.in7;
import p000.j02;
import p000.j8a;
import p000.jn7;
import p000.jy2;
import p000.k8a;
import p000.kn7;
import p000.kv5;
import p000.lc3;
import p000.mkd;
import p000.mn7;
import p000.mv5;
import p000.my5;
import p000.n8a;
import p000.oh5;
import p000.rt8;
import p000.ru5;
import p000.ss5;
import p000.st8;
import p000.t48;
import p000.tt8;
import p000.ug2;
import p000.uma;
import p000.vg1;
import p000.wk8;
import p000.wu5;
import p000.wy3;
import p000.xu5;
import p000.yk8;
import p000.zk8;

/* JADX INFO: renamed from: androidx.media3.exoplayer.source.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C0717b implements xu5, jy2 {

    /* JADX INFO: renamed from: l0 */
    public static final Map f6465l0;

    /* JADX INFO: renamed from: m0 */
    public static final C0713b f6466m0;

    /* JADX INFO: renamed from: H */
    public final hg1 f6467H;

    /* JADX INFO: renamed from: I */
    public final gn7 f6468I;

    /* JADX INFO: renamed from: J */
    public final gn7 f6469J;

    /* JADX INFO: renamed from: K */
    public final Handler f6470K;

    /* JADX INFO: renamed from: L */
    public wu5 f6471L;

    /* JADX INFO: renamed from: M */
    public wy3 f6472M;

    /* JADX INFO: renamed from: N */
    public C0716a[] f6473N;

    /* JADX INFO: renamed from: O */
    public yk8[] f6474O;

    /* JADX INFO: renamed from: P */
    public kn7[] f6475P;

    /* JADX INFO: renamed from: Q */
    public boolean f6476Q;

    /* JADX INFO: renamed from: R */
    public boolean f6477R;

    /* JADX INFO: renamed from: S */
    public boolean f6478S;

    /* JADX INFO: renamed from: T */
    public boolean f6479T;

    /* JADX INFO: renamed from: U */
    public C3329mb f6480U;

    /* JADX INFO: renamed from: V */
    public st8 f6481V;

    /* JADX INFO: renamed from: W */
    public long f6482W;

    /* JADX INFO: renamed from: X */
    public boolean f6483X;

    /* JADX INFO: renamed from: Y */
    public int f6484Y;

    /* JADX INFO: renamed from: Z */
    public final long f6485Z = Long.MIN_VALUE;

    /* JADX INFO: renamed from: a */
    public final Uri f6486a;

    /* JADX INFO: renamed from: a0 */
    public boolean f6487a0;

    /* JADX INFO: renamed from: b */
    public final j02 f6488b;

    /* JADX INFO: renamed from: b0 */
    public boolean f6489b0;

    /* JADX INFO: renamed from: c */
    public final mkd f6490c;

    /* JADX INFO: renamed from: c0 */
    public boolean f6491c0;

    /* JADX INFO: renamed from: d */
    public final my5 f6492d;

    /* JADX INFO: renamed from: d0 */
    public int f6493d0;

    /* JADX INFO: renamed from: e */
    public final fm2 f6494e;

    /* JADX INFO: renamed from: e0 */
    public boolean f6495e0;

    /* JADX INFO: renamed from: f */
    public final fm2 f6496f;

    /* JADX INFO: renamed from: f0 */
    public long f6497f0;

    /* JADX INFO: renamed from: g */
    public final mn7 f6498g;

    /* JADX INFO: renamed from: g0 */
    public long f6499g0;

    /* JADX INFO: renamed from: h */
    public final gv5 f6500h;

    /* JADX INFO: renamed from: h0 */
    public boolean f6501h0;

    /* JADX INFO: renamed from: i */
    public final long f6502i;

    /* JADX INFO: renamed from: i0 */
    public int f6503i0;

    /* JADX INFO: renamed from: j */
    public final long f6504j;

    /* JADX INFO: renamed from: j0 */
    public boolean f6505j0;

    /* JADX INFO: renamed from: k */
    public final gv5 f6506k;

    /* JADX INFO: renamed from: k0 */
    public boolean f6507k0;

    /* JADX INFO: renamed from: l */
    public final gv5 f6508l;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        f6465l0 = Collections.unmodifiableMap(map);
        lc3 lc3Var = new lc3();
        lc3Var.f49440a = "icy";
        lc3Var.f49453n = ez5.m11402l("application/x-icy");
        f6466m0 = new C0713b(lc3Var);
    }

    public C0717b(Uri uri, j02 j02Var, gv5 gv5Var, mkd mkdVar, fm2 fm2Var, my5 my5Var, fm2 fm2Var2, mn7 mn7Var, gv5 gv5Var2, int i, long j, t48 t48Var) {
        this.f6486a = uri;
        this.f6488b = j02Var;
        this.f6490c = mkdVar;
        this.f6496f = fm2Var;
        this.f6492d = my5Var;
        this.f6494e = fm2Var2;
        this.f6498g = mn7Var;
        this.f6500h = gv5Var2;
        this.f6502i = i;
        int i2 = 2;
        this.f6506k = t48Var != null ? new gv5(t48Var, i2) : new gv5(new t48(Executors.newSingleThreadExecutor(new dg1("ExoPlayer:Loader:ProgressiveMediaPeriod", 1)), new fg2(7)), i2);
        this.f6508l = gv5Var;
        this.f6504j = j;
        this.f6467H = new hg1();
        this.f6468I = new gn7(this, 0);
        this.f6469J = new gn7(this, 1);
        this.f6470K = uma.m22816k(null);
        this.f6475P = new kn7[0];
        this.f6474O = new yk8[0];
        this.f6473N = new C0716a[0];
        this.f6499g0 = -9223372036854775807L;
        this.f6484Y = 1;
    }

    /* JADX INFO: renamed from: A */
    public final n8a m2539A(kn7 kn7Var) {
        int length = this.f6474O.length;
        for (int i = 0; i < length; i++) {
            if (kn7Var.equals(this.f6475P[i])) {
                return this.f6474O[i];
            }
        }
        if (this.f6476Q) {
            ss5.m21707d0("ProgressiveMediaPeriod", "Extractor added new track (id=" + kn7Var.f47555a + ") after finishing tracks.");
            return new ug2();
        }
        mkd mkdVar = this.f6490c;
        mkdVar.getClass();
        yk8 yk8Var = new yk8(this.f6500h, mkdVar, this.f6496f);
        C0716a c0716a = new C0716a(yk8Var);
        yk8Var.f69945f = this;
        int i2 = length + 1;
        kn7[] kn7VarArr = (kn7[]) Arrays.copyOf(this.f6475P, i2);
        kn7VarArr[length] = kn7Var;
        this.f6475P = kn7VarArr;
        yk8[] yk8VarArr = (yk8[]) Arrays.copyOf(this.f6474O, i2);
        yk8VarArr[length] = yk8Var;
        this.f6474O = yk8VarArr;
        C0716a[] c0716aArr = (C0716a[]) Arrays.copyOf(this.f6473N, i2);
        c0716aArr[length] = c0716a;
        this.f6473N = c0716aArr;
        return c0716a;
    }

    /* JADX INFO: renamed from: B */
    public final void m2540B() {
        in7 in7Var = new in7(this, this.f6486a, this.f6488b, this.f6508l, this, this.f6467H);
        if (this.f6477R) {
            bna.m3987z(m2561t());
            long j = this.f6485Z;
            if (j == Long.MIN_VALUE) {
                j = this.f6482W;
            }
            if (j != -9223372036854775807L && this.f6499g0 > j) {
                this.f6505j0 = true;
                this.f6499g0 = -9223372036854775807L;
                return;
            }
            st8 st8Var = this.f6481V;
            st8Var.getClass();
            long j2 = st8Var.mo3543f(this.f6499g0).f59799a.f64339b;
            long j3 = this.f6499g0;
            in7Var.f44314f.f52394a = j2;
            in7Var.f44317i = j3;
            in7Var.f44316h = true;
            in7Var.f44320l = false;
            for (yk8 yk8Var : this.f6474O) {
                yk8Var.f69959t = this.f6499g0;
            }
            this.f6499g0 = -9223372036854775807L;
        }
        this.f6503i0 = m2543b();
        int i = this.f6484Y;
        this.f6492d.getClass();
        int i2 = i == 7 ? 6 : 3;
        gv5 gv5Var = this.f6506k;
        gv5Var.getClass();
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        gv5Var.f41394d = null;
        hh5 hh5Var = new hh5(gv5Var, looperMyLooper, in7Var, this, i2, SystemClock.elapsedRealtime());
        bna.m3987z(((hh5) gv5Var.f41393c) == null);
        gv5Var.f41393c = hh5Var;
        hh5Var.m13241b();
    }

    /* JADX INFO: renamed from: C */
    public final boolean m2541C() {
        return this.f6489b0 || m2561t();
    }

    /* JADX INFO: renamed from: a */
    public final void m2542a() {
        bna.m3987z(this.f6477R);
        this.f6480U.getClass();
        this.f6481V.getClass();
    }

    /* JADX INFO: renamed from: b */
    public final int m2543b() {
        int i = 0;
        for (yk8 yk8Var : this.f6474O) {
            i += yk8Var.f69956q + yk8Var.f69955p;
        }
        return i;
    }

    @Override // p000.xu5
    /* JADX INFO: renamed from: c */
    public final long mo2544c(C3565s8[] c3565s8Arr, boolean[] zArr, zk8[] zk8VarArr, boolean[] zArr2, long j) throws Throwable {
        C3565s8 c3565s8;
        m2542a();
        C3329mb c3329mb = this.f6480U;
        k8a k8aVar = (k8a) c3329mb.f50860b;
        boolean[] zArr3 = (boolean[]) c3329mb.f50862d;
        int i = this.f6493d0;
        for (int i2 = 0; i2 < c3565s8Arr.length; i2++) {
            zk8 zk8Var = zk8VarArr[i2];
            if (zk8Var != null && (c3565s8Arr[i2] == null || !zArr[i2])) {
                int i3 = ((jn7) zk8Var).f45870a;
                bna.m3987z(zArr3[i3]);
                this.f6493d0--;
                zArr3[i3] = false;
                zk8VarArr[i2] = null;
            }
        }
        boolean z = !this.f6487a0 ? j == 0 || this.f6479T : i != 0;
        for (int i4 = 0; i4 < c3565s8Arr.length; i4++) {
            if (zk8VarArr[i4] == null && (c3565s8 = c3565s8Arr[i4]) != null) {
                int[] iArr = c3565s8.f60500c;
                bna.m3987z(iArr.length == 1);
                bna.m3987z(iArr[0] == 0);
                int iIndexOf = k8aVar.f46869b.indexOf(c3565s8.f60498a);
                if (iIndexOf < 0) {
                    iIndexOf = -1;
                }
                bna.m3987z(!zArr3[iIndexOf]);
                this.f6493d0++;
                zArr3[iIndexOf] = true;
                this.f6491c0 = c3565s8.f60501d[0].f6412u | this.f6491c0;
                zk8VarArr[i4] = new jn7(this, iIndexOf);
                zArr2[i4] = true;
                if (!z) {
                    yk8 yk8Var = this.f6474O[iIndexOf];
                    z = (yk8Var.f69956q + yk8Var.f69958s == 0 || yk8Var.m25179r(j, true)) ? false : true;
                }
            }
        }
        if (this.f6493d0 == 0) {
            this.f6501h0 = false;
            this.f6489b0 = false;
            this.f6491c0 = false;
            gv5 gv5Var = this.f6506k;
            if (((hh5) gv5Var.f41393c) != null) {
                for (yk8 yk8Var2 : this.f6474O) {
                    yk8Var2.m25170i();
                }
                hh5 hh5Var = (hh5) gv5Var.f41393c;
                hh5Var.getClass();
                hh5Var.m13240a(false);
            } else {
                this.f6505j0 = false;
                for (yk8 yk8Var3 : this.f6474O) {
                    yk8Var3.m25178q(false);
                }
            }
        } else if (z) {
            j = mo2548g(j);
            for (int i5 = 0; i5 < zk8VarArr.length; i5++) {
                if (zk8VarArr[i5] != null) {
                    zArr2[i5] = true;
                }
            }
        }
        this.f6487a0 = true;
        return j;
    }

    @Override // p000.xu5
    /* JADX INFO: renamed from: d */
    public final long mo2545d() {
        return mo2557p();
    }

    /* JADX WARN: Code duplicated, block: B:73:0x00ce A[RETURN] */
    @Override // p000.xu5
    /* JADX INFO: renamed from: e */
    public final long mo2546e(long j, tt8 tt8Var) {
        m2542a();
        if (!this.f6481V.mo3541c()) {
            return 0L;
        }
        rt8 rt8VarMo3543f = this.f6481V.mo3543f(j);
        long j2 = rt8VarMo3543f.f59799a.f64338a;
        long j3 = rt8VarMo3543f.f59800b.f64338a;
        long j4 = tt8Var.f62869b;
        long j5 = tt8Var.f62868a;
        if (j5 == 0 && j4 == 0) {
            return j;
        }
        String str = uma.f64080a;
        long j6 = j - j5;
        long j7 = Long.MAX_VALUE;
        long j8 = (((j5 ^ j) > 0L ? 1 : ((j5 ^ j) == 0L ? 0 : -1)) >= 0) | (((j ^ j6) > 0L ? 1 : ((j ^ j6) == 0L ? 0 : -1)) >= 0) ? j6 : ((j6 >>> 63) ^ 1) + Long.MAX_VALUE;
        if ((j8 == Long.MIN_VALUE && j6 != Long.MIN_VALUE) || (j8 == Long.MAX_VALUE && j6 != Long.MAX_VALUE)) {
            j8 = Long.MIN_VALUE;
        }
        long j9 = j + j4;
        long j10 = (((j4 ^ j) > 0L ? 1 : ((j4 ^ j) == 0L ? 0 : -1)) < 0) | (((j ^ j9) > 0L ? 1 : ((j ^ j9) == 0L ? 0 : -1)) >= 0) ? j9 : ((j9 >>> 63) ^ 1) + Long.MAX_VALUE;
        if ((j10 != Long.MIN_VALUE || j9 == Long.MIN_VALUE) && (j10 != Long.MAX_VALUE || j9 == Long.MAX_VALUE)) {
            j7 = j10;
        }
        boolean z = j8 <= j2 && j2 <= j7;
        boolean z2 = j8 <= j3 && j3 <= j7;
        if (z && z2) {
            if (Math.abs(j2 - j) <= Math.abs(j3 - j)) {
                return j2;
            }
            return j3;
        }
        if (!z) {
            if (z2) {
                return j3;
            }
            return j8;
        }
        return j2;
    }

    @Override // p000.xu5
    /* JADX INFO: renamed from: f */
    public final void mo2547f() throws ParserException {
        m2565x();
        if (this.f6505j0 && !this.f6477R) {
            throw ParserException.m2516a(null, "Loading finished before preparation is complete.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:68:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bf A[LOOP:1: B:69:0x00bd->B:70:0x00bf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00dd A[LOOP:2: B:74:0x00db->B:75:0x00dd, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:68:0x00b9, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:73:0x00d4, please report this as an issue */
    @Override // p000.xu5
    /* JADX INFO: renamed from: g */
    public final long mo2548g(long j) throws Throwable {
        gv5 gv5Var;
        int i;
        int i2;
        boolean zM25179r;
        m2542a();
        boolean[] zArr = (boolean[]) this.f6480U.f50861c;
        if (!this.f6481V.mo3541c()) {
            j = 0;
        }
        this.f6489b0 = false;
        boolean z = this.f6497f0 == j;
        this.f6497f0 = j;
        if (m2561t()) {
            this.f6499g0 = j;
            return j;
        }
        if (this.f6484Y == 7 || (!this.f6505j0 && ((hh5) this.f6506k.f41393c) == null)) {
            this.f6501h0 = false;
            this.f6499g0 = j;
            this.f6505j0 = false;
            this.f6491c0 = false;
            gv5Var = this.f6506k;
            if (((hh5) gv5Var.f41393c) != null) {
                gv5Var.f41394d = null;
                for (yk8 yk8Var : this.f6474O) {
                    yk8Var.m25178q(false);
                }
                break;
            }
            for (yk8 yk8Var2 : this.f6474O) {
                yk8Var2.m25170i();
            }
            hh5 hh5Var = (hh5) this.f6506k.f41393c;
            hh5Var.getClass();
            hh5Var.m13240a(false);
            return j;
        }
        int length = this.f6474O.length;
        for (int i3 = 0; i3 < length; i3++) {
            yk8 yk8Var3 = this.f6474O[i3];
            if (this.f6473N[i3].f6464d.get() == ProgressiveMediaPeriod$ControlledTrackOutput$OutputMode.PASS_THROUGH) {
                int i4 = yk8Var3.f69956q;
                if (yk8Var3.f69958s + i4 != 0 || !z) {
                    if (this.f6479T) {
                        synchronized (yk8Var3) {
                            synchronized (yk8Var3) {
                                yk8Var3.f69958s = 0;
                                wk8 wk8Var = yk8Var3.f69940a;
                                wk8Var.f66979e = wk8Var.f66978d;
                            }
                        }
                        int i5 = yk8Var3.f69956q;
                        if (i4 >= i5 && i4 <= yk8Var3.f69955p + i5) {
                            int i6 = yk8Var3.f69963x;
                            if (i6 == -1 || i4 < i6) {
                                yk8Var3.f69959t = Long.MIN_VALUE;
                                yk8Var3.f69958s = i4 - i5;
                                zM25179r = true;
                            }
                        }
                        zM25179r = false;
                    } else {
                        zM25179r = yk8Var3.m25179r(j, this.f6505j0);
                    }
                    if (!zM25179r && (zArr[i3] || !this.f6478S)) {
                        this.f6501h0 = false;
                        this.f6499g0 = j;
                        this.f6505j0 = false;
                        this.f6491c0 = false;
                        gv5Var = this.f6506k;
                        if (((hh5) gv5Var.f41393c) != null) {
                            gv5Var.f41394d = null;
                            while (i < r0) {
                                yk8Var.m25178q(false);
                            }
                            break;
                            break;
                        }
                        while (i2 < r2) {
                            yk8Var2.m25170i();
                        }
                        hh5 hh5Var2 = (hh5) this.f6506k.f41393c;
                        hh5Var2.getClass();
                        hh5Var2.m13240a(false);
                        return j;
                    }
                }
            }
        }
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    @Override // p000.xu5
    /* JADX INFO: renamed from: h */
    public final void mo2549h(long j) {
        long jM25169h;
        long j2;
        int i;
        if (this.f6479T) {
            return;
        }
        m2542a();
        if (m2561t()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.f6480U.f50862d;
        int length = this.f6474O.length;
        int i2 = 0;
        while (i2 < length) {
            yk8 yk8Var = this.f6474O[i2];
            boolean z = zArr[i2];
            wk8 wk8Var = yk8Var.f69940a;
            synchronized (yk8Var) {
                try {
                    int i3 = yk8Var.f69955p;
                    jM25169h = -1;
                    if (i3 != 0) {
                        long[] jArr = yk8Var.f69953n;
                        int i4 = yk8Var.f69957r;
                        if (j < jArr[i4]) {
                            j2 = j;
                        } else {
                            j2 = j;
                            int iM25172k = yk8Var.m25172k(i4, (!z || (i = yk8Var.f69958s) == i3) ? i3 : i + 1, j2, false);
                            if (iM25172k != -1) {
                                jM25169h = yk8Var.m25169h(iM25172k);
                            }
                        }
                    } else {
                        j2 = j;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            wk8Var.m24026a(jM25169h);
            i2++;
            j = j2;
        }
    }

    @Override // p000.xu5
    /* JADX INFO: renamed from: i */
    public final boolean mo2550i() {
        boolean z;
        if (this.f6505j0 || ((hh5) this.f6506k.f41393c) == null) {
            return false;
        }
        hg1 hg1Var = this.f6467H;
        synchronized (hg1Var) {
            z = hg1Var.f42318b;
        }
        return z;
    }

    @Override // p000.jy2
    /* JADX INFO: renamed from: j */
    public final void mo2551j() {
        this.f6476Q = true;
        this.f6470K.post(this.f6468I);
    }

    @Override // p000.xu5
    /* JADX INFO: renamed from: k */
    public final long mo2552k() {
        if (this.f6491c0) {
            this.f6491c0 = false;
            return this.f6497f0;
        }
        if (!this.f6489b0) {
            return -9223372036854775807L;
        }
        if (!this.f6505j0 && m2543b() <= this.f6503i0) {
            return -9223372036854775807L;
        }
        this.f6489b0 = false;
        return this.f6497f0;
    }

    @Override // p000.xu5
    /* JADX INFO: renamed from: l */
    public final void mo2553l(wu5 wu5Var, long j) {
        this.f6471L = wu5Var;
        this.f6467H.m13225b();
        m2540B();
    }

    @Override // p000.xu5
    /* JADX INFO: renamed from: m */
    public final k8a mo2554m() {
        m2542a();
        return (k8a) this.f6480U.f50860b;
    }

    @Override // p000.jy2
    /* JADX INFO: renamed from: n */
    public final n8a mo2555n(int i, int i2) {
        return m2539A(new kn7(i, false));
    }

    @Override // p000.xu5
    /* JADX INFO: renamed from: o */
    public final boolean mo2556o(oh5 oh5Var) {
        if (this.f6505j0) {
            return false;
        }
        gv5 gv5Var = this.f6506k;
        if (((IOException) gv5Var.f41394d) != null || this.f6501h0) {
            return false;
        }
        if (this.f6477R && this.f6493d0 == 0) {
            return false;
        }
        boolean zM13225b = this.f6467H.m13225b();
        if (((hh5) gv5Var.f41393c) != null) {
            return zM13225b;
        }
        m2540B();
        return true;
    }

    @Override // p000.xu5
    /* JADX INFO: renamed from: p */
    public final long mo2557p() {
        long jM2560s;
        boolean z;
        long j;
        m2542a();
        if (this.f6505j0 || this.f6493d0 == 0) {
            return Long.MIN_VALUE;
        }
        if (m2561t()) {
            return this.f6499g0;
        }
        if (this.f6478S) {
            int length = this.f6474O.length;
            jM2560s = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                C3329mb c3329mb = this.f6480U;
                if (((boolean[]) c3329mb.f50861c)[i] && ((boolean[]) c3329mb.f50862d)[i]) {
                    yk8 yk8Var = this.f6474O[i];
                    synchronized (yk8Var) {
                        z = yk8Var.f69964y;
                    }
                    if (z) {
                        continue;
                    } else {
                        yk8 yk8Var2 = this.f6474O[i];
                        synchronized (yk8Var2) {
                            j = yk8Var2.f69962w;
                        }
                        jM2560s = Math.min(jM2560s, j);
                    }
                }
            }
        } else {
            jM2560s = Long.MAX_VALUE;
        }
        if (jM2560s == Long.MAX_VALUE) {
            jM2560s = m2560s(false);
        }
        return jM2560s == Long.MIN_VALUE ? this.f6497f0 : jM2560s;
    }

    @Override // p000.jy2
    /* JADX INFO: renamed from: q */
    public final void mo2558q(st8 st8Var) {
        this.f6470K.post(new mv5(5, this, st8Var));
    }

    @Override // p000.xu5
    /* JADX INFO: renamed from: r */
    public final void mo2559r(long j) {
        boolean z;
        if (this.f6493d0 <= 0 || m2561t()) {
            return;
        }
        boolean z2 = false;
        if (this.f6485Z != Long.MIN_VALUE) {
            m2542a();
            boolean z3 = true;
            int i = 0;
            while (true) {
                yk8[] yk8VarArr = this.f6474O;
                if (i >= yk8VarArr.length) {
                    break;
                }
                C3329mb c3329mb = this.f6480U;
                if (((boolean[]) c3329mb.f50862d)[i] && (((boolean[]) c3329mb.f50861c)[i] || !this.f6478S)) {
                    yk8 yk8Var = yk8VarArr[i];
                    synchronized (yk8Var) {
                        z = yk8Var.f69963x != -1;
                    }
                    z3 &= z;
                }
                i++;
            }
            z2 = z3;
        }
        if (z2) {
            this.f6505j0 = true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x001c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX INFO: renamed from: s */
    public final long m2560s(boolean z) {
        yk8 yk8Var;
        long jMax = Long.MIN_VALUE;
        for (int i = 0; i < this.f6474O.length; i++) {
            if (z) {
                yk8Var = this.f6474O[i];
                synchronized (yk8Var) {
                    jMax = Math.max(jMax, yk8Var.f69962w);
                }
            } else {
                C3329mb c3329mb = this.f6480U;
                c3329mb.getClass();
                if (((boolean[]) c3329mb.f50862d)[i]) {
                    yk8Var = this.f6474O[i];
                    synchronized (yk8Var) {
                    }
                    jMax = Math.max(jMax, yk8Var.f69962w);
                } else {
                    continue;
                }
            }
        }
        return jMax;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m2561t() {
        return this.f6499g0 != -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:126:? -> B:107:0x017f). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: u */
    public final void m2562u() {
        ey5 ey5VarM11386a;
        char c;
        long j = this.f6504j;
        if (this.f6507k0 || this.f6477R || !this.f6476Q || this.f6481V == null) {
            return;
        }
        char c2 = 0;
        for (yk8 yk8Var : this.f6474O) {
            if (yk8Var.m25174m() == null) {
                return;
            }
        }
        hg1 hg1Var = this.f6467H;
        synchronized (hg1Var) {
            hg1Var.f42318b = false;
        }
        int length = this.f6474O.length;
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            char c3 = 1;
            if (i2 >= length) {
                break;
            }
            C0713b c0713bM25174m = this.f6474O[i2].m25174m();
            c0713bM25174m.getClass();
            int iM11397g = ez5.m11397g(c0713bM25174m.f6406o);
            if (iM11397g == 1) {
                c = 3;
            } else if (iM11397g == 2) {
                c = 4;
            } else if (iM11397g != 3) {
                c = iM11397g != 4 ? (char) 0 : (char) 2;
            } else {
                c = 1;
            }
            if (i == 1) {
                c3 = 3;
            } else if (i == 2) {
                c3 = 4;
            } else if (i != 3) {
                c3 = i != 4 ? (char) 0 : (char) 2;
            }
            if (c > c3) {
                i3 = i2;
                i = iM11397g;
            }
            i2++;
        }
        j8a[] j8aVarArr = new j8a[length];
        boolean[] zArr = new boolean[length];
        int i4 = 0;
        while (i4 < length) {
            C0713b c0713bM25174m2 = this.f6474O[i4].m25174m();
            c0713bM25174m2.getClass();
            String str = c0713bM25174m2.f6406o;
            boolean zM11398h = ez5.m11398h(str);
            boolean z = (zM11398h || ez5.m11401k(str)) ? true : c2;
            zArr[i4] = z;
            char c4 = c2;
            this.f6478S = (this.f6478S ? 1 : 0) | (z ? 1 : 0);
            this.f6479T = (j != -9223372036854775807L && length == 1 && ez5.m11399i(str)) ? 1 : c4;
            wy3 wy3Var = this.f6472M;
            if (wy3Var != null) {
                int i5 = wy3Var.f67512a;
                if (zM11398h || this.f6475P[i4].f47556b) {
                    ey5 ey5Var = c0713bM25174m2.f6403l;
                    if (ey5Var == null) {
                        dy5[] dy5VarArr = new dy5[1];
                        dy5VarArr[c4] = wy3Var;
                        ey5VarM11386a = new ey5(dy5VarArr);
                    } else {
                        dy5[] dy5VarArr2 = new dy5[1];
                        dy5VarArr2[c4] = wy3Var;
                        ey5VarM11386a = ey5Var.m11386a(dy5VarArr2);
                    }
                    lc3 lc3VarM2520a = c0713bM25174m2.m2520a();
                    lc3VarM2520a.f49450k = ey5VarM11386a;
                    c0713bM25174m2 = new C0713b(lc3VarM2520a);
                }
                if (zM11398h && c0713bM25174m2.f6399h == -1 && c0713bM25174m2.f6400i == -1 && i5 != -1) {
                    lc3 lc3VarM2520a2 = c0713bM25174m2.m2520a();
                    lc3VarM2520a2.f49447h = i5;
                    c0713bM25174m2 = new C0713b(lc3VarM2520a2);
                }
            }
            int iM16913l = this.f6490c.m16913l(c0713bM25174m2);
            lc3 lc3VarM2520a3 = c0713bM25174m2.m2520a();
            lc3VarM2520a3.f49439O = iM16913l;
            C0713b c0713b = new C0713b(lc3VarM2520a3);
            if (i4 != i3) {
                lc3 lc3VarM2520a4 = c0713b.m2520a();
                lc3VarM2520a4.f49451l = Integer.toString(i3);
                c0713b = new C0713b(lc3VarM2520a4);
            }
            j8aVarArr[i4] = new j8a(Integer.toString(i4), c0713b);
            this.f6491c0 = c0713b.f6412u | this.f6491c0;
            yk8 yk8Var2 = this.f6474O[i4];
            long j2 = this.f6485Z;
            synchronized (yk8Var2) {
                try {
                    if (j2 != yk8Var2.f69960u) {
                        if (j2 == Long.MIN_VALUE) {
                            yk8Var2.f69963x = -1;
                        } else {
                            int iM25171j = j2 <= yk8Var2.f69962w ? yk8Var2.m25171j(yk8Var2.f69957r, yk8Var2.f69955p, j2, false) : -1;
                            try {
                                yk8Var2.f69963x = iM25171j == -1 ? -1 : yk8Var2.f69956q + iM25171j;
                                yk8Var2.f69960u = j2;
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    yk8Var2 = yk8Var2;
                    throw th;
                }
            }
            i4++;
            c2 = c4;
        }
        this.f6480U = new C3329mb(new k8a(j8aVarArr), zArr);
        if (this.f6479T && this.f6482W == -9223372036854775807L) {
            this.f6482W = j;
            this.f6481V = new hn7(this, this.f6481V);
        }
        this.f6498g.m16944v(this.f6482W, this.f6481V, this.f6483X);
        this.f6477R = true;
        wu5 wu5Var = this.f6471L;
        wu5Var.getClass();
        wu5Var.mo17594b(this);
    }

    /* JADX INFO: renamed from: v */
    public final void m2563v(int i) {
        m2542a();
        C3329mb c3329mb = this.f6480U;
        boolean[] zArr = (boolean[]) c3329mb.f50863e;
        if (zArr[i]) {
            return;
        }
        C0713b c0713b = ((k8a) c3329mb.f50860b).m15003a(i).f45217d[0];
        ru5 ru5Var = new ru5(ez5.m11397g(c0713b.f6406o), c0713b, uma.m22805J(this.f6497f0), -9223372036854775807L);
        fm2 fm2Var = this.f6494e;
        fm2Var.m11936a(new vg1(13, fm2Var, ru5Var));
        zArr[i] = true;
    }

    /* JADX INFO: renamed from: w */
    public final void m2564w(int i) {
        m2542a();
        if (this.f6501h0) {
            if ((!this.f6478S || ((boolean[]) this.f6480U.f50861c)[i]) && !this.f6474O[i].m25175n(false)) {
                this.f6499g0 = 0L;
                this.f6501h0 = false;
                this.f6489b0 = true;
                this.f6497f0 = 0L;
                this.f6503i0 = 0;
                for (yk8 yk8Var : this.f6474O) {
                    yk8Var.m25178q(false);
                }
                wu5 wu5Var = this.f6471L;
                wu5Var.getClass();
                wu5Var.mo17593a(this);
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m2565x() {
        IOException iOException;
        int i = this.f6484Y;
        this.f6492d.getClass();
        int i2 = i == 7 ? 6 : 3;
        gv5 gv5Var = this.f6506k;
        IOException iOException2 = (IOException) gv5Var.f41394d;
        if (iOException2 != null) {
            throw iOException2;
        }
        hh5 hh5Var = (hh5) gv5Var.f41393c;
        if (hh5Var != null && (iOException = hh5Var.f42368d) != null && hh5Var.f42369e > i2) {
            throw iOException;
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m2566y(in7 in7Var, long j, long j2, boolean z) {
        e74 e74Var = in7Var.f44310b;
        eh5 eh5Var = new eh5(in7Var.f44318j, (Uri) e74Var.f36798c, (Map) e74Var.f36799d, j, e74Var.f36796a);
        this.f6492d.getClass();
        ru5 ru5Var = new ru5(-1, null, uma.m22805J(in7Var.f44317i), uma.m22805J(this.f6482W));
        fm2 fm2Var = this.f6494e;
        fm2Var.m11936a(new kv5(fm2Var, eh5Var, ru5Var, 1));
        if (z) {
            return;
        }
        for (yk8 yk8Var : this.f6474O) {
            yk8Var.m25178q(false);
        }
        if (this.f6493d0 > 0) {
            wu5 wu5Var = this.f6471L;
            wu5Var.getClass();
            wu5Var.mo17593a(this);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m2567z(in7 in7Var, long j, long j2) {
        if (this.f6482W == -9223372036854775807L && this.f6481V != null) {
            long jM2560s = m2560s(true);
            long j3 = jM2560s == Long.MIN_VALUE ? 0L : jM2560s + 10000;
            this.f6482W = j3;
            this.f6498g.m16944v(j3, this.f6481V, this.f6483X);
        }
        e74 e74Var = in7Var.f44310b;
        eh5 eh5Var = new eh5(in7Var.f44318j, (Uri) e74Var.f36798c, (Map) e74Var.f36799d, j, e74Var.f36796a);
        this.f6492d.getClass();
        ru5 ru5Var = new ru5(-1, null, uma.m22805J(in7Var.f44317i), uma.m22805J(this.f6482W));
        fm2 fm2Var = this.f6494e;
        fm2Var.m11936a(new kv5(fm2Var, eh5Var, ru5Var, 0));
        this.f6505j0 = true;
        wu5 wu5Var = this.f6471L;
        wu5Var.getClass();
        wu5Var.mo17593a(this);
    }
}
