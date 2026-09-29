package androidx.compose.p002ui.scrollcapture;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.l70;
import p000.ss5;
import p000.wq1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.ui.scrollcapture.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C0419c {

    /* JADX INFO: renamed from: a */
    public final int f4913a;

    /* JADX INFO: renamed from: b */
    public final zi3 f4914b;

    /* JADX INFO: renamed from: c */
    public float f4915c;

    public C0419c(int i, zi3 zi3Var) {
        this.f4913a = i;
        this.f4914b = zi3Var;
    }

    /* JADX INFO: renamed from: a */
    public final float m1832a() {
        return this.f4915c;
    }

    /* JADX INFO: renamed from: b */
    public final int m1833b(int i) {
        return l70.m15945h(i - ss5.m21693T(this.f4915c), 0, this.f4913a);
    }

    /* JADX INFO: renamed from: c */
    public final void m1834c() {
        this.f4915c = 0.0f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m1835d(float f, ContinuationImpl continuationImpl) throws Throwable {
        RelativeScroller$scrollBy$1 relativeScroller$scrollBy$1;
        if (continuationImpl instanceof RelativeScroller$scrollBy$1) {
            relativeScroller$scrollBy$1 = (RelativeScroller$scrollBy$1) continuationImpl;
            int i = relativeScroller$scrollBy$1.f4904c;
            if ((i & Integer.MIN_VALUE) != 0) {
                relativeScroller$scrollBy$1.f4904c = i - Integer.MIN_VALUE;
            } else {
                relativeScroller$scrollBy$1 = new RelativeScroller$scrollBy$1(this, continuationImpl);
            }
        } else {
            relativeScroller$scrollBy$1 = new RelativeScroller$scrollBy$1(this, continuationImpl);
        }
        Object objInvoke = relativeScroller$scrollBy$1.f4902a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = relativeScroller$scrollBy$1.f4904c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objInvoke);
            Float f2 = new Float(f);
            relativeScroller$scrollBy$1.f4904c = 1;
            objInvoke = ((ComposeScrollCaptureCallback$scrollTracker$1) this.f4914b).invoke(f2, relativeScroller$scrollBy$1);
            if (objInvoke == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objInvoke);
        }
        this.f4915c += ((Number) objInvoke).floatValue();
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: e */
    public final Object m1836e(int i, int i2, Continuation continuation) throws Throwable {
        if (i > i2) {
            C3386nv.m17624j(wq1.m24115k("Expected min=", i, i2, " ≤ max="));
            return null;
        }
        int i3 = i2 - i;
        int i4 = this.f4913a;
        if (i3 > i4) {
            C3386nv.m17624j(wq1.m24115k("Expected range (", i3, i4, ") to be ≤ viewportSize="));
            return null;
        }
        float f = i;
        float f2 = this.f4915c;
        xfa xfaVar = xfa.f68157a;
        if (f < f2 || i2 > i4 + f2) {
            Object objM1835d = m1835d((((i3 / 2) + i) - (i4 / 2)) - f2, (ContinuationImpl) continuation);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (objM1835d != coroutineSingletons) {
                objM1835d = xfaVar;
            }
            if (objM1835d == coroutineSingletons) {
                return objM1835d;
            }
        }
        return xfaVar;
    }
}
