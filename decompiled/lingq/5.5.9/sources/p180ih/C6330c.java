package p180ih;

import ag.C0075b;
import ag.C0076c;
import com.kochava.tracker.BuildConfig;
import com.kochava.tracker.payload.internal.PayloadType;
import dm.C5206f;
import gh.C5793a;
import gh.C5802j;
import gh.InterfaceC5794b;
import java.util.List;
import java.util.concurrent.ExecutorService;
import p003a2.C0009a;
import p075dh.C5174b;
import p075dh.InterfaceC5175c;
import p157hg.InterfaceC6044b;
import p157hg.SharedPreferencesOnSharedPreferenceChangeListenerC6043a;
import p243lg.C7360b;
import p243lg.C7363e;
import p243lg.InterfaceC7361c;
import p243lg.RunnableC7359a;
import p341qg.C8620f;
import p366rg.C8785f;
import p366rg.InterfaceC8786g;
import p535zg.C10489a;
import wf.ComponentCallbacks2C9913a;
import wf.InterfaceC9915c;
import wf.InterfaceC9916d;

/* JADX INFO: renamed from: ih.c */
/* JADX INFO: loaded from: classes.dex */
public final class C6330c implements InterfaceC6331d, InterfaceC9916d {

    /* JADX INFO: renamed from: i */
    public static final C0076c f36565i;

    /* JADX INFO: renamed from: a */
    public final InterfaceC5794b f36566a;

    /* JADX INFO: renamed from: b */
    public final C8620f f36567b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC9915c f36568c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC8786g f36569d;

    /* JADX INFO: renamed from: e */
    public Boolean f36570e = null;

    /* JADX INFO: renamed from: f */
    public boolean f36571f = false;

    /* JADX INFO: renamed from: g */
    public boolean f36572g = false;

    /* JADX INFO: renamed from: h */
    public long f36573h = 0;

    static {
        C0075b c0075bM19476b = C10489a.m19476b();
        f36565i = C0009a.m17e(c0075bM19476b, c0075bM19476b, BuildConfig.SDK_MODULE_NAME, "SessionManager");
    }

    public C6330c(C5793a c5793a, C8620f c8620f, ComponentCallbacks2C9913a componentCallbacks2C9913a, C8785f c8785f) {
        this.f36567b = c8620f;
        this.f36566a = c5793a;
        this.f36568c = componentCallbacks2C9913a;
        this.f36569d = c8785f;
    }

