package pg;

import ag.C0075b;
import ag.C0076c;
import android.content.Context;
import android.util.Pair;
import androidx.view.C1031f;
import com.kochava.core.task.action.internal.TaskFailedException;
import com.kochava.core.task.internal.TaskQueue;
import com.kochava.tracker.BuildConfig;
import com.kochava.tracker.payload.internal.PayloadType;
import dm.C5206f;
import gh.C5793a;
import gh.C5797e;
import gh.C5798f;
import gh.InterfaceC5794b;
import p003a2.C0009a;
import p074dg.C5170b;
import p075dh.C5174b;
import p180ih.C6330c;
import p180ih.InterfaceC6331d;
import p243lg.C7360b;
import p243lg.RunnableC7359a;
import p300og.InterfaceC8041a;
import p341qg.C8618d;
import p341qg.C8620f;
import p341qg.C8624j;
import p349qo.C8656b;
import p366rg.C8785f;
import p366rg.InterfaceC8786g;
import p509yf.AbstractC10357a;
import p534zf.C10485c;
import p534zf.C10487e;
import p534zf.InterfaceC10488f;
import p535zg.C10489a;

/* JADX INFO: renamed from: pg.c */
/* JADX INFO: loaded from: classes.dex */
public final class C8248c extends AbstractC10357a {

    /* JADX INFO: renamed from: M */
    public static final C0076c f44537M;

    /* JADX INFO: renamed from: H */
    public final InterfaceC5794b f44538H;

    /* JADX INFO: renamed from: I */
    public final C8620f f44539I;

    /* JADX INFO: renamed from: J */
    public final InterfaceC6331d f44540J;

    /* JADX INFO: renamed from: K */
    public final InterfaceC8786g f44541K;

    /* JADX INFO: renamed from: L */
    public final InterfaceC8041a f44542L;

    static {
        C0075b c0075bM19476b = C10489a.m19476b();
        f44537M = C0009a.m17e(c0075bM19476b, c0075bM19476b, BuildConfig.SDK_MODULE_NAME, "JobRetrieveInstallAttribution");
    }

    public C8248c(C8618d c8618d, C5793a c5793a, C8620f c8620f, C8785f c8785f, C6330c c6330c, InterfaceC8041a interfaceC8041a) {
        super("JobRetrieveInstallAttribution", c8620f.f46132f, TaskQueue.Worker, c8618d);
        this.f44538H = c5793a;
        this.f44539I = c8620f;
        this.f44541K = c8785f;
        this.f44540J = c6330c;
        this.f44542L = interfaceC8041a;
    }

