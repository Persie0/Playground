package p000;

import com.kochava.tracker.BuildConfig;
import com.kochava.tracker.payload.internal.PayloadType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class hz8 {

    /* JADX INFO: renamed from: j */
    public static final sq5 f43245j;

    /* JADX INFO: renamed from: a */
    public final rl7 f43246a;

    /* JADX INFO: renamed from: b */
    public final d74 f43247b;

    /* JADX INFO: renamed from: c */
    public final ComponentCallbacks2C0837c7 f43248c;

    /* JADX INFO: renamed from: d */
    public final g02 f43249d;

    /* JADX INFO: renamed from: e */
    public final List f43250e = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: f */
    public Boolean f43251f = null;

    /* JADX INFO: renamed from: g */
    public boolean f43252g = false;

    /* JADX INFO: renamed from: h */
    public boolean f43253h = false;

    /* JADX INFO: renamed from: i */
    public long f43254i = 0;

    static {
        sj5 sj5VarM20396w = r46.m20396w();
        f43245j = ux5.m22983f(sj5VarM20396w, sj5VarM20396w, BuildConfig.SDK_MODULE_NAME, "SessionManager");
    }

    public hz8(rl7 rl7Var, d74 d74Var, g02 g02Var) {
        this.f43247b = d74Var;
        this.f43246a = rl7Var;
        this.f43249d = g02Var;
        this.f43248c = new ComponentCallbacks2C0837c7(d74Var.f35077a, (ny8) d74Var.f35084h);
    }

    /* JADX INFO: renamed from: a */
    public final l67 m13596a(long j, boolean z) {
        long j2;
        int i;
        d74 d74Var = this.f43247b;
        rl7 rl7Var = this.f43246a;
        if (z) {
            return l67.m15900c(PayloadType.SessionBegin, d74Var.f35078b, rl7Var.m20699o().m11226G(), j, 0L, true, 1);
        }
        PayloadType payloadType = PayloadType.SessionEnd;
        long j3 = d74Var.f35078b;
        long jM11226G = rl7Var.m20699o().m11226G();
        mm7 mm7VarM20702r = rl7Var.m20702r();
        synchronized (mm7VarM20702r) {
            j2 = mm7VarM20702r.f51530f;
        }
        mm7 mm7VarM20702r2 = rl7Var.m20702r();
        synchronized (mm7VarM20702r2) {
            i = mm7VarM20702r2.f51531g;
        }
        return l67.m15900c(payloadType, j3, jM11226G, j, j2, true, i);
    }

    /* JADX INFO: renamed from: b */
    public final void m13597b() {
        long j;
        long j2;
        l67 l67Var;
        int i;
        boolean z = this.f43246a.m20693i().m25692F().f55564m.f7959a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f43254i = jCurrentTimeMillis;
        mm7 mm7VarM20702r = this.f43246a.m20702r();
        synchronized (mm7VarM20702r) {
            j = mm7VarM20702r.f51528d;
        }
        if (jCurrentTimeMillis <= ci8.m4705R(this.f43246a.m20693i().m25692F().f55564m.f7961c) + j) {
            f43245j.m21555D("Within session window, incrementing active count");
            mm7 mm7VarM20702r2 = this.f43246a.m20702r();
            mm7 mm7VarM20702r3 = this.f43246a.m20702r();
            synchronized (mm7VarM20702r3) {
                i = mm7VarM20702r3.f51531g;
            }
            mm7VarM20702r2.m16921G(i + 1);
            return;
        }
        mm7 mm7VarM20702r4 = this.f43246a.m20702r();
        synchronized (mm7VarM20702r4) {
            mm7VarM20702r4.f51528d = jCurrentTimeMillis;
            ((cj9) mm7VarM20702r4.f60774a).m4782j("session.window_start_time_millis", jCurrentTimeMillis);
        }
        mm7 mm7VarM20702r5 = this.f43246a.m20702r();
        synchronized (mm7VarM20702r5) {
            mm7VarM20702r5.f51529e = false;
            ((cj9) mm7VarM20702r5.f60774a).m4779g("session.window_pause_sent", false);
        }
        this.f43246a.m20702r().m16922H(0L);
        this.f43246a.m20702r().m16921G(1);
        mm7 mm7VarM20702r6 = this.f43246a.m20702r();
        mm7 mm7VarM20702r7 = this.f43246a.m20702r();
        synchronized (mm7VarM20702r7) {
            j2 = mm7VarM20702r7.f51527c;
        }
        long j3 = j2 + 1;
        synchronized (mm7VarM20702r6) {
            mm7VarM20702r6.f51527c = j3;
            ((cj9) mm7VarM20702r6.f60774a).m4782j("window_count", j3);
        }
        synchronized (this.f43246a.m20702r()) {
            try {
                mm7 mm7VarM20702r8 = this.f43246a.m20702r();
                synchronized (mm7VarM20702r8) {
                    l67Var = mm7VarM20702r8.f51526b;
                }
                if (l67Var != null) {
                    f43245j.m21555D("Queuing deferred session end to send");
                    if (!this.f43246a.m20695k()) {
                        this.f43246a.m20703s().m17821a(l67Var);
                    }
                    this.f43246a.m20702r().m16920F(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z) {
            f43245j.m21555D("Sessions disabled, not creating session");
            return;
        }
        f43245j.m21555D("Queuing session begin to send");
        ((ny8) this.f43247b.f35084h).m17683K(new mv5(8, this, m13596a(jCurrentTimeMillis, true)));
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0099  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bd  */
    /* JADX INFO: renamed from: c */
    public final void m13598c() {
        long j;
        boolean z;
        long j2;
        mm7 mm7VarM20702r;
        long j3;
        boolean z2 = this.f43246a.m20693i().m25692F().f55564m.f7959a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        mm7 mm7VarM20702r2 = this.f43246a.m20702r();
        long j4 = jCurrentTimeMillis - this.f43254i;
        mm7 mm7VarM20702r3 = this.f43246a.m20702r();
        synchronized (mm7VarM20702r3) {
            j = mm7VarM20702r3.f51530f;
        }
        mm7VarM20702r2.m16922H(j + j4);
        mm7 mm7VarM20702r4 = this.f43246a.m20702r();
        synchronized (mm7VarM20702r4) {
            z = mm7VarM20702r4.f51529e;
        }
        if (z) {
            f43245j.m21555D("Session end already sent this window, aborting");
            return;
        }
        mm7 mm7VarM20702r5 = this.f43246a.m20702r();
        synchronized (mm7VarM20702r5) {
            j2 = mm7VarM20702r5.f51527c;
        }
        if (j2 > 1) {
            mm7 mm7VarM20702r6 = this.f43246a.m20702r();
            synchronized (mm7VarM20702r6) {
                j3 = mm7VarM20702r6.f51528d;
            }
            if (jCurrentTimeMillis <= ci8.m4705R(this.f43246a.m20693i().m25692F().f55564m.f7960b) + j3) {
                f43245j.m21555D("Updating cached session end");
                if (z2) {
                    this.f43246a.m20702r().m16920F(m13596a(jCurrentTimeMillis, false));
                    ((ny8) this.f43247b.f35084h).m17683K(new mt6(this, 6));
                }
            } else {
                f43245j.m21555D("Queuing session end to send");
                if (z2) {
                    ((ny8) this.f43247b.f35084h).m17683K(new mv5(8, this, m13596a(jCurrentTimeMillis, false)));
                }
                mm7VarM20702r = this.f43246a.m20702r();
                synchronized (mm7VarM20702r) {
                    mm7VarM20702r.f51529e = true;
                    ((cj9) mm7VarM20702r.f60774a).m4779g("session.window_pause_sent", true);
                }
                this.f43246a.m20702r().m16920F(null);
            }
        } else {
            f43245j.m21555D("Queuing session end to send");
            if (z2) {
                ((ny8) this.f43247b.f35084h).m17683K(new mv5(8, this, m13596a(jCurrentTimeMillis, false)));
            }
            mm7VarM20702r = this.f43246a.m20702r();
            synchronized (mm7VarM20702r) {
                mm7VarM20702r.f51529e = true;
                ((cj9) mm7VarM20702r.f60774a).m4779g("session.window_pause_sent", true);
                this.f43246a.m20702r().m16920F(null);
            }
        }
        if (z2) {
            return;
        }
        f43245j.m21555D("Sessions disabled, not creating session");
    }

    /* JADX INFO: renamed from: d */
    public final synchronized int m13599d() {
        int i;
        mm7 mm7VarM20702r = this.f43246a.m20702r();
        synchronized (mm7VarM20702r) {
            i = mm7VarM20702r.f51531g;
        }
        return i;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized long m13600e() {
        return this.f43254i;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized long m13601f() {
        long j;
        try {
            if (!this.f43253h) {
                return System.currentTimeMillis() - this.f43247b.f35078b;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f43254i;
            mm7 mm7VarM20702r = this.f43246a.m20702r();
            synchronized (mm7VarM20702r) {
                j = mm7VarM20702r.f51530f;
            }
            return j + jCurrentTimeMillis;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m13602g(boolean z) {
        try {
            sq5 sq5Var = f43245j;
            sq5Var.m21555D("Active state has changed to ".concat(z ? "active" : "inactive"));
            ArrayList arrayListM3224U = b34.m3224U(this.f43250e);
            if (!arrayListM3224U.isEmpty()) {
                ((ny8) this.f43247b.f35084h).m17684L(new RunnableC0800b7(arrayListM3224U, z));
            }
            if (this.f43254i == 0) {
                sq5Var.m21555D("Not started yet, setting initial active state");
                this.f43251f = Boolean.valueOf(z);
            } else {
                if (this.f43253h == z) {
                    sq5Var.m21555D("Duplicate state, ignoring");
                    return;
                }
                this.f43253h = z;
                if (z) {
                    this.f43252g = false;
                    m13597b();
                } else {
                    this.f43252g = true;
                    m13598c();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m13603h() {
        long j;
        this.f43254i = this.f43247b.f35078b;
        mm7 mm7VarM20702r = this.f43246a.m20702r();
        synchronized (mm7VarM20702r) {
            j = mm7VarM20702r.f51527c;
        }
        if (j <= 0) {
            f43245j.m21555D("Starting and initializing the first launch");
            this.f43253h = true;
            mm7 mm7VarM20702r2 = this.f43246a.m20702r();
            synchronized (mm7VarM20702r2) {
                mm7VarM20702r2.f51527c = 1L;
                ((cj9) mm7VarM20702r2.f60774a).m4782j("window_count", 1L);
            }
            mm7 mm7VarM20702r3 = this.f43246a.m20702r();
            long j2 = this.f43247b.f35078b;
            synchronized (mm7VarM20702r3) {
                mm7VarM20702r3.f51528d = j2;
                ((cj9) mm7VarM20702r3.f60774a).m4782j("session.window_start_time_millis", j2);
            }
            this.f43246a.m20702r().m16922H(System.currentTimeMillis() - this.f43247b.f35078b);
            this.f43246a.m20702r().m16921G(1);
        } else {
            Boolean bool = this.f43251f;
            if (bool != null ? bool.booleanValue() : this.f43248c.f9653d) {
                f43245j.m21555D("Starting when state is active");
                m13602g(true);
            } else {
                f43245j.m21555D("Starting when state is inactive");
            }
        }
        List list = this.f43248c.f9652c;
        list.remove(this);
        list.add(this);
    }
}
