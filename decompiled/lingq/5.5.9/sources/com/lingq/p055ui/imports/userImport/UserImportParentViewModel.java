package com.lingq.p055ui.imports.userImport;

import androidx.view.AbstractC1036h0;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.commons.p053ui.UserImportDetailType;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.uimodel.language.UserLanguage;
import dm.C5207g;
import fj.C5546g;
import fj.InterfaceC5547h;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7137r;
import kotlinx.coroutines.flow.InterfaceC7142w;
import p015ak.InterfaceC0113j;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/imports/userImport/UserImportParentViewModel;", "Landroidx/lifecycle/h0;", "Lak/j;", "Lfj/h;", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class UserImportParentViewModel extends AbstractC1036h0 implements InterfaceC0113j, InterfaceC5547h {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC0113j f26678d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC5547h f26679e;

    public UserImportParentViewModel(InterfaceC5547h interfaceC5547h, InterfaceC0113j interfaceC0113j) {
        C5207g.m11111f(interfaceC5547h, "userImportDelegate");
        C5207g.m11111f(interfaceC0113j, "userSessionViewModelDelegate");
        this.f26678d = interfaceC0113j;
        this.f26679e = interfaceC5547h;
        interfaceC5547h.mo10085v0(new C5546g(mo498E1(), 126));
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B */
    public final InterfaceC7142w<List<UserLanguage>> mo496B() {
        return this.f26678d.mo496B();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B0 */
    public final Object mo497B0(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f26678d.mo497B0(interfaceC9968c);
    }

    @Override // fj.InterfaceC5547h
    /* JADX INFO: renamed from: C */
    public final InterfaceC7137r<UserImportDetailType> mo10075C() {
        return this.f26679e.mo10075C();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: E1 */
    public final String mo498E1() {
        return this.f26678d.mo498E1();
    }

    @Override // fj.InterfaceC5547h
    /* JADX INFO: renamed from: F */
    public final InterfaceC7137r<Integer> mo10076F() {
        return this.f26679e.mo10076F();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: J */
    public final Object mo499J(Profile profile, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f26678d.mo499J(profile, interfaceC9968c);
    }

    @Override // fj.InterfaceC5547h
    /* JADX INFO: renamed from: K1 */
    public final void mo10077K1() {
        this.f26679e.mo10077K1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: P */
    public final InterfaceC7142w<List<String>> mo500P() {
        return this.f26678d.mo500P();
    }

    @Override // fj.InterfaceC5547h
    /* JADX INFO: renamed from: P0 */
    public final void mo10078P0(Triple<? extends UserImportDetailType, String, Boolean> triple) {
        this.f26679e.mo10078P0(triple);
    }

    @Override // fj.InterfaceC5547h
    /* JADX INFO: renamed from: R */
    public final InterfaceC7137r<Boolean> mo10079R() {
        return this.f26679e.mo10079R();
    }

    @Override // fj.InterfaceC5547h
    /* JADX INFO: renamed from: T1 */
    public final InterfaceC7142w<C5546g> mo10080T1() {
        return this.f26679e.mo10080T1();
    }

    @Override // fj.InterfaceC5547h
    /* JADX INFO: renamed from: V1 */
    public final void mo10081V1(int i10) {
        this.f26679e.mo10081V1(i10);
    }

    @Override // fj.InterfaceC5547h
    /* JADX INFO: renamed from: c2 */
    public final InterfaceC7137r<Boolean> mo10082c2() {
        return this.f26679e.mo10082c2();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: d */
    public final Object mo501d(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f26678d.mo501d(str, interfaceC9968c);
    }

    @Override // fj.InterfaceC5547h
    /* JADX INFO: renamed from: e */
    public final void mo10083e(UserImportDetailType userImportDetailType) {
        C5207g.m11111f(userImportDetailType, "userImportDetailType");
        this.f26679e.mo10083e(userImportDetailType);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f0 */
    public final boolean mo502f0() {
        InterfaceC0113j interfaceC0113j = this.f26678d;
        return true;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f1 */
    public final Object mo503f1(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f26678d.mo503f1(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: j1 */
    public final InterfaceC7116c<Profile> mo504j1() {
        return this.f26678d.mo504j1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l0 */
    public final Object mo505l0(ProfileAccount profileAccount, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f26678d.mo505l0(profileAccount, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l1 */
    public final boolean mo506l1() {
        return this.f26678d.mo506l1();
    }

    @Override // fj.InterfaceC5547h
    /* JADX INFO: renamed from: o1 */
    public final InterfaceC7137r<Triple<UserImportDetailType, String, Boolean>> mo10084o1() {
        return this.f26679e.mo10084o1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: p1 */
    public final String mo507p1() {
        return this.f26678d.mo507p1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: t1 */
    public final InterfaceC7116c<ProfileAccount> mo508t1() {
        return this.f26678d.mo508t1();
    }

    @Override // fj.InterfaceC5547h
    /* JADX INFO: renamed from: v0 */
    public final void mo10085v0(C5546g c5546g) {
        this.f26679e.mo10085v0(c5546g);
    }

    @Override // fj.InterfaceC5547h
    /* JADX INFO: renamed from: w */
    public final void mo10086w() {
        this.f26679e.mo10086w();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: w0 */
    public final InterfaceC7142w<UserLanguage> mo509w0() {
        return this.f26678d.mo509w0();
    }
}
