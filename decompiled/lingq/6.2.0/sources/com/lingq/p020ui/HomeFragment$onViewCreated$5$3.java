package com.lingq.p020ui;

import com.lingq.core.domain.model.onboarding.TooltipStep;
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
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.ui.HomeFragment$onViewCreated$5$3", m4291f = "HomeFragment.kt", m4292l = {296}, m4293m = "invokeSuspend", m4294v = 2)
final class HomeFragment$onViewCreated$5$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f33913a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ HomeFragment f33914b;

    /* JADX INFO: renamed from: com.lingq.ui.HomeFragment$onViewCreated$5$3$1 */
    @c32(m4290c = "com.lingq.ui.HomeFragment$onViewCreated$5$3$1", m4291f = "HomeFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C28741 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f33915a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ HomeFragment f33916b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28741(HomeFragment homeFragment, Continuation continuation) {
            super(2, continuation);
            this.f33916b = homeFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C28741 c28741 = new C28741(this.f33916b, continuation);
            c28741.f33915a = obj;
            return c28741;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C28741 c28741 = (C28741) create((ProfileAccount) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c28741.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            ProfileAccount profileAccount = (ProfileAccount) this.f33915a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            if (profileAccount.f19685i > 0) {
                HomeFragment homeFragment = this.f33916b;
                if (homeFragment.m9796i0().m20127a().isEmpty()) {
                    homeFragment.m9798k0().mo8742L(TooltipStep.Finished);
                }
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeFragment$onViewCreated$5$3(HomeFragment homeFragment, Continuation continuation) {
        super(2, continuation);
        this.f33914b = homeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeFragment$onViewCreated$5$3(this.f33914b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((HomeFragment$onViewCreated$5$3) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33913a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = HomeFragment.f33886N0;
            HomeFragment homeFragment = this.f33914b;
            c83 c83VarMo4583O1 = homeFragment.m9798k0().f34167b.mo4583O1();
            C28741 c28741 = new C28741(homeFragment, null);
            this.f33913a = 1;
            if (AbstractC3224d.m15529h(c83VarMo4583O1, c28741, this) == coroutineSingletons) {
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
