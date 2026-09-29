package com.lingq.p055ui.home.playlist;

import ae.C0062b;
import androidx.view.AbstractC1036h0;
import androidx.view.C1024c0;
import bj.C1586i;
import bj.InterfaceC1598u;
import ci.InterfaceC2019l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.uimodel.language.UserLanguage;
import com.lingq.shared.uimodel.playlist.UserPlaylist;
import dm.C5207g;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.channels.AbstractChannel;
import kotlinx.coroutines.flow.C7114a;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7137r;
import kotlinx.coroutines.flow.InterfaceC7142w;
import kotlinx.coroutines.scheduling.ExecutorC7177a;
import p015ak.InterfaceC0113j;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/home/playlist/PlaylistAddViewModel;", "Landroidx/lifecycle/h0;", "Lak/j;", "Lbj/u;", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class PlaylistAddViewModel extends AbstractC1036h0 implements InterfaceC0113j, InterfaceC1598u {

    /* JADX INFO: renamed from: d */
    public final InterfaceC2019l f25440d;

    /* JADX INFO: renamed from: e */
    public final CoroutineDispatcher f25441e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC0113j f25442f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC1598u f25443g;

    /* JADX INFO: renamed from: h */
    public final C1586i f25444h;

    /* JADX INFO: renamed from: i */
    public final AbstractChannel f25445i;

    /* JADX INFO: renamed from: j */
    public final C7114a f25446j;

    /* JADX INFO: renamed from: k */
    public final AbstractChannel f25447k;

    /* JADX INFO: renamed from: l */
    public final C7114a f25448l;

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    public PlaylistAddViewModel(InterfaceC2019l interfaceC2019l, ExecutorC7177a executorC7177a, InterfaceC0113j interfaceC0113j, InterfaceC1598u interfaceC1598u, C1024c0 c1024c0) {
        String str;
        Boolean bool;
        Integer num;
        C5207g.m11111f(interfaceC2019l, "playlistRepository");
        C5207g.m11111f(interfaceC0113j, "userSessionViewModelDelegate");
        C5207g.m11111f(interfaceC1598u, "playlistUpdatesDelegate");
        C5207g.m11111f(c1024c0, "savedStateHandle");
        this.f25440d = interfaceC2019l;
        this.f25441e = executorC7177a;
        this.f25442f = interfaceC0113j;
        this.f25443g = interfaceC1598u;
        LinkedHashMap linkedHashMap = c1024c0.f6616a;
        String str2 = "";
        if (linkedHashMap.containsKey("oldName")) {
            str = (String) c1024c0.m3929b("oldName");
            if (str == null) {
                throw new IllegalArgumentException("Argument \"oldName\" is marked as non-null but was passed a null value");
            }
        } else {
            str = "";
        }
        if (linkedHashMap.containsKey("isAdd")) {
            bool = (Boolean) c1024c0.m3929b("isAdd");
            if (bool == null) {
                throw new IllegalArgumentException("Argument \"isAdd\" of type boolean does not support null values");
            }
        } else {
            bool = Boolean.TRUE;
        }
        if (linkedHashMap.containsKey("itemId")) {
            num = (Integer) c1024c0.m3929b("itemId");
            if (num == null) {
                throw new IllegalArgumentException("Argument \"itemId\" of type integer does not support null values");
            }
        } else {
            num = -1;
        }
        if (linkedHashMap.containsKey("itemURL") && (str2 = (String) c1024c0.m3929b("itemURL")) == null) {
            throw new IllegalArgumentException("Argument \"itemURL\" is marked as non-null but was passed a null value");
        }
        this.f25444h = new C1586i(str, num.intValue(), str2, bool.booleanValue());
        AbstractChannel abstractChannelM16738m = C8573r0.m16738m(-1, null, 6);
        this.f25445i = abstractChannelM16738m;
        this.f25446j = C0062b.m287L1(abstractChannelM16738m);
        AbstractChannel abstractChannelM16738m2 = C8573r0.m16738m(-1, null, 6);
        this.f25447k = abstractChannelM16738m2;
        this.f25448l = C0062b.m287L1(abstractChannelM16738m2);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B */
    public final InterfaceC7142w<List<UserLanguage>> mo496B() {
        return this.f25442f.mo496B();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B0 */
    public final Object mo497B0(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f25442f.mo497B0(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: E1 */
    public final String mo498E1() {
        return this.f25442f.mo498E1();
    }

    @Override // bj.InterfaceC1598u
    /* JADX INFO: renamed from: F1 */
    public final void mo5248F1(UserPlaylist userPlaylist) {
        C5207g.m11111f(userPlaylist, "playlist");
        this.f25443g.mo5248F1(userPlaylist);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: J */
    public final Object mo499J(Profile profile, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f25442f.mo499J(profile, interfaceC9968c);
    }

    @Override // bj.InterfaceC1598u
    /* JADX INFO: renamed from: J1 */
    public final InterfaceC7137r<UserPlaylist> mo5249J1() {
        return this.f25443g.mo5249J1();
    }

    @Override // bj.InterfaceC1598u
    /* JADX INFO: renamed from: M */
    public final void mo5250M(UserPlaylist userPlaylist) {
        this.f25443g.mo5250M(userPlaylist);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: P */
    public final InterfaceC7142w<List<String>> mo500P() {
        return this.f25442f.mo500P();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: d */
    public final Object mo501d(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f25442f.mo501d(str, interfaceC9968c);
    }

    @Override // bj.InterfaceC1598u
    /* JADX INFO: renamed from: d1 */
    public final InterfaceC7137r<UserPlaylist> mo5251d1() {
        return this.f25443g.mo5251d1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f0 */
    public final boolean mo502f0() {
        InterfaceC0113j interfaceC0113j = this.f25442f;
        return true;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f1 */
    public final Object mo503f1(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f25442f.mo503f1(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: j1 */
    public final InterfaceC7116c<Profile> mo504j1() {
        return this.f25442f.mo504j1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l0 */
    public final Object mo505l0(ProfileAccount profileAccount, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f25442f.mo505l0(profileAccount, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l1 */
    public final boolean mo506l1() {
        return this.f25442f.mo506l1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: p1 */
    public final String mo507p1() {
        return this.f25442f.mo507p1();
    }

    @Override // bj.InterfaceC1598u
    /* JADX INFO: renamed from: q0 */
    public final void mo5252q0(String str, String str2) {
        C5207g.m11111f(str, "oldName");
        C5207g.m11111f(str2, "newName");
        this.f25443g.mo5252q0(str, str2);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: t1 */
    public final InterfaceC7116c<ProfileAccount> mo508t1() {
        return this.f25442f.mo508t1();
    }

    @Override // bj.InterfaceC1598u
    /* JADX INFO: renamed from: v */
    public final InterfaceC7137r<Pair<String, String>> mo5253v() {
        return this.f25443g.mo5253v();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: w0 */
    public final InterfaceC7142w<UserLanguage> mo509w0() {
        return this.f25442f.mo509w0();
    }
}
