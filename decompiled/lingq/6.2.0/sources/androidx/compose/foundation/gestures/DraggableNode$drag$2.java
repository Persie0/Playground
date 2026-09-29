package androidx.compose.foundation.gestures;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.al2;
import p000.bb0;
import p000.c32;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.DraggableNode$drag$2", m4291f = "Draggable.kt", m4292l = {326}, m4293m = "invokeSuspend", m4294v = 1)
final class DraggableNode$drag$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f1959a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f1960b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zi3 f1961c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0105m f1962d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Orientation f1963e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraggableNode$drag$2(zi3 zi3Var, C0105m c0105m, Orientation orientation, Continuation continuation) {
        super(2, continuation);
        this.f1961c = zi3Var;
        this.f1962d = c0105m;
        this.f1963e = orientation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DraggableNode$drag$2 draggableNode$drag$2 = new DraggableNode$drag$2(this.f1961c, this.f1962d, this.f1963e, continuation);
        draggableNode$drag$2.f1960b = obj;
        return draggableNode$drag$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((DraggableNode$drag$2) create((al2) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f1959a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bb0 bb0Var = new bb0((al2) this.f1960b, this.f1962d, this.f1963e, 7);
            this.f1959a = 1;
            if (((DragGestureNode$startListeningForEvents$1.C00861) this.f1961c).invoke(bb0Var, this) == coroutineSingletons) {
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
