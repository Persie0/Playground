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
@c32(m4290c = "androidx.compose.foundation.style.StyleAnimations$Entry$animateOut$1", m4291f = "StyleAnimations.kt", m4292l = {72}, m4293m = "invokeSuspend", m4294v = 1)
final class StyleAnimations$Entry$animateOut$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f2732a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0157b f2733b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0158c f2734c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StyleAnimations$Entry$animateOut$1(C0157b c0157b, C0158c c0158c, Continuation continuation) {
        super(2, continuation);
        this.f2733b = c0157b;
        this.f2734c = c0158c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StyleAnimations$Entry$animateOut$1(this.f2733b, this.f2734c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((StyleAnimations$Entry$animateOut$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C0157b c0157b = this.f2733b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f2732a;
        C0158c c0158c = this.f2734c;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                C0059a c0059a = c0157b.f2744c;
                Float f = new Float(0.0f);
                InterfaceC0025an interfaceC0025an = c0157b.f2743b;
                this.f2732a = 1;
                obj = C0059a.m744c(c0059a, f, interfaceC0025an, null, this, 12);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            C0158c.m1052a(c0158c);
            return xfa.f68157a;
        } catch (Throwable th) {
            C0158c.m1052a(c0158c);
            throw th;
        }
    }
}
