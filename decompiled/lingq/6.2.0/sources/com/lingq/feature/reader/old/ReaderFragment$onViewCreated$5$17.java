package com.lingq.feature.reader.old;

import com.lingq.core.domain.model.onboarding.TooltipStep;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.bh4;
import p000.c32;
import p000.c83;
import p000.ded;
import p000.lda;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$17", m4291f = "ReaderFragment.kt", m4292l = {1012}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderFragment$onViewCreated$5$17 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28281a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderFragment f28282b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$17$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$17$1", m4291f = "ReaderFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C22841 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ReaderFragment f28283a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22841(ReaderFragment readerFragment, Continuation continuation) {
            super(2, continuation);
            this.f28283a = readerFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C22841(this.f28283a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C22841 c22841 = (C22841) create((xfa) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c22841.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            ReaderFragment readerFragment = this.f28283a;
            ded.m10315a(readerFragment.m2106h(), !readerFragment.m9292Y0());
            C2412n c2412nM9290W0 = readerFragment.m9290W0();
            TooltipStep tooltipStep = TooltipStep.DoYouKnowThisWord;
            if (c2412nM9290W0.mo8753Z0(tooltipStep)) {
                C2412n c2412nM9290W1 = readerFragment.m9290W0();
                c2412nM9290W1.getClass();
                c2412nM9290W1.f29376k.mo8742L(tooltipStep);
            }
            C2412n c2412nM9290W2 = readerFragment.m9290W0();
            c2412nM9290W2.getClass();
            wfb.m23926u(lda.m16103C(c2412nM9290W2), null, null, new ReaderViewModel$checkForTooltipsTouchIndicators$1(c2412nM9290W2, null), 3);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderFragment$onViewCreated$5$17(ReaderFragment readerFragment, Continuation continuation) {
        super(2, continuation);
        this.f28282b = readerFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderFragment$onViewCreated$5$17(this.f28282b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderFragment$onViewCreated$5$17) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28281a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReaderFragment.f28218P0;
            ReaderFragment readerFragment = this.f28282b;
            c83 c83VarMo8734A2 = readerFragment.m9290W0().f29344c.mo8734A2();
            C22841 c22841 = new C22841(readerFragment, null);
            this.f28281a = 1;
            if (AbstractC3224d.m15529h(c83VarMo8734A2, c22841, this) == coroutineSingletons) {
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
