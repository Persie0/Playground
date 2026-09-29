package androidx.compose.foundation.gestures;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.dpa;
import p000.rk2;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.DraggableNode$onDragStopped$1", m4291f = "Draggable.kt", m4292l = {343}, m4293m = "invokeSuspend", m4294v = 1)
final class DraggableNode$onDragStopped$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f1968a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f1969b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0105m f1970c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ rk2 f1971d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Orientation f1972e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraggableNode$onDragStopped$1(C0105m c0105m, rk2 rk2Var, Orientation orientation, Continuation continuation) {
        super(2, continuation);
        this.f1970c = c0105m;
        this.f1971d = rk2Var;
        this.f1972e = orientation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DraggableNode$onDragStopped$1 draggableNode$onDragStopped$1 = new DraggableNode$onDragStopped$1(this.f1970c, this.f1971d, this.f1972e, continuation);
        draggableNode$onDragStopped$1.f1969b = obj;
        return draggableNode$onDragStopped$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((DraggableNode$onDragStopped$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f1968a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            un1 un1Var = (un1) this.f1969b;
            C0105m c0105m = this.f1970c;
            aj3 aj3Var = c0105m.f2291h0;
            long jM10575f = dpa.m10575f(c0105m.f2292i0 ? -1.0f : 1.0f, this.f1971d.f59424a);
            aj3 aj3Var2 = AbstractC0104l.f2286a;
            Float f = new Float(this.f1972e == Orientation.Vertical ? dpa.m10572c(jM10575f) : dpa.m10571b(jM10575f));
            this.f1968a = 1;
            if (aj3Var.invoke(un1Var, f, this) == coroutineSingletons) {
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
