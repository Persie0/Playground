package androidx.compose.foundation;

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
@c32(m4290c = "androidx.compose.foundation.HoverableNode$onPointerEvent$1", m4291f = "Hoverable.kt", m4292l = {89}, m4293m = "invokeSuspend", m4294v = 1)
final class HoverableNode$onPointerEvent$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f1684a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0123j f1685b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HoverableNode$onPointerEvent$1(C0123j c0123j, Continuation continuation) {
        super(2, continuation);
        this.f1685b = c0123j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HoverableNode$onPointerEvent$1(this.f1685b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((HoverableNode$onPointerEvent$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f1684a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f1684a = 1;
            if (C0123j.m958Z0(this.f1685b, this) == coroutineSingletons) {
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
