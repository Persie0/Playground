package com.lingq.feature.reader.old;

import com.lingq.feature.reader.R$id;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C2916d6;
import p000.C3386nv;
import p000.b34;
import p000.bh4;
import p000.c32;
import p000.du0;
import p000.jfa;
import p000.ud6;
import p000.un1;
import p000.xfa;
import p000.zi3;
import p000.zw7;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$38", m4291f = "ReaderFragment.kt", m4292l = {1616}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderFragment$onViewCreated$5$38 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28367a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderFragment f28368b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$38$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$38$1", m4291f = "ReaderFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23071 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ReaderFragment f28369a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23071(ReaderFragment readerFragment, Continuation continuation) {
            super(2, continuation);
            this.f28369a = readerFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C23071(this.f28369a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C23071 c23071 = (C23071) create((xfa) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c23071.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            ud6 ud6VarM3244j = b34.m3244j(this.f28369a);
            zw7.Companion.getClass();
            jfa.m14428k(ud6VarM3244j, new C2916d6(R$id.actionToFirstLingQCongrats), null);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderFragment$onViewCreated$5$38(ReaderFragment readerFragment, Continuation continuation) {
        super(2, continuation);
        this.f28368b = readerFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderFragment$onViewCreated$5$38(this.f28368b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderFragment$onViewCreated$5$38) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28367a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReaderFragment.f28218P0;
            ReaderFragment readerFragment = this.f28368b;
            du0 du0Var = readerFragment.m9290W0().f29303O1;
            C23071 c23071 = new C23071(readerFragment, null);
            this.f28367a = 1;
            if (AbstractC3224d.m15529h(du0Var, c23071, this) == coroutineSingletons) {
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
