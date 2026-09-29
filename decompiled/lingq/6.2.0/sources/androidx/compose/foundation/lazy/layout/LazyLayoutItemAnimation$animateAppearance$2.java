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
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$2", m4291f = "LazyLayoutItemAnimation.kt", m4292l = {182, 184}, m4293m = "invokeSuspend", m4294v = 1)
final class LazyLayoutItemAnimation$animateAppearance$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f2496a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f2497b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0134c f2498c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ l43 f2499d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0312a f2500e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutItemAnimation$animateAppearance$2(boolean z, C0134c c0134c, l43 l43Var, C0312a c0312a, Continuation continuation) {
        super(2, continuation);
        this.f2497b = z;
        this.f2498c = c0134c;
        this.f2499d = l43Var;
        this.f2500e = c0312a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LazyLayoutItemAnimation$animateAppearance$2(this.f2497b, this.f2498c, this.f2499d, this.f2500e, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LazyLayoutItemAnimation$animateAppearance$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        if (r13 == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f2496a;
        int i2 = 0;
        C0134c c0134c = this.f2498c;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                if (this.f2497b) {
                    C0059a c0059a = c0134c.f2552q;
                    Float f = new Float(0.0f);
                    this.f2496a = 1;
                    if (c0059a.m747f(f, this) == coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
            } else {
                if (i != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            c0134c.m1003e(false);
            return xfa.f68157a;
            C0059a c0059a2 = c0134c.f2552q;
            Float f2 = new Float(1.0f);
            l43 l43Var = this.f2499d;
            rt4 rt4Var = new rt4(this.f2500e, c0134c, i2);
            this.f2496a = 2;
            obj = C0059a.m744c(c0059a2, f2, l43Var, rt4Var, this, 4);
        } catch (Throwable th) {
            c0134c.m1003e(false);
            throw th;
        }
    }
}
