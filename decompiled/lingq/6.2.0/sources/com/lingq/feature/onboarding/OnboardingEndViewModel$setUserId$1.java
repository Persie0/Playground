package com.lingq.feature.onboarding;

import com.lingq.core.analytics.C1240a;
import com.lingq.core.datastore.C1369b;
import com.lingq.core.domain.model.user.Profile;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.hm5;
import p000.qm7;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.onboarding.OnboardingEndViewModel$setUserId$1", m4291f = "OnboardingEndViewModel.kt", m4292l = {324}, m4293m = "invokeSuspend", m4294v = 2)
final class OnboardingEndViewModel$setUserId$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26970a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2197b f26971b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingEndViewModel$setUserId$1(C2197b c2197b, Continuation continuation) {
        super(2, continuation);
        this.f26971b = c2197b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OnboardingEndViewModel$setUserId$1(this.f26971b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((OnboardingEndViewModel$setUserId$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26970a;
        C2197b c2197b = this.f26971b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            qm7 qm7Var = ((C1369b) c2197b.f27163d).f18480m;
            this.f26970a = 1;
            obj = AbstractC3224d.m15542u(qm7Var, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        Profile profile = (Profile) obj;
        if (profile != null) {
            hm5 hm5Var = c2197b.f27172m;
            int i2 = profile.f19652a;
            StringBuilder sb = new StringBuilder();
            sb.append(i2);
            ((C1240a) hm5Var).m7026g(sb.toString());
        }
        return xfa.f68157a;
    }
}
