package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.Continuation;
import p000.ij3;
import p000.y38;
import p000.z38;

/* JADX INFO: loaded from: classes.dex */
public abstract class SuspendLambda extends ContinuationImpl implements ij3 {
    private final int arity;

    public SuspendLambda(int i, Continuation continuation) {
        super(continuation);
        this.arity = i;
    }

    @Override // p000.ij3
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        y38.f69246a.getClass();
        return z38.m25425a(this);
    }
}
