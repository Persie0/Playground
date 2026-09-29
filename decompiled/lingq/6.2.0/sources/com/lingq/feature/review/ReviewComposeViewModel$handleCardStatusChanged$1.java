package com.lingq.feature.review;

import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.feature.review.state.C2761a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.ReviewComposeViewModel$handleCardStatusChanged$1", m4291f = "ReviewComposeViewModel.kt", m4292l = {432, 433}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewComposeViewModel$handleCardStatusChanged$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31686a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2751b f31687b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ LessonCard f31688c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f31689d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewComposeViewModel$handleCardStatusChanged$1(C2751b c2751b, LessonCard lessonCard, int i, Continuation continuation) {
        super(2, continuation);
        this.f31687b = c2751b;
        this.f31688c = lessonCard;
        this.f31689d = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewComposeViewModel$handleCardStatusChanged$1(this.f31687b, this.f31688c, this.f31689d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewComposeViewModel$handleCardStatusChanged$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        if (r3.m9571c3(r6) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31686a;
        C2751b c2751b = this.f31687b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2761a c2761a = c2751b.f32397e;
            String str = this.f31688c.f19178a;
            this.f31686a = 1;
            if (c2761a.m9633q(str, this.f31689d, null, this) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
        } else {
            if (i != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
        this.f31686a = 2;
    }
}
