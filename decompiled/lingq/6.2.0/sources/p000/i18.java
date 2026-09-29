package p000;

import android.os.Build;
import android.util.CloseGuard;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes.dex */
public final class i18 implements vl0, Cloneable {

    /* JADX INFO: renamed from: H */
    public boolean f43336H;

    /* JADX INFO: renamed from: I */
    public boolean f43337I;

    /* JADX INFO: renamed from: J */
    public boolean f43338J;

    /* JADX INFO: renamed from: K */
    public volatile boolean f43339K;

    /* JADX INFO: renamed from: L */
    public volatile C3552rx f43340L;

    /* JADX INFO: renamed from: M */
    public final CopyOnWriteArrayList f43341M;

    /* JADX INFO: renamed from: a */
    public final dr6 f43342a;

    /* JADX INFO: renamed from: b */
    public final co7 f43343b;

    /* JADX INFO: renamed from: c */
    public final kl2 f43344c;

    /* JADX INFO: renamed from: d */
    public final h18 f43345d;

    /* JADX INFO: renamed from: e */
    public final AtomicBoolean f43346e;

    /* JADX INFO: renamed from: f */
    public Object f43347f;

    /* JADX INFO: renamed from: g */
    public su2 f43348g;

    /* JADX INFO: renamed from: h */
    public j18 f43349h;

    /* JADX INFO: renamed from: i */
    public boolean f43350i;

    /* JADX INFO: renamed from: j */
    public C3552rx f43351j;

    /* JADX INFO: renamed from: k */
    public boolean f43352k;

    /* JADX INFO: renamed from: l */
    public boolean f43353l;

    public i18(dr6 dr6Var, co7 co7Var) {
        dr6Var.getClass();
        co7Var.getClass();
        this.f43342a = dr6Var;
        this.f43343b = co7Var;
        this.f43344c = (kl2) dr6Var.f36084B.f50618b;
        dr6Var.f36088d.getClass();
        h18 h18Var = new h18(this);
        h18Var.mo3173g(0L);
        this.f43345d = h18Var;
        this.f43346e = new AtomicBoolean();
        this.f43338J = true;
        this.f43341M = new CopyOnWriteArrayList();
        new AtomicReference((pk9) co7Var.f10363f);
    }

