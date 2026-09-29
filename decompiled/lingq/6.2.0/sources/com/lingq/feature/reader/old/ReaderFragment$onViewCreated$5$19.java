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
import p000.jfa;
import p000.un1;
import p000.vd7;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$19", m4291f = "ReaderFragment.kt", m4292l = {2110}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderFragment$onViewCreated$5$19 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28288a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderFragment f28289b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$19$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$19$1", m4291f = "ReaderFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C22861 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f28290a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReaderFragment f28291b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22861(ReaderFragment readerFragment, Continuation continuation) {
            super(2, continuation);
            this.f28291b = readerFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C22861 c22861 = new C22861(this.f28291b, continuation);
            c22861.f28290a = obj;
            return c22861;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C22861 c22861 = (C22861) create((vd7) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c22861.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i;
            vd7 vd7Var = (vd7) this.f28290a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            if (vd7Var != null) {
                boolean z = vd7Var.f65237b;
                ReaderFragment readerFragment = this.f28291b;
                if (z || (i = vd7Var.f65238c) <= 0 || i >= 100) {
                    bh4[] bh4VarArr = ReaderFragment.f28218P0;
                    jfa.m14425h(readerFragment.m9288U0().f66713s);
                    jfa.m14429l(readerFragment.m9288U0().f66712r);
                } else {
                    bh4[] bh4VarArr2 = ReaderFragment.f28218P0;
                    readerFragment.m9288U0().f66713s.m6163e();
                    jfa.m14425h(readerFragment.m9288U0().f66712r);
                }
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderFragment$onViewCreated$5$19(ReaderFragment readerFragment, Continuation continuation) {
        super(2, continuation);
        this.f28289b = readerFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderFragment$onViewCreated$5$19(this.f28289b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderFragment$onViewCreated$5$19) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28288a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReaderFragment.f28218P0;
            ReaderFragment readerFragment = this.f28289b;
            c18 c18Var = readerFragment.m9290W0().f29366h1;
            C22861 c22861 = new C22861(readerFragment, null);
            c18Var.getClass();
            this.f28288a = 1;
            if (AbstractC3224d.m15529h(c18Var, c22861, this) == coroutineSingletons) {
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
