package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.AbstractC0133b;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.fb2;
import p000.hv4;
import p000.jv4;
import p000.wn8;
import p000.xc9;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.lazy.LazyListState$animateScrollToItem$2", m4291f = "LazyListState.kt", m4292l = {587}, m4293m = "invokeSuspend", m4294v = 1)
final class LazyListState$animateScrollToItem$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f2423a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f2424b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0127b f2425c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2426d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f2427e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyListState$animateScrollToItem$2(C0127b c0127b, int i, int i2, Continuation continuation) {
        super(2, continuation);
        this.f2425c = c0127b;
        this.f2426d = i;
        this.f2427e = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LazyListState$animateScrollToItem$2 lazyListState$animateScrollToItem$2 = new LazyListState$animateScrollToItem$2(this.f2425c, this.f2426d, this.f2427e, continuation);
        lazyListState$animateScrollToItem$2.f2424b = obj;
        return lazyListState$animateScrollToItem$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LazyListState$animateScrollToItem$2) create((wn8) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f2423a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            wn8 wn8Var = (wn8) this.f2424b;
            C0127b c0127b = this.f2425c;
            jv4 jv4Var = new jv4(wn8Var, c0127b, 0);
            fb2 fb2Var = ((hv4) ((xc9) c0127b.f2441f).getValue()).f42983i;
            this.f2423a = 1;
            if (AbstractC0133b.m993a(jv4Var, this.f2426d, this.f2427e, 100, fb2Var, this) == coroutineSingletons) {
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
