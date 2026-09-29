package kotlinx.coroutines.internal;

import p000.kn1;

/* JADX INFO: loaded from: classes2.dex */
public final class DiagnosticCoroutineContextException extends RuntimeException {

    /* JADX INFO: renamed from: a */
    public final transient kn1 f48157a;

    public DiagnosticCoroutineContextException(kn1 kn1Var) {
        this.f48157a = kn1Var;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return String.valueOf(this.f48157a);
    }
}
