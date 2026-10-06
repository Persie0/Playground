package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bse {

    /* JADX INFO: renamed from: a */
    private boolean f4294a;

    /* JADX INFO: renamed from: b */
    private boolean f4295b;

    /* JADX INFO: renamed from: c */
    private boolean f4296c;

    /* JADX INFO: renamed from: e */
    private final boolean m2978e() {
        return (this.f4296c || this.f4295b) && this.f4294a;
    }

    /* JADX INFO: renamed from: a */
    final synchronized void m2979a() {
        this.f4295b = false;
        this.f4294a = false;
        this.f4296c = false;
    }

    /* JADX INFO: renamed from: b */
    final synchronized boolean m2980b() {
        this.f4295b = true;
        return m2978e();
    }

    /* JADX INFO: renamed from: c */
    final synchronized boolean m2981c() {
        this.f4296c = true;
        return m2978e();
    }

    /* JADX INFO: renamed from: d */
    final synchronized boolean m2982d() {
        this.f4294a = true;
        return m2978e();
    }
}
