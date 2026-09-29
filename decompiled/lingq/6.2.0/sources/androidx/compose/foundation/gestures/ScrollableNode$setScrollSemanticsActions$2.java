package androidx.compose.foundation.gestures;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.gq6;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$2", m4291f = "Scrollable.kt", m4292l = {601}, m4293m = "invokeSuspend", m4294v = 1)
final class ScrollableNode$setScrollSemanticsActions$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f2085a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ long f2086b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0115u f2087c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableNode$setScrollSemanticsActions$2(C0115u c0115u, Continuation continuation) {
        super(2, continuation);
        this.f2087c = c0115u;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScrollableNode$setScrollSemanticsActions$2 scrollableNode$setScrollSemanticsActions$2 = new ScrollableNode$setScrollSemanticsActions$2(this.f2087c, continuation);
        scrollableNode$setScrollSemanticsActions$2.f2086b = ((gq6) obj).f41189a;
        return scrollableNode$setScrollSemanticsActions$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        long j = ((gq6) obj).f41189a;
        ScrollableNode$setScrollSemanticsActions$2 scrollableNode$setScrollSemanticsActions$2 = new ScrollableNode$setScrollSemanticsActions$2(this.f2087c, (Continuation) obj2);
        scrollableNode$setScrollSemanticsActions$2.f2086b = j;
        return scrollableNode$setScrollSemanticsActions$2.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f2085a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return obj;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        long j = this.f2086b;
        C0116v c0116v = this.f2087c.f2352i0;
        this.f2085a = 1;
        Object objM917a = AbstractC0110r.m917a(c0116v, j, this);
        return objM917a == coroutineSingletons ? coroutineSingletons : objM917a;
    }
}
