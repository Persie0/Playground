package androidx.compose.foundation.style;

import androidx.compose.animation.core.C0059a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.InterfaceC0025an;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.style.StyleAnimations$Entry$animateIn$1", m4291f = "StyleAnimations.kt", m4292l = {63}, m4293m = "invokeSuspend", m4294v = 1)
final class StyleAnimations$Entry$animateIn$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f2730a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0157b f2731b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StyleAnimations$Entry$animateIn$1(C0157b c0157b, Continuation continuation) {
        super(2, continuation);
        this.f2731b = c0157b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StyleAnimations$Entry$animateIn$1(this.f2731b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((StyleAnimations$Entry$animateIn$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f2730a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C0157b c0157b = this.f2731b;
            C0059a c0059a = c0157b.f2744c;
            Float f = new Float(1.0f);
            InterfaceC0025an interfaceC0025an = c0157b.f2742a;
            this.f2730a = 1;
            if (C0059a.m744c(c0059a, f, interfaceC0025an, null, this, 12) == coroutineSingletons) {
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
