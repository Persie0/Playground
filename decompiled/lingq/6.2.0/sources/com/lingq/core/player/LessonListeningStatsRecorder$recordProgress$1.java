package com.lingq.core.player;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.d65;
import p000.nr9;
import p000.un1;
import p000.v45;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.player.LessonListeningStatsRecorder$recordProgress$1", m4291f = "LessonListeningStatsRecorder.kt", m4292l = {65}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonListeningStatsRecorder$recordProgress$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f21889a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1807a f21890b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ v45 f21891c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ double f21892d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonListeningStatsRecorder$recordProgress$1(C1807a c1807a, v45 v45Var, double d, Continuation continuation) {
        super(2, continuation);
        this.f21890b = c1807a;
        this.f21891c = v45Var;
        this.f21892d = d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonListeningStatsRecorder$recordProgress$1(this.f21890b, this.f21891c, this.f21892d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonListeningStatsRecorder$recordProgress$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f21889a;
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
        nr9 nr9Var = this.f21890b.f21938b;
        v45 v45Var = this.f21891c;
        String str = v45Var.f64841b;
        int i2 = v45Var.f64842c;
        this.f21889a = 1;
        Object objM10120d = d65.m10120d((d65) nr9Var.f53173a, str, i2, this.f21892d, 0.0d, this, 8);
        if (objM10120d != coroutineSingletons) {
            objM10120d = xfaVar;
        }
        return objM10120d == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
