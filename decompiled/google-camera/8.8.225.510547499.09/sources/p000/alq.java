package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class alq implements Runnable {

    /* JADX INFO: renamed from: a */
    final akq f658a;

    /* JADX INFO: renamed from: b */
    private boolean f659b = false;

    /* JADX INFO: renamed from: c */
    private final aks f660c;

    public alq(aks aksVar, akq akqVar) {
        this.f660c = aksVar;
        this.f658a = akqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f659b) {
            return;
        }
        this.f660c.m880b(this.f658a);
        this.f659b = true;
    }
}
