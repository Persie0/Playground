package com.lingq.core.settings;

import android.content.Context;
import com.android.billingclient.api.Purchase;
import com.lingq.core.datastore.C1368a;
import com.lingq.core.datastore.C1369b;
import com.lingq.core.domain.language.C1378b;
import com.lingq.core.domain.model.language.DailyStreakPreset;
import com.lingq.core.domain.model.language.Language;
import com.lingq.core.domain.model.server.ServerEnvironment;
import com.lingq.core.domain.model.theme.LqTheme;
import com.lingq.core.domain.model.user.Profile;
import com.lingq.core.domain.model.user.ProfileAccount;
import java.util.List;
import java.util.Set;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3228h;
import kotlinx.coroutines.flow.C3243k;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.a19;
import p000.b19;
import p000.c18;
import p000.c19;
import p000.c83;
import p000.cg7;
import p000.cma;
import p000.d19;
import p000.d39;
import p000.e19;
import p000.e39;
import p000.eh9;
import p000.f19;
import p000.f39;
import p000.fa4;
import p000.g19;
import p000.g41;
import p000.gm5;
import p000.gz1;
import p000.hf6;
import p000.hz1;
import p000.iz1;
import p000.jz1;
import p000.k09;
import p000.kz1;
import p000.l09;
import p000.lda;
import p000.m09;
import p000.m83;
import p000.n09;
import p000.n83;
import p000.nm7;
import p000.nn1;
import p000.o09;
import p000.ob1;
import p000.p09;
import p000.p29;
import p000.p33;
import p000.pha;
import p000.q09;
import p000.q29;
import p000.qz1;
import p000.r09;
import p000.r32;
import p000.s09;
import p000.si7;
import p000.t09;
import p000.t19;
import p000.t23;
import p000.u09;
import p000.u91;
import p000.un1;
import p000.v09;
import p000.v18;
import p000.w09;
import p000.wfb;
import p000.wi7;
import p000.wta;
import p000.x09;
import p000.xi9;
import p000.y09;
import p000.yi7;
import p000.z09;

