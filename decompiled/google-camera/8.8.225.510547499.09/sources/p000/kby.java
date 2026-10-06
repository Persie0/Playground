package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kby implements AutoCloseable {

    /* JADX INFO: renamed from: a */
    private final kbz f35548a;

    public kby(kbz kbzVar, String str) {
        this.f35548a = kbzVar;
        kbzVar.mo13961e(str);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f35548a.mo13962f();
    }
}
