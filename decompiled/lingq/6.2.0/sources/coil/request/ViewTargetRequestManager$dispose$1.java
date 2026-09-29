package coil.request;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.AbstractC3572sf;
import p000.c32;
import p000.mva;
import p000.t04;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "coil.request.ViewTargetRequestManager$dispose$1", m4291f = "ViewTargetRequestManager.kt", m4292l = {}, m4293m = "invokeSuspend")
final class ViewTargetRequestManager$dispose$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ mva f10566a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewTargetRequestManager$dispose$1(mva mvaVar, Continuation continuation) {
        super(2, continuation);
        this.f10566a = mvaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ViewTargetRequestManager$dispose$1(this.f10566a, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ViewTargetRequestManager$dispose$1 viewTargetRequestManager$dispose$1 = (ViewTargetRequestManager$dispose$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        viewTargetRequestManager$dispose$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        mva mvaVar = this.f10566a;
        C0864a c0864a = mvaVar.f51899c;
        if (c0864a != null) {
            AbstractC3572sf abstractC3572sf = c0864a.f10570d;
            c0864a.f10571e.mo4537a(null);
            t04 t04Var = c0864a.f10569c;
            if (t04Var != null) {
                abstractC3572sf.mo21331x(t04Var);
            }
            abstractC3572sf.mo21331x(c0864a);
        }
        mvaVar.f51899c = null;
        return xfa.f68157a;
    }
}
