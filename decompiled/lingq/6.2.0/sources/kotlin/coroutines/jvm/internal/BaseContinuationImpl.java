package kotlin.coroutines.jvm.internal;

import java.io.Serializable;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p000.sad;
import p000.vn1;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseContinuationImpl implements Continuation<Object>, vn1, Serializable {
    private final Continuation<Object> completion;

    public BaseContinuationImpl(Continuation continuation) {
        this.completion = continuation;
    }

    public Continuation<xfa> create(Continuation<?> continuation) {
        continuation.getClass();
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // p000.vn1
    public vn1 getCallerFrame() {
        Continuation<Object> continuation = this.completion;
        if (continuation instanceof vn1) {
            return (vn1) continuation;
        }
        return null;
    }

    public final Continuation<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        return sad.m21190c(this);
    }

    public abstract Object invokeSuspend(Object obj);

    public void releaseIntercepted() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        ?? r2 = this;
        while (true) {
            BaseContinuationImpl baseContinuationImpl = (BaseContinuationImpl) r2;
            Continuation<Object> continuation = baseContinuationImpl.completion;
            continuation.getClass();
            try {
                obj = baseContinuationImpl.invokeSuspend(obj);
                if (obj == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return;
                }
            } catch (Throwable th) {
                obj = new Result.Failure(th);
            }
            baseContinuationImpl.releaseIntercepted();
            if (!(continuation instanceof BaseContinuationImpl)) {
                continuation.resumeWith(obj);
                return;
            }
            r2 = continuation;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public Continuation<xfa> create(Object obj, Continuation<?> continuation) {
        continuation.getClass();
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
