package com.lingq.feature.reader.old;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.bh4;
import p000.c32;
import p000.du0;
import p000.go3;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$28", m4291f = "ReaderFragment.kt", m4292l = {1217}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderFragment$onViewCreated$5$28 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28327a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderFragment f28328b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$28$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$28$1", m4291f = "ReaderFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C22961 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f28329a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReaderFragment f28330b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22961(ReaderFragment readerFragment, Continuation continuation) {
            super(2, continuation);
            this.f28330b = readerFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C22961 c22961 = new C22961(this.f28330b, continuation);
            c22961.f28329a = obj;
            return c22961;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C22961 c22961 = (C22961) create((go3) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c22961.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            go3 go3Var = (go3) this.f28329a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            ReaderFragment readerFragment = this.f28330b;
            readerFragment.m2092T().postDelayed(new RunnableC2402d(readerFragment, go3Var), 500L);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderFragment$onViewCreated$5$28(ReaderFragment readerFragment, Continuation continuation) {
        super(2, continuation);
        this.f28328b = readerFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderFragment$onViewCreated$5$28(this.f28328b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderFragment$onViewCreated$5$28) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28327a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReaderFragment.f28218P0;
            ReaderFragment readerFragment = this.f28328b;
            du0 du0VarM15519A = AbstractC3224d.m15519A(readerFragment.m9290W0().f29386m1);
            C22961 c22961 = new C22961(readerFragment, null);
            this.f28327a = 1;
            if (AbstractC3224d.m15529h(du0VarM15519A, c22961, this) == coroutineSingletons) {
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
