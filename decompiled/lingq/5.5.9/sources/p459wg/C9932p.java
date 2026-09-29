package p459wg;

import ag.C0075b;
import ag.C0076c;
import com.kochava.core.task.action.internal.TaskFailedException;
import com.kochava.core.task.internal.TaskQueue;
import com.kochava.tracker.BuildConfig;
import com.kochava.tracker.payload.internal.PayloadType;
import com.kochava.tracker.privacy.internal.ConsentState;
import dm.C5206f;
import gh.C5793a;
import gh.C5796d;
import gh.C5801i;
import gh.InterfaceC5794b;
import p003a2.C0009a;
import p074dg.C5170b;
import p075dh.C5174b;
import p157hg.InterfaceC6044b;
import p157hg.SharedPreferencesOnSharedPreferenceChangeListenerC6043a;
import p180ih.C6330c;
import p180ih.InterfaceC6331d;
import p338qd.C8573r0;
import p341qg.C8620f;
import p341qg.C8624j;
import p366rg.C8785f;
import p366rg.InterfaceC8786g;
import p509yf.AbstractC10357a;
import p509yf.InterfaceC10359c;
import p534zf.C10485c;
import p534zf.C10487e;
import p535zg.C10489a;
import pg.C8246a;

/* JADX INFO: renamed from: wg.p */
/* JADX INFO: loaded from: classes.dex */
public final class C9932p extends AbstractC10357a {

    /* JADX INFO: renamed from: L */
    public static final C0076c f50623L;

    /* JADX INFO: renamed from: H */
    public final InterfaceC5794b f50624H;

    /* JADX INFO: renamed from: I */
    public final C8620f f50625I;

    /* JADX INFO: renamed from: J */
    public final InterfaceC6331d f50626J;

    /* JADX INFO: renamed from: K */
    public final InterfaceC8786g f50627K;

    static {
        C0075b c0075bM19476b = C10489a.m19476b();
        f50623L = C0009a.m17e(c0075bM19476b, c0075bM19476b, BuildConfig.SDK_MODULE_NAME, "JobInit");
    }

    public C9932p(InterfaceC10359c interfaceC10359c, C5793a c5793a, C8620f c8620f, C8785f c8785f, C6330c c6330c) {
        super("JobInit", c8620f.f46132f, TaskQueue.IO, interfaceC10359c);
        this.f50624H = c5793a;
        this.f50625I = c8620f;
        this.f50627K = c8785f;
        this.f50626J = c6330c;
    }

