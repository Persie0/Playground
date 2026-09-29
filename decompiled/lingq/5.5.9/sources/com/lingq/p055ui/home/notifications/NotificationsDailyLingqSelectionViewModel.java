package com.lingq.p055ui.home.notifications;

import ae.C0062b;
import androidx.view.AbstractC1036h0;
import androidx.view.C1024c0;
import ci.InterfaceC2012e;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.uimodel.language.UserLanguage;
import com.lingq.util.C4924a;
import dm.C5207g;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.C7120g;
import kotlinx.coroutines.flow.C7134o;
import kotlinx.coroutines.flow.C7135p;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7142w;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import kotlinx.coroutines.scheduling.ExecutorC7177a;
import no.C7828f;
import no.InterfaceC7882z;
import p015ak.InterfaceC0113j;
import p225kk.C6715l;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/ui/home/notifications/NotificationsDailyLingqSelectionViewModel;", "Landroidx/lifecycle/h0;", "Lak/j;", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class NotificationsDailyLingqSelectionViewModel extends AbstractC1036h0 implements InterfaceC0113j {

    /* JADX INFO: renamed from: d */
    public final InterfaceC2012e f25266d;

    /* JADX INFO: renamed from: e */
    public final CoroutineDispatcher f25267e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC0113j f25268f;

    /* JADX INFO: renamed from: g */
    public final String f25269g;

    /* JADX INFO: renamed from: h */
    public final String[] f25270h;

    /* JADX INFO: renamed from: i */
    public final StateFlowImpl f25271i;

    /* JADX INFO: renamed from: j */
    public final C7135p f25272j;

    /* JADX INFO: renamed from: k */
    public final C7138s f25273k;

    /* JADX INFO: renamed from: l */
    public final C7134o f25274l;

    public NotificationsDailyLingqSelectionViewModel(InterfaceC2012e interfaceC2012e, ExecutorC7177a executorC7177a, InterfaceC0113j interfaceC0113j, C1024c0 c1024c0) {
        C5207g.m11111f(interfaceC2012e, "languageRepository");
        C5207g.m11111f(interfaceC0113j, "userSessionViewModelDelegate");
        C5207g.m11111f(c1024c0, "savedStateHandle");
        this.f25266d = interfaceC2012e;
        this.f25267e = executorC7177a;
        this.f25268f = interfaceC0113j;
        String str = (String) c1024c0.m3929b("code");
        this.f25269g = str == null ? "" : str;
        this.f25270h = new String[]{"25", "50", "75", "100", "200"};
        EmptyList emptyList = EmptyList.f38032a;
        StateFlowImpl stateFlowImplM14379a = C7120g.m14379a(emptyList);
        this.f25271i = stateFlowImplM14379a;
        ChannelFlowTransformLatest channelFlowTransformLatestM399t2 = C0062b.m399t2(stateFlowImplM14379a, new NotificationsDailyLingqSelectionViewModel$selectionItems$1(null));
        InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(this);
        StartedWhileSubscribed startedWhileSubscribed = C6715l.f37936a;
        this.f25272j = C0062b.m353h2(channelFlowTransformLatestM399t2, interfaceC7882zM16767w0, startedWhileSubscribed, emptyList);
        C7138s c7138sM10448a = C4924a.m10448a();
        this.f25273k = c7138sM10448a;
        this.f25274l = C0062b.m341d2(c7138sM10448a, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7828f.m15570d(C8573r0.m16767w0(this), executorC7177a, null, new NotificationsDailyLingqSelectionViewModel$getLanguage$1(this, null), 2);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B */
    public final InterfaceC7142w<List<UserLanguage>> mo496B() {
        return this.f25268f.mo496B();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B0 */
    public final Object mo497B0(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f25268f.mo497B0(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: E1 */
    public final String mo498E1() {
        return this.f25268f.mo498E1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: J */
    public final Object mo499J(Profile profile, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f25268f.mo499J(profile, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: P */
    public final InterfaceC7142w<List<String>> mo500P() {
        return this.f25268f.mo500P();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: d */
    public final Object mo501d(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f25268f.mo501d(str, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f0 */
    public final boolean mo502f0() {
        InterfaceC0113j interfaceC0113j = this.f25268f;
        return true;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f1 */
    public final Object mo503f1(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f25268f.mo503f1(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: j1 */
    public final InterfaceC7116c<Profile> mo504j1() {
        return this.f25268f.mo504j1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l0 */
    public final Object mo505l0(ProfileAccount profileAccount, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f25268f.mo505l0(profileAccount, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l1 */
    public final boolean mo506l1() {
        return this.f25268f.mo506l1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: p1 */
    public final String mo507p1() {
        return this.f25268f.mo507p1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: t1 */
    public final InterfaceC7116c<ProfileAccount> mo508t1() {
        return this.f25268f.mo508t1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: w0 */
    public final InterfaceC7142w<UserLanguage> mo509w0() {
        return this.f25268f.mo509w0();
    }
}
