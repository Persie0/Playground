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
import p000.jfa;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$40", m4291f = "ReaderFragment.kt", m4292l = {2110}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderFragment$onViewCreated$5$40 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28381a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderFragment f28382b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$40$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$40$1", m4291f = "ReaderFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23111 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f28383a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReaderFragment f28384b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23111(ReaderFragment readerFragment, Continuation continuation) {
            super(2, continuation);
            this.f28384b = readerFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C23111 c23111 = new C23111(this.f28384b, continuation);
            c23111.f28383a = obj;
            return c23111;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C23111 c23111 = (C23111) create((Boolean) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c23111.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Boolean bool = (Boolean) this.f28383a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            boolean zM11650l = fa4.m11650l(bool, Boolean.TRUE);
            ReaderFragment readerFragment = this.f28384b;
            if (zM11650l) {
                bh4[] bh4VarArr = ReaderFragment.f28218P0;
                jfa.m14425h(readerFragment.m9288U0().f66712r);
            } else {
                bh4[] bh4VarArr2 = ReaderFragment.f28218P0;
                if (readerFragment.m9288U0().f66686G.getVisibility() != 0) {
                    jfa.m14429l(readerFragment.m9288U0().f66712r);
                }
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderFragment$onViewCreated$5$40(ReaderFragment readerFragment, Continuation continuation) {
        super(2, continuation);
        this.f28382b = readerFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderFragment$onViewCreated$5$40(this.f28382b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderFragment$onViewCreated$5$40) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28381a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReaderFragment.f28218P0;
            ReaderFragment readerFragment = this.f28382b;
            c18 c18Var = readerFragment.m9290W0().f29330X1;
            C23111 c23111 = new C23111(readerFragment, null);
            c18Var.getClass();
            this.f28381a = 1;
            if (AbstractC3224d.m15529h(c18Var, c23111, this) == coroutineSingletons) {
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
