package com.lingq.feature.reader.stats;

import com.lingq.core.analytics.data.LqAnalyticsValues$LikeLocation;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.n23;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.LessonCompleteViewModel$updateLike$1", m4291f = "LessonCompleteViewModel.kt", m4292l = {952}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonCompleteViewModel$updateLike$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f30718a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2535j f30719b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteViewModel$updateLike$1(C2535j c2535j, Continuation continuation) {
        super(1, continuation);
        this.f30719b = c2535j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new LessonCompleteViewModel$updateLike$1(this.f30719b, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((LessonCompleteViewModel$updateLike$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f30718a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2535j c2535j = this.f30719b;
            n23 n23Var = c2535j.f30799I;
            String strMo4589b2 = c2535j.f30818b.mo4589b2();
            int i2 = c2535j.f30803M;
            String value = LqAnalyticsValues$LikeLocation.LessonComplete.getValue();
            this.f30718a = 1;
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
