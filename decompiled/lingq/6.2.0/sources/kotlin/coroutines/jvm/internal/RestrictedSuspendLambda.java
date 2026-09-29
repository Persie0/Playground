package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.Continuation;
import p000.ij3;
import p000.y38;
import p000.z38;

/* JADX INFO: loaded from: classes.dex */
public abstract class RestrictedSuspendLambda extends RestrictedContinuationImpl implements ij3 {

    /* JADX INFO: renamed from: a */
    public final int f47692a;

    public RestrictedSuspendLambda(int i, Continuation continuation) {
        super(continuation);
        this.f47692a = i;
    }

    @Override // p000.ij3
    public final int getArity() {
        return this.f47692a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        y38.f69246a.getClass();
        return z38.m25425a(this);
    }
}