    /* JADX WARN: Unreachable blocks removed: 4, instructions: 4 */
    @Override // p509yf.AbstractC10357a
    /* JADX INFO: renamed from: o */
    public final void mo462o() throws TaskFailedException {
        ConsentState consentState;
        PayloadType payloadType = PayloadType.Init;
        String string = payloadType.getUrl().toString();
        C0076c c0076c = f50623L;
        C10489a.m19475a(c0076c, "Sending kvinit at " + C5206f.m11023t1(this.f50625I.f46127a) + " seconds to " + string);
        StringBuilder sb2 = new StringBuilder("Started at ");
        sb2.append(C5206f.m11023t1(this.f50625I.f46127a));
        sb2.append(" seconds");
        c0076c.m457a(sb2.toString());
        C10487e c10487eM19445u = C10487e.m19445u();
        c10487eM19445u.m19450D("url", string);
        C5174b c5174bM10953d = C5174b.m10953d(payloadType, this.f50625I.f46127a, ((C5793a) this.f50624H).m12187m().m12211j(), System.currentTimeMillis(), ((C6330c) this.f50626J).m12960f(), ((C6330c) this.f50626J).m12961g(), ((C6330c) this.f50626J).m12959e(), c10487eM19445u);
        c5174bM10953d.m10955f(this.f50625I.f46128b, this.f50627K);
        long jCurrentTimeMillis = System.currentTimeMillis();
        C5170b c5170bM10959j = c5174bM10953d.m10959j(this.f50625I.f46128b, this.f52077i, ((C5793a) this.f50624H).m12185k().m12196g().f50565i.m18414a());
        m19373k();
        if (!c5170bM10959j.f33172b) {
            payloadType.incrementRotationUrlIndex();
            if (!payloadType.isRotationUrlRotated()) {
                c0076c.m459c("Transmit failed, retrying immediately with rotated URL");
                m19376n(1L);
                return;
            }
            C5796d c5796dM12185k = ((C5793a) this.f50624H).m12185k();
            synchronized (c5796dM12185k) {
                try {
                    c5796dM12185k.f35028h = true;
                    ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) c5796dM12185k.f40719a)).m12484g("init.rotation_url_rotated", true);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            c0076c.m459c("Transmit failed, retrying after " + C5206f.m11011j1(c5170bM10959j.f33174d) + " seconds");
            m19377p(c5170bM10959j.f33174d);
            throw null;
        }
        C9917a c9917aM12196g = ((C5793a) this.f50624H).m12185k().m12196g();
        if (!c5170bM10959j.f33172b) {
            throw new IllegalStateException("Data not accessible on failure.");
        }
        C9917a c9917aM18411a = C9917a.m18411a(((C10485c) c5170bM10959j.f33176f).m19443a());
        C5796d c5796dM12185k2 = ((C5793a) this.f50624H).m12185k();
        int rotationUrlIndex = payloadType.getRotationUrlIndex();
        synchronized (c5796dM12185k2) {
            c5796dM12185k2.f35027g = rotationUrlIndex;
            ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) c5796dM12185k2.f40719a)).m12485h("init.rotation_url_index", rotationUrlIndex);
        }
        C5796d c5796dM12185k3 = ((C5793a) this.f50624H).m12185k();
        synchronized (c5796dM12185k3) {
            try {
                c5796dM12185k3.f35025e = c9917aM18411a;
                ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) c5796dM12185k3.f40719a)).m12486i(c9917aM18411a.m18412b(), "init.response");
            } catch (Throwable th3) {
                throw th3;
            }
        }
        C5796d c5796dM12185k4 = ((C5793a) this.f50624H).m12185k();
        synchronized (c5796dM12185k4) {
            ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) c5796dM12185k4.f40719a)).m12487j("init.sent_time_millis", jCurrentTimeMillis);
        }
        C5796d c5796dM12185k5 = ((C5793a) this.f50624H).m12185k();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        synchronized (c5796dM12185k5) {
            try {
                c5796dM12185k5.f35024d = jCurrentTimeMillis2;
                ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) c5796dM12185k5.f40719a)).m12487j("init.received_time_millis", jCurrentTimeMillis2);
            } catch (Throwable th4) {
                throw th4;
            }
        }
        C5796d c5796dM12185k6 = ((C5793a) this.f50624H).m12185k();
        synchronized (c5796dM12185k6) {
            try {
                c5796dM12185k6.f35023c = true;
                ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) c5796dM12185k6.f40719a)).m12484g("init.ready", true);
            } catch (Throwable th5) {
                throw th5;
            }
        }
        String str = c9917aM18411a.f50562f.f50587a;
        boolean zM16662A0 = C8573r0.m16662A0(str);
        InterfaceC5794b interfaceC5794b = this.f50624H;
        if (!zM16662A0 && !str.equals(c9917aM12196g.f50562f.f50587a)) {
            c0076c.m459c("Install resend ID changed");
            C5793a c5793a = (C5793a) interfaceC5794b;
            c5793a.m12186l().m12206o(0L);
            c5793a.m12186l().m12200i(new C8246a());
        }
        String str2 = c9917aM18411a.f50567k.f50619b;
        if (!C8573r0.m16662A0(str2) && !str2.equals(c9917aM12196g.f50567k.f50619b)) {
            c0076c.m459c("Push Token resend ID changed");
            ((C5793a) interfaceC5794b).m12182h().m12194g(0L);
        }
        C9921e c9921e = c9917aM18411a.f50559c;
        String str3 = c9921e.f50581c;
        if (!C8573r0.m16662A0(str3)) {
            c0076c.m459c("Applying App GUID override");
            ((C5793a) interfaceC5794b).m12187m().m12214m(str3);
        }
        String str4 = c9921e.f50582d;
        if (!C8573r0.m16662A0(str4)) {
            c0076c.m459c("Applying KDID override");
            ((C5793a) interfaceC5794b).m12187m().m12215n(str4);
        }
        c0076c.m459c("Init Configuration");
        c0076c.m459c(c9917aM18411a.m18412b());
        m18415w();
        StringBuilder sb3 = new StringBuilder("Intelligent Consent is ");
        sb3.append(c9917aM18411a.f50566j.f50615f.f50616a ? "Enabled" : "Disabled");
        sb3.append(" and ");
        sb3.append(c9917aM18411a.f50566j.f50615f.f50617b ? "applies" : "does not apply");
        sb3.append(" to this user");
        C10489a.m19475a(c0076c, sb3.toString());
        if (c9917aM18411a.f50566j.f50615f.f50616a) {
            StringBuilder sb4 = new StringBuilder("Intelligent Consent status is ");
            C5801i c5801iM12188n = ((C5793a) this.f50624H).m12188n();
            synchronized (c5801iM12188n) {
                consentState = c5801iM12188n.f35063c;
            }
            sb4.append(consentState.key);
            c0076c.m457a(sb4.toString());
        }
        C10489a.m19475a(c0076c, "Completed kvinit at " + C5206f.m11023t1(this.f50625I.f46127a) + " seconds with a network duration of " + C5206f.m11011j1(c5170bM10959j.f33171a) + " seconds");
    }

    @Override // p509yf.AbstractC10357a
    /* JADX INFO: renamed from: s */
    public final long mo463s() {
        return 0L;
    }

    @Override // p509yf.AbstractC10357a
    /* JADX INFO: renamed from: u */
    public final boolean mo464u() {
        long j10;
        C9917a c9917aM12196g = ((C5793a) this.f50624H).m12185k().m12196g();
        C5796d c5796dM12185k = ((C5793a) this.f50624H).m12185k();
        synchronized (c5796dM12185k) {
            try {
                j10 = c5796dM12185k.f35024d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j10 + C5206f.m11017p1(c9917aM12196g.f50561e.f50573a) <= System.currentTimeMillis() || !((j10 > this.f50625I.f46127a ? 1 : (j10 == this.f50625I.f46127a ? 0 : -1)) >= 0);
    }

    /* JADX INFO: renamed from: w */
    public final void m18415w() {
        synchronized (((C8624j) this.f50625I.f46137k)) {
        }
    }
}
