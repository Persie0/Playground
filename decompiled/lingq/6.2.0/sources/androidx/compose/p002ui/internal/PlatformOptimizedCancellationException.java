package androidx.compose.p002ui.internal;

import java.util.concurrent.CancellationException;
import p000.AbstractC3122is;

/* JADX INFO: loaded from: classes.dex */
public abstract class PlatformOptimizedCancellationException extends CancellationException {
    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(AbstractC3122is.f44470c);
        return this;
    }
}
