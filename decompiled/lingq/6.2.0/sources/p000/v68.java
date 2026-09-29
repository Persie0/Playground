package p000;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.datatransport.Priority;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class v68 {

    /* JADX INFO: renamed from: a */
    public final double f64939a;

    /* JADX INFO: renamed from: b */
    public final double f64940b;

    /* JADX INFO: renamed from: c */
    public final long f64941c;

    /* JADX INFO: renamed from: d */
    public final long f64942d;

    /* JADX INFO: renamed from: e */
    public final int f64943e;

    /* JADX INFO: renamed from: f */
    public final ArrayBlockingQueue f64944f;

    /* JADX INFO: renamed from: g */
    public final ThreadPoolExecutor f64945g;

    /* JADX INFO: renamed from: h */
    public final hba f64946h;

    /* JADX INFO: renamed from: i */
    public final bl2 f64947i;

    /* JADX INFO: renamed from: j */
    public int f64948j;

    /* JADX INFO: renamed from: k */
    public long f64949k;

    public v68(hba hbaVar, i09 i09Var, bl2 bl2Var) {
        double d = i09Var.f43297d;
        double d2 = i09Var.f43298e;
        long j = ((long) i09Var.f43299f) * 1000;
        this.f64939a = d;
        this.f64940b = d2;
        this.f64941c = j;
        this.f64946h = hbaVar;
        this.f64947i = bl2Var;
        this.f64942d = SystemClock.elapsedRealtime();
        int i = (int) d;
        this.f64943e = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        this.f64944f = arrayBlockingQueue;
        this.f64945g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f64948j = 0;
        this.f64949k = 0L;
    }

    /* JADX INFO: renamed from: a */
    public final int m23152a() {
        if (this.f64949k == 0) {
            this.f64949k = System.currentTimeMillis();
        }
        int iCurrentTimeMillis = (int) ((System.currentTimeMillis() - this.f64949k) / this.f64941c);
        int size = this.f64944f.size();
        int i = this.f64948j;
        int iMin = size == this.f64943e ? Math.min(100, i + iCurrentTimeMillis) : Math.max(0, i - iCurrentTimeMillis);
        if (this.f64948j != iMin) {
            this.f64948j = iMin;
            this.f64949k = System.currentTimeMillis();
        }
        return iMin;
    }

    /* JADX INFO: renamed from: b */
    public final void m23153b(y20 y20Var, wr9 wr9Var) {
        String str = "Sending report through Google DataTransport: " + y20Var.m24852d();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        this.f64946h.m13185a(new j40(y20Var.m24850b(), Priority.HIGHEST, null), new y82(this, wr9Var, SystemClock.elapsedRealtime() - this.f64942d < 2000, y20Var));
    }
}
