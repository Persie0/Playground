package p000;

/* JADX INFO: loaded from: classes.dex */
public final class wr9 {

    /* JADX INFO: renamed from: a */
    public final tld f67208a = new tld();

    public wr9(gw9 gw9Var) {
        nr9 nr9Var = new nr9(this);
        gw9Var.getClass();
        ((tld) gw9Var.f41432b).mo5963e(xr9.f68587a, new gw9(gw9Var, nr9Var));
    }

    /* JADX INFO: renamed from: a */
    public final void m24137a(Exception exc) {
        this.f67208a.m22203r(exc);
    }

    /* JADX INFO: renamed from: b */
    public final void m24138b(Object obj) {
        this.f67208a.m22201p(obj);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m24139c(Exception exc) {
        tld tldVar = this.f67208a;
        tldVar.getClass();
        lda.m16131q(exc, "Exception must not be null");
        synchronized (tldVar.f62490a) {
            try {
                if (tldVar.f62492c) {
                    return false;
                }
                tldVar.f62492c = true;
                tldVar.f62495f = exc;
                tldVar.f62491b.m24269f(tldVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m24140d(Object obj) {
        this.f67208a.m22202q(obj);
    }

    public wr9() {
    }
}
