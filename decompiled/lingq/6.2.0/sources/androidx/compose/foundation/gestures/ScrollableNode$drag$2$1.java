package androidx.compose.foundation.gestures;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.ho8;
import p000.ui5;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.ScrollableNode$drag$2$1", m4291f = "Scrollable.kt", m4292l = {362}, m4293m = "invokeSuspend", m4294v = 1)
final class ScrollableNode$drag$2$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f2063a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f2064b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zi3 f2065c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0116v f2066d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableNode$drag$2$1(zi3 zi3Var, C0116v c0116v, Continuation continuation) {
        super(2, continuation);
        this.f2065c = zi3Var;
        this.f2066d = c0116v;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScrollableNode$drag$2$1 scrollableNode$drag$2$1 = new ScrollableNode$drag$2$1(this.f2065c, this.f2066d, continuation);
        scrollableNode$drag$2$1.f2064b = obj;
        return scrollableNode$drag$2$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ScrollableNode$drag$2$1) create((ho8) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f2063a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            ui5 ui5Var = new ui5(14, (ho8) this.f2064b, this.f2066d);
            this.f2063a = 1;
            if (((DragGestureNode$startListeningForEvents$1.C00861) this.f2065c).invoke(ui5Var, this) == coroutineSingletons) {
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
