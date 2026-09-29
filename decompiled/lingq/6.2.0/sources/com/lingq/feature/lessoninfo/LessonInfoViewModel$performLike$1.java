package com.lingq.feature.lessoninfo;

import com.lingq.core.analytics.data.LqAnalyticsValues$LikeLocation;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.n23;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.lessoninfo.LessonInfoViewModel$performLike$1", m4291f = "LessonInfoViewModel.kt", m4292l = {406}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonInfoViewModel$performLike$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26384a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2132c f26385b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonInfoViewModel$performLike$1(C2132c c2132c, Continuation continuation) {
        super(2, continuation);
        this.f26385b = c2132c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonInfoViewModel$performLike$1(this.f26385b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonInfoViewModel$performLike$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26384a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2132c c2132c = this.f26385b;
            n23 n23Var = c2132c.f26422m;
            String strMo4589b2 = c2132c.f26411b.mo4589b2();
            int i2 = c2132c.f26429t.f66282a;
            String value = LqAnalyticsValues$LikeLocation.LessonInfo.getValue();
            this.f26384a = 1;
            if (n23Var.m17184a(strMo4589b2, i2, value, this) == coroutineSingletons) {
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
