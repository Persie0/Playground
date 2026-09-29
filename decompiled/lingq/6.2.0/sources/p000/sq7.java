package p000;

import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.util.Timer;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class sq7 {

    /* JADX INFO: renamed from: i */
    public static final long f61256i;

    /* JADX INFO: renamed from: b */
    public r52 f61258b;

    /* JADX INFO: renamed from: e */
    public final r52 f61261e;

    /* JADX INFO: renamed from: f */
    public final r52 f61262f;

    /* JADX INFO: renamed from: g */
    public final long f61263g;

    /* JADX INFO: renamed from: h */
    public final long f61264h;

    /* JADX INFO: renamed from: c */
    public long f61259c = 500;

    /* JADX INFO: renamed from: d */
    public double f61260d = 500.0d;

    /* JADX INFO: renamed from: a */
    public Timer f61257a = new Timer();

    static {
        C3723wi.m23970d();
        f61256i = 1000000L;
    }

    public sq7(r52 r52Var, s46 s46Var, dh1 dh1Var, String str) {
        nh1 nh1Var;
        long jLongValue;
        mh1 mh1Var;
        long jLongValue2;
        yh1 yh1Var;
        zh1 zh1Var;
        this.f61258b = r52Var;
        long jM10389j = str == "Trace" ? dh1Var.m10389j() : dh1Var.m10389j();
        if (str == "Trace") {
            synchronized (zh1.class) {
                try {
                    if (zh1.f71573h == null) {
                        zh1.f71573h = new zh1();
                    }
                    zh1Var = zh1.f71573h;
                } catch (Throwable th) {
                    throw th;
                }
            }
            RemoteConfigManager remoteConfigManager = dh1Var.f35642a;
            zh1Var.getClass();
            mz6 mz6Var = remoteConfigManager.getLong("fpr_rl_trace_event_count_fg");
            if (mz6Var.m17160b() && dh1.m10377k(((Long) mz6Var.m17159a()).longValue())) {
                dh1Var.f35644c.m23847e("com.google.firebase.perf.TraceEventCountForeground", ((Long) mz6Var.m17159a()).longValue());
                jLongValue = ((Long) mz6Var.m17159a()).longValue();
            } else {
                mz6 mz6VarM10383c = dh1Var.m10383c(zh1Var);
                jLongValue = (mz6VarM10383c.m17160b() && dh1.m10377k(((Long) mz6VarM10383c.m17159a()).longValue())) ? ((Long) mz6VarM10383c.m17159a()).longValue() : 300L;
            }
        } else {
            synchronized (nh1.class) {
                try {
                    if (nh1.f52726h == null) {
                        nh1.f52726h = new nh1();
                    }
                    nh1Var = nh1.f52726h;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            RemoteConfigManager remoteConfigManager2 = dh1Var.f35642a;
            nh1Var.getClass();
            mz6 mz6Var2 = remoteConfigManager2.getLong("fpr_rl_network_event_count_fg");
            if (mz6Var2.m17160b() && dh1.m10377k(((Long) mz6Var2.m17159a()).longValue())) {
                dh1Var.f35644c.m23847e("com.google.firebase.perf.NetworkEventCountForeground", ((Long) mz6Var2.m17159a()).longValue());
                jLongValue = ((Long) mz6Var2.m17159a()).longValue();
            } else {
                mz6 mz6VarM10383c2 = dh1Var.m10383c(nh1Var);
                jLongValue = (mz6VarM10383c2.m17160b() && dh1.m10377k(((Long) mz6VarM10383c2.m17159a()).longValue())) ? ((Long) mz6VarM10383c2.m17159a()).longValue() : 700L;
            }
        }
        long j = jLongValue;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f61261e = new r52(j, jM10389j, timeUnit);
        this.f61263g = j;
        long jM10389j2 = str == "Trace" ? dh1Var.m10389j() : dh1Var.m10389j();
        if (str == "Trace") {
            synchronized (yh1.class) {
                try {
                    if (yh1.f69839h == null) {
                        yh1.f69839h = new yh1();
                    }
                    yh1Var = yh1.f69839h;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            RemoteConfigManager remoteConfigManager3 = dh1Var.f35642a;
            yh1Var.getClass();
            mz6 mz6Var3 = remoteConfigManager3.getLong("fpr_rl_trace_event_count_bg");
            if (mz6Var3.m17160b() && dh1.m10377k(((Long) mz6Var3.m17159a()).longValue())) {
                dh1Var.f35644c.m23847e("com.google.firebase.perf.TraceEventCountBackground", ((Long) mz6Var3.m17159a()).longValue());
                jLongValue2 = ((Long) mz6Var3.m17159a()).longValue();
            } else {
                mz6 mz6VarM10383c3 = dh1Var.m10383c(yh1Var);
                jLongValue2 = (mz6VarM10383c3.m17160b() && dh1.m10377k(((Long) mz6VarM10383c3.m17159a()).longValue())) ? ((Long) mz6VarM10383c3.m17159a()).longValue() : 30L;
            }
        } else {
            synchronized (mh1.class) {
                try {
                    if (mh1.f51320h == null) {
                        mh1.f51320h = new mh1();
                    }
                    mh1Var = mh1.f51320h;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            RemoteConfigManager remoteConfigManager4 = dh1Var.f35642a;
            mh1Var.getClass();
            mz6 mz6Var4 = remoteConfigManager4.getLong("fpr_rl_network_event_count_bg");
            if (mz6Var4.m17160b() && dh1.m10377k(((Long) mz6Var4.m17159a()).longValue())) {
                dh1Var.f35644c.m23847e("com.google.firebase.perf.NetworkEventCountBackground", ((Long) mz6Var4.m17159a()).longValue());
                jLongValue2 = ((Long) mz6Var4.m17159a()).longValue();
            } else {
                mz6 mz6VarM10383c4 = dh1Var.m10383c(mh1Var);
                jLongValue2 = (mz6VarM10383c4.m17160b() && dh1.m10377k(((Long) mz6VarM10383c4.m17159a()).longValue())) ? ((Long) mz6VarM10383c4.m17159a()).longValue() : 70L;
            }
        }
        long j2 = jLongValue2;
        this.f61262f = new r52(j2, jM10389j2, timeUnit);
        this.f61264h = j2;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m21588a(boolean z) {
        try {
            this.f61258b = z ? this.f61261e : this.f61262f;
            this.f61259c = z ? this.f61263g : this.f61264h;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005c A[Catch: all -> 0x006b, TryCatch #0 {all -> 0x006b, blocks: (B:3:0x0001, B:9:0x002c, B:14:0x0051, B:16:0x005c, B:19:0x006d, B:21:0x0075, B:10:0x0034, B:11:0x003c, B:12:0x003f, B:13:0x0048), top: B:29:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0075 A[Catch: all -> 0x006b, TRY_LEAVE, TryCatch #0 {all -> 0x006b, blocks: (B:3:0x0001, B:9:0x002c, B:14:0x0051, B:16:0x005c, B:19:0x006d, B:21:0x0075, B:10:0x0034, B:11:0x003c, B:12:0x003f, B:13:0x0048), top: B:29:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x007a A[DONT_GENERATE] */
    /* JADX WARN: Instruction removed from duplicated block: B:24:0x007a, please report this as an issue */
    /* JADX INFO: renamed from: b */
    public final synchronized boolean m21589b() {
        double d;
        double d2;
        double seconds;
        double d3;
        double d4;
        try {
            Timer timer = new Timer();
            Timer timer2 = this.f61257a;
            timer2.getClass();
            double d5 = timer.f13788b - timer2.f13788b;
            r52 r52Var = this.f61258b;
            long j = r52Var.f58738a;
            long j2 = r52Var.f58739b;
            int[] iArr = pq7.f56681a;
            TimeUnit timeUnit = (TimeUnit) r52Var.f58740c;
            int i = iArr[timeUnit.ordinal()];
            if (i == 1) {
                d = j / j2;
                d2 = 1.0E9d;
            } else {
                if (i != 2) {
                    if (i != 3) {
                        seconds = j / timeUnit.toSeconds(j2);
                    } else {
                        d = j / j2;
                        d2 = 1000.0d;
                    }
                    d3 = (d5 * seconds) / f61256i;
                    if (d3 > 0.0d) {
                        this.f61260d = Math.min(this.f61260d + d3, this.f61259c);
                        this.f61257a = timer;
                    }
                    d4 = this.f61260d;
                    if (d4 >= 1.0d) {
                        return false;
                    }
                    this.f61260d = d4 - 1.0d;
                    return true;
                }
                d = j / j2;
                d2 = 1000000.0d;
            }
            seconds = d * d2;
            d3 = (d5 * seconds) / f61256i;
            if (d3 > 0.0d) {
                this.f61260d = Math.min(this.f61260d + d3, this.f61259c);
                this.f61257a = timer;
            }
            d4 = this.f61260d;
            if (d4 >= 1.0d) {
                return false;
            }
            this.f61260d = d4 - 1.0d;
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }
}
