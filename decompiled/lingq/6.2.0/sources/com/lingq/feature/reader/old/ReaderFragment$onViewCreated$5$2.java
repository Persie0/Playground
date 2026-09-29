package com.lingq.feature.reader.old;

import com.lingq.core.domain.model.user.ProfileAccount;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.bh4;
import p000.c32;
import p000.c83;
import p000.fa4;
import p000.fx5;
import p000.jfa;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$2", m4291f = "ReaderFragment.kt", m4292l = {603}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderFragment$onViewCreated$5$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28292a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderFragment f28293b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$2$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$2$1", m4291f = "ReaderFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C22871 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ReaderFragment f28294a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22871(ReaderFragment readerFragment, Continuation continuation) {
            super(2, continuation);
            this.f28294a = readerFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C22871(this.f28294a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C22871 c22871 = (C22871) create((ProfileAccount) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c22871.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            fx5 fx5Var = this.f28294a.f28224H0;
            if (fx5Var != null) {
                jfa.m14429l(fx5Var.f39865n);
                return xfa.f68157a;
            }
            fa4.m11636J("viewLessonMenuBinding");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderFragment$onViewCreated$5$2(ReaderFragment readerFragment, Continuation continuation) {
        super(2, continuation);
        this.f28293b = readerFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderFragment$onViewCreated$5$2(this.f28293b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderFragment$onViewCreated$5$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28292a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReaderFragment.f28218P0;
            ReaderFragment readerFragment = this.f28293b;
            c83 c83VarMo4583O1 = readerFragment.m9290W0().f29340b.mo4583O1();
            C22871 c22871 = new C22871(readerFragment, null);
            this.f28292a = 1;
            if (AbstractC3224d.m15529h(c83VarMo4583O1, c22871, this) == coroutineSingletons) {
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
