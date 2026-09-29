package p000;

import android.util.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class qq5 extends n9b {

    /* JADX INFO: renamed from: l */
    public final boolean f58072l;

    /* JADX INFO: renamed from: m */
    public final y0a f58073m;

    /* JADX INFO: renamed from: n */
    public final x0a f58074n;

    /* JADX INFO: renamed from: o */
    public oq5 f58075o;

    /* JADX INFO: renamed from: p */
    public nq5 f58076p;

    /* JADX INFO: renamed from: q */
    public boolean f58077q;

    /* JADX INFO: renamed from: r */
    public boolean f58078r;

    /* JADX INFO: renamed from: s */
    public boolean f58079s;

    public qq5(q90 q90Var, boolean z) {
        super(q90Var);
        this.f58072l = z && q90Var.mo17294j();
        this.f58073m = new y0a();
        this.f58074n = new x0a();
        z0a z0aVarMo17293h = q90Var.mo17293h();
        if (z0aVarMo17293h == null) {
            this.f58075o = new oq5(new pq5(q90Var.mo16937i()), y0a.f69062o, oq5.f54732e);
        } else {
            this.f58075o = new oq5(z0aVarMo17293h, null, null);
            this.f58079s = true;
        }
    }

    /* JADX INFO: renamed from: A */
    public final boolean m20114A(long j) {
        nq5 nq5Var = this.f58076p;
        int iMo17285b = this.f58075o.mo17285b(nq5Var.f53129a.f46226a);
        if (iMo17285b == -1) {
            return false;
        }
        oq5 oq5Var = this.f58075o;
        x0a x0aVar = this.f58074n;
        oq5Var.mo16393f(iMo17285b, x0aVar, false);
        long j2 = x0aVar.f67602d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        nq5Var.f53135g = j;
        return true;
    }

    @Override // p000.q90
    /* JADX INFO: renamed from: o */
    public final void mo16940o(xu5 xu5Var) {
        nq5 nq5Var = (nq5) xu5Var;
        if (nq5Var.f53133e != null) {
            q90 q90Var = nq5Var.f53132d;
            q90Var.getClass();
            q90Var.mo16940o(nq5Var.f53133e);
        }
        if (xu5Var == this.f58076p) {
            this.f58076p = null;
        }
    }

    @Override // p000.n9b, p000.q90
    /* JADX INFO: renamed from: q */
    public final void mo16941q() {
        this.f58078r = false;
        this.f58077q = false;
        super.mo16941q();
    }

    @Override // p000.n9b, p000.q90
    /* JADX INFO: renamed from: t */
    public final void mo16942t(pu5 pu5Var) {
        if (this.f58079s) {
            oq5 oq5Var = this.f58075o;
            z0a z0aVar = oq5Var.f68058b;
            this.f58075o = new oq5(z0aVar instanceof a1a ? new a1a(((a1a) z0aVar).f68058b, pu5Var) : new a1a(z0aVar, pu5Var), oq5Var.f54733c, oq5Var.f54734d);
        } else {
            this.f58075o = new oq5(new pq5(pu5Var), y0a.f69062o, oq5.f54732e);
        }
        this.f52527k.mo16942t(pu5Var);
    }

    @Override // p000.n9b
    /* JADX INFO: renamed from: u */
    public final jv5 mo17295u(jv5 jv5Var) {
        Object obj = jv5Var.f46226a;
        Object obj2 = this.f58075o.f54734d;
        if (obj2 != null && obj2.equals(obj)) {
            obj = oq5.f54732e;
        }
        return jv5Var.m14689a(obj);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // p000.n9b
    /* JADX INFO: renamed from: v */
    public final void mo17296v(z0a z0aVar) {
        long j;
        oq5 oq5Var;
        jv5 jv5VarM14689a;
        oq5 oq5Var2;
        if (this.f58078r) {
            oq5 oq5Var3 = this.f58075o;
            this.f58075o = new oq5(z0aVar, oq5Var3.f54733c, oq5Var3.f54734d);
            nq5 nq5Var = this.f58076p;
            if (nq5Var != null) {
                m20114A(nq5Var.f53135g);
            }
        } else {
            if (!z0aVar.m25398p()) {
                y0a y0aVar = this.f58073m;
                z0aVar.m25397n(0, y0aVar);
                long j2 = y0aVar.f69073j;
                Object obj = y0aVar.f69064a;
                nq5 nq5Var2 = this.f58076p;
                if (nq5Var2 != null) {
                    long j3 = nq5Var2.f53130b;
                    oq5 oq5Var4 = this.f58075o;
                    Object obj2 = nq5Var2.f53129a.f46226a;
                    x0a x0aVar = this.f58074n;
                    oq5Var4.mo23250g(obj2, x0aVar);
                    long j4 = x0aVar.f67603e + j3;
                    this.f58075o.mo39m(0, y0aVar, 0L);
                    if (j4 != y0aVar.f69073j) {
                        j = j4;
                    } else {
                        j = j2;
                    }
                } else {
                    j = j2;
                }
                Pair pairM25395i = z0aVar.m25395i(this.f58073m, this.f58074n, 0, j);
                Object obj3 = pairM25395i.first;
                long jLongValue = ((Long) pairM25395i.second).longValue();
                if (this.f58079s) {
                    oq5 oq5Var5 = this.f58075o;
                    oq5Var = new oq5(z0aVar, oq5Var5.f54733c, oq5Var5.f54734d);
                } else {
                    oq5Var = new oq5(z0aVar, obj, obj3);
                }
                this.f58075o = oq5Var;
                nq5 nq5Var3 = this.f58076p;
                if (nq5Var3 != null && m20114A(jLongValue)) {
                    jv5 jv5Var = nq5Var3.f53129a;
                    Object obj4 = jv5Var.f46226a;
                    if (this.f58075o.f54734d != null && obj4.equals(oq5.f54732e)) {
                        obj4 = this.f58075o.f54734d;
                    }
                    jv5VarM14689a = jv5Var.m14689a(obj4);
                }
                this.f58079s = true;
                this.f58078r = true;
                m19802n(this.f58075o);
                if (jv5VarM14689a != null) {
                    nq5 nq5Var4 = this.f58076p;
                    nq5Var4.getClass();
                    nq5Var4.m17595j(jv5VarM14689a);
                }
            }
            if (this.f58079s) {
                oq5 oq5Var6 = this.f58075o;
                oq5Var2 = new oq5(z0aVar, oq5Var6.f54733c, oq5Var6.f54734d);
            } else {
                oq5Var2 = new oq5(z0aVar, y0a.f69062o, oq5.f54732e);
            }
            this.f58075o = oq5Var2;
        }
        jv5VarM14689a = null;
        this.f58079s = true;
        this.f58078r = true;
        m19802n(this.f58075o);
        if (jv5VarM14689a != null) {
            nq5 nq5Var5 = this.f58076p;
            nq5Var5.getClass();
            nq5Var5.m17595j(jv5VarM14689a);
        }
    }

    @Override // p000.n9b
    /* JADX INFO: renamed from: x */
    public final void mo17298x() {
        if (this.f58072l) {
            return;
        }
        this.f58077q = true;
        m17297w();
    }

    @Override // p000.q90
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final nq5 mo16936c(jv5 jv5Var, gv5 gv5Var, long j) {
        nq5 nq5Var = new nq5(jv5Var, gv5Var, j);
        bna.m3987z(nq5Var.f53132d == null);
        nq5Var.f53132d = this.f52527k;
        if (!this.f58078r) {
            this.f58076p = nq5Var;
            if (!this.f58077q) {
                this.f58077q = true;
                m17297w();
            }
            return nq5Var;
        }
        Object obj = jv5Var.f46226a;
        if (this.f58075o.f54734d != null && obj.equals(oq5.f54732e)) {
            obj = this.f58075o.f54734d;
        }
        nq5Var.m17595j(jv5Var.m14689a(obj));
        return nq5Var;
    }

    /* JADX INFO: renamed from: z */
    public final oq5 m20116z() {
        return this.f58075o;
    }
}
