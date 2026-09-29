package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.gestures.AbstractC0110r;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.AbstractC3489q9;
import p000.C3386nv;
import p000.C3764xm;
import p000.InterfaceC0025an;
import p000.ec9;
import p000.f32;
import p000.f63;
import p000.fa4;
import p000.hc9;
import p000.nr9;
import p000.qn3;
import p000.r46;
import p000.te1;
import p000.vi3;
import p000.wfb;
import p000.wn8;
import p000.x63;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.snapping.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0112a implements x63 {

    /* JADX INFO: renamed from: a */
    public final hc9 f2343a;

    /* JADX INFO: renamed from: b */
    public final f32 f2344b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0025an f2345c;

    /* JADX INFO: renamed from: d */
    public final f63 f2346d = AbstractC0110r.f2312c;

    public C0112a(hc9 hc9Var, f32 f32Var, InterfaceC0025an interfaceC0025an) {
        this.f2343a = hc9Var;
        this.f2344b = f32Var;
        this.f2345c = interfaceC0025an;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: b */
    public static final Object m921b(C0112a c0112a, wn8 wn8Var, float f, float f2, ec9 ec9Var, ContinuationImpl continuationImpl) throws Throwable {
        SnapFlingBehavior$tryApproach$1 snapFlingBehavior$tryApproach$1;
        if (continuationImpl instanceof SnapFlingBehavior$tryApproach$1) {
            snapFlingBehavior$tryApproach$1 = (SnapFlingBehavior$tryApproach$1) continuationImpl;
            int i = snapFlingBehavior$tryApproach$1.f2331c;
            if ((i & Integer.MIN_VALUE) != 0) {
                snapFlingBehavior$tryApproach$1.f2331c = i - Integer.MIN_VALUE;
            } else {
                snapFlingBehavior$tryApproach$1 = new SnapFlingBehavior$tryApproach$1(c0112a, continuationImpl);
            }
        } else {
            snapFlingBehavior$tryApproach$1 = new SnapFlingBehavior$tryApproach$1(c0112a, continuationImpl);
        }
        SnapFlingBehavior$tryApproach$1 snapFlingBehavior$tryApproach$2 = snapFlingBehavior$tryApproach$1;
        Object objMo3040e = snapFlingBehavior$tryApproach$2.f2329a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = snapFlingBehavior$tryApproach$2.f2331c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objMo3040e);
            if (Math.abs(f) == 0.0f || Math.abs(f2) == 0.0f) {
                return r46.m20376a(f, f2, 28);
            }
            snapFlingBehavior$tryApproach$2.f2331c = 1;
            f32 f32Var = c0112a.f2344b;
            objMo3040e = (Math.abs(AbstractC3489q9.m19777g(f32Var, 0.0f, f2)) >= Math.abs(f) ? new qn3(f32Var) : new nr9(c0112a.f2345c)).mo3040e(wn8Var, new Float(f), new Float(f2), ec9Var, snapFlingBehavior$tryApproach$2);
            if (objMo3040e == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objMo3040e);
        }
        return ((C3764xm) objMo3040e).f68340b;
    }

    @Override // p000.x63
    /* JADX INFO: renamed from: a */
    public Object mo862a(wn8 wn8Var, float f, Continuation continuation) {
        return m923d(wn8Var, f, te1.f62179c, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m922c(wn8 wn8Var, float f, vi3 vi3Var, ContinuationImpl continuationImpl) throws Throwable {
        SnapFlingBehavior$fling$1 snapFlingBehavior$fling$1;
        vi3 vi3Var2;
        if (continuationImpl instanceof SnapFlingBehavior$fling$1) {
            snapFlingBehavior$fling$1 = (SnapFlingBehavior$fling$1) continuationImpl;
            int i = snapFlingBehavior$fling$1.f2319d;
            if ((i & Integer.MIN_VALUE) != 0) {
                snapFlingBehavior$fling$1.f2319d = i - Integer.MIN_VALUE;
            } else {
                snapFlingBehavior$fling$1 = new SnapFlingBehavior$fling$1(this, continuationImpl);
            }
        } else {
            snapFlingBehavior$fling$1 = new SnapFlingBehavior$fling$1(this, continuationImpl);
        }
        Object objM23905G = snapFlingBehavior$fling$1.f2317b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = snapFlingBehavior$fling$1.f2319d;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM23905G);
            SnapFlingBehavior$fling$result$1 snapFlingBehavior$fling$result$1 = new SnapFlingBehavior$fling$result$1(this, f, vi3Var, wn8Var, null);
            snapFlingBehavior$fling$1.f2316a = vi3Var;
            snapFlingBehavior$fling$1.f2319d = 1;
            objM23905G = wfb.m23905G(snapFlingBehavior$fling$result$1, this.f2346d, snapFlingBehavior$fling$1);
            if (objM23905G == coroutineSingletons) {
                return coroutineSingletons;
            }
            vi3Var2 = vi3Var;
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vi3Var2 = snapFlingBehavior$fling$1.f2316a;
            AbstractC3193b.m15359b(objM23905G);
        }
        C3764xm c3764xm = (C3764xm) objM23905G;
        vi3Var2.invoke(new Float(0.0f));
        return c3764xm;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m923d(wn8 wn8Var, float f, vi3 vi3Var, ContinuationImpl continuationImpl) throws Throwable {
        SnapFlingBehavior$performFling$1 snapFlingBehavior$performFling$1;
        if (continuationImpl instanceof SnapFlingBehavior$performFling$1) {
            snapFlingBehavior$performFling$1 = (SnapFlingBehavior$performFling$1) continuationImpl;
            int i = snapFlingBehavior$performFling$1.f2328c;
            if ((i & Integer.MIN_VALUE) != 0) {
                snapFlingBehavior$performFling$1.f2328c = i - Integer.MIN_VALUE;
            } else {
                snapFlingBehavior$performFling$1 = new SnapFlingBehavior$performFling$1(this, continuationImpl);
            }
        } else {
            snapFlingBehavior$performFling$1 = new SnapFlingBehavior$performFling$1(this, continuationImpl);
        }
        Object objM922c = snapFlingBehavior$performFling$1.f2326a;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = snapFlingBehavior$performFling$1.f2328c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM922c);
            snapFlingBehavior$performFling$1.f2328c = 1;
            objM922c = m922c(wn8Var, f, vi3Var, snapFlingBehavior$performFling$1);
            if (objM922c == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM922c);
        }
        C3764xm c3764xm = (C3764xm) objM922c;
        return new Float(c3764xm.f68339a.floatValue() != 0.0f ? ((Number) c3764xm.f68340b.m3884c()).floatValue() : 0.0f);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0112a)) {
            return false;
        }
        C0112a c0112a = (C0112a) obj;
        return fa4.m11650l(c0112a.f2345c, this.f2345c) && fa4.m11650l(c0112a.f2344b, this.f2344b) && c0112a.f2343a.equals(this.f2343a);
    }

    public final int hashCode() {
        return this.f2343a.hashCode() + ((this.f2344b.hashCode() + (this.f2345c.hashCode() * 31)) * 31);
    }
}
