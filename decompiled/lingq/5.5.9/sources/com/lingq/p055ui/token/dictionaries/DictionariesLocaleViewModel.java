package com.lingq.p055ui.token.dictionaries;

import ae.C0062b;
import android.os.Parcelable;
import androidx.view.AbstractC1036h0;
import androidx.view.C1024c0;
import ci.InterfaceC2008a;
import ci.InterfaceC2012e;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.uimodel.language.UserLanguage;
import com.lingq.shared.uimodel.token.TokenMeaning;
import dm.C5207g;
import hk.C6070a;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.C7135p;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7140u;
import kotlinx.coroutines.flow.InterfaceC7142w;
import kotlinx.coroutines.flow.StartedLazily;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import kotlinx.coroutines.scheduling.ExecutorC7177a;
import no.InterfaceC7882z;
import p015ak.InterfaceC0113j;
import p225kk.C6715l;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/ui/token/dictionaries/DictionariesLocaleViewModel;", "Landroidx/lifecycle/h0;", "Lak/j;", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class DictionariesLocaleViewModel extends AbstractC1036h0 implements InterfaceC0113j {

    /* JADX INFO: renamed from: d */
    public final InterfaceC2008a f31749d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2012e f31750e;

    /* JADX INFO: renamed from: f */
    public final CoroutineDispatcher f31751f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC0113j f31752g;

    /* JADX INFO: renamed from: h */
    public final C6070a f31753h;

    /* JADX INFO: renamed from: i */
    public final C7135p f31754i;

    /* JADX WARN: Unreachable blocks removed: 4, instructions: 4 */
    public DictionariesLocaleViewModel(InterfaceC2008a interfaceC2008a, InterfaceC2012e interfaceC2012e, ExecutorC7177a executorC7177a, InterfaceC0113j interfaceC0113j, C1024c0 c1024c0) {
        C5207g.m11111f(interfaceC2008a, "cardRepository");
        C5207g.m11111f(interfaceC2012e, "languageRepository");
        C5207g.m11111f(interfaceC0113j, "userSessionViewModelDelegate");
        C5207g.m11111f(c1024c0, "savedStateHandle");
        this.f31749d = interfaceC2008a;
        this.f31750e = interfaceC2012e;
        this.f31751f = executorC7177a;
        this.f31752g = interfaceC0113j;
        LinkedHashMap linkedHashMap = c1024c0.f6616a;
        if (!linkedHashMap.containsKey("term")) {
            throw new IllegalArgumentException("Required argument \"term\" is missing and does not have an android:defaultValue");
        }
        String str = (String) c1024c0.m3929b("term");
        if (str == null) {
            throw new IllegalArgumentException("Argument \"term\" is marked as non-null but was passed a null value");
        }
        if (!linkedHashMap.containsKey("tokenMeaning")) {
            throw new IllegalArgumentException("Required argument \"tokenMeaning\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(TokenMeaning.class) && !Serializable.class.isAssignableFrom(TokenMeaning.class)) {
            throw new UnsupportedOperationException(TokenMeaning.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        TokenMeaning tokenMeaning = (TokenMeaning) c1024c0.m3929b("tokenMeaning");
        if (tokenMeaning == null) {
            throw new IllegalArgumentException("Argument \"tokenMeaning\" is marked as non-null but was passed a null value");
        }
        this.f31753h = new C6070a(tokenMeaning, str);
        ChannelFlowTransformLatest channelFlowTransformLatestM399t2 = C0062b.m399t2(mo504j1(), new DictionariesLocaleViewModel$_allLanguages$1(this, null));
        InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(this);
        StartedLazily startedLazily = InterfaceC7140u.a.f40388b;
        EmptyList emptyList = EmptyList.f38032a;
        this.f31754i = C0062b.m353h2(C0062b.m399t2(C0062b.m353h2(channelFlowTransformLatestM399t2, interfaceC7882zM16767w0, startedLazily, emptyList), new DictionariesLocaleViewModel$languageSelectList$1(null)), C8573r0.m16767w0(this), C6715l.f37936a, emptyList);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B */
    public final InterfaceC7142w<List<UserLanguage>> mo496B() {
        return this.f31752g.mo496B();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B0 */
    public final Object mo497B0(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f31752g.mo497B0(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: E1 */
    public final String mo498E1() {
        return this.f31752g.mo498E1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: J */
    public final Object mo499J(Profile profile, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f31752g.mo499J(profile, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: P */
    public final InterfaceC7142w<List<String>> mo500P() {
        return this.f31752g.mo500P();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: d */
    public final Object mo501d(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f31752g.mo501d(str, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f0 */
    public final boolean mo502f0() {
        InterfaceC0113j interfaceC0113j = this.f31752g;
        return true;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f1 */
    public final Object mo503f1(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f31752g.mo503f1(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: j1 */
    public final InterfaceC7116c<Profile> mo504j1() {
        return this.f31752g.mo504j1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l0 */
    public final Object mo505l0(ProfileAccount profileAccount, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f31752g.mo505l0(profileAccount, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l1 */
    public final boolean mo506l1() {
        return this.f31752g.mo506l1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: p1 */
    public final String mo507p1() {
        return this.f31752g.mo507p1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: t1 */
    public final InterfaceC7116c<ProfileAccount> mo508t1() {
        return this.f31752g.mo508t1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: w0 */
    public final InterfaceC7142w<UserLanguage> mo509w0() {
        return this.f31752g.mo509w0();
    }
}
