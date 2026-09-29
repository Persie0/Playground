package p000;

/* JADX INFO: loaded from: classes.dex */
public final class r89 extends AbstractC3572sf {

    /* JADX INFO: renamed from: b */
    public Object f58893b;

    /* JADX INFO: renamed from: c */
    public Object f58894c;

    /* JADX INFO: renamed from: d */
    public o66 f58895d;

    /* JADX INFO: renamed from: e */
    public o66 f58896e;

    /* JADX INFO: renamed from: f */
    public yv8 f58897f;

    /* JADX INFO: renamed from: g */
    public final kv4 f58898g;

    /* JADX INFO: renamed from: h */
    public final sd3 f58899h;

    public r89() {
        super(7);
        this.f58898g = new kv4(this, 23);
        C3186kj c3186kj = new C3186kj(this, 19);
        nc9.m17353e(nc9.f52600a);
        synchronized (nc9.f52602c) {
            nc9.f52607h = u91.m22604V0(nc9.f52607h, c3186kj);
        }
        this.f58899h = new sd3(c3186kj);
    }

    @Override // p000.AbstractC3572sf
    /* JADX INFO: renamed from: j */
    public final void mo11541j(yv8 yv8Var) {
        this.f58894c = null;
        this.f58896e = null;
    }

    @Override // p000.AbstractC3572sf
    /* JADX INFO: renamed from: k */
    public final void mo11542k() {
        synchronized (this.f60774a) {
            try {
                this.f58893b = this.f58894c;
                if (this.f58896e == null) {
                    this.f58895d = null;
                } else {
                    if (this.f58895d == null) {
                        o66 o66Var = pm8.f56484a;
                        this.f58895d = new o66();
                    }
                    o66 o66Var2 = this.f58895d;
                    this.f58895d = this.f58896e;
                    this.f58896e = o66Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.AbstractC3572sf
    /* JADX INFO: renamed from: n */
    public final void mo11543n() {
        this.f58899h.mo19438a();
        this.f58894c = null;
        this.f58896e = null;
        synchronized (this.f60774a) {
            this.f58897f = null;
            this.f58893b = null;
            this.f58895d = null;
        }
    }

    @Override // p000.AbstractC3572sf
    /* JADX INFO: renamed from: w */
    public final vi3 mo11544w(yv8 yv8Var) {
        yv8 yv8Var2 = this.f58897f;
        if (yv8Var2 != null && !yv8Var2.equals(yv8Var)) {
            hi7.m13279b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
        }
        this.f58897f = yv8Var;
        return this.f58898g;
    }

    @Override // p000.AbstractC3572sf
    /* JADX INFO: renamed from: y */
    public final void mo11545y(cu0 cu0Var) {
        this.f58897f = null;
        this.f58894c = null;
        this.f58896e = null;
        mo11542k();
    }
}
