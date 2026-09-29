package androidx.compose.runtime.internal;

import java.util.concurrent.CancellationException;
import p000.l70;

/* JADX INFO: loaded from: classes.dex */
public abstract class PlatformOptimizedCancellationException extends CancellationException {
    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(l70.f49235f);
        return this;
    }
}
