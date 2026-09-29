package androidx.compose.foundation.gestures;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.vz1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$2", m4291f = "AnchoredDraggable.kt", m4292l = {1587}, m4293m = "invokeSuspend", m4294v = 1)
final class AnchoredDraggableKt$restartable$2$1$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f1799a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zi3 f1800b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f1801c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ un1 f1802d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableKt$restartable$2$1$2(zi3 zi3Var, Object obj, un1 un1Var, Continuation continuation) {
        super(2, continuation);
        this.f1800b = zi3Var;
        this.f1801c = obj;
        this.f1802d = un1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AnchoredDraggableKt$restartable$2$1$2(this.f1800b, this.f1801c, this.f1802d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((AnchoredDraggableKt$restartable$2$1$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f1799a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f1799a = 1;
            if (this.f1800b.invoke(this.f1801c, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        vz1.m23637j(this.f1802d, new AnchoredDragFinishedSignal());
        return xfa.f68157a;
    }
}
