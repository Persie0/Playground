package p485xg;

import ag.C0075b;
import ag.C0076c;
import com.kochava.core.task.internal.TaskQueue;
import com.kochava.tracker.BuildConfig;
import com.kochava.tracker.payload.internal.PayloadType;
import dm.C5206f;
import gh.C5793a;
import gh.C5797e;
import gh.InterfaceC5794b;
import p003a2.C0009a;
import p075dh.C5174b;
import p157hg.InterfaceC6044b;
import p157hg.SharedPreferencesOnSharedPreferenceChangeListenerC6043a;
import p180ih.C6330c;
import p180ih.InterfaceC6331d;
import p341qg.C8620f;
import p341qg.C8624j;
import p366rg.C8782c;
import p366rg.C8785f;
import p366rg.InterfaceC8786g;
import p509yf.AbstractC10357a;
import p509yf.InterfaceC10359c;
import p534zf.C10487e;
import p534zf.InterfaceC10488f;
import p535zg.C10489a;

/* JADX INFO: renamed from: xg.c */
/* JADX INFO: loaded from: classes.dex */
public final class C10187c extends AbstractC10357a {

    /* JADX INFO: renamed from: M */
    public static final C0076c f51530M;

    /* JADX INFO: renamed from: H */
    public final InterfaceC5794b f51531H;

    /* JADX INFO: renamed from: I */
    public final C8620f f51532I;

    /* JADX INFO: renamed from: J */
    public final InterfaceC6331d f51533J;

    /* JADX INFO: renamed from: K */
    public final InterfaceC8786g f51534K;

    /* JADX INFO: renamed from: L */
    public final Boolean f51535L;

    static {
        C0075b c0075bM19476b = C10489a.m19476b();
        f51530M = C0009a.m17e(c0075bM19476b, c0075bM19476b, BuildConfig.SDK_MODULE_NAME, "JobUpdateInstall");
    }

    public C10187c(InterfaceC10359c interfaceC10359c, C5793a c5793a, C8620f c8620f, C8785f c8785f, C6330c c6330c, Boolean bool) {
        super("JobUpdateInstall", c8620f.f46132f, TaskQueue.Worker, interfaceC10359c);
        this.f51531H = c5793a;
        this.f51532I = c8620f;
        this.f51534K = c8785f;
        this.f51533J = c6330c;
        this.f51535L = bool;
    }

    @Override // p509yf.AbstractC10357a
    /* JADX INFO: renamed from: o */
    public final void mo462o() {
        InterfaceC10488f interfaceC10488f;
        boolean z10;
        boolean z11;
        boolean z12;
        C0076c c0076c = f51530M;
        c0076c.m457a("Started at " + C5206f.m11023t1(this.f51532I.f46127a) + " seconds");
        if (this.f51535L != null) {
            C5797e c5797eM12186l = ((C5793a) this.f51531H).m12186l();
            synchronized (c5797eM12186l) {
                z11 = c5797eM12186l.f35035h;
            }
            if (z11 == this.f51535L.booleanValue()) {
                c0076c.m459c("App Limit Ad Tracking value did not change, ignoring");
                return;
            }
            C5797e c5797eM12186l2 = ((C5793a) this.f51531H).m12186l();
            boolean zBooleanValue = this.f51535L.booleanValue();
            synchronized (c5797eM12186l2) {
                c5797eM12186l2.f35035h = zBooleanValue;
                ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) c5797eM12186l2.f40719a)).m12484g("install.app_limit_ad_tracking", zBooleanValue);
            }
            C8782c c8782cM17070c = ((C8785f) this.f51534K).m17070c();
            Boolean bool = this.f51535L;
            synchronized (c8782cM17070c) {
                c8782cM17070c.f46550j = bool;
            }
            C5797e c5797eM12186l3 = ((C5793a) this.f51531H).m12186l();
            synchronized (c5797eM12186l3) {
                if (!c5797eM12186l3.m12199h()) {
                    synchronized (c5797eM12186l3) {
                        z12 = c5797eM12186l3.f35029b != null;
                    }
                }
            }
            if (!z12) {
                c0076c.m459c("Install not yet sent, ignoring");
                return;
            }
        }
        C5797e c5797eM12186l4 = ((C5793a) this.f51531H).m12186l();
        synchronized (c5797eM12186l4) {
            interfaceC10488f = c5797eM12186l4.f35034g;
        }
        C5174b c5174bM10952c = C5174b.m10952c(PayloadType.Update, this.f51532I.f46127a, ((C5793a) this.f51531H).m12187m().m12211j(), System.currentTimeMillis(), ((C6330c) this.f51533J).m12960f(), ((C6330c) this.f51533J).m12961g(), ((C6330c) this.f51533J).m12959e());
        c5174bM10952c.m10955f(this.f51532I.f46128b, this.f51534K);
        C10487e c10487eMo19451a = c5174bM10952c.f33189c.mo19451a();
        c10487eMo19451a.mo19465o("usertime");
        c10487eMo19451a.mo19465o("uptime");
        c10487eMo19451a.mo19465o("starttime");
        C5797e c5797eM12186l5 = ((C5793a) this.f51531H).m12186l();
        synchronized (c5797eM12186l5) {
            z10 = c5797eM12186l5.f35033f;
        }
        if (!z10) {
            ((C5793a) this.f51531H).m12186l().m12207p(c10487eMo19451a);
            C5797e c5797eM12186l6 = ((C5793a) this.f51531H).m12186l();
            synchronized (c5797eM12186l6) {
                c5797eM12186l6.f35033f = true;
                ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) c5797eM12186l6.f40719a)).m12484g("install.update_watchlist_initialized", true);
            }
            c0076c.m459c("Initialized with starting values");
            return;
        }
        if (interfaceC10488f.equals(c10487eMo19451a)) {
            c0076c.m459c("No watched values updated");
            return;
        }
        for (String str : interfaceC10488f.mo19453c(c10487eMo19451a).mo19460j()) {
            f51530M.m459c("Watched value " + str + " updated");
        }
        ((C5793a) this.f51531H).m12186l().m12207p(c10487eMo19451a);
        if (((C5793a) this.f51531H).m12185k().m12196g().f50562f.f50588b) {
            ((C5793a) this.f51531H).m12192r().m10962b(c5174bM10952c);
        } else {
            f51530M.m459c("Updates disabled, ignoring");
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
        synchronized (((C8624j) this.f51532I.f46137k)) {
        }
        return (((C8624j) this.f51532I.f46137k).m16847b() && this.f51535L == null) ? false : true;
    }
}
