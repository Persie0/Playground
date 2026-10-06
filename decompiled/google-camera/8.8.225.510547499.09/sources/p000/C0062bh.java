package p000;

import android.transition.Transition;

/* JADX INFO: renamed from: bh */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0062bh extends C0061bg {

    /* JADX INFO: renamed from: c */
    public final Object f3226c;

    /* JADX INFO: renamed from: d */
    public final boolean f3227d;

    /* JADX INFO: renamed from: e */
    public final Object f3228e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0062bh(C0133dl c0133dl, exz exzVar, boolean z, boolean z2, byte[] bArr) {
        Object exitTransition;
        Object enterTransition;
        Boolean bool;
        Boolean bool2;
        super(c0133dl, exzVar, null);
        Object sharedElementEnterTransition = null;
        boolean zBooleanValue = true;
        if (c0133dl.f11919e == 2) {
            if (z) {
                ComponentCallbacksC0077bw componentCallbacksC0077bw = c0133dl.f11915a;
                C0073bs c0073bs = componentCallbacksC0077bw.f4589Q;
                if (c0073bs == null) {
                    enterTransition = null;
                } else {
                    enterTransition = c0073bs.f4266l;
                    if (enterTransition == ComponentCallbacksC0077bw.f4572e) {
                        enterTransition = componentCallbacksC0077bw.getExitTransition();
                    }
                }
            } else {
                enterTransition = c0133dl.f11915a.getEnterTransition();
            }
            this.f3226c = enterTransition;
            if (z) {
                C0073bs c0073bs2 = c0133dl.f11915a.f4589Q;
                if (c0073bs2 != null && (bool2 = c0073bs2.f4269o) != null) {
                    zBooleanValue = bool2.booleanValue();
                }
            } else {
                C0073bs c0073bs3 = c0133dl.f11915a.f4589Q;
                if (c0073bs3 != null && (bool = c0073bs3.f4270p) != null) {
                    zBooleanValue = bool.booleanValue();
                }
            }
            this.f3227d = zBooleanValue;
        } else {
            if (z) {
                ComponentCallbacksC0077bw componentCallbacksC0077bw2 = c0133dl.f11915a;
                C0073bs c0073bs4 = componentCallbacksC0077bw2.f4589Q;
                if (c0073bs4 == null) {
                    exitTransition = null;
                } else {
                    exitTransition = c0073bs4.f4264j;
                    if (exitTransition == ComponentCallbacksC0077bw.f4572e) {
                        exitTransition = componentCallbacksC0077bw2.getEnterTransition();
                    }
                }
            } else {
                exitTransition = c0133dl.f11915a.getExitTransition();
            }
            this.f3226c = exitTransition;
            this.f3227d = true;
        }
        if (!z2) {
            this.f3228e = null;
            return;
        }
        if (!z) {
            this.f3228e = c0133dl.f11915a.getSharedElementEnterTransition();
            return;
        }
        ComponentCallbacksC0077bw componentCallbacksC0077bw3 = c0133dl.f11915a;
        C0073bs c0073bs5 = componentCallbacksC0077bw3.f4589Q;
        if (c0073bs5 != null && (sharedElementEnterTransition = c0073bs5.f4268n) == ComponentCallbacksC0077bw.f4572e) {
            sharedElementEnterTransition = componentCallbacksC0077bw3.getSharedElementEnterTransition();
        }
        this.f3228e = sharedElementEnterTransition;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC0127df m2455a(Object obj) {
        if (obj == null) {
            return null;
        }
        int i = C0119cy.f10021c;
        if (obj instanceof Transition) {
            return C0119cy.f10019a;
        }
        AbstractC0127df abstractC0127df = C0119cy.f10020b;
        if (abstractC0127df != null && abstractC0127df.mo1922m(obj)) {
            return C0119cy.f10020b;
        }
        throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.f3152a.f11915a + " is not a valid framework Transition or AndroidX Transition");
    }
}
