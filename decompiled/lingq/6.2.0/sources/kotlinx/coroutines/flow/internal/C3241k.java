package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p000.e83;
import p000.kn1;
import p000.r46;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C3241k implements e83 {

    /* JADX INFO: renamed from: a */
    public final kn1 f48147a;

    /* JADX INFO: renamed from: b */
    public final Object f48148b;

    /* JADX INFO: renamed from: c */
    public final zi3 f48149c;

    public C3241k(e83 e83Var, kn1 kn1Var) {
        this.f48147a = kn1Var;
        this.f48148b = r46.m20370M(kn1Var);
        this.f48149c = new UndispatchedContextCollector$emitRef$1(e83Var, null);
    }

    @Override // p000.e83
    public final Object emit(Object obj, Continuation continuation) {
        Object objM15566b = AbstractC3232b.m15566b(this.f48147a, obj, this.f48148b, this.f48149c, continuation);
        return objM15566b == CoroutineSingletons.COROUTINE_SUSPENDED ? objM15566b : xfa.f68157a;
    }
}
