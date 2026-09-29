package ug;

import ag.C0075b;
import ag.C0076c;
import com.kochava.core.task.action.internal.TaskFailedException;
import com.kochava.core.task.internal.TaskQueue;
import com.kochava.tracker.BuildConfig;
import com.kochava.tracker.huaweireferrer.internal.HuaweiReferrerStatus;
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

/* JADX INFO: renamed from: ug.d */
/* JADX INFO: loaded from: classes.dex */
public final class C9526d extends AbstractC10357a implements InterfaceC9525c {

    /* JADX INFO: renamed from: J */
    public static final C0076c f49058J;

    /* JADX INFO: renamed from: H */
    public final InterfaceC5794b f49059H;

    /* JADX INFO: renamed from: I */
    public final C8620f f49060I;

    static {
        C0075b c0075bM19476b = C10489a.m19476b();
        f49058J = C0009a.m17e(c0075bM19476b, c0075bM19476b, BuildConfig.SDK_MODULE_NAME, "JobHuaweiReferrer");
    }

    public C9526d(InterfaceC10359c interfaceC10359c, C5793a c5793a, C8620f c8620f) {
        super("JobHuaweiReferrer", c8620f.f46132f, TaskQueue.IO, interfaceC10359c);
        this.f49059H = c5793a;
        this.f49060I = c8620f;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    @Override // ug.InterfaceC9525c
    /* JADX INFO: renamed from: h */
    public final void mo17988h(C9523a c9523a) {
        C9922f c9922f = ((C5793a) this.f49059H).m12185k().m12196g().f50560d;
        if (!m19381v()) {
            m19375m(true);
            return;
        }
        HuaweiReferrerStatus huaweiReferrerStatus = HuaweiReferrerStatus.Ok;
        HuaweiReferrerStatus huaweiReferrerStatus2 = c9523a.f49039c;
        boolean z10 = false;
        if (!(huaweiReferrerStatus2 == huaweiReferrerStatus || huaweiReferrerStatus2 == HuaweiReferrerStatus.NoData)) {
            if (huaweiReferrerStatus2 != HuaweiReferrerStatus.FeatureNotSupported && huaweiReferrerStatus2 != HuaweiReferrerStatus.MissingDependency) {
                z10 = true;
            }
            if (z10) {
                if (this.f52077i < c9922f.f50584b + 1) {
                    f49058J.m459c("Gather failed, retrying in " + C5206f.m11011j1(C5206f.m11017p1(c9922f.f50585c)) + " seconds");
                    m19378q(C5206f.m11017p1(c9922f.f50585c));
                    return;
                }
            }
        }
        ((C5793a) this.f49059H).m12186l().m12201j(c9523a);
        m19375m(true);
    }

    @Override // p509yf.AbstractC10357a
    /* JADX INFO: renamed from: o */
    public final void mo462o() throws TaskFailedException {
        C0076c c0076c = f49058J;
        c0076c.m457a("Started at " + C5206f.m11023t1(this.f49060I.f46127a) + " seconds");
        if (!C5212l.m11150W("com.huawei.hms.ads.installreferrer.api.InstallReferrerClient")) {
            c0076c.m459c("Huawei Install Referrer library is missing from the app, skipping collection");
            ((C5793a) this.f49059H).m12186l().m12201j(new C9523a(1, 0.0d, HuaweiReferrerStatus.MissingDependency, null, null, null));
            return;
        }
        C9922f c9922f = ((C5793a) this.f49059H).m12185k().m12196g().f50560d;
        C8620f c8620f = this.f49060I;
        C9524b c9524b = new C9524b(c8620f.f46128b, c8620f.f46132f, this, this.f52077i, this.f52075g, C5206f.m11017p1(c9922f.f50586d));
        m19380t();
        synchronized (c9524b) {
            try {
                c9524b.f49050f.m13294f(0L);
                c9524b.f49051g.m13294f(c9524b.f49049e);
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

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p509yf.AbstractC10357a
    /* JADX INFO: renamed from: u */
    public final boolean mo464u() {
        C9523a c9523a;
        C9922f c9922f = ((C5793a) this.f49059H).m12185k().m12196g().f50560d;
        synchronized (((C8624j) this.f49060I.f46137k)) {
        }
        if (((C8624j) this.f49060I.f46137k).m16847b() || !c9922f.f50583a) {
            return false;
        }
        C5797e c5797eM12186l = ((C5793a) this.f49059H).m12186l();
        synchronized (c5797eM12186l) {
            try {
                c9523a = c5797eM12186l.f35040m;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (c9523a != null) {
            if (c9523a.f49039c != HuaweiReferrerStatus.NotGathered) {
                return false;
            }
        }
        return true;
    }
}
