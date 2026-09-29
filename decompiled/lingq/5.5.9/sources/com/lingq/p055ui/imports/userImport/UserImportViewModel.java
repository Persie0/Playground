package com.lingq.p055ui.imports.userImport;

import ae.C0062b;
import androidx.view.AbstractC1036h0;
import androidx.view.C1024c0;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.commons.p053ui.UserImportDetailType;
import com.lingq.p055ui.upgrade.UpgradeReason;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.domain.Resource;
import com.lingq.shared.repository.InterfaceC3324a;
import com.lingq.shared.uimodel.language.UserLanguage;
import com.lingq.util.C4924a;
import dm.C5207g;
import fj.C5546g;
import fj.C5549j;
import fj.InterfaceC5547h;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.C7120g;
import kotlinx.coroutines.flow.C7134o;
import kotlinx.coroutines.flow.C7135p;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7137r;
import kotlinx.coroutines.flow.InterfaceC7142w;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.StateFlowImpl;
import mo.C7661i;
import ni.C7796d;
import no.InterfaceC7882z;
import p015ak.InterfaceC0113j;
import p076di.InterfaceC5180b;
import p205jk.InterfaceC6515k;
import p225kk.C6715l;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, m13365d2 = {"Lcom/lingq/ui/imports/userImport/UserImportViewModel;", "Landroidx/lifecycle/h0;", "Lfj/h;", "Lak/j;", "Ljk/k;", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class UserImportViewModel extends AbstractC1036h0 implements InterfaceC5547h, InterfaceC0113j, InterfaceC6515k {

    /* JADX INFO: renamed from: H */
    public final C7135p f26794H;

    /* JADX INFO: renamed from: I */
    public final StateFlowImpl f26795I;

    /* JADX INFO: renamed from: J */
    public final C7135p f26796J;

    /* JADX INFO: renamed from: K */
    public final StateFlowImpl f26797K;

    /* JADX INFO: renamed from: L */
    public final C7135p f26798L;

    /* JADX INFO: renamed from: M */
    public final C7138s f26799M;

    /* JADX INFO: renamed from: N */
    public final C7134o f26800N;

    /* JADX INFO: renamed from: O */
    public final C7138s f26801O;

    /* JADX INFO: renamed from: P */
    public final C7134o f26802P;

    /* JADX INFO: renamed from: Q */
    public final StateFlowImpl f26803Q;

    /* JADX INFO: renamed from: R */
    public final C7135p f26804R;

    /* JADX INFO: renamed from: d */
    public final InterfaceC3324a f26805d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC5180b f26806e;

    /* JADX INFO: renamed from: f */
    public final C7796d f26807f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC5547h f26808g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC0113j f26809h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC6515k f26810i;

    /* JADX INFO: renamed from: j */
    public final StateFlowImpl f26811j;

    /* JADX INFO: renamed from: k */
    public final C7135p f26812k;

    /* JADX INFO: renamed from: l */
    public final StateFlowImpl f26813l;

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public UserImportViewModel(InterfaceC3324a interfaceC3324a, InterfaceC5180b interfaceC5180b, InterfaceC5547h interfaceC5547h, C7796d c7796d, InterfaceC6515k interfaceC6515k, InterfaceC0113j interfaceC0113j, C1024c0 c1024c0) {
        String str;
        C5207g.m11111f(interfaceC3324a, "lessonRepository");
        C5207g.m11111f(interfaceC5180b, "profileStore");
        C5207g.m11111f(interfaceC5547h, "userImportDelegate");
        C5207g.m11111f(c7796d, "analytics");
        C5207g.m11111f(interfaceC6515k, "upgradePopupDelegate");
        C5207g.m11111f(interfaceC0113j, "userSessionViewModelDelegate");
        C5207g.m11111f(c1024c0, "savedStateHandle");
        this.f26805d = interfaceC3324a;
        this.f26806e = interfaceC5180b;
        this.f26807f = c7796d;
        this.f26808g = interfaceC5547h;
        this.f26809h = interfaceC0113j;
        this.f26810i = interfaceC6515k;
        LinkedHashMap linkedHashMap = c1024c0.f6616a;
        String str2 = "";
        if (linkedHashMap.containsKey("url")) {
            str = (String) c1024c0.m3929b("url");
            if (str == null) {
                throw new IllegalArgumentException("Argument \"url\" is marked as non-null but was passed a null value");
            }
        } else {
            str = "";
        }
        if (linkedHashMap.containsKey("title") && (str2 = (String) c1024c0.m3929b("title")) == null) {
            throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value");
        }
        C5549j c5549j = new C5549j(str, str2);
        EmptyList emptyList = EmptyList.f38032a;
        StateFlowImpl stateFlowImplM14379a = C7120g.m14379a(emptyList);
        this.f26811j = stateFlowImplM14379a;
        InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(this);
        StartedWhileSubscribed startedWhileSubscribed = C6715l.f37936a;
        this.f26812k = C0062b.m353h2(stateFlowImplM14379a, interfaceC7882zM16767w0, startedWhileSubscribed, emptyList);
        StateFlowImpl stateFlowImplM14379a2 = C7120g.m14379a(null);
        this.f26813l = stateFlowImplM14379a2;
        this.f26794H = C0062b.m353h2(stateFlowImplM14379a2, C8573r0.m16767w0(this), startedWhileSubscribed, null);
        Resource.Status status = Resource.Status.EMPTY;
        StateFlowImpl stateFlowImplM14379a3 = C7120g.m14379a(status);
        this.f26795I = stateFlowImplM14379a3;
        this.f26796J = C0062b.m353h2(stateFlowImplM14379a3, C8573r0.m16767w0(this), startedWhileSubscribed, status);
        Boolean bool = Boolean.FALSE;
        StateFlowImpl stateFlowImplM14379a4 = C7120g.m14379a(bool);
        this.f26797K = stateFlowImplM14379a4;
        this.f26798L = C0062b.m353h2(stateFlowImplM14379a4, C8573r0.m16767w0(this), startedWhileSubscribed, bool);
        C7138s c7138sM10448a = C4924a.m10448a();
        this.f26799M = c7138sM10448a;
        this.f26800N = C0062b.m341d2(c7138sM10448a, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7138s c7138sM10448a2 = C4924a.m10448a();
        this.f26801O = c7138sM10448a2;
        this.f26802P = C0062b.m341d2(c7138sM10448a2, C8573r0.m16767w0(this), startedWhileSubscribed);
        StateFlowImpl stateFlowImplM14379a5 = C7120g.m14379a(null);
        this.f26803Q = stateFlowImplM14379a5;
        this.f26804R = C0062b.m353h2(C0062b.m377o0(stateFlowImplM14379a5, mo509w0(), mo10080T1(), new UserImportViewModel$openLessonWithId$1(this, null)), C8573r0.m16767w0(this), startedWhileSubscribed, null);
        String str3 = c5549j.f34300b;
        boolean z10 = !C7661i.m15250P2(str3);
        String str4 = c5549j.f34299a;
        if (z10 || (!C7661i.m15250P2(str4))) {
            C5546g value = mo10080T1().getValue();
            value.getClass();
            value.f34281b = str3;
            C5207g.m11111f(str4, "<set-?>");
            value.f34285f = str4;
            interfaceC5547h.mo10085v0(value);
        }
    }

    @Override // p205jk.InterfaceC6515k
    /* JADX INFO: renamed from: A */
    public final void mo9771A(UpgradeReason upgradeReason) {
        C5207g.m11111f(upgradeReason, "reason");
        this.f26810i.mo9771A(upgradeReason);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B */
    public final InterfaceC7142w<List<UserLanguage>> mo496B() {
        return this.f26809h.mo496B();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B0 */
    public final Object mo497B0(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f26809h.mo497B0(interfaceC9968c);
    }

    @Override // fj.InterfaceC5547h
    /* JADX INFO: renamed from: C */
    public final InterfaceC7137r<UserImportDetailType> mo10075C() {
        return this.f26808g.mo10075C();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: E1 */
    public final String mo498E1() {
        return this.f26809h.mo498E1();
    }

    @Override // fj.InterfaceC5547h
    /* JADX INFO: renamed from: F */
    public final InterfaceC7137r<Integer> mo10076F() {
        return this.f26808g.mo10076F();
    }

    @Override // p205jk.InterfaceC6515k
    /* JADX INFO: renamed from: G1 */
    public final void mo9772G1(String str) {
        this.f26810i.mo9772G1(str);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: J */
    public final Object mo499J(Profile profile, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f26809h.mo499J(profile, interfaceC9968c);
    }

    @Override // fj.InterfaceC5547h
    /* JADX INFO: renamed from: K1 */
    public final void mo10077K1() {
        this.f26808g.mo10077K1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: P */
    public final InterfaceC7142w<List<String>> mo500P() {
        return this.f26809h.mo500P();
    }

    @Override // fj.InterfaceC5547h
    /* JADX INFO: renamed from: P0 */
    public final void mo10078P0(Triple<? extends UserImportDetailType, String, Boolean> triple) {
        this.f26808g.mo10078P0(triple);
    }

    @Override // fj.InterfaceC5547h
    /* JADX INFO: renamed from: R */
    public final InterfaceC7137r<Boolean> mo10079R() {
        return this.f26808g.mo10079R();
    }

    @Override // p205jk.InterfaceC6515k
    /* JADX INFO: renamed from: S0 */
    public final InterfaceC7116c<UpgradeReason> mo9773S0() {
        return this.f26810i.mo9773S0();
    }

    @Override // fj.InterfaceC5547h
    /* JADX INFO: renamed from: T1 */
    public final InterfaceC7142w<C5546g> mo10080T1() {
        return this.f26808g.mo10080T1();
    }

    @Override // fj.InterfaceC5547h
    /* JADX INFO: renamed from: V1 */
    public final void mo10081V1(int i10) {
        this.f26808g.mo10081V1(i10);
    }

    @Override // p205jk.InterfaceC6515k
    /* JADX INFO: renamed from: X */
    public final InterfaceC7116c<String> mo9774X() {
        return this.f26810i.mo9774X();
    }

    @Override // fj.InterfaceC5547h
    /* JADX INFO: renamed from: c2 */
    public final InterfaceC7137r<Boolean> mo10082c2() {
        return this.f26808g.mo10082c2();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: d */
    public final Object mo501d(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f26809h.mo501d(str, interfaceC9968c);
    }

    @Override // fj.InterfaceC5547h
    /* JADX INFO: renamed from: e */
    public final void mo10083e(UserImportDetailType userImportDetailType) {
        C5207g.m11111f(userImportDetailType, "userImportDetailType");
        this.f26808g.mo10083e(userImportDetailType);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f0 */
    public final boolean mo502f0() {
        InterfaceC0113j interfaceC0113j = this.f26809h;
        return true;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f1 */
    public final Object mo503f1(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f26809h.mo503f1(interfaceC9968c);
    }

    @Override // p205jk.InterfaceC6515k
    /* JADX INFO: renamed from: i0 */
    public final InterfaceC7116c<C9072e> mo9775i0() {
        return this.f26810i.mo9775i0();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: j1 */
    public final InterfaceC7116c<Profile> mo504j1() {
        return this.f26809h.mo504j1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l0 */
    public final Object mo505l0(ProfileAccount profileAccount, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f26809h.mo505l0(profileAccount, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l1 */
    public final boolean mo506l1() {
        return this.f26809h.mo506l1();
    }

    @Override // fj.InterfaceC5547h
    /* JADX INFO: renamed from: o1 */
    public final InterfaceC7137r<Triple<UserImportDetailType, String, Boolean>> mo10084o1() {
        return this.f26808g.mo10084o1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: p1 */
    public final String mo507p1() {
        return this.f26809h.mo507p1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: t1 */
    public final InterfaceC7116c<ProfileAccount> mo508t1() {
        return this.f26809h.mo508t1();
    }

    @Override // fj.InterfaceC5547h
    /* JADX INFO: renamed from: v0 */
    public final void mo10085v0(C5546g c5546g) {
        this.f26808g.mo10085v0(c5546g);
    }

    @Override // fj.InterfaceC5547h
    /* JADX INFO: renamed from: w */
    public final void mo10086w() {
        this.f26808g.mo10086w();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: w0 */
    public final InterfaceC7142w<UserLanguage> mo509w0() {
        return this.f26809h.mo509w0();
    }
}
