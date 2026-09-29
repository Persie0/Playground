package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.C0059a;
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
@c32(m4290c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$1", m4291f = "LazyLayoutItemAnimation.kt", m4292l = {170}, m4293m = "invokeSuspend", m4294v = 1)
final class LazyLayoutItemAnimation$animateAppearance$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f2494a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0134c f2495b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutItemAnimation$animateAppearance$1(C0134c c0134c, Continuation continuation) {
        super(2, continuation);
        this.f2495b = c0134c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LazyLayoutItemAnimation$animateAppearance$1(this.f2495b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LazyLayoutItemAnimation$animateAppearance$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f2494a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C0059a c0059a = this.f2495b.f2552q;
            Float f = new Float(1.0f);
            this.f2494a = 1;
            if (c0059a.m747f(f, this) == coroutineSingletons) {
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
