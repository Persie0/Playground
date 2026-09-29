package com.lingq.feature.statistics;

import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.data.repository.C1294j;
import com.lingq.core.database.dao.C1319g;
import com.lingq.core.domain.model.language.StatsCalendar;
import com.lingq.core.domain.model.language.StatsCalendarDay;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.e83;
import p000.fi9;
import p000.gi9;
import p000.lda;
import p000.m83;
import p000.oo4;
import p000.tl0;
import p000.tn4;
import p000.v91;
import p000.vi3;
import p000.wq1;
import p000.xfa;
import p000.y02;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.statistics.StatsCalendarViewModel$getStatsCalendar$1", m4291f = "StatsCalendarViewModel.kt", m4292l = {54, 70}, m4293m = "invokeSuspend", m4294v = 2)
final class StatsCalendarViewModel$getStatsCalendar$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f33315a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2818f f33316b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ LocalDate f33317c;

    /* JADX INFO: renamed from: com.lingq.feature.statistics.StatsCalendarViewModel$getStatsCalendar$1$1 */
    @c32(m4290c = "com.lingq.feature.statistics.StatsCalendarViewModel$getStatsCalendar$1$1", m4291f = "StatsCalendarViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C28041 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C2818f f33318a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LocalDate f33319b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28041(C2818f c2818f, LocalDate localDate, Continuation continuation) {
            super(2, continuation);
            this.f33318a = c2818f;
            this.f33319b = localDate;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C28041(this.f33318a, this.f33319b, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C28041 c28041 = (C28041) create((e83) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c28041.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C2818f c2818f = this.f33318a;
            C3244l c3244l = c2818f.f33466g;
            LocalDate localDate = this.f33319b;
            ArrayList arrayListM24811i = y02.m24811i(localDate.getYear(), localDate.getMonthValue());
            ArrayList arrayList = new ArrayList(v91.m23189q0(arrayListM24811i, 10));
            Iterator it = arrayListM24811i.iterator();
            while (it.hasNext()) {
                arrayList.add(new tl0((LocalDate) it.next(), 0, 0));
            }
            fi9 fi9Var = new fi9(arrayList);
            c3244l.getClass();
            c3244l.m15572j(null, fi9Var);
            int year = localDate.getYear();
            int monthValue = localDate.getMonthValue();
            AbstractC1263a.m7047b(lda.m16103C(c2818f), c2818f.f33463d, wq1.m24115k("networkStatsCalendar ", year, monthValue, " "), new StatsCalendarViewModel$networkStatsCalendar$1(year, monthValue, c2818f, null));
            return xfa.f68157a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.feature.statistics.StatsCalendarViewModel$getStatsCalendar$1$2 */
    @c32(m4290c = "com.lingq.feature.statistics.StatsCalendarViewModel$getStatsCalendar$1$2", m4291f = "StatsCalendarViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C28052 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f33320a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2818f f33321b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28052(C2818f c2818f, Continuation continuation) {
            super(2, continuation);
            this.f33321b = c2818f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C28052 c28052 = new C28052(this.f33321b, continuation);
            c28052.f33320a = obj;
            return c28052;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C28052 c28052 = (C28052) create((StatsCalendar) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c28052.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            StatsCalendar statsCalendar = (StatsCalendar) this.f33320a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            if (statsCalendar != null) {
                C3244l c3244l = this.f33321b.f33466g;
                List<StatsCalendarDay> list = statsCalendar.f19123b;
                ArrayList arrayList = new ArrayList(v91.m23189q0(list, 10));
                for (StatsCalendarDay statsCalendarDay : list) {
                    String str = statsCalendarDay.f19124a;
                    str.getClass();
                    LocalDate localDate = LocalDate.parse(str, DateTimeFormatter.ofPattern("yyyy-MM-dd").withLocale(Locale.getDefault()));
                    localDate.getClass();
                    Double d = statsCalendarDay.f19125b;
                    arrayList.add(new tl0(localDate, (int) (d != null ? d.doubleValue() : 0.0d), statsCalendar.f19122a));
                }
                gi9 gi9Var = new gi9(arrayList);
                c3244l.getClass();
                c3244l.m15572j(null, gi9Var);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsCalendarViewModel$getStatsCalendar$1(C2818f c2818f, LocalDate localDate, Continuation continuation) {
        super(1, continuation);
        this.f33316b = c2818f;
        this.f33317c = localDate;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new StatsCalendarViewModel$getStatsCalendar$1(this.f33316b, this.f33317c, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((StatsCalendarViewModel$getStatsCalendar$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006f, code lost:
    
        if (kotlinx.coroutines.flow.AbstractC3224d.m15529h(r4, r14, r13) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33315a;
        LocalDate localDate = this.f33317c;
        C2818f c2818f = this.f33316b;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
            } else {
                if (i != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            return xfa.f68157a;
        }
        AbstractC3193b.m15359b(obj);
        oo4 oo4Var = c2818f.f33462c;
        String strMo4589b2 = c2818f.f33461b.mo4589b2();
        int year = localDate.getYear();
        int monthValue = localDate.getMonthValue();
        this.f33315a = 1;
        C1319g c1319g = ((C1294j) oo4Var).f16493a;
        c1319g.getClass();
        strMo4589b2.getClass();
        obj = AbstractC3224d.m15536o(AbstractC3584sr.m21590A(c1319g.f17026K, false, new String[]{"StatsCalendarEntity"}, new tn4(strMo4589b2, monthValue, year, c1319g, 0)));
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
        m83 m83Var = new m83((c83) obj, new C28041(c2818f, localDate, null));
        C28052 c28052 = new C28052(c2818f, null);
        this.f33315a = 2;
    }
}
