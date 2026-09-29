package androidx.compose.foundation.gestures;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import p000.C0809bg;
import p000.C3386nv;
import p000.C3831zf;
import p000.aj3;
import p000.c32;
import p000.fa4;
import p000.x63;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$2", m4291f = "AnchoredDraggable.kt", m4292l = {473}, m4293m = "invokeSuspend", m4294v = 1)
final class AnchoredDraggableNode$fling$2 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f1815a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f1816b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0096d f1817c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Ref$FloatRef f1818d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ float f1819e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableNode$fling$2(C0096d c0096d, Ref$FloatRef ref$FloatRef, float f, Continuation continuation) {
        super(3, continuation);
        this.f1817c = c0096d;
        this.f1818d = ref$FloatRef;
        this.f1819e = f;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Ref$FloatRef ref$FloatRef = this.f1818d;
        float f = this.f1819e;
        AnchoredDraggableNode$fling$2 anchoredDraggableNode$fling$2 = new AnchoredDraggableNode$fling$2(this.f1817c, ref$FloatRef, f, (Continuation) obj3);
        anchoredDraggableNode$fling$2.f1816b = (C0809bg) obj;
        return anchoredDraggableNode$fling$2.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ref$FloatRef ref$FloatRef;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f1815a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C0809bg c0809bg = (C0809bg) this.f1816b;
            C0096d c0096d = this.f1817c;
            C3831zf c3831zf = new C3831zf(0, c0096d, c0809bg);
            x63 x63Var = c0096d.f2230h0;
            if (x63Var == null) {
                fa4.m11636J("resolvedFlingBehavior");
                throw null;
            }
            Ref$FloatRef ref$FloatRef2 = this.f1818d;
            this.f1816b = ref$FloatRef2;
            this.f1815a = 1;
            obj = x63Var.mo862a(c3831zf, this.f1819e, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            ref$FloatRef = ref$FloatRef2;
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ref$FloatRef = (Ref$FloatRef) this.f1816b;
            AbstractC3193b.m15359b(obj);
        }
        ref$FloatRef.f47715a = ((Number) obj).floatValue();
        return xfa.f68157a;
    }
}
