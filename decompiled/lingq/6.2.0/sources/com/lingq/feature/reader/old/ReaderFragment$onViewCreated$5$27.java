package com.lingq.feature.reader.old;

import com.lingq.feature.reader.shared.p018ui.components.ReaderProgressBar;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.bh4;
import p000.c18;
import p000.c32;
import p000.lda;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$27", m4291f = "ReaderFragment.kt", m4292l = {2110}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderFragment$onViewCreated$5$27 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28323a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderFragment f28324b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$27$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$27$1", m4291f = "ReaderFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C22951 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ boolean f28325a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReaderFragment f28326b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22951(ReaderFragment readerFragment, Continuation continuation) {
            super(2, continuation);
            this.f28326b = readerFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C22951 c22951 = new C22951(this.f28326b, continuation);
            c22951.f28325a = ((Boolean) obj).booleanValue();
            return c22951;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            C22951 c22951 = (C22951) create(bool, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c22951.invokeSuspend(xfaVar);
            return xfaVar;
        }

        /* JADX WARN: Code duplicated, block: B:6:0x0022  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            boolean z;
            boolean z2 = this.f28325a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReaderFragment.f28218P0;
            ReaderFragment readerFragment = this.f28326b;
            ReaderProgressBar readerProgressBar = readerFragment.m9288U0().f66708n;
            if (!z2) {
                z = readerFragment.m9287T0().f58118b.getBoolean("pagingDealWithWords", false);
            }
            readerProgressBar.f30415U = z;
            readerProgressBar.m9428l();
            C2412n c2412nM9290W0 = readerFragment.m9290W0();
            c2412nM9290W0.getClass();
            wfb.m23926u(lda.m16103C(c2412nM9290W0), null, null, new ReaderViewModel$checkCompletedPagesAndForcePage$1(c2412nM9290W0, null), 3);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderFragment$onViewCreated$5$27(ReaderFragment readerFragment, Continuation continuation) {
        super(2, continuation);
        this.f28324b = readerFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderFragment$onViewCreated$5$27(this.f28324b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderFragment$onViewCreated$5$27) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28323a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReaderFragment.f28218P0;
            ReaderFragment readerFragment = this.f28324b;
            c18 c18Var = readerFragment.m9290W0().f29353e0;
            C22951 c22951 = new C22951(readerFragment, null);
            c18Var.getClass();
            this.f28323a = 1;
            if (AbstractC3224d.m15529h(c18Var, c22951, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        C3386nv.m17633t("SharedFlow never completes, this call should never return.");
        return null;
    }
}
