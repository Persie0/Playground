package androidx.compose.foundation.gestures;

import androidx.compose.runtime.AbstractC0278f;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000.C3386nv;
import p000.c32;
import p000.kk8;
import p000.ui3;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2", m4291f = "AnchoredDraggable.kt", m4292l = {1580}, m4293m = "invokeSuspend", m4294v = 1)
final class AnchoredDraggableKt$restartable$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f1795a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f1796b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ui3 f1797c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zi3 f1798d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableKt$restartable$2(ui3 ui3Var, zi3 zi3Var, Continuation continuation) {
        super(2, continuation);
        this.f1797c = ui3Var;
        this.f1798d = zi3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AnchoredDraggableKt$restartable$2 anchoredDraggableKt$restartable$2 = new AnchoredDraggableKt$restartable$2(this.f1797c, this.f1798d, continuation);
        anchoredDraggableKt$restartable$2.f1796b = obj;
        return anchoredDraggableKt$restartable$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((AnchoredDraggableKt$restartable$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f1795a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            un1 un1Var = (un1) this.f1796b;
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            kk8 kk8VarM1264n = AbstractC0278f.m1264n(this.f1797c);
            C0094b c0094b = new C0094b(ref$ObjectRef, un1Var, this.f1798d);
            this.f1795a = 1;
            if (kk8VarM1264n.collect(c0094b, this) == coroutineSingletons) {
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
