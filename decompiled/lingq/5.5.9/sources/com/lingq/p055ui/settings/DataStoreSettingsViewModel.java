package com.lingq.p055ui.settings;

import ae.C0062b;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.Rect;
import android.os.Build;
import android.support.v4.media.session.C0166e;
import androidx.view.AbstractC1036h0;
import androidx.view.C1024c0;
import ci.InterfaceC2012e;
import ci.InterfaceC2019l;
import cm.InterfaceC2041a;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.commons.p053ui.ViewKeys;
import com.lingq.p055ui.tooltips.InterfaceC4912b;
import com.lingq.p055ui.tooltips.TooltipStep;
import com.lingq.player.PlayerController;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.storage.Theme;
import com.lingq.shared.uimodel.LearningLevel;
import com.lingq.shared.uimodel.language.UserLanguage;
import com.lingq.util.C4924a;
import com.linguist.R;
import com.tonyodev.fetch2.fetch.FetchImpl;
import dm.C5207g;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C6753d;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.C7120g;
import kotlinx.coroutines.flow.C7134o;
import kotlinx.coroutines.flow.C7135p;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7142w;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.scheduling.ExecutorC7177a;
import ni.C7797e;
import no.C7828f;
import no.InterfaceC7882z;
import p015ak.InterfaceC0113j;
import p076di.InterfaceC5179a;
import p183ik.C6343f;
import p225kk.C6704a;
import p225kk.C6714k;
import p225kk.C6715l;
import p260m8.C7499b;
import p268n2.C7695a;
import p278nh.AbstractC7787n;
import p338qd.C8573r0;
import p385sf.C9000b;
import p463wk.InterfaceC9958a;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/settings/DataStoreSettingsViewModel;", "Landroidx/lifecycle/h0;", "Lak/j;", "Lcom/lingq/ui/tooltips/b;", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class DataStoreSettingsViewModel extends AbstractC1036h0 implements InterfaceC0113j, InterfaceC4912b {

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ InterfaceC4912b f30963H;

    /* JADX INFO: renamed from: I */
    public final StateFlowImpl f30964I;

    /* JADX INFO: renamed from: J */
    public final StateFlowImpl f30965J;

    /* JADX INFO: renamed from: K */
    public final C7138s f30966K;

    /* JADX INFO: renamed from: L */
    public final C7134o f30967L;

    /* JADX INFO: renamed from: M */
    public final C7135p f30968M;

    /* JADX INFO: renamed from: N */
    public final C7135p f30969N;

    /* JADX INFO: renamed from: O */
    public final C7135p f30970O;

    /* JADX INFO: renamed from: P */
    public final StateFlowImpl f30971P;

    /* JADX INFO: renamed from: Q */
    public final C7135p f30972Q;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2012e f30973d;

    /* JADX INFO: renamed from: e */
    public final CoroutineDispatcher f30974e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC5179a f30975f;

    /* JADX INFO: renamed from: g */
    public final PlayerController f30976g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC2019l f30977h;

    /* JADX INFO: renamed from: i */
    public final C6704a f30978i;

    /* JADX INFO: renamed from: j */
    public final C7797e f30979j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC9958a f30980k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC0113j f30981l;

    /* JADX INFO: renamed from: com.lingq.ui.settings.DataStoreSettingsViewModel$1 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.settings.DataStoreSettingsViewModel$1", m19206f = "DataStoreSettingsViewModel.kt", m19207l = {94}, m19208m = "invokeSuspend")
    final class C47711 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f30982e;

        /* JADX INFO: renamed from: com.lingq.ui.settings.DataStoreSettingsViewModel$1$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/uimodel/language/UserLanguage;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.settings.DataStoreSettingsViewModel$1$1", m19206f = "DataStoreSettingsViewModel.kt", m19207l = {103}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<UserLanguage, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public int f30984e;

            /* JADX INFO: renamed from: f */
            public /* synthetic */ Object f30985f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ DataStoreSettingsViewModel f30986g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(DataStoreSettingsViewModel dataStoreSettingsViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f30986g = dataStoreSettingsViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f30986g, interfaceC9968c);
                anonymousClass1.f30985f = obj;
                return anonymousClass1;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(UserLanguage userLanguage, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(userLanguage, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                List<String> list;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.f30984e;
                if (i10 == 0) {
                    C7499b.m14977z0(obj);
                    UserLanguage userLanguage = (UserLanguage) this.f30985f;
                    DataStoreSettingsViewModel dataStoreSettingsViewModel = this.f30986g;
                    dataStoreSettingsViewModel.getClass();
                    C7828f.m15570d(C8573r0.m16767w0(dataStoreSettingsViewModel), dataStoreSettingsViewModel.f30974e, null, new DataStoreSettingsViewModel$getDailyGoal$1(dataStoreSettingsViewModel, null), 2);
                    if (userLanguage != null && (list = userLanguage.f21742q) != null) {
                        LinkedHashMap linkedHashMapM13467T0 = C6753d.m13467T0((Map) dataStoreSettingsViewModel.f30968M.getValue());
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        LearningLevel[] learningLevelArrValues = LearningLevel.values();
                        int length = learningLevelArrValues.length;
                        int i11 = 0;
                        int i12 = 0;
                        while (i11 < length) {
                            linkedHashMap.put(learningLevelArrValues[i11], Boolean.valueOf(Boolean.parseBoolean(list.get(i12))));
                            i11++;
                            i12++;
                        }
                        linkedHashMapM13467T0.put(dataStoreSettingsViewModel.mo498E1(), linkedHashMap);
                        this.f30984e = 1;
                        if (dataStoreSettingsViewModel.f30975f.mo9569P(linkedHashMapM13467T0, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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

        public C47711(InterfaceC9968c<? super C47711> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return DataStoreSettingsViewModel.this.new C47711(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C47711) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f30982e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                DataStoreSettingsViewModel dataStoreSettingsViewModel = DataStoreSettingsViewModel.this;
                InterfaceC7142w<UserLanguage> interfaceC7142wMo509w0 = dataStoreSettingsViewModel.mo509w0();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(dataStoreSettingsViewModel, null);
                this.f30982e = 1;
                if (C0062b.m369m0(interfaceC7142wMo509w0, anonymousClass1, this) == coroutineSingletons) {
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

    public DataStoreSettingsViewModel(InterfaceC2012e interfaceC2012e, ExecutorC7177a executorC7177a, InterfaceC5179a interfaceC5179a, PlayerController playerController, InterfaceC2019l interfaceC2019l, C6704a c6704a, C7797e c7797e, FetchImpl fetchImpl, InterfaceC0113j interfaceC0113j, InterfaceC4912b interfaceC4912b, C1024c0 c1024c0) {
        C5207g.m11111f(interfaceC2012e, "languageRepository");
        C5207g.m11111f(interfaceC5179a, "preferenceStore");
        C5207g.m11111f(playerController, "playerController");
        C5207g.m11111f(interfaceC2019l, "playlistRepository");
        C5207g.m11111f(c6704a, "appSettings");
        C5207g.m11111f(c7797e, "utils");
        C5207g.m11111f(interfaceC0113j, "userSessionViewModelDelegate");
        C5207g.m11111f(interfaceC4912b, "toolTipsController");
        C5207g.m11111f(c1024c0, "savedStateHandle");
        this.f30973d = interfaceC2012e;
        this.f30974e = executorC7177a;
        this.f30975f = interfaceC5179a;
        this.f30976g = playerController;
        this.f30977h = interfaceC2019l;
        this.f30978i = c6704a;
        this.f30979j = c7797e;
        this.f30980k = fetchImpl;
        this.f30981l = interfaceC0113j;
        this.f30963H = interfaceC4912b;
        this.f30964I = C7120g.m14379a(null);
        StateFlowImpl stateFlowImplM14379a = C7120g.m14379a(null);
        this.f30965J = stateFlowImplM14379a;
        InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(this);
        StartedWhileSubscribed startedWhileSubscribed = C6715l.f37936a;
        C0062b.m353h2(stateFlowImplM14379a, interfaceC7882zM16767w0, startedWhileSubscribed, null);
        C7138s c7138sM10448a = C4924a.m10448a();
        this.f30966K = c7138sM10448a;
        this.f30967L = C0062b.m341d2(c7138sM10448a, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7135p c7135pM353h2 = C0062b.m353h2(interfaceC5179a.mo9594i(), C8573r0.m16767w0(this), startedWhileSubscribed, C6753d.m13459L0());
        this.f30968M = c7135pM353h2;
        C0062b.m353h2(interfaceC5179a.mo9582b(), C8573r0.m16767w0(this), startedWhileSubscribed, EmptySet.f38034a);
        C7135p c7135pM353h3 = C0062b.m353h2(interfaceC5179a.mo9585c0(), C8573r0.m16767w0(this), startedWhileSubscribed, Theme.System);
        this.f30969N = c7135pM353h3;
        C7135p c7135pM353h4 = C0062b.m353h2(interfaceC5179a.mo9567N(), C8573r0.m16767w0(this), startedWhileSubscribed, Boolean.FALSE);
        this.f30970O = c7135pM353h4;
        StateFlowImpl stateFlowImplM14379a2 = C7120g.m14379a("");
        this.f30971P = stateFlowImplM14379a2;
        this.f30972Q = C0062b.m353h2(new FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3(new InterfaceC7116c[]{c7135pM353h3, c7135pM353h4, stateFlowImplM14379a2, c7135pM353h2, mo504j1()}, new DataStoreSettingsViewModel$settings$1(this, null)), C8573r0.m16767w0(this), startedWhileSubscribed, EmptyList.f38032a);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C47711(null), 3);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B */
    public final InterfaceC7142w<List<UserLanguage>> mo496B() {
        return this.f30981l.mo496B();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B0 */
    public final Object mo497B0(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f30981l.mo497B0(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: E1 */
    public final String mo498E1() {
        return this.f30981l.mo498E1();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: H1 */
    public final void mo9722H1(TooltipStep tooltipStep) {
        C5207g.m11111f(tooltipStep, "tooltipStep");
        this.f30963H.mo9722H1(tooltipStep);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: I */
    public final void mo9723I(TooltipStep tooltipStep) {
        C5207g.m11111f(tooltipStep, "step");
        this.f30963H.mo9723I(tooltipStep);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: J */
    public final Object mo499J(Profile profile, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f30981l.mo499J(profile, interfaceC9968c);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: L */
    public final void mo9724L() {
        this.f30963H.mo9724L();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: P */
    public final InterfaceC7142w<List<String>> mo500P() {
        return this.f30981l.mo500P();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: T0 */
    public final void mo9727T0() {
        this.f30963H.mo9727T0();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: Y1 */
    public final void mo9729Y1() {
        this.f30963H.mo9729Y1();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: a1 */
    public final void mo9730a1() {
        this.f30963H.mo9730a1();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: b0 */
    public final void mo9731b0(boolean z10) {
        this.f30963H.mo9731b0(z10);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: d */
    public final Object mo501d(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f30981l.mo501d(str, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f0 */
    public final boolean mo502f0() {
        InterfaceC0113j interfaceC0113j = this.f30981l;
        return true;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f1 */
    public final Object mo503f1(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f30981l.mo503f1(interfaceC9968c);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: g0 */
    public final InterfaceC7116c<List<TooltipStep>> mo9733g0() {
        return this.f30963H.mo9733g0();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: g2 */
    public final void mo9734g2(TooltipStep tooltipStep, Rect rect, Rect rect2, boolean z10, boolean z11, boolean z12, InterfaceC2041a<C9072e> interfaceC2041a) {
        C5207g.m11111f(tooltipStep, "step");
        C5207g.m11111f(rect, "viewRect");
        C5207g.m11111f(rect2, "tooltipRect");
        C5207g.m11111f(interfaceC2041a, "action");
        this.f30963H.mo9734g2(tooltipStep, rect, rect2, z10, z11, z12, interfaceC2041a);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: h */
    public final InterfaceC7142w<Boolean> mo9735h() {
        return this.f30963H.mo9735h();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: j0 */
    public final void mo9736j0() {
        this.f30963H.mo9736j0();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: j1 */
    public final InterfaceC7116c<Profile> mo504j1() {
        return this.f30981l.mo504j1();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: k0 */
    public final InterfaceC7116c<TooltipStep> mo9737k0() {
        return this.f30963H.mo9737k0();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: k1 */
    public final InterfaceC7116c<C9072e> mo9738k1() {
        return this.f30963H.mo9738k1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l0 */
    public final Object mo505l0(ProfileAccount profileAccount, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f30981l.mo505l0(profileAccount, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l1 */
    public final boolean mo506l1() {
        return this.f30981l.mo506l1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l2 */
    public final ArrayList m10350l2() {
        Pair pair;
        long jM15287b;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AbstractC7787n.n(R.string.settings_text_lesson_settings, R.string.placeholder, ViewKeys.LessonSettings.ordinal(), null, null, 56));
        arrayList.add(AbstractC7787n.d.f42747a);
        arrayList.add(new AbstractC7787n.n(R.string.activities_settings, R.string.placeholder, ViewKeys.ActivitiesSettings.ordinal(), null, null, 56));
        arrayList.add(new AbstractC7787n.b(R.string.lingq_languages));
        Map map = (Map) ((Map) this.f30968M.getValue()).get(mo498E1());
        if (map != null) {
            LearningLevel learningLevel = LearningLevel.Beginner1;
            LearningLevel learningLevel2 = LearningLevel.Advanced2;
            while (true) {
                Object obj = map.get(learningLevel);
                Boolean bool = Boolean.FALSE;
                if (!C5207g.m11106a(obj, bool) && !C5207g.m11106a(map.get(learningLevel2), bool)) {
                    break;
                }
                if (C5207g.m11106a(map.get(learningLevel), bool)) {
                    learningLevel = LearningLevel.values()[learningLevel.ordinal() + 1];
                }
                if (C5207g.m11106a(map.get(learningLevel2), bool)) {
                    learningLevel2 = LearningLevel.values()[learningLevel2.ordinal() - 1];
                }
            }
            pair = new Pair(learningLevel, learningLevel2);
        } else {
            pair = new Pair(LearningLevel.Beginner1, LearningLevel.Advanced2);
        }
        arrayList.add(new AbstractC7787n.g(EmptyList.f38032a, C9000b.m17252r(Integer.valueOf(R.string.levels_beginner), Integer.valueOf(R.string.levels_intermediate), Integer.valueOf(R.string.levels_advanced)), ((LearningLevel) pair.f38012a).ordinal(), ((LearningLevel) pair.f38013b).ordinal(), ViewKeys.LanguageFeedLevels.ordinal(), mo498E1(), true));
        AbstractC7787n.d dVar = AbstractC7787n.d.f42747a;
        arrayList.add(dVar);
        arrayList.add(new AbstractC7787n.n(R.string.texts_daily_lingqs_settings, R.string.placeholder, ViewKeys.DailyLingQ.ordinal(), null, null, 56));
        arrayList.add(dVar);
        arrayList.add(new AbstractC7787n.n(R.string.lingq_daily_goal, R.string.placeholder, ViewKeys.DailyGoal.ordinal(), null, null, 56));
        arrayList.add(dVar);
        arrayList.add(new AbstractC7787n.n(R.string.settings_preferred_topics, R.string.placeholder, ViewKeys.Topics.ordinal(), null, null, 56));
        arrayList.add(new AbstractC7787n.b(R.string.settings_app));
        arrayList.add(new AbstractC7787n.n(R.string.settings_theme, C4924a.m10461g0((Theme) this.f30969N.getValue()), ViewKeys.Theme.ordinal(), null, null, 56));
        arrayList.add(dVar);
        arrayList.add(new AbstractC7787n.k(R.string.settings_playlist_3g, ViewKeys.DownloadOn3G.ordinal(), ((Boolean) this.f30970O.getValue()).booleanValue(), false));
        arrayList.add(dVar);
        arrayList.add(new AbstractC7787n.n(R.string.settings_interface_language, R.string.placeholder, ViewKeys.InterfaceLanguage.ordinal(), null, null, 56));
        arrayList.add(dVar);
        arrayList.add(new AbstractC7787n.n(R.string.settings_clear_audio_cache, R.string.placeholder, ViewKeys.ClearCache.ordinal(), (String) this.f30971P.getValue(), null, 40));
        arrayList.add(dVar);
        arrayList.add(new AbstractC7787n.n(R.string.tooltips_restart_tutorial, R.string.placeholder, ViewKeys.RestartTutorial.ordinal(), null, null, 56));
        Profile profile = (Profile) this.f30964I.getValue();
        if (profile != null) {
            arrayList.add(new AbstractC7787n.b(R.string.settings_account));
            arrayList.add(new AbstractC7787n.o(profile.f17783c, ViewKeys.UserLogOut.ordinal()));
            arrayList.add(dVar);
            arrayList.add(new AbstractC7787n.n(R.string.texts_email_support, R.string.placeholder, ViewKeys.EmailSupport.ordinal(), null, null, 56));
        }
        arrayList.add(new AbstractC7787n.b(R.string.texts_about));
        C7797e c7797e = this.f30979j;
        c7797e.getClass();
        try {
            Context context = c7797e.f42873a;
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            jM15287b = Build.VERSION.SDK_INT >= 28 ? C7695a.m15287b(packageInfo) : packageInfo.versionCode;
        } catch (Exception unused) {
            jM15287b = 0;
        }
        arrayList.add(new AbstractC7787n.a(c7797e.m15509b(), ViewKeys.About.ordinal(), jM15287b));
        return arrayList;
    }

    /* JADX INFO: renamed from: m2 */
    public final void m10351m2(Context context) {
        ArrayList arrayListM13315a = C6714k.m13315a(new File(C0166e.m765k(context.getFilesDir().toString(), "/tracks/")));
        StateFlowImpl stateFlowImpl = this.f30971P;
        if (arrayListM13315a == null) {
            String str = String.format(Locale.getDefault(), "%d mb", Arrays.copyOf(new Object[]{0}, 1));
            C5207g.m11110e(str, "format(locale, format, *args)");
            stateFlowImpl.setValue(str);
            return;
        }
        Iterator it = arrayListM13315a.iterator();
        long length = 0;
        while (it.hasNext()) {
            length += ((File) it.next()).length();
        }
        long j10 = 1024;
        String str2 = String.format(Locale.getDefault(), "%d mb", Arrays.copyOf(new Object[]{Integer.valueOf((int) ((length / j10) / j10))}, 1));
        C5207g.m11110e(str2, "format(locale, format, *args)");
        stateFlowImpl.setValue(str2);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: p0 */
    public final boolean mo9741p0(TooltipStep tooltipStep) {
        C5207g.m11111f(tooltipStep, "step");
        return this.f30963H.mo9741p0(tooltipStep);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: p1 */
    public final String mo507p1() {
        return this.f30981l.mo507p1();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: r0 */
    public final InterfaceC7116c<TooltipStep> mo9743r0() {
        return this.f30963H.mo9743r0();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: t1 */
    public final InterfaceC7116c<ProfileAccount> mo508t1() {
        return this.f30981l.mo508t1();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: u */
    public final InterfaceC7116c<C6343f> mo9744u() {
        return this.f30963H.mo9744u();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: u0 */
    public final void mo9745u0(boolean z10) {
        this.f30963H.mo9745u0(z10);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: v1 */
    public final boolean mo9746v1(TooltipStep tooltipStep) {
        C5207g.m11111f(tooltipStep, "step");
        return this.f30963H.mo9746v1(tooltipStep);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: w0 */
    public final InterfaceC7142w<UserLanguage> mo509w0() {
        return this.f30981l.mo509w0();
    }
}
