package androidx.compose.foundation.gestures;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.dpa;
import p000.rk2;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1", m4291f = "AnchoredDraggable.kt", m4292l = {438, 440}, m4293m = "invokeSuspend", m4294v = 1)
final class AnchoredDraggableNode$onDragStopped$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f1820a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0096d f1821b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ rk2 f1822c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableNode$onDragStopped$1(C0096d c0096d, rk2 rk2Var, Continuation continuation) {
        super(2, continuation);
        this.f1821b = c0096d;
        this.f1822c = rk2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AnchoredDraggableNode$onDragStopped$1(this.f1821b, this.f1822c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((AnchoredDraggableNode$onDragStopped$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f1820a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            long j = this.f1822c.f59424a;
            C0096d c0096d = this.f1821b;
            long jM10575f = dpa.m10575f(c0096d.m845v1() ? -1.0f : 1.0f, j);
            float fM10572c = c0096d.f2267L == Orientation.Vertical ? dpa.m10572c(jM10575f) : dpa.m10571b(jM10575f);
            this.f1820a = 1;
            if (C0096d.m839u1(c0096d, fM10572c, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1 && i != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
