package com.lingq.feature.reader.old;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import p000.C3386nv;
import p000.c32;
import p000.lda;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$showTooltipsIndicators$1", m4291f = "ReaderViewModel.kt", m4292l = {2333}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$showTooltipsIndicators$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f29080a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2412n f29081b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$showTooltipsIndicators$1(C2412n c2412n, Continuation continuation) {
        super(2, continuation);
        this.f29081b = c2412n;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderViewModel$showTooltipsIndicators$1(this.f29081b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderViewModel$showTooltipsIndicators$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29080a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f29080a = 1;
            if (AbstractC3208a.m15437d(1000L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        C2412n c2412n = this.f29081b;
        wfb.m23926u(lda.m16103C(c2412n), null, null, new ReaderViewModel$checkForTooltipsTouchIndicators$1(c2412n, null), 3);
        return xfa.f68157a;
    }
}
