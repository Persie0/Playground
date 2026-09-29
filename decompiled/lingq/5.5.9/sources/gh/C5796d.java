package gh;

import p157hg.InterfaceC6044b;
import p157hg.SharedPreferencesOnSharedPreferenceChangeListenerC6043a;
import p233l3.AbstractC7248c;
import p459wg.C9917a;

/* JADX INFO: renamed from: gh.d */
/* JADX INFO: loaded from: classes.dex */
public final class C5796d extends AbstractC7248c {

    /* JADX INFO: renamed from: b */
    public final long f35022b;

    /* JADX INFO: renamed from: c */
    public boolean f35023c;

    /* JADX INFO: renamed from: d */
    public long f35024d;

    /* JADX INFO: renamed from: e */
    public C9917a f35025e;

    /* JADX INFO: renamed from: f */
    public int f35026f;

    /* JADX INFO: renamed from: g */
    public int f35027g;

    /* JADX INFO: renamed from: h */
    public boolean f35028h;

    public C5796d(SharedPreferencesOnSharedPreferenceChangeListenerC6043a sharedPreferencesOnSharedPreferenceChangeListenerC6043a, long j10) {
        super(sharedPreferencesOnSharedPreferenceChangeListenerC6043a);
        this.f35023c = false;
        this.f35024d = 0L;
        this.f35025e = new C9917a();
        this.f35026f = 0;
        this.f35027g = 0;
        this.f35028h = false;
        this.f35022b = j10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p233l3.AbstractC7248c
    /* JADX INFO: renamed from: a */
    public final synchronized void mo12193a() {
        InterfaceC6044b interfaceC6044b = (InterfaceC6044b) this.f40719a;
        Boolean bool = Boolean.FALSE;
        this.f35023c = ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) interfaceC6044b).m12478a("init.ready", bool).booleanValue();
        ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a)).m12481d("init.sent_time_millis", 0L).longValue();
        this.f35024d = ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a)).m12481d("init.received_time_millis", 0L).longValue();
        this.f35025e = C9917a.m18411a(((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a)).m12480c("init.response", true));
        this.f35026f = ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a)).m12479b(0, "init.rotation_url_date").intValue();
        this.f35027g = ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a)).m12479b(0, "init.rotation_url_index").intValue();
        this.f35028h = ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a)).m12478a("init.rotation_url_rotated", bool).booleanValue();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: g */
    public final synchronized C9917a m12196g() {
        return this.f35025e;
    }

    /* JADX INFO: renamed from: h */
    public final synchronized boolean m12197h() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f35023c;
    }
}
