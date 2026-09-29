package p000;

import androidx.media3.common.C0713b;

/* JADX INFO: loaded from: classes2.dex */
public final class v31 implements zk8 {

    /* JADX INFO: renamed from: a */
    public final zk8 f64778a;

    /* JADX INFO: renamed from: b */
    public boolean f64779b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ w31 f64780c;

    public v31(w31 w31Var, zk8 zk8Var) {
        this.f64780c = w31Var;
        this.f64778a = zk8Var;
    }

    @Override // p000.zk8
    /* JADX INFO: renamed from: a */
    public final boolean mo4198a() {
        return !this.f64780c.m23698j() && this.f64778a.mo4198a();
    }

    @Override // p000.zk8
    /* JADX INFO: renamed from: b */
    public final int mo4199b(p33 p33Var, m32 m32Var, int i) {
        w31 w31Var = this.f64780c;
        if (w31Var.m23698j()) {
            return -3;
        }
        if (this.f64779b) {
            m32Var.f8576b = 4;
            return -4;
        }
        long jMo2557p = w31Var.mo2557p();
        int iMo4199b = this.f64778a.mo4199b(p33Var, m32Var, i);
        if (w31Var.f66321e != -9223372036854775807L && iMo4199b != -3) {
            w31Var.f66321e = -9223372036854775807L;
        }
        if (iMo4199b != -5) {
            long j = w31Var.f66323g;
            if (j == Long.MIN_VALUE || ((iMo4199b != -4 || m32Var.f50502g < j) && !(iMo4199b == -3 && jMo2557p == Long.MIN_VALUE && !m32Var.f50501f))) {
                return iMo4199b;
            }
            m32Var.mo16607k();
            m32Var.f8576b = 4;
            this.f64779b = true;
            return -4;
        }
        long j2 = w31Var.f66322f;
        long j3 = w31Var.f66323g;
        C0713b c0713b = (C0713b) p33Var.f55514c;
        c0713b.getClass();
        int i2 = c0713b.f6385K;
        int i3 = c0713b.f6384J;
        if (i3 != 0 || i2 != 0) {
            if (j2 != 0) {
                i3 = 0;
            }
            if (j3 != Long.MIN_VALUE) {
                i2 = 0;
            }
            lc3 lc3VarM2520a = c0713b.m2520a();
            lc3VarM2520a.f49433I = i3;
            lc3VarM2520a.f49434J = i2;
            p33Var.f55514c = new C0713b(lc3VarM2520a);
        }
        return -5;
    }

    @Override // p000.zk8
    /* JADX INFO: renamed from: c */
    public final void mo4200c() {
        this.f64778a.mo4200c();
    }

    @Override // p000.zk8
    /* JADX INFO: renamed from: d */
    public final int mo4201d(long j) {
        if (this.f64780c.m23698j()) {
            return -3;
        }
        return this.f64778a.mo4201d(j);
    }
}
