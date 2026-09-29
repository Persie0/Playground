package com.lingq.core.premium;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.bh4;
import p000.c18;
import p000.c32;
import p000.ce5;
import p000.jfa;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.premium.LingQsOfferFragment$onViewCreated$2$4", m4291f = "LingQsOfferFragment.kt", m4292l = {122}, m4293m = "invokeSuspend", m4294v = 2)
final class LingQsOfferFragment$onViewCreated$2$4 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f22366a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LingQsOfferFragment f22367b;

    /* JADX INFO: renamed from: com.lingq.core.premium.LingQsOfferFragment$onViewCreated$2$4$1 */
    @c32(m4290c = "com.lingq.core.premium.LingQsOfferFragment$onViewCreated$2$4$1", m4291f = "LingQsOfferFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C18381 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ boolean f22368a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LingQsOfferFragment f22369b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18381(LingQsOfferFragment lingQsOfferFragment, Continuation continuation) {
            super(2, continuation);
            this.f22369b = lingQsOfferFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C18381 c18381 = new C18381(this.f22369b, continuation);
            c18381.f22368a = ((Boolean) obj).booleanValue();
            return c18381;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            C18381 c18381 = (C18381) create(bool, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c18381.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            boolean z = this.f22368a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            LingQsOfferFragment lingQsOfferFragment = this.f22369b;
            if (z) {
                bh4[] bh4VarArr = LingQsOfferFragment.f22346E0;
                lingQsOfferFragment.m8513R0().f42323e.m6163e();
                jfa.m14420c(lingQsOfferFragment.m8513R0().f42320b);
            } else {
                bh4[] bh4VarArr2 = LingQsOfferFragment.f22346E0;
                lingQsOfferFragment.m8513R0().f42323e.m6161b();
                jfa.m14429l(lingQsOfferFragment.m8513R0().f42320b);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LingQsOfferFragment$onViewCreated$2$4(LingQsOfferFragment lingQsOfferFragment, Continuation continuation) {
        super(2, continuation);
        this.f22367b = lingQsOfferFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LingQsOfferFragment$onViewCreated$2$4(this.f22367b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LingQsOfferFragment$onViewCreated$2$4) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f22366a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            LingQsOfferFragment lingQsOfferFragment = this.f22367b;
            c18 c18Var = ((ce5) lingQsOfferFragment.f22347C0.getValue()).f9978g;
            C18381 c18381 = new C18381(lingQsOfferFragment, null);
            this.f22366a = 1;
            if (AbstractC3224d.m15529h(c18Var, c18381, this) == coroutineSingletons) {
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
