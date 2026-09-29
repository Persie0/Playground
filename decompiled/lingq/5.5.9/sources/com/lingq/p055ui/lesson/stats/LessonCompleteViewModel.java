package com.lingq.p055ui.lesson.stats;

import ae.C0062b;
import android.content.Context;
import android.os.CountDownTimer;
import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import androidx.view.AbstractC1036h0;
import androidx.view.C1024c0;
import ci.InterfaceC2013f;
import ci.InterfaceC2014g;
import ci.InterfaceC2019l;
import cm.InterfaceC2041a;
import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.domain.Resource;
import com.lingq.shared.repository.InterfaceC3324a;
import com.lingq.shared.uimodel.language.LanguageProgressMetric;
import com.lingq.shared.uimodel.language.LanguageProgressPeriod;
import com.lingq.shared.uimodel.language.UserLanguage;
import com.lingq.shared.uimodel.language.UserLanguageStudyStats;
import com.lingq.shared.uimodel.language.UserStudyStatsScore;
import com.lingq.util.C4924a;
import com.lingq.util.CoroutineJobManager;
import com.linguist.R;
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
import kotlinx.coroutines.flow.C7134o;
import kotlinx.coroutines.flow.C7135p;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7117d;
import kotlinx.coroutines.flow.InterfaceC7142w;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.internal.C7127c;
import kotlinx.coroutines.scheduling.ExecutorC7177a;
import mo.C7661i;
import no.C7828f;
import no.InterfaceC7882z;
import p015ak.InterfaceC0113j;
import p076di.InterfaceC5179a;
import p076di.InterfaceC5180b;
import p225kk.C6715l;
import p260m8.C7499b;
import p278nh.AbstractC7791r;
import p278nh.C7779f;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/ui/lesson/stats/LessonCompleteViewModel;", "Landroidx/lifecycle/h0;", "Lak/j;", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LessonCompleteViewModel extends AbstractC1036h0 implements InterfaceC0113j {

    /* JADX INFO: renamed from: H */
    public final int f28973H;

    /* JADX INFO: renamed from: I */
    public final StateFlowImpl f28974I;

    /* JADX INFO: renamed from: J */
    public final StateFlowImpl f28975J;

    /* JADX INFO: renamed from: K */
    public final StateFlowImpl f28976K;

    /* JADX INFO: renamed from: L */
    public final C7135p f28977L;

    /* JADX INFO: renamed from: M */
    public final StateFlowImpl f28978M;

    /* JADX INFO: renamed from: N */
    public final C7138s f28979N;

    /* JADX INFO: renamed from: O */
    public final C7134o f28980O;

    /* JADX INFO: renamed from: P */
    public final C7138s f28981P;

    /* JADX INFO: renamed from: Q */
    public final C7134o f28982Q;

    /* JADX INFO: renamed from: R */
    public final C7138s f28983R;

    /* JADX INFO: renamed from: S */
    public final C7134o f28984S;

    /* JADX INFO: renamed from: T */
    public final C7138s f28985T;

    /* JADX INFO: renamed from: U */
    public final C7134o f28986U;

    /* JADX INFO: renamed from: V */
    public final C7138s f28987V;

    /* JADX INFO: renamed from: W */
    public final C7134o f28988W;

    /* JADX INFO: renamed from: X */
    public final C7138s f28989X;

    /* JADX INFO: renamed from: Y */
    public final C7134o f28990Y;

    /* JADX INFO: renamed from: Z */
    public final StateFlowImpl f28991Z;

    /* JADX INFO: renamed from: a0 */
    public final StateFlowImpl f28992a0;

    /* JADX INFO: renamed from: b0 */
    public final C7135p f28993b0;

    /* JADX INFO: renamed from: c0 */
    public CountDownTimerC4427a f28994c0;

    /* JADX INFO: renamed from: d */
    public final InterfaceC3324a f28995d;

    /* JADX INFO: renamed from: d0 */
    public final StateFlowImpl f28996d0;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2019l f28997e;

    /* JADX INFO: renamed from: e0 */
    public final StateFlowImpl f28998e0;

    /* JADX INFO: renamed from: f */
    public final InterfaceC2013f f28999f;

    /* JADX INFO: renamed from: f0 */
    public final StateFlowImpl f29000f0;

    /* JADX INFO: renamed from: g */
    public final InterfaceC2014g f29001g;

    /* JADX INFO: renamed from: g0 */
    public final StateFlowImpl f29002g0;

    /* JADX INFO: renamed from: h */
    public final InterfaceC5180b f29003h;

    /* JADX INFO: renamed from: h0 */
    public final StateFlowImpl f29004h0;

    /* JADX INFO: renamed from: i */
    public final CoroutineDispatcher f29005i;

    /* JADX INFO: renamed from: i0 */
    public final StateFlowImpl f29006i0;

    /* JADX INFO: renamed from: j */
    public final CoroutineJobManager f29007j;

    /* JADX INFO: renamed from: j0 */
    public final StateFlowImpl f29008j0;

    /* JADX INFO: renamed from: k */
    public final InterfaceC5179a f29009k;

    /* JADX INFO: renamed from: k0 */
    public final C7135p f29010k0;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC0113j f29011l;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.stats.LessonCompleteViewModel$a */
    public static final class CountDownTimerC4427a extends CountDownTimer {
        public CountDownTimerC4427a(long j10) {
            super(j10, 1000L);
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j10) {
            String strM10488z = C4924a.m10488z(j10);
            boolean zM15250P2 = C7661i.m15250P2(strM10488z);
            LessonCompleteViewModel lessonCompleteViewModel = LessonCompleteViewModel.this;
            if (zM15250P2) {
                lessonCompleteViewModel.m10221m2();
            } else {
                lessonCompleteViewModel.f28992a0.setValue(strM10488z);
            }
        }
    }

    public LessonCompleteViewModel(InterfaceC3324a interfaceC3324a, InterfaceC2019l interfaceC2019l, InterfaceC2013f interfaceC2013f, InterfaceC2014g interfaceC2014g, InterfaceC5180b interfaceC5180b, final Context context, ExecutorC7177a executorC7177a, CoroutineJobManager coroutineJobManager, InterfaceC5179a interfaceC5179a, InterfaceC0113j interfaceC0113j, C1024c0 c1024c0) {
        C5207g.m11111f(interfaceC3324a, "lessonRepository");
        C5207g.m11111f(interfaceC2019l, "playlistRepository");
        C5207g.m11111f(interfaceC2013f, "languageStatsRepository");
        C5207g.m11111f(interfaceC2014g, "libraryRepository");
        C5207g.m11111f(interfaceC5180b, "profileStore");
        C5207g.m11111f(interfaceC5179a, "preferenceStore");
        C5207g.m11111f(interfaceC0113j, "userSessionViewModelDelegate");
        C5207g.m11111f(c1024c0, "savedStateHandle");
        this.f28995d = interfaceC3324a;
        this.f28997e = interfaceC2019l;
        this.f28999f = interfaceC2013f;
        this.f29001g = interfaceC2014g;
        this.f29003h = interfaceC5180b;
        this.f29005i = executorC7177a;
        this.f29007j = coroutineJobManager;
        this.f29009k = interfaceC5179a;
        this.f29011l = interfaceC0113j;
        Integer num = (Integer) c1024c0.m3929b("lessonId");
        int iIntValue = num != null ? num.intValue() : 0;
        this.f28973H = iIntValue;
        Boolean bool = Boolean.TRUE;
        StateFlowImpl stateFlowImplM14379a = C7120g.m14379a(bool);
        this.f28974I = stateFlowImplM14379a;
        this.f28975J = C7120g.m14379a(0);
        StateFlowImpl stateFlowImplM14379a2 = C7120g.m14379a(null);
        this.f28976K = stateFlowImplM14379a2;
        InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(this);
        StartedWhileSubscribed startedWhileSubscribed = C6715l.f37936a;
        this.f28977L = C0062b.m353h2(stateFlowImplM14379a2, interfaceC7882zM16767w0, startedWhileSubscribed, null);
        EmptyList emptyList = EmptyList.f38032a;
        this.f28978M = C7120g.m14379a(emptyList);
        C7138s c7138sM10448a = C4924a.m10448a();
        this.f28979N = c7138sM10448a;
        this.f28980O = C0062b.m341d2(c7138sM10448a, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7138s c7138sM10448a2 = C4924a.m10448a();
        this.f28981P = c7138sM10448a2;
        this.f28982Q = C0062b.m341d2(c7138sM10448a2, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7138s c7138sM10448a3 = C4924a.m10448a();
        this.f28983R = c7138sM10448a3;
        this.f28984S = C0062b.m341d2(c7138sM10448a3, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7138s c7138sM10448a4 = C4924a.m10448a();
        this.f28985T = c7138sM10448a4;
        this.f28986U = C0062b.m341d2(c7138sM10448a4, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7138s c7138sM10448a5 = C4924a.m10448a();
        this.f28987V = c7138sM10448a5;
        this.f28988W = C0062b.m341d2(c7138sM10448a5, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7138s c7138sM10448a6 = C4924a.m10448a();
        this.f28989X = c7138sM10448a6;
        this.f28990Y = C0062b.m341d2(c7138sM10448a6, C8573r0.m16767w0(this), startedWhileSubscribed);
        this.f28991Z = C7120g.m14379a(Resource.Status.EMPTY);
        StateFlowImpl stateFlowImplM14379a3 = C7120g.m14379a("0:00");
        this.f28992a0 = stateFlowImplM14379a3;
        this.f28993b0 = C0062b.m353h2(stateFlowImplM14379a3, C8573r0.m16767w0(this), startedWhileSubscribed, "0:00");
        StateFlowImpl stateFlowImplM14379a4 = C7120g.m14379a(new AbstractC7791r.a(false, false, true, false));
        this.f28996d0 = stateFlowImplM14379a4;
        C7135p c7135pM353h2 = C0062b.m353h2(stateFlowImplM14379a4, C8573r0.m16767w0(this), startedWhileSubscribed, new AbstractC7791r.a(false, false, true, false));
        StateFlowImpl stateFlowImplM14379a5 = C7120g.m14379a(null);
        this.f28998e0 = stateFlowImplM14379a5;
        C7135p c7135pM353h3 = C0062b.m353h2(C0062b.m399t2(new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(stateFlowImplM14379a5), new LessonCompleteViewModel$_lessonStatsItems$1(null)), C8573r0.m16767w0(this), startedWhileSubscribed, new AbstractC7791r.i(emptyList, true));
        StateFlowImpl stateFlowImplM14379a6 = C7120g.m14379a(new C7779f(emptyList));
        StateFlowImpl stateFlowImplM14379a7 = C7120g.m14379a(new C7779f(emptyList));
        StateFlowImpl stateFlowImplM14379a8 = C7120g.m14379a(new C7779f(emptyList));
        int i10 = iIntValue;
        StateFlowImpl stateFlowImplM14379a9 = C7120g.m14379a(new Pair(null, Boolean.FALSE));
        this.f29000f0 = stateFlowImplM14379a9;
        C7135p c7135pM353h4 = C0062b.m353h2(C0062b.m399t2(new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(stateFlowImplM14379a9), new LessonCompleteViewModel$_streakItem$1(this, null)), C8573r0.m16767w0(this), startedWhileSubscribed, new AbstractC7791r.j(0, emptyList, true, false));
        StateFlowImpl stateFlowImplM14379a10 = C7120g.m14379a(null);
        this.f29002g0 = stateFlowImplM14379a10;
        C7135p c7135pM353h5 = C0062b.m353h2(new C7131l(stateFlowImplM14379a9, stateFlowImplM14379a10, new LessonCompleteViewModel$_showRepairStreak$1(null)), C8573r0.m16767w0(this), startedWhileSubscribed, null);
        this.f29004h0 = C7120g.m14379a(LanguageProgressMetric.KnownWords);
        this.f29006i0 = C7120g.m14379a(LanguageProgressPeriod.Last7Days);
        StateFlowImpl stateFlowImplM14379a11 = C7120g.m14379a(new Pair(new C7779f(emptyList), new C7779f(emptyList)));
        this.f29008j0 = stateFlowImplM14379a11;
        final InterfaceC7116c[] interfaceC7116cArr = {C0062b.m353h2(C0062b.m399t2(stateFlowImplM14379a11, new LessonCompleteViewModel$_combineGraphItems$1(null)), C8573r0.m16767w0(this), startedWhileSubscribed, new AbstractC7791r.c(new C7779f(emptyList), new C7779f(emptyList), true)), c7135pM353h4, stateFlowImplM14379a3, c7135pM353h3, c7135pM353h2, stateFlowImplM14379a, c7135pM353h5};
        this.f29010k0 = C0062b.m353h2(new InterfaceC7116c<List<AbstractC7791r>>() { // from class: com.lingq.ui.lesson.stats.LessonCompleteViewModel$special$$inlined$combine$1

            /* JADX INFO: renamed from: com.lingq.ui.lesson.stats.LessonCompleteViewModel$special$$inlined$combine$1$3 */
            @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, m13365d2 = {"T", "R", "Lkotlinx/coroutines/flow/d;", "", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
            @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.stats.LessonCompleteViewModel$special$$inlined$combine$1$3", m19206f = "LessonCompleteViewModel.kt", m19207l = {238}, m19208m = "invokeSuspend")
            public static final class C44363 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super List<AbstractC7791r>>, Object[], InterfaceC9968c<? super C9072e>, Object> {

                /* JADX INFO: renamed from: e */
                public int f29067e;

                /* JADX INFO: renamed from: f */
                public /* synthetic */ InterfaceC7117d f29068f;

                /* JADX INFO: renamed from: g */
                public /* synthetic */ Object[] f29069g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ LessonCompleteViewModel f29070h;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ Context f29071i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C44363(InterfaceC9968c interfaceC9968c, LessonCompleteViewModel lessonCompleteViewModel, Context context) {
                    super(3, interfaceC9968c);
                    this.f29070h = lessonCompleteViewModel;
                    this.f29071i = context;
                }

                @Override // cm.InterfaceC2057q
                /* JADX INFO: renamed from: M */
                public final Object mo1343M(InterfaceC7117d<? super List<AbstractC7791r>> interfaceC7117d, Object[] objArr, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                    C44363 c44363 = new C44363(interfaceC9968c, this.f29070h, this.f29071i);
                    c44363.f29068f = interfaceC7117d;
                    c44363.f29069g = objArr;
                    return c44363.mo1338x(C9072e.f47360a);
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
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i10 = this.f29067e;
                    if (i10 == 0) {
                        C7499b.m14977z0(obj);
                        InterfaceC7117d interfaceC7117d = this.f29068f;
                        Object[] objArr = this.f29069g;
                        ArrayList arrayList = new ArrayList();
                        Object obj2 = objArr[1];
                        C5207g.m11109d(obj2, "null cannot be cast to non-null type com.lingq.commons.ui.StatsItem.Streak");
                        AbstractC7791r.j jVar = (AbstractC7791r.j) obj2;
                        Object obj3 = objArr[5];
                        C5207g.m11109d(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                        Context context = this.f29071i;
                        LessonCompleteViewModel lessonCompleteViewModel = this.f29070h;
                        int i11 = jVar.f42839a;
                        if (zBooleanValue) {
                            Object obj4 = objArr[6];
                            Pair pair = obj4 instanceof Pair ? (Pair) obj4 : null;
                            arrayList.add(new AbstractC7791r.m(new Integer(i11), (pair == null || (c5804b = (C5804b) pair.f38012a) == null) ? null : new Integer(c5804b.f35074b), (pair == null || (userLanguageStudyStats3 = (UserLanguageStudyStats) pair.f38013b) == null || (list = userLanguageStudyStats3.f21791f) == null || (userStudyStatsScore = list.get(5)) == null) ? null : new Integer(userStudyStatsScore.f21800c), (pair == null || (userLanguageStudyStats2 = (UserLanguageStudyStats) pair.f38013b) == null) ? null : new Integer(userLanguageStudyStats2.f21787b), (pair == null || (userLanguageStudyStats = (UserLanguageStudyStats) pair.f38013b) == null) ? null : new Integer(userLanguageStudyStats.f21792g)));
                            arrayList.add(new AbstractC7791r.q(C6744b.m13391w0(LanguageProgressMetric.values()), C6744b.m13391w0(LanguageProgressPeriod.values()), ((LanguageProgressMetric) lessonCompleteViewModel.f29004h0.getValue()).getKey(), ((LanguageProgressPeriod) lessonCompleteViewModel.f29006i0.getValue()).getKey()));
                            arrayList.add(jVar);
                            Object obj5 = objArr[0];
                            C5207g.m11109d(obj5, "null cannot be cast to non-null type com.lingq.commons.ui.StatsItem.CombinedLineGraph");
                            arrayList.add((AbstractC7791r.c) obj5);
                            arrayList.add(new AbstractC7791r.l());
                            Object obj6 = objArr[3];
                            C5207g.m11109d(obj6, "null cannot be cast to non-null type com.lingq.commons.ui.StatsItem.Numbers");
                            arrayList.add((AbstractC7791r.i) obj6);
                            Object obj7 = objArr[4];
                            C5207g.m11109d(obj7, "null cannot be cast to non-null type com.lingq.commons.ui.StatsItem.ButtonActions");
                            arrayList.add((AbstractC7791r.a) obj7);
                            String quantityString = context.getResources().getQuantityString(R.plurals.stats_listen_for_n_more_minutes, 15, new Integer(15));
                            C5207g.m11110e(quantityString, "applicationContext.resou…                        )");
                            arrayList.add(new AbstractC7791r.e(quantityString));
                            Object obj8 = objArr[2];
                            C5207g.m11109d(obj8, "null cannot be cast to non-null type kotlin.String");
                            arrayList.add(new AbstractC7791r.k((String) obj8));
                        } else {
                            interfaceC7117d = interfaceC7117d;
                            arrayList.add(new AbstractC7791r.q(C6744b.m13391w0(LanguageProgressMetric.values()), C6744b.m13391w0(LanguageProgressPeriod.values()), ((LanguageProgressMetric) lessonCompleteViewModel.f29004h0.getValue()).getKey(), ((LanguageProgressPeriod) lessonCompleteViewModel.f29006i0.getValue()).getKey()));
                            Object obj9 = objArr[0];
                            C5207g.m11109d(obj9, "null cannot be cast to non-null type com.lingq.commons.ui.StatsItem.CombinedLineGraph");
                            arrayList.add((AbstractC7791r.c) obj9);
                            Object obj10 = objArr[6];
                            Triple triple = obj10 instanceof Triple ? (Triple) obj10 : null;
                            arrayList.add(new AbstractC7791r.m(new Integer(i11), triple != null ? (Integer) triple.f38021a : null, triple != null ? (Integer) triple.f38022b : null, triple != null ? (Integer) triple.f38023c : null, null));
                            arrayList.add(jVar);
                            Object obj11 = objArr[2];
                            C5207g.m11109d(obj11, "null cannot be cast to non-null type kotlin.String");
                            arrayList.add(new AbstractC7791r.k((String) obj11));
                            arrayList.add(new AbstractC7791r.l());
                            Object obj12 = objArr[3];
                            C5207g.m11109d(obj12, "null cannot be cast to non-null type com.lingq.commons.ui.StatsItem.Numbers");
                            arrayList.add((AbstractC7791r.i) obj12);
                            String quantityString2 = context.getResources().getQuantityString(R.plurals.stats_listen_for_n_more_minutes, 15, new Integer(15));
                            C5207g.m11110e(quantityString2, "applicationContext.resou…                        )");
                            arrayList.add(new AbstractC7791r.e(quantityString2));
                            Object obj13 = objArr[4];
                            C5207g.m11109d(obj13, "null cannot be cast to non-null type com.lingq.commons.ui.StatsItem.ButtonActions");
                            arrayList.add((AbstractC7791r.a) obj13);
                        }
                        this.f29067e = 1;
                        if (interfaceC7117d.mo1339r(arrayList, this) == coroutineSingletons) {
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

            @Override // kotlinx.coroutines.flow.InterfaceC7116c
            /* JADX INFO: renamed from: a */
            public final Object mo9539a(InterfaceC7117d<? super List<AbstractC7791r>> interfaceC7117d, InterfaceC9968c interfaceC9968c) throws Throwable {
                final InterfaceC7116c[] interfaceC7116cArr2 = interfaceC7116cArr;
                Object objM14386a = C7127c.m14386a(interfaceC9968c, new InterfaceC2041a<Object[]>() { // from class: com.lingq.ui.lesson.stats.LessonCompleteViewModel$special$$inlined$combine$1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final Object[] mo807E() {
                        return new Object[interfaceC7116cArr2.length];
                    }
                }, new C44363(null, this, context), interfaceC7117d, interfaceC7116cArr2);
                return objM14386a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM14386a : C9072e.f47360a;
            }
        }, C8573r0.m16767w0(this), startedWhileSubscribed, emptyList);
        stateFlowImplM14379a9.setValue(new Pair(null, bool));
        stateFlowImplM14379a5.setValue(new Pair(emptyList, bool));
        stateFlowImplM14379a6.setValue(new C7779f(emptyList));
        stateFlowImplM14379a7.setValue(new C7779f(emptyList));
        stateFlowImplM14379a8.setValue(new C7779f(emptyList));
        stateFlowImplM14379a4.setValue(new AbstractC7791r.a(false, false, true, false));
        C7499b.m14933c0(C8573r0.m16767w0(this), coroutineJobManager, executorC7177a, C0166e.m761g("fetch lesson ", i10), new LessonCompleteViewModel$fetchLesson$1(this, null));
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new LessonCompleteViewModel$updateStreak$1(this, null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new LessonCompleteViewModel$getStreak$1(this, null), 3);
        C7499b.m14933c0(C8573r0.m16767w0(this), coroutineJobManager, executorC7177a, "language streak", new LessonCompleteViewModel$getLanguageStreak$1(this, null));
        m10221m2();
        m10220l2();
        m10222n2();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B */
    public final InterfaceC7142w<List<UserLanguage>> mo496B() {
        return this.f29011l.mo496B();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B0 */
    public final Object mo497B0(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f29011l.mo497B0(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: E1 */
    public final String mo498E1() {
        return this.f29011l.mo498E1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: J */
    public final Object mo499J(Profile profile, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f29011l.mo499J(profile, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: P */
    public final InterfaceC7142w<List<String>> mo500P() {
        return this.f29011l.mo500P();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: d */
    public final Object mo501d(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f29011l.mo501d(str, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f0 */
    public final boolean mo502f0() {
        InterfaceC0113j interfaceC0113j = this.f29011l;
        return true;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f1 */
    public final Object mo503f1(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f29011l.mo503f1(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: j1 */
    public final InterfaceC7116c<Profile> mo504j1() {
        return this.f29011l.mo504j1();
    }

    @Override // androidx.view.AbstractC1036h0
    /* JADX INFO: renamed from: j2 */
    public final void mo3725j2() {
        CountDownTimerC4427a countDownTimerC4427a = this.f28994c0;
        if (countDownTimerC4427a != null) {
            countDownTimerC4427a.cancel();
        }
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l0 */
    public final Object mo505l0(ProfileAccount profileAccount, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f29011l.mo505l0(profileAccount, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l1 */
    public final boolean mo506l1() {
        return this.f29011l.mo506l1();
    }

    /* JADX INFO: renamed from: l2 */
    public final void m10220l2() {
        C7499b.m14933c0(C8573r0.m16767w0(this), this.f29007j, this.f29005i, C0204c.m852k("getActivityData ", ((LanguageProgressMetric) this.f29004h0.getValue()).getKey()), new LessonCompleteViewModel$getActivityData$1(this, null));
    }

    /* JADX INFO: renamed from: m2 */
    public final void m10221m2() {
        Calendar calendar = Calendar.getInstance();
        C5207g.m11110e(calendar, "getInstance()");
        Calendar calendar2 = Calendar.getInstance();
        C5207g.m11110e(calendar2, "getInstance()");
        calendar2.add(5, 1);
        calendar2.set(11, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        CountDownTimerC4427a countDownTimerC4427a = new CountDownTimerC4427a(calendar2.getTimeInMillis() - calendar.getTimeInMillis());
        this.f28994c0 = countDownTimerC4427a;
        countDownTimerC4427a.start();
    }

    /* JADX INFO: renamed from: n2 */
    public final void m10222n2() {
        C7499b.m14933c0(C8573r0.m16767w0(this), this.f29007j, this.f29005i, C0204c.m852k("updateActivityData ", ((LanguageProgressMetric) this.f29004h0.getValue()).getKey()), new LessonCompleteViewModel$updateActivityData$1(this, null));
    }

    /* JADX INFO: renamed from: o2 */
    public final void m10223o2() {
        C7499b.m14933c0(C8573r0.m16767w0(this), this.f29007j, this.f29005i, "likeLesson " + this.f28973H, new LessonCompleteViewModel$updateLike$1(this, null));
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: p1 */
    public final String mo507p1() {
        return this.f29011l.mo507p1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: t1 */
    public final InterfaceC7116c<ProfileAccount> mo508t1() {
        return this.f29011l.mo508t1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: w0 */
    public final InterfaceC7142w<UserLanguage> mo509w0() {
        return this.f29011l.mo509w0();
    }
}
