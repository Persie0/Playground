package p013ah;

import ag.C0075b;
import ag.C0076c;
import com.kochava.core.task.internal.TaskQueue;
import com.kochava.tracker.BuildConfig;
import com.kochava.tracker.payload.internal.PayloadType;
import dm.C5206f;
import gh.C5793a;
import gh.C5795c;
import gh.InterfaceC5794b;
import p003a2.C0009a;
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
import p534zf.C10487e;
import p534zf.InterfaceC10488f;
import p535zg.C10489a;

/* JADX INFO: renamed from: ah.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0078b extends AbstractC10357a {

    /* JADX INFO: renamed from: L */
    public static final C0076c f206L;

    /* JADX INFO: renamed from: H */
    public final InterfaceC5794b f207H;

    /* JADX INFO: renamed from: I */
    public final C8620f f208I;

    /* JADX INFO: renamed from: J */
    public final InterfaceC8786g f209J;

    /* JADX INFO: renamed from: K */
    public final InterfaceC6331d f210K;

    static {
        C0075b c0075bM19476b = C10489a.m19476b();
        f206L = C0009a.m17e(c0075bM19476b, c0075bM19476b, BuildConfig.SDK_MODULE_NAME, "JobUpdatePush");
    }

    public C0078b(InterfaceC10359c interfaceC10359c, C5793a c5793a, C8620f c8620f, C8785f c8785f, C6330c c6330c) {
        super("JobUpdatePush", c8620f.f46132f, TaskQueue.IO, interfaceC10359c);
        this.f207H = c5793a;
        this.f208I = c8620f;
        this.f209J = c8785f;
        this.f210K = c6330c;
    }

    @Override // p509yf.AbstractC10357a
    /* JADX INFO: renamed from: o */
    public final void mo462o() {
        boolean z10;
        boolean z11;
        String str;
        boolean z12;
        InterfaceC10488f interfaceC10488f;
        C0076c c0076c = f206L;
        c0076c.m457a("Started at " + C5206f.m11023t1(this.f208I.f46127a) + " seconds");
        C5795c c5795cM12182h = ((C5793a) this.f207H).m12182h();
        synchronized (c5795cM12182h) {
            z10 = c5795cM12182h.f35020f > 0;
        }
        C5795c c5795cM12182h2 = ((C5793a) this.f207H).m12182h();
        synchronized (c5795cM12182h2) {
            z11 = c5795cM12182h2.f35016b;
        }
        boolean z13 = !z11;
        C5795c c5795cM12182h3 = ((C5793a) this.f207H).m12182h();
        synchronized (c5795cM12182h3) {
            str = c5795cM12182h3.f35018d;
        }
        boolean z14 = !C8573r0.m16662A0(str);
        boolean z15 = ((C5793a) this.f207H).m12185k().m12196g().f50567k.f50618a;
        C5795c c5795cM12182h4 = ((C5793a) this.f207H).m12182h();
        synchronized (c5795cM12182h4) {
            z12 = c5795cM12182h4.f35019e;
        }
        C5174b c5174bM10952c = C5174b.m10952c(z12 ? PayloadType.PushTokenAdd : PayloadType.PushTokenRemove, this.f208I.f46127a, ((C5793a) this.f207H).m12187m().m12211j(), System.currentTimeMillis(), ((C6330c) this.f210K).m12960f(), ((C6330c) this.f210K).m12961g(), ((C6330c) this.f210K).m12959e());
        c5174bM10952c.m10955f(this.f208I.f46128b, this.f209J);
        C10487e c10487eM19445u = C10487e.m19445u();
        C10487e c10487eMo19451a = c5174bM10952c.f33189c.mo19451a();
        Boolean boolMo19468r = c10487eMo19451a.mo19468r("notifications_enabled", null);
        if (boolMo19468r != null) {
            c10487eM19445u.m19472x("notifications_enabled", boolMo19468r.booleanValue());
        }
        Boolean boolMo19468r2 = c10487eMo19451a.mo19468r("background_location", null);
        if (boolMo19468r2 != null) {
            c10487eM19445u.m19472x("background_location", boolMo19468r2.booleanValue());
        }
        C5795c c5795cM12182h5 = ((C5793a) this.f207H).m12182h();
        synchronized (c5795cM12182h5) {
            interfaceC10488f = c5795cM12182h5.f35017c;
        }
        boolean z16 = !interfaceC10488f.equals(c10487eM19445u);
        if (z13) {
            c0076c.m459c("Initialized with starting values");
            ((C5793a) this.f207H).m12182h().m12195h(c10487eM19445u);
            C5795c c5795cM12182h6 = ((C5793a) this.f207H).m12182h();
            synchronized (c5795cM12182h6) {
                c5795cM12182h6.f35016b = true;
                ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) c5795cM12182h6.f40719a)).m12484g("engagement.push_watchlist_initialized", true);
            }
            if (z10) {
                c0076c.m459c("Already up to date");
                return;
            }
        } else if (z16) {
            c0076c.m459c("Saving updated watchlist");
            ((C5793a) this.f207H).m12182h().m12195h(c10487eM19445u);
            ((C5793a) this.f207H).m12182h().m12194g(0L);
        } else if (z10) {
            c0076c.m459c("Already up to date");
            return;
        }
        if (!z15) {
            c0076c.m459c("Disabled for this app");
        } else if (!z14) {
            c0076c.m459c("No token");
        } else {
            ((C5793a) this.f207H).m12191q().m10962b(c5174bM10952c);
            ((C5793a) this.f207H).m12182h().m12194g(System.currentTimeMillis());
        }
    }

    @Override // p509yf.AbstractC10357a
    /* JADX INFO: renamed from: s */
    public final long mo463s() {
        return 0L;
    }

    @Override // p509yf.AbstractC10357a
    /* JADX INFO: renamed from: u */
    public final boolean mo464u() {
        synchronized (((C8624j) this.f208I.f46137k)) {
        }
        return !((C8624j) this.f208I.f46137k).m16847b();
    }
}
