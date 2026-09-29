package com.lingq.feature.review.activities;

import com.lingq.core.domain.model.lesson.LessonCard;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.n58;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityViewModel$speak$1", m4291f = "ReviewActivityViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewActivityViewModel$speak$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2750e f32305a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f32306b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f32307c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ float f32308d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f32309e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewActivityViewModel$speak$1(C2750e c2750e, String str, boolean z, float f, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.f32305a = c2750e;
        this.f32306b = str;
        this.f32307c = z;
        this.f32308d = f;
        this.f32309e = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewActivityViewModel$speak$1(this.f32305a, this.f32306b, this.f32307c, this.f32308d, this.f32309e, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ReviewActivityViewModel$speak$1 reviewActivityViewModel$speak$1 = (ReviewActivityViewModel$speak$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        reviewActivityViewModel$speak$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C2750e c2750e = this.f32305a;
        n58 n58Var = c2750e.f32375h;
        String strMo4589b2 = c2750e.f32369b.mo4589b2();
        LessonCard lessonCard = (LessonCard) c2750e.f32381n.getValue();
        c2750e.f32374g.mo8484Y0(n58.m17233j(n58Var, strMo4589b2, this.f32306b, lessonCard != null ? lessonCard.m8041i() : null, null, null, 24), this.f32307c, this.f32308d, this.f32309e);
        return xfa.f68157a;
    }
}
