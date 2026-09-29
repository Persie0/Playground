package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import p000.C3386nv;
import p000.kn1;

/* JADX INFO: loaded from: classes.dex */
public abstract class RestrictedContinuationImpl extends BaseContinuationImpl {
    public RestrictedContinuationImpl(Continuation continuation) {
        super(continuation);
        if (continuation == null || continuation.getContext() == EmptyCoroutineContext.f47685a) {
            return;
        }
        C3386nv.m17626m("Coroutines with restricted suspension must have EmptyCoroutineContext");
        throw null;
    }

    @Override // kotlin.coroutines.Continuation
    public final kn1 getContext() {
        return EmptyCoroutineContext.f47685a;
    }
}
