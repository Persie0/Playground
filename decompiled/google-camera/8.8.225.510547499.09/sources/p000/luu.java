package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class luu {

    /* JADX INFO: renamed from: a */
    public mrm f39292a;

    /* JADX INFO: renamed from: b */
    public mrm f39293b;

    /* JADX INFO: renamed from: c */
    public mrm f39294c;

    /* JADX INFO: renamed from: d */
    private mwn f39295d;

    /* JADX INFO: renamed from: e */
    private mws f39296e;

    /* JADX INFO: renamed from: f */
    private mwn f39297f;

    /* JADX INFO: renamed from: g */
    private mws f39298g;

    /* JADX INFO: renamed from: h */
    private mrm f39299h;

    /* JADX INFO: renamed from: i */
    private mrm f39300i;

    /* JADX INFO: renamed from: j */
    private mws f39301j;

    public luu() {
    }

    public luu(byte[] bArr) {
        mqu mquVar = mqu.f41450a;
        this.f39292a = mquVar;
        this.f39299h = mquVar;
        this.f39300i = mquVar;
        this.f39293b = mquVar;
        this.f39294c = mquVar;
    }

    /* JADX INFO: renamed from: a */
    public final luv m16030a() {
        mwn mwnVar = this.f39295d;
        if (mwnVar != null) {
            this.f39296e = mwnVar.m17081f();
        } else if (this.f39296e == null) {
            int i = mws.f41739d;
            this.f39296e = mzr.f41857a;
        }
        mwn mwnVar2 = this.f39297f;
        if (mwnVar2 != null) {
            this.f39298g = mwnVar2.m17081f();
        } else if (this.f39298g == null) {
            int i2 = mws.f41739d;
            this.f39298g = mzr.f41857a;
        }
        if (this.f39301j == null) {
            int i3 = mws.f41739d;
            this.f39301j = mzr.f41857a;
        }
        return new luv(this.f39292a, this.f39296e, this.f39298g, this.f39299h, this.f39300i, this.f39293b, this.f39301j, this.f39294c);
    }

    /* JADX INFO: renamed from: b */
    public final mwn m16031b() {
        if (this.f39295d == null) {
            if (this.f39296e == null) {
                this.f39295d = mws.m17090e();
            } else {
                mwn mwnVarM17090e = mws.m17090e();
                this.f39295d = mwnVarM17090e;
                mwnVarM17090e.m17083h(this.f39296e);
                this.f39296e = null;
            }
        }
        return this.f39295d;
    }

    /* JADX INFO: renamed from: c */
    public final mwn m16032c() {
        if (this.f39297f == null) {
            if (this.f39298g == null) {
                this.f39297f = mws.m17090e();
            } else {
                mwn mwnVarM17090e = mws.m17090e();
                this.f39297f = mwnVarM17090e;
                mwnVarM17090e.m17083h(this.f39298g);
                this.f39298g = null;
            }
        }
        return this.f39297f;
    }

    /* JADX INFO: renamed from: d */
    public final void m16033d(String str) {
        this.f39299h = mrm.m16829i(str);
    }

    /* JADX INFO: renamed from: e */
    public final void m16034e(String str) {
        this.f39300i = mrm.m16829i(str);
    }
}
