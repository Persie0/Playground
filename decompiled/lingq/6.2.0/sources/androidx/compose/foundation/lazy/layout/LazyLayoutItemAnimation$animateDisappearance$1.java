package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.C0059a;
import androidx.compose.p002ui.graphics.layer.C0312a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.l43;
import p000.rt4;
import p000.un1;
import p000.xc9;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateDisappearance$1", m4291f = "LazyLayoutItemAnimation.kt", m4292l = {203}, m4293m = "invokeSuspend", m4294v = 1)
final class LazyLayoutItemAnimation$animateDisappearance$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f2501a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0134c f2502b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ l43 f2503c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0312a f2504d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutItemAnimation$animateDisappearance$1(C0134c c0134c, l43 l43Var, C0312a c0312a, Continuation continuation) {
        super(2, continuation);
        this.f2502b = c0134c;
        this.f2503c = l43Var;
        this.f2504d = c0312a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LazyLayoutItemAnimation$animateDisappearance$1(this.f2502b, this.f2503c, this.f2504d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LazyLayoutItemAnimation$animateDisappearance$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f2501a;
        int i2 = 1;
        C0134c c0134c = this.f2502b;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                C0059a c0059a = c0134c.f2552q;
                Float f = new Float(0.0f);
                l43 l43Var = this.f2503c;
                rt4 rt4Var = new rt4(this.f2504d, c0134c, i2);
                this.f2501a = 1;
                if (C0059a.m744c(c0059a, f, l43Var, rt4Var, this, 4) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            ((xc9) c0134c.f2546k).setValue(Boolean.TRUE);
            c0134c.m1004f(false);
            return xfa.f68157a;
        } catch (Throwable th) {
            c0134c.m1004f(false);
            throw th;
        }
    }
}
