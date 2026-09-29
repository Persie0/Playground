package com.lingq.feature.more;

import com.lingq.core.analytics.data.LqAnalyticsValues$GrammarOpenedPath;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.b34;
import p000.c32;
import p000.du0;
import p000.id3;
import p000.mbd;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.more.MoreFragment$onViewCreated$3$2", m4291f = "MoreFragment.kt", m4292l = {181}, m4293m = "invokeSuspend", m4294v = 2)
final class MoreFragment$onViewCreated$3$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26819a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MoreFragment f26820b;

    /* JADX INFO: renamed from: com.lingq.feature.more.MoreFragment$onViewCreated$3$2$1 */
    @c32(m4290c = "com.lingq.feature.more.MoreFragment$onViewCreated$3$2$1", m4291f = "MoreFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C21591 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f26821a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ MoreFragment f26822b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21591(MoreFragment moreFragment, Continuation continuation) {
            super(2, continuation);
            this.f26822b = moreFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C21591 c21591 = new C21591(this.f26822b, continuation);
            c21591.f26821a = obj;
            return c21591;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C21591 c21591 = (C21591) create((String) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c21591.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String str = (String) this.f26821a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            MoreFragment moreFragment = this.f26822b;
            id3 id3VarM2089Q = moreFragment.m2089Q();
            int i = com.lingq.core.p012ui.R$string.lingq_grammar_resource;
            b34.m3244j(moreFragment);
            LqAnalyticsValues$GrammarOpenedPath.Menu.getValue();
            mbd.m16755c(id3VarM2089Q, str, new Integer(i), 8);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoreFragment$onViewCreated$3$2(MoreFragment moreFragment, Continuation continuation) {
        super(2, continuation);
        this.f26820b = moreFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MoreFragment$onViewCreated$3$2(this.f26820b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((MoreFragment$onViewCreated$3$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26819a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            MoreFragment moreFragment = this.f26820b;
            du0 du0Var = moreFragment.m9094S0().f64737f;
            C21591 c21591 = new C21591(moreFragment, null);
            this.f26819a = 1;
            if (AbstractC3224d.m15529h(du0Var, c21591, this) == coroutineSingletons) {
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
