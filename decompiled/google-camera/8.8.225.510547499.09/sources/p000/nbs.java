package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class nbs extends Exception {
    public nbs(Throwable th, ncb ncbVar, StackTraceElement[] stackTraceElementArr) {
        super(ncbVar.toString(), th);
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
