package gh;

import ag.C0075b;
import ag.C0076c;
import com.kochava.tracker.BuildConfig;
import java.util.UUID;
import p003a2.C0009a;
import p157hg.InterfaceC6044b;
import p157hg.SharedPreferencesOnSharedPreferenceChangeListenerC6043a;
import p233l3.AbstractC7248c;
import p338qd.C8573r0;
import p535zg.C10489a;

/* JADX INFO: renamed from: gh.f */
/* JADX INFO: loaded from: classes.dex */
public final class C5798f extends AbstractC7248c implements InterfaceC5799g {

    /* JADX INFO: renamed from: i */
    public static final C0076c f35043i;

    /* JADX INFO: renamed from: b */
    public final long f35044b;

    /* JADX INFO: renamed from: c */
    public long f35045c;

    /* JADX INFO: renamed from: d */
    public long f35046d;

    /* JADX INFO: renamed from: e */
    public boolean f35047e;

    /* JADX INFO: renamed from: f */
    public String f35048f;

    /* JADX INFO: renamed from: g */
    public String f35049g;

    /* JADX INFO: renamed from: h */
    public String f35050h;

    static {
        C0075b c0075bM19476b = C10489a.m19476b();
        f35043i = C0009a.m17e(c0075bM19476b, c0075bM19476b, BuildConfig.SDK_MODULE_NAME, "ProfileMain");
    }

    public C5798f(SharedPreferencesOnSharedPreferenceChangeListenerC6043a sharedPreferencesOnSharedPreferenceChangeListenerC6043a, long j10) {
        super(sharedPreferencesOnSharedPreferenceChangeListenerC6043a);
        this.f35046d = 0L;
        this.f35047e = false;
        this.f35048f = null;
        this.f35049g = "";
        this.f35050h = null;
        this.f35044b = j10;
        this.f35045c = j10;
    }

    /* JADX INFO: renamed from: g */
    public static String m12208g() {
        return "KA" + (System.currentTimeMillis() / 1000) + "T" + "4.3.0".replace(".", "") + "V" + UUID.randomUUID().toString().replaceAll("-", "");
    }

    @Override // p233l3.AbstractC7248c
    /* JADX INFO: renamed from: a */
    public final synchronized void mo12193a() {
        try {
            long jLongValue = ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a)).m12481d("main.first_start_time_millis", Long.valueOf(this.f35044b)).longValue();
            this.f35045c = jLongValue;
            if (jLongValue == this.f35044b) {
                ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a)).m12487j("main.first_start_time_millis", jLongValue);
            }
            long jLongValue2 = ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a)).m12481d("main.start_count", Long.valueOf(this.f35046d)).longValue() + 1;
            this.f35046d = jLongValue2;
            ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a)).m12487j("main.start_count", jLongValue2);
            this.f35047e = ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a)).m12478a("main.last_launch_instant_app", Boolean.valueOf(this.f35047e)).booleanValue();
            this.f35048f = ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a)).m12482e("main.app_guid_override", null);
            String strM12482e = ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a)).m12482e("main.device_id", null);
            if (C8573r0.m16662A0(strM12482e)) {
                m12209h();
            } else {
                this.f35049g = strM12482e;
            }
            ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a)).m12482e("main.device_id_original", this.f35049g);
            this.f35050h = ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a)).m12482e("main.device_id_override", null);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: h */
    public final synchronized void m12209h() {
        boolean zContains;
        f35043i.m459c("Creating a new Kochava Device ID");
        String strM12208g = m12208g();
        synchronized (this) {
            this.f35049g = strM12208g;
            ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a)).m12488k("main.device_id", strM12208g);
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC6043a sharedPreferencesOnSharedPreferenceChangeListenerC6043a = (SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a);
        synchronized (sharedPreferencesOnSharedPreferenceChangeListenerC6043a) {
            try {
                zContains = sharedPreferencesOnSharedPreferenceChangeListenerC6043a.f35691a.contains("main.device_id_original");
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!zContains) {
            String str = this.f35049g;
            synchronized (this) {
                ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a)).m12488k("main.device_id_original", str);
            }
        }
        m12215n(null);
    }

    /* JADX INFO: renamed from: i */
    public final synchronized String m12210i() {
        if (C8573r0.m16662A0(this.f35050h)) {
            return null;
        }
        return this.f35050h;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: j */
    public final synchronized long m12211j() {
        return this.f35046d;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: k */
    public final synchronized boolean m12212k() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f35046d <= 1;
    }

    /* JADX INFO: renamed from: l */
    public final synchronized boolean m12213l() {
        return this.f35047e;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: m */
    public final synchronized void m12214m(String str) {
        this.f35048f = str;
        if (str != null) {
            ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a)).m12488k("main.app_guid_override", str);
        } else {
            ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a)).m12483f("main.app_guid_override");
        }
    }

    /* JADX INFO: renamed from: n */
    public final synchronized void m12215n(String str) {
        try {
            this.f35050h = str;
            if (str != null) {
                ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a)).m12488k("main.device_id_override", str);
            } else {
                ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a)).m12483f("main.device_id_override");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: o */
    public final synchronized void m12216o(boolean z10) {
        try {
            this.f35047e = z10;
            ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) this.f40719a)).m12484g("main.last_launch_instant_app", z10);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
