package p000;

import androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class z31 extends n9b {

    /* JADX INFO: renamed from: l */
    public final long f70817l;

    /* JADX INFO: renamed from: m */
    public final long f70818m;

    /* JADX INFO: renamed from: n */
    public final boolean f70819n;

    /* JADX INFO: renamed from: o */
    public final ArrayList f70820o;

    /* JADX INFO: renamed from: p */
    public final y0a f70821p;

    /* JADX INFO: renamed from: q */
    public y31 f70822q;

    /* JADX INFO: renamed from: r */
    public ClippingMediaSource$IllegalClippingException f70823r;

    /* JADX INFO: renamed from: s */
    public long f70824s;

    /* JADX INFO: renamed from: t */
    public long f70825t;

    public z31(x31 x31Var) {
        super(x31Var.f67694a);
        this.f70817l = x31Var.f67695b;
        this.f70818m = x31Var.f67696c;
        this.f70819n = true;
        this.f70820o = new ArrayList();
        this.f70821p = new y0a();
    }

    @Override // p000.q90
    /* JADX INFO: renamed from: c */
    public final xu5 mo16936c(jv5 jv5Var, gv5 gv5Var, long j) {
        w31 w31Var = new w31(this.f52527k.mo16936c(jv5Var, gv5Var, j), this.f70819n, this.f70824s, this.f70825t);
        this.f70820o.add(w31Var);
        return w31Var;
    }

    @Override // p000.n9b, p000.q90
    /* JADX INFO: renamed from: k */
    public final void mo16938k() throws ClippingMediaSource$IllegalClippingException {
        ClippingMediaSource$IllegalClippingException clippingMediaSource$IllegalClippingException = this.f70823r;
        if (clippingMediaSource$IllegalClippingException != null) {
            throw clippingMediaSource$IllegalClippingException;
        }
        super.mo16938k();
    }

    @Override // p000.q90
    /* JADX INFO: renamed from: o */
    public final void mo16940o(xu5 xu5Var) {
        ArrayList arrayList = this.f70820o;
        bna.m3987z(arrayList.remove(xu5Var));
        this.f52527k.mo16940o(((w31) xu5Var).f66317a);
        if (arrayList.isEmpty()) {
            y31 y31Var = this.f70822q;
            y31Var.getClass();
            m25424y(y31Var.f68058b);
        }
    }

    @Override // p000.n9b, p000.q90
    /* JADX INFO: renamed from: q */
    public final void mo16941q() {
        super.mo16941q();
        this.f70823r = null;
        this.f70822q = null;
    }

    @Override // p000.n9b
    /* JADX INFO: renamed from: v */
    public final void mo17296v(z0a z0aVar) {
        if (this.f70823r != null) {
            return;
        }
        m25424y(z0aVar);
    }

    /* JADX INFO: renamed from: y */
    public final void m25424y(z0a z0aVar) {
        long j;
        y0a y0aVar = this.f70821p;
        z0aVar.m25397n(0, y0aVar);
        long j2 = y0aVar.f69077n;
        y31 y31Var = this.f70822q;
        long j3 = this.f70818m;
        ArrayList arrayList = this.f70820o;
        if (y31Var == null || arrayList.isEmpty()) {
            j = this.f70817l;
            this.f70824s = j2 + j;
            this.f70825t = j3 != Long.MIN_VALUE ? j2 + j3 : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                w31 w31Var = (w31) arrayList.get(i);
                long j4 = this.f70824s;
                long j5 = this.f70825t;
                w31Var.f66322f = j4;
                w31Var.f66323g = j5;
            }
        } else {
            j = this.f70824s - j2;
            j3 = j3 == Long.MIN_VALUE ? Long.MIN_VALUE : this.f70825t - j2;
        }
        try {
            y31 y31Var2 = new y31(z0aVar, j, j3);
            this.f70822q = y31Var2;
            m19802n(y31Var2);
        } catch (ClippingMediaSource$IllegalClippingException e) {
            this.f70823r = e;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((w31) arrayList.get(i2)).f66324h = this.f70823r;
            }
        }
    }
}
