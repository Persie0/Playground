package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class oqz extends RuntimeException {

    /* JADX INFO: renamed from: a */
    private final oly f46438a;

    public oqz(oly olyVar) {
        this.f46438a = olyVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f46438a.toString();
    }
}
