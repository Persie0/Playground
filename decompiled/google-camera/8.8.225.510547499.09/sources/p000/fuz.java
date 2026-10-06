package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fuz {

    /* JADX INFO: renamed from: a */
    private boolean f23612a = true;

    /* JADX INFO: renamed from: b */
    private boolean f23613b = false;

    /* JADX INFO: renamed from: a */
    public final synchronized void m8819a(boolean z) {
        this.f23613b = z;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m8820b(boolean z) {
        this.f23612a = z;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized boolean m8821c() {
        return this.f23612a && this.f23613b;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized boolean m8822d() {
        return this.f23612a;
    }
}
