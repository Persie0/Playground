package com.lingq.feature.reader.old;

import com.lingq.core.p012ui.R$string;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.bh4;
import p000.c32;
import p000.du0;
import p000.fr5;
import p000.i25;
import p000.iw7;
import p000.j25;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$39", m4291f = "ReaderFragment.kt", m4292l = {1624}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderFragment$onViewCreated$5$39 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28370a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderFragment f28371b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$39$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$39$1", m4291f = "ReaderFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23081 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f28372a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReaderFragment f28373b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23081(ReaderFragment readerFragment, Continuation continuation) {
            super(2, continuation);
            this.f28373b = readerFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C23081 c23081 = new C23081(this.f28373b, continuation);
            c23081.f28372a = obj;
            return c23081;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C23081 c23081 = (C23081) create((j25) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c23081.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            j25 j25Var = (j25) this.f28372a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            boolean z = j25Var instanceof i25;
            ReaderFragment readerFragment = this.f28373b;
            Pair pair = z ? new Pair(readerFragment.m2111m(R$string.upgrade_offline_access), readerFragment.m2111m(R$string.feed_library_offline)) : new Pair(readerFragment.m2111m(com.lingq.feature.reader.R$string.lesson_error), readerFragment.m2111m(com.lingq.feature.reader.R$string.texts_please_try_later));
            Object obj2 = pair.f47623a;
            obj2.getClass();
            Object obj3 = pair.f47624b;
            obj3.getClass();
            fr5 fr5Var = new fr5(readerFragment.m2090R(), 0);
            fr5Var.m12027j((String) obj2);
            fr5Var.f71376a.f65209g = (String) obj3;
            fr5Var.m12026i(readerFragment.m2111m(R$string.ui_close), new iw7(2, readerFragment));
            fr5Var.m25557a();
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderFragment$onViewCreated$5$39(ReaderFragment readerFragment, Continuation continuation) {
        super(2, continuation);
        this.f28371b = readerFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderFragment$onViewCreated$5$39(this.f28371b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderFragment$onViewCreated$5$39) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28370a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReaderFragment.f28218P0;
            ReaderFragment readerFragment = this.f28371b;
            du0 du0Var = readerFragment.m9290W0().f29414v1;
            C23081 c23081 = new C23081(readerFragment, null);
            this.f28370a = 1;
            if (AbstractC3224d.m15529h(du0Var, c23081, this) == coroutineSingletons) {
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
