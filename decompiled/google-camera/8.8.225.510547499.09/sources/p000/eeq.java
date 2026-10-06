package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class eeq implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ eer f13724a;

    /* JADX INFO: renamed from: b */
    private final boolean f13725b;

    public eeq(eer eerVar, boolean z) {
        this.f13724a = eerVar;
        this.f13725b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f13724a) {
            this.f13724a.f13726a = this.f13725b;
        }
    }
}
