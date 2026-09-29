package com.lingq.feature.review;

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
@c32(m4290c = "com.lingq.feature.review.ReviewSessionCompleteViewModel$updateCardStatus$1", m4291f = "ReviewSessionCompleteViewModel.kt", m4292l = {82, 84}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewSessionCompleteViewModel$updateCardStatus$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31809a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f31810b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2757e f31811c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ LessonCard f31812d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewSessionCompleteViewModel$updateCardStatus$1(int i, C2757e c2757e, LessonCard lessonCard, Continuation continuation) {
        super(2, continuation);
        this.f31810b = i;
        this.f31811c = c2757e;
        this.f31812d = lessonCard;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewSessionCompleteViewModel$updateCardStatus$1(this.f31810b, this.f31811c, this.f31812d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewSessionCompleteViewModel$updateCardStatus$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        if (((com.lingq.core.data.repository.C1287c) r1).m7113b(r6, r8, r2, r7) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        if (((com.lingq.core.data.repository.C1287c) r1).m7133w(r8, r3, r7.f31810b, null, r7) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31809a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            int value = CardStatus.Ignored.getValue();
            C2757e c2757e = this.f31811c;
            cma cmaVar = c2757e.f32472b;
            ao0 ao0Var = c2757e.f32473c;
            LessonCard lessonCard = this.f31812d;
            int i2 = this.f31810b;
            if (i2 == value) {
                String strMo4589b2 = cmaVar.mo4589b2();
                String str = lessonCard.f19178a;
                this.f31809a = 1;
            } else {
                String strMo4589b3 = cmaVar.mo4589b2();
                String str2 = lessonCard.f19178a;
                this.f31809a = 2;
            }
        } else {
            if (i != 1 && i != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
