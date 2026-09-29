package androidx.compose.foundation.gestures;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.ho8;
import p000.wn8;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.ScrollingLogic$scroll$2", m4291f = "Scrollable.kt", m4292l = {936}, m4293m = "invokeSuspend", m4294v = 1)
final class ScrollingLogic$scroll$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f2104a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f2105b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0116v f2106c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zi3 f2107d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$scroll$2(zi3 zi3Var, C0116v c0116v, Continuation continuation) {
        super(2, continuation);
        this.f2106c = c0116v;
        this.f2107d = zi3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScrollingLogic$scroll$2 scrollingLogic$scroll$2 = new ScrollingLogic$scroll$2(this.f2107d, this.f2106c, continuation);
        scrollingLogic$scroll$2.f2105b = obj;
        return scrollingLogic$scroll$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ScrollingLogic$scroll$2) create((wn8) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f2104a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            wn8 wn8Var = (wn8) this.f2105b;
            C0116v c0116v = this.f2106c;
            c0116v.f2370k = wn8Var;
            ho8 ho8Var = c0116v.f2371l;
            this.f2104a = 1;
            if (this.f2107d.invoke(ho8Var, this) == coroutineSingletons) {
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
