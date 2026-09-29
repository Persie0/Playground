package p485xg;

import ag.C0075b;
import ag.C0076c;
import android.content.Context;
import com.kochava.core.storage.queue.internal.StorageQueueChangedAction;
import com.kochava.core.task.action.internal.TaskFailedException;
import com.kochava.core.task.internal.TaskQueue;
import com.kochava.tracker.BuildConfig;
import com.kochava.tracker.payload.internal.PayloadType;
import dm.C5206f;
import gg.C5791a;
import gg.C5792b;
import gh.C5793a;
import gh.C5797e;
import gh.C5798f;
import gh.InterfaceC5794b;
import java.util.concurrent.TimeUnit;
import p003a2.C0009a;
import p074dg.C5170b;
import p075dh.C5174b;
import p075dh.C5177e;
import p157hg.InterfaceC6044b;
import p157hg.SharedPreferencesOnSharedPreferenceChangeListenerC6043a;
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

/* JADX INFO: renamed from: xg.a */
/* JADX INFO: loaded from: classes.dex */
public final class C10185a extends AbstractC10357a {

    /* JADX INFO: renamed from: N */
    public static final C0076c f51516N;

    /* JADX INFO: renamed from: H */
    public final InterfaceC5794b f51517H;

    /* JADX INFO: renamed from: I */
    public final C8620f f51518I;

    /* JADX INFO: renamed from: J */
    public final InterfaceC6331d f51519J;

    /* JADX INFO: renamed from: K */
    public final InterfaceC8786g f51520K;

    /* JADX INFO: renamed from: L */
    public final C5791a f51521L;

    /* JADX INFO: renamed from: M */
    public long f51522M;

    static {
        C0075b c0075bM19476b = C10489a.m19476b();
        f51516N = C0009a.m17e(c0075bM19476b, c0075bM19476b, BuildConfig.SDK_MODULE_NAME, "JobInstall");
    }

