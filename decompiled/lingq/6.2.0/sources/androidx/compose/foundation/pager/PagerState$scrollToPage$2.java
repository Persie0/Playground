package androidx.compose.foundation.pager;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.wn8;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.pager.PagerState$scrollToPage$2", m4291f = "PagerState.kt", m4292l = {551}, m4293m = "invokeSuspend", m4294v = 1)
final class PagerState$scrollToPage$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f2654a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0150d f2655b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f2656c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerState$scrollToPage$2(AbstractC0150d abstractC0150d, int i, Continuation continuation) {
        super(2, continuation);
        this.f2655b = abstractC0150d;
        this.f2656c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PagerState$scrollToPage$2(this.f2655b, this.f2656c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((PagerState$scrollToPage$2) create((wn8) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f2654a;
        AbstractC0150d abstractC0150d = this.f2655b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f2654a = 1;
            if (abstractC0150d.m1034i(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        abstractC0150d.m1045v(0.0f, abstractC0150d.m1035j(this.f2656c), true);
        return xfa.f68157a;
    }
}
