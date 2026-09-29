package p510yg;

import ag.C0075b;
import ag.C0076c;
import com.kochava.core.task.action.internal.TaskFailedException;
import com.kochava.core.task.internal.TaskQueue;
import com.kochava.tracker.BuildConfig;
import com.kochava.tracker.installreferrer.internal.InstallReferrerStatus;
import dm.C5206f;
import dm.C5212l;
import gh.C5793a;
import gh.C5797e;
import gh.InterfaceC5794b;
import p003a2.C0009a;
import p341qg.C8620f;
import p341qg.C8624j;
import p459wg.C9924h;
import p509yf.AbstractC10357a;
import p509yf.InterfaceC10359c;
import p535zg.C10489a;

/* JADX INFO: renamed from: yg.d */
/* JADX INFO: loaded from: classes.dex */
public final class C10363d extends AbstractC10357a implements InterfaceC10362c {

    /* JADX INFO: renamed from: J */
    public static final C0076c f52115J;

    /* JADX INFO: renamed from: H */
    public final InterfaceC5794b f52116H;

    /* JADX INFO: renamed from: I */
    public final C8620f f52117I;

    static {
        C0075b c0075bM19476b = C10489a.m19476b();
        f52115J = C0009a.m17e(c0075bM19476b, c0075bM19476b, BuildConfig.SDK_MODULE_NAME, "JobInstallReferrer");
    }

    public C10363d(InterfaceC10359c interfaceC10359c, C5793a c5793a, C8620f c8620f) {
        super("JobInstallReferrer", c8620f.f46132f, TaskQueue.IO, interfaceC10359c);
        this.f52116H = c5793a;
        this.f52117I = c8620f;
    }

    @Override // p510yg.InterfaceC10362c
    /* JADX INFO: renamed from: f */
    public final void mo19386f(C10360a c10360a) {
        C9924h c9924h = ((C5793a) this.f52116H).m12185k().m12196g().f50563g;
        if (!m19381v()) {
            m19375m(true);
            return;
        }
        InstallReferrerStatus installReferrerStatus = c10360a.f52087c;
        boolean z10 = false;
        if (!(installReferrerStatus == InstallReferrerStatus.Ok)) {
            if (installReferrerStatus != InstallReferrerStatus.FeatureNotSupported && installReferrerStatus != InstallReferrerStatus.MissingDependency) {
                z10 = true;
            }
            if (z10 && this.f52077i < c9924h.f50590b + 1) {
                f52115J.m459c("Gather failed, retrying in " + C5206f.m11011j1(C5206f.m11017p1(c9924h.f50591c)) + " seconds");
                m19378q(C5206f.m11017p1(c9924h.f50591c));
                return;
            }
        }
        ((C5793a) this.f52116H).m12186l().m12202k(c10360a);
        m19375m(true);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p509yf.AbstractC10357a
    /* JADX INFO: renamed from: o */
    public final void mo462o() throws TaskFailedException {
        C0076c c0076c = f52115J;
        c0076c.m457a("Started at " + C5206f.m11023t1(this.f52117I.f46127a) + " seconds");
        if (!C5212l.m11150W("com.android.installreferrer.api.InstallReferrerClient")) {
            c0076c.m459c("Google Install Referrer library is missing from the app, skipping collection");
            ((C5793a) this.f52116H).m12186l().m12202k(new C10360a(1, 0.0d, InstallReferrerStatus.MissingDependency, null, null, null, null, null, null, null));
            return;
        }
        C9924h c9924h = ((C5793a) this.f52116H).m12185k().m12196g().f50563g;
        C8620f c8620f = this.f52117I;
        C10361b c10361b = new C10361b(c8620f.f46128b, c8620f.f46132f, this, this.f52077i, this.f52075g, C5206f.m11017p1(c9924h.f50592d));
        m19380t();
        synchronized (c10361b) {
            c10361b.f52106f.m13294f(0L);
            c10361b.f52107g.m13294f(c10361b.f52105e);
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
        C10360a c10360a;
        C9924h c9924h = ((C5793a) this.f52116H).m12185k().m12196g().f50563g;
        synchronized (((C8624j) this.f52117I.f46137k)) {
        }
        if (((C8624j) this.f52117I.f46137k).m16847b() || !c9924h.f50589a) {
            return false;
        }
        C5797e c5797eM12186l = ((C5793a) this.f52116H).m12186l();
        synchronized (c5797eM12186l) {
            try {
                c10360a = c5797eM12186l.f35039l;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (c10360a != null) {
            if (c10360a.f52087c != InstallReferrerStatus.NotGathered) {
                return false;
            }
        }
        return true;
    }
}
