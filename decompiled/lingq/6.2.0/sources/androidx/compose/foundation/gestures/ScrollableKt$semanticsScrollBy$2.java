package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AbstractC0063e;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import p000.C3386nv;
import p000.c32;
import p000.di0;
import p000.ho8;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$2", m4291f = "Scrollable.kt", m4292l = {1124}, m4293m = "invokeSuspend", m4294v = 1)
final class ScrollableKt$semanticsScrollBy$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f2054a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f2055b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0116v f2056c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f2057d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Ref$FloatRef f2058e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableKt$semanticsScrollBy$2(C0116v c0116v, long j, Ref$FloatRef ref$FloatRef, Continuation continuation) {
        super(2, continuation);
        this.f2056c = c0116v;
        this.f2057d = j;
        this.f2058e = ref$FloatRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScrollableKt$semanticsScrollBy$2 scrollableKt$semanticsScrollBy$2 = new ScrollableKt$semanticsScrollBy$2(this.f2056c, this.f2057d, this.f2058e, continuation);
        scrollableKt$semanticsScrollBy$2.f2055b = obj;
        return scrollableKt$semanticsScrollBy$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ScrollableKt$semanticsScrollBy$2) create((ho8) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f2054a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            ho8 ho8Var = (ho8) this.f2055b;
            long j = this.f2057d;
            C0116v c0116v = this.f2056c;
            float fM935g = c0116v.m935g(j);
            di0 di0Var = new di0(this.f2058e, c0116v, ho8Var, 9);
            this.f2054a = 1;
            if (AbstractC0063e.m756c(fM935g, null, di0Var, this, 12) == coroutineSingletons) {
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
