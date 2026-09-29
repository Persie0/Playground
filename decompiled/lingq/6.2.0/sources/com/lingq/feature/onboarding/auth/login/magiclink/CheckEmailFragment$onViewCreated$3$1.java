package com.lingq.feature.onboarding.auth.login.magiclink;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.bh4;
import p000.c18;
import p000.c32;
import p000.e01;
import p000.jfa;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.onboarding.auth.login.magiclink.CheckEmailFragment$onViewCreated$3$1", m4291f = "CheckEmailFragment.kt", m4292l = {153}, m4293m = "invokeSuspend", m4294v = 2)
final class CheckEmailFragment$onViewCreated$3$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f27081a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CheckEmailFragment f27082b;

    /* JADX INFO: renamed from: com.lingq.feature.onboarding.auth.login.magiclink.CheckEmailFragment$onViewCreated$3$1$1 */
    @c32(m4290c = "com.lingq.feature.onboarding.auth.login.magiclink.CheckEmailFragment$onViewCreated$3$1$1", m4291f = "CheckEmailFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C21791 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ boolean f27083a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ CheckEmailFragment f27084b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21791(CheckEmailFragment checkEmailFragment, Continuation continuation) {
            super(2, continuation);
            this.f27084b = checkEmailFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C21791 c21791 = new C21791(this.f27084b, continuation);
            c21791.f27083a = ((Boolean) obj).booleanValue();
            return c21791;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            C21791 c21791 = (C21791) create(bool, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c21791.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            boolean z = this.f27083a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            CheckEmailFragment checkEmailFragment = this.f27084b;
            if (z) {
                bh4[] bh4VarArr = CheckEmailFragment.f27069G0;
                jfa.m14429l(checkEmailFragment.m9113R0().f54205c);
            } else {
                bh4[] bh4VarArr2 = CheckEmailFragment.f27069G0;
                jfa.m14425h(checkEmailFragment.m9113R0().f54205c);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckEmailFragment$onViewCreated$3$1(CheckEmailFragment checkEmailFragment, Continuation continuation) {
        super(2, continuation);
        this.f27082b = checkEmailFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CheckEmailFragment$onViewCreated$3$1(this.f27082b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((CheckEmailFragment$onViewCreated$3$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27081a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = CheckEmailFragment.f27069G0;
            CheckEmailFragment checkEmailFragment = this.f27082b;
            c18 c18Var = ((e01) checkEmailFragment.f27071D0.getValue()).f36482f;
            C21791 c21791 = new C21791(checkEmailFragment, null);
            c18Var.getClass();
            this.f27081a = 1;
            if (AbstractC3224d.m15529h(c18Var, c21791, this) == coroutineSingletons) {
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
