package com.lingq.p055ui.upgrade;

import androidx.view.AbstractC1036h0;
import androidx.view.C1024c0;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.uimodel.language.UserLanguage;
import dm.C5207g;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7142w;
import p015ak.InterfaceC0113j;
import p205jk.InterfaceC6515k;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/upgrade/UpgradeGoPremiumViewModel;", "Landroidx/lifecycle/h0;", "Ljk/k;", "Lak/j;", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class UpgradeGoPremiumViewModel extends AbstractC1036h0 implements InterfaceC6515k, InterfaceC0113j {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC6515k f32026d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC0113j f32027e;

    public UpgradeGoPremiumViewModel(InterfaceC0113j interfaceC0113j, InterfaceC6515k interfaceC6515k, C1024c0 c1024c0) {
        C5207g.m11111f(interfaceC0113j, "userSessionViewModelDelegate");
        C5207g.m11111f(interfaceC6515k, "upgradePopupDelegate");
        C5207g.m11111f(c1024c0, "savedStateHandle");
        this.f32026d = interfaceC6515k;
        this.f32027e = interfaceC0113j;
    }

    @Override // p205jk.InterfaceC6515k
    /* JADX INFO: renamed from: A */
    public final void mo9771A(UpgradeReason upgradeReason) {
        C5207g.m11111f(upgradeReason, "reason");
        this.f32026d.mo9771A(upgradeReason);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B */
    public final InterfaceC7142w<List<UserLanguage>> mo496B() {
        return this.f32027e.mo496B();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B0 */
    public final Object mo497B0(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f32027e.mo497B0(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: E1 */
    public final String mo498E1() {
        return this.f32027e.mo498E1();
    }

    @Override // p205jk.InterfaceC6515k
    /* JADX INFO: renamed from: G1 */
    public final void mo9772G1(String str) {
        this.f32026d.mo9772G1(str);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: J */
    public final Object mo499J(Profile profile, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f32027e.mo499J(profile, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: P */
    public final InterfaceC7142w<List<String>> mo500P() {
        return this.f32027e.mo500P();
    }

    @Override // p205jk.InterfaceC6515k
    /* JADX INFO: renamed from: S0 */
    public final InterfaceC7116c<UpgradeReason> mo9773S0() {
        return this.f32026d.mo9773S0();
    }

    @Override // p205jk.InterfaceC6515k
    /* JADX INFO: renamed from: X */
    public final InterfaceC7116c<String> mo9774X() {
        return this.f32026d.mo9774X();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: d */
    public final Object mo501d(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f32027e.mo501d(str, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f0 */
    public final boolean mo502f0() {
        InterfaceC0113j interfaceC0113j = this.f32027e;
        return true;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f1 */
    public final Object mo503f1(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f32027e.mo503f1(interfaceC9968c);
    }

    @Override // p205jk.InterfaceC6515k
    /* JADX INFO: renamed from: i0 */
    public final InterfaceC7116c<C9072e> mo9775i0() {
        return this.f32026d.mo9775i0();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: j1 */
    public final InterfaceC7116c<Profile> mo504j1() {
        return this.f32027e.mo504j1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l0 */
    public final Object mo505l0(ProfileAccount profileAccount, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f32027e.mo505l0(profileAccount, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l1 */
    public final boolean mo506l1() {
        return this.f32027e.mo506l1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: p1 */
    public final String mo507p1() {
        return this.f32027e.mo507p1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: t1 */
    public final InterfaceC7116c<ProfileAccount> mo508t1() {
        return this.f32027e.mo508t1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: w0 */
    public final InterfaceC7142w<UserLanguage> mo509w0() {
        return this.f32027e.mo509w0();
    }
}
