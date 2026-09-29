package p000;

import androidx.compose.runtime.snapshots.C0285a;

/* JADX INFO: loaded from: classes.dex */
public abstract class jc9 {

    /* JADX INFO: renamed from: a */
    public C0285a f45416a;

    /* JADX INFO: renamed from: b */
    public long f45417b;

    /* JADX INFO: renamed from: c */
    public boolean f45418c;

    /* JADX INFO: renamed from: d */
    public int f45419d;

    public jc9(long j, C0285a c0285a) {
        int iM16246a;
        int iNumberOfTrailingZeros;
        this.f45416a = c0285a;
        this.f45417b = j;
        wx8 wx8Var = nc9.f52600a;
        if (j != 0) {
            C0285a c0285aMo3581d = mo3581d();
            long j2 = c0285aMo3581d.f3802c;
            long[] jArr = c0285aMo3581d.f3803d;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = c0285aMo3581d.f3801b;
                if (j3 != 0) {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = c0285aMo3581d.f3800a;
                    if (j4 != 0) {
                        j2 += 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                j = ((long) iNumberOfTrailingZeros) + j2;
            }
            synchronized (nc9.f52602c) {
                iM16246a = nc9.f52605f.m16246a(j);
            }
        } else {
            iM16246a = -1;
        }
        this.f45419d = iM16246a;
    }

    /* JADX INFO: renamed from: q */
    public static void m14390q(jc9 jc9Var) {
        nc9.f52601b.m21552A(jc9Var);
    }

    /* JADX INFO: renamed from: a */
    public final void m14391a() {
        synchronized (nc9.f52602c) {
            mo14392b();
            mo14395p();
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo14392b() {
        nc9.f52603d = nc9.f52603d.m1314f(mo3582g());
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo3162c();

    /* JADX INFO: renamed from: d */
    public C0285a mo3581d() {
        return this.f45416a;
    }

    /* JADX INFO: renamed from: e */
    public abstract vi3 mo3163e();

    /* JADX INFO: renamed from: f */
    public abstract boolean mo3164f();

    /* JADX INFO: renamed from: g */
    public long mo3582g() {
        return this.f45417b;
    }

    /* JADX INFO: renamed from: h */
    public int mo3583h() {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public abstract vi3 mo3165i();

    /* JADX INFO: renamed from: j */
    public final jc9 m14393j() {
        sq5 sq5Var = nc9.f52601b;
        jc9 jc9Var = (jc9) sq5Var.m21566g();
        sq5Var.m21552A(this);
        return jc9Var;
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo3166k();

    /* JADX INFO: renamed from: l */
    public abstract void mo3167l();

    /* JADX INFO: renamed from: m */
    public abstract void mo3168m();

    /* JADX INFO: renamed from: n */
    public abstract void mo3169n(ph9 ph9Var);

    /* JADX INFO: renamed from: o */
    public final void m14394o() {
        int i = this.f45419d;
        if (i >= 0) {
            nc9.m17369u(i);
            this.f45419d = -1;
        }
    }

    /* JADX INFO: renamed from: p */
    public void mo14395p() {
        m14394o();
    }

    /* JADX INFO: renamed from: r */
    public void mo3584r(C0285a c0285a) {
        this.f45416a = c0285a;
    }

    /* JADX INFO: renamed from: s */
    public void mo3585s(long j) {
        this.f45417b = j;
    }

    /* JADX INFO: renamed from: t */
    public void mo3586t(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    /* JADX INFO: renamed from: u */
    public abstract jc9 mo3170u(vi3 vi3Var);
}
