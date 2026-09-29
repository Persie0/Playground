package p479xa;

/* JADX INFO: renamed from: xa.e */
/* JADX INFO: loaded from: classes.dex */
public final class C10136e {

    /* JADX INFO: renamed from: a */
    public boolean f51371a;

    public C10136e() {
    }

    public C10136e(int i10) {
    }

    /* JADX INFO: renamed from: a */
    public final synchronized boolean m19062a() {
        try {
            if (this.f51371a) {
                return false;
            }
            this.f51371a = true;
            notifyAll();
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
