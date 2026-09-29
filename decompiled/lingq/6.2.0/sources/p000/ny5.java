package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.common.C0713b;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ny5 extends y90 implements Handler.Callback {

    /* JADX INFO: renamed from: N */
    public final mkd f53399N;

    /* JADX INFO: renamed from: O */
    public final ew2 f53400O;

    /* JADX INFO: renamed from: P */
    public final Handler f53401P;

    /* JADX INFO: renamed from: Q */
    public final jy5 f53402Q;

    /* JADX INFO: renamed from: R */
    public h3d f53403R;

    /* JADX INFO: renamed from: S */
    public boolean f53404S;

    /* JADX INFO: renamed from: T */
    public boolean f53405T;

    /* JADX INFO: renamed from: U */
    public long f53406U;

    /* JADX INFO: renamed from: V */
    public ey5 f53407V;

    /* JADX INFO: renamed from: W */
    public long f53408W;

    public ny5(ew2 ew2Var, Looper looper) {
        super(5);
        this.f53400O = ew2Var;
        this.f53401P = looper == null ? null : new Handler(looper, this);
        this.f53399N = hy5.f43204u;
        this.f53402Q = new jy5(1);
        this.f53408W = -9223372036854775807L;
    }

    @Override // p000.y90
    /* JADX INFO: renamed from: D */
    public final int mo4251D(C0713b c0713b) {
        if (this.f53399N.m16914n(c0713b)) {
            return y90.m24988f(c0713b.f6390P == 0 ? 4 : 2, 0, 0, 0);
        }
        return y90.m24988f(0, 0, 0, 0);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0043  */
    /* JADX INFO: renamed from: G */
    public final void m17669G(ey5 ey5Var, ArrayList arrayList) {
        for (int i = 0; i < ey5Var.m11390e(); i++) {
            C0713b c0713bMo10746a = ey5Var.m11389d(i).mo10746a();
            if (c0713bMo10746a != null) {
                mkd mkdVar = this.f53399N;
                if (mkdVar.m16914n(c0713bMo10746a)) {
                    h3d h3dVarM16912j = mkdVar.m16912j(c0713bMo10746a);
                    byte[] bArrMo10747c = ey5Var.m11389d(i).mo10747c();
                    bArrMo10747c.getClass();
                    jy5 jy5Var = this.f53402Q;
                    jy5Var.mo16607k();
                    jy5Var.m16609n(bArrMo10747c.length);
                    jy5Var.f50500e.put(bArrMo10747c);
                    jy5Var.m16610o();
                    ey5 ey5VarM13038a = h3dVarM16912j.m13038a(jy5Var);
                    if (ey5VarM13038a != null) {
                        m17669G(ey5VarM13038a, arrayList);
                    }
                } else {
                    arrayList.add(ey5Var.m11389d(i));
                }
            } else {
                arrayList.add(ey5Var.m11389d(i));
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public final long m17670H(long j) {
        bna.m3987z(j != -9223372036854775807L);
        bna.m3987z(this.f53408W != -9223372036854775807L);
        return j - this.f53408W;
    }

    /* JADX INFO: renamed from: I */
    public final void m17671I(ey5 ey5Var) {
        ew2 ew2Var = this.f53400O;
        jw2 jw2Var = ew2Var.f37985a;
        tu5 tu5Var = jw2Var.f46279Z;
        vg5 vg5Var = jw2Var.f46295m;
        su5 su5VarM22307a = tu5Var.m22307a();
        for (int i = 0; i < ey5Var.m11390e(); i++) {
            ey5Var.m11389d(i).mo4207b(su5VarM22307a);
        }
        jw2Var.f46279Z = new tu5(su5VarM22307a);
        tu5 tu5VarM14706b = jw2Var.m14706b();
        if (!tu5VarM14706b.equals(jw2Var.f46268O)) {
            jw2Var.f46268O = tu5VarM14706b;
            vg5Var.m23270c(14, new C3440oy(ew2Var, 11));
        }
        vg5Var.m23270c(28, new C3440oy(ey5Var, 12));
        vg5Var.m23269b();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            m17671I((ey5) message.obj);
            return true;
        }
        uk9.m22770c();
        return false;
    }

    @Override // p000.y90
    /* JADX INFO: renamed from: k */
    public final String mo4257k() {
        return "MetadataRenderer";
    }

    @Override // p000.y90
    /* JADX INFO: renamed from: m */
    public final boolean mo4258m() {
        return this.f53405T;
    }

    @Override // p000.y90
    /* JADX INFO: renamed from: o */
    public final boolean mo4259o() {
        return true;
    }

    @Override // p000.y90
    /* JADX INFO: renamed from: p */
    public final void mo4260p() {
        this.f53407V = null;
        this.f53403R = null;
        this.f53408W = -9223372036854775807L;
    }

    @Override // p000.y90
    /* JADX INFO: renamed from: r */
    public final void mo4262r(long j, boolean z, boolean z2) {
        this.f53407V = null;
        this.f53404S = false;
        this.f53405T = false;
    }

    @Override // p000.y90
    /* JADX INFO: renamed from: w */
    public final void mo4265w(C0713b[] c0713bArr, long j, long j2, jv5 jv5Var) {
        this.f53403R = this.f53399N.m16912j(c0713bArr[0]);
        ey5 ey5Var = this.f53407V;
        if (ey5Var != null) {
            this.f53407V = ey5Var.m11388c((ey5Var.f38075b + this.f53408W) - j2);
        }
        this.f53408W = j2;
    }

    @Override // p000.y90
    /* JADX INFO: renamed from: z */
    public final void mo4266z(long j, long j2) {
        boolean z = true;
        while (z) {
            if (!this.f53404S && this.f53407V == null) {
                jy5 jy5Var = this.f53402Q;
                jy5Var.mo16607k();
                p33 p33Var = this.f69497c;
                p33Var.m18865G();
                int iM24994y = m24994y(p33Var, jy5Var, 0);
                if (iM24994y == -4) {
                    if (jy5Var.m3751d(4)) {
                        this.f53404S = true;
                    } else if (jy5Var.f50502g >= this.f69506l) {
                        jy5Var.f46391j = this.f53406U;
                        jy5Var.m16610o();
                        h3d h3dVar = this.f53403R;
                        String str = uma.f64080a;
                        ey5 ey5VarM13038a = h3dVar.m13038a(jy5Var);
                        if (ey5VarM13038a != null) {
                            ArrayList arrayList = new ArrayList(ey5VarM13038a.m11390e());
                            m17669G(ey5VarM13038a, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.f53407V = new ey5(m17670H(jy5Var.f50502g), arrayList);
                            }
                        }
                    }
                } else if (iM24994y == -5) {
                    C0713b c0713b = (C0713b) p33Var.f55514c;
                    c0713b.getClass();
                    this.f53406U = c0713b.f6411t;
                }
            }
            ey5 ey5Var = this.f53407V;
            if (ey5Var == null || ey5Var.f38075b > m17670H(j)) {
                z = false;
            } else {
                ey5 ey5Var2 = this.f53407V;
                Handler handler = this.f53401P;
                if (handler != null) {
                    handler.obtainMessage(1, ey5Var2).sendToTarget();
                } else {
                    m17671I(ey5Var2);
                }
                this.f53407V = null;
                z = true;
            }
            if (this.f53404S && this.f53407V == null) {
                this.f53405T = true;
            }
        }
    }
}
