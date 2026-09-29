package com.lingq.p055ui.home.playlist;

import ae.C0062b;
import androidx.view.AbstractC1036h0;
import androidx.view.C1024c0;
import bj.C1602y;
import bj.InterfaceC1598u;
import ci.InterfaceC2019l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.upgrade.UpgradeReason;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.domain.Resource;
import com.lingq.shared.uimodel.language.UserLanguage;
import com.lingq.shared.uimodel.playlist.UserPlaylist;
import dm.C5207g;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.C7120g;
import kotlinx.coroutines.flow.C7135p;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7137r;
import kotlinx.coroutines.flow.InterfaceC7142w;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.scheduling.ExecutorC7177a;
import no.C7828f;
import no.InterfaceC7882z;
import p015ak.InterfaceC0113j;
import p205jk.InterfaceC6515k;
import p225kk.C6715l;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, m13365d2 = {"Lcom/lingq/ui/home/playlist/PlaylistsViewModel;", "Landroidx/lifecycle/h0;", "Lak/j;", "Lbj/u;", "Ljk/k;", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class PlaylistsViewModel extends AbstractC1036h0 implements InterfaceC0113j, InterfaceC1598u, InterfaceC6515k {

    /* JADX INFO: renamed from: d */
    public final InterfaceC2019l f25893d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC0113j f25894e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC1598u f25895f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC6515k f25896g;

    /* JADX INFO: renamed from: h */
    public final C1602y f25897h;

    /* JADX INFO: renamed from: i */
    public final StateFlowImpl f25898i;

    /* JADX INFO: renamed from: j */
    public final C7135p f25899j;

    /* JADX INFO: renamed from: k */
    public final StateFlowImpl f25900k;

    /* JADX INFO: renamed from: l */
    public final C7135p f25901l;

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public PlaylistsViewModel(InterfaceC2019l interfaceC2019l, ExecutorC7177a executorC7177a, InterfaceC1598u interfaceC1598u, InterfaceC0113j interfaceC0113j, InterfaceC6515k interfaceC6515k, C1024c0 c1024c0) {
        Integer num;
        String str;
        Boolean bool;
        Boolean bool2;
        C5207g.m11111f(interfaceC2019l, "playlistRepository");
        C5207g.m11111f(interfaceC1598u, "playlistUpdatesDelegate");
        C5207g.m11111f(interfaceC0113j, "userSessionViewModelDelegate");
        C5207g.m11111f(interfaceC6515k, "upgradePopupDelegate");
        C5207g.m11111f(c1024c0, "savedStateHandle");
        this.f25893d = interfaceC2019l;
        this.f25894e = interfaceC0113j;
        this.f25895f = interfaceC1598u;
        this.f25896g = interfaceC6515k;
        LinkedHashMap linkedHashMap = c1024c0.f6616a;
        if (linkedHashMap.containsKey("itemId")) {
            num = (Integer) c1024c0.m3929b("itemId");
            if (num == null) {
                throw new IllegalArgumentException("Argument \"itemId\" of type integer does not support null values");
            }
        } else {
            num = -1;
        }
        if (linkedHashMap.containsKey("itemURL")) {
            str = (String) c1024c0.m3929b("itemURL");
            if (str == null) {
                throw new IllegalArgumentException("Argument \"itemURL\" is marked as non-null but was passed a null value");
            }
        } else {
            str = "";
        }
        if (linkedHashMap.containsKey("isCourse")) {
            bool = (Boolean) c1024c0.m3929b("isCourse");
            if (bool == null) {
                throw new IllegalArgumentException("Argument \"isCourse\" of type boolean does not support null values");
            }
        } else {
            bool = Boolean.FALSE;
        }
        if (linkedHashMap.containsKey("isRemovePlaylist")) {
            bool2 = (Boolean) c1024c0.m3929b("isRemovePlaylist");
            if (bool2 == null) {
                throw new IllegalArgumentException("Argument \"isRemovePlaylist\" of type boolean does not support null values");
            }
        } else {
            bool2 = Boolean.FALSE;
        }
        C1602y c1602y = new C1602y(str, num.intValue(), bool.booleanValue(), bool2.booleanValue());
        this.f25897h = c1602y;
        Resource.Status status = Resource.Status.EMPTY;
        StateFlowImpl stateFlowImplM14379a = C7120g.m14379a(status);
        this.f25898i = stateFlowImplM14379a;
        InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(this);
        StartedWhileSubscribed startedWhileSubscribed = C6715l.f37936a;
        this.f25899j = C0062b.m353h2(stateFlowImplM14379a, interfaceC7882zM16767w0, startedWhileSubscribed, status);
        EmptyList emptyList = EmptyList.f38032a;
        StateFlowImpl stateFlowImplM14379a2 = C7120g.m14379a(emptyList);
        this.f25900k = stateFlowImplM14379a2;
        this.f25901l = C0062b.m353h2(C0062b.m399t2(stateFlowImplM14379a2, new PlaylistsViewModel$playlists$1(null)), C8573r0.m16767w0(this), startedWhileSubscribed, emptyList);
        if (c1602y.f9090d) {
            C7828f.m15570d(C8573r0.m16767w0(this), null, null, new PlaylistsViewModel$getLessonPlaylists$1(this, null), 3);
        } else {
            C7828f.m15570d(C8573r0.m16767w0(this), null, null, new PlaylistsViewModel$getPlaylists$1(this, null), 3);
        }
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new PlaylistsViewModel$updatePlaylists$1(this, null), 3);
    }

    @Override // p205jk.InterfaceC6515k
    /* JADX INFO: renamed from: A */
    public final void mo9771A(UpgradeReason upgradeReason) {
        C5207g.m11111f(upgradeReason, "reason");
        this.f25896g.mo9771A(upgradeReason);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B */
    public final InterfaceC7142w<List<UserLanguage>> mo496B() {
        return this.f25894e.mo496B();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B0 */
    public final Object mo497B0(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f25894e.mo497B0(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: E1 */
    public final String mo498E1() {
        return this.f25894e.mo498E1();
    }

    @Override // bj.InterfaceC1598u
    /* JADX INFO: renamed from: F1 */
    public final void mo5248F1(UserPlaylist userPlaylist) {
        C5207g.m11111f(userPlaylist, "playlist");
        this.f25895f.mo5248F1(userPlaylist);
    }

    @Override // p205jk.InterfaceC6515k
    /* JADX INFO: renamed from: G1 */
    public final void mo9772G1(String str) {
        this.f25896g.mo9772G1(str);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: J */
    public final Object mo499J(Profile profile, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f25894e.mo499J(profile, interfaceC9968c);
    }

    @Override // bj.InterfaceC1598u
    /* JADX INFO: renamed from: J1 */
    public final InterfaceC7137r<UserPlaylist> mo5249J1() {
        return this.f25895f.mo5249J1();
    }

    @Override // bj.InterfaceC1598u
    /* JADX INFO: renamed from: M */
    public final void mo5250M(UserPlaylist userPlaylist) {
        this.f25895f.mo5250M(userPlaylist);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: P */
    public final InterfaceC7142w<List<String>> mo500P() {
        return this.f25894e.mo500P();
    }

    @Override // p205jk.InterfaceC6515k
    /* JADX INFO: renamed from: S0 */
    public final InterfaceC7116c<UpgradeReason> mo9773S0() {
        return this.f25896g.mo9773S0();
    }

    @Override // p205jk.InterfaceC6515k
    /* JADX INFO: renamed from: X */
    public final InterfaceC7116c<String> mo9774X() {
        return this.f25896g.mo9774X();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: d */
    public final Object mo501d(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f25894e.mo501d(str, interfaceC9968c);
    }

    @Override // bj.InterfaceC1598u
    /* JADX INFO: renamed from: d1 */
    public final InterfaceC7137r<UserPlaylist> mo5251d1() {
        return this.f25895f.mo5251d1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f0 */
    public final boolean mo502f0() {
        InterfaceC0113j interfaceC0113j = this.f25894e;
        return true;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f1 */
    public final Object mo503f1(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f25894e.mo503f1(interfaceC9968c);
    }

    @Override // p205jk.InterfaceC6515k
    /* JADX INFO: renamed from: i0 */
    public final InterfaceC7116c<C9072e> mo9775i0() {
        return this.f25896g.mo9775i0();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: j1 */
    public final InterfaceC7116c<Profile> mo504j1() {
        return this.f25894e.mo504j1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l0 */
    public final Object mo505l0(ProfileAccount profileAccount, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f25894e.mo505l0(profileAccount, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l1 */
    public final boolean mo506l1() {
        return this.f25894e.mo506l1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: p1 */
    public final String mo507p1() {
        return this.f25894e.mo507p1();
    }

    @Override // bj.InterfaceC1598u
    /* JADX INFO: renamed from: q0 */
    public final void mo5252q0(String str, String str2) {
        C5207g.m11111f(str, "oldName");
        C5207g.m11111f(str2, "newName");
        this.f25895f.mo5252q0(str, str2);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: t1 */
    public final InterfaceC7116c<ProfileAccount> mo508t1() {
        return this.f25894e.mo508t1();
    }

    @Override // bj.InterfaceC1598u
    /* JADX INFO: renamed from: v */
    public final InterfaceC7137r<Pair<String, String>> mo5253v() {
        return this.f25895f.mo5253v();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: w0 */
    public final InterfaceC7142w<UserLanguage> mo509w0() {
        return this.f25894e.mo509w0();
    }
}
