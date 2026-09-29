package com.lingq.feature.onboarding.auth.login.magiclink;

import android.widget.Toast;
import com.lingq.feature.onboarding.R$string;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.bh4;
import p000.c32;
import p000.du0;
import p000.e01;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.onboarding.auth.login.magiclink.CheckEmailFragment$onViewCreated$3$2", m4291f = "CheckEmailFragment.kt", m4292l = {111}, m4293m = "invokeSuspend", m4294v = 2)
final class CheckEmailFragment$onViewCreated$3$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f27085a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CheckEmailFragment f27086b;

    /* JADX INFO: renamed from: com.lingq.feature.onboarding.auth.login.magiclink.CheckEmailFragment$onViewCreated$3$2$1 */
    @c32(m4290c = "com.lingq.feature.onboarding.auth.login.magiclink.CheckEmailFragment$onViewCreated$3$2$1", m4291f = "CheckEmailFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C21801 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CheckEmailFragment f27087a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21801(CheckEmailFragment checkEmailFragment, Continuation continuation) {
            super(2, continuation);
            this.f27087a = checkEmailFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C21801(this.f27087a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C21801 c21801 = (C21801) create((xfa) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c21801.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            CheckEmailFragment checkEmailFragment = this.f27087a;
            Toast.makeText(checkEmailFragment.m2090R(), checkEmailFragment.m2111m(R$string.login_email_sent), 0).show();
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckEmailFragment$onViewCreated$3$2(CheckEmailFragment checkEmailFragment, Continuation continuation) {
        super(2, continuation);
        this.f27086b = checkEmailFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CheckEmailFragment$onViewCreated$3$2(this.f27086b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((CheckEmailFragment$onViewCreated$3$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27085a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = CheckEmailFragment.f27069G0;
            CheckEmailFragment checkEmailFragment = this.f27086b;
            du0 du0Var = ((e01) checkEmailFragment.f27071D0.getValue()).f36484h;
            C21801 c21801 = new C21801(checkEmailFragment, null);
            this.f27085a = 1;
            if (AbstractC3224d.m15529h(du0Var, c21801, this) == coroutineSingletons) {
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
