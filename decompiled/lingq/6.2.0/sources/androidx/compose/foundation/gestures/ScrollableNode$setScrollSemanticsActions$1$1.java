package androidx.compose.foundation.gestures;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$1$1", m4291f = "Scrollable.kt", m4292l = {597}, m4293m = "invokeSuspend", m4294v = 1)
final class ScrollableNode$setScrollSemanticsActions$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f2081a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0115u f2082b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f2083c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ float f2084d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableNode$setScrollSemanticsActions$1$1(C0115u c0115u, float f, float f2, Continuation continuation) {
        super(2, continuation);
        this.f2082b = c0115u;
        this.f2083c = f;
        this.f2084d = f2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScrollableNode$setScrollSemanticsActions$1$1(this.f2082b, this.f2083c, this.f2084d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ScrollableNode$setScrollSemanticsActions$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f2081a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C0116v c0116v = this.f2082b.f2352i0;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.f2083c)) << 32) | (((long) Float.floatToRawIntBits(this.f2084d)) & 4294967295L);
            this.f2081a = 1;
            if (AbstractC0110r.m917a(c0116v, jFloatToRawIntBits, this) == coroutineSingletons) {
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
