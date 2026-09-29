package p075dh;

import ag.C0075b;
import ag.C0076c;
import android.content.Context;
import com.kochava.core.storage.queue.internal.StorageQueueChangedAction;
import com.kochava.core.task.action.internal.TaskFailedException;
import com.kochava.core.task.internal.TaskQueue;
import com.kochava.tracker.BuildConfig;
import dm.C5206f;
import gg.C5791a;
import gg.C5792b;
import gh.C5793a;
import gh.C5797e;
import gh.InterfaceC5794b;
import p003a2.C0009a;
import p074dg.C5170b;
import p179ig.C6326a;
import p180ih.C6330c;
import p180ih.InterfaceC6331d;
import p341qg.C8620f;
import p341qg.C8624j;
import p366rg.C8785f;
import p366rg.InterfaceC8786g;
import p509yf.AbstractC10357a;
import p509yf.InterfaceC10359c;
import p534zf.C10487e;
import p535zg.C10489a;

/* JADX INFO: renamed from: dh.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5173a extends AbstractC10357a {

    /* JADX INFO: renamed from: M */
    public static final C0076c f33180M;

    /* JADX INFO: renamed from: H */
    public final InterfaceC5794b f33181H;

    /* JADX INFO: renamed from: I */
    public final C8620f f33182I;

    /* JADX INFO: renamed from: J */
    public final InterfaceC8786g f33183J;

    /* JADX INFO: renamed from: K */
    public final InterfaceC6331d f33184K;

    /* JADX INFO: renamed from: L */
    public final C5791a f33185L;

    static {
        C0075b c0075bM19476b = C10489a.m19476b();
        f33180M = C0009a.m17e(c0075bM19476b, c0075bM19476b, BuildConfig.SDK_MODULE_NAME, "JobPayloadQueue");
    }

    public C5173a(InterfaceC10359c interfaceC10359c, C5793a c5793a, C8620f c8620f, C8785f c8785f, C6330c c6330c, C5791a c5791a) {
        super("JobPayloadQueue", c8620f.f46132f, TaskQueue.IO, interfaceC10359c);
        this.f33181H = c5793a;
        this.f33182I = c8620f;
        this.f33183J = c8785f;
        this.f33184K = c6330c;
        this.f33185L = c5791a;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0184 */
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    @Override // p509yf.AbstractC10357a
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo462o() throws TaskFailedException {
        long j10;
        long j11;
        long j12;
        String str = "Started at " + C5206f.m11023t1(this.f33182I.f46127a) + " seconds";
        C0076c c0076c = f33180M;
        c0076c.m457a(str);
        while (mo464u()) {
            m19373k();
            C5793a c5793a = (C5793a) this.f33181H;
            C5797e c5797eM12186l = c5793a.m12186l();
            synchronized (c5797eM12186l) {
                j10 = c5797eM12186l.f35031d;
            }
            if (m10948x("Install", j10)) {
                return;
            }
            if (c5793a.m12181g().m10964d() > 0) {
                c0076c.m459c("Transmitting clicks");
                if (m10949y(c5793a.m12181g())) {
                    return;
                }
                if (!mo464u()) {
                    return;
                }
            }
            C5177e c5177eM12181g = c5793a.m12181g();
            synchronized (c5177eM12181g) {
                C6326a c6326a = c5177eM12181g.f33205a;
                synchronized (c6326a) {
                    try {
                        j11 = c6326a.f36555a.getLong("last_remove_time_millis", 0L);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            if (m10948x("Click", j11)) {
                return;
            }
            if (c5793a.m12192r().m10964d() > 0) {
                c0076c.m459c("Transmitting updates");
                if (m10949y(c5793a.m12192r()) || !mo464u()) {
                    return;
                }
            }
            if (c5793a.m12184j().m10964d() > 0) {
                c0076c.m459c("Transmitting identity links");
                if (m10949y(c5793a.m12184j())) {
                    return;
                }
                if (!mo464u()) {
                    return;
                }
            }
            C5177e c5177eM12184j = c5793a.m12184j();
            synchronized (c5177eM12184j) {
                try {
                    C6326a c6326a2 = c5177eM12184j.f33205a;
                    synchronized (c6326a2) {
                        try {
                            j12 = c6326a2.f36555a.getLong("last_remove_time_millis", 0L);
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            if (m10948x("IdentityLink", j12)) {
                return;
            }
            if (c5793a.m12191q().m10964d() > 0) {
                c0076c.m459c("Transmitting tokens");
                if (m10949y(c5793a.m12191q())) {
                    return;
                }
                if (!mo464u()) {
                    return;
                }
            }
            if (c5793a.m12190p().m10964d() > 0) {
                c0076c.m459c("Transmitting sessions");
                if (m10949y(c5793a.m12190p()) || !mo464u()) {
                    return;
                }
            }
            if (c5793a.m12183i().m10964d() > 0) {
                c0076c.m459c("Transmitting events");
                if (m10949y(c5793a.m12183i()) || !mo464u()) {
                    return;
                }
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
        boolean zM12199h = ((C5793a) this.f33181H).m12186l().m12199h();
        synchronized (((C8624j) this.f33182I.f46137k)) {
        }
        boolean zM16847b = ((C8624j) this.f33182I.f46137k).m16847b();
        boolean z10 = ((C5793a) this.f33181H).m12181g().m10964d() > 0;
        boolean z11 = ((C5793a) this.f33181H).m12192r().m10964d() > 0;
        boolean z12 = ((C5793a) this.f33181H).m12184j().m10964d() > 0;
        boolean z13 = ((C5793a) this.f33181H).m12191q().m10964d() > 0;
        boolean z14 = ((C5793a) this.f33181H).m12190p().m10964d() > 0;
        boolean z15 = ((C5793a) this.f33181H).m12183i().m10964d() > 0;
        if (zM16847b || !zM12199h) {
            return false;
        }
        if (!z10 && !z11 && !z12 && !z13 && !z14 && !z15) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: w */
    public final void m10947w(C5177e c5177e) {
        synchronized (c5177e) {
            try {
                C6326a c6326a = c5177e.f33205a;
                synchronized (c6326a) {
                    try {
                        c6326a.m12952d();
                        c6326a.m12949a(StorageQueueChangedAction.Remove);
                    } finally {
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this) {
            this.f52077i = 1;
        }
    }

    /* JADX INFO: renamed from: x */
    public final boolean m10948x(String str, long j10) {
        boolean z10;
        C6330c c6330c = (C6330c) this.f33184K;
        synchronized (c6330c) {
            try {
                z10 = c6330c.f36571f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jM11017p1 = C5206f.m11017p1(((C5793a) this.f33181H).m12185k().m12196g().f50565i.f50593a) + j10;
        if (jCurrentTimeMillis >= jM11017p1) {
            return false;
        }
        long j11 = jM11017p1 - jCurrentTimeMillis;
        C0076c c0076c = f33180M;
        StringBuilder sbM26o = C0009a.m26o(str, " Tracking wait, transmitting after ");
        sbM26o.append(C5206f.m11011j1(j11));
        sbM26o.append(" seconds");
        c0076c.m459c(sbM26o.toString());
        m19376n(j11);
        return true;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: y */
    public final boolean m10949y(C5177e c5177e) throws TaskFailedException {
        String string;
        C5174b c5174bM10954e;
        synchronized (c5177e) {
            try {
                C6326a c6326a = c5177e.f33205a;
                synchronized (c6326a) {
                    if (c6326a.m12953e() <= 0) {
                        string = null;
                    } else {
                        string = c6326a.f36555a.getString(Long.toString(c6326a.f36555a.getLong("read_index", 0L)), null);
                    }
                }
                c5174bM10954e = string == null ? null : C5174b.m10954e(C10487e.m19446v(string, true));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (c5174bM10954e == null) {
            f33180M.m459c("failed to retrieve payload from the queue, dropping");
            m10947w(c5177e);
            return false;
        }
        if (((C5793a) this.f33181H).m12185k().m12196g().f50559c.f50579a) {
            f33180M.m459c("SDK disabled, marking payload complete without sending");
            m10947w(c5177e);
            return false;
        }
        c5174bM10954e.m10955f(this.f33182I.f46128b, this.f33183J);
        Context context = this.f33182I.f46128b;
        if (!c5174bM10954e.m10957h(this.f33183J)) {
            f33180M.m459c("payload is disabled, dropping");
            m10947w(c5177e);
            return false;
        }
        C5792b c5792bM12179a = this.f33185L.m12179a();
        if (!c5792bM12179a.f34999a) {
            if (!c5792bM12179a.f35000b) {
                f33180M.m459c("Rate limited, transmitting disabled");
                synchronized (this) {
                    try {
                        this.f52078j = -1L;
                        throw new TaskFailedException("Job failed and will not retry");
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
            f33180M.m459c("Rate limited, transmitting after " + C5206f.m11011j1(c5792bM12179a.f35001c) + " seconds");
            m19376n(c5792bM12179a.f35001c);
            return true;
        }
        C5170b c5170bM10959j = c5174bM10954e.m10959j(this.f33182I.f46128b, this.f52077i, ((C5793a) this.f33181H).m12185k().m12196g().f50565i.m18414a());
        if (c5170bM10959j.f33172b) {
            m10947w(c5177e);
        } else {
            if (c5170bM10959j.f33173c) {
                f33180M.m459c("Transmit failed, retrying after " + C5206f.m11011j1(c5170bM10959j.f33174d) + " seconds");
                synchronized (c5177e) {
                    c5177e.f33205a.m12954f(c5174bM10954e.m10958i().toString());
                }
                m19377p(c5170bM10959j.f33174d);
                throw null;
            }
            f33180M.m459c("Transmit failed, out of attempts after " + this.f52077i + " attempts");
            m10947w(c5177e);
        }
        return false;
    }
}
