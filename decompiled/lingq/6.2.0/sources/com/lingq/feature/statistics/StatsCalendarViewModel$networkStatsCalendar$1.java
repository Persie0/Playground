package com.lingq.feature.statistics;

import com.lingq.core.data.repository.C1294j;
import java.time.LocalDate;
import java.util.ArrayList;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.oo4;
import p000.u91;
import p000.vi3;
import p000.xfa;
import p000.y02;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.statistics.StatsCalendarViewModel$networkStatsCalendar$1", m4291f = "StatsCalendarViewModel.kt", m4292l = {95}, m4293m = "invokeSuspend", m4294v = 2)
final class StatsCalendarViewModel$networkStatsCalendar$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f33322a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f33323b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f33324c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2818f f33325d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsCalendarViewModel$networkStatsCalendar$1(int i, int i2, C2818f c2818f, Continuation continuation) {
        super(1, continuation);
        this.f33323b = i;
        this.f33324c = i2;
        this.f33325d = c2818f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new StatsCalendarViewModel$networkStatsCalendar$1(this.f33323b, this.f33324c, this.f33325d, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((StatsCalendarViewModel$networkStatsCalendar$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33322a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            ArrayList arrayListM24811i = y02.m24811i(this.f33323b, this.f33324c);
            String strM24813k = y02.m24813k("yyyy-MM-dd", (LocalDate) u91.m22589G0(arrayListM24811i));
            String strM24813k2 = y02.m24813k("yyyy-MM-dd", (LocalDate) u91.m22597O0(arrayListM24811i));
            C2818f c2818f = this.f33325d;
            oo4 oo4Var = c2818f.f33462c;
            String strMo4589b2 = c2818f.f33461b.mo4589b2();
            this.f33322a = 1;
            if (((C1294j) oo4Var).m7232f(this.f33323b, this.f33324c, strMo4589b2, strM24813k, strM24813k2, this) == coroutineSingletons) {
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
