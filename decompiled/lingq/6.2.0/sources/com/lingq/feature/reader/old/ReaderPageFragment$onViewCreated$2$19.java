package com.lingq.feature.reader.old;

import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c18;
import p000.c32;
import p000.lda;
import p000.un1;
import p000.vx7;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$19", m4291f = "ReaderPageFragment.kt", m4292l = {1532}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderPageFragment$onViewCreated$2$19 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28516a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderPageFragment f28517b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$19$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$19$1", m4291f = "ReaderPageFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23391 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f28518a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReaderPageFragment f28519b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23391(ReaderPageFragment readerPageFragment, Continuation continuation) {
            super(2, continuation);
            this.f28519b = readerPageFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C23391 c23391 = new C23391(this.f28519b, continuation);
            c23391.f28518a = obj;
            return c23391;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C23391 c23391 = (C23391) create((List) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c23391.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list = (List) this.f28518a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            vx7 vx7Var = ReaderPageFragment.Companion;
            C2411m c2411mM9299X0 = this.f28519b.m9299X0();
            c2411mM9299X0.getClass();
            list.getClass();
            wfb.m23926u(lda.m16103C(c2411mM9299X0), null, null, new ReaderPageViewModel$setupSentencesUrls$1(c2411mM9299X0, list, null), 3);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderPageFragment$onViewCreated$2$19(ReaderPageFragment readerPageFragment, Continuation continuation) {
        super(2, continuation);
        this.f28517b = readerPageFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderPageFragment$onViewCreated$2$19(this.f28517b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderPageFragment$onViewCreated$2$19) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28516a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            vx7 vx7Var = ReaderPageFragment.Companion;
            ReaderPageFragment readerPageFragment = this.f28517b;
            c18 c18Var = readerPageFragment.m9298W0().f29260A0;
            C23391 c23391 = new C23391(readerPageFragment, null);
            c18Var.getClass();
            this.f28516a = 1;
            if (AbstractC3224d.m15529h(c18Var, c23391, this) == coroutineSingletons) {
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
