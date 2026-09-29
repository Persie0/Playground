package p158hh;

import ag.C0075b;
import ag.C0076c;
import com.kochava.core.task.action.internal.TaskFailedException;
import com.kochava.core.task.internal.TaskQueue;
import com.kochava.tracker.BuildConfig;
import com.kochava.tracker.samsungreferrer.SamsungReferrerStatus;
import dm.C5206f;
import dm.C5212l;
import gh.C5793a;
import gh.C5797e;
import gh.InterfaceC5794b;
import p003a2.C0009a;
import p341qg.C8620f;
import p341qg.C8624j;
import p459wg.C9922f;
import p509yf.AbstractC10357a;
import p509yf.InterfaceC10359c;
import p535zg.C10489a;

/* JADX INFO: renamed from: hh.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6046a extends AbstractC10357a implements InterfaceC6049d {

    /* JADX INFO: renamed from: J */
    public static final C0076c f35696J;

    /* JADX INFO: renamed from: H */
    public final InterfaceC5794b f35697H;

    /* JADX INFO: renamed from: I */
    public final C8620f f35698I;

    static {
        C0075b c0075bM19476b = C10489a.m19476b();
        f35696J = C0009a.m17e(c0075bM19476b, c0075bM19476b, BuildConfig.SDK_MODULE_NAME, "JobSamsungReferrer");
    }

    public C6046a(InterfaceC10359c interfaceC10359c, C5793a c5793a, C8620f c8620f) {
        super("JobSamsungReferrer", c8620f.f46132f, TaskQueue.IO, interfaceC10359c);
        this.f35697H = c5793a;
        this.f35698I = c8620f;
    }

    @Override // p158hh.InterfaceC6049d
    /* JADX INFO: renamed from: d */
    public final void mo12490d(C6047b c6047b) {
        C9922f c9922f = ((C5793a) this.f35697H).m12185k().m12196g().f50569m;
        if (!m19381v()) {
            m19375m(true);
            return;
        }
        SamsungReferrerStatus samsungReferrerStatus = SamsungReferrerStatus.Ok;
        SamsungReferrerStatus samsungReferrerStatus2 = c6047b.f35702d;
        boolean z10 = false;
        if (!(samsungReferrerStatus2 == samsungReferrerStatus || samsungReferrerStatus2 == SamsungReferrerStatus.NoData)) {
            if (samsungReferrerStatus2 != SamsungReferrerStatus.FeatureNotSupported && samsungReferrerStatus2 != SamsungReferrerStatus.MissingDependency) {
                z10 = true;
            }
            if (z10 && this.f52077i < c9922f.f50584b + 1) {
                f35696J.m459c("Gather failed, retrying in " + C5206f.m11011j1(C5206f.m11017p1(c9922f.f50585c)) + " seconds");
                m19378q(C5206f.m11017p1(c9922f.f50585c));
                return;
            }
        }
        ((C5793a) this.f35697H).m12186l().m12205n(c6047b);
        m19375m(true);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p509yf.AbstractC10357a
    /* JADX INFO: renamed from: o */
    public final void mo462o() throws TaskFailedException {
        C0076c c0076c = f35696J;
        c0076c.m457a("Started at " + C5206f.m11023t1(this.f35698I.f46127a) + " seconds");
        if (!C5212l.m11150W("com.samsung.android.sdk.sinstallreferrer.api.InstallReferrerClient")) {
            c0076c.m459c("Samsung Install Referrer library is missing from the app, skipping collection");
            ((C5793a) this.f35697H).m12186l().m12205n(new C6047b(System.currentTimeMillis(), 1, 0.0d, SamsungReferrerStatus.MissingDependency, null, null, null));
            return;
        }
        C9922f c9922f = ((C5793a) this.f35697H).m12185k().m12196g().f50569m;
        C8620f c8620f = this.f35698I;
        C6048c c6048c = new C6048c(c8620f.f46128b, c8620f.f46132f, this, this.f52077i, this.f52075g, C5206f.m11017p1(c9922f.f50586d));
        m19380t();
        synchronized (c6048c) {
            try {
                c6048c.f35713f.m13294f(0L);
                c6048c.f35714g.m13294f(c6048c.f35712e);
            } catch (Throwable th2) {
                throw th2;
            }
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
        C6047b c6047b;
        C9922f c9922f = ((C5793a) this.f35697H).m12185k().m12196g().f50569m;
        synchronized (((C8624j) this.f35698I.f46137k)) {
        }
        if (!((C8624j) this.f35698I.f46137k).m16847b() && c9922f.f50583a) {
            C5797e c5797eM12186l = ((C5793a) this.f35697H).m12186l();
            synchronized (c5797eM12186l) {
                c6047b = c5797eM12186l.f35041n;
            }
            if (c6047b != null) {
                if (c6047b.f35702d != SamsungReferrerStatus.NotGathered) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
