package com.lingq.p055ui.review;

import ae.C0062b;
import androidx.view.AbstractC1036h0;
import androidx.view.C1024c0;
import ci.InterfaceC2008a;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.uimodel.language.UserLanguage;
import dm.C5207g;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C6753d;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.C7120g;
import kotlinx.coroutines.flow.C7135p;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7142w;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.StateFlowImpl;
import li.C7374a;
import no.C7828f;
import no.InterfaceC7882z;
import p015ak.InterfaceC0113j;
import p225kk.C6715l;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/ui/review/ReviewSessionCompleteViewModel;", "Landroidx/lifecycle/h0;", "Lak/j;", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ReviewSessionCompleteViewModel extends AbstractC1036h0 implements InterfaceC0113j {

    /* JADX INFO: renamed from: d */
    public final InterfaceC2008a f29578d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC0113j f29579e;

    /* JADX INFO: renamed from: f */
    public final int f29580f;

    /* JADX INFO: renamed from: g */
    public final int f29581g;

    /* JADX INFO: renamed from: h */
    public final StateFlowImpl f29582h;

    /* JADX INFO: renamed from: i */
    public final StateFlowImpl f29583i;

    /* JADX INFO: renamed from: j */
    public final StateFlowImpl f29584j;

    /* JADX INFO: renamed from: k */
    public final C7135p f29585k;

    public ReviewSessionCompleteViewModel(InterfaceC2008a interfaceC2008a, InterfaceC0113j interfaceC0113j, C1024c0 c1024c0) {
        C5207g.m11111f(interfaceC2008a, "cardRepository");
        C5207g.m11111f(interfaceC0113j, "userSessionViewModelDelegate");
        C5207g.m11111f(c1024c0, "savedStateHandle");
        this.f29578d = interfaceC2008a;
        this.f29579e = interfaceC0113j;
        Integer num = (Integer) c1024c0.m3929b("numberOfActivities");
        this.f29580f = num != null ? num.intValue() : 0;
        Integer num2 = (Integer) c1024c0.m3929b("numberOfCorrectActivities");
        this.f29581g = num2 != null ? num2.intValue() : 0;
        EmptyList emptyList = EmptyList.f38032a;
        StateFlowImpl stateFlowImplM14379a = C7120g.m14379a(emptyList);
        this.f29582h = stateFlowImplM14379a;
        InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(this);
        StartedWhileSubscribed startedWhileSubscribed = C6715l.f37936a;
        C0062b.m353h2(stateFlowImplM14379a, interfaceC7882zM16767w0, startedWhileSubscribed, emptyList);
        StateFlowImpl stateFlowImplM14379a2 = C7120g.m14379a(C6753d.m13459L0());
        this.f29583i = stateFlowImplM14379a2;
        StateFlowImpl stateFlowImplM14379a3 = C7120g.m14379a(C6753d.m13459L0());
        this.f29584j = stateFlowImplM14379a3;
        this.f29585k = C0062b.m353h2(C0062b.m389r0(stateFlowImplM14379a, stateFlowImplM14379a2, stateFlowImplM14379a3, new ReviewSessionCompleteViewModel$items$1(this, null)), C8573r0.m16767w0(this), startedWhileSubscribed, emptyList);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B */
    public final InterfaceC7142w<List<UserLanguage>> mo496B() {
        return this.f29579e.mo496B();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B0 */
    public final Object mo497B0(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f29579e.mo497B0(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: E1 */
    public final String mo498E1() {
        return this.f29579e.mo498E1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: J */
    public final Object mo499J(Profile profile, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f29579e.mo499J(profile, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: P */
    public final InterfaceC7142w<List<String>> mo500P() {
        return this.f29579e.mo500P();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: d */
    public final Object mo501d(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f29579e.mo501d(str, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f0 */
    public final boolean mo502f0() {
        InterfaceC0113j interfaceC0113j = this.f29579e;
        return true;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f1 */
    public final Object mo503f1(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f29579e.mo503f1(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: j1 */
    public final InterfaceC7116c<Profile> mo504j1() {
        return this.f29579e.mo504j1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l0 */
    public final Object mo505l0(ProfileAccount profileAccount, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f29579e.mo505l0(profileAccount, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l1 */
    public final boolean mo506l1() {
        return this.f29579e.mo506l1();
    }

    /* JADX INFO: renamed from: l2 */
    public final void m10245l2(C7374a c7374a, int i10) {
        C5207g.m11111f(c7374a, "token");
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new ReviewSessionCompleteViewModel$updateCardStatus$1(i10, this, c7374a, null), 3);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: p1 */
    public final String mo507p1() {
        return this.f29579e.mo507p1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: t1 */
    public final InterfaceC7116c<ProfileAccount> mo508t1() {
        return this.f29579e.mo508t1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: w0 */
    public final InterfaceC7142w<UserLanguage> mo509w0() {
        return this.f29579e.mo509w0();
    }
}
