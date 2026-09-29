package bh;

import ag.C0075b;
import ag.C0076c;
import com.kochava.core.task.internal.TaskQueue;
import com.kochava.tracker.BuildConfig;
import com.kochava.tracker.payload.internal.PayloadType;
import dm.C5206f;
import gh.C5793a;
import gh.InterfaceC5794b;
import p003a2.C0009a;
import p075dh.C5174b;
import p075dh.C5177e;
import p179ig.C6326a;
import p180ih.C6330c;
import p180ih.InterfaceC6331d;
import p341qg.C8618d;
import p341qg.C8620f;
import p366rg.C8785f;
import p366rg.InterfaceC8786g;
import p509yf.AbstractC10357a;
import p534zf.InterfaceC10488f;
import p535zg.C10489a;

/* JADX INFO: renamed from: bh.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1387c extends AbstractC10357a {

    /* JADX INFO: renamed from: N */
    public static final C0076c f8300N;

    /* JADX INFO: renamed from: H */
    public final InterfaceC5794b f8301H;

    /* JADX INFO: renamed from: I */
    public final C8620f f8302I;

    /* JADX INFO: renamed from: J */
    public final InterfaceC6331d f8303J;

    /* JADX INFO: renamed from: K */
    public final InterfaceC8786g f8304K;

    /* JADX INFO: renamed from: L */
    public final InterfaceC10488f f8305L;

    /* JADX INFO: renamed from: M */
    public final long f8306M;

    static {
        C0075b c0075bM19476b = C10489a.m19476b();
        f8300N = C0009a.m17e(c0075bM19476b, c0075bM19476b, BuildConfig.SDK_MODULE_NAME, "JobEvent");
    }

    public C1387c(C8618d c8618d, C5793a c5793a, C8620f c8620f, C8785f c8785f, C6330c c6330c, InterfaceC10488f interfaceC10488f) {
        super("JobEvent", c8620f.f46132f, TaskQueue.Worker, c8618d);
        this.f8301H = c5793a;
        this.f8302I = c8620f;
        this.f8303J = c6330c;
        this.f8304K = c8785f;
        this.f8305L = interfaceC10488f;
        this.f8306M = System.currentTimeMillis();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p509yf.AbstractC10357a
    /* JADX INFO: renamed from: o */
    public final void mo462o() {
        boolean z10;
        boolean z11;
        C0076c c0076c = f8300N;
        c0076c.m457a("Started at " + C5206f.m11023t1(this.f8302I.f46127a) + " seconds");
        C5177e c5177eM12183i = ((C5793a) this.f8301H).m12183i();
        synchronized (c5177eM12183i) {
            try {
                C6326a c6326a = c5177eM12183i.f33205a;
                synchronized (c6326a) {
                    try {
                        z10 = false;
                        if (c6326a.f36557c > 0) {
                            z10 = c6326a.m12953e() >= c6326a.f36557c;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (z10) {
            c0076c.m459c("Event queue is full. dropping incoming event");
            return;
        }
        String strMo19467q = this.f8305L.mo19467q("event_name", "");
        C8785f c8785f = (C8785f) this.f8304K;
        synchronized (c8785f) {
            z11 = !c8785f.f46583i.contains(strMo19467q);
        }
        if (z11) {
            C5174b c5174bM10953d = C5174b.m10953d(PayloadType.Event, this.f8302I.f46127a, ((C5793a) this.f8301H).m12187m().m12211j(), this.f8306M, ((C6330c) this.f8303J).m12960f(), ((C6330c) this.f8303J).m12961g(), ((C6330c) this.f8303J).m12959e(), this.f8305L);
            c5174bM10953d.m10955f(this.f8302I.f46128b, this.f8304K);
            ((C5793a) this.f8301H).m12183i().m10962b(c5174bM10953d);
        } else {
            c0076c.m459c("Event name is denied, dropping incoming event with name " + strMo19467q);
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
        return true;
    }
}
