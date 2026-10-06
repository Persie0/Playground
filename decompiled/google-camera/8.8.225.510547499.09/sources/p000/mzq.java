package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mzq extends mwh {

    /* JADX INFO: renamed from: a */
    static final mzq f41851a = new mzq();

    /* JADX INFO: renamed from: b */
    final transient Object[] f41852b;

    /* JADX INFO: renamed from: c */
    public final transient mzq f41853c;

    /* JADX INFO: renamed from: d */
    private final transient Object f41854d;

    /* JADX INFO: renamed from: e */
    private final transient int f41855e;

    /* JADX INFO: renamed from: f */
    private final transient int f41856f;

    private mzq() {
        this.f41854d = null;
        this.f41852b = new Object[0];
        this.f41855e = 0;
        this.f41856f = 0;
        this.f41853c = this;
    }

    private mzq(Object obj, Object[] objArr, int i, mzq mzqVar) {
        this.f41854d = obj;
        this.f41852b = objArr;
        this.f41855e = 1;
        this.f41856f = i;
        this.f41853c = mzqVar;
    }

    public mzq(Object[] objArr, int i) {
        this.f41852b = objArr;
        this.f41856f = i;
        this.f41855e = 0;
        int iM17131B = i >= 2 ? mxk.m17131B(i) : 0;
        this.f41854d = mzw.m17193k(objArr, i, iM17131B, 0);
        this.f41853c = new mzq(mzw.m17193k(objArr, i, iM17131B, 1), objArr, i, this);
    }

    @Override // p000.mwh
    /* JADX INFO: renamed from: a */
    public final mwh mo17064a() {
        return this.f41853c;
    }

    @Override // p000.mwx
    /* JADX INFO: renamed from: ct */
    public final mxk mo17113ct() {
        return new mzt(this, this.f41852b, this.f41855e, this.f41856f);
    }

    @Override // p000.mwx
    /* JADX INFO: renamed from: cu */
    public final mxk mo17114cu() {
        return new mzu(this, new mzv(this.f41852b, this.f41855e, this.f41856f));
    }

    @Override // p000.mwx
    /* JADX INFO: renamed from: cw */
    public final boolean mo17080cw() {
        return false;
    }

    @Override // p000.mwx, java.util.Map
    public final Object get(Object obj) {
        Object objM17194t = mzw.m17194t(this.f41854d, this.f41852b, this.f41856f, this.f41855e, obj);
        if (objM17194t == null) {
            return null;
        }
        return objM17194t;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f41856f;
    }
}
