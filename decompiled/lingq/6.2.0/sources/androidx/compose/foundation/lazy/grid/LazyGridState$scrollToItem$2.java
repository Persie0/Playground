package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.C0135d;
import androidx.compose.p002ui.node.C0357g;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.b72;
import p000.c32;
import p000.wn8;
import p000.ws4;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.lazy.grid.LazyGridState$scrollToItem$2", m4291f = "LazyGridState.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 1)
final class LazyGridState$scrollToItem$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0129b f2465a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f2466b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyGridState$scrollToItem$2(C0129b c0129b, int i, Continuation continuation) {
        super(2, continuation);
        this.f2465a = c0129b;
        this.f2466b = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LazyGridState$scrollToItem$2(this.f2465a, this.f2466b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        LazyGridState$scrollToItem$2 lazyGridState$scrollToItem$2 = (LazyGridState$scrollToItem$2) create((wn8) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        lazyGridState$scrollToItem$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C0129b c0129b = this.f2465a;
        ws4 ws4Var = c0129b.f2471d;
        int iM21222h = ws4Var.f67245b.m21222h();
        int i = this.f2466b;
        if (iM21222h != i || ws4Var.f67246c.m21222h() != 0) {
            C0135d c0135d = c0129b.f2480m;
            c0135d.m1012e();
            c0135d.f2555b = null;
            c0135d.f2556c = -1;
            b72 b72Var = c0129b.f2468a;
        }
        ws4Var.m24141a(i, 0);
        ws4Var.f67248e = null;
        C0357g c0357g = c0129b.f2477j;
        if (c0357g != null) {
            c0357g.m1598l();
        }
        return xfa.f68157a;
    }
}
