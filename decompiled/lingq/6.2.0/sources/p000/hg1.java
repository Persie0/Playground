package p000;

/* JADX INFO: loaded from: classes.dex */
public final class hg1 {

    /* JADX INFO: renamed from: a */
    public final mp9 f42317a;

    /* JADX INFO: renamed from: b */
    public boolean f42318b;

    public hg1() {
        this(mp9.f51705a);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m13224a() {
        boolean z = false;
        while (!this.f42318b) {
            try {
                this.f42317a.getClass();
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized boolean m13225b() {
        if (this.f42318b) {
            return false;
        }
        this.f42318b = true;
        notifyAll();
        return true;
    }

    public hg1(mp9 mp9Var) {
        this.f42317a = mp9Var;
    }
}
