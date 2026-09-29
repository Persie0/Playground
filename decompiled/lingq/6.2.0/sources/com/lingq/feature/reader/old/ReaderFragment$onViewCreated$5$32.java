package com.lingq.feature.reader.old;

import com.lingq.core.p012ui.R$string;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.bh4;
import p000.c32;
import p000.du0;
import p000.fr5;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$32", m4291f = "ReaderFragment.kt", m4292l = {1539}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderFragment$onViewCreated$5$32 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28346a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderFragment f28347b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$32$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$32$1", m4291f = "ReaderFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23011 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ReaderFragment f28348a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23011(ReaderFragment readerFragment, Continuation continuation) {
            super(2, continuation);
            this.f28348a = readerFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C23011(this.f28348a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C23011 c23011 = (C23011) create((xfa) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c23011.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            ReaderFragment readerFragment = this.f28348a;
            fr5 fr5Var = new fr5(readerFragment.m2089Q(), 0);
            fr5Var.f71376a.f65209g = readerFragment.m2111m(R$string.generate_lesson_audio);
            fr5Var.m12023f(readerFragment.m2111m(R$string.ui_cancel), null);
            fr5Var.m12026i(readerFragment.m2111m(R$string.ui_yes), new DialogInterfaceOnClickListenerC2403e(readerFragment));
            fr5Var.m25557a();
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderFragment$onViewCreated$5$32(ReaderFragment readerFragment, Continuation continuation) {
        super(2, continuation);
        this.f28347b = readerFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderFragment$onViewCreated$5$32(this.f28347b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderFragment$onViewCreated$5$32) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28346a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReaderFragment.f28218P0;
            ReaderFragment readerFragment = this.f28347b;
            du0 du0Var = readerFragment.m9290W0().f29279G1;
            C23011 c23011 = new C23011(readerFragment, null);
            this.f28346a = 1;
            if (AbstractC3224d.m15529h(du0Var, c23011, this) == coroutineSingletons) {
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
