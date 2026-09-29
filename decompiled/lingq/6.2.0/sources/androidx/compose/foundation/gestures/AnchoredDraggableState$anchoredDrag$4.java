package androidx.compose.foundation.gestures;

import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C0018ag;
import p000.C0809bg;
import p000.C3386nv;
import p000.a62;
import p000.bj3;
import p000.c32;
import p000.vi3;
import p000.xc9;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4", m4291f = "AnchoredDraggable.kt", m4292l = {1206}, m4293m = "invokeSuspend", m4294v = 1)
final class AnchoredDraggableState$anchoredDrag$4 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f1833a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0097e f1834b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f1835c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ bj3 f1836d;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4$2 */
    @c32(m4290c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4$2", m4291f = "AnchoredDraggable.kt", m4292l = {1208}, m4293m = "invokeSuspend", m4294v = 1)
    final class C00832 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f1837a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f1838b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ bj3 f1839c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C0097e f1840d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00832(bj3 bj3Var, C0097e c0097e, Continuation continuation) {
            super(2, continuation);
            this.f1839c = bj3Var;
            this.f1840d = c0097e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C00832 c00832 = new C00832(this.f1839c, this.f1840d, continuation);
            c00832.f1838b = obj;
            return c00832;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C00832) create((Pair) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f1837a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                Pair pair = (Pair) this.f1838b;
                a62 a62Var = (a62) pair.f47623a;
                Object obj2 = pair.f47624b;
                C0809bg c0809bg = this.f1840d.f2245n;
                this.f1837a = 1;
                if (this.f1839c.mo825e(c0809bg, a62Var, obj2, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableState$anchoredDrag$4(C0097e c0097e, Object obj, bj3 bj3Var, Continuation continuation) {
        super(1, continuation);
        this.f1834b = c0097e;
        this.f1835c = obj;
        this.f1836d = bj3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new AnchoredDraggableState$anchoredDrag$4(this.f1834b, this.f1835c, this.f1836d, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((AnchoredDraggableState$anchoredDrag$4) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f1833a;
        Object obj2 = this.f1835c;
        C0097e c0097e = this.f1834b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            ((xc9) c0097e.f2243l).setValue(obj2);
            C0018ag c0018ag = new C0018ag(c0097e, 3);
            C00832 c00832 = new C00832(this.f1836d, c0097e, null);
            this.f1833a = 1;
            if (AbstractC0095c.m828c(c0018ag, c00832, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        if (((Boolean) c0097e.f2232a.invoke(obj2)).booleanValue()) {
            c0097e.f2245n.m3692a(c0097e.m849c().m133f(obj2), c0097e.f2242k.m19861h());
            ((xc9) c0097e.f2239h).setValue(obj2);
            c0097e.m853g(obj2);
        }
        return xfa.f68157a;
    }
}
