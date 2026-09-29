package kotlinx.coroutines.flow.internal;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class AbortFlowException extends CancellationException {

    /* JADX INFO: renamed from: a */
    public final transient Object f48068a;

    public AbortFlowException(Object obj) {
        super("Flow was aborted, no more elements needed");
        this.f48068a = obj;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
