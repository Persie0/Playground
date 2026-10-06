package p000;

/* JADX INFO: renamed from: vr */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1075vr {

    /* JADX INFO: renamed from: a */
    public final omx f47863a;

    /* JADX INFO: renamed from: b */
    public final Object f47864b;

    /* JADX INFO: renamed from: c */
    public int f47865c;

    /* JADX INFO: renamed from: d */
    public ory f47866d;

    /* JADX INFO: renamed from: e */
    public boolean f47867e;

    /* JADX INFO: renamed from: f */
    private final oqs f47868f;

    public C1075vr(oqs oqsVar, omx omxVar) {
        this.f47868f = oqsVar;
        this.f47863a = omxVar;
        Object obj = new Object();
        this.f47864b = obj;
        synchronized (obj) {
            m19508a();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m19508a() {
        this.f47866d = ooc.m18746l(this.f47868f, null, new C1074vq(this, null), 3);
    }

    /* JADX INFO: renamed from: b */
    public final void m19509b() {
        synchronized (this.f47864b) {
            if (this.f47867e) {
                return;
            }
            this.f47867e = true;
            ory oryVar = this.f47866d;
            if (oryVar != null) {
                oryVar.mo18977r(null);
            }
            this.f47866d = null;
            ooc.m18746l(this.f47868f, null, new C1073vp(this, null), 3);
        }
    }
}
