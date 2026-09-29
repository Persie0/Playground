package re;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.datatransport.Priority;
import com.google.android.exoplayer2.ExoPlayer;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import ne.AbstractC7743b0;
import p136gc.C5752h;
import p241le.AbstractC7355z;
import p241le.C7337h0;
import p286o2.RunnableC7907g;
import p289o5.C7940t;
import p395t8.C9219a;
import p395t8.InterfaceC9223e;
import p395t8.InterfaceC9225g;
import p452w8.C9840u;
import se.C8992b;

/* JADX INFO: renamed from: re.c */
/* JADX INFO: loaded from: classes.dex */
public final class C8772c {

    /* JADX INFO: renamed from: a */
    public final double f46499a;

    /* JADX INFO: renamed from: b */
    public final double f46500b;

    /* JADX INFO: renamed from: c */
    public final long f46501c;

    /* JADX INFO: renamed from: d */
    public final long f46502d;

    /* JADX INFO: renamed from: e */
    public final int f46503e;

    /* JADX INFO: renamed from: f */
    public final ArrayBlockingQueue f46504f;

    /* JADX INFO: renamed from: g */
    public final ThreadPoolExecutor f46505g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC9223e<AbstractC7743b0> f46506h;

    /* JADX INFO: renamed from: i */
    public final C7940t f46507i;

    /* JADX INFO: renamed from: j */
    public int f46508j;

    /* JADX INFO: renamed from: k */
    public long f46509k;

    /* JADX INFO: renamed from: re.c$a */
    public final class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final AbstractC7355z f46510a;

        /* JADX INFO: renamed from: b */
        public final C5752h<AbstractC7355z> f46511b;

        public a(AbstractC7355z abstractC7355z, C5752h c5752h) {
            this.f46510a = abstractC7355z;
            this.f46511b = c5752h;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C8772c c8772c = C8772c.this;
            AbstractC7355z abstractC7355z = this.f46510a;
            c8772c.m17020b(abstractC7355z, this.f46511b);
            boolean z10 = false;
            ((AtomicInteger) c8772c.f46507i.f43257b).set(0);
            double dMin = Math.min(3600000.0d, Math.pow(c8772c.f46500b, c8772c.m17019a()) * (60000.0d / c8772c.f46499a));
            String str = "Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(dMin / 1000.0d)) + " s for report: " + abstractC7355z.mo14741c();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                z10 = true;
            }
            if (z10) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            try {
                Thread.sleep((long) dMin);
            } catch (InterruptedException unused) {
            }
        }
    }

    public C8772c(InterfaceC9223e<AbstractC7743b0> interfaceC9223e, C8992b c8992b, C7940t c7940t) {
        double d10 = c8992b.f47178d;
        long j10 = ((long) c8992b.f47180f) * 1000;
        this.f46499a = d10;
        this.f46500b = c8992b.f47179e;
        this.f46501c = j10;
        this.f46506h = interfaceC9223e;
        this.f46507i = c7940t;
        this.f46502d = SystemClock.elapsedRealtime();
        int i10 = (int) d10;
        this.f46503e = i10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10);
        this.f46504f = arrayBlockingQueue;
        this.f46505g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f46508j = 0;
        this.f46509k = 0L;
    }

    /* JADX INFO: renamed from: a */
    public final int m17019a() {
        if (this.f46509k == 0) {
            this.f46509k = System.currentTimeMillis();
        }
        int iCurrentTimeMillis = (int) ((System.currentTimeMillis() - this.f46509k) / this.f46501c);
        int iMin = this.f46504f.size() == this.f46503e ? Math.min(100, this.f46508j + iCurrentTimeMillis) : Math.max(0, this.f46508j - iCurrentTimeMillis);
        if (this.f46508j != iMin) {
            this.f46508j = iMin;
            this.f46509k = System.currentTimeMillis();
        }
        return iMin;
    }

    /* JADX INFO: renamed from: b */
    public final void m17020b(final AbstractC7355z abstractC7355z, final C5752h<AbstractC7355z> c5752h) {
        String str = "Sending report through Google DataTransport: " + abstractC7355z.mo14741c();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        final boolean z10 = SystemClock.elapsedRealtime() - this.f46502d < ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS;
        ((C9840u) this.f46506h).m18332a(new C9219a(abstractC7355z.mo14739a(), Priority.HIGHEST), new InterfaceC9225g() { // from class: re.b
            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // p395t8.InterfaceC9225g
            /* JADX INFO: renamed from: i */
            public final void mo12177i(Exception exc) throws Throwable {
                C8772c c8772c = this.f46495a;
                c8772c.getClass();
                C5752h c5752h2 = c5752h;
                if (exc != null) {
                    c5752h2.m12115c(exc);
                    return;
                }
                if (z10) {
                    boolean z11 = true;
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    new Thread(new RunnableC7907g(c8772c, 17, countDownLatch)).start();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    ExecutorService executorService = C7337h0.f41062a;
                    boolean z12 = false;
                    try {
                        long nanos = timeUnit.toNanos(2L);
                        long jNanoTime = System.nanoTime() + nanos;
                        while (true) {
                            try {
                                try {
                                    countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                                    break;
                                } catch (InterruptedException unused) {
                                    nanos = jNanoTime - System.nanoTime();
                                    z12 = true;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (z11) {
                                    Thread.currentThread().interrupt();
                                }
                                throw th;
                            }
                        }
                        if (z12) {
                            Thread.currentThread().interrupt();
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        z11 = z12;
                    }
                }
                c5752h2.m12116d(abstractC7355z);
            }
        });
    }
}
