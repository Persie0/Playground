package com.lingq.feature.reader.tracking;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.d65;
import p000.o23;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.tracking.LessonStudyTrackingController$awardReadCoverage$1", m4291f = "LessonStudyTrackingController.kt", m4292l = {408}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonStudyTrackingController$awardReadCoverage$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31132a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2574a f31133b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ double f31134c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonStudyTrackingController$awardReadCoverage$1(C2574a c2574a, double d, Continuation continuation) {
        super(2, continuation);
        this.f31133b = c2574a;
        this.f31134c = d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonStudyTrackingController$awardReadCoverage$1(this.f31133b, this.f31134c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonStudyTrackingController$awardReadCoverage$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31132a;
        xfa xfaVar = xfa.f68157a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        C2574a c2574a = this.f31133b;
        o23 o23Var = c2574a.f31142b;
        String str = c2574a.f31146f;
        int i2 = c2574a.f31147g;
        this.f31132a = 1;
        Object objM10120d = d65.m10120d(o23Var.f53649a, str, i2, 0.0d, this.f31134c, this, 4);
        if (objM10120d != coroutineSingletons) {
            objM10120d = xfaVar;
        }
        return objM10120d == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
