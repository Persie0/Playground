package androidx.compose.p002ui.input.pointer;

import java.util.concurrent.CancellationException;
import p000.eh0;

/* JADX INFO: loaded from: classes.dex */
public final class PointerEventTimeoutCancellationException extends CancellationException {
    public PointerEventTimeoutCancellationException(long j) {
        super("Timed out waiting for " + j + " ms");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(eh0.f37229I);
        return this;
    }
}
