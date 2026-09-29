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
import p000.fa4;
import p000.fx5;
import p000.jfa;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$22", m4291f = "ReaderFragment.kt", m4292l = {2110}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderFragment$onViewCreated$5$22 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28303a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderFragment f28304b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$22$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$22$1", m4291f = "ReaderFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C22901 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ boolean f28305a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReaderFragment f28306b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22901(ReaderFragment readerFragment, Continuation continuation) {
            super(2, continuation);
            this.f28306b = readerFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C22901 c22901 = new C22901(this.f28306b, continuation);
            c22901.f28305a = ((Boolean) obj).booleanValue();
            return c22901;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            C22901 c22901 = (C22901) create(bool, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c22901.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            boolean z = this.f28305a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            fx5 fx5Var = this.f28306b.f28224H0;
            if (z) {
                if (fx5Var == null) {
                    fa4.m11636J("viewLessonMenuBinding");
                    throw null;
                }
                jfa.m14429l(fx5Var.f39853b);
            } else {
                if (fx5Var == null) {
                    fa4.m11636J("viewLessonMenuBinding");
                    throw null;
                }
                jfa.m14425h(fx5Var.f39853b);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderFragment$onViewCreated$5$22(ReaderFragment readerFragment, Continuation continuation) {
        super(2, continuation);
        this.f28304b = readerFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderFragment$onViewCreated$5$22(this.f28304b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderFragment$onViewCreated$5$22) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28303a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReaderFragment.f28218P0;
            ReaderFragment readerFragment = this.f28304b;
            c18 c18Var = readerFragment.m9290W0().f29358f1;
            C22901 c22901 = new C22901(readerFragment, null);
            c18Var.getClass();
            this.f28303a = 1;
            if (AbstractC3224d.m15529h(c18Var, c22901, this) == coroutineSingletons) {
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