    /* JADX INFO: renamed from: a */
    public final C5174b m12955a(boolean z10, long j10) {
        long j11;
        int i10;
        C8620f c8620f = this.f36567b;
        InterfaceC5794b interfaceC5794b = this.f36566a;
        if (z10) {
            return C5174b.m10952c(PayloadType.SessionBegin, c8620f.f46127a, ((C5793a) interfaceC5794b).m12187m().m12211j(), j10, 0L, true, 1);
        }
        PayloadType payloadType = PayloadType.SessionEnd;
        long j12 = c8620f.f46127a;
        C5793a c5793a = (C5793a) interfaceC5794b;
        long jM12211j = c5793a.m12187m().m12211j();
        C5802j c5802jM12189o = c5793a.m12189o();
        synchronized (c5802jM12189o) {
            j11 = c5802jM12189o.f35069f;
        }
        C5802j c5802jM12189o2 = c5793a.m12189o();
        synchronized (c5802jM12189o2) {
            i10 = c5802jM12189o2.f35070g;
        }
        return C5174b.m10952c(payloadType, j12, jM12211j, j10, j11, true, i10);
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    /* JADX INFO: renamed from: b */
    public final void m12956b() {
        long j10;
        long j11;
        InterfaceC5175c interfaceC5175c;
        int i10;
        boolean z10 = ((C5793a) this.f36566a).m12185k().m12196g().f50568l.f50620a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f36573h = jCurrentTimeMillis;
        C5802j c5802jM12189o = ((C5793a) this.f36566a).m12189o();
        synchronized (c5802jM12189o) {
            try {
                j10 = c5802jM12189o.f35067d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (jCurrentTimeMillis <= C5206f.m11017p1(((C5793a) this.f36566a).m12185k().m12196g().f50568l.f50622c) + j10) {
            f36565i.m459c("Within session window, incrementing active count");
            C5802j c5802jM12189o2 = ((C5793a) this.f36566a).m12189o();
            C5802j c5802jM12189o3 = ((C5793a) this.f36566a).m12189o();
            synchronized (c5802jM12189o3) {
                i10 = c5802jM12189o3.f35070g;
            }
            c5802jM12189o2.m12220h(i10 + 1);
            return;
        }
        C5802j c5802jM12189o4 = ((C5793a) this.f36566a).m12189o();
        synchronized (c5802jM12189o4) {
            try {
                c5802jM12189o4.f35067d = jCurrentTimeMillis;
                ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) c5802jM12189o4.f40719a)).m12487j("session.window_start_time_millis", jCurrentTimeMillis);
            } catch (Throwable th3) {
                throw th3;
            }
        }
        C5802j c5802jM12189o5 = ((C5793a) this.f36566a).m12189o();
        synchronized (c5802jM12189o5) {
            try {
                c5802jM12189o5.f35068e = false;
                ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) c5802jM12189o5.f40719a)).m12484g("session.window_pause_sent", false);
            } catch (Throwable th4) {
                throw th4;
            }
        }
        ((C5793a) this.f36566a).m12189o().m12221i(0L);
        ((C5793a) this.f36566a).m12189o().m12220h(1);
        C5802j c5802jM12189o6 = ((C5793a) this.f36566a).m12189o();
        C5802j c5802jM12189o7 = ((C5793a) this.f36566a).m12189o();
        synchronized (c5802jM12189o7) {
            j11 = c5802jM12189o7.f35066c;
        }
        long j12 = j11 + 1;
        synchronized (c5802jM12189o6) {
            c5802jM12189o6.f35066c = j12;
            ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) c5802jM12189o6.f40719a)).m12487j("window_count", j12);
        }
        synchronized (((C5793a) this.f36566a).m12189o()) {
            C5802j c5802jM12189o8 = ((C5793a) this.f36566a).m12189o();
            synchronized (c5802jM12189o8) {
                try {
                    interfaceC5175c = c5802jM12189o8.f35065b;
                } catch (Throwable th5) {
                    throw th5;
                }
            }
            if (interfaceC5175c != null) {
                f36565i.m459c("Queuing deferred session end to send");
                ((C5793a) this.f36566a).m12190p().m10962b(interfaceC5175c);
                ((C5793a) this.f36566a).m12189o().m12219g(null);
            }
        }
        if (!z10) {
            f36565i.m459c("Sessions disabled, not creating session");
            return;
        }
        f36565i.m459c("Queuing session begin to send");
        C5174b c5174bM12955a = m12955a(true, jCurrentTimeMillis);
        InterfaceC7361c interfaceC7361c = this.f36567b.f46132f;
        RunnableC6329b runnableC6329b = new RunnableC6329b(this, c5174bM12955a);
        C7360b c7360b = (C7360b) interfaceC7361c;
        c7360b.f41121b.getClass();
        ExecutorService executorService = C7363e.f41126e;
        if (executorService == null) {
            throw new RuntimeException("Failed to start threadpool");
        }
        executorService.execute(new RunnableC7359a(c7360b, runnableC6329b));
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:41:0x0110  */
    /* JADX WARN: Code duplicated, block: B:42:0x011a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0126  */
    /* JADX WARN: Code duplicated, block: B:48:0x0131  */
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    /* JADX INFO: renamed from: c */
    public final void m12957c() {
        long j10;
        boolean z10;
        long j11;
        C5802j c5802jM12189o;
        RunnableC6329b runnableC6329b;
        C7360b c7360b;
        ExecutorService executorService;
        long j12;
        boolean z11 = ((C5793a) this.f36566a).m12185k().m12196g().f50568l.f50620a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C5802j c5802jM12189o2 = ((C5793a) this.f36566a).m12189o();
        long j13 = jCurrentTimeMillis - this.f36573h;
        C5802j c5802jM12189o3 = ((C5793a) this.f36566a).m12189o();
        synchronized (c5802jM12189o3) {
            try {
                j10 = c5802jM12189o3.f35069f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        c5802jM12189o2.m12221i(j10 + j13);
        C5802j c5802jM12189o4 = ((C5793a) this.f36566a).m12189o();
        synchronized (c5802jM12189o4) {
            try {
                z10 = c5802jM12189o4.f35068e;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (z10) {
            f36565i.m459c("Session end already sent this window, aborting");
            return;
        }
        C5802j c5802jM12189o5 = ((C5793a) this.f36566a).m12189o();
        synchronized (c5802jM12189o5) {
            try {
                j11 = c5802jM12189o5.f35066c;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (j11 > 1) {
            C5802j c5802jM12189o6 = ((C5793a) this.f36566a).m12189o();
            synchronized (c5802jM12189o6) {
                try {
                    j12 = c5802jM12189o6.f35067d;
                } catch (Throwable th5) {
                    throw th5;
                }
            }
            if (jCurrentTimeMillis <= C5206f.m11017p1(((C5793a) this.f36566a).m12185k().m12196g().f50568l.f50621b) + j12) {
                f36565i.m459c("Updating cached session end");
                if (z11) {
                    ((C5793a) this.f36566a).m12189o().m12219g(m12955a(false, jCurrentTimeMillis));
                    InterfaceC7361c interfaceC7361c = this.f36567b.f46132f;
                    RunnableC6328a runnableC6328a = new RunnableC6328a(this);
                    C7360b c7360b2 = (C7360b) interfaceC7361c;
                    c7360b2.f41121b.getClass();
                    ExecutorService executorService2 = C7363e.f41126e;
                    if (executorService2 == null) {
                        throw new RuntimeException("Failed to start threadpool");
                    }
                    executorService2.execute(new RunnableC7359a(c7360b2, runnableC6328a));
                }
            } else {
                f36565i.m459c("Queuing session end to send");
                if (z11) {
                    C5174b c5174bM12955a = m12955a(false, jCurrentTimeMillis);
                    InterfaceC7361c interfaceC7361c2 = this.f36567b.f46132f;
                    runnableC6329b = new RunnableC6329b(this, c5174bM12955a);
                    c7360b = (C7360b) interfaceC7361c2;
                    c7360b.f41121b.getClass();
                    executorService = C7363e.f41126e;
                    if (executorService != null) {
                        throw new RuntimeException("Failed to start threadpool");
                    }
                    executorService.execute(new RunnableC7359a(c7360b, runnableC6329b));
                }
                c5802jM12189o = ((C5793a) this.f36566a).m12189o();
                synchronized (c5802jM12189o) {
                    c5802jM12189o.f35068e = true;
                    ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) c5802jM12189o.f40719a)).m12484g("session.window_pause_sent", true);
                }
                ((C5793a) this.f36566a).m12189o().m12219g(null);
            }
        } else {
            f36565i.m459c("Queuing session end to send");
            if (z11) {
                C5174b c5174bM12955a2 = m12955a(false, jCurrentTimeMillis);
                InterfaceC7361c interfaceC7361c3 = this.f36567b.f46132f;
                runnableC6329b = new RunnableC6329b(this, c5174bM12955a2);
                c7360b = (C7360b) interfaceC7361c3;
                c7360b.f41121b.getClass();
                executorService = C7363e.f41126e;
                if (executorService != null) {
                    throw new RuntimeException("Failed to start threadpool");
                }
                executorService.execute(new RunnableC7359a(c7360b, runnableC6329b));
            }
            c5802jM12189o = ((C5793a) this.f36566a).m12189o();
            synchronized (c5802jM12189o) {
                c5802jM12189o.f35068e = true;
                ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) c5802jM12189o.f40719a)).m12484g("session.window_pause_sent", true);
                ((C5793a) this.f36566a).m12189o().m12219g(null);
            }
        }
        if (!z11) {
            f36565i.m459c("Sessions disabled, not creating session");
        }
    }

    @Override // wf.InterfaceC9916d
    /* JADX INFO: renamed from: d */
    public final synchronized void mo12958d() {
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: e */
    public final synchronized int m12959e() {
        int i10;
        try {
            C5802j c5802jM12189o = ((C5793a) this.f36566a).m12189o();
            synchronized (c5802jM12189o) {
                i10 = c5802jM12189o.f35070g;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return i10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: f */
    public final synchronized long m12960f() {
        long j10;
        try {
            if (!this.f36572g) {
                return System.currentTimeMillis() - this.f36567b.f46127a;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f36573h;
            C5802j c5802jM12189o = ((C5793a) this.f36566a).m12189o();
            synchronized (c5802jM12189o) {
                try {
                    j10 = c5802jM12189o.f35069f;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return j10 + jCurrentTimeMillis;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: g */
    public final synchronized boolean m12961g() {
        return this.f36572g;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // wf.InterfaceC9916d
    /* JADX INFO: renamed from: h */
    public final synchronized void mo12962h(boolean z10) {
        C0076c c0076c = f36565i;
        c0076c.m459c("Active state has changed to ".concat(z10 ? "active" : "inactive"));
        if (this.f36573h == 0) {
            c0076c.m459c("Not started yet, setting initial active state");
            this.f36570e = Boolean.valueOf(z10);
        } else {
            if (this.f36572g == z10) {
                c0076c.m459c("Duplicate state, ignoring");
                return;
            }
            this.f36572g = z10;
            if (z10) {
                this.f36571f = false;
                m12956b();
            } else {
                this.f36571f = true;
                m12957c();
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: i */
    public final synchronized void m12963i() {
        long j10;
        try {
            this.f36573h = this.f36567b.f46127a;
            C5802j c5802jM12189o = ((C5793a) this.f36566a).m12189o();
            synchronized (c5802jM12189o) {
                try {
                    j10 = c5802jM12189o.f35066c;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (j10 <= 0) {
                f36565i.m459c("Starting and initializing the first launch");
                this.f36572g = true;
                C5802j c5802jM12189o2 = ((C5793a) this.f36566a).m12189o();
                synchronized (c5802jM12189o2) {
                    c5802jM12189o2.f35066c = 1L;
                    ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) c5802jM12189o2.f40719a)).m12487j("window_count", 1L);
                }
                C5802j c5802jM12189o3 = ((C5793a) this.f36566a).m12189o();
                long j11 = this.f36567b.f46127a;
                synchronized (c5802jM12189o3) {
                    try {
                        c5802jM12189o3.f35067d = j11;
                        ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) c5802jM12189o3.f40719a)).m12487j("session.window_start_time_millis", j11);
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                ((C5793a) this.f36566a).m12189o().m12221i(System.currentTimeMillis() - this.f36567b.f46127a);
                ((C5793a) this.f36566a).m12189o().m12220h(1);
            } else {
                Boolean bool = this.f36570e;
                if (bool != null ? bool.booleanValue() : ((ComponentCallbacks2C9913a) this.f36568c).f50552d) {
                    f36565i.m459c("Starting when state is active");
                    mo12962h(true);
                } else {
                    f36565i.m459c("Starting when state is inactive");
                }
            }
            List<InterfaceC9916d> list = ((ComponentCallbacks2C9913a) this.f36568c).f50551c;
            list.remove(this);
            list.add(this);
        } catch (Throwable th4) {
            throw th4;
        }
    }
}
