package androidx.compose.material3.internal.ripple;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3229i;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.material3.internal.ripple.RippleNode$onAttach$1", m4291f = "Ripple.kt", m4292l = {196}, m4293m = "invokeSuspend", m4294v = 1)
final class RippleNode$onAttach$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f3509a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f3510b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC0248b f3511c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RippleNode$onAttach$1(AbstractC0248b abstractC0248b, Continuation continuation) {
        super(2, continuation);
        this.f3511c = abstractC0248b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RippleNode$onAttach$1 rippleNode$onAttach$1 = new RippleNode$onAttach$1(this.f3511c, continuation);
        rippleNode$onAttach$1.f3510b = obj;
        return rippleNode$onAttach$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((RippleNode$onAttach$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f3509a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            un1 un1Var = (un1) this.f3510b;
            AbstractC0248b abstractC0248b = this.f3511c;
            C3229i c3229i = abstractC0248b.f3523J.f64886a;
            C0247a c0247a = new C0247a(abstractC0248b, un1Var);
            this.f3509a = 1;
            c3229i.getClass();
            if (C3229i.m15548j(c3229i, c0247a, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
