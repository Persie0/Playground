package androidx.compose.material3;

import androidx.compose.animation.core.C0059a;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.InterfaceC0025an;
import p000.c32;
import p000.ms5;
import p000.ps5;
import p000.ss5;
import p000.thb;
import p000.un1;
import p000.xfa;
import p000.xj2;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.compose.material3.IndicatorLineNode$invalidateIndicator$2", m4291f = "TextField.kt", m4292l = {1651}, m4293m = "invokeSuspend", m4294v = 1)
final class IndicatorLineNode$invalidateIndicator$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f3202a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0261r f3203b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndicatorLineNode$invalidateIndicator$2(C0261r c0261r, Continuation continuation) {
        super(2, continuation);
        this.f3203b = c0261r;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new IndicatorLineNode$invalidateIndicator$2(this.f3203b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((IndicatorLineNode$invalidateIndicator$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f3202a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C0261r c0261r = this.f3203b;
            C0059a c0059a = c0261r.f3625V;
            xj2 xj2Var = new xj2((c0261r.f3620Q && c0261r.f3615L) ? c0261r.f3618O : c0261r.f3619P);
            InterfaceC0025an interfaceC0025anM21726x = c0261r.f3615L ? ss5.m21726x(((ms5) thb.m22050i(c0261r, ps5.f56764b)).f51802d, MotionSchemeKeyTokens.FastSpatial) : ss5.m21697X();
            this.f3202a = 1;
            if (C0059a.m744c(c0059a, xj2Var, interfaceC0025anM21726x, null, this, 12) == coroutineSingletons) {
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
