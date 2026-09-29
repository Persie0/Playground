package gh;

import p075dh.C5174b;
import p075dh.InterfaceC5175c;
import p157hg.InterfaceC6044b;
import p157hg.SharedPreferencesOnSharedPreferenceChangeListenerC6043a;
import p233l3.AbstractC7248c;
import p534zf.InterfaceC10488f;

/* JADX INFO: renamed from: gh.j */
/* JADX INFO: loaded from: classes.dex */
public final class C5802j extends AbstractC7248c {

    /* JADX INFO: renamed from: b */
    public InterfaceC5175c f35065b;

    /* JADX INFO: renamed from: c */
    public long f35066c;

    /* JADX INFO: renamed from: d */
    public long f35067d;

    /* JADX INFO: renamed from: e */
    public boolean f35068e;

    /* JADX INFO: renamed from: f */
    public long f35069f;

    /* JADX INFO: renamed from: g */
    public int f35070g;

    public C5802j(SharedPreferencesOnSharedPreferenceChangeListenerC6043a sharedPreferencesOnSharedPreferenceChangeListenerC6043a) {
        super(sharedPreferencesOnSharedPreferenceChangeListenerC6043a);
        this.f35065b = null;
        this.f35066c = 0L;
        this.f35067d = 0L;
        this.f35068e = false;
        this.f35069f = 0L;
        this.f35070g = 0;
    }

    @Override // p233l3.AbstractC7248c
    /* JADX INFO: renamed from: a */
    public final synchronized void mo12193a() {
        try {
            InterfaceC10488f interfaceC10488fM12480c = ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a)).m12480c("session.pause_payload", false);
            this.f35065b = interfaceC10488fM12480c != null ? C5174b.m10954e(interfaceC10488fM12480c) : null;
            this.f35066c = ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a)).m12481d("window_count", 0L).longValue();
            this.f35067d = ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a)).m12481d("session.window_start_time_millis", 0L).longValue();
            this.f35068e = ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a)).m12478a("session.window_pause_sent", Boolean.FALSE).booleanValue();
            this.f35069f = ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a)).m12481d("session.window_uptime_millis", 0L).longValue();
            this.f35070g = ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a)).m12479b(0, "session.window_state_active_count").intValue();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: g */
    public final synchronized void m12219g(InterfaceC5175c interfaceC5175c) {
        this.f35065b = interfaceC5175c;
        if (interfaceC5175c != null) {
            ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a)).m12486i(((C5174b) interfaceC5175c).m10958i(), "session.pause_payload");
        } else {
            ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a)).m12483f("session.pause_payload");
        }
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m12220h(int i10) {
        this.f35070g = i10;
        ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a)).m12485h("session.window_state_active_count", i10);
    }

    /* JADX INFO: renamed from: i */
    public final synchronized void m12221i(long j10) {
        try {
            this.f35069f = j10;
            ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a)).m12487j("session.window_uptime_millis", j10);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
