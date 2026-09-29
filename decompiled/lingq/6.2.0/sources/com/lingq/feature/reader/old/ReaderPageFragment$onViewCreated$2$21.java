package com.lingq.feature.reader.old;

import com.lingq.core.p012ui.UpgradeReason;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.du0;
import p000.un1;
import p000.vx7;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$21", m4291f = "ReaderPageFragment.kt", m4292l = {705}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderPageFragment$onViewCreated$2$21 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28531a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderPageFragment f28532b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$21$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$21$1", m4291f = "ReaderPageFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23431 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ReaderPageFragment f28533a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23431(ReaderPageFragment readerPageFragment, Continuation continuation) {
            super(2, continuation);
            this.f28533a = readerPageFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C23431(this.f28533a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C23431 c23431 = (C23431) create((xfa) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c23431.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            vx7 vx7Var = ReaderPageFragment.Companion;
            this.f28533a.m9298W0().mo3737M1(UpgradeReason.LIMIT_WORDS);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderPageFragment$onViewCreated$2$21(ReaderPageFragment readerPageFragment, Continuation continuation) {
        super(2, continuation);
        this.f28532b = readerPageFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderPageFragment$onViewCreated$2$21(this.f28532b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderPageFragment$onViewCreated$2$21) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28531a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            vx7 vx7Var = ReaderPageFragment.Companion;
            ReaderPageFragment readerPageFragment = this.f28532b;
            du0 du0Var = readerPageFragment.m9299X0().f29238i0;
            C23431 c23431 = new C23431(readerPageFragment, null);
            this.f28531a = 1;
            if (AbstractC3224d.m15529h(du0Var, c23431, this) == coroutineSingletons) {
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