    public C10185a(InterfaceC10359c interfaceC10359c, C5793a c5793a, C8620f c8620f, C8785f c8785f, C6330c c6330c, C5791a c5791a) {
        super("JobInstall", c8620f.f46132f, TaskQueue.IO, interfaceC10359c);
        this.f51522M = 0L;
        this.f51517H = c5793a;
        this.f51518I = c8620f;
        this.f51520K = c8785f;
        this.f51519J = c6330c;
        this.f51521L = c5791a;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0080 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x010e A[PHI: r12
      0x010e: PHI (r12v2 long) = (r12v1 long), (r12v4 long) binds: [B:42:0x00fe, B:45:0x010c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p509yf.AbstractC10357a
    /* JADX INFO: renamed from: o */
    public final void mo462o() throws TaskFailedException {
        Object objM10952c;
        long j10;
        long j11;
        long j12;
        long j13;
        boolean z10;
        boolean z11;
        long j14 = 0;
        if (this.f51518I.m16845a()) {
            C8620f c8620f = this.f51518I;
            if (c8620f.f46135i) {
                C8624j c8624j = (C8624j) c8620f.f46137k;
                synchronized (c8624j) {
                    z10 = true;
                    z11 = c8624j.f46154l.getCount() == 0;
                }
                if (z11) {
                    this.f51522M = 0L;
                } else {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long jM11017p1 = C5206f.m11017p1(((C5793a) this.f51517H).m12185k().m12196g().f50564h.f50571b);
                    if (jM11017p1 > 0) {
                        long j15 = this.f51522M;
                        if (j15 <= 0 || j15 + jM11017p1 > jCurrentTimeMillis) {
                            if (j15 <= 0) {
                                this.f51522M = jCurrentTimeMillis;
                                f51516N.m459c("Waiting for a deeplink for up to " + C5206f.m11011j1(jM11017p1) + " seconds");
                            }
                            m19376n(200L);
                        }
                        if (z10) {
                            return;
                        }
                    }
                    this.f51522M = 0L;
                }
                z10 = false;
                if (z10) {
                    return;
                }
            }
        }
        C0076c c0076c = f51516N;
        C10489a.m19475a(c0076c, "Sending install at " + C5206f.m11023t1(this.f51518I.f46127a) + " seconds");
        c0076c.m457a("Started at " + C5206f.m11023t1(this.f51518I.f46127a) + " seconds");
        C5797e c5797eM12186l = ((C5793a) this.f51517H).m12186l();
        synchronized (c5797eM12186l) {
            objM10952c = c5797eM12186l.f35029b;
        }
        if (objM10952c == null) {
            PayloadType payloadType = PayloadType.Install;
            long j16 = this.f51518I.f46127a;
            long jM12211j = ((C5793a) this.f51517H).m12187m().m12211j();
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            C5798f c5798fM12187m = ((C5793a) this.f51517H).m12187m();
            synchronized (c5798fM12187m) {
                j12 = c5798fM12187m.f35045c;
            }
            TimeUnit timeUnit = TimeUnit.DAYS;
            if (jCurrentTimeMillis2 < timeUnit.toMillis(30L) + j12) {
                j13 = j12;
            } else {
                j12 = this.f51518I.f46127a;
                if (jCurrentTimeMillis2 < timeUnit.toMillis(30L) + j12) {
                    j13 = j12;
                } else {
                    j13 = jCurrentTimeMillis2;
                }
            }
            objM10952c = C5174b.m10952c(payloadType, j16, jM12211j, j13, ((C6330c) this.f51519J).m12960f(), ((C6330c) this.f51519J).m12961g(), ((C6330c) this.f51519J).m12959e());
        }
        C5174b c5174b = (C5174b) objM10952c;
        c5174b.m10955f(this.f51518I.f46128b, this.f51520K);
        ((C5793a) this.f51517H).m12186l().m12204m(c5174b);
        C5792b c5792bM12179a = this.f51521L.m12179a();
        if (!c5792bM12179a.f34999a) {
            if (!c5792bM12179a.f35000b) {
                c0076c.m459c("Rate limited, transmitting disabled");
                synchronized (this) {
                    this.f52078j = -1L;
                    throw new TaskFailedException("Job failed and will not retry");
                }
            }
            c0076c.m459c("Rate limited, transmitting after " + C5206f.m11011j1(c5792bM12179a.f35001c) + " seconds");
            m19376n(c5792bM12179a.f35001c);
            return;
        }
        if (((C5793a) this.f51517H).m12185k().m12196g().f50559c.f50579a) {
            c0076c.m459c("SDK disabled, aborting");
        } else {
            Context context = this.f51518I.f46128b;
            if (c5174b.m10957h(this.f51520K)) {
                C5170b c5170bM10959j = c5174b.m10959j(this.f51518I.f46128b, this.f52077i, ((C5793a) this.f51517H).m12185k().m12196g().f50565i.m18414a());
                m19373k();
                if (!c5170bM10959j.f33172b) {
                    c0076c.m459c("Transmit failed, retrying after " + C5206f.m11011j1(c5170bM10959j.f33174d) + " seconds");
                    m19377p(c5170bM10959j.f33174d);
                    throw null;
                }
                j14 = c5170bM10959j.f33171a;
            } else {
                c0076c.m459c("Payload disabled, aborting");
            }
        }
        if (this.f51518I.m16845a() && this.f51518I.f46135i && ((C5793a) this.f51517H).m12185k().m12196g().f50564h.f50572c && ((C5793a) this.f51517H).m12181g().m10964d() > 0) {
            c0076c.m459c("Removing manufactured clicks from an instant app");
            C5177e c5177eM12181g = ((C5793a) this.f51517H).m12181g();
            synchronized (c5177eM12181g) {
                C6326a c6326a = c5177eM12181g.f33205a;
                synchronized (c6326a) {
                    while (c6326a.m12953e() > 0 && c6326a.m12952d()) {
                    }
                    c6326a.m12949a(StorageQueueChangedAction.RemoveAll);
                }
            }
        }
        ((C5793a) this.f51517H).m12186l().m12206o(System.currentTimeMillis());
        C5797e c5797eM12186l2 = ((C5793a) this.f51517H).m12186l();
        C5797e c5797eM12186l3 = ((C5793a) this.f51517H).m12186l();
        synchronized (c5797eM12186l3) {
            j10 = c5797eM12186l3.f35032e;
        }
        long j17 = j10 + 1;
        synchronized (c5797eM12186l2) {
            c5797eM12186l2.f35032e = j17;
            ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) c5797eM12186l2.f40719a)).m12487j("install.sent_count", j17);
        }
        C5797e c5797eM12186l4 = ((C5793a) this.f51517H).m12186l();
        C5797e c5797eM12186l5 = ((C5793a) this.f51517H).m12186l();
        synchronized (c5797eM12186l5) {
            j11 = c5797eM12186l5.f35032e;
        }
        boolean z12 = ((C5793a) this.f51517H).m12185k().m12196g().f50559c.f50579a;
        C10487e c10487eMo19451a = c5174b.f33188b.mo19451a();
        String strMo19467q = c10487eMo19451a.mo19467q("kochava_device_id", null);
        String strMo19467q2 = c10487eMo19451a.mo19467q("kochava_app_id", null);
        String strMo19467q3 = c10487eMo19451a.mo19467q("sdk_version", null);
        C10487e c10487eMo19451a2 = c5174b.f33189c.mo19451a();
        c5797eM12186l4.m12203l(new C10188d(strMo19467q, strMo19467q2, strMo19467q3, c10487eMo19451a2.mo19467q("app_version", null), c10487eMo19451a2.mo19467q("os_version", null), Long.valueOf(System.currentTimeMillis() / 1000), z12 ? Boolean.TRUE : null, j11));
        ((C5793a) this.f51517H).m12186l().m12204m(null);
        C10489a.m19475a(c0076c, "Completed install at " + C5206f.m11023t1(this.f51518I.f46127a) + " seconds with a network duration of " + C5206f.m11011j1(j14) + " seconds");
    }

    @Override // p509yf.AbstractC10357a
    /* JADX INFO: renamed from: s */
    public final long mo463s() {
        return 0L;
    }

    @Override // p509yf.AbstractC10357a
    /* JADX INFO: renamed from: u */
    public final boolean mo464u() {
        synchronized (((C8624j) this.f51518I.f46137k)) {
        }
        if (((C8624j) this.f51518I.f46137k).m16847b()) {
            return false;
        }
        return !((C5793a) this.f51517H).m12186l().m12199h();
    }
}
