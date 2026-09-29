package com.lingq.feature.statistics;

import com.lingq.core.common.util.AbstractC1263a;
import java.time.LocalDate;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c18;
import p000.c32;
import p000.lda;
import p000.un1;
import p000.wq1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.statistics.StatsCalendarViewModel$1", m4291f = "StatsCalendarViewModel.kt", m4292l = {115}, m4293m = "invokeSuspend", m4294v = 2)
final class StatsCalendarViewModel$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f33311a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2818f f33312b;

    /* JADX INFO: renamed from: com.lingq.feature.statistics.StatsCalendarViewModel$1$1 */
    @c32(m4290c = "com.lingq.feature.statistics.StatsCalendarViewModel$1$1", m4291f = "StatsCalendarViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C28031 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f33313a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2818f f33314b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28031(C2818f c2818f, Continuation continuation) {
            super(2, continuation);
            this.f33314b = c2818f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C28031 c28031 = new C28031(this.f33314b, continuation);
            c28031.f33313a = obj;
            return c28031;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C28031 c28031 = (C28031) create((LocalDate) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c28031.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            LocalDate localDate = (LocalDate) this.f33313a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C2818f c2818f = this.f33314b;
            AbstractC1263a.m7047b(lda.m16103C(c2818f), c2818f.f33463d, wq1.m24115k("observeStatsCalendar ", localDate.getMonthValue(), localDate.getYear(), " "), new StatsCalendarViewModel$getStatsCalendar$1(c2818f, localDate, null));
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsCalendarViewModel$1(C2818f c2818f, Continuation continuation) {
        super(2, continuation);
        this.f33312b = c2818f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StatsCalendarViewModel$1(this.f33312b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((StatsCalendarViewModel$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33311a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2818f c2818f = this.f33312b;
            c18 c18Var = c2818f.f33465f;
            C28031 c28031 = new C28031(c2818f, null);
            c18Var.getClass();
            this.f33311a = 1;
            if (AbstractC3224d.m15529h(c18Var, c28031, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        C3386nv.m17633t("SharedFlow never completes, this call should never return.");
        return null;
    }
}
