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
import p075dh.InterfaceC5175c;
import p157hg.InterfaceC6044b;
import p157hg.SharedPreferencesOnSharedPreferenceChangeListenerC6043a;
import p180ih.C6330c;
import p180ih.InterfaceC6331d;
import p341qg.C8620f;
import p366rg.C8783d;
import p366rg.C8785f;
import p366rg.InterfaceC8786g;
import p509yf.AbstractC10357a;
import p509yf.InterfaceC10359c;
import p534zf.C10487e;
import p535zg.C10489a;

/* JADX INFO: renamed from: xg.b */
/* JADX INFO: loaded from: classes.dex */
public final class C10186b extends AbstractC10357a {

    /* JADX INFO: renamed from: N */
    public static final C0076c f51523N;

    /* JADX INFO: renamed from: H */
    public final InterfaceC5794b f51524H;

    /* JADX INFO: renamed from: I */
    public final C8620f f51525I;

    /* JADX INFO: renamed from: J */
    public final InterfaceC6331d f51526J;

    /* JADX INFO: renamed from: K */
    public final InterfaceC8786g f51527K;

    /* JADX INFO: renamed from: L */
    public final String f51528L;

    /* JADX INFO: renamed from: M */
    public final String f51529M;

    static {
        C0075b c0075bM19476b = C10489a.m19476b();
        f51523N = C0009a.m17e(c0075bM19476b, c0075bM19476b, BuildConfig.SDK_MODULE_NAME, "JobUpdateIdentityLink");
    }

    public C10186b(InterfaceC10359c interfaceC10359c, C5793a c5793a, C8620f c8620f, C8785f c8785f, C6330c c6330c, String str, String str2) {
        super("JobUpdateIdentityLink", c8620f.f46132f, TaskQueue.Worker, interfaceC10359c);
        this.f51524H = c5793a;
        this.f51525I = c8620f;
        this.f51527K = c8785f;
        this.f51526J = c6330c;
        this.f51528L = str;
        this.f51529M = str2;
    }

    @Override // p509yf.AbstractC10357a
    /* JADX INFO: renamed from: o */
    public final void mo462o() {
        C10487e c10487eMo19451a;
        boolean z10;
        InterfaceC5175c interfaceC5175c;
        C0076c c0076c = f51523N;
        c0076c.m457a("Started at " + C5206f.m11023t1(this.f51525I.f46127a) + " seconds");
        C5797e c5797eM12186l = ((C5793a) this.f51524H).m12186l();
        synchronized (c5797eM12186l) {
            c10487eMo19451a = c5797eM12186l.f35036i.mo19451a();
        }
        if (c10487eMo19451a.m19471w(this.f51529M, this.f51528L)) {
            c0076c.m459c("Identity link already exists, ignoring");
            return;
        }
        c10487eMo19451a.m19450D(this.f51528L, this.f51529M);
        C5797e c5797eM12186l2 = ((C5793a) this.f51524H).m12186l();
        synchronized (c5797eM12186l2) {
            c5797eM12186l2.f35036i = c10487eMo19451a;
            ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) c5797eM12186l2.f40719a)).m12486i(c10487eMo19451a, "install.identity_link");
        }
        C8783d c8783dM17071d = ((C8785f) this.f51527K).m17071d();
        synchronized (c8783dM17071d) {
            c8783dM17071d.f46565j = c10487eMo19451a;
        }
        InterfaceC8786g interfaceC8786g = this.f51527K;
        String str = this.f51528L;
        C8785f c8785f = (C8785f) interfaceC8786g;
        synchronized (c8785f) {
            z10 = !c8785f.f46584j.contains(str);
        }
        if (!z10) {
            c0076c.m459c("Identity link is denied. dropping with name " + this.f51528L);
            return;
        }
        C5797e c5797eM12186l3 = ((C5793a) this.f51524H).m12186l();
        synchronized (c5797eM12186l3) {
            interfaceC5175c = c5797eM12186l3.f35029b;
        }
        if (interfaceC5175c == null && !((C5793a) this.f51524H).m12186l().m12199h()) {
            C10489a.m19475a(c0076c, "Identity link to be sent within install");
            return;
        }
        C10489a.m19475a(c0076c, "Identity link to be sent as stand alone");
        PayloadType payloadType = PayloadType.IdentityLink;
        long j10 = this.f51525I.f46127a;
        long jM12211j = ((C5793a) this.f51524H).m12187m().m12211j();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jM12960f = ((C6330c) this.f51526J).m12960f();
        boolean zM12961g = ((C6330c) this.f51526J).m12961g();
        int iM12959e = ((C6330c) this.f51526J).m12959e();
        C10487e c10487eM19445u = C10487e.m19445u();
        C10487e c10487eM19445u2 = C10487e.m19445u();
        c10487eM19445u2.m19450D(this.f51528L, this.f51529M);
        c10487eM19445u.m19448B(c10487eM19445u2, "identity_link");
        C5174b c5174bM10953d = C5174b.m10953d(payloadType, j10, jM12211j, jCurrentTimeMillis, jM12960f, zM12961g, iM12959e, c10487eM19445u);
        c5174bM10953d.m10955f(this.f51525I.f46128b, this.f51527K);
        ((C5793a) this.f51524H).m12184j().m10962b(c5174bM10953d);
    }

    @Override // p509yf.AbstractC10357a
    /* JADX INFO: renamed from: s */
    public final long mo463s() {
        return 0L;
    }

    @Override // p509yf.AbstractC10357a
    /* JADX INFO: renamed from: u */
    public final boolean mo464u() {
        return true;
    }
}
