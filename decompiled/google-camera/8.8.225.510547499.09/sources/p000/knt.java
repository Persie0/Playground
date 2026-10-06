package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class knt implements kba {

    /* JADX INFO: renamed from: a */
    public final long f36647a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ knv f36648b;

    /* JADX INFO: renamed from: c */
    private volatile boolean f36649c = false;

    public knt(knv knvVar, long j) {
        this.f36648b = knvVar;
        this.f36647a = j;
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        if (this.f36649c) {
            return;
        }
        synchronized (this) {
            if (this.f36649c) {
                return;
            }
            this.f36649c = true;
            knv knvVar = this.f36648b;
            long j = this.f36647a;
            synchronized (knvVar.f36653a) {
                knvVar.f36656d -= j;
                knvVar.mo14607d();
            }
            knvVar.m14608e();
        }
    }
}
