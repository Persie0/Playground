package com.lingq.feature.onboarding.p014v2;

import com.lingq.core.common.util.AbstractC1263a;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p000.lda;
import p000.vi3;
import p000.wfb;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class OnboardingV2ScreenKt$OnboardingV2Route$callbacks$2$1 extends FunctionReferenceImpl implements vi3 {
    @Override // p000.vi3
    public final Object invoke(Object obj) {
        String str = (String) obj;
        str.getClass();
        C2216d c2216d = (C2216d) this.f47704b;
        c2216d.getClass();
        AbstractC1263a.m7046a(c2216d.f27371I);
        c2216d.f27371I = wfb.m23926u(lda.m16103C(c2216d), null, null, new OnboardingV2ViewModel$validateUsername$1(c2216d, str, null), 3);
        return xfa.f68157a;
    }
}
