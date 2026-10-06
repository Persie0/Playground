package p000;

/* JADX INFO: renamed from: bg */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class C0061bg {

    /* JADX INFO: renamed from: a */
    public final C0133dl f3152a;

    /* JADX INFO: renamed from: b */
    public final exz f3153b;

    public C0061bg(C0133dl c0133dl, exz exzVar, byte[] bArr) {
        this.f3152a = c0133dl;
        this.f3153b = exzVar;
    }

    /* JADX INFO: renamed from: b */
    final void m2373b() {
        C0133dl c0133dl = this.f3152a;
        if (c0133dl.f11916b.remove(this.f3153b) && c0133dl.f11916b.isEmpty()) {
            c0133dl.mo6274a();
        }
    }

    /* JADX INFO: renamed from: c */
    final boolean m2374c() {
        int iM6523t = C0137dp.m6523t(this.f3152a.f11915a.f4586N);
        int i = this.f3152a.f11919e;
        if (iM6523t != i) {
            return (iM6523t == 2 || i == 2) ? false : true;
        }
        return true;
    }
}
