package p000;

import androidx.media3.common.C0713b;

/* JADX INFO: loaded from: classes.dex */
public final class c68 {

    /* JADX INFO: renamed from: a */
    public boolean f9638a;

    /* JADX INFO: renamed from: b */
    public boolean f9639b;

    /* JADX INFO: renamed from: c */
    public int f9640c;

    /* JADX INFO: renamed from: d */
    public int f9641d;

    /* JADX INFO: renamed from: e */
    public Object f9642e;

    /* JADX INFO: renamed from: f */
    public Object f9643f;

    /* JADX INFO: renamed from: b */
    public static void m4344b(y90 y90Var) {
        int i = y90Var.f69502h;
        if (i == 2) {
            bna.m3987z(i == 2);
            y90Var.f69502h = 1;
            y90Var.mo12194v();
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m4345h(y90 y90Var) {
        return y90Var.f69502h != 0;
    }

    /* JADX INFO: renamed from: l */
    public static void m4346l(y90 y90Var, long j) {
        y90Var.f69490I = true;
        if (y90Var instanceof lx9) {
            lx9 lx9Var = (lx9) y90Var;
            bna.m3987z(lx9Var.f69490I);
            lx9Var.f50277f0 = j;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m4347a(y90 y90Var, j72 j72Var) {
        bna.m3987z(((y90) this.f9642e) == y90Var || ((y90) this.f9643f) == y90Var);
        if (m4345h(y90Var)) {
            if (y90Var == j72Var.f45137c) {
                j72Var.f45138d = null;
                j72Var.f45137c = null;
                j72Var.f45139e = true;
            }
            m4344b(y90Var);
            bna.m3987z(y90Var.f69502h == 1);
            y90Var.f69497c.m18865G();
            y90Var.f69502h = 0;
            y90Var.f69503i = null;
            y90Var.f69504j = null;
            y90Var.f69490I = false;
            y90Var.mo4260p();
            y90Var.f69493L = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public int m4348c() {
        boolean zM4345h = m4345h((y90) this.f9642e);
        y90 y90Var = (y90) this.f9643f;
        return (zM4345h ? 1 : 0) + ((y90Var == null || !m4345h(y90Var)) ? 0 : 1);
    }

    /* JADX INFO: renamed from: d */
    public y90 m4349d(yu5 yu5Var) {
        zk8 zk8Var;
        if (yu5Var != null && (zk8Var = yu5Var.f70474c[this.f9640c]) != null) {
            y90 y90Var = (y90) this.f9642e;
            if (y90Var.f69503i == zk8Var) {
                return y90Var;
            }
            y90 y90Var2 = (y90) this.f9643f;
            if (y90Var2 != null && y90Var2.f69503i == zk8Var) {
                return y90Var2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public boolean m4350e(yu5 yu5Var, y90 y90Var) {
        int i = this.f9640c;
        if (y90Var == null) {
            return true;
        }
        zk8 zk8Var = yu5Var.f70474c[i];
        zk8 zk8Var2 = y90Var.f69503i;
        if (zk8Var2 == null) {
            return true;
        }
        if (zk8Var2 == zk8Var) {
            if (zk8Var == null || y90Var.m24993l()) {
                return true;
            }
            yu5 yu5VarM25325h = yu5Var.m25325h();
            if (yu5Var.f70478g.f72185h && yu5VarM25325h != null && yu5VarM25325h.f70476e && ((y90Var instanceof lx9) || (y90Var instanceof ny5) || y90Var.f69489H >= yu5VarM25325h.m25328k())) {
                return true;
            }
        }
        yu5 yu5VarM25325h2 = yu5Var.m25325h();
        return yu5VarM25325h2 != null && yu5VarM25325h2.f70474c[i] == y90Var.f69503i;
    }

    /* JADX INFO: renamed from: f */
    public boolean m4351f() {
        int i = this.f9641d;
        return i == 2 || i == 4 || i == 3;
    }

    /* JADX INFO: renamed from: g */
    public boolean m4352g() {
        int i = this.f9641d;
        if (i == 0 || i == 2 || i == 4) {
            return m4345h((y90) this.f9642e);
        }
        y90 y90Var = (y90) this.f9643f;
        y90Var.getClass();
        return y90Var.f69502h != 0;
    }

    /* JADX INFO: renamed from: i */
    public void m4353i(boolean z) {
        if (z) {
            if (this.f9638a) {
                y90 y90Var = (y90) this.f9642e;
                bna.m3987z(y90Var.f69502h == 0);
                y90Var.f69497c.m18865G();
                y90Var.mo4264t();
                this.f9638a = false;
                return;
            }
            return;
        }
        if (this.f9639b) {
            y90 y90Var2 = (y90) this.f9643f;
            y90Var2.getClass();
            bna.m3987z(y90Var2.f69502h == 0);
            y90Var2.f69497c.m18865G();
            y90Var2.mo4264t();
            this.f9639b = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public int m4354j(y90 y90Var, yu5 yu5Var, u8a u8aVar, j72 j72Var) {
        int i;
        y90 y90Var2 = (y90) this.f9642e;
        int i2 = this.f9640c;
        if (y90Var == null || y90Var.f69502h == 0 || (y90Var == y90Var2 && ((i = this.f9641d) == 2 || i == 4))) {
            return 1;
        }
        if (y90Var == ((y90) this.f9643f) && this.f9641d == 3) {
            return 1;
        }
        Object[] objArr = y90Var.f69503i != yu5Var.f70474c[i2];
        boolean zM22552m = u8aVar.m22552m(i2);
        if (!zM22552m || objArr != false) {
            if (!y90Var.f69490I) {
                C3565s8 c3565s8 = ((C3565s8[]) u8aVar.f63595d)[i2];
                int iM21154e = c3565s8 != null ? c3565s8.m21154e() : 0;
                C0713b[] c0713bArr = new C0713b[iM21154e];
                for (int i3 = 0; i3 < iM21154e; i3++) {
                    c3565s8.getClass();
                    c0713bArr[i3] = c3565s8.m21151b(i3);
                }
                zk8 zk8Var = yu5Var.f70474c[i2];
                zk8Var.getClass();
                y90Var.m24990A(c0713bArr, zk8Var, yu5Var.m25328k(), yu5Var.m25327j(), yu5Var.f70478g.f72178a);
                return 3;
            }
            if (!y90Var.mo4258m()) {
                return 0;
            }
            m4347a(y90Var, j72Var);
            if (!zM22552m || m4351f()) {
                m4353i(y90Var == y90Var2);
                return 1;
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: k */
    public void m4355k() {
        if (!m4345h((y90) this.f9642e)) {
            m4353i(true);
        }
        y90 y90Var = (y90) this.f9643f;
        if (y90Var == null || y90Var.f69502h != 0) {
            return;
        }
        m4353i(false);
    }

    /* JADX INFO: renamed from: m */
    public void m4356m() {
        int i;
        y90 y90Var = (y90) this.f9642e;
        int i2 = y90Var.f69502h;
        if (i2 == 1 && this.f9641d != 4) {
            bna.m3987z(i2 == 1);
            y90Var.f69502h = 2;
            y90Var.mo12193u();
            return;
        }
        y90 y90Var2 = (y90) this.f9643f;
        if (y90Var2 == null || (i = y90Var2.f69502h) != 1 || this.f9641d == 3) {
            return;
        }
        bna.m3987z(i == 1);
        y90Var2.f69502h = 2;
        y90Var2.mo12193u();
    }
}
