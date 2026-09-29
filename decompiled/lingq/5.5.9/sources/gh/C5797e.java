package gh;

import p075dh.C5174b;
import p075dh.InterfaceC5175c;
import p157hg.InterfaceC6044b;
import p157hg.SharedPreferencesOnSharedPreferenceChangeListenerC6043a;
import p158hh.C6047b;
import p233l3.AbstractC7248c;
import p485xg.C10188d;
import p510yg.C10360a;
import p534zf.C10487e;
import p534zf.InterfaceC10488f;
import pg.C8246a;
import sg.C9002a;
import ug.C9523a;

/* JADX INFO: renamed from: gh.e */
/* JADX INFO: loaded from: classes.dex */
public final class C5797e extends AbstractC7248c {

    /* JADX INFO: renamed from: b */
    public InterfaceC5175c f35029b;

    /* JADX INFO: renamed from: c */
    public C10188d f35030c;

    /* JADX INFO: renamed from: d */
    public long f35031d;

    /* JADX INFO: renamed from: e */
    public long f35032e;

    /* JADX INFO: renamed from: f */
    public boolean f35033f;

    /* JADX INFO: renamed from: g */
    public InterfaceC10488f f35034g;

    /* JADX INFO: renamed from: h */
    public boolean f35035h;

    /* JADX INFO: renamed from: i */
    public InterfaceC10488f f35036i;

    /* JADX INFO: renamed from: j */
    public InterfaceC10488f f35037j;

    /* JADX INFO: renamed from: k */
    public C8246a f35038k;

    /* JADX INFO: renamed from: l */
    public C10360a f35039l;

    /* JADX INFO: renamed from: m */
    public C9523a f35040m;

    /* JADX INFO: renamed from: n */
    public C6047b f35041n;

    /* JADX INFO: renamed from: o */
    public C9002a f35042o;

    public C5797e(SharedPreferencesOnSharedPreferenceChangeListenerC6043a sharedPreferencesOnSharedPreferenceChangeListenerC6043a) {
        super(sharedPreferencesOnSharedPreferenceChangeListenerC6043a);
        this.f35029b = null;
        this.f35030c = new C10188d();
        this.f35031d = 0L;
        this.f35032e = 0L;
        this.f35033f = false;
        this.f35034g = C10487e.m19445u();
        this.f35035h = false;
        this.f35036i = C10487e.m19445u();
        this.f35037j = C10487e.m19445u();
        this.f35038k = new C8246a();
        this.f35039l = null;
        this.f35040m = null;
        this.f35041n = null;
        this.f35042o = null;
    }

    @Override // p233l3.AbstractC7248c
    /* JADX INFO: renamed from: a */
    public final synchronized void mo12193a() {
        InterfaceC10488f interfaceC10488fM12480c = ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a)).m12480c("install.payload", false);
        this.f35029b = interfaceC10488fM12480c != null ? C5174b.m10954e(interfaceC10488fM12480c) : null;
        this.f35030c = C10188d.m19199a(((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a)).m12480c("install.last_install_info", true));
        this.f35031d = ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a)).m12481d("install.sent_time_millis", 0L).longValue();
        this.f35032e = ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a)).m12481d("install.sent_count", 0L).longValue();
        InterfaceC6044b interfaceC6044b = (InterfaceC6044b) this.f40719a;
        Boolean bool = Boolean.FALSE;
        this.f35033f = ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) interfaceC6044b).m12478a("install.update_watchlist_initialized", bool).booleanValue();
        this.f35034g = ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a)).m12480c("install.update_watchlist", true);
        this.f35035h = ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a)).m12478a("install.app_limit_ad_tracking", bool).booleanValue();
        this.f35036i = ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a)).m12480c("install.identity_link", true);
        this.f35037j = ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a)).m12480c("install.custom_device_identifiers", true);
        this.f35038k = C8246a.m16394a(((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a)).m12480c("install.attribution", true));
        InterfaceC10488f interfaceC10488fM12480c2 = ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a)).m12480c("install.install_referrer", false);
        if (interfaceC10488fM12480c2 != null) {
            this.f35039l = C10360a.m19382a(interfaceC10488fM12480c2);
        } else {
            this.f35039l = null;
        }
        InterfaceC10488f interfaceC10488fM12480c3 = ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a)).m12480c("install.huawei_referrer", false);
        if (interfaceC10488fM12480c3 != null) {
            this.f35040m = C9523a.m17984a(interfaceC10488fM12480c3);
        } else {
            this.f35040m = null;
        }
        InterfaceC10488f interfaceC10488fM12480c4 = ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a)).m12480c("install.samsung_referrer", false);
        if (interfaceC10488fM12480c4 != null) {
            this.f35041n = C6047b.m12491b(interfaceC10488fM12480c4);
        } else {
            this.f35041n = null;
        }
        InterfaceC10488f interfaceC10488fM12480c5 = ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a)).m12480c("install.instant_app_deeplink", false);
        if (interfaceC10488fM12480c5 != null) {
            this.f35042o = new C9002a(interfaceC10488fM12480c5.mo19459i("install_time", 0L).longValue(), interfaceC10488fM12480c5.mo19467q("install_app_id", ""), interfaceC10488fM12480c5.mo19467q("install_url", ""));
        } else {
            this.f35042o = null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: g */
    public final synchronized C10188d m12198g() {
        return this.f35030c;
    }

    /* JADX INFO: renamed from: h */
    public final synchronized boolean m12199h() {
        return this.f35031d > 0;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: i */
    public final synchronized void m12200i(C8246a c8246a) {
        this.f35038k = c8246a;
        ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a)).m12486i(c8246a.m16396c(), "install.attribution");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: j */
    public final synchronized void m12201j(C9523a c9523a) {
        this.f35040m = c9523a;
        ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a)).m12486i(c9523a.m17985b(), "install.huawei_referrer");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: k */
    public final synchronized void m12202k(C10360a c10360a) {
        this.f35039l = c10360a;
        ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a)).m12486i(c10360a.m19383b(), "install.install_referrer");
    }

    /* JADX INFO: renamed from: l */
    public final synchronized void m12203l(C10188d c10188d) {
        this.f35030c = c10188d;
        ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a)).m12486i(c10188d.m19200b(), "install.last_install_info");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: m */
    public final synchronized void m12204m(C5174b c5174b) {
        this.f35029b = c5174b;
        if (c5174b != null) {
            ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a)).m12486i(c5174b.m10958i(), "install.payload");
        } else {
            ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a)).m12483f("install.payload");
        }
    }

    /* JADX INFO: renamed from: n */
    public final synchronized void m12205n(C6047b c6047b) {
        this.f35041n = c6047b;
        ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a)).m12486i(c6047b.m12493c(), "install.samsung_referrer");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: o */
    public final synchronized void m12206o(long j10) {
        try {
            this.f35031d = j10;
            ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a)).m12487j("install.sent_time_millis", j10);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: p */
    public final synchronized void m12207p(InterfaceC10488f interfaceC10488f) {
        try {
            this.f35034g = interfaceC10488f;
            ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a)).m12486i(interfaceC10488f, "install.update_watchlist");
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
