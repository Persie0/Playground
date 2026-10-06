package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bes implements Runnable {

    /* JADX INFO: renamed from: a */
    final bev f3059a;

    /* JADX INFO: renamed from: b */
    final nps f3060b;

    public bes(bev bevVar, nps npsVar) {
        this.f3059a = bevVar;
        this.f3060b = npsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f3059a.f3068d != this) {
            return;
        }
        if (bev.f3065b.mo2269d(this.f3059a, this, bev.m2272a(this.f3060b))) {
            bev.m2273b(this.f3059a);
        }
    }
}
