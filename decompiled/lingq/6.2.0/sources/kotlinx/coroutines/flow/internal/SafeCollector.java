package kotlinx.coroutines.flow.internal;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.AbstractC3208a;
import p000.C3186kj;
import p000.aj3;
import p000.cc1;
import p000.e83;
import p000.fa4;
import p000.kn1;
import p000.ln1;
import p000.vn1;
import p000.wj2;
import p000.wk9;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
public final class SafeCollector<T> extends ContinuationImpl implements e83 {

    /* JADX INFO: renamed from: a */
    public final e83 f48124a;

    /* JADX INFO: renamed from: b */
    public final kn1 f48125b;

    /* JADX INFO: renamed from: c */
    public final int f48126c;

    /* JADX INFO: renamed from: d */
    public kn1 f48127d;

    /* JADX INFO: renamed from: e */
    public Continuation f48128e;

    public SafeCollector(e83 e83Var, kn1 kn1Var) {
        super(EmptyCoroutineContext.f47685a, cc1.f9875c);
        this.f48124a = e83Var;
        this.f48125b = kn1Var;
        this.f48126c = ((Number) kn1Var.fold(0, new ln1(20))).intValue();
    }

    @Override // p000.e83
    public final Object emit(Object obj, Continuation continuation) {
        try {
            Object objM15564g = m15564g(continuation, obj);
            return objM15564g == CoroutineSingletons.COROUTINE_SUSPENDED ? objM15564g : xfa.f68157a;
        } catch (Throwable th) {
            this.f48127d = new wj2(continuation.getContext(), th);
            throw th;
        }
    }

    /* JADX INFO: renamed from: g */
    public final Object m15564g(Continuation continuation, Object obj) {
        kn1 context = continuation.getContext();
        AbstractC3208a.m15439f(context);
        kn1 kn1Var = this.f48127d;
        if (kn1Var != context) {
            if (kn1Var instanceof wj2) {
                throw new IllegalStateException(wk9.m24029L("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((wj2) kn1Var).f66925b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.fold(0, new C3186kj(this, 18))).intValue() != this.f48126c) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f48125b + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f48127d = context;
        }
        this.f48128e = continuation;
        aj3 aj3Var = AbstractC3240j.f48146a;
        e83 e83Var = this.f48124a;
        e83Var.getClass();
        Object objInvoke = aj3Var.invoke(e83Var, obj, this);
        if (!fa4.m11650l(objInvoke, CoroutineSingletons.COROUTINE_SUSPENDED)) {
            this.f48128e = null;
        }
        return objInvoke;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, p000.vn1
    public final vn1 getCallerFrame() {
        Continuation continuation = this.f48128e;
        if (continuation instanceof vn1) {
            return (vn1) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.Continuation
    public final kn1 getContext() {
        kn1 kn1Var = this.f48127d;
        return kn1Var == null ? EmptyCoroutineContext.f47685a : kn1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable thM15355a = Result.m15355a(obj);
        if (thM15355a != null) {
            this.f48127d = new wj2(getContext(), thM15355a);
        }
        Continuation continuation = this.f48128e;
        if (continuation != null) {
            continuation.resumeWith(obj);
        }
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }
}
