package androidx.compose.foundation.internal;

import java.util.concurrent.CancellationException;
import p000.AbstractC3489q9;

/* JADX INFO: loaded from: classes.dex */
public abstract class PlatformOptimizedCancellationException extends CancellationException {
    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(AbstractC3489q9.f57424s);
        return this;
    }
}