    /* JADX INFO: renamed from: a */
    public static final String m13618a(i18 i18Var) {
        StringBuilder sb = new StringBuilder();
        sb.append(i18Var.f43339K ? "canceled " : "");
        sb.append("call");
        sb.append(" to ");
        sb.append(((ex3) i18Var.f43343b.f10360c).m11382h());
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public final void m13619b(j18 j18Var) {
        j18Var.getClass();
        TimeZone timeZone = kcb.f47051a;
        if (this.f43349h != null) {
            C3386nv.m17633t("Check failed.");
        } else {
            this.f43349h = j18Var;
            j18Var.f44911p.add(new g18(this, this.f43347f));
        }
    }

    /* JADX INFO: renamed from: c */
    public final IOException m13620c(IOException iOException) {
        IOException interruptedIOException;
        Socket socketM13626i;
        TimeZone timeZone = kcb.f47051a;
        j18 j18Var = this.f43349h;
        if (j18Var != null) {
            synchronized (j18Var) {
                socketM13626i = m13626i();
            }
            if (this.f43349h == null) {
                if (socketM13626i != null) {
                    kcb.m15112c(socketM13626i);
                }
            } else if (socketM13626i != null) {
                C3386nv.m17633t("Check failed.");
                return null;
            }
        }
        if (!this.f43350i && this.f43345d.m24715i()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        if (iOException != null) {
            interruptedIOException.getClass();
        }
        return interruptedIOException;
    }

    public final void cancel() {
        if (this.f43339K) {
            return;
        }
        this.f43339K = true;
        C3552rx c3552rx = this.f43340L;
        if (c3552rx != null) {
            ((ru2) c3552rx.f59989d).cancel();
        }
        Iterator it = this.f43341M.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((lj8) it.next()).cancel();
        }
    }

    public final Object clone() {
        return new i18(this.f43342a, this.f43343b);
    }

    /* JADX INFO: renamed from: d */
    public final j88 m13621d() {
        Object th;
        if (!this.f43346e.compareAndSet(false, true)) {
            C3386nv.m17633t("Already Executed");
            return null;
        }
        this.f43345d.m24714h();
        C2927dg c2927dg = u87.f63590a;
        u87.f63590a.getClass();
        if (Build.VERSION.SDK_INT >= 30) {
            CloseGuard closeGuardM21024h = AbstractC3559s3.m21024h();
            closeGuardM21024h.open("response.body().close()");
            th = closeGuardM21024h;
        } else {
            th = u87.f63591b.isLoggable(Level.FINE) ? new Throwable("response.body().close()") : null;
        }
        this.f43347f = th;
        try {
            ny8 ny8Var = this.f43342a.f36085a;
            synchronized (ny8Var) {
                ((ArrayDeque) ny8Var.f53416d).add(this);
            }
            j88 j88VarM13623f = m13623f();
            ny8 ny8Var2 = this.f43342a.f36085a;
            ny8Var2.getClass();
            ny8.m17673J(ny8Var2, null, this, null, 5);
            return j88VarM13623f;
        } catch (Throwable th2) {
            ny8 ny8Var3 = this.f43342a.f36085a;
            ny8Var3.getClass();
            ny8.m17673J(ny8Var3, null, this, null, 5);
            throw th2;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m13622e(boolean z) {
        C3552rx c3552rx;
        synchronized (this) {
            if (!this.f43338J) {
                throw new IllegalStateException("released");
            }
        }
        if (z && (c3552rx = this.f43340L) != null) {
            ((ru2) c3552rx.f59989d).cancel();
            ((i18) c3552rx.f59987b).m13624g(c3552rx, true, true, true, true, null);
        }
        this.f43351j = null;
    }

    /* JADX INFO: renamed from: f */
    public final j88 m13623f() {
        ArrayList arrayList = new ArrayList();
        u91.m22630w0(this.f43342a.f36086b, arrayList);
        arrayList.add(new gi0(this.f43342a));
        arrayList.add(new gi0(this.f43342a.f36094j));
        arrayList.add(new gi0(this.f43342a.f36095k));
        arrayList.add(yl0.f69970c);
        u91.m22630w0(this.f43342a.f36087c, arrayList);
        arrayList.add(yl0.f69969b);
        co7 co7Var = this.f43343b;
        dr6 dr6Var = this.f43342a;
        try {
            try {
                j88 j88VarM3031f = new at4(this, arrayList, 0, null, co7Var, dr6Var.f36107w, dr6Var.f36108x, dr6Var.f36109y).m3031f(this.f43343b);
                if (this.f43339K) {
                    icb.m13766b(j88VarM3031f);
                    throw new IOException("Canceled");
                }
                m13625h(null);
                return j88VarM3031f;
            } catch (IOException e) {
                IOException iOExceptionM13625h = m13625h(e);
                iOExceptionM13625h.getClass();
                throw iOExceptionM13625h;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                m13625h(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x002b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x002d A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:23:0x002d, B:25:0x0031, B:27:0x0035, B:29:0x0039, B:30:0x003b, B:32:0x003f, B:34:0x0043, B:36:0x0047, B:41:0x0050, B:14:0x001b, B:17:0x0021, B:20:0x0027), top: B:63:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0031 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:23:0x002d, B:25:0x0031, B:27:0x0035, B:29:0x0039, B:30:0x003b, B:32:0x003f, B:34:0x0043, B:36:0x0047, B:41:0x0050, B:14:0x001b, B:17:0x0021, B:20:0x0027), top: B:63:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0035 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:23:0x002d, B:25:0x0031, B:27:0x0035, B:29:0x0039, B:30:0x003b, B:32:0x003f, B:34:0x0043, B:36:0x0047, B:41:0x0050, B:14:0x001b, B:17:0x0021, B:20:0x0027), top: B:63:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0039 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:23:0x002d, B:25:0x0031, B:27:0x0035, B:29:0x0039, B:30:0x003b, B:32:0x003f, B:34:0x0043, B:36:0x0047, B:41:0x0050, B:14:0x001b, B:17:0x0021, B:20:0x0027), top: B:63:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x004d  */
    /* JADX INFO: renamed from: g */
    public final IOException m13624g(C3552rx c3552rx, boolean z, boolean z2, boolean z3, boolean z4, IOException iOException) {
        boolean z5;
        boolean z6;
        boolean z7;
        c3552rx.getClass();
        if (c3552rx.equals(this.f43340L)) {
            synchronized (this) {
                z5 = false;
                if (z) {
                    try {
                        if (this.f43352k) {
                            if (z) {
                                this.f43352k = false;
                            }
                            if (z2) {
                                this.f43353l = false;
                            }
                            if (z4) {
                                this.f43336H = false;
                            }
                            if (z3) {
                                this.f43337I = false;
                            }
                            if (this.f43352k) {
                                z7 = false;
                            } else {
                                z7 = false;
                            }
                            if (z7) {
                                z5 = true;
                            }
                            boolean z8 = z5;
                            z5 = z7;
                            z6 = z8;
                        } else if ((!z2 && this.f43353l) || ((z4 && this.f43336H) || (z3 && this.f43337I))) {
                            if (z) {
                                this.f43352k = false;
                            }
                            if (z2) {
                                this.f43353l = false;
                            }
                            if (z4) {
                                this.f43336H = false;
                            }
                            if (z3) {
                                this.f43337I = false;
                            }
                            if (this.f43352k || this.f43353l || this.f43336H || this.f43337I) {
                                z7 = false;
                            } else {
                                z7 = true;
                            }
                            if (z7 && !this.f43338J) {
                                z5 = true;
                            }
                            boolean z9 = z5;
                            z5 = z7;
                            z6 = z9;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    z6 = !z2 ? false : false;
                }
            }
            if (z5) {
                this.f43340L = null;
                j18 j18Var = this.f43349h;
                if (j18Var != null) {
                    synchronized (j18Var) {
                        j18Var.f44908m++;
                    }
                }
            }
            if (z6) {
                return m13620c(iOException);
            }
        }
        return iOException;
    }

    /* JADX INFO: renamed from: h */
    public final IOException m13625h(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.f43338J) {
                this.f43338J = false;
                if (!this.f43352k && !this.f43353l && !this.f43336H && !this.f43337I) {
                    z = true;
                }
            }
        }
        return z ? m13620c(iOException) : iOException;
    }

    /* JADX INFO: renamed from: i */
    public final Socket m13626i() {
        j18 j18Var = this.f43349h;
        j18Var.getClass();
        TimeZone timeZone = kcb.f47051a;
        ArrayList arrayList = j18Var.f44911p;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (fa4.m11650l(((Reference) it.next()).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            C3386nv.m17633t("Check failed.");
            return null;
        }
        arrayList.remove(i);
        this.f43349h = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        j18Var.f44912q = System.nanoTime();
        kl2 kl2Var = this.f43344c;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) kl2Var.f47485e;
        TimeZone timeZone2 = kcb.f47051a;
        if (!j18Var.f44905j && kl2Var.f47481a != 0) {
            ((zr9) kl2Var.f47483c).m25753c((dh2) kl2Var.f47484d, 0L);
            return null;
        }
        j18Var.f44905j = true;
        concurrentLinkedQueue.remove(j18Var);
        if (concurrentLinkedQueue.isEmpty()) {
            zr9 zr9Var = (zr9) kl2Var.f47483c;
            synchronized (zr9Var.f72009a) {
                if (zr9Var.m25752a()) {
                    zr9Var.f72009a.m3022c(zr9Var);
                }
            }
        }
        return j18Var.f44900e;
    }
}
