package com.lingq.p055ui.lesson.edit;

import ae.C0062b;
import androidx.view.AbstractC1036h0;
import androidx.view.C1024c0;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.repository.InterfaceC3324a;
import com.lingq.shared.uimodel.language.UserLanguage;
import com.lingq.util.C4924a;
import dm.C5207g;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlinx.coroutines.flow.C7134o;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7137r;
import kotlinx.coroutines.flow.InterfaceC7142w;
import p015ak.InterfaceC0113j;
import p204jj.InterfaceC6484e;
import p225kk.C6715l;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/lesson/edit/LessonEditParentViewModel;", "Landroidx/lifecycle/h0;", "Lak/j;", "Ljj/e;", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LessonEditParentViewModel extends AbstractC1036h0 implements InterfaceC0113j, InterfaceC6484e {

    /* JADX INFO: renamed from: d */
    public final InterfaceC3324a f27914d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC0113j f27915e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC6484e f27916f;

    /* JADX INFO: renamed from: g */
    public final int f27917g;

    /* JADX INFO: renamed from: h */
    public final C7138s f27918h;

    /* JADX INFO: renamed from: i */
    public final C7134o f27919i;

    public LessonEditParentViewModel(InterfaceC3324a interfaceC3324a, InterfaceC0113j interfaceC0113j, InterfaceC6484e interfaceC6484e, C1024c0 c1024c0) {
        C5207g.m11111f(interfaceC3324a, "lessonRepository");
        C5207g.m11111f(interfaceC0113j, "userSessionViewModelDelegate");
        C5207g.m11111f(interfaceC6484e, "lessonEditDelegate");
        C5207g.m11111f(c1024c0, "savedStateHandle");
        this.f27914d = interfaceC3324a;
        this.f27915e = interfaceC0113j;
        this.f27916f = interfaceC6484e;
        Integer num = (Integer) c1024c0.m3929b("lessonId");
        this.f27917g = num != null ? num.intValue() : 0;
        C7138s c7138sM10448a = C4924a.m10448a();
        this.f27918h = c7138sM10448a;
        this.f27919i = C0062b.m341d2(c7138sM10448a, C8573r0.m16767w0(this), C6715l.f37936a);
        mo10158W0();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B */
    public final InterfaceC7142w<List<UserLanguage>> mo496B() {
        return this.f27915e.mo496B();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B0 */
    public final Object mo497B0(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f27915e.mo497B0(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: E1 */
    public final String mo498E1() {
        return this.f27915e.mo498E1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: J */
    public final Object mo499J(Profile profile, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f27915e.mo499J(profile, interfaceC9968c);
    }

    @Override // p204jj.InterfaceC6484e
    /* JADX INFO: renamed from: K0 */
    public final InterfaceC7137r<Boolean> mo10155K0() {
        return this.f27916f.mo10155K0();
    }

    @Override // p204jj.InterfaceC6484e
    /* JADX INFO: renamed from: M0 */
    public final InterfaceC7137r<Pair<Integer, Integer>> mo10156M0() {
        return this.f27916f.mo10156M0();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: P */
    public final InterfaceC7142w<List<String>> mo500P() {
        return this.f27915e.mo500P();
    }

    @Override // p204jj.InterfaceC6484e
    /* JADX INFO: renamed from: T */
    public final void mo10157T(int i10) {
        this.f27916f.mo10157T(i10);
    }

    @Override // p204jj.InterfaceC6484e
    /* JADX INFO: renamed from: W0 */
    public final void mo10158W0() {
        this.f27916f.mo10158W0();
    }

    @Override // p204jj.InterfaceC6484e
    /* JADX INFO: renamed from: Z1 */
    public final List<Integer> mo10159Z1() {
        return this.f27916f.mo10159Z1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: d */
    public final Object mo501d(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f27915e.mo501d(str, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f0 */
    public final boolean mo502f0() {
        InterfaceC0113j interfaceC0113j = this.f27915e;
        return true;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f1 */
    public final Object mo503f1(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f27915e.mo503f1(interfaceC9968c);
    }

    @Override // p204jj.InterfaceC6484e
    /* JADX INFO: renamed from: i */
    public final void mo10160i(int i10, int i11) {
        this.f27916f.mo10160i(i10, i11);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: j1 */
    public final InterfaceC7116c<Profile> mo504j1() {
        return this.f27915e.mo504j1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l0 */
    public final Object mo505l0(ProfileAccount profileAccount, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f27915e.mo505l0(profileAccount, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l1 */
    public final boolean mo506l1() {
        return this.f27915e.mo506l1();
    }

    @Override // p204jj.InterfaceC6484e
    /* JADX INFO: renamed from: m0 */
    public final InterfaceC7137r<Boolean> mo10161m0() {
        return this.f27916f.mo10161m0();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: p1 */
    public final String mo507p1() {
        return this.f27915e.mo507p1();
    }

    @Override // p204jj.InterfaceC6484e
    /* JADX INFO: renamed from: s0 */
    public final void mo10162s0() {
        this.f27916f.mo10162s0();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: t1 */
    public final InterfaceC7116c<ProfileAccount> mo508t1() {
        return this.f27915e.mo508t1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: w0 */
    public final InterfaceC7142w<UserLanguage> mo509w0() {
        return this.f27915e.mo509w0();
    }

    @Override // p204jj.InterfaceC6484e
    /* JADX INFO: renamed from: x1 */
    public final void mo10163x1() {
        this.f27916f.mo10163x1();
    }
}
