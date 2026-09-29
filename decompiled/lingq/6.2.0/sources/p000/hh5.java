package p000;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException;
import androidx.media3.exoplayer.source.C0717b;
import androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class hh5 extends Handler implements Runnable {

    /* JADX INFO: renamed from: a */
    public final in7 f42365a;

    /* JADX INFO: renamed from: b */
    public final long f42366b;

    /* JADX INFO: renamed from: c */
    public C0717b f42367c;

    /* JADX INFO: renamed from: d */
    public IOException f42368d;

    /* JADX INFO: renamed from: e */
    public int f42369e;

    /* JADX INFO: renamed from: f */
    public Thread f42370f;

    /* JADX INFO: renamed from: g */
    public boolean f42371g;

    /* JADX INFO: renamed from: h */
    public volatile boolean f42372h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ gv5 f42373i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hh5(gv5 gv5Var, Looper looper, in7 in7Var, C0717b c0717b, int i, long j) {
        super(looper);
        this.f42373i = gv5Var;
        this.f42365a = in7Var;
        this.f42367c = c0717b;
        this.f42366b = j;
    }

    /* JADX INFO: renamed from: a */
    public final void m13240a(boolean z) {
        this.f42372h = z;
        this.f42368d = null;
        if (hasMessages(1)) {
            this.f42371g = true;
            removeMessages(1);
            if (!z) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f42371g = true;
                    this.f42365a.f44315g = true;
                    Thread thread = this.f42370f;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z) {
            this.f42373i.f41393c = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            C0717b c0717b = this.f42367c;
            c0717b.getClass();
            c0717b.m2566y(this.f42365a, jElapsedRealtime, jElapsedRealtime - this.f42366b, true);
            this.f42367c = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m13241b() {
        eh5 eh5Var;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C0717b c0717b = this.f42367c;
        c0717b.getClass();
        int i = this.f42369e;
        in7 in7Var = this.f42365a;
        e74 e74Var = in7Var.f44310b;
        if (i == 0) {
            k02 k02Var = in7Var.f44318j;
            eh5Var = new eh5(k02Var, k02Var.f46462a, Collections.EMPTY_MAP, jElapsedRealtime, 0L);
        } else {
            eh5Var = new eh5(in7Var.f44318j, (Uri) e74Var.f36798c, (Map) e74Var.f36799d, jElapsedRealtime, e74Var.f36796a);
        }
        fm2 fm2Var = c0717b.f6494e;
        fm2Var.m11936a(new d52(fm2Var, eh5Var, new ru5(-1, null, uma.m22805J(in7Var.f44317i), uma.m22805J(c0717b.f6482W)), i));
        this.f42368d = null;
        gv5 gv5Var = this.f42373i;
        t48 t48Var = (t48) gv5Var.f41392b;
        hh5 hh5Var = (hh5) gv5Var.f41393c;
        hh5Var.getClass();
        t48Var.execute(hh5Var);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        long jMin;
        long j;
        gh5 gh5Var;
        st8 st8Var;
        if (this.f42372h) {
            return;
        }
        int i = message.what;
        if (i == 1) {
            m13241b();
            return;
        }
        if (i == 4) {
            throw ((Error) message.obj);
        }
        this.f42373i.f41393c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = jElapsedRealtime - this.f42366b;
        C0717b c0717b = this.f42367c;
        c0717b.getClass();
        if (this.f42371g) {
            c0717b.m2566y(this.f42365a, jElapsedRealtime, j2, false);
            return;
        }
        int i2 = message.what;
        if (i2 == 2) {
            try {
                c0717b.m2567z(this.f42365a, jElapsedRealtime, j2);
                return;
            } catch (RuntimeException e) {
                ss5.m21724v("LoadTask", "Unexpected exception handling load completed", e);
                this.f42373i.f41394d = new Loader$UnexpectedLoaderException(e);
                return;
            }
        }
        if (i2 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f42368d = iOException;
        int i3 = this.f42369e;
        this.f42369e = i3 + 1;
        in7 in7Var = this.f42365a;
        e74 e74Var = in7Var.f44310b;
        eh5 eh5Var = new eh5(in7Var.f44318j, (Uri) e74Var.f36798c, (Map) e74Var.f36799d, jElapsedRealtime, e74Var.f36796a);
        String str = uma.f64080a;
        c0717b.f6492d.getClass();
        Throwable cause = iOException;
        while (true) {
            if (cause == null) {
                jMin = Math.min(i3 * DescriptorProtos.Edition.EDITION_2023_VALUE, 5000);
                break;
            }
            if ((cause instanceof ParserException) || (cause instanceof FileNotFoundException) || (cause instanceof HttpDataSource$CleartextNotPermittedException) || (cause instanceof Loader$UnexpectedLoaderException) || ((cause instanceof DataSourceException) && ((DataSourceException) cause).f6436a == 2008)) {
                jMin = -9223372036854775807L;
                break;
            }
            cause = cause.getCause();
        }
        if (jMin == -9223372036854775807L) {
            gh5Var = gv5.f41389h;
            j = -9223372036854775807L;
        } else {
            int iM2543b = c0717b.m2543b();
            j = -9223372036854775807L;
            int i4 = iM2543b > c0717b.f6503i0 ? 1 : 0;
            if (c0717b.f6495e0 || !((st8Var = c0717b.f6481V) == null || st8Var.mo3545h() == -9223372036854775807L)) {
                c0717b.f6503i0 = iM2543b;
            } else if (!c0717b.f6477R || c0717b.m2541C()) {
                c0717b.f6489b0 = c0717b.f6477R;
                c0717b.f6497f0 = 0L;
                c0717b.f6503i0 = 0;
                for (yk8 yk8Var : c0717b.f6474O) {
                    yk8Var.m25178q(false);
                }
                in7Var.f44314f.f52394a = 0L;
                in7Var.f44317i = 0L;
                in7Var.f44316h = true;
                in7Var.f44320l = false;
            } else {
                c0717b.f6501h0 = true;
                gh5Var = gv5.f41388g;
            }
            gh5Var = new gh5(i4, jMin);
        }
        int i5 = gh5Var.f40819a;
        boolean z = !(i5 == 0 || i5 == 1);
        fm2 fm2Var = c0717b.f6494e;
        fm2Var.m11936a(new lv5(fm2Var, eh5Var, new ru5(-1, null, uma.m22805J(in7Var.f44317i), uma.m22805J(c0717b.f6482W)), iOException, z));
        int i6 = gh5Var.f40819a;
        if (i6 == 3) {
            this.f42373i.f41394d = this.f42368d;
            return;
        }
        if (i6 != 2) {
            if (i6 == 1) {
                this.f42369e = 1;
            }
            long jMin2 = gh5Var.f40820b;
            if (jMin2 == j) {
                jMin2 = Math.min((this.f42369e - 1) * DescriptorProtos.Edition.EDITION_2023_VALUE, 5000);
            }
            gv5 gv5Var = this.f42373i;
            bna.m3987z(((hh5) gv5Var.f41393c) == null);
            gv5Var.f41393c = this;
            if (jMin2 > 0) {
                sendEmptyMessageDelayed(1, jMin2);
            } else {
                m13241b();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = this.f42371g;
                this.f42370f = Thread.currentThread();
            }
            if (!z) {
                Trace.beginSection("load:".concat(this.f42365a.getClass().getSimpleName()));
                try {
                    this.f42365a.m14033b();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.f42370f = null;
                Thread.interrupted();
            }
            if (this.f42372h) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e) {
            if (this.f42372h) {
                return;
            }
            obtainMessage(3, e).sendToTarget();
        } catch (Exception e2) {
            if (this.f42372h) {
                return;
            }
            ss5.m21724v("LoadTask", "Unexpected exception loading stream", e2);
            obtainMessage(3, new Loader$UnexpectedLoaderException(e2)).sendToTarget();
        } catch (OutOfMemoryError e3) {
            if (this.f42372h) {
                return;
            }
            ss5.m21724v("LoadTask", "OutOfMemory error loading stream", e3);
            obtainMessage(3, new Loader$UnexpectedLoaderException(e3)).sendToTarget();
        } catch (Error e4) {
            if (!this.f42372h) {
                ss5.m21724v("LoadTask", "Unexpected error loading stream", e4);
                obtainMessage(4, e4).sendToTarget();
            }
            throw e4;
        }
    }
}
