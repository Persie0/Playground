package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cdu implements fbj, fbl, fbn, fbo, fbg {

    /* JADX INFO: renamed from: a */
    public final Object f5331a = new Object();

    /* JADX INFO: renamed from: b */
    public jvb f5332b;

    /* JADX INFO: renamed from: c */
    public jvb f5333c;

    /* JADX INFO: renamed from: d */
    public jvb f5334d;

    /* JADX INFO: renamed from: e */
    public cjp f5335e;

    /* JADX INFO: renamed from: f */
    public cjp f5336f;

    /* JADX INFO: renamed from: g */
    public cjp f5337g;

    /* JADX INFO: renamed from: h */
    public final chx f5338h;

    public cdu(chx chxVar) {
        this.f5338h = chxVar;
        jvb jvbVarM3790b = chxVar.m3790b();
        this.f5334d = jvbVarM3790b;
        jvb jvbVarM3791c = chxVar.m3791c(jvbVarM3790b);
        this.f5333c = jvbVarM3791c;
        this.f5332b = chxVar.m3789a(jvbVarM3791c);
        jvb jvbVar = this.f5334d;
        cjp cjpVar = new cjp();
        jvbVar.m13537d(cjpVar);
        this.f5337g = cjpVar;
        jvb jvbVar2 = this.f5333c;
        cjp cjpVar2 = new cjp();
        jvbVar2.m13537d(cjpVar2);
        this.f5336f = cjpVar2;
        jvb jvbVar3 = this.f5332b;
        cjp cjpVar3 = new cjp();
        jvbVar3.m13537d(cjpVar3);
        this.f5335e = cjpVar3;
    }

    @Override // p000.fbg
    /* JADX INFO: renamed from: bC */
    public final void mo3521bC() {
        synchronized (this.f5331a) {
            this.f5334d.close();
        }
    }

    @Override // p000.fbj
    /* JADX INFO: renamed from: bE */
    public final void mo3522bE() {
        synchronized (this.f5331a) {
            this.f5332b.close();
        }
    }

    @Override // p000.fbl
    /* JADX INFO: renamed from: bF */
    public final void mo3523bF() {
        synchronized (this.f5331a) {
            if (m3526f()) {
                jvb jvbVarM3789a = this.f5338h.m3789a(this.f5333c);
                this.f5332b = jvbVarM3789a;
                cjp cjpVar = new cjp();
                jvbVarM3789a.m13537d(cjpVar);
                this.f5335e = cjpVar;
            }
        }
    }

    @Override // p000.fbn
    /* JADX INFO: renamed from: bG */
    public final void mo3524bG() {
        synchronized (this.f5331a) {
            if (m3527g()) {
                jvb jvbVarM3791c = this.f5338h.m3791c(this.f5334d);
                this.f5333c = jvbVarM3791c;
                cjp cjpVar = new cjp();
                jvbVarM3791c.m13537d(cjpVar);
                this.f5336f = cjpVar;
                jvb jvbVarM3789a = this.f5338h.m3789a(this.f5333c);
                this.f5332b = jvbVarM3789a;
                cjp cjpVar2 = new cjp();
                jvbVarM3789a.m13537d(cjpVar2);
                this.f5335e = cjpVar2;
            }
        }
    }

    @Override // p000.fbo
    /* JADX INFO: renamed from: e */
    public final void mo3525e() {
        synchronized (this.f5331a) {
            this.f5333c.close();
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m3526f() {
        boolean zM3826a;
        synchronized (this.f5331a) {
            zM3826a = this.f5335e.m3826a();
        }
        return zM3826a;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m3527g() {
        boolean zM3826a;
        synchronized (this.f5331a) {
            zM3826a = this.f5336f.m3826a();
        }
        return zM3826a;
    }

    /* JADX INFO: renamed from: h */
    public final jvb m3528h() {
        jvb jvbVar;
        synchronized (this.f5331a) {
            jvbVar = this.f5332b;
        }
        return jvbVar;
    }

    /* JADX INFO: renamed from: i */
    public final jvb m3529i() {
        jvb jvbVar;
        synchronized (this.f5331a) {
            jvbVar = this.f5334d;
        }
        return jvbVar;
    }

    /* JADX INFO: renamed from: j */
    public final jvb m3530j() {
        jvb jvbVar;
        synchronized (this.f5331a) {
            jvbVar = this.f5333c;
        }
        return jvbVar;
    }
}
