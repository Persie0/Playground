package androidx.compose.foundation.gestures;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineStart;
import p000.C3386nv;
import p000.cd4;
import p000.e83;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0094b implements e83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Ref$ObjectRef f2222a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ un1 f2223b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zi3 f2224c;

    public C0094b(Ref$ObjectRef ref$ObjectRef, un1 un1Var, zi3 zi3Var) {
        this.f2222a = ref$ObjectRef;
        this.f2223b = un1Var;
        this.f2224c = zi3Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p000.e83
    public final Object emit(Object obj, Continuation continuation) throws Throwable {
        AnchoredDraggableKt$restartable$2$1$emit$1 anchoredDraggableKt$restartable$2$1$emit$1;
        if (continuation instanceof AnchoredDraggableKt$restartable$2$1$emit$1) {
            anchoredDraggableKt$restartable$2$1$emit$1 = (AnchoredDraggableKt$restartable$2$1$emit$1) continuation;
            int i = anchoredDraggableKt$restartable$2$1$emit$1.f1806d;
            if ((i & Integer.MIN_VALUE) != 0) {
                anchoredDraggableKt$restartable$2$1$emit$1.f1806d = i - Integer.MIN_VALUE;
            } else {
                anchoredDraggableKt$restartable$2$1$emit$1 = new AnchoredDraggableKt$restartable$2$1$emit$1(this, continuation);
            }
        } else {
            anchoredDraggableKt$restartable$2$1$emit$1 = new AnchoredDraggableKt$restartable$2$1$emit$1(this, continuation);
        }
        Object obj2 = anchoredDraggableKt$restartable$2$1$emit$1.f1804b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = anchoredDraggableKt$restartable$2$1$emit$1.f1806d;
        Ref$ObjectRef ref$ObjectRef = this.f2222a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj2);
            cd4 cd4Var = (cd4) ref$ObjectRef.f47718a;
            if (cd4Var != null) {
                cd4Var.mo4537a(new AnchoredDragFinishedSignal());
                anchoredDraggableKt$restartable$2$1$emit$1.f1803a = obj;
                anchoredDraggableKt$restartable$2$1$emit$1.f1806d = 1;
                if (cd4Var.mo4539q(anchoredDraggableKt$restartable$2$1$emit$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = anchoredDraggableKt$restartable$2$1$emit$1.f1803a;
            AbstractC3193b.m15359b(obj2);
        }
        CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
        zi3 zi3Var = this.f2224c;
        un1 un1Var = this.f2223b;
        ref$ObjectRef.f47718a = wfb.m23926u(un1Var, null, coroutineStart, new AnchoredDraggableKt$restartable$2$1$2(zi3Var, obj, un1Var, null), 1);
        return xfa.f68157a;
    }
}
