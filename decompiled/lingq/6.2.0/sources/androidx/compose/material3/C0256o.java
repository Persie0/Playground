package androidx.compose.material3;

import androidx.compose.animation.core.C0059a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.ap2;
import p000.lj7;
import p000.pk9;
import p000.q84;
import p000.q93;
import p000.rv3;
import p000.xc9;
import p000.xfa;
import p000.xj2;

/* JADX INFO: renamed from: androidx.compose.material3.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0256o {

    /* JADX INFO: renamed from: a */
    public float f3561a;

    /* JADX INFO: renamed from: b */
    public float f3562b;

    /* JADX INFO: renamed from: c */
    public float f3563c;

    /* JADX INFO: renamed from: d */
    public float f3564d;

    /* JADX INFO: renamed from: e */
    public final C0059a f3565e;

    /* JADX INFO: renamed from: f */
    public q84 f3566f;

    /* JADX INFO: renamed from: g */
    public q84 f3567g;

    public C0256o(float f, float f2, float f3, float f4) {
        this.f3561a = f;
        this.f3562b = f2;
        this.f3563c = f3;
        this.f3564d = f4;
        this.f3565e = new C0059a(new xj2(f), pk9.f56365j, null, 12);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, xfa] */
    /* JADX INFO: renamed from: a */
    public final Object m1184a(q84 q84Var, ContinuationImpl continuationImpl) throws Throwable {
        FloatingActionButtonElevationAnimatable$animateElevation$1 floatingActionButtonElevationAnimatable$animateElevation$1;
        float f;
        C0059a c0059a = this.f3565e;
        if (continuationImpl instanceof FloatingActionButtonElevationAnimatable$animateElevation$1) {
            floatingActionButtonElevationAnimatable$animateElevation$1 = (FloatingActionButtonElevationAnimatable$animateElevation$1) continuationImpl;
            int i = floatingActionButtonElevationAnimatable$animateElevation$1.f3196d;
            if ((i & Integer.MIN_VALUE) != 0) {
                floatingActionButtonElevationAnimatable$animateElevation$1.f3196d = i - Integer.MIN_VALUE;
            } else {
                floatingActionButtonElevationAnimatable$animateElevation$1 = new FloatingActionButtonElevationAnimatable$animateElevation$1(this, continuationImpl);
            }
        } else {
            floatingActionButtonElevationAnimatable$animateElevation$1 = new FloatingActionButtonElevationAnimatable$animateElevation$1(this, continuationImpl);
        }
        Object obj = floatingActionButtonElevationAnimatable$animateElevation$1.f3194b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = floatingActionButtonElevationAnimatable$animateElevation$1.f3196d;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                if (q84Var instanceof lj7) {
                    f = this.f3562b;
                } else if (q84Var instanceof rv3) {
                    f = this.f3563c;
                } else {
                    f = q84Var instanceof q93 ? this.f3564d : this.f3561a;
                }
                this.f3567g = q84Var;
                if (!xj2.m24560b(((xj2) ((xc9) c0059a.f1542e).getValue()).f68285a, f)) {
                    q84 q84Var2 = this.f3566f;
                    floatingActionButtonElevationAnimatable$animateElevation$1.f3193a = q84Var;
                    floatingActionButtonElevationAnimatable$animateElevation$1.f3196d = 1;
                    if (ap2.m2965a(c0059a, f, q84Var2, q84Var, floatingActionButtonElevationAnimatable$animateElevation$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                if (i2 != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                q84Var = floatingActionButtonElevationAnimatable$animateElevation$1.f3193a;
                AbstractC3193b.m15359b(obj);
            }
            this.f3566f = q84Var;
            this = xfa.f68157a;
            return this;
        } catch (Throwable th) {
            this.f3566f = q84Var;
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m1185b(ContinuationImpl continuationImpl) throws Throwable {
        FloatingActionButtonElevationAnimatable$snapElevation$1 floatingActionButtonElevationAnimatable$snapElevation$1;
        float f;
        if (continuationImpl instanceof FloatingActionButtonElevationAnimatable$snapElevation$1) {
            floatingActionButtonElevationAnimatable$snapElevation$1 = (FloatingActionButtonElevationAnimatable$snapElevation$1) continuationImpl;
            int i = floatingActionButtonElevationAnimatable$snapElevation$1.f3199c;
            if ((i & Integer.MIN_VALUE) != 0) {
                floatingActionButtonElevationAnimatable$snapElevation$1.f3199c = i - Integer.MIN_VALUE;
            } else {
                floatingActionButtonElevationAnimatable$snapElevation$1 = new FloatingActionButtonElevationAnimatable$snapElevation$1(this, continuationImpl);
            }
        } else {
            floatingActionButtonElevationAnimatable$snapElevation$1 = new FloatingActionButtonElevationAnimatable$snapElevation$1(this, continuationImpl);
        }
        Object obj = floatingActionButtonElevationAnimatable$snapElevation$1.f3197a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = floatingActionButtonElevationAnimatable$snapElevation$1.f3199c;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                q84 q84Var = this.f3567g;
                if (q84Var instanceof lj7) {
                    f = this.f3562b;
                } else if (q84Var instanceof rv3) {
                    f = this.f3563c;
                } else {
                    f = q84Var instanceof q93 ? this.f3564d : this.f3561a;
                }
                C0059a c0059a = this.f3565e;
                if (!xj2.m24560b(((xj2) ((xc9) c0059a.f1542e).getValue()).f68285a, f)) {
                    xj2 xj2Var = new xj2(f);
                    floatingActionButtonElevationAnimatable$snapElevation$1.f3199c = 1;
                    if (c0059a.m747f(xj2Var, floatingActionButtonElevationAnimatable$snapElevation$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return xfa.f68157a;
            }
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            this.f3566f = this.f3567g;
            return xfa.f68157a;
        } catch (Throwable th) {
            this.f3566f = this.f3567g;
            throw th;
        }
    }
}
