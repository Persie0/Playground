package com.lingq.core.database.dao;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.database.dao.LanguageStatsDao_Impl$repairStreak$2", m4291f = "LanguageStatsDao_Impl.kt", m4292l = {575}, m4293m = "invokeSuspend", m4294v = 2)
final class LanguageStatsDao_Impl$repairStreak$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f16962a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1319g f16963b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f16964c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f16965d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageStatsDao_Impl$repairStreak$2(C1319g c1319g, String str, int i, Continuation continuation) {
        super(1, continuation);
        this.f16963b = c1319g;
        this.f16964c = str;
        this.f16965d = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new LanguageStatsDao_Impl$repairStreak$2(this.f16963b, this.f16964c, this.f16965d, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((LanguageStatsDao_Impl$repairStreak$2) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f16962a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f16962a = 1;
            if (C1319g.m7479D0(this.f16963b, this.f16964c, this.f16965d, this) == coroutineSingletons) {
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
