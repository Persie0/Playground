package androidx.compose.animation.core.internal;

import java.util.concurrent.CancellationException;
import p000.AbstractC3352my;

/* JADX INFO: loaded from: classes.dex */
public abstract class PlatformOptimizedCancellationException extends CancellationException {
    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(AbstractC3352my.f52018e);
        return this;
    }
}
