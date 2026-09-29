package com.lingq.feature.review;

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
@c32(m4290c = "com.lingq.feature.review.ReviewComposeViewModel$speak$1", m4291f = "ReviewComposeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewComposeViewModel$speak$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2751b f31736a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f31737b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f31738c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ float f31739d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f31740e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewComposeViewModel$speak$1(C2751b c2751b, String str, boolean z, float f, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.f31736a = c2751b;
        this.f31737b = str;
        this.f31738c = z;
        this.f31739d = f;
        this.f31740e = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewComposeViewModel$speak$1(this.f31736a, this.f31737b, this.f31738c, this.f31739d, this.f31740e, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ReviewComposeViewModel$speak$1 reviewComposeViewModel$speak$1 = (ReviewComposeViewModel$speak$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        reviewComposeViewModel$speak$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C2751b c2751b = this.f31736a;
        n58 n58Var = c2751b.f32402j;
        String strMo4589b2 = c2751b.f32394b.mo4589b2();
        LessonCard lessonCardM9624h = c2751b.f32397e.m9624h();
        c2751b.f32401i.mo8484Y0(n58.m17233j(n58Var, strMo4589b2, this.f31737b, lessonCardM9624h != null ? lessonCardM9624h.m8041i() : null, null, null, 24), this.f31738c, this.f31739d, this.f31740e);
        return xfa.f68157a;
    }
}
