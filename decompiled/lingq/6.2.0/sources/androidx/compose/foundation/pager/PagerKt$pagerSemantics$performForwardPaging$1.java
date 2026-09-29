package androidx.compose.foundation.pager;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.ss5;
import p000.u27;
import p000.un1;
import p000.v27;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.pager.PagerKt$pagerSemantics$performForwardPaging$1", m4291f = "Pager.kt", m4292l = {566}, m4293m = "invokeSuspend", m4294v = 1)
final class PagerKt$pagerSemantics$performForwardPaging$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f2633a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0150d f2634b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerKt$pagerSemantics$performForwardPaging$1(AbstractC0150d abstractC0150d, Continuation continuation) {
        super(2, continuation);
        this.f2634b = abstractC0150d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PagerKt$pagerSemantics$performForwardPaging$1(this.f2634b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((PagerKt$pagerSemantics$performForwardPaging$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM1032f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f2633a;
        xfa xfaVar = xfa.f68157a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        this.f2633a = 1;
        u27 u27Var = v27.f64740a;
        AbstractC0150d abstractC0150d = this.f2634b;
        if (abstractC0150d.m1036k() + 1 >= abstractC0150d.mo1039n() || (objM1032f = abstractC0150d.m1032f(abstractC0150d.m1036k() + 1, ss5.m21698Y(0.0f, 0.0f, null, 7), this)) != coroutineSingletons) {
            objM1032f = xfaVar;
        }
        return objM1032f == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
