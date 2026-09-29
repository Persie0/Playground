package com.lingq.feature.reader.old;

import com.lingq.core.analytics.data.LqAnalyticsValues$WordsPagingType;
import com.lingq.feature.reader.shared.p018ui.components.ReaderProgressBar;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.bh4;
import p000.c32;
import p000.lda;
import p000.mv7;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$4", m4291f = "ReaderFragment.kt", m4292l = {642}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderFragment$onViewCreated$5$4 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28374a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderFragment f28375b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$4$2 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$4$2", m4291f = "ReaderFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23092 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ int f28376a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReaderFragment f28377b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23092(ReaderFragment readerFragment, Continuation continuation) {
            super(2, continuation);
            this.f28377b = readerFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C23092 c23092 = new C23092(this.f28377b, continuation);
            c23092.f28376a = ((Number) obj).intValue();
            return c23092;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C23092 c23092 = (C23092) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c23092.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.f28376a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReaderFragment.f28218P0;
            ReaderFragment readerFragment = this.f28377b;
            ReaderProgressBar readerProgressBar = readerFragment.m9288U0().f66708n;
            readerProgressBar.f30415U = readerFragment.m9290W0().m9330j3() || readerFragment.m9287T0().f58118b.getBoolean("pagingDealWithWords", false);
            readerProgressBar.m9428l();
            readerFragment.m9288U0().f66708n.setCurrentPage(i);
            readerFragment.m9290W0().mo8747U1();
            if (i != readerFragment.m9288U0().f66709o.getCurrentItem()) {
                readerFragment.m9288U0().f66709o.m2892c(i, false);
            }
            if (((Boolean) readerFragment.m9290W0().f29325W.getValue()).booleanValue() && ((Number) readerFragment.m9290W0().f29322V.getValue()).intValue() > -1 && ((Number) readerFragment.m9290W0().f29322V.getValue()).intValue() == i - 1) {
                if (readerFragment.m9287T0().f58118b.getBoolean("pagingDealWithWords", false) && !readerFragment.m9290W0().m9330j3()) {
                    C2412n c2412nM9290W0 = readerFragment.m9290W0();
                    c2412nM9290W0.getClass();
                    wfb.m23926u(lda.m16103C(c2412nM9290W0), null, null, new ReaderViewModel$showPagingDealWithWords$1(c2412nM9290W0, null), 3);
                } else if (readerFragment.m9287T0().f58118b.getBoolean("pagingMoveToKnown", false) && readerFragment.m9290W0().m9330j3()) {
                    C2412n c2412nM9290W1 = readerFragment.m9290W0();
                    c2412nM9290W1.getClass();
                    wfb.m23926u(lda.m16103C(c2412nM9290W1), null, null, new ReaderViewModel$showMoveToKnownWarning$1(c2412nM9290W1, null), 3);
                } else if (readerFragment.m9290W0().m9330j3()) {
                    readerFragment.m9290W0().m9333m3(i, readerFragment.m9290W0().m9331k3() ? LqAnalyticsValues$WordsPagingType.Sentence.getValue() : LqAnalyticsValues$WordsPagingType.Page.getValue());
                }
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderFragment$onViewCreated$5$4(ReaderFragment readerFragment, Continuation continuation) {
        super(2, continuation);
        this.f28375b = readerFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderFragment$onViewCreated$5$4(this.f28375b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderFragment$onViewCreated$5$4) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28374a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReaderFragment.f28218P0;
            ReaderFragment readerFragment = this.f28375b;
            mv7 mv7Var = new mv7(readerFragment.m9290W0().f29319U, 8);
            C23092 c23092 = new C23092(readerFragment, null);
            this.f28374a = 1;
            if (AbstractC3224d.m15529h(mv7Var, c23092, this) == coroutineSingletons) {
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
