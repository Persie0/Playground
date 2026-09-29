package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.snapping.C0112a;
import androidx.compose.material3.C0227e;
import androidx.compose.p002ui.unit.LayoutDirection;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$FloatRef;
import p000.AbstractC3720wf;
import p000.C2951e4;
import p000.C3309ls;
import p000.C3386nv;
import p000.C3539rk;
import p000.C3757xf;
import p000.a62;
import p000.ae1;
import p000.fa4;
import p000.fb2;
import p000.fda;
import p000.l54;
import p000.rk2;
import p000.te1;
import p000.wfb;
import p000.x63;
import p000.xc9;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0096d extends AbstractC0103k {

    /* JADX INFO: renamed from: e0 */
    public C0097e f2227e0;

    /* JADX INFO: renamed from: f0 */
    public Boolean f2228f0;

    /* JADX INFO: renamed from: g0 */
    public C0227e f2229g0;

    /* JADX INFO: renamed from: h0 */
    public x63 f2230h0;

    /* JADX INFO: renamed from: i0 */
    public fb2 f2231i0;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: u1 */
    public static final Object m839u1(C0096d c0096d, float f, ContinuationImpl continuationImpl) throws Throwable {
        AnchoredDraggableNode$fling$1 anchoredDraggableNode$fling$1;
        Ref$FloatRef ref$FloatRef;
        if (continuationImpl instanceof AnchoredDraggableNode$fling$1) {
            anchoredDraggableNode$fling$1 = (AnchoredDraggableNode$fling$1) continuationImpl;
            int i = anchoredDraggableNode$fling$1.f1814d;
            if ((i & Integer.MIN_VALUE) != 0) {
                anchoredDraggableNode$fling$1.f1814d = i - Integer.MIN_VALUE;
            } else {
                anchoredDraggableNode$fling$1 = new AnchoredDraggableNode$fling$1(c0096d, continuationImpl);
            }
        } else {
            anchoredDraggableNode$fling$1 = new AnchoredDraggableNode$fling$1(c0096d, continuationImpl);
        }
        Object obj = anchoredDraggableNode$fling$1.f1812b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = anchoredDraggableNode$fling$1.f1814d;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            if (c0096d.f2227e0.m850d()) {
                C0097e c0097e = c0096d.f2227e0;
                anchoredDraggableNode$fling$1.f1814d = 1;
                if (!c0097e.m850d()) {
                    l54.m15814a("AnchoredDraggableState was configured through a constructor without providing positional and velocity threshold. This overload of settle has been deprecated. Please refer to AnchoredDraggableState#settle(animationSpec) for more information.");
                }
                Object value = ((xc9) c0097e.f2238g).getValue();
                a62 a62VarM849c = c0097e.m849c();
                float fM852f = c0097e.m852f();
                ae1 ae1Var = c0097e.f2233b;
                if (ae1Var == null) {
                    fa4.m11636J("positionalThreshold");
                    throw null;
                }
                C3539rk c3539rk = c0097e.f2234c;
                if (c3539rk == null) {
                    fa4.m11636J("velocityThreshold");
                    throw null;
                }
                Object objM827b = AbstractC0095c.m827b(a62VarM849c, fM852f, f, ae1Var, c3539rk);
                Object objM834i = ((Boolean) c0097e.f2232a.invoke(objM827b)).booleanValue() ? AbstractC0095c.m834i(c0097e, objM827b, f, anchoredDraggableNode$fling$1) : AbstractC0095c.m834i(c0097e, value, f, anchoredDraggableNode$fling$1);
                if (objM834i != coroutineSingletons) {
                    return objM834i;
                }
            } else {
                Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
                ref$FloatRef2.f47715a = f;
                C0097e c0097e2 = c0096d.f2227e0;
                AnchoredDraggableNode$fling$2 anchoredDraggableNode$fling$2 = new AnchoredDraggableNode$fling$2(c0096d, ref$FloatRef2, f, null);
                anchoredDraggableNode$fling$1.f1811a = ref$FloatRef2;
                anchoredDraggableNode$fling$1.f1814d = 2;
                if (C0097e.m847b(c0097e2, anchoredDraggableNode$fling$2, anchoredDraggableNode$fling$1) != coroutineSingletons) {
                    ref$FloatRef = ref$FloatRef2;
                }
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            AbstractC3193b.m15359b(obj);
            return obj;
        }
        if (i2 != 2) {
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ref$FloatRef = anchoredDraggableNode$fling$1.f1811a;
        AbstractC3193b.m15359b(obj);
        return new Float(ref$FloatRef.f47715a);
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: R0 */
    public final void mo36R0() {
        m846w1(this.f2229g0);
    }

    @Override // p000.ea2, p000.ng7
    /* JADX INFO: renamed from: g */
    public final void mo840g() {
        mo818K();
        if (this.f34836I) {
            fb2 fb2Var = te1.m21979L(this).f4327T;
            fb2 fb2Var2 = this.f2231i0;
            if (fb2Var2 == null || !fb2Var2.equals(fb2Var)) {
                this.f2231i0 = fb2Var;
                m846w1(this.f2229g0);
            }
        }
    }

    @Override // androidx.compose.foundation.gestures.AbstractC0103k
    /* JADX INFO: renamed from: g1 */
    public final Object mo841g1(zi3 zi3Var, Continuation continuation) {
        Object objM847b = C0097e.m847b(this.f2227e0, new AnchoredDraggableNode$drag$2(zi3Var, this, null), (ContinuationImpl) continuation);
        return objM847b == CoroutineSingletons.COROUTINE_SUSPENDED ? objM847b : xfa.f68157a;
    }

    @Override // androidx.compose.foundation.gestures.AbstractC0103k
    /* JADX INFO: renamed from: l1 */
    public final void mo842l1(long j) {
    }

    @Override // androidx.compose.foundation.gestures.AbstractC0103k
    /* JADX INFO: renamed from: m1 */
    public final void mo843m1(rk2 rk2Var) {
        if (this.f34836I) {
            wfb.m23926u(m9971N0(), null, null, new AnchoredDraggableNode$onDragStopped$1(this, rk2Var, null), 3);
        }
    }

    @Override // androidx.compose.foundation.gestures.AbstractC0103k
    /* JADX INFO: renamed from: r1 */
    public final boolean mo844r1() {
        return ((xc9) this.f2227e0.f2243l).getValue() != null;
    }

    /* JADX INFO: renamed from: v1 */
    public final boolean m845v1() {
        Boolean bool = this.f2228f0;
        if (bool == null) {
            return te1.m21979L(this).f4328U == LayoutDirection.Rtl && this.f2267L == Orientation.Horizontal;
        }
        bool.getClass();
        return bool.booleanValue();
    }

    /* JADX INFO: renamed from: w1 */
    public final void m846w1(C0227e c0227e) {
        x63 c0112a = c0227e;
        if (c0227e == null) {
            fda fdaVar = AbstractC3720wf.f66744a;
            C2951e4 c2951e4 = AbstractC3720wf.f66745b;
            fb2 fb2Var = te1.m21979L(this).f4327T;
            this.f2231i0 = fb2Var;
            c0112a = new C0112a(new C3309ls(this.f2227e0, c2951e4, new C3757xf(fb2Var, 0), 5), AbstractC0095c.f2226b, fdaVar);
        }
        this.f2230h0 = c0112a;
    }
}
