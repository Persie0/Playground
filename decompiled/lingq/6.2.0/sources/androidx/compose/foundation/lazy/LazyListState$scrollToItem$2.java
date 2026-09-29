package androidx.compose.foundation.lazy;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.wn8;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.lazy.LazyListState$scrollToItem$2", m4291f = "LazyListState.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 1)
final class LazyListState$scrollToItem$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0127b f2433a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f2434b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyListState$scrollToItem$2(C0127b c0127b, int i, Continuation continuation) {
        super(2, continuation);
        this.f2433a = c0127b;
        this.f2434b = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LazyListState$scrollToItem$2(this.f2433a, this.f2434b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        LazyListState$scrollToItem$2 lazyListState$scrollToItem$2 = (LazyListState$scrollToItem$2) create((wn8) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        lazyListState$scrollToItem$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        this.f2433a.m982m(this.f2434b, 0);
        return xfa.f68157a;
    }
}
