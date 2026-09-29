package com.lingq.p055ui.home.challenges;

import ae.C0062b;
import androidx.view.AbstractC1036h0;
import androidx.view.C1024c0;
import ci.InterfaceC2009b;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.uimodel.language.UserLanguage;
import com.lingq.util.C4924a;
import dm.C5207g;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C7120g;
import kotlinx.coroutines.flow.C7134o;
import kotlinx.coroutines.flow.C7135p;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7142w;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.scheduling.ExecutorC7177a;
import no.C7828f;
import no.InterfaceC7882z;
import p015ak.InterfaceC0113j;
import p225kk.C6715l;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import si.C9026j;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/ui/home/challenges/ChallengeShareViewModel;", "Landroidx/lifecycle/h0;", "Lak/j;", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ChallengeShareViewModel extends AbstractC1036h0 implements InterfaceC0113j {

    /* JADX INFO: renamed from: H */
    public final C7138s f23025H;

    /* JADX INFO: renamed from: I */
    public final C7134o f23026I;

    /* JADX INFO: renamed from: J */
    public final StateFlowImpl f23027J;

    /* JADX INFO: renamed from: K */
    public final C7135p f23028K;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2009b f23029d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC0113j f23030e;

    /* JADX INFO: renamed from: f */
    public final C9026j f23031f;

    /* JADX INFO: renamed from: g */
    public final C7138s f23032g;

    /* JADX INFO: renamed from: h */
    public final C7134o f23033h;

    /* JADX INFO: renamed from: i */
    public final C7138s f23034i;

    /* JADX INFO: renamed from: j */
    public final C7134o f23035j;

    /* JADX INFO: renamed from: k */
    public final C7138s f23036k;

    /* JADX INFO: renamed from: l */
    public final C7134o f23037l;

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    public ChallengeShareViewModel(InterfaceC2009b interfaceC2009b, ExecutorC7177a executorC7177a, InterfaceC0113j interfaceC0113j, C1024c0 c1024c0) {
        C5207g.m11111f(interfaceC2009b, "challengeRepository");
        C5207g.m11111f(interfaceC0113j, "userSessionViewModelDelegate");
        C5207g.m11111f(c1024c0, "savedStateHandle");
        this.f23029d = interfaceC2009b;
        this.f23030e = interfaceC0113j;
        LinkedHashMap linkedHashMap = c1024c0.f6616a;
        if (!linkedHashMap.containsKey("challengeCode")) {
            throw new IllegalArgumentException("Required argument \"challengeCode\" is missing and does not have an android:defaultValue");
        }
        String str = (String) c1024c0.m3929b("challengeCode");
        if (str == null) {
            throw new IllegalArgumentException("Argument \"challengeCode\" is marked as non-null but was passed a null value");
        }
        if (!linkedHashMap.containsKey("title")) {
            throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
        }
        String str2 = (String) c1024c0.m3929b("title");
        if (str2 == null) {
            throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value");
        }
        this.f23031f = new C9026j(str, str2);
        C7138s c7138sM10448a = C4924a.m10448a();
        this.f23032g = c7138sM10448a;
        InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(this);
        StartedWhileSubscribed startedWhileSubscribed = C6715l.f37936a;
        this.f23033h = C0062b.m341d2(c7138sM10448a, interfaceC7882zM16767w0, startedWhileSubscribed);
        C7138s c7138sM10448a2 = C4924a.m10448a();
        this.f23034i = c7138sM10448a2;
        this.f23035j = C0062b.m341d2(c7138sM10448a2, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7138s c7138sM10448a3 = C4924a.m10448a();
        this.f23036k = c7138sM10448a3;
        this.f23037l = C0062b.m341d2(c7138sM10448a3, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7138s c7138sM10448a4 = C4924a.m10448a();
        this.f23025H = c7138sM10448a4;
        this.f23026I = C0062b.m341d2(c7138sM10448a4, C8573r0.m16767w0(this), startedWhileSubscribed);
        StateFlowImpl stateFlowImplM14379a = C7120g.m14379a(null);
        this.f23027J = stateFlowImplM14379a;
        this.f23028K = C0062b.m306S(stateFlowImplM14379a);
        C7828f.m15570d(C8573r0.m16767w0(this), executorC7177a, null, new ChallengeShareViewModel$observableChallengeDetail$1(this, null), 2);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B */
    public final InterfaceC7142w<List<UserLanguage>> mo496B() {
        return this.f23030e.mo496B();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B0 */
    public final Object mo497B0(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f23030e.mo497B0(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: E1 */
    public final String mo498E1() {
        return this.f23030e.mo498E1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: J */
    public final Object mo499J(Profile profile, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f23030e.mo499J(profile, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: P */
    public final InterfaceC7142w<List<String>> mo500P() {
        return this.f23030e.mo500P();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: d */
    public final Object mo501d(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f23030e.mo501d(str, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f0 */
    public final boolean mo502f0() {
        InterfaceC0113j interfaceC0113j = this.f23030e;
        return true;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f1 */
    public final Object mo503f1(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f23030e.mo503f1(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: j1 */
    public final InterfaceC7116c<Profile> mo504j1() {
        return this.f23030e.mo504j1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l0 */
    public final Object mo505l0(ProfileAccount profileAccount, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f23030e.mo505l0(profileAccount, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l1 */
    public final boolean mo506l1() {
        return this.f23030e.mo506l1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: p1 */
    public final String mo507p1() {
        return this.f23030e.mo507p1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: t1 */
    public final InterfaceC7116c<ProfileAccount> mo508t1() {
        return this.f23030e.mo508t1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: w0 */
    public final InterfaceC7142w<UserLanguage> mo509w0() {
        return this.f23030e.mo509w0();
    }
}
