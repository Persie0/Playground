package androidx.compose.foundation.gestures;

import androidx.compose.foundation.C0145m;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.AbstractC0278f;
import kotlin.AbstractC3193b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.C3248a;
import p000.C0018ag;
import p000.C0809bg;
import p000.C2951e4;
import p000.C3386nv;
import p000.C3539rk;
import p000.InterfaceC0025an;
import p000.a62;
import p000.ae1;
import p000.aj3;
import p000.bj3;
import p000.f32;
import p000.fa4;
import p000.gc2;
import p000.l54;
import p000.l70;
import p000.qc9;
import p000.t66;
import p000.tr3;
import p000.vi3;
import p000.xc9;
import p000.xfa;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0097e {

    /* JADX INFO: renamed from: a */
    public final vi3 f2232a;

    /* JADX INFO: renamed from: b */
    public ae1 f2233b;

    /* JADX INFO: renamed from: c */
    public C3539rk f2234c;

    /* JADX INFO: renamed from: d */
    public InterfaceC0025an f2235d;

    /* JADX INFO: renamed from: e */
    public f32 f2236e;

    /* JADX INFO: renamed from: g */
    public final t66 f2238g;

    /* JADX INFO: renamed from: h */
    public final t66 f2239h;

    /* JADX INFO: renamed from: k */
    public final qc9 f2242k;

    /* JADX INFO: renamed from: l */
    public final t66 f2243l;

    /* JADX INFO: renamed from: m */
    public final t66 f2244m;

    /* JADX INFO: renamed from: n */
    public final C0809bg f2245n;

    /* JADX INFO: renamed from: f */
    public final C0145m f2237f = new C0145m();

    /* JADX INFO: renamed from: i */
    public final gc2 f2240i = AbstractC0278f.m1254d(new C0018ag(this, 0));

    /* JADX INFO: renamed from: j */
    public final qc9 f2241j = AbstractC0278f.m1256f(Float.NaN);

    public C0097e(Enum r4, vi3 vi3Var) {
        this.f2232a = new C2951e4(5);
        this.f2238g = AbstractC0278f.m1260j(r4);
        this.f2239h = AbstractC0278f.m1260j(r4);
        AbstractC0278f.m1255e(new C0018ag(this, 1), tr3.f62761g);
        this.f2242k = AbstractC0278f.m1256f(0.0f);
        this.f2243l = AbstractC0278f.m1260j(null);
        this.f2244m = AbstractC0278f.m1260j(new a62(EmptyList.f47638a, new float[0]));
        this.f2245n = new C0809bg(this);
        this.f2232a = vi3Var;
    }

    /* JADX INFO: renamed from: b */
    public static Object m847b(C0097e c0097e, aj3 aj3Var, ContinuationImpl continuationImpl) {
        Object objM1026b = c0097e.f2237f.m1026b(MutatePriority.Default, new AnchoredDraggableState$anchoredDrag$2(aj3Var, c0097e, null), continuationImpl);
        return objM1026b == CoroutineSingletons.COROUTINE_SUSPENDED ? objM1026b : xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m848a(Object obj, MutatePriority mutatePriority, bj3 bj3Var, ContinuationImpl continuationImpl) throws Throwable {
        AnchoredDraggableState$anchoredDrag$3 anchoredDraggableState$anchoredDrag$3;
        if (continuationImpl instanceof AnchoredDraggableState$anchoredDrag$3) {
            anchoredDraggableState$anchoredDrag$3 = (AnchoredDraggableState$anchoredDrag$3) continuationImpl;
            int i = anchoredDraggableState$anchoredDrag$3.f1832c;
            if ((i & Integer.MIN_VALUE) != 0) {
                anchoredDraggableState$anchoredDrag$3.f1832c = i - Integer.MIN_VALUE;
            } else {
                anchoredDraggableState$anchoredDrag$3 = new AnchoredDraggableState$anchoredDrag$3(this, continuationImpl);
            }
        } else {
            anchoredDraggableState$anchoredDrag$3 = new AnchoredDraggableState$anchoredDrag$3(this, continuationImpl);
        }
        Object obj2 = anchoredDraggableState$anchoredDrag$3.f1830a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = anchoredDraggableState$anchoredDrag$3.f1832c;
        t66 t66Var = this.f2243l;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj2);
                if (m849c().m130c(obj)) {
                    C0145m c0145m = this.f2237f;
                    AnchoredDraggableState$anchoredDrag$4 anchoredDraggableState$anchoredDrag$4 = new AnchoredDraggableState$anchoredDrag$4(this, obj, bj3Var, null);
                    anchoredDraggableState$anchoredDrag$3.f1832c = 1;
                    if (c0145m.m1026b(mutatePriority, anchoredDraggableState$anchoredDrag$4, anchoredDraggableState$anchoredDrag$3) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else if (((Boolean) this.f2232a.invoke(obj)).booleanValue()) {
                    ((xc9) this.f2239h).setValue(obj);
                    m853g(obj);
                }
                return xfa.f68157a;
            }
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj2);
            t66Var = (xc9) t66Var;
            t66Var.setValue(null);
            return xfa.f68157a;
        } catch (Throwable th) {
            ((xc9) t66Var).setValue(null);
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final a62 m849c() {
        return (a62) ((xc9) this.f2244m).getValue();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m850d() {
        return (this.f2233b == null || this.f2234c == null || this.f2235d == null || this.f2236e == null) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public final float m851e(float f) {
        qc9 qc9Var = this.f2241j;
        return l70.m15944g((Float.isNaN(qc9Var.m19861h()) ? 0.0f : qc9Var.m19861h()) + f, m849c().m132e(), m849c().m131d());
    }

    /* JADX INFO: renamed from: f */
    public final float m852f() {
        qc9 qc9Var = this.f2241j;
        if (Float.isNaN(qc9Var.m19861h())) {
            l54.m15816c("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return qc9Var.m19861h();
    }

    /* JADX INFO: renamed from: g */
    public final void m853g(Object obj) {
        ((xc9) this.f2238g).setValue(obj);
    }

    /* JADX INFO: renamed from: h */
    public final void m854h(a62 a62Var, Object obj) {
        if (fa4.m11650l(m849c(), a62Var)) {
            return;
        }
        ((xc9) this.f2244m).setValue(a62Var);
        C0145m c0145m = this.f2237f;
        C3248a c3248a = c0145m.f2622b;
        C3248a c3248a2 = c0145m.f2622b;
        boolean zMo4386a = c3248a.mo4386a(null);
        t66 t66Var = this.f2243l;
        if (zMo4386a) {
            try {
                C0809bg c0809bg = this.f2245n;
                float fM133f = m849c().m133f(obj);
                if (!Float.isNaN(fM133f)) {
                    c0809bg.m3692a(fM133f, 0.0f);
                    ((xc9) t66Var).setValue(null);
                }
                m853g(obj);
                ((xc9) this.f2239h).setValue(obj);
                c3248a2.mo4387b(null);
            } catch (Throwable th) {
                c3248a2.mo4387b(null);
                throw th;
            }
        }
        if (zMo4386a) {
            return;
        }
        ((xc9) t66Var).setValue(obj);
    }
}
