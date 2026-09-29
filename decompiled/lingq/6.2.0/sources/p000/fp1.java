package p000;

import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import com.google.firebase.perf.util.Timer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class fp1 {

    /* JADX INFO: renamed from: g */
    public static final C3723wi f39404g = C3723wi.m23970d();

    /* JADX INFO: renamed from: h */
    public static final long f39405h = 1000000;

    /* JADX INFO: renamed from: e */
    public ScheduledFuture f39410e = null;

    /* JADX INFO: renamed from: f */
    public long f39411f = -1;

    /* JADX INFO: renamed from: a */
    public final ConcurrentLinkedQueue f39406a = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: b */
    public final ScheduledExecutorService f39407b = Executors.newSingleThreadScheduledExecutor();

    /* JADX INFO: renamed from: c */
    public final String f39408c = "/proc/" + Integer.toString(Process.myPid()) + "/stat";

    /* JADX INFO: renamed from: d */
    public final long f39409d = Os.sysconf(OsConstants._SC_CLK_TCK);

    /* JADX INFO: renamed from: b */
    public static boolean m11980b(long j) {
        return j <= 0;
    }

    /* JADX INFO: renamed from: a */
    public final void m11981a(Timer timer) {
        synchronized (this) {
            try {
                this.f39407b.schedule(new ep1(this, timer, 1), 0L, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                f39404g.m23975f("Unable to collect Cpu Metric: " + e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m11982c(long j, Timer timer) {
        this.f39411f = j;
        try {
            this.f39410e = this.f39407b.scheduleAtFixedRate(new ep1(this, timer, 0), 0L, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            f39404g.m23975f("Unable to start collecting Cpu Metrics: " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m11983d(long j, Timer timer) {
        long j2 = this.f39409d;
        if (j2 == -1 || j2 == 0 || m11980b(j)) {
            return;
        }
        if (this.f39410e == null) {
            m11982c(j, timer);
        } else if (this.f39411f != j) {
            m11984e();
            m11982c(j, timer);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m11984e() {
        ScheduledFuture scheduledFuture = this.f39410e;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.f39410e = null;
        this.f39411f = -1L;
    }

    /* JADX INFO: renamed from: f */
    public final ip1 m11985f(Timer timer) {
        long j = this.f39409d;
        C3723wi c3723wi = f39404g;
        if (timer == null) {
            return null;
        }
        try {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(this.f39408c));
                try {
                    long jM6742a = timer.m6742a() + timer.f13787a;
                    String[] strArrSplit = bufferedReader.readLine().split(" ");
                    long j2 = Long.parseLong(strArrSplit[13]);
                    long j3 = Long.parseLong(strArrSplit[15]);
                    long j4 = Long.parseLong(strArrSplit[14]);
                    long j5 = Long.parseLong(strArrSplit[16]);
                    hp1 hp1VarM14062v = ip1.m14062v();
                    hp1VarM14062v.m22767h();
                    ip1.m14059s((ip1) hp1VarM14062v.f64019b, jM6742a);
                    double d = (j4 + j5) / j;
                    long j6 = f39405h;
                    long jRound = Math.round(d * j6);
                    hp1VarM14062v.m22767h();
                    ip1.m14061u((ip1) hp1VarM14062v.f64019b, jRound);
                    long jRound2 = Math.round(((j2 + j3) / j) * j6);
                    hp1VarM14062v.m22767h();
                    ip1.m14060t((ip1) hp1VarM14062v.f64019b, jRound2);
                    ip1 ip1Var = (ip1) hp1VarM14062v.m22766g();
                    bufferedReader.close();
                    return ip1Var;
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                c3723wi.m23975f("Unable to read 'proc/[pid]/stat' file: " + e.getMessage());
                return null;
            }
        } catch (ArrayIndexOutOfBoundsException | NullPointerException | NumberFormatException e2) {
            c3723wi.m23975f("Unexpected '/proc/[pid]/stat' file format encountered: " + e2.getMessage());
            return null;
        }
    }
}
