package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class knb extends kpt {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ knc f36582a;

    /* JADX INFO: renamed from: b */
    private boolean f36583b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public knb(knc kncVar, kpw kpwVar) {
        super(kpwVar);
        this.f36582a = kncVar;
        this.f36583b = false;
    }

    @Override // p000.kpt, p000.kba, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        synchronized (this.f36582a.f36584a) {
            if (this.f36583b) {
                z = false;
            } else {
                z = true;
                this.f36583b = true;
            }
        }
        if (z) {
            super.close();
            synchronized (this.f36582a.f36584a) {
                this.f36582a.f36585b--;
            }
        }
    }
}
