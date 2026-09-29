package com.lingq.feature.reader.old;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.b34;
import p000.bh4;
import p000.c32;
import p000.du0;
import p000.ec6;
import p000.fc6;
import p000.jfa;
import p000.tw7;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$36", m4291f = "ReaderFragment.kt", m4292l = {1595}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderFragment$onViewCreated$5$36 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28359a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderFragment f28360b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$36$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$36$1", m4291f = "ReaderFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23051 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ int f28361a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReaderFragment f28362b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23051(ReaderFragment readerFragment, Continuation continuation) {
            super(2, continuation);
            this.f28362b = readerFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C23051 c23051 = new C23051(this.f28362b, continuation);
            c23051.f28361a = ((Number) obj).intValue();
            return c23051;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C23051 c23051 = (C23051) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c23051.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.f28361a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReaderFragment.f28218P0;
            ReaderFragment readerFragment = this.f28362b;
            readerFragment.m9286S0();
            jfa.m14428k(b34.m3244j(readerFragment), ec6.m11026a(fc6.Companion, i, ((tw7) readerFragment.f28222F0.getValue()).f63014b, 0, null, 60), null);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderFragment$onViewCreated$5$36(ReaderFragment readerFragment, Continuation continuation) {
        super(2, continuation);
        this.f28360b = readerFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderFragment$onViewCreated$5$36(this.f28360b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderFragment$onViewCreated$5$36) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28359a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReaderFragment.f28218P0;
            ReaderFragment readerFragment = this.f28360b;
            du0 du0Var = readerFragment.m9290W0().f29331Y;
            C23051 c23051 = new C23051(readerFragment, null);
            this.f28359a = 1;
            if (AbstractC3224d.m15529h(du0Var, c23051, this) == coroutineSingletons) {
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