    @Override // p509yf.AbstractC10357a
    /* JADX INFO: renamed from: o */
    public final void mo462o() throws TaskFailedException {
        C8246a c8246a;
        Pair pairCreate;
        String str;
        C0076c c0076c = f44537M;
        C10489a.m19475a(c0076c, "Sending get_attribution at " + C5206f.m11023t1(this.f44539I.f46127a) + " seconds");
        c0076c.m457a("Started at " + C5206f.m11023t1(this.f44539I.f46127a) + " seconds");
        C5797e c5797eM12186l = ((C5793a) this.f44538H).m12186l();
        synchronized (c5797eM12186l) {
            c8246a = c5797eM12186l.f35038k;
        }
        if (c8246a.f44533b > 0) {
            c0076c.m459c("Attribution results already retrieved, returning the cached value");
            m16397w(c8246a.m16395b(), 0L);
            return;
        }
        C5174b c5174bM10952c = C5174b.m10952c(PayloadType.GetAttribution, this.f44539I.f46127a, ((C5793a) this.f44538H).m12187m().m12211j(), System.currentTimeMillis(), ((C6330c) this.f44540J).m12960f(), ((C6330c) this.f44540J).m12961g(), ((C6330c) this.f44540J).m12959e());
        c5174bM10952c.m10955f(this.f44539I.f46128b, this.f44541K);
        if (((C5793a) this.f44538H).m12185k().m12196g().f50559c.f50579a) {
            c0076c.m459c("SDK disabled, aborting");
            pairCreate = Pair.create(0L, C10487e.m19445u());
        } else {
            Context context = this.f44539I.f46128b;
            if (c5174bM10952c.m10957h(this.f44541K)) {
                C5170b c5170bM10959j = c5174bM10952c.m10959j(this.f44539I.f46128b, this.f52077i, ((C5793a) this.f44538H).m12185k().m12196g().f50565i.m18414a());
                m19373k();
                if (!c5170bM10959j.f33172b) {
                    long j10 = c5170bM10959j.f33174d;
                    c0076c.m457a("Transmit failed, retrying after " + C5206f.m11011j1(j10) + " seconds");
                    C10489a.m19475a(c0076c, "Attribution results not ready, retrying in " + C5206f.m11011j1(j10) + " seconds");
                    m19377p(j10);
                    throw null;
                }
                Long lValueOf = Long.valueOf(c5170bM10959j.f33171a);
                if (!c5170bM10959j.f33172b) {
                    throw new IllegalStateException("Data not accessible on failure.");
                }
                pairCreate = Pair.create(lValueOf, ((C10485c) c5170bM10959j.f33176f).m19443a());
            } else {
                c0076c.m459c("Payload disabled, aborting");
                pairCreate = Pair.create(0L, C10487e.m19445u());
            }
        }
        String strM12210i = ((C5793a) this.f44538H).m12187m().m12210i();
        C5798f c5798fM12187m = ((C5793a) this.f44538H).m12187m();
        synchronized (c5798fM12187m) {
            str = c5798fM12187m.f35049g;
        }
        String strM16913u = C8656b.m16913u(strM12210i, str, new String[0]);
        InterfaceC10488f interfaceC10488fMo19454d = ((InterfaceC10488f) pairCreate.second).mo19454d("data", true);
        InterfaceC10488f interfaceC10488fMo19454d2 = interfaceC10488fMo19454d.mo19454d("attribution", true);
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        String strMo19467q = interfaceC10488fMo19454d.mo19467q("kochava_device_id", "");
        C8246a c8246a2 = new C8246a(interfaceC10488fMo19454d2, jCurrentTimeMillis, strMo19467q, !strMo19467q.isEmpty() && strM16913u.equals(strMo19467q));
        ((C5793a) this.f44538H).m12186l().m12200i(c8246a2);
        m16397w(c8246a2.m16395b(), ((Long) pairCreate.first).longValue());
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p509yf.AbstractC10357a
    /* JADX INFO: renamed from: s */
    public final long mo463s() {
        long j10;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C5793a c5793a = (C5793a) this.f44538H;
        C5797e c5797eM12186l = c5793a.m12186l();
        synchronized (c5797eM12186l) {
            try {
                j10 = c5797eM12186l.f35031d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        long jM11017p1 = C5206f.m11017p1(c5793a.m12185k().m12196g().f50557a.f50571b) + j10;
        long j11 = jM11017p1 >= jCurrentTimeMillis ? jM11017p1 - jCurrentTimeMillis : 0L;
        C10489a.m19475a(f44537M, "Requesting attribution results in " + C5206f.m11011j1(j11) + " seconds");
        return j11;
    }

    @Override // p509yf.AbstractC10357a
    /* JADX INFO: renamed from: u */
    public final boolean mo464u() {
        synchronized (((C8624j) this.f44539I.f46137k)) {
        }
        return !((C8624j) this.f44539I.f46137k).m16847b() && ((C5793a) this.f44538H).m12186l().m12199h();
    }

    /* JADX INFO: renamed from: w */
    public final void m16397w(C1031f c1031f, long j10) {
        String strM23l = C0009a.m23l(new StringBuilder("Attribution response indicates this install "), c1031f.f6644b ? "was" : "was not", " attributed");
        C0076c c0076c = f44537M;
        C10489a.m19475a(c0076c, strM23l);
        C10489a.m19475a(c0076c, "Attribution response indicates this was a ".concat(c1031f.f6645c ? "new install" : "reinstall"));
        StringBuilder sb2 = new StringBuilder("Completed get_attribution at ");
        C8620f c8620f = this.f44539I;
        sb2.append(C5206f.m11023t1(c8620f.f46127a));
        sb2.append(" seconds with a network duration of ");
        sb2.append(C5206f.m11011j1(j10));
        sb2.append(" seconds");
        C10489a.m19475a(c0076c, sb2.toString());
        RunnableC8247b runnableC8247b = new RunnableC8247b(this, c1031f);
        C7360b c7360b = (C7360b) c8620f.f46132f;
        c7360b.f41121b.f41127a.post(new RunnableC7359a(c7360b, runnableC8247b));
    }
}
