package p000;

/* JADX INFO: renamed from: xl */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class C1123xl extends Throwable {
    public C1123xl() {
        super("Failure occurred while trying to finish a future.");
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
