package com.lingq.feature.reader.old;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.bh4;
import p000.c18;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$1", m4291f = "ReaderFragment.kt", m4292l = {2110}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderFragment$onViewCreated$5$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28253a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderFragment f28254b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$1$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$1$1", m4291f = "ReaderFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C22761 extends SuspendLambda implements zi3 {
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C22761(2, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            C22761 c22761 = (C22761) create(bool, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c22761.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderFragment$onViewCreated$5$1(ReaderFragment readerFragment, Continuation continuation) {
        super(2, continuation);
        this.f28254b = readerFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderFragment$onViewCreated$5$1(this.f28254b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderFragment$onViewCreated$5$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28253a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReaderFragment.f28218P0;
            c18 c18Var = this.f28254b.m9290W0().f29353e0;
            C22761 c22761 = new C22761(2, null);
            c18Var.getClass();
            this.f28253a = 1;
            if (AbstractC3224d.m15529h(c18Var, c22761, this) == coroutineSingletons) {
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
