package androidx.compose.runtime;

/* JADX INFO: loaded from: classes.dex */
public final class ComposeRuntimeError extends IllegalStateException {

    /* JADX INFO: renamed from: a */
    public final String f3664a;

    public ComposeRuntimeError(String str) {
        this.f3664a = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f3664a;
    }
}
