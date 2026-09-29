package com.lingq.feature.reader.old;

import com.lingq.feature.reader.R$drawable;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.ada;
import p000.c32;
import p000.eh9;
import p000.jfa;
import p000.un1;
import p000.vx7;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$25", m4291f = "ReaderPageFragment.kt", m4292l = {1532}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderPageFragment$onViewCreated$2$25 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28548a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderPageFragment f28549b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$25$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$25$1", m4291f = "ReaderPageFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23471 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f28550a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReaderPageFragment f28551b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23471(ReaderPageFragment readerPageFragment, Continuation continuation) {
            super(2, continuation);
            this.f28551b = readerPageFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C23471 c23471 = new C23471(this.f28551b, continuation);
            c23471.f28550a = obj;
            return c23471;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C23471 c23471 = (C23471) create((ada) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c23471.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            ada adaVar = (ada) this.f28550a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            vx7 vx7Var = ReaderPageFragment.Companion;
            ReaderPageFragment readerPageFragment = this.f28551b;
            jfa.m14425h(readerPageFragment.m9297V0().f69714e);
            if (adaVar.f524c) {
                boolean z = adaVar.f523b;
                if (z) {
                    readerPageFragment.m9297V0().f69716g.setImageResource(R$drawable.ic_sentence_stop);
                } else if (z || !adaVar.f525d) {
                    readerPageFragment.m9297V0().f69716g.setImageResource(R$drawable.ic_sentence_play);
                } else {
                    readerPageFragment.m9297V0().f69714e.m6163e();
                }
            } else {
                readerPageFragment.m9297V0().f69716g.setImageResource(R$drawable.ic_sentence_play);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderPageFragment$onViewCreated$2$25(ReaderPageFragment readerPageFragment, Continuation continuation) {
        super(2, continuation);
        this.f28549b = readerPageFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderPageFragment$onViewCreated$2$25(this.f28549b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderPageFragment$onViewCreated$2$25) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28548a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            vx7 vx7Var = ReaderPageFragment.Companion;
            ReaderPageFragment readerPageFragment = this.f28549b;
            eh9 eh9VarMo8494u = readerPageFragment.m9299X0().f29235h.mo8494u();
            C23471 c23471 = new C23471(readerPageFragment, null);
            eh9VarMo8494u.getClass();
            this.f28548a = 1;
            if (AbstractC3224d.m15529h(eh9VarMo8494u, c23471, this) == coroutineSingletons) {
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
