package com.lingq.commons.controllers;

import ae.C0062b;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.uimodel.language.UserLanguage;
import com.lingq.util.C4924a;
import dm.C5207g;
import java.util.List;
import kotlin.Pair;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.C7120g;
import kotlinx.coroutines.flow.C7134o;
import kotlinx.coroutines.flow.C7135p;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7137r;
import kotlinx.coroutines.flow.InterfaceC7142w;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.scheduling.ExecutorC7177a;
import no.C7828f;
import no.InterfaceC7882z;
import p015ak.InterfaceC0113j;
import p076di.InterfaceC5180b;
import p225kk.C6715l;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class DeepLinkControllerImpl implements InterfaceC3273a, InterfaceC0113j {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5180b f16510a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC7882z f16511b;

    /* JADX INFO: renamed from: c */
    public final CoroutineDispatcher f16512c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC0113j f16513d;

    /* JADX INFO: renamed from: e */
    public final StateFlowImpl f16514e;

    /* JADX INFO: renamed from: f */
    public final C7135p f16515f;

    /* JADX INFO: renamed from: g */
    public final C7138s f16516g;

    /* JADX INFO: renamed from: h */
    public final C7134o f16517h;

    public DeepLinkControllerImpl(InterfaceC0113j interfaceC0113j, InterfaceC5180b interfaceC5180b, InterfaceC7882z interfaceC7882z, ExecutorC7177a executorC7177a) {
        C5207g.m11111f(interfaceC0113j, "userSessionViewModelDelegate");
        C5207g.m11111f(interfaceC5180b, "profileStore");
        C5207g.m11111f(interfaceC7882z, "coroutineScope");
        this.f16510a = interfaceC5180b;
        this.f16511b = interfaceC7882z;
        this.f16512c = executorC7177a;
        this.f16513d = interfaceC0113j;
        Boolean bool = Boolean.FALSE;
        StateFlowImpl stateFlowImplM14379a = C7120g.m14379a(new Pair(bool, ""));
        this.f16514e = stateFlowImplM14379a;
        StartedWhileSubscribed startedWhileSubscribed = C6715l.f37936a;
        this.f16515f = C0062b.m353h2(stateFlowImplM14379a, interfaceC7882z, startedWhileSubscribed, new Pair(bool, ""));
        C7138s c7138sM10448a = C4924a.m10448a();
        this.f16516g = c7138sM10448a;
        this.f16517h = C0062b.m341d2(c7138sM10448a, interfaceC7882z, startedWhileSubscribed);
    }

    /* JADX INFO: renamed from: a */
    public static final void m9316a(DeepLinkControllerImpl deepLinkControllerImpl, String str, AbstractC3274b abstractC3274b) {
        C7138s c7138s = deepLinkControllerImpl.f16516g;
        if (str == null || C5207g.m11106a(str, deepLinkControllerImpl.mo498E1())) {
            c7138s.mo14371k(abstractC3274b);
        } else {
            c7138s.mo14371k(new AbstractC3274b.c(str, abstractC3274b));
        }
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B */
    public final InterfaceC7142w<List<UserLanguage>> mo496B() {
        return this.f16513d.mo496B();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B0 */
    public final Object mo497B0(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f16513d.mo497B0(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: E1 */
    public final String mo498E1() {
        return this.f16513d.mo498E1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: J */
    public final Object mo499J(Profile profile, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f16513d.mo499J(profile, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: P */
    public final InterfaceC7142w<List<String>> mo500P() {
        return this.f16513d.mo500P();
    }

    @Override // com.lingq.commons.controllers.InterfaceC3273a
    /* JADX INFO: renamed from: Z */
    public final void mo9317Z(String str, long j10) {
        C5207g.m11111f(str, "url");
        C7828f.m15570d(this.f16511b, null, null, new DeepLinkControllerImpl$deepLink$1(j10, this, str, null), 3);
    }

    @Override // com.lingq.commons.controllers.InterfaceC3273a
    /* JADX INFO: renamed from: Z0 */
    public final InterfaceC7142w<Pair<Boolean, String>> mo9318Z0() {
        return this.f16515f;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: d */
    public final Object mo501d(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f16513d.mo501d(str, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f0 */
    public final boolean mo502f0() {
        this.f16513d.mo502f0();
        return true;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f1 */
    public final Object mo503f1(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f16513d.mo503f1(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: j1 */
    public final InterfaceC7116c<Profile> mo504j1() {
        return this.f16513d.mo504j1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l0 */
    public final Object mo505l0(ProfileAccount profileAccount, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f16513d.mo505l0(profileAccount, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l1 */
    public final boolean mo506l1() {
        return this.f16513d.mo506l1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: p1 */
    public final String mo507p1() {
        return this.f16513d.mo507p1();
    }

    @Override // com.lingq.commons.controllers.InterfaceC3273a
    /* JADX INFO: renamed from: q */
    public final void mo9319q(AbstractC3274b abstractC3274b) {
        C5207g.m11111f(abstractC3274b, "destination");
        this.f16516g.mo14371k(abstractC3274b);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: t1 */
    public final InterfaceC7116c<ProfileAccount> mo508t1() {
        return this.f16513d.mo508t1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: w0 */
    public final InterfaceC7142w<UserLanguage> mo509w0() {
        return this.f16513d.mo509w0();
    }

    @Override // com.lingq.commons.controllers.InterfaceC3273a
    /* JADX INFO: renamed from: y1 */
    public final InterfaceC7137r<AbstractC3274b> mo9320y1() {
        return this.f16517h;
    }
}
