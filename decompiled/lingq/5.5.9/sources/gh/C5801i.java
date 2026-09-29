package gh;

import com.kochava.tracker.privacy.internal.ConsentState;
import p157hg.InterfaceC6044b;
import p157hg.SharedPreferencesOnSharedPreferenceChangeListenerC6043a;
import p233l3.AbstractC7248c;

/* JADX INFO: renamed from: gh.i */
/* JADX INFO: loaded from: classes.dex */
public final class C5801i extends AbstractC7248c {

    /* JADX INFO: renamed from: b */
    public final long f35062b;

    /* JADX INFO: renamed from: c */
    public ConsentState f35063c;

    /* JADX INFO: renamed from: d */
    public long f35064d;

    public C5801i(SharedPreferencesOnSharedPreferenceChangeListenerC6043a sharedPreferencesOnSharedPreferenceChangeListenerC6043a, long j10) {
        super(sharedPreferencesOnSharedPreferenceChangeListenerC6043a);
        this.f35063c = ConsentState.NOT_ANSWERED;
        this.f35064d = 0L;
        this.f35062b = j10;
    }

    @Override // p233l3.AbstractC7248c
    /* JADX INFO: renamed from: a */
    public final synchronized void mo12193a() {
        try {
            this.f35063c = ConsentState.fromKey(((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a)).m12482e("privacy.consent_state", ConsentState.NOT_ANSWERED.key));
            long jLongValue = ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a)).m12481d("privacy.consent_state_time_millis", Long.valueOf(this.f35062b)).longValue();
            this.f35064d = jLongValue;
            if (jLongValue == this.f35062b) {
                ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a)).m12487j("privacy.consent_state_time_millis", jLongValue);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
