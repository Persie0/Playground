package androidx.compose.foundation.gestures;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.dpa;
import p000.rk2;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.ScrollableNode$onDragStopped$1", m4291f = "Scrollable.kt", m4292l = {386}, m4293m = "invokeSuspend", m4294v = 1)
final class ScrollableNode$onDragStopped$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f2067a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ rk2 f2068b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0115u f2069c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableNode$onDragStopped$1(rk2 rk2Var, C0115u c0115u, Continuation continuation) {
        super(2, continuation);
        this.f2068b = rk2Var;
        this.f2069c = c0115u;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScrollableNode$onDragStopped$1(this.f2068b, this.f2069c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ScrollableNode$onDragStopped$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f2067a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            rk2 rk2Var = this.f2068b;
            float f = rk2Var.f59425b ? -1.0f : 1.0f;
            C0116v c0116v = this.f2069c.f2352i0;
            long jM10575f = dpa.m10575f(f, rk2Var.f59424a);
            this.f2067a = 1;
            if (c0116v.m930b(jM10575f, false, this) == coroutineSingletons) {
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
