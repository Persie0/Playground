package com.lingq.feature.onboarding;

import com.lingq.core.data.repository.C1293i;
import java.util.Set;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.lm4;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.onboarding.OnboardingEndViewModel$updateTopics$1", m4291f = "OnboardingEndViewModel.kt", m4292l = {144}, m4293m = "invokeSuspend", m4294v = 2)
final class OnboardingEndViewModel$updateTopics$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26976a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2197b f26977b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f26978c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Set f26979d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingEndViewModel$updateTopics$1(C2197b c2197b, String str, Set set, Continuation continuation) {
        super(2, continuation);
        this.f26977b = c2197b;
        this.f26978c = str;
        this.f26979d = set;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OnboardingEndViewModel$updateTopics$1(this.f26977b, this.f26978c, this.f26979d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((OnboardingEndViewModel$updateTopics$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26976a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            lm4 lm4Var = this.f26977b.f27168i;
            this.f26976a = 1;
            if (((C1293i) lm4Var).m7224u(this.f26978c, this.f26979d, this) == coroutineSingletons) {
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
