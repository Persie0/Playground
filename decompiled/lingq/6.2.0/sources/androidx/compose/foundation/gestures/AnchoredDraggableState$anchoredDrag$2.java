package androidx.compose.foundation.gestures;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C0018ag;
import p000.C0809bg;
import p000.C3386nv;
import p000.a62;
import p000.aj3;
import p000.c32;
import p000.qc9;
import p000.vi3;
import p000.xc9;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2", m4291f = "AnchoredDraggable.kt", m4292l = {1159}, m4293m = "invokeSuspend", m4294v = 1)
final class AnchoredDraggableState$anchoredDrag$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f1823a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0097e f1824b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ aj3 f1825c;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2$2 */
    @c32(m4290c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2$2", m4291f = "AnchoredDraggable.kt", m4292l = {1160}, m4293m = "invokeSuspend", m4294v = 1)
    final class C00822 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f1826a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f1827b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ aj3 f1828c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C0097e f1829d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00822(aj3 aj3Var, C0097e c0097e, Continuation continuation) {
            super(2, continuation);
            this.f1828c = aj3Var;
            this.f1829d = c0097e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C00822 c00822 = new C00822(this.f1828c, this.f1829d, continuation);
            c00822.f1827b = obj;
            return c00822;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C00822) create((a62) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f1826a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                a62 a62Var = (a62) this.f1827b;
                C0809bg c0809bg = this.f1829d.f2245n;
                this.f1826a = 1;
                if (this.f1828c.invoke(c0809bg, a62Var, this) == coroutineSingletons) {
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
    public AnchoredDraggableState$anchoredDrag$2(aj3 aj3Var, C0097e c0097e, Continuation continuation) {
        super(1, continuation);
        this.f1824b = c0097e;
        this.f1825c = aj3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new AnchoredDraggableState$anchoredDrag$2(this.f1825c, this.f1824b, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((AnchoredDraggableState$anchoredDrag$2) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f1823a;
        C0097e c0097e = this.f1824b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C0018ag c0018ag = new C0018ag(c0097e, 2);
            C00822 c00822 = new C00822(this.f1825c, c0097e, null);
            this.f1823a = 1;
            if (AbstractC0095c.m828c(c0018ag, c00822, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        a62 a62VarM849c = c0097e.m849c();
        qc9 qc9Var = c0097e.f2241j;
        Object objM128a = a62VarM849c.m128a(qc9Var.m19861h());
        if (objM128a != null) {
            if (Math.abs(qc9Var.m19861h() - c0097e.m849c().m133f(objM128a)) < 0.5f && ((Boolean) c0097e.f2232a.invoke(objM128a)).booleanValue()) {
                ((xc9) c0097e.f2239h).setValue(objM128a);
                c0097e.m853g(objM128a);
            }
        }
        return xfa.f68157a;
    }
}
