package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.ho8;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1", m4291f = "Scrollable.kt", m4292l = {543}, m4293m = "invokeSuspend", m4294v = 1)
final class ScrollableNode$onKeyEvent$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f2070a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0115u f2071b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f2072c;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1$1 */
    @c32(m4290c = "androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1$1", m4291f = "Scrollable.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 1)
    final class C00901 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f2073a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ long f2074b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00901(long j, Continuation continuation) {
            super(2, continuation);
            this.f2074b = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C00901 c00901 = new C00901(this.f2074b, continuation);
            c00901.f2073a = obj;
            return c00901;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C00901 c00901 = (C00901) create((ho8) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c00901.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C0116v c0116v = ((ho8) this.f2073a).f42716a;
            c0116v.m931c(c0116v.f2370k, this.f2074b, 1);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableNode$onKeyEvent$1(C0115u c0115u, long j, Continuation continuation) {
        super(2, continuation);
        this.f2071b = c0115u;
        this.f2072c = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScrollableNode$onKeyEvent$1(this.f2071b, this.f2072c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ScrollableNode$onKeyEvent$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f2070a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C0116v c0116v = this.f2071b.f2352i0;
            MutatePriority mutatePriority = MutatePriority.UserInput;
            C00901 c00901 = new C00901(this.f2072c, null);
            this.f2070a = 1;
            if (c0116v.m934f(mutatePriority, c00901, this) == coroutineSingletons) {
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
