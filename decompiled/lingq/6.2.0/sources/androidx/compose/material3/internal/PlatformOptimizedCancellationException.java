package androidx.compose.material3.internal;

import java.util.concurrent.CancellationException;
import p000.lwc;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PlatformOptimizedCancellationException extends CancellationException {
    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(lwc.f50233a);
        return this;
    }
}
