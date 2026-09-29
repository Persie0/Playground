package com.lingq.feature.onboarding.p014v2;

import com.lingq.feature.onboarding.p014v2.domain.C2223d;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.onboarding.v2.OnboardingV2ViewModel$loadMiniLessonReaderStyle$1", m4291f = "OnboardingV2ViewModel.kt", m4292l = {214}, m4293m = "invokeSuspend", m4294v = 2)
final class OnboardingV2ViewModel$loadMiniLessonReaderStyle$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public C3244l f27318a;

    /* JADX INFO: renamed from: b */
    public int f27319b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2216d f27320c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f27321d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingV2ViewModel$loadMiniLessonReaderStyle$1(C2216d c2216d, String str, Continuation continuation) {
        super(2, continuation);
        this.f27320c = c2216d;
        this.f27321d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OnboardingV2ViewModel$loadMiniLessonReaderStyle$1(this.f27320c, this.f27321d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((OnboardingV2ViewModel$loadMiniLessonReaderStyle$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C3244l c3244l;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27319b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2216d c2216d = this.f27320c;
            C3244l c3244l2 = c2216d.f27365C;
            C2223d c2223d = c2216d.f27388m;
            this.f27318a = c3244l2;
            this.f27319b = 1;
            obj = c2223d.m9172a(this.f27321d, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            c3244l = c3244l2;
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c3244l = this.f27318a;
            AbstractC3193b.m15359b(obj);
        }
        c3244l.m15571i(obj);
        return xfa.f68157a;
    }
}
