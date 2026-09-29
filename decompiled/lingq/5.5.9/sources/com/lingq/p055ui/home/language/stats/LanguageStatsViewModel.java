package com.lingq.p055ui.home.language.stats;

import ae.C0062b;
import android.os.CountDownTimer;
import androidx.activity.result.C0204c;
import androidx.view.AbstractC1036h0;
import androidx.view.C1024c0;
import ci.InterfaceC2009b;
import ci.InterfaceC2013f;
import cm.InterfaceC2041a;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.domain.Resource;
import com.lingq.shared.uimodel.language.LanguageProgressMetric;
import com.lingq.shared.uimodel.language.LanguageProgressPeriod;
import com.lingq.shared.uimodel.language.LanguageProgressSort;
import com.lingq.shared.uimodel.language.UserLanguage;
import com.lingq.shared.uimodel.language.UserLanguageStudyStats;
import com.lingq.shared.uimodel.language.UserStudyStatsScore;
import com.lingq.util.C4924a;
import com.lingq.util.CoroutineJobManager;
import dm.C5207g;
import gi.C5804b;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.C6744b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.C7120g;
import kotlinx.coroutines.flow.C7131l;
import kotlinx.coroutines.flow.C7135p;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7117d;
import kotlinx.coroutines.flow.InterfaceC7142w;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.internal.C7127c;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import kotlinx.coroutines.scheduling.ExecutorC7177a;
import mo.C7661i;
import no.C7828f;
import no.InterfaceC7882z;
import p015ak.InterfaceC0113j;
import p076di.InterfaceC5179a;
import p076di.InterfaceC5182d;
import p225kk.C6715l;
import p260m8.C7499b;
import p278nh.AbstractC7791r;
import p278nh.C7779f;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/ui/home/language/stats/LanguageStatsViewModel;", "Landroidx/lifecycle/h0;", "Lak/j;", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LanguageStatsViewModel extends AbstractC1036h0 implements InterfaceC0113j {

    /* JADX INFO: renamed from: H */
    public final StateFlowImpl f24284H;

    /* JADX INFO: renamed from: I */
    public final C7135p f24285I;

    /* JADX INFO: renamed from: J */
    public final StateFlowImpl f24286J;

    /* JADX INFO: renamed from: K */
    public final StateFlowImpl f24287K;

    /* JADX INFO: renamed from: L */
    public final StateFlowImpl f24288L;

    /* JADX INFO: renamed from: M */
    public final StateFlowImpl f24289M;

    /* JADX INFO: renamed from: N */
    public CountDownTimerC3716a f24290N;

    /* JADX INFO: renamed from: O */
    public final StateFlowImpl f24291O;

    /* JADX INFO: renamed from: P */
    public final StateFlowImpl f24292P;

    /* JADX INFO: renamed from: Q */
    public final StateFlowImpl f24293Q;

    /* JADX INFO: renamed from: R */
    public final StateFlowImpl f24294R;

    /* JADX INFO: renamed from: S */
    public final StateFlowImpl f24295S;

    /* JADX INFO: renamed from: T */
    public final StateFlowImpl f24296T;

    /* JADX INFO: renamed from: U */
    public final StateFlowImpl f24297U;

    /* JADX INFO: renamed from: V */
    public final StateFlowImpl f24298V;

    /* JADX INFO: renamed from: W */
    public final StateFlowImpl f24299W;

    /* JADX INFO: renamed from: X */
    public final StateFlowImpl f24300X;

    /* JADX INFO: renamed from: Y */
    public final C7135p f24301Y;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2013f f24302d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2009b f24303e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC5179a f24304f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC5182d f24305g;

    /* JADX INFO: renamed from: h */
    public final CoroutineDispatcher f24306h;

    /* JADX INFO: renamed from: i */
    public final CoroutineJobManager f24307i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC0113j f24308j;

    /* JADX INFO: renamed from: k */
    public final StateFlowImpl f24309k;

    /* JADX INFO: renamed from: l */
    public final StateFlowImpl f24310l;

    /* JADX INFO: renamed from: com.lingq.ui.home.language.stats.LanguageStatsViewModel$1 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.language.stats.LanguageStatsViewModel$1", m19206f = "LanguageStatsViewModel.kt", m19207l = {306}, m19208m = "invokeSuspend")
    final class C37151 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f24311e;

        /* JADX INFO: renamed from: com.lingq.ui.home.language.stats.LanguageStatsViewModel$1$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "isToday", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.language.stats.LanguageStatsViewModel$1$1", m19206f = "LanguageStatsViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<Boolean, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ boolean f24313e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ LanguageStatsViewModel f24314f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(LanguageStatsViewModel languageStatsViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f24314f = languageStatsViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f24314f, interfaceC9968c);
                anonymousClass1.f24313e = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(Boolean bool, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(Boolean.valueOf(bool.booleanValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                String key = this.f24313e ? LanguageProgressSort.Today.getKey() : LanguageProgressSort.AllTime.getKey();
                LanguageStatsViewModel languageStatsViewModel = this.f24314f;
                languageStatsViewModel.getClass();
                C7499b.m14933c0(C8573r0.m16767w0(languageStatsViewModel), languageStatsViewModel.f24307i, languageStatsViewModel.f24306h, "observableTodayProgress", new LanguageStatsViewModel$observableTodayProgress$1(languageStatsViewModel, key, null));
                languageStatsViewModel.getClass();
                C7499b.m14933c0(C8573r0.m16767w0(languageStatsViewModel), languageStatsViewModel.f24307i, languageStatsViewModel.f24306h, "networkTodayProgress", new LanguageStatsViewModel$networkTodayProgress$1(languageStatsViewModel, key, null));
                return C9072e.f47360a;
            }
        }

        public C37151(InterfaceC9968c<? super C37151> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return LanguageStatsViewModel.this.new C37151(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C37151) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f24311e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                LanguageStatsViewModel languageStatsViewModel = LanguageStatsViewModel.this;
                StateFlowImpl stateFlowImpl = languageStatsViewModel.f24298V;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(languageStatsViewModel, null);
                this.f24311e = 1;
                if (C0062b.m369m0(stateFlowImpl, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.language.stats.LanguageStatsViewModel$a */
    public static final class CountDownTimerC3716a extends CountDownTimer {
        public CountDownTimerC3716a(long j10) {
            super(j10, 1000L);
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j10) {
            String strM10488z = C4924a.m10488z(j10);
            boolean zM15250P2 = C7661i.m15250P2(strM10488z);
            LanguageStatsViewModel languageStatsViewModel = LanguageStatsViewModel.this;
            if (zM15250P2) {
                languageStatsViewModel.m9919n2();
            } else {
                languageStatsViewModel.f24288L.setValue(strM10488z);
            }
        }
    }

    public LanguageStatsViewModel(InterfaceC2013f interfaceC2013f, InterfaceC2009b interfaceC2009b, InterfaceC0113j interfaceC0113j, InterfaceC5179a interfaceC5179a, InterfaceC5182d interfaceC5182d, ExecutorC7177a executorC7177a, CoroutineJobManager coroutineJobManager, C1024c0 c1024c0) {
        C5207g.m11111f(interfaceC2013f, "languageStatsRepository");
        C5207g.m11111f(interfaceC2009b, "challengeRepository");
        C5207g.m11111f(interfaceC0113j, "userSessionViewModelDelegate");
        C5207g.m11111f(interfaceC5179a, "preferenceStore");
        C5207g.m11111f(interfaceC5182d, "utilStore");
        C5207g.m11111f(c1024c0, "savedStateHandle");
        this.f24302d = interfaceC2013f;
        this.f24303e = interfaceC2009b;
        this.f24304f = interfaceC5179a;
        this.f24305g = interfaceC5182d;
        this.f24306h = executorC7177a;
        this.f24307i = coroutineJobManager;
        this.f24308j = interfaceC0113j;
        StateFlowImpl stateFlowImplM14379a = C7120g.m14379a("");
        this.f24309k = stateFlowImplM14379a;
        Boolean bool = Boolean.FALSE;
        StateFlowImpl stateFlowImplM14379a2 = C7120g.m14379a(bool);
        this.f24310l = stateFlowImplM14379a2;
        Resource.Status status = Resource.Status.LOADING;
        StateFlowImpl stateFlowImplM14379a3 = C7120g.m14379a(status);
        this.f24284H = stateFlowImplM14379a3;
        InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(this);
        StartedWhileSubscribed startedWhileSubscribed = C6715l.f37936a;
        this.f24285I = C0062b.m353h2(stateFlowImplM14379a3, interfaceC7882zM16767w0, startedWhileSubscribed, status);
        this.f24286J = C7120g.m14379a(status);
        StateFlowImpl stateFlowImplM14379a4 = C7120g.m14379a(status);
        this.f24287K = stateFlowImplM14379a4;
        StateFlowImpl stateFlowImplM14379a5 = C7120g.m14379a("");
        this.f24288L = stateFlowImplM14379a5;
        this.f24289M = stateFlowImplM14379a5;
        StateFlowImpl stateFlowImplM14379a6 = C7120g.m14379a(new Pair(null, bool));
        this.f24291O = stateFlowImplM14379a6;
        ChannelFlowTransformLatest channelFlowTransformLatestM399t2 = C0062b.m399t2(stateFlowImplM14379a6, new LanguageStatsViewModel$_streakItem$1(this, null));
        InterfaceC7882z interfaceC7882zM16767w1 = C8573r0.m16767w0(this);
        EmptyList emptyList = EmptyList.f38032a;
        C7135p c7135pM353h2 = C0062b.m353h2(channelFlowTransformLatestM399t2, interfaceC7882zM16767w1, startedWhileSubscribed, new AbstractC7791r.j(0, emptyList, false, true));
        StateFlowImpl stateFlowImplM14379a7 = C7120g.m14379a(null);
        this.f24292P = stateFlowImplM14379a7;
        C7135p c7135pM353h3 = C0062b.m353h2(new C7131l(stateFlowImplM14379a6, stateFlowImplM14379a7, new LanguageStatsViewModel$_showRepairStreak$1(null)), C8573r0.m16767w0(this), startedWhileSubscribed, null);
        StateFlowImpl stateFlowImplM14379a8 = C7120g.m14379a(new Pair(new C7779f(emptyList), new C7779f(emptyList)));
        this.f24293Q = stateFlowImplM14379a8;
        C7135p c7135pM353h4 = C0062b.m353h2(C0062b.m399t2(stateFlowImplM14379a8, new LanguageStatsViewModel$_activityItems$1(null)), C8573r0.m16767w0(this), startedWhileSubscribed, new AbstractC7791r.c(new C7779f(emptyList), new C7779f(emptyList), true));
        Boolean bool2 = Boolean.TRUE;
        StateFlowImpl stateFlowImplM14379a9 = C7120g.m14379a(new Triple(emptyList, 0, bool2));
        this.f24294R = stateFlowImplM14379a9;
        C7135p c7135pM353h5 = C0062b.m353h2(C0062b.m399t2(stateFlowImplM14379a9, new LanguageStatsViewModel$_goalItems$1(null)), C8573r0.m16767w0(this), startedWhileSubscribed, new AbstractC7791r.g(0, emptyList, true));
        this.f24295S = C7120g.m14379a(emptyList);
        StateFlowImpl stateFlowImplM14379a10 = C7120g.m14379a(emptyList);
        this.f24296T = stateFlowImplM14379a10;
        C7135p c7135pM353h6 = C0062b.m353h2(C0062b.m385q0(stateFlowImplM14379a10, stateFlowImplM14379a4, new LanguageStatsViewModel$_challengesItems$1(null)), C8573r0.m16767w0(this), startedWhileSubscribed, new AbstractC7791r.b(emptyList, true));
        StateFlowImpl stateFlowImplM14379a11 = C7120g.m14379a(null);
        this.f24297U = stateFlowImplM14379a11;
        StateFlowImpl stateFlowImplM14379a12 = C7120g.m14379a(bool2);
        this.f24298V = stateFlowImplM14379a12;
        C7135p c7135pM353h7 = C0062b.m353h2(C0062b.m393s0(stateFlowImplM14379a6, stateFlowImplM14379a11, mo504j1(), stateFlowImplM14379a12, new LanguageStatsViewModel$_todayStats$1(null)), C8573r0.m16767w0(this), startedWhileSubscribed, new AbstractC7791r.o(0.0d, 0, 0, 0, 0, 0, 0));
        this.f24299W = C7120g.m14379a(LanguageProgressMetric.KnownWords);
        this.f24300X = C7120g.m14379a(LanguageProgressPeriod.Last7Days);
        final InterfaceC7116c[] interfaceC7116cArr = {c7135pM353h7, c7135pM353h2, c7135pM353h4, stateFlowImplM14379a, c7135pM353h5, c7135pM353h6, stateFlowImplM14379a2, stateFlowImplM14379a12, c7135pM353h3};
        this.f24301Y = C0062b.m353h2(new InterfaceC7116c<List<AbstractC7791r>>() { // from class: com.lingq.ui.home.language.stats.LanguageStatsViewModel$special$$inlined$combine$1

            /* JADX INFO: renamed from: com.lingq.ui.home.language.stats.LanguageStatsViewModel$special$$inlined$combine$1$3 */
            @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, m13365d2 = {"T", "R", "Lkotlinx/coroutines/flow/d;", "", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
            @InterfaceC10224c(m19205c = "com.lingq.ui.home.language.stats.LanguageStatsViewModel$special$$inlined$combine$1$3", m19206f = "LanguageStatsViewModel.kt", m19207l = {238}, m19208m = "invokeSuspend")
            public static final class C37273 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super List<AbstractC7791r>>, Object[], InterfaceC9968c<? super C9072e>, Object> {

                /* JADX INFO: renamed from: e */
                public int f24380e;

                /* JADX INFO: renamed from: f */
                public /* synthetic */ InterfaceC7117d f24381f;

                /* JADX INFO: renamed from: g */
                public /* synthetic */ Object[] f24382g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ LanguageStatsViewModel f24383h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C37273(LanguageStatsViewModel languageStatsViewModel, InterfaceC9968c interfaceC9968c) {
                    super(3, interfaceC9968c);
                    this.f24383h = languageStatsViewModel;
                }

                @Override // cm.InterfaceC2057q
                /* JADX INFO: renamed from: M */
                public final Object mo1343M(InterfaceC7117d<? super List<AbstractC7791r>> interfaceC7117d, Object[] objArr, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                    C37273 c37273 = new C37273(this.f24383h, interfaceC9968c);
                    c37273.f24381f = interfaceC7117d;
                    c37273.f24382g = objArr;
                    return c37273.mo1338x(C9072e.f47360a);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /* JADX INFO: renamed from: x */
                public final Object mo1338x(Object obj) throws Throwable {
                    UserLanguageStudyStats userLanguageStudyStats;
                    UserLanguageStudyStats userLanguageStudyStats2;
                    UserLanguageStudyStats userLanguageStudyStats3;
                    List<UserStudyStatsScore> list;
                    UserStudyStatsScore userStudyStatsScore;
                    C5804b c5804b;
                    UserLanguageStudyStats userLanguageStudyStats4;
                    UserLanguageStudyStats userLanguageStudyStats5;
                    UserLanguageStudyStats userLanguageStudyStats6;
                    List<UserStudyStatsScore> list2;
                    UserStudyStatsScore userStudyStatsScore2;
                    C5804b c5804b2;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i10 = this.f24380e;
                    if (i10 == 0) {
                        C7499b.m14977z0(obj);
                        InterfaceC7117d interfaceC7117d = this.f24381f;
                        Object[] objArr = this.f24382g;
                        ArrayList arrayList = new ArrayList();
                        Object obj2 = objArr[6];
                        C5207g.m11109d(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                        LanguageStatsViewModel languageStatsViewModel = this.f24383h;
                        if (zBooleanValue) {
                            Object obj3 = objArr[7];
                            C5207g.m11109d(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            arrayList.add(new AbstractC7791r.p(((Boolean) obj3).booleanValue()));
                            Object obj4 = objArr[8];
                            Pair pair = obj4 instanceof Pair ? (Pair) obj4 : null;
                            Object obj5 = objArr[1];
                            C5207g.m11109d(obj5, "null cannot be cast to non-null type com.lingq.commons.ui.StatsItem.Streak");
                            AbstractC7791r.j jVar = (AbstractC7791r.j) obj5;
                            arrayList.add(new AbstractC7791r.m(new Integer(jVar.f42839a), (pair == null || (c5804b2 = (C5804b) pair.f38012a) == null) ? null : new Integer(c5804b2.f35074b), (pair == null || (userLanguageStudyStats6 = (UserLanguageStudyStats) pair.f38013b) == null || (list2 = userLanguageStudyStats6.f21791f) == null || (userStudyStatsScore2 = list2.get(5)) == null) ? null : new Integer(userStudyStatsScore2.f21800c), (pair == null || (userLanguageStudyStats5 = (UserLanguageStudyStats) pair.f38013b) == null) ? null : new Integer(userLanguageStudyStats5.f21787b), (pair == null || (userLanguageStudyStats4 = (UserLanguageStudyStats) pair.f38013b) == null) ? null : new Integer(userLanguageStudyStats4.f21792g)));
                            arrayList.add(jVar);
                            Object obj6 = objArr[0];
                            C5207g.m11109d(obj6, "null cannot be cast to non-null type com.lingq.commons.ui.StatsItem.Today");
                            arrayList.add((AbstractC7791r.o) obj6);
                            arrayList.add(new AbstractC7791r.q(C6744b.m13391w0(LanguageProgressMetric.values()), C6744b.m13391w0(LanguageProgressPeriod.values()), ((LanguageProgressMetric) languageStatsViewModel.f24299W.getValue()).getKey(), ((LanguageProgressPeriod) languageStatsViewModel.f24300X.getValue()).getKey()));
                            List listM13391w0 = C6744b.m13391w0(LanguageProgressSort.values());
                            Object obj7 = objArr[3];
                            C5207g.m11109d(obj7, "null cannot be cast to non-null type kotlin.String");
                            arrayList.add(new AbstractC7791r.f((String) obj7, listM13391w0));
                            Object obj8 = objArr[4];
                            C5207g.m11109d(obj8, "null cannot be cast to non-null type com.lingq.commons.ui.StatsItem.Goals");
                            arrayList.add((AbstractC7791r.g) obj8);
                            Object obj9 = objArr[2];
                            C5207g.m11109d(obj9, "null cannot be cast to non-null type com.lingq.commons.ui.StatsItem.CombinedLineGraph");
                            arrayList.add((AbstractC7791r.c) obj9);
                            arrayList.add(new AbstractC7791r.n());
                            Object obj10 = objArr[5];
                            C5207g.m11109d(obj10, "null cannot be cast to non-null type com.lingq.commons.ui.StatsItem.Challenges");
                            arrayList.add((AbstractC7791r.b) obj10);
                        } else {
                            coroutineSingletons = coroutineSingletons;
                            Object obj11 = objArr[7];
                            C5207g.m11109d(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            arrayList.add(new AbstractC7791r.p(((Boolean) obj11).booleanValue()));
                            Object obj12 = objArr[0];
                            C5207g.m11109d(obj12, "null cannot be cast to non-null type com.lingq.commons.ui.StatsItem.Today");
                            arrayList.add((AbstractC7791r.o) obj12);
                            Object obj13 = objArr[1];
                            C5207g.m11109d(obj13, "null cannot be cast to non-null type com.lingq.commons.ui.StatsItem.Streak");
                            AbstractC7791r.j jVar2 = (AbstractC7791r.j) obj13;
                            Object obj14 = objArr[8];
                            Pair pair2 = obj14 instanceof Pair ? (Pair) obj14 : null;
                            arrayList.add(new AbstractC7791r.m(new Integer(jVar2.f42839a), (pair2 == null || (c5804b = (C5804b) pair2.f38012a) == null) ? null : new Integer(c5804b.f35074b), (pair2 == null || (userLanguageStudyStats3 = (UserLanguageStudyStats) pair2.f38013b) == null || (list = userLanguageStudyStats3.f21791f) == null || (userStudyStatsScore = list.get(5)) == null) ? null : new Integer(userStudyStatsScore.f21800c), (pair2 == null || (userLanguageStudyStats2 = (UserLanguageStudyStats) pair2.f38013b) == null) ? null : new Integer(userLanguageStudyStats2.f21787b), (pair2 == null || (userLanguageStudyStats = (UserLanguageStudyStats) pair2.f38013b) == null) ? null : new Integer(userLanguageStudyStats.f21792g)));
                            arrayList.add(jVar2);
                            arrayList.add(new AbstractC7791r.q(C6744b.m13391w0(LanguageProgressMetric.values()), C6744b.m13391w0(LanguageProgressPeriod.values()), ((LanguageProgressMetric) languageStatsViewModel.f24299W.getValue()).getKey(), ((LanguageProgressPeriod) languageStatsViewModel.f24300X.getValue()).getKey()));
                            Object obj15 = objArr[2];
                            C5207g.m11109d(obj15, "null cannot be cast to non-null type com.lingq.commons.ui.StatsItem.CombinedLineGraph");
                            arrayList.add((AbstractC7791r.c) obj15);
                            List listM13391w1 = C6744b.m13391w0(LanguageProgressSort.values());
                            Object obj16 = objArr[3];
                            C5207g.m11109d(obj16, "null cannot be cast to non-null type kotlin.String");
                            arrayList.add(new AbstractC7791r.f((String) obj16, listM13391w1));
                            Object obj17 = objArr[4];
                            C5207g.m11109d(obj17, "null cannot be cast to non-null type com.lingq.commons.ui.StatsItem.Goals");
                            arrayList.add((AbstractC7791r.g) obj17);
                            arrayList.add(new AbstractC7791r.n());
                            Object obj18 = objArr[5];
                            C5207g.m11109d(obj18, "null cannot be cast to non-null type com.lingq.commons.ui.StatsItem.Challenges");
                            arrayList.add((AbstractC7791r.b) obj18);
                        }
                        this.f24380e = 1;
                        Object objMo1339r = interfaceC7117d.mo1339r(arrayList, this);
                        CoroutineSingletons coroutineSingletons2 = coroutineSingletons;
                        if (objMo1339r == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C7499b.m14977z0(obj);
                    }
                    return C9072e.f47360a;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC7116c
            /* JADX INFO: renamed from: a */
            public final Object mo9539a(InterfaceC7117d<? super List<AbstractC7791r>> interfaceC7117d, InterfaceC9968c interfaceC9968c) throws Throwable {
                final InterfaceC7116c[] interfaceC7116cArr2 = interfaceC7116cArr;
                Object objM14386a = C7127c.m14386a(interfaceC9968c, new InterfaceC2041a<Object[]>() { // from class: com.lingq.ui.home.language.stats.LanguageStatsViewModel$special$$inlined$combine$1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final Object[] mo807E() {
                        return new Object[interfaceC7116cArr2.length];
                    }
                }, new C37273(this, null), interfaceC7117d, interfaceC7116cArr2);
                return objM14386a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM14386a : C9072e.f47360a;
            }
        }, C8573r0.m16767w0(this), startedWhileSubscribed, emptyList);
        stateFlowImplM14379a6.setValue(new Pair(null, bool2));
        stateFlowImplM14379a8.setValue(new Pair(new C7779f(emptyList), new C7779f(emptyList)));
        stateFlowImplM14379a9.setValue(new Triple(emptyList, 0, bool2));
        m9918m2();
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C37151(null), 3);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B */
    public final InterfaceC7142w<List<UserLanguage>> mo496B() {
        return this.f24308j.mo496B();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B0 */
    public final Object mo497B0(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f24308j.mo497B0(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: E1 */
    public final String mo498E1() {
        return this.f24308j.mo498E1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: J */
    public final Object mo499J(Profile profile, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f24308j.mo499J(profile, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: P */
    public final InterfaceC7142w<List<String>> mo500P() {
        return this.f24308j.mo500P();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: d */
    public final Object mo501d(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f24308j.mo501d(str, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f0 */
    public final boolean mo502f0() {
        InterfaceC0113j interfaceC0113j = this.f24308j;
        return true;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f1 */
    public final Object mo503f1(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f24308j.mo503f1(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: j1 */
    public final InterfaceC7116c<Profile> mo504j1() {
        return this.f24308j.mo504j1();
    }

    @Override // androidx.view.AbstractC1036h0
    /* JADX INFO: renamed from: j2 */
    public final void mo3725j2() {
        CountDownTimerC3716a countDownTimerC3716a = this.f24290N;
        if (countDownTimerC3716a != null) {
            countDownTimerC3716a.cancel();
        }
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l0 */
    public final Object mo505l0(ProfileAccount profileAccount, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f24308j.mo505l0(profileAccount, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l1 */
    public final boolean mo506l1() {
        return this.f24308j.mo506l1();
    }

    /* JADX INFO: renamed from: l2 */
    public final void m9917l2() {
        C7499b.m14933c0(C8573r0.m16767w0(this), this.f24307i, this.f24306h, ((LanguageProgressMetric) this.f24299W.getValue()).getKey(), new LanguageStatsViewModel$getActivityData$1(this, null));
    }

    /* JADX INFO: renamed from: m2 */
    public final void m9918m2() {
        InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(this);
        LanguageStatsViewModel$getStreak$1 languageStatsViewModel$getStreak$1 = new LanguageStatsViewModel$getStreak$1(this, null);
        CoroutineJobManager coroutineJobManager = this.f24307i;
        CoroutineDispatcher coroutineDispatcher = this.f24306h;
        C7499b.m14933c0(interfaceC7882zM16767w0, coroutineJobManager, coroutineDispatcher, "streak", languageStatsViewModel$getStreak$1);
        C7499b.m14933c0(C8573r0.m16767w0(this), coroutineJobManager, coroutineDispatcher, "update streak", new LanguageStatsViewModel$updateStreak$1(this, null));
        C7499b.m14933c0(C8573r0.m16767w0(this), coroutineJobManager, coroutineDispatcher, "language streak", new LanguageStatsViewModel$getLanguageStreak$1(this, null));
        m9919n2();
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new LanguageStatsViewModel$setLessonFilter$1(this, "", null), 3);
        m9917l2();
        m9920o2();
        C7499b.m14933c0(C8573r0.m16767w0(this), coroutineJobManager, coroutineDispatcher, "activeChallenges", new LanguageStatsViewModel$observeActiveChallenges$1(this, null));
        C7499b.m14933c0(C8573r0.m16767w0(this), coroutineJobManager, coroutineDispatcher, "networkActiveChallenges", new LanguageStatsViewModel$networkActiveChallenges$1(this, null));
    }

    /* JADX INFO: renamed from: n2 */
    public final void m9919n2() {
        Calendar calendar = Calendar.getInstance();
        C5207g.m11110e(calendar, "getInstance()");
        Calendar calendar2 = Calendar.getInstance();
        C5207g.m11110e(calendar2, "getInstance()");
        calendar2.add(5, 1);
        calendar2.set(11, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        CountDownTimerC3716a countDownTimerC3716a = new CountDownTimerC3716a(calendar2.getTimeInMillis() - calendar.getTimeInMillis());
        this.f24290N = countDownTimerC3716a;
        countDownTimerC3716a.start();
    }

    /* JADX INFO: renamed from: o2 */
    public final void m9920o2() {
        C7499b.m14933c0(C8573r0.m16767w0(this), this.f24307i, this.f24306h, C0204c.m852k("update ", ((LanguageProgressMetric) this.f24299W.getValue()).getKey()), new LanguageStatsViewModel$updateActivityData$1(this, null));
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: p1 */
    public final String mo507p1() {
        return this.f24308j.mo507p1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: t1 */
    public final InterfaceC7116c<ProfileAccount> mo508t1() {
        return this.f24308j.mo508t1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: w0 */
    public final InterfaceC7142w<UserLanguage> mo509w0() {
        return this.f24308j.mo509w0();
    }
}
