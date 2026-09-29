package com.lingq.feature.reader.old;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c18;
import p000.c32;
import p000.un1;
import p000.vk9;
import p000.vx7;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$13", m4291f = "ReaderPageFragment.kt", m4292l = {1532}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderPageFragment$onViewCreated$2$13 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28489a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderPageFragment f28490b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$13$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$13$1", m4291f = "ReaderPageFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23321 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f28491a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReaderPageFragment f28492b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23321(ReaderPageFragment readerPageFragment, Continuation continuation) {
            super(2, continuation);
            this.f28492b = readerPageFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C23321 c23321 = new C23321(this.f28492b, continuation);
            c23321.f28491a = obj;
            return c23321;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C23321 c23321 = (C23321) create((String) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c23321.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String str = (String) this.f28491a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            if (!vk9.m23391n0(str)) {
                vx7 vx7Var = ReaderPageFragment.Companion;
                this.f28492b.m9297V0().f69722m.setText(str);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderPageFragment$onViewCreated$2$13(ReaderPageFragment readerPageFragment, Continuation continuation) {
        super(2, continuation);
        this.f28490b = readerPageFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderPageFragment$onViewCreated$2$13(this.f28490b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderPageFragment$onViewCreated$2$13) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28489a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            vx7 vx7Var = ReaderPageFragment.Companion;
            ReaderPageFragment readerPageFragment = this.f28490b;
            c18 c18Var = readerPageFragment.m9299X0().f29226c0;
            C23321 c23321 = new C23321(readerPageFragment, null);
            c18Var.getClass();
            this.f28489a = 1;
            if (AbstractC3224d.m15529h(c18Var, c23321, this) == coroutineSingletons) {
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