/* JADX INFO: renamed from: com.lingq.core.settings.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C1873e extends wta implements cma, pha, r32 {
    private static final e39 Companion = new e39();

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cma f22962b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pha f22963c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ r32 f22964d;

    /* JADX INFO: renamed from: e */
    public final Context f22965e;

    /* JADX INFO: renamed from: f */
    public final ob1 f22966f;

    /* JADX INFO: renamed from: g */
    public final p29 f22967g;

    /* JADX INFO: renamed from: h */
    public final C1378b f22968h;

    /* JADX INFO: renamed from: i */
    public final t23 f22969i;

    /* JADX INFO: renamed from: j */
    public final k09 f22970j;

    /* JADX INFO: renamed from: k */
    public final boolean f22971k;

    /* JADX INFO: renamed from: l */
    public final C3244l f22972l;

    /* JADX INFO: renamed from: m */
    public final C3244l f22973m;

    /* JADX INFO: renamed from: n */
    public final C3244l f22974n;

    /* JADX INFO: renamed from: o */
    public final C3244l f22975o;

    /* JADX INFO: renamed from: p */
    public final C3244l f22976p;

    /* JADX INFO: renamed from: q */
    public final C3244l f22977q;

    /* JADX INFO: renamed from: r */
    public final C3244l f22978r;

    /* JADX INFO: renamed from: s */
    public final c18 f22979s;

    /* JADX INFO: renamed from: t */
    public final c18 f22980t;

    /* JADX INFO: renamed from: u */
    public final c18 f22981u;

    /* JADX INFO: renamed from: v */
    public final c18 f22982v;

    /* JADX INFO: renamed from: w */
    public final c18 f22983w;

    public C1873e(Context context, p33 p33Var, ob1 ob1Var, p29 p29Var, C1378b c1378b, t23 t23Var, k09 k09Var, pha phaVar, cma cmaVar, r32 r32Var) {
        ob1Var.getClass();
        phaVar.getClass();
        cmaVar.getClass();
        r32Var.getClass();
        this.f22962b = cmaVar;
        this.f22963c = phaVar;
        this.f22964d = r32Var;
        this.f22965e = context;
        this.f22966f = ob1Var;
        this.f22967g = p29Var;
        this.f22968h = c1378b;
        this.f22969i = t23Var;
        this.f22970j = k09Var;
        this.f22971k = ob1Var.m17891d();
        Boolean bool = Boolean.FALSE;
        C3244l c3244lM17114d = AbstractC3352my.m17114d(bool);
        this.f22972l = c3244lM17114d;
        C3244l c3244lM17114d2 = AbstractC3352my.m17114d(bool);
        this.f22973m = c3244lM17114d2;
        C3244l c3244lM17114d3 = AbstractC3352my.m17114d(bool);
        this.f22974n = c3244lM17114d3;
        C3244l c3244lM17114d4 = AbstractC3352my.m17114d(bool);
        this.f22975o = c3244lM17114d4;
        C3244l c3244lM17114d5 = AbstractC3352my.m17114d(null);
        this.f22976p = c3244lM17114d5;
        C3244l c3244lM17114d6 = AbstractC3352my.m17114d("");
        this.f22977q = c3244lM17114d6;
        C3244l c3244lM17114d7 = AbstractC3352my.m17114d(new kz1(null, null, false, null));
        this.f22978r = c3244lM17114d7;
        C1368a c1368a = (C1368a) ((si7) p33Var.f55513b);
        yi7 yi7Var = c1368a.f18363N1;
        g41 g41VarM16103C = lda.m16103C(this);
        C3243k c3243k = xi9.f68262a;
        this.f22979s = AbstractC3224d.m15520B(yi7Var, g41VarM16103C, c3243k, ServerEnvironment.Production);
        wi7 wi7Var = c1368a.f18416i1;
        g41 g41VarM16103C2 = lda.m16103C(this);
        EmptySet emptySet = EmptySet.f47640a;
        c18 c18VarM15520B = AbstractC3224d.m15520B(wi7Var, g41VarM16103C2, c3243k, emptySet);
        this.f22980t = c18VarM15520B;
        c18 c18VarM15520B2 = AbstractC3224d.m15520B(new C3228h(new C3228h(c1368a.f18460x0, c1368a.f18356L0, new SettingsProvider$observePreferences$1(3, null)), AbstractC3224d.m15532k(c1368a.f18359M0, c1368a.f18407f1, c1368a.f18455v1, new SettingsProvider$observePreferences$2(4, null)), new SettingsProvider$observePreferences$3(3, null)), lda.m16103C(this), c3243k, new q29(LqTheme.System, "", false, AbstractC3194a.m15360M(), false));
        this.f22981u = c18VarM15520B2;
        c18 c18VarM15520B3 = AbstractC3224d.m15520B(cmaVar.mo4574C1(), lda.m16103C(this), c3243k, null);
        this.f22982v = c18VarM15520B3;
        n83 n83VarM15530i = AbstractC3224d.m15530i(c18VarM15520B2, AbstractC3224d.m15531j(c18VarM15520B3, ((C1369b) ((nm7) p33Var.f55514c)).f18483p, cmaVar.mo4572B0(), c3244lM17114d7, new SettingsViewModel$settingsUiState$1(5, null)), k09Var.f46518n, AbstractC3224d.m15531j(c3244lM17114d, c3244lM17114d2, c3244lM17114d5, c3244lM17114d6, new SettingsViewModel$settingsUiState$2(5, null)), AbstractC3224d.m15532k(c3244lM17114d3, c3244lM17114d4, c18VarM15520B, new SettingsViewModel$settingsUiState$3(4, null)), new SettingsViewModel$settingsUiState$4(this, null));
        g41 g41VarM16103C3 = lda.m16103C(this);
        int i = 2;
        qz1 qz1Var = new qz1((15 & 1) != 0 ? null : "150", (15 & 2) != 0 ? null : 30, false, null);
        EmptyList emptyList = EmptyList.f47638a;
        this.f22983w = AbstractC3224d.m15520B(n83VarM15530i, g41VarM16103C3, c3243k, new d39(emptyList, false, false, false, false, null, "", "", emptySet, emptyList, qz1Var));
        wfb.m23926u((un1) p29Var.f55490b, null, null, new SettingsPreferenceHandler$initialize$1(p29Var, null), 3);
        AbstractC3224d.m15545x(new m83(cmaVar.mo4572B0(), new SettingsViewModel$1(this, null), i), lda.m16103C(this));
        wfb.m23926u(lda.m16103C(this), null, null, new SettingsViewModel$2(this, null), 3);
    }

    /* JADX INFO: renamed from: Y2 */
    public static t19 m8643Y2(C1873e c1873e, int i, String str, String str2, int i2, boolean z, int i3) {
        boolean z2 = (i3 & 2) == 0;
        String str3 = (i3 & 4) != 0 ? null : str;
        String str4 = (i3 & 8) != 0 ? null : str2;
        int i4 = (i3 & 16) != 0 ? com.lingq.core.p012ui.R$string.settings_upgrade_change_plan : i2;
        boolean z3 = (i3 & 32) != 0 ? false : z;
        boolean z4 = (i3 & 64) == 0;
        c1873e.getClass();
        return new t19(i, i4, ViewKeys.UpgradeYear, str3, str4, z2, z3, z4);
    }

    /* JADX INFO: renamed from: Z2 */
    public static jz1 m8644Z2(Language language) {
        Object obj = null;
        if (fa4.m11650l(language != null ? language.f19035l : null, "custom")) {
            Integer num = language.f19036m;
            return new hz1(num != null ? num.intValue() : DailyStreakPreset.Casual.getCoins());
        }
        gz1 gz1Var = DailyStreakPreset.Companion;
        String str = language != null ? language.f19035l : null;
        gz1Var.getClass();
        for (Object obj2 : DailyStreakPreset.getEntries()) {
            if (fa4.m11650l(((DailyStreakPreset) obj2).getIntensity(), str)) {
                obj = obj2;
                break;
            }
        }
        DailyStreakPreset dailyStreakPreset = (DailyStreakPreset) obj;
        if (dailyStreakPreset == null) {
            dailyStreakPreset = DailyStreakPreset.Casual;
        }
        return new iz1(dailyStreakPreset);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f22962b.mo4571A();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f22962b.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f22962b.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f22962b.mo4574C1();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: D */
    public final void mo8549D(String str) {
        this.f22963c.mo8549D(str);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f22962b.mo4575D0(continuation);
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: E2 */
    public final void mo8240E2() {
        this.f22964d.mo8240E2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f22962b.mo4576F1(str, continuation);
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: F2 */
    public final boolean mo8550F2(String str) {
        return this.f22963c.mo8550F2(str);
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: G0 */
    public final void mo8241G0() {
        this.f22964d.mo8241G0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f22962b.mo4577H();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: H1 */
    public final String mo8551H1() {
        return this.f22963c.mo8551H1();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: H2 */
    public final void mo8552H2(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f22963c.mo8552H2(str, str2);
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: I */
    public final void mo8553I() {
        this.f22963c.mo8553I();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: I1 */
    public final eh9 mo8554I1() {
        return this.f22963c.mo8554I1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f22962b.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f22962b.mo4579K(continuation);
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: K0 */
    public final String mo8555K0() {
        return this.f22963c.mo8555K0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f22962b.mo4580K1();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: K2 */
    public final c83 mo8556K2() {
        return this.f22963c.mo8556K2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f22962b.mo4581L0();
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: M2 */
    public final Object mo8242M2(hf6 hf6Var, long j, Continuation continuation) {
        return this.f22964d.mo8242M2(hf6Var, 500L, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f22962b.mo4582N();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: N1 */
    public final c83 mo8557N1() {
        return this.f22963c.mo8557N1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f22962b.mo4583O1();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: O2 */
    public final void mo8558O2() {
        this.f22963c.mo8558O2();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: P2 */
    public final eh9 mo8559P2() {
        return this.f22963c.mo8559P2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f22962b.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f22962b.mo4585R();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: R0 */
    public final void mo8560R0(String str) {
        this.f22963c.mo8560R0(str);
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: R1 */
    public final void mo8243R1(hf6 hf6Var) {
        hf6Var.getClass();
        this.f22964d.mo8243R1(hf6Var);
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: S0 */
    public final String mo8561S0() {
        return this.f22963c.mo8561S0();
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: S1 */
    public final eh9 mo8244S1() {
        return this.f22964d.mo8244S1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f22962b.mo4586T0();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: V0 */
    public final eh9 mo8562V0() {
        return this.f22963c.mo8562V0();
    }

    /* JADX INFO: renamed from: V2 */
    public final jz1 m8645V2() {
        jz1 jz1Var = ((kz1) this.f22978r.getValue()).f48789a;
        return jz1Var == null ? m8644Z2((Language) this.f22962b.mo4572B0().getValue()) : jz1Var;
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: W1 */
    public final c83 mo8564W1() {
        return this.f22963c.mo8564W1();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: W2 */
    public final void m8646W2(g19 g19Var) {
        Object value;
        Object value2;
        String str;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        Object value7;
        Object value8;
        Object value9;
        String strName;
        String str2;
        C3244l c3244l;
        Object value10;
        Object value11;
        Profile profile;
        String str3;
        Object value12;
        Object value13;
        Object value14;
        g19Var.getClass();
        boolean z = g19Var instanceof c19;
        p29 p29Var = this.f22967g;
        if (z) {
            c19 c19Var = (c19) g19Var;
            ViewKeys viewKeys = c19Var.f9312a;
            boolean z2 = c19Var.f9313b;
            p29Var.getClass();
            viewKeys.getClass();
            wfb.m23926u((un1) p29Var.f55490b, (nn1) p29Var.f55489a, null, new SettingsPreferenceHandler$updateSwitch$1(viewKeys, p29Var, z2, null), 2);
            return;
        }
        if (g19Var instanceof x09) {
            x09 x09Var = (x09) g19Var;
            ViewKeys viewKeys2 = x09Var.f67596a;
            int i = x09Var.f67597b;
            int i2 = x09Var.f67598c;
            p29Var.getClass();
            viewKeys2.getClass();
            wfb.m23926u((un1) p29Var.f55490b, (nn1) p29Var.f55489a, null, new SettingsPreferenceHandler$updateRange$1(viewKeys2, p29Var, i, i2, null), 2);
            return;
        }
        if ((g19Var instanceof q09) || g19Var.equals(p09.f55400a)) {
            return;
        }
        boolean z3 = g19Var instanceof u09;
        C3244l c3244l2 = this.f22976p;
        C3244l c3244l3 = this.f22974n;
        C3244l c3244l4 = this.f22972l;
        C3244l c3244l5 = this.f22975o;
        k09 k09Var = this.f22970j;
        if (z3) {
            ViewKeys viewKeys3 = ((u09) g19Var).f63219a;
            int[] iArr = f39.f38368a;
            switch (iArr[viewKeys3.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 8:
                    q29 q29Var = (q29) ((C3244l) this.f22981u.f9311a).getValue();
                    int i3 = iArr[viewKeys3.ordinal()];
                    if (i3 == 1) {
                        strName = q29Var.f57168b;
                    } else if (i3 != 2) {
                        strName = "";
                        if (i3 == 3 && (profile = (Profile) ((C3244l) this.f22982v.f9311a).getValue()) != null && (str3 = profile.f19662k) != null) {
                            str2 = str3;
                        }
                        do {
                            c3244l = this.f22977q;
                            value10 = c3244l.getValue();
                        } while (!c3244l.m15570h(value10, str2));
                        do {
                            value11 = c3244l2.getValue();
                        } while (!c3244l2.m15570h(value11, viewKeys3));
                    } else {
                        strName = q29Var.f57167a.name();
                    }
                    str2 = strName;
                    do {
                        c3244l = this.f22977q;
                        value10 = c3244l.getValue();
                    } while (!c3244l.m15570h(value10, str2));
                    do {
                        value11 = c3244l2.getValue();
                    } while (!c3244l2.m15570h(value11, viewKeys3));
                    break;
                case 4:
                    do {
                        value12 = c3244l4.getValue();
                        ((Boolean) value12).getClass();
                    } while (!c3244l4.m15570h(value12, Boolean.TRUE));
                    break;
                case 5:
                    wfb.m23926u(k09Var.f46508d, null, null, new SettingsAccountManager$resetTutorial$1(k09Var, null), 3);
                    break;
                case 6:
                    do {
                        value13 = c3244l3.getValue();
                        ((Boolean) value13).getClass();
                    } while (!c3244l3.m15570h(value13, Boolean.TRUE));
                    break;
                case 7:
                    do {
                        value14 = c3244l5.getValue();
                        ((Boolean) value14).getClass();
                    } while (!c3244l5.m15570h(value14, Boolean.TRUE));
                    break;
            }
            return;
        }
        if (g19Var.equals(b19.f7765a)) {
            do {
                value9 = c3244l4.getValue();
                ((Boolean) value9).getClass();
            } while (!c3244l4.m15570h(value9, Boolean.FALSE));
            wfb.m23926u(k09Var.f46506b, null, null, new SettingsAccountManager$logout$1(k09Var, null), 3);
            return;
        }
        boolean zEquals = g19Var.equals(t09.f61726a);
        C3244l c3244l6 = this.f22973m;
        if (zEquals) {
            do {
                value6 = c3244l4.getValue();
                ((Boolean) value6).getClass();
            } while (!c3244l4.m15570h(value6, Boolean.FALSE));
            do {
                value7 = c3244l6.getValue();
                ((Boolean) value7).getClass();
            } while (!c3244l6.m15570h(value7, Boolean.FALSE));
            do {
                value8 = c3244l3.getValue();
                ((Boolean) value8).getClass();
            } while (!c3244l3.m15570h(value8, Boolean.FALSE));
            return;
        }
        if (g19Var.equals(a19.f67a)) {
            do {
                value5 = c3244l6.getValue();
                ((Boolean) value5).getClass();
            } while (!c3244l6.m15570h(value5, Boolean.TRUE));
            return;
        }
        if (g19Var.equals(m09.f50404a)) {
            do {
                value4 = c3244l6.getValue();
                ((Boolean) value4).getClass();
            } while (!c3244l6.m15570h(value4, Boolean.FALSE));
            wfb.m23926u(k09Var.f46508d, k09Var.f46507c, null, new SettingsAccountManager$clearBlacklist$1(k09Var, null), 2);
            return;
        }
        if (g19Var instanceof y09) {
            do {
                value3 = c3244l2.getValue();
            } while (!c3244l2.m15570h(value3, null));
            y09 y09Var = (y09) g19Var;
            ViewKeys viewKeys4 = y09Var.f69060a;
            String str4 = y09Var.f69061b;
            p29Var.getClass();
            viewKeys4.getClass();
            str4.getClass();
            wfb.m23926u((un1) p29Var.f55490b, (nn1) p29Var.f55489a, null, new SettingsPreferenceHandler$updateSelection$1(viewKeys4, p29Var, str4, null), 2);
            return;
        }
        if (g19Var instanceof e19) {
            String str5 = ((e19) g19Var).f36577a;
            Set set = (Set) ((C3244l) this.f22980t.f9311a).getValue();
            p29Var.getClass();
            set.getClass();
            Set setM22626r1 = u91.m22626r1(set);
            if (setM22626r1.contains(str5)) {
                setM22626r1.remove(str5);
            } else {
                setM22626r1.add(str5);
            }
            wfb.m23926u((un1) p29Var.f55490b, (nn1) p29Var.f55489a, null, new SettingsPreferenceHandler$toggleTopic$1(p29Var, setM22626r1, null), 2);
            return;
        }
        if (g19Var.equals(l09.f48873a)) {
            return;
        }
        if (g19Var.equals(r09.f58463a)) {
            cg7 cg7Var = new cg7(this, 20);
            k09Var.getClass();
            Language language = (Language) k09Var.f46516l.mo4572B0().getValue();
            if (language == null || (str = language.f19024a) == null) {
                return;
            }
            wfb.m23926u(k09Var.f46508d, k09Var.f46507c, null, new SettingsAccountManager$deleteLanguage$1(k09Var, str, cg7Var, null), 2);
            return;
        }
        if (g19Var.equals(s09.f60143a)) {
            do {
                value2 = c3244l5.getValue();
                ((Boolean) value2).getClass();
            } while (!c3244l5.m15570h(value2, Boolean.FALSE));
        } else {
            if (g19Var.equals(o09.f53562a)) {
                do {
                    value = c3244l5.getValue();
                    ((Boolean) value).getClass();
                } while (!c3244l5.m15570h(value, Boolean.FALSE));
                wfb.m23926u(k09Var.f46506b, null, null, new SettingsAccountManager$deleteAccount$1(k09Var, null), 3);
                return;
            }
            if ((g19Var instanceof v09) || g19Var.equals(n09.f52147a) || g19Var.equals(w09.f66187a) || g19Var.equals(d19.f34852a) || g19Var.equals(f19.f38253a) || g19Var.equals(z09.f70733a)) {
                return;
            }
            gm5.m12750e();
        }
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f22962b.mo4587X();
    }

    /* JADX INFO: renamed from: X2 */
    public final void m8647X2(jz1 jz1Var) {
        Object value;
        C3244l c3244l = this.f22978r;
        if (((kz1) c3244l.getValue()).f48791c) {
            return;
        }
        if (jz1Var.equals(m8645V2())) {
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, kz1.m15733a((kz1) value, null, null, false, null, 5)));
            return;
        }
        while (true) {
            Object value2 = c3244l.getValue();
            jz1 jz1Var2 = jz1Var;
            if (c3244l.m15570h(value2, kz1.m15733a((kz1) value2, jz1Var2, null, true, null, 2))) {
                wfb.m23926u(lda.m16103C(this), null, null, new SettingsViewModel$saveDailyStreakTarget$3(this, jz1Var2, null), 3);
                return;
            }
            jz1Var = jz1Var2;
        }
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: Y */
    public final c83 mo8565Y() {
        return this.f22963c.mo8565Y();
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: Z1 */
    public final void mo8245Z1(hf6 hf6Var) {
        this.f22964d.mo8245Z1(hf6Var);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f22962b.mo4588a0();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: b1 */
    public final eh9 mo8566b1() {
        return this.f22963c.mo8566b1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f22962b.mo4589b2();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: c0 */
    public final void mo8567c0(Purchase purchase) {
        this.f22963c.mo8567c0(purchase);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f22962b.mo4590d0();
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: e0 */
    public final void mo8247e0(String str, long j) {
        str.getClass();
        this.f22964d.mo8247e0(str, j);
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: f1 */
    public final String mo8568f1() {
        return this.f22963c.mo8568f1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f22962b.mo4591h0(profileAccount, continuation);
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: h1 */
    public final eh9 mo8248h1() {
        return this.f22964d.mo8248h1();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: i2 */
    public final void mo8569i2(int i) {
        this.f22963c.mo8569i2(i);
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: k */
    public final eh9 mo8249k() {
        return this.f22964d.mo8249k();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: k1 */
    public final void mo8570k1(List list) {
        list.getClass();
        this.f22963c.mo8570k1(list);
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: l */
    public final eh9 mo8571l() {
        return this.f22963c.mo8571l();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: l1 */
    public final eh9 mo8572l1() {
        return this.f22963c.mo8572l1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f22962b.mo4592m0();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: o */
    public final void mo8573o(Purchase purchase, v18 v18Var) {
        this.f22963c.mo8573o(purchase, v18Var);
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: o0 */
    public final String mo8574o0() {
        return this.f22963c.mo8574o0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f22962b.mo4593p0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f22962b.mo4594r1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f22962b.mo4595s1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f22962b.mo4596t();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: v */
    public final eh9 mo8575v() {
        return this.f22963c.mo8575v();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f22962b.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f22962b.mo4598w2();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: x2 */
    public final eh9 mo8576x2() {
        return this.f22963c.mo8576x2();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: y2 */
    public final eh9 mo8577y2() {
        return this.f22963c.mo8577y2();
    }
}
