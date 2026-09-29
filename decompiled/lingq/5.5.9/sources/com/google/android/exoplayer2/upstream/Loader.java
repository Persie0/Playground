package com.google.android.exoplayer2.upstream;

import ae.C0062b;
import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.emoji2.text.ThreadFactoryC0887a;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p479xa.C10129a;
import p479xa.C10134c0;
import p479xa.C10145n;

/* JADX INFO: loaded from: classes.dex */
public final class Loader {

    /* JADX INFO: renamed from: d */
    public static final C2522b f13694d = new C2522b(0, -9223372036854775807L);

    /* JADX INFO: renamed from: e */
    public static final C2522b f13695e = new C2522b(2, -9223372036854775807L);

    /* JADX INFO: renamed from: f */
    public static final C2522b f13696f = new C2522b(3, -9223372036854775807L);

    /* JADX INFO: renamed from: a */
    public final ExecutorService f13697a;

    /* JADX INFO: renamed from: b */
    public HandlerC2523c<? extends InterfaceC2524d> f13698b;

    /* JADX INFO: renamed from: c */
    public IOException f13699c;

    public static final class UnexpectedLoaderException extends IOException {
        public UnexpectedLoaderException(Throwable th2) {
            super("Unexpected " + th2.getClass().getSimpleName() + ": " + th2.getMessage(), th2);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.Loader$a */
    public interface InterfaceC2521a<T extends InterfaceC2524d> {
        /* JADX INFO: renamed from: b */
        void mo7313b(T t10, long j10, long j11, boolean z10);

        /* JADX INFO: renamed from: e */
        void mo7314e(T t10, long j10, long j11);

        /* JADX INFO: renamed from: p */
        C2522b mo7316p(T t10, long j10, long j11, IOException iOException, int i10);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.Loader$b */
    public static final class C2522b {

        /* JADX INFO: renamed from: a */
        public final int f13700a;

        /* JADX INFO: renamed from: b */
        public final long f13701b;

        public C2522b(int i10, long j10) {
            this.f13700a = i10;
            this.f13701b = j10;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.Loader$c */
    @SuppressLint({"HandlerLeak"})
    public final class HandlerC2523c<T extends InterfaceC2524d> extends Handler implements Runnable {

        /* JADX INFO: renamed from: a */
        public final int f13702a;

        /* JADX INFO: renamed from: b */
        public final T f13703b;

        /* JADX INFO: renamed from: c */
        public final long f13704c;

        /* JADX INFO: renamed from: d */
        public InterfaceC2521a<T> f13705d;

        /* JADX INFO: renamed from: e */
        public IOException f13706e;

        /* JADX INFO: renamed from: f */
        public int f13707f;

        /* JADX INFO: renamed from: g */
        public Thread f13708g;

        /* JADX INFO: renamed from: h */
        public boolean f13709h;

        /* JADX INFO: renamed from: i */
        public volatile boolean f13710i;

        public HandlerC2523c(Looper looper, T t10, InterfaceC2521a<T> interfaceC2521a, int i10, long j10) {
            super(looper);
            this.f13703b = t10;
            this.f13705d = interfaceC2521a;
            this.f13702a = i10;
            this.f13704c = j10;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0036  */
        /* JADX INFO: renamed from: a */
        public final void m7470a(boolean z10) {
            this.f13710i = z10;
            this.f13706e = null;
            if (hasMessages(0)) {
                this.f13709h = true;
                removeMessages(0);
                if (!z10) {
                    sendEmptyMessage(1);
                }
                if (z10) {
                    Loader.this.f13698b = null;
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    InterfaceC2521a<T> interfaceC2521a = this.f13705d;
                    interfaceC2521a.getClass();
                    interfaceC2521a.mo7313b(this.f13703b, jElapsedRealtime, jElapsedRealtime - this.f13704c, true);
                    this.f13705d = null;
                }
            }
            synchronized (this) {
                try {
                    this.f13709h = true;
                    this.f13703b.mo7375b();
                    Thread thread = this.f13708g;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z10) {
                Loader.this.f13698b = null;
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                InterfaceC2521a<T> interfaceC2521a2 = this.f13705d;
                interfaceC2521a2.getClass();
                interfaceC2521a2.mo7313b(this.f13703b, jElapsedRealtime2, jElapsedRealtime2 - this.f13704c, true);
                this.f13705d = null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public final void m7471b(long j10) {
            Loader loader = Loader.this;
            C10129a.m18992d(loader.f13698b == null);
            loader.f13698b = this;
            if (j10 > 0) {
                sendEmptyMessageDelayed(0, j10);
                return;
            }
            this.f13706e = null;
            ExecutorService executorService = loader.f13697a;
            HandlerC2523c<? extends InterfaceC2524d> handlerC2523c = loader.f13698b;
            handlerC2523c.getClass();
            executorService.execute(handlerC2523c);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (this.f13710i) {
                return;
            }
            int i10 = message.what;
            if (i10 == 0) {
                this.f13706e = null;
                Loader loader = Loader.this;
                ExecutorService executorService = loader.f13697a;
                HandlerC2523c<? extends InterfaceC2524d> handlerC2523c = loader.f13698b;
                handlerC2523c.getClass();
                executorService.execute(handlerC2523c);
                return;
            }
            if (i10 == 3) {
                throw ((Error) message.obj);
            }
            Loader.this.f13698b = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = jElapsedRealtime - this.f13704c;
            InterfaceC2521a<T> interfaceC2521a = this.f13705d;
            interfaceC2521a.getClass();
            if (this.f13709h) {
                interfaceC2521a.mo7313b(this.f13703b, jElapsedRealtime, j10, false);
                return;
            }
            int i11 = message.what;
            if (i11 == 1) {
                try {
                    interfaceC2521a.mo7314e(this.f13703b, jElapsedRealtime, j10);
                } catch (RuntimeException e10) {
                    C10145n.m19096d("LoadTask", "Unexpected exception handling load completed", e10);
                    Loader.this.f13699c = new UnexpectedLoaderException(e10);
                }
            } else {
                if (i11 != 2) {
                    return;
                }
                IOException iOException = (IOException) message.obj;
                this.f13706e = iOException;
                int i12 = this.f13707f + 1;
                this.f13707f = i12;
                C2522b c2522bMo7316p = interfaceC2521a.mo7316p(this.f13703b, jElapsedRealtime, j10, iOException, i12);
                int i13 = c2522bMo7316p.f13700a;
                if (i13 == 3) {
                    Loader.this.f13699c = this.f13706e;
                } else if (i13 != 2) {
                    if (i13 == 1) {
                        this.f13707f = 1;
                    }
                    long jMin = c2522bMo7316p.f13701b;
                    if (jMin == -9223372036854775807L) {
                        jMin = Math.min((this.f13707f - 1) * 1000, 5000);
                    }
                    m7471b(jMin);
                }
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.lang.Runnable
        public final void run() {
            boolean z10;
            try {
                synchronized (this) {
                    z10 = !this.f13709h;
                    this.f13708g = Thread.currentThread();
                }
                if (z10) {
                    C0062b.m315V("load:".concat(this.f13703b.getClass().getSimpleName()));
                    try {
                        this.f13703b.mo7374a();
                        C0062b.m283K0();
                    } catch (Throwable th2) {
                        C0062b.m283K0();
                        throw th2;
                    }
                }
                synchronized (this) {
                    try {
                        this.f13708g = null;
                        Thread.interrupted();
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (this.f13710i) {
                    return;
                }
                sendEmptyMessage(1);
            } catch (IOException e10) {
                if (this.f13710i) {
                    return;
                }
                obtainMessage(2, e10).sendToTarget();
            } catch (Error e11) {
                if (!this.f13710i) {
                    C10145n.m19096d("LoadTask", "Unexpected error loading stream", e11);
                    obtainMessage(3, e11).sendToTarget();
                }
                throw e11;
            } catch (Exception e12) {
                if (this.f13710i) {
                    return;
                }
                C10145n.m19096d("LoadTask", "Unexpected exception loading stream", e12);
                obtainMessage(2, new UnexpectedLoaderException(e12)).sendToTarget();
            } catch (OutOfMemoryError e13) {
                if (this.f13710i) {
                    return;
                }
                C10145n.m19096d("LoadTask", "OutOfMemory error loading stream", e13);
                obtainMessage(2, new UnexpectedLoaderException(e13)).sendToTarget();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.Loader$d */
    public interface InterfaceC2524d {
        /* JADX INFO: renamed from: a */
        void mo7374a() throws IOException;

        /* JADX INFO: renamed from: b */
        void mo7375b();
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.Loader$e */
    public interface InterfaceC2525e {
        /* JADX INFO: renamed from: a */
        void mo7363a();
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.Loader$f */
    public static final class RunnableC2526f implements Runnable {

        /* JADX INFO: renamed from: a */
        public final InterfaceC2525e f13712a;

        public RunnableC2526f(InterfaceC2525e interfaceC2525e) {
            this.f13712a = interfaceC2525e;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f13712a.mo7363a();
        }
    }

    public Loader(String str) {
        String strConcat = "ExoPlayer:Loader:".concat(str);
        int i10 = C10134c0.f51354a;
        this.f13697a = Executors.newSingleThreadExecutor(new ThreadFactoryC0887a(strConcat, 1));
    }

    /* JADX INFO: renamed from: a */
    public final void m7466a() {
        HandlerC2523c<? extends InterfaceC2524d> handlerC2523c = this.f13698b;
        C10129a.m18993e(handlerC2523c);
        handlerC2523c.m7470a(false);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m7467b() {
        return this.f13698b != null;
    }

    /* JADX INFO: renamed from: c */
    public final void m7468c(InterfaceC2525e interfaceC2525e) {
        HandlerC2523c<? extends InterfaceC2524d> handlerC2523c = this.f13698b;
        if (handlerC2523c != null) {
            handlerC2523c.m7470a(true);
        }
        ExecutorService executorService = this.f13697a;
        if (interfaceC2525e != null) {
            executorService.execute(new RunnableC2526f(interfaceC2525e));
        }
        executorService.shutdown();
    }

    /* JADX INFO: renamed from: d */
    public final <T extends InterfaceC2524d> long m7469d(T t10, InterfaceC2521a<T> interfaceC2521a, int i10) {
        Looper looperMyLooper = Looper.myLooper();
        C10129a.m18993e(looperMyLooper);
        this.f13699c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new HandlerC2523c(looperMyLooper, t10, interfaceC2521a, i10, jElapsedRealtime).m7471b(0L);
        return jElapsedRealtime;
    }
}
