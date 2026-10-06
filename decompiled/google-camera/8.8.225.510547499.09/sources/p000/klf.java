package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class klf extends kpt {

    /* JADX INFO: renamed from: a */
    private final kba f36471a;

    public klf(kpw kpwVar, kba kbaVar) {
        super(kpwVar);
        this.f36471a = kbaVar;
    }

    @Override // p000.kpt, p000.kba, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f36471a.close();
    }
}
