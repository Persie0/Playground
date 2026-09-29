package com.lingq.feature.reader.old.settings;

import android.content.Context;
import android.graphics.Rect;
import com.lingq.core.domain.model.onboarding.TooltipStep;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3509qs;
import p000.c32;
import p000.d8d;
import p000.e7a;
import p000.fa4;
import p000.g65;
import p000.i65;
import p000.jfa;
import p000.uq0;
import p000.xfa;
import p000.y5a;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.settings.LessonReviewMenuFragment$onViewCreated$5$8", m4291f = "LessonReviewMenuFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonReviewMenuFragment$onViewCreated$5$8 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f29471a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LessonReviewMenuFragment f29472b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonReviewMenuFragment$onViewCreated$5$8(LessonReviewMenuFragment lessonReviewMenuFragment, Continuation continuation) {
        super(2, continuation);
        this.f29472b = lessonReviewMenuFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LessonReviewMenuFragment$onViewCreated$5$8 lessonReviewMenuFragment$onViewCreated$5$8 = new LessonReviewMenuFragment$onViewCreated$5$8(this.f29472b, continuation);
        lessonReviewMenuFragment$onViewCreated$5$8.f29471a = obj;
        return lessonReviewMenuFragment$onViewCreated$5$8;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        LessonReviewMenuFragment$onViewCreated$5$8 lessonReviewMenuFragment$onViewCreated$5$8 = (LessonReviewMenuFragment$onViewCreated$5$8) create((TooltipStep) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        lessonReviewMenuFragment$onViewCreated$5$8.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        TooltipStep tooltipStep = (TooltipStep) this.f29471a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        if (g65.f40264a[tooltipStep.ordinal()] == 1) {
            LessonReviewMenuFragment lessonReviewMenuFragment = this.f29472b;
            int i = lessonReviewMenuFragment.m2110l().getDisplayMetrics().widthPixels;
            Rect rect = new Rect();
            lessonReviewMenuFragment.m9344R0().f71455l.getGlobalVisibleRect(rect);
            Rect rect2 = new Rect();
            rect2.top = ((int) rect.exactCenterY()) - (rect.height() / 2);
            rect2.right = Math.abs(rect.left - i) - ((int) jfa.m14419b(lessonReviewMenuFragment.m2090R(), 5));
            i65 i65VarM9346T0 = lessonReviewMenuFragment.m9346T0();
            Context contextM2090R = lessonReviewMenuFragment.m2090R();
            C3509qs c3509qs = lessonReviewMenuFragment.f29431F0;
            if (c3509qs == null) {
                fa4.m11636J("appSettings");
                throw null;
            }
            e7a.m10913k0(i65VarM9346T0, new y5a(tooltipStep, d8d.m10163c(tooltipStep, contextM2090R, c3509qs.m20129c())), rect, rect2, false, new uq0(lessonReviewMenuFragment, 11), 24);
        }
        return xfa.f68157a;
    }
}
