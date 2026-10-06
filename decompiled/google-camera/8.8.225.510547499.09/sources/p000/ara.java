package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ara extends RuntimeException {

    /* JADX INFO: renamed from: a */
    public final Throwable f2168a;

    /* JADX INFO: renamed from: b */
    public final int f2169b;

    public ara(int i, Throwable th) {
        super(th);
        this.f2169b = i;
        this.f2168a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f2168a;
    }
}
