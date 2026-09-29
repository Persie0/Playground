package com.lingq.feature.more;

import com.lingq.core.domain.model.language.Language;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3423or;
import p000.C3386nv;
import p000.c32;
import p000.eh9;
import p000.un1;
import p000.v26;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.more.MoreFragment$onViewCreated$3$1", m4291f = "MoreFragment.kt", m4292l = {201}, m4293m = "invokeSuspend", m4294v = 2)
final class MoreFragment$onViewCreated$3$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26816a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MoreFragment f26817b;

    /* JADX INFO: renamed from: com.lingq.feature.more.MoreFragment$onViewCreated$3$1$1 */
    @c32(m4290c = "com.lingq.feature.more.MoreFragment$onViewCreated$3$1$1", m4291f = "MoreFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C21581 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MoreFragment f26818a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21581(MoreFragment moreFragment, Continuation continuation) {
            super(2, continuation);
            this.f26818a = moreFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C21581(this.f26818a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C21581 c21581 = (C21581) create((Language) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c21581.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            v26 v26VarM9094S0 = this.f26818a.m9094S0();
            C3244l c3244l = v26VarM9094S0.f64738g;
            Boolean boolValueOf = Boolean.valueOf(AbstractC3423or.m18251e0(v26VarM9094S0.f64735d.mo4589b2()));
            c3244l.getClass();
            c3244l.m15572j(null, boolValueOf);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoreFragment$onViewCreated$3$1(MoreFragment moreFragment, Continuation continuation) {
        super(2, continuation);
        this.f26817b = moreFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MoreFragment$onViewCreated$3$1(this.f26817b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((MoreFragment$onViewCreated$3$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26816a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            MoreFragment moreFragment = this.f26817b;
            eh9 eh9VarMo4572B0 = moreFragment.m9094S0().f64735d.mo4572B0();
            C21581 c21581 = new C21581(moreFragment, null);
            eh9VarMo4572B0.getClass();
            this.f26816a = 1;
            if (AbstractC3224d.m15529h(eh9VarMo4572B0, c21581, this) == coroutineSingletons) {
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
