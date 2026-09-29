package gh;

import p157hg.InterfaceC6044b;
import p157hg.SharedPreferencesOnSharedPreferenceChangeListenerC6043a;
import p233l3.AbstractC7248c;
import p349qo.C8656b;
import p534zf.C10483a;
import p534zf.C10487e;
import p534zf.InterfaceC10484b;
import p534zf.InterfaceC10488f;

/* JADX INFO: renamed from: gh.c */
/* JADX INFO: loaded from: classes.dex */
public final class C5795c extends AbstractC7248c {

    /* JADX INFO: renamed from: b */
    public boolean f35016b;

    /* JADX INFO: renamed from: c */
    public InterfaceC10488f f35017c;

    /* JADX INFO: renamed from: d */
    public String f35018d;

    /* JADX INFO: renamed from: e */
    public boolean f35019e;

    /* JADX INFO: renamed from: f */
    public long f35020f;

    /* JADX INFO: renamed from: g */
    public InterfaceC10484b f35021g;

    public C5795c(SharedPreferencesOnSharedPreferenceChangeListenerC6043a sharedPreferencesOnSharedPreferenceChangeListenerC6043a) {
        super(sharedPreferencesOnSharedPreferenceChangeListenerC6043a);
        this.f35016b = false;
        this.f35017c = C10487e.m19445u();
        this.f35018d = null;
        this.f35019e = true;
        this.f35020f = 0L;
        this.f35021g = C10483a.m19430i();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p233l3.AbstractC7248c
    /* JADX INFO: renamed from: a */
    public final synchronized void mo12193a() {
        InterfaceC10484b interfaceC10484bM16884K;
        this.f35016b = ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a)).m12478a("engagement.push_watchlist_initialized", Boolean.FALSE).booleanValue();
        this.f35017c = ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a)).m12480c("engagement.push_watchlist", true);
        this.f35018d = ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a)).m12482e("engagement.push_token", null);
        this.f35019e = ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a)).m12478a("engagement.push_enabled", Boolean.TRUE).booleanValue();
        this.f35020f = ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a)).m12481d("engagement.push_token_sent_time_millis", 0L).longValue();
        SharedPreferencesOnSharedPreferenceChangeListenerC6043a sharedPreferencesOnSharedPreferenceChangeListenerC6043a = (SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a);
        synchronized (sharedPreferencesOnSharedPreferenceChangeListenerC6043a) {
            try {
                interfaceC10484bM16884K = C8656b.m16884K(C8656b.m16889P(sharedPreferencesOnSharedPreferenceChangeListenerC6043a.f35691a.getAll().get("engagement.push_message_id_history"), null));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f35021g = interfaceC10484bM16884K;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: g */
    public final synchronized void m12194g(long j10) {
        this.f35020f = j10;
        ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a)).m12487j("engagement.push_token_sent_time_millis", j10);
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m12195h(InterfaceC10488f interfaceC10488f) {
        try {
            this.f35017c = interfaceC10488f;
            ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a)).m12486i(interfaceC10488f, "engagement.push_watchlist");
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
