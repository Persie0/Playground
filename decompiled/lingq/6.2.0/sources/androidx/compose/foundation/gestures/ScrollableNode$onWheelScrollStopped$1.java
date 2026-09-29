package androidx.compose.foundation.gestures;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.ScrollableNode$onWheelScrollStopped$1", m4291f = "Scrollable.kt", m4292l = {395}, m4293m = "invokeSuspend", m4294v = 1)
final class ScrollableNode$onWheelScrollStopped$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f2078a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0115u f2079b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f2080c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableNode$onWheelScrollStopped$1(C0115u c0115u, long j, Continuation continuation) {
        super(2, continuation);
        this.f2079b = c0115u;
        this.f2080c = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScrollableNode$onWheelScrollStopped$1(this.f2079b, this.f2080c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ScrollableNode$onWheelScrollStopped$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f2078a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C0116v c0116v = this.f2079b.f2352i0;
            this.f2078a = 1;
            if (c0116v.m930b(this.f2080c, true, this) == coroutineSingletons) {
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
