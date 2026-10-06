package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class jwb implements kba, jwd {

    /* JADX INFO: renamed from: a */
    private final kba f34935a;

    /* JADX INFO: renamed from: b */
    private final String f34936b;

    public jwb(kba kbaVar, String str) {
        this.f34935a = kbaVar;
        this.f34936b = str;
    }

    @Override // p000.jwd
    /* JADX INFO: renamed from: b */
    public final String mo9070b() {
        return this.f34936b;
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        this.f34935a.close();
    }
}
