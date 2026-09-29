package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.AbstractC0063e;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C0817bn;
import p000.C3386nv;
import p000.bg9;
import p000.c32;
import p000.ss5;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutScrollDeltaBetweenPasses$updateScrollDeltaForApproach$2$1 */
/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.lazy.layout.LazyLayoutScrollDeltaBetweenPasses$updateScrollDeltaForApproach$2$1", m4291f = "LazyLayoutScrollDeltaBetweenPasses.kt", m4292l = {79}, m4293m = "invokeSuspend", m4294v = 1)
final class C0131x63fe01d4 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f2518a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0136e f2519b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0131x63fe01d4(C0136e c0136e, Continuation continuation) {
        super(2, continuation);
        this.f2519b = c0136e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0131x63fe01d4(this.f2519b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((C0131x63fe01d4) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f2518a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C0817bn c0817bn = this.f2519b.f2565b;
            Float f = new Float(0.0f);
            bg9 bg9VarM21698Y = ss5.m21698Y(0.0f, 400.0f, new Float(0.5f), 1);
            this.f2518a = 1;
            if (AbstractC0063e.m759f(c0817bn, f, bg9VarM21698Y, true, null, this, 8) == coroutineSingletons) {
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
