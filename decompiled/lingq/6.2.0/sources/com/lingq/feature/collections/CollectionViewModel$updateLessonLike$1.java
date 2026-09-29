package com.lingq.feature.collections;

import com.lingq.core.analytics.data.LqAnalyticsValues$LikeLocation;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.l91;
import p000.n23;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.collections.CollectionViewModel$updateLessonLike$1", m4291f = "CollectionViewModel.kt", m4292l = {655}, m4293m = "invokeSuspend", m4294v = 2)
final class CollectionViewModel$updateLessonLike$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f25527a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2034d f25528b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ l91 f25529c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f25530d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ LqAnalyticsValues$LikeLocation f25531e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionViewModel$updateLessonLike$1(C2034d c2034d, l91 l91Var, int i, LqAnalyticsValues$LikeLocation lqAnalyticsValues$LikeLocation, Continuation continuation) {
        super(2, continuation);
        this.f25528b = c2034d;
        this.f25529c = l91Var;
        this.f25530d = i;
        this.f25531e = lqAnalyticsValues$LikeLocation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CollectionViewModel$updateLessonLike$1(this.f25528b, this.f25529c, this.f25530d, this.f25531e, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((CollectionViewModel$updateLessonLike$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25527a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            n23 n23Var = this.f25528b.f25547F;
            String str = this.f25529c.f49324a;
            String value = this.f25531e.getValue();
            this.f25527a = 1;
            if (n23Var.m17184a(str, this.f25530d, value, this) == coroutineSingletons) {
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
