package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class kzm implements Runnable {

    /* JADX INFO: renamed from: a */
    private final nps f37772a;

    public kzm(nps npsVar) {
        this.f37772a = npsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            kxk.m14974T(this.f37772a);
        } catch (nqn e) {
            throw msm.m16866a(kzy.m15111a(e.getCause()));
        }
    }
}
