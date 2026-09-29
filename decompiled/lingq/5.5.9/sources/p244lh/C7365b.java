package p244lh;

import ci.InterfaceC2013f;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.uimodel.language.AppUsageType;
import com.lingq.shared.uimodel.language.UserLanguage;
import dm.C5207g;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7142w;
import p015ak.InterfaceC0113j;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: renamed from: lh.b */
/* JADX INFO: loaded from: classes.dex */
public final class C7365b implements InterfaceC7364a, InterfaceC0113j {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2013f f41129a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC0113j f41130b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f41131c;

    public C7365b(InterfaceC2013f interfaceC2013f, InterfaceC0113j interfaceC0113j) {
        C5207g.m11111f(interfaceC2013f, "languageStatsRepository");
        C5207g.m11111f(interfaceC0113j, "userSessionViewModelDelegate");
        this.f41129a = interfaceC2013f;
        this.f41130b = interfaceC0113j;
        this.f41131c = new LinkedHashMap();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B */
    public final InterfaceC7142w<List<UserLanguage>> mo496B() {
        return this.f41130b.mo496B();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B0 */
    public final Object mo497B0(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f41130b.mo497B0(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: E1 */
    public final String mo498E1() {
        return this.f41130b.mo498E1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: J */
    public final Object mo499J(Profile profile, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f41130b.mo499J(profile, interfaceC9968c);
    }

    @Override // p244lh.InterfaceC7364a
    /* JADX INFO: renamed from: N */
    public final void mo9402N(AppUsageType appUsageType) {
        C5207g.m11111f(appUsageType, "appUsageType");
        LinkedHashMap linkedHashMap = this.f41131c;
        if (((Long) linkedHashMap.get(appUsageType)) == null) {
            linkedHashMap.put(appUsageType, Long.valueOf(Calendar.getInstance().getTimeInMillis()));
        }
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: P */
    public final InterfaceC7142w<List<String>> mo500P() {
        return this.f41130b.mo500P();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: d */
    public final Object mo501d(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f41130b.mo501d(str, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f0 */
    public final boolean mo502f0() {
        InterfaceC0113j interfaceC0113j = this.f41130b;
        return true;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f1 */
    public final Object mo503f1(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f41130b.mo503f1(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: j1 */
    public final InterfaceC7116c<Profile> mo504j1() {
        return this.f41130b.mo504j1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l0 */
    public final Object mo505l0(ProfileAccount profileAccount, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f41130b.mo505l0(profileAccount, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l1 */
    public final boolean mo506l1() {
        return this.f41130b.mo506l1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: p1 */
    public final String mo507p1() {
        return this.f41130b.mo507p1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: t1 */
    public final InterfaceC7116c<ProfileAccount> mo508t1() {
        return this.f41130b.mo508t1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: w0 */
    public final InterfaceC7142w<UserLanguage> mo509w0() {
        return this.f41130b.mo509w0();
    }

    @Override // p244lh.InterfaceC7364a
    /* JADX INFO: renamed from: x */
    public final void mo9421x(AppUsageType appUsageType) {
        C5207g.m11111f(appUsageType, "appUsageType");
        LinkedHashMap linkedHashMap = this.f41131c;
        Long l10 = (Long) linkedHashMap.get(appUsageType);
        if (l10 != null) {
            this.f41129a.mo6047h(mo498E1(), appUsageType.getKey(), TimeUnit.MILLISECONDS.toSeconds(Calendar.getInstance().getTimeInMillis() - l10.longValue()));
        }
    }
}
