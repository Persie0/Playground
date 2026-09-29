package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.snapping.C0112a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.kv4;
import p000.n27;
import p000.wfb;
import p000.wn8;
import p000.x63;
import p000.xc9;

/* JADX INFO: renamed from: androidx.compose.foundation.pager.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0151e implements x63 {

    /* JADX INFO: renamed from: a */
    public final C0112a f2697a;

    /* JADX INFO: renamed from: b */
    public final AbstractC0150d f2698b;

    public C0151e(C0112a c0112a, AbstractC0150d abstractC0150d) {
        this.f2697a = c0112a;
        this.f2698b = abstractC0150d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p000.x63
    /* JADX INFO: renamed from: a */
    public final Object mo862a(wn8 wn8Var, float f, Continuation continuation) throws Throwable {
        PagerWrapperFlingBehavior$performFling$1 pagerWrapperFlingBehavior$performFling$1;
        if (continuation instanceof PagerWrapperFlingBehavior$performFling$1) {
            pagerWrapperFlingBehavior$performFling$1 = (PagerWrapperFlingBehavior$performFling$1) continuation;
            int i = pagerWrapperFlingBehavior$performFling$1.f2659c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pagerWrapperFlingBehavior$performFling$1.f2659c = i - Integer.MIN_VALUE;
            } else {
                pagerWrapperFlingBehavior$performFling$1 = new PagerWrapperFlingBehavior$performFling$1(this, (ContinuationImpl) continuation);
            }
        } else {
            pagerWrapperFlingBehavior$performFling$1 = new PagerWrapperFlingBehavior$performFling$1(this, (ContinuationImpl) continuation);
        }
        Object objM923d = pagerWrapperFlingBehavior$performFling$1.f2657a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = pagerWrapperFlingBehavior$performFling$1.f2659c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM923d);
            kv4 kv4Var = new kv4(this, wn8Var);
            pagerWrapperFlingBehavior$performFling$1.f2659c = 1;
            objM923d = this.f2697a.m923d(wn8Var, f, kv4Var, pagerWrapperFlingBehavior$performFling$1);
            if (objM923d == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM923d);
        }
        float fFloatValue = ((Number) objM923d).floatValue();
        AbstractC0150d abstractC0150d = this.f2698b;
        if (abstractC0150d.m1037l() != 0.0f && Math.abs(abstractC0150d.m1037l()) < 0.001d) {
            int iM1036k = abstractC0150d.m1036k();
            if (abstractC0150d.f2681k.mo863a()) {
                wfb.m23926u(((n27) ((xc9) abstractC0150d.f2683m).getValue()).f52238t, null, null, new PagerState$requestScrollToPage$1(abstractC0150d, null), 3);
            }
            abstractC0150d.m1045v(0.0f, iM1036k, false);
        } else {
            new Float(abstractC0150d.m1037l());
        }
        return new Float(fFloatValue);
    }
}
