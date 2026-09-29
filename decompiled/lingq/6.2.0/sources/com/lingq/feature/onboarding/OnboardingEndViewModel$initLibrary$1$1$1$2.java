package com.lingq.feature.onboarding;

import com.lingq.core.data.repository.C1296l;
import com.lingq.core.domain.model.language.Language;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.e83;
import p000.xfa;
import p000.y95;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.onboarding.OnboardingEndViewModel$initLibrary$1$1$1$2", m4291f = "OnboardingEndViewModel.kt", m4292l = {177}, m4293m = "invokeSuspend", m4294v = 2)
final class OnboardingEndViewModel$initLibrary$1$1$1$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26956a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2197b f26957b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Language f26958c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ List f26959d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingEndViewModel$initLibrary$1$1$1$2(C2197b c2197b, Language language, List list, Continuation continuation) {
        super(2, continuation);
        this.f26957b = c2197b;
        this.f26958c = language;
        this.f26959d = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OnboardingEndViewModel$initLibrary$1$1$1$2(this.f26957b, this.f26958c, this.f26959d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((OnboardingEndViewModel$initLibrary$1$1$1$2) create((e83) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26956a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            y95 y95Var = this.f26957b.f27167h;
            String str = this.f26958c.f19024a;
            this.f26956a = 1;
            if (((C1296l) y95Var).m7325t(str, this.f26959d, this) == coroutineSingletons) {
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
