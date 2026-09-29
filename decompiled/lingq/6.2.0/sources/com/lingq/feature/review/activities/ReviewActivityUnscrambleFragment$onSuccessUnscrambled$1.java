package com.lingq.feature.review.activities;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import p000.C3386nv;
import p000.bh4;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityUnscrambleFragment$onSuccessUnscrambled$1", m4291f = "ReviewActivityUnscrambleFragment.kt", m4292l = {166, 168}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewActivityUnscrambleFragment$onSuccessUnscrambled$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f32214a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReviewActivityUnscrambleFragment f32215b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewActivityUnscrambleFragment$onSuccessUnscrambled$1(ReviewActivityUnscrambleFragment reviewActivityUnscrambleFragment, Continuation continuation) {
        super(2, continuation);
        this.f32215b = reviewActivityUnscrambleFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewActivityUnscrambleFragment$onSuccessUnscrambled$1(this.f32215b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewActivityUnscrambleFragment$onSuccessUnscrambled$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        if (kotlinx.coroutines.AbstractC3208a.m15437d(300, r6) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f32214a;
        ReviewActivityUnscrambleFragment reviewActivityUnscrambleFragment = this.f32215b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f32214a = 1;
            if (AbstractC3208a.m15437d(1200L, this) != coroutineSingletons) {
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
        bh4[] bh4VarArr = ReviewActivityUnscrambleFragment.f32209F0;
        reviewActivityUnscrambleFragment.m9553T0().m9613g3();
        return xfa.f68157a;
        bh4[] bh4VarArr2 = ReviewActivityUnscrambleFragment.f32209F0;
        reviewActivityUnscrambleFragment.m9553T0().m9608b3();
        this.f32214a = 2;
    }
}
