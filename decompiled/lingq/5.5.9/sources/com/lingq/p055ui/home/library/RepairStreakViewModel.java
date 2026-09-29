package com.lingq.p055ui.home.library;

import ae.C0062b;
import androidx.view.AbstractC1036h0;
import androidx.view.C1024c0;
import ci.InterfaceC2013f;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.uimodel.language.UserLanguage;
import com.lingq.shared.uimodel.language.UserLanguageStudyStats;
import com.lingq.util.C4924a;
import dm.C5207g;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.collections.C6753d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.channels.AbstractChannel;
import kotlinx.coroutines.flow.C7114a;
import kotlinx.coroutines.flow.C7120g;
import kotlinx.coroutines.flow.C7135p;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7142w;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.scheduling.ExecutorC7177a;
import ni.C7797e;
import no.C7828f;
import no.InterfaceC7882z;
import p015ak.InterfaceC0113j;
import p076di.InterfaceC5182d;
import p225kk.C6715l;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/ui/home/library/RepairStreakViewModel;", "Landroidx/lifecycle/h0;", "Lak/j;", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class RepairStreakViewModel extends AbstractC1036h0 implements InterfaceC0113j {

    /* JADX INFO: renamed from: H */
    public final C7135p f24977H;

    /* JADX INFO: renamed from: I */
    public final StateFlowImpl f24978I;

    /* JADX INFO: renamed from: J */
    public final C7135p f24979J;

    /* JADX INFO: renamed from: K */
    public final C7135p f24980K;

    /* JADX INFO: renamed from: L */
    public final AbstractChannel f24981L;

    /* JADX INFO: renamed from: M */
    public final C7114a f24982M;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2013f f24983d;

    /* JADX INFO: renamed from: e */
    public final C7797e f24984e;

    /* JADX INFO: renamed from: f */
    public final CoroutineDispatcher f24985f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC0113j f24986g;

    /* JADX INFO: renamed from: h */
    public final StateFlowImpl f24987h;

    /* JADX INFO: renamed from: i */
    public final C7135p f24988i;

    /* JADX INFO: renamed from: j */
    public final AbstractChannel f24989j;

    /* JADX INFO: renamed from: k */
    public final C7114a f24990k;

    /* JADX INFO: renamed from: l */
    public final StateFlowImpl f24991l;

    /* JADX INFO: renamed from: com.lingq.ui.home.library.RepairStreakViewModel$1 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.library.RepairStreakViewModel$1", m19206f = "RepairStreakViewModel.kt", m19207l = {60, 62}, m19208m = "invokeSuspend")
    final class C38051 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f24992e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ InterfaceC5182d f24993f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ RepairStreakViewModel f24994g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38051(InterfaceC5182d interfaceC5182d, RepairStreakViewModel repairStreakViewModel, InterfaceC9968c<? super C38051> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f24993f = interfaceC5182d;
            this.f24994g = repairStreakViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C38051(this.f24993f, this.f24994g, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C38051) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f24992e;
            InterfaceC5182d interfaceC5182d = this.f24993f;
            if (i10 != 0) {
                if (i10 == 1) {
                    C7499b.m14977z0(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7499b.m14977z0(obj);
                }
            }
            C7499b.m14977z0(obj);
            InterfaceC7116c<Map<String, String>> interfaceC7116cMo9692p = interfaceC5182d.mo9692p();
            this.f24992e = 1;
            obj = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9692p, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            LinkedHashMap linkedHashMapM13467T0 = C6753d.m13467T0((Map) obj);
            linkedHashMapM13467T0.put(this.f24994g.mo498E1(), C4924a.m10456e());
            this.f24992e = 2;
            return interfaceC5182d.mo9693q(linkedHashMapM13467T0, this) == coroutineSingletons ? coroutineSingletons : C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.library.RepairStreakViewModel$2 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.library.RepairStreakViewModel$2", m19206f = "RepairStreakViewModel.kt", m19207l = {67}, m19208m = "invokeSuspend")
    final class C38062 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f24995e;

        /* JADX INFO: renamed from: com.lingq.ui.home.library.RepairStreakViewModel$2$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/uimodel/language/UserLanguageStudyStats;", "studyStats", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.library.RepairStreakViewModel$2$1", m19206f = "RepairStreakViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<UserLanguageStudyStats, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ Object f24997e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ RepairStreakViewModel f24998f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(RepairStreakViewModel repairStreakViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f24998f = repairStreakViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f24998f, interfaceC9968c);
                anonymousClass1.f24997e = obj;
                return anonymousClass1;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(UserLanguageStudyStats userLanguageStudyStats, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(userLanguageStudyStats, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                UserLanguageStudyStats userLanguageStudyStats = (UserLanguageStudyStats) this.f24997e;
                if (userLanguageStudyStats != null) {
                    RepairStreakViewModel repairStreakViewModel = this.f24998f;
                    if (!((Boolean) repairStreakViewModel.f24991l.getValue()).booleanValue()) {
                        repairStreakViewModel.f24978I.setValue(Boolean.valueOf(userLanguageStudyStats.f21789d < 5000));
                    }
                }
                return C9072e.f47360a;
            }
        }

        public C38062(InterfaceC9968c<? super C38062> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return RepairStreakViewModel.this.new C38062(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C38062) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f24995e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                RepairStreakViewModel repairStreakViewModel = RepairStreakViewModel.this;
                InterfaceC7116c<UserLanguageStudyStats> interfaceC7116cMo6051l = repairStreakViewModel.f24983d.mo6051l(repairStreakViewModel.mo498E1());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(repairStreakViewModel, null);
                this.f24995e = 1;
                if (C0062b.m369m0(interfaceC7116cMo6051l, anonymousClass1, this) == coroutineSingletons) {
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

    public RepairStreakViewModel(InterfaceC5182d interfaceC5182d, InterfaceC2013f interfaceC2013f, C7797e c7797e, ExecutorC7177a executorC7177a, InterfaceC0113j interfaceC0113j, C1024c0 c1024c0) {
        C5207g.m11111f(interfaceC5182d, "utilStore");
        C5207g.m11111f(interfaceC2013f, "languageStatsRepository");
        C5207g.m11111f(c7797e, "utils");
        C5207g.m11111f(interfaceC0113j, "userSessionViewModelDelegate");
        C5207g.m11111f(c1024c0, "savedStateHandle");
        this.f24983d = interfaceC2013f;
        this.f24984e = c7797e;
        this.f24985f = executorC7177a;
        this.f24986g = interfaceC0113j;
        StateFlowImpl stateFlowImplM14379a = C7120g.m14379a(c1024c0.m3929b("streak"));
        this.f24987h = stateFlowImplM14379a;
        InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(this);
        StartedWhileSubscribed startedWhileSubscribed = C6715l.f37936a;
        this.f24988i = C0062b.m353h2(stateFlowImplM14379a, interfaceC7882zM16767w0, startedWhileSubscribed, null);
        AbstractChannel abstractChannelM16738m = C8573r0.m16738m(-1, null, 6);
        this.f24989j = abstractChannelM16738m;
        this.f24990k = C0062b.m287L1(abstractChannelM16738m);
        Boolean bool = Boolean.FALSE;
        StateFlowImpl stateFlowImplM14379a2 = C7120g.m14379a(bool);
        this.f24991l = stateFlowImplM14379a2;
        this.f24977H = C0062b.m353h2(stateFlowImplM14379a2, C8573r0.m16767w0(this), startedWhileSubscribed, bool);
        StateFlowImpl stateFlowImplM14379a3 = C7120g.m14379a(null);
        this.f24978I = stateFlowImplM14379a3;
        this.f24979J = C0062b.m353h2(stateFlowImplM14379a3, C8573r0.m16767w0(this), startedWhileSubscribed, null);
        this.f24980K = C0062b.m353h2(C0062b.m399t2(C7120g.m14379a(new Triple(c1024c0.m3929b("previousDayLingqs"), c1024c0.m3929b("goal"), c1024c0.m3929b("activityLevel"))), new RepairStreakViewModel$streakDetails$1(null)), C8573r0.m16767w0(this), startedWhileSubscribed, new Triple(null, null, null));
        AbstractChannel abstractChannelM16738m2 = C8573r0.m16738m(-1, null, 6);
        this.f24981L = abstractChannelM16738m2;
        this.f24982M = C0062b.m287L1(abstractChannelM16738m2);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C38051(interfaceC5182d, this, null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C38062(null), 3);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B */
    public final InterfaceC7142w<List<UserLanguage>> mo496B() {
        return this.f24986g.mo496B();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B0 */
    public final Object mo497B0(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f24986g.mo497B0(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: E1 */
    public final String mo498E1() {
        return this.f24986g.mo498E1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: J */
    public final Object mo499J(Profile profile, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f24986g.mo499J(profile, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: P */
    public final InterfaceC7142w<List<String>> mo500P() {
        return this.f24986g.mo500P();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: d */
    public final Object mo501d(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f24986g.mo501d(str, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f0 */
    public final boolean mo502f0() {
        InterfaceC0113j interfaceC0113j = this.f24986g;
        return true;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f1 */
    public final Object mo503f1(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f24986g.mo503f1(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: j1 */
    public final InterfaceC7116c<Profile> mo504j1() {
        return this.f24986g.mo504j1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l0 */
    public final Object mo505l0(ProfileAccount profileAccount, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f24986g.mo505l0(profileAccount, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l1 */
    public final boolean mo506l1() {
        return this.f24986g.mo506l1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: p1 */
    public final String mo507p1() {
        return this.f24986g.mo507p1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: t1 */
    public final InterfaceC7116c<ProfileAccount> mo508t1() {
        return this.f24986g.mo508t1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: w0 */
    public final InterfaceC7142w<UserLanguage> mo509w0() {
        return this.f24986g.mo509w0();
    }
}
