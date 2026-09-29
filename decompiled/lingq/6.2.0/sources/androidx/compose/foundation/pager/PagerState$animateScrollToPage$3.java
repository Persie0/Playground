package androidx.compose.foundation.pager;

import androidx.compose.animation.core.AbstractC0063e;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import p000.C3386nv;
import p000.C3794yf;
import p000.InterfaceC0025an;
import p000.c32;
import p000.ht6;
import p000.jv4;
import p000.u27;
import p000.v27;
import p000.wn8;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.pager.PagerState$animateScrollToPage$3", m4291f = "PagerState.kt", m4292l = {672}, m4293m = "invokeSuspend", m4294v = 1)
final class PagerState$animateScrollToPage$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f2640a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f2641b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC0150d f2642c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2643d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ float f2644e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC0025an f2645f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerState$animateScrollToPage$3(AbstractC0150d abstractC0150d, int i, float f, InterfaceC0025an interfaceC0025an, Continuation continuation) {
        super(2, continuation);
        this.f2642c = abstractC0150d;
        this.f2643d = i;
        this.f2644e = f;
        this.f2645f = interfaceC0025an;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PagerState$animateScrollToPage$3 pagerState$animateScrollToPage$3 = new PagerState$animateScrollToPage$3(this.f2642c, this.f2643d, this.f2644e, this.f2645f, continuation);
        pagerState$animateScrollToPage$3.f2641b = obj;
        return pagerState$animateScrollToPage$3;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((PagerState$animateScrollToPage$3) create((wn8) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f2640a;
        xfa xfaVar = xfa.f68157a;
        int i3 = 1;
        if (i2 != 0) {
            if (i2 == 1) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        wn8 wn8Var = (wn8) this.f2641b;
        AbstractC0150d abstractC0150d = this.f2642c;
        jv4 jv4Var = new jv4(wn8Var, abstractC0150d, i3);
        ht6 ht6Var = new ht6(abstractC0150d, 7);
        this.f2640a = 1;
        u27 u27Var = v27.f64740a;
        int i4 = this.f2643d;
        ht6Var.invoke(jv4Var, new Integer(i4));
        boolean z = i4 > abstractC0150d.f2675e;
        int iM14687e = (jv4Var.m14687e() - abstractC0150d.f2675e) + 1;
        if (((z && i4 > jv4Var.m14687e()) || (!z && i4 < abstractC0150d.f2675e)) && Math.abs(i4 - abstractC0150d.f2675e) >= 3) {
            if (z) {
                i = i4 - iM14687e;
                int i5 = abstractC0150d.f2675e;
                if (i < i5) {
                    i = i5;
                }
            } else {
                int i6 = iM14687e + i4;
                i = abstractC0150d.f2675e;
                if (i6 <= i) {
                    i = i6;
                }
            }
            jv4Var.m14688f(i, 0);
        }
        Object objM756c = AbstractC0063e.m756c(jv4Var.m14684b(i4) + this.f2644e, this.f2645f, new C3794yf(new Ref$FloatRef(), jv4Var, 17), this, 4);
        if (objM756c != coroutineSingletons) {
            objM756c = xfaVar;
        }
        return objM756c == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
