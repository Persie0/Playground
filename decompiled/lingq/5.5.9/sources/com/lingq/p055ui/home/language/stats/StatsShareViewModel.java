package com.lingq.p055ui.home.language.stats;

import ae.C0062b;
import androidx.activity.result.C0204c;
import androidx.view.AbstractC1036h0;
import ci.InterfaceC2013f;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.domain.Resource;
import com.lingq.shared.uimodel.language.LanguageProgressSort;
import com.lingq.shared.uimodel.language.UserLanguage;
import com.lingq.util.C4924a;
import com.lingq.util.CoroutineJobManager;
import dm.C5207g;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.C7120g;
import kotlinx.coroutines.flow.C7131l;
import kotlinx.coroutines.flow.C7134o;
import kotlinx.coroutines.flow.C7135p;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7142w;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import kotlinx.coroutines.scheduling.ExecutorC7177a;
import no.C7828f;
import no.InterfaceC7882z;
import p015ak.InterfaceC0113j;
import p076di.InterfaceC5179a;
import p225kk.C6715l;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/ui/home/language/stats/StatsShareViewModel;", "Landroidx/lifecycle/h0;", "Lak/j;", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class StatsShareViewModel extends AbstractC1036h0 implements InterfaceC0113j {

    /* JADX INFO: renamed from: H */
    public final StateFlowImpl f24433H;

    /* JADX INFO: renamed from: I */
    public final StateFlowImpl f24434I;

    /* JADX INFO: renamed from: J */
    public final C7135p f24435J;

    /* JADX INFO: renamed from: K */
    public final StateFlowImpl f24436K;

    /* JADX INFO: renamed from: L */
    public final C7135p f24437L;

    /* JADX INFO: renamed from: M */
    public final C7135p f24438M;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2013f f24439d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC5179a f24440e;

    /* JADX INFO: renamed from: f */
    public final CoroutineDispatcher f24441f;

    /* JADX INFO: renamed from: g */
    public final CoroutineJobManager f24442g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC0113j f24443h;

    /* JADX INFO: renamed from: i */
    public final C7138s f24444i;

    /* JADX INFO: renamed from: j */
    public final C7134o f24445j;

    /* JADX INFO: renamed from: k */
    public final StateFlowImpl f24446k;

    /* JADX INFO: renamed from: l */
    public final C7135p f24447l;

    public StatsShareViewModel(InterfaceC2013f interfaceC2013f, InterfaceC5179a interfaceC5179a, ExecutorC7177a executorC7177a, InterfaceC0113j interfaceC0113j, CoroutineJobManager coroutineJobManager) {
        C5207g.m11111f(interfaceC2013f, "languageStatsRepository");
        C5207g.m11111f(interfaceC5179a, "preferenceStore");
        C5207g.m11111f(interfaceC0113j, "userSessionViewModelDelegate");
        this.f24439d = interfaceC2013f;
        this.f24440e = interfaceC5179a;
        this.f24441f = executorC7177a;
        this.f24442g = coroutineJobManager;
        this.f24443h = interfaceC0113j;
        C7138s c7138sM10448a = C4924a.m10448a();
        this.f24444i = c7138sM10448a;
        InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(this);
        StartedWhileSubscribed startedWhileSubscribed = C6715l.f37936a;
        this.f24445j = C0062b.m341d2(c7138sM10448a, interfaceC7882zM16767w0, startedWhileSubscribed);
        StateFlowImpl stateFlowImplM14379a = C7120g.m14379a(new Pair(0, mo498E1()));
        this.f24446k = stateFlowImplM14379a;
        this.f24447l = C0062b.m353h2(stateFlowImplM14379a, C8573r0.m16767w0(this), startedWhileSubscribed, new Pair(0, mo498E1()));
        this.f24433H = C7120g.m14379a(Resource.Status.LOADING);
        StateFlowImpl stateFlowImplM14379a2 = C7120g.m14379a(null);
        this.f24434I = stateFlowImplM14379a2;
        ChannelFlowTransformLatest channelFlowTransformLatestM399t2 = C0062b.m399t2(new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(stateFlowImplM14379a2), new StatsShareViewModel$streak$1(this, null));
        InterfaceC7882z interfaceC7882zM16767w1 = C8573r0.m16767w0(this);
        EmptyList emptyList = EmptyList.f38032a;
        this.f24435J = C0062b.m353h2(channelFlowTransformLatestM399t2, interfaceC7882zM16767w1, startedWhileSubscribed, new Pair(-1, emptyList));
        Boolean bool = Boolean.TRUE;
        StateFlowImpl stateFlowImplM14379a3 = C7120g.m14379a(new Pair(emptyList, bool));
        this.f24436K = stateFlowImplM14379a3;
        this.f24437L = C0062b.m353h2(C0062b.m399t2(stateFlowImplM14379a3, new StatsShareViewModel$goals$1(null)), C8573r0.m16767w0(this), startedWhileSubscribed, new Pair(emptyList, bool));
        this.f24438M = C0062b.m353h2(new C7131l(stateFlowImplM14379a2, stateFlowImplM14379a3, new StatsShareViewModel$canShare$1(null)), C8573r0.m16767w0(this), startedWhileSubscribed, Boolean.FALSE);
        stateFlowImplM14379a3.setValue(new Pair(emptyList, bool));
        C7499b.m14933c0(C8573r0.m16767w0(this), coroutineJobManager, executorC7177a, "streak", new StatsShareViewModel$getStreak$1(this, null));
        C7499b.m14933c0(C8573r0.m16767w0(this), coroutineJobManager, executorC7177a, "update streak", new StatsShareViewModel$updateStreak$1(this, null));
        LanguageProgressSort languageProgressSort = LanguageProgressSort.AllTime;
        m9925n2(languageProgressSort.getKey());
        m9923l2(mo498E1(), languageProgressSort.getKey());
        LanguageProgressSort languageProgressSort2 = LanguageProgressSort.LastWeek;
        m9925n2(languageProgressSort2.getKey());
        m9923l2(mo498E1(), languageProgressSort2.getKey());
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B */
    public final InterfaceC7142w<List<UserLanguage>> mo496B() {
        return this.f24443h.mo496B();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B0 */
    public final Object mo497B0(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f24443h.mo497B0(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: E1 */
    public final String mo498E1() {
        return this.f24443h.mo498E1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: J */
    public final Object mo499J(Profile profile, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f24443h.mo499J(profile, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: P */
    public final InterfaceC7142w<List<String>> mo500P() {
        return this.f24443h.mo500P();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: d */
    public final Object mo501d(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f24443h.mo501d(str, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f0 */
    public final boolean mo502f0() {
        InterfaceC0113j interfaceC0113j = this.f24443h;
        return true;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f1 */
    public final Object mo503f1(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f24443h.mo503f1(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: j1 */
    public final InterfaceC7116c<Profile> mo504j1() {
        return this.f24443h.mo504j1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l0 */
    public final Object mo505l0(ProfileAccount profileAccount, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f24443h.mo505l0(profileAccount, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l1 */
    public final boolean mo506l1() {
        return this.f24443h.mo506l1();
    }

    /* JADX INFO: renamed from: l2 */
    public final void m9923l2(String str, String str2) {
        C7499b.m14933c0(C8573r0.m16767w0(this), this.f24442g, this.f24441f, C0204c.m852k("goals ", str2), new StatsShareViewModel$getGoals$1(this, str, str2, null));
    }

    /* JADX INFO: renamed from: m2 */
    public final void m9924m2() {
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new StatsShareViewModel$shareStats$1(this, null), 3);
    }

    /* JADX INFO: renamed from: n2 */
    public final void m9925n2(String str) {
        C7499b.m14933c0(C8573r0.m16767w0(this), this.f24442g, this.f24441f, C0204c.m852k("update goals ", str), new StatsShareViewModel$updateGoals$1(this, str, null));
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: p1 */
    public final String mo507p1() {
        return this.f24443h.mo507p1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: t1 */
    public final InterfaceC7116c<ProfileAccount> mo508t1() {
        return this.f24443h.mo508t1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: w0 */
    public final InterfaceC7142w<UserLanguage> mo509w0() {
        return this.f24443h.mo509w0();
    }
}
