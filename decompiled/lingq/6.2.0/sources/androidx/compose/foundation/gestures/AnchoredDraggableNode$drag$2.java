package androidx.compose.foundation.gestures;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C0809bg;
import p000.C3386nv;
import p000.C3704w;
import p000.aj3;
import p000.c32;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2", m4291f = "AnchoredDraggable.kt", m4292l = {412}, m4293m = "invokeSuspend", m4294v = 1)
final class AnchoredDraggableNode$drag$2 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f1807a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ C0809bg f1808b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zi3 f1809c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0096d f1810d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableNode$drag$2(zi3 zi3Var, C0096d c0096d, Continuation continuation) {
        super(3, continuation);
        this.f1809c = zi3Var;
        this.f1810d = c0096d;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AnchoredDraggableNode$drag$2 anchoredDraggableNode$drag$2 = new AnchoredDraggableNode$drag$2(this.f1809c, this.f1810d, (Continuation) obj3);
        anchoredDraggableNode$drag$2.f1808b = (C0809bg) obj;
        return anchoredDraggableNode$drag$2.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f1807a;
        int i2 = 1;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C3704w c3704w = new C3704w(i2, this.f1810d, this.f1808b);
            this.f1807a = 1;
            if (((DragGestureNode$startListeningForEvents$1.C00861) this.f1809c).invoke(c3704w, this) == coroutineSingletons) {
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
