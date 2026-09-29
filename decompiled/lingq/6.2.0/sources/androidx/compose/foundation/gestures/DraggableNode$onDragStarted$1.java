package androidx.compose.foundation.gestures;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.gq6;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.DraggableNode$onDragStarted$1", m4291f = "Draggable.kt", m4292l = {335}, m4293m = "invokeSuspend", m4294v = 1)
final class DraggableNode$onDragStarted$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f1964a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f1965b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0105m f1966c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f1967d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraggableNode$onDragStarted$1(C0105m c0105m, long j, Continuation continuation) {
        super(2, continuation);
        this.f1966c = c0105m;
        this.f1967d = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DraggableNode$onDragStarted$1 draggableNode$onDragStarted$1 = new DraggableNode$onDragStarted$1(this.f1966c, this.f1967d, continuation);
        draggableNode$onDragStarted$1.f1965b = obj;
        return draggableNode$onDragStarted$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((DraggableNode$onDragStarted$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f1964a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            un1 un1Var = (un1) this.f1965b;
            aj3 aj3Var = this.f1966c.f2290g0;
            gq6 gq6Var = new gq6(this.f1967d);
            this.f1964a = 1;
            if (aj3Var.invoke(un1Var, gq6Var, this) == coroutineSingletons) {
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
