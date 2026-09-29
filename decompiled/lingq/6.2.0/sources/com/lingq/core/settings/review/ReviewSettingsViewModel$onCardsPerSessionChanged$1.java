package com.lingq.core.settings.review;

import com.lingq.core.settings.domain.C1866e;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.review.ReviewSettingsViewModel$onCardsPerSessionChanged$1", m4291f = "ReviewSettingsViewModel.kt", m4292l = {168}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewSettingsViewModel$onCardsPerSessionChanged$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f23156a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1880a f23157b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f23158c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewSettingsViewModel$onCardsPerSessionChanged$1(C1880a c1880a, int i, Continuation continuation) {
        super(2, continuation);
        this.f23157b = c1880a;
        this.f23158c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewSettingsViewModel$onCardsPerSessionChanged$1(this.f23157b, this.f23158c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewSettingsViewModel$onCardsPerSessionChanged$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f23156a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C1866e c1866e = this.f23157b.f23182f;
            this.f23156a = 1;
            if (c1866e.m8627a(this.f23158c, this) == coroutineSingletons) {
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
