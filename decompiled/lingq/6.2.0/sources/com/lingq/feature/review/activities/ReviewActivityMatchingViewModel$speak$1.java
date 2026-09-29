package com.lingq.feature.review.activities;

import com.lingq.core.domain.model.lesson.LessonCard;
import java.util.Iterator;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.fa4;
import p000.n58;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityMatchingViewModel$speak$1", m4291f = "ReviewActivityMatchingViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewActivityMatchingViewModel$speak$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2747b f32011a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f32012b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f32013c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ float f32014d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f32015e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewActivityMatchingViewModel$speak$1(C2747b c2747b, String str, boolean z, float f, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.f32011a = c2747b;
        this.f32012b = str;
        this.f32013c = z;
        this.f32014d = f;
        this.f32015e = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewActivityMatchingViewModel$speak$1(this.f32011a, this.f32012b, this.f32013c, this.f32014d, this.f32015e, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ReviewActivityMatchingViewModel$speak$1 reviewActivityMatchingViewModel$speak$1 = (ReviewActivityMatchingViewModel$speak$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        reviewActivityMatchingViewModel$speak$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object next;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C2747b c2747b = this.f32011a;
        Iterator it = ((Iterable) c2747b.f32325h.getValue()).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!fa4.m11650l(((LessonCard) next).f19178a, this.f32012b));
        LessonCard lessonCard = (LessonCard) next;
        c2747b.f32323f.mo8484Y0(n58.m17233j(c2747b.f32322e, c2747b.f32319b.mo4589b2(), this.f32012b, lessonCard != null ? lessonCard.m8041i() : null, null, null, 24), this.f32013c, this.f32014d, this.f32015e);
        return xfa.f68157a;
    }
}
