package com.lingq.feature.review.activities;

import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.status.CardStatus;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.ao0;
import p000.c32;
import p000.cma;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityViewModel$updateCardStatus$1", m4291f = "ReviewActivityViewModel.kt", m4292l = {176, 178}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewActivityViewModel$updateCardStatus$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public C2750e f32313a;

    /* JADX INFO: renamed from: b */
    public int f32314b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2750e f32315c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f32316d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewActivityViewModel$updateCardStatus$1(C2750e c2750e, int i, Continuation continuation) {
        super(2, continuation);
        this.f32315c = c2750e;
        this.f32316d = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewActivityViewModel$updateCardStatus$1(this.f32315c, this.f32316d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewActivityViewModel$updateCardStatus$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
    
        if (((com.lingq.core.data.repository.C1287c) r7).m7113b(r11, r1, r15, r14) == r2) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
    
        if (((com.lingq.core.data.repository.C1287c) r7).m7133w(r9, r10, r11, null, r14) == r2) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
    
        return r2;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2750e c2750e = this.f32315c;
        cma cmaVar = c2750e.f32369b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f32314b;
        xfa xfaVar = xfa.f68157a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            LessonCard lessonCard = (LessonCard) c2750e.f32381n.getValue();
            if (lessonCard != null) {
                int value = CardStatus.Ignored.getValue();
                ao0 ao0Var = c2750e.f32370c;
                int i2 = this.f32316d;
                if (i2 == value) {
                    String strMo4589b2 = cmaVar.mo4589b2();
                    String str = lessonCard.f19178a;
                    this.f32313a = c2750e;
                    this.f32314b = 1;
                } else {
                    String strMo4589b3 = cmaVar.mo4589b2();
                    String str2 = lessonCard.f19178a;
                    this.f32313a = c2750e;
                    this.f32314b = 2;
                }
            }
            return xfaVar;
        }
        if (i != 1 && i != 2) {
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        c2750e = this.f32313a;
        AbstractC3193b.m15359b(obj);
        c2750e.f32387t.mo4677k(xfaVar);
        return xfaVar;
    }
}
